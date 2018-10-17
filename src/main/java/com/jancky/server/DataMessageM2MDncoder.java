package com.jancky.server;

import java.util.List;

import com.jancky.data.CommonPacketData;
import com.jancky.data.CommonPacketMessage;
import com.jancky.data.DataMessage;
import com.jancky.data.HeaderMessage;
import com.jancky.data.MailData;
import com.jancky.data.MailMessage;
import com.jancky.data.RegRespData;
import com.jancky.data.RegRespMessage;
import com.jancky.data.TailMessage;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.socket.DatagramPacket;
import io.netty.handler.codec.MessageToMessageDecoder;
import io.netty.util.CharsetUtil;

public class DataMessageM2MDncoder extends MessageToMessageDecoder<DatagramPacket> {

	@Override
	protected void decode(ChannelHandlerContext ctx, DatagramPacket datagramPacket, List<Object> out) throws Exception {
		// TODO Auto-generated method stub

		ByteBuf data = datagramPacket.content();

		byte header = data.readByte();
		byte lenH = data.readByte();
		byte lenL = data.readByte();
		byte opcode = data.readByte();
		
		HeaderMessage headerMessage = new HeaderMessage();
		headerMessage.setHeader(header);
		headerMessage.setLenH(lenH);
		headerMessage.setLenL(lenL);
		headerMessage.setOpcode(opcode);
		
		byte[] deviceID = new byte[5];
		data.readBytes(deviceID);
		headerMessage.setDeviceID(deviceID);
		
		int opcodeI = 0xFF & (int) opcode;
		System.out.println("opcodeI :" + opcodeI);
		
		DataMessage message = null;
		if(opcodeI==149)
		{
			System.out.println("Client :" + "0x95");
			message = new MailMessage();
			MailData body = new MailData();
			
			byte[] gatewayID = new byte[5];
			data.readBytes(gatewayID);
			body.setGatewayID(gatewayID);
			
			message.setBody(body);
			
			
			//System.out.println("message:" + message);
			
		}
		else if(opcodeI==1)
		{
			System.out.println("Client :" + "0x01");
			message = new CommonPacketMessage();
			CommonPacketData body = new CommonPacketData();
			
			byte bStatus = data.readByte();
			body.setbStatus(bStatus);
			message.setBody(body);
			
			//System.out.println("message:" + message);
		}
		else
		{
			System.out.println("Client error msg:" + opcodeI);
		}
		
		
		message.setHeader(headerMessage);

		TailMessage foot = new TailMessage();
		byte tail = data.readByte();
		foot.setTail(tail);
		message.setFooter(foot);

		System.out.println("=====================================");
		System.out.println("encode header:" + header);
		System.out.println("encode lenH:" + lenH);
		System.out.println("encode lenL:" + lenL);
		System.out.println("encode opcode:" + opcode);
		//System.out.println("encode bStatus:" + bStatus);
		System.out.println("encode tail:" + tail);
		System.out.println("=====================================");

		out.add(message);

		// 回复一条信息给客户端
//		ctx.writeAndFlush(new DatagramPacket(
//				Unpooled.copiedBuffer("Hello，我是Server，我的时间戳是" + System.currentTimeMillis(), CharsetUtil.UTF_8),
//				datagramPacket.sender())).sync();

		// 回复一条RegRespMessage给客户端

		RegRespMessage rrMessage = new RegRespMessage();
		
		HeaderMessage headM = new HeaderMessage();
		headM.setHeader((byte) 0xfe);
		headM.setLenH((byte) 0x00);
		headM.setLenL((byte) 0x0d);
		headM.setOpcode((byte) 0x01);
		rrMessage.setHeader(headM);
		
		RegRespData bodyM = new RegRespData();
		bodyM.setAck((byte) 0x01);
		bodyM.setnBasicGPSPacketPeriod(30);
		rrMessage.setBody(bodyM);
		
		TailMessage tailM = new TailMessage();
		tailM.setTail(tail);
		rrMessage.setFooter(tailM);
		
		ctx.writeAndFlush(new DatagramPacket(
				Unpooled.copiedBuffer("From Server:" + rrMessage, CharsetUtil.UTF_8),
				datagramPacket.sender())).sync();

	}

}
