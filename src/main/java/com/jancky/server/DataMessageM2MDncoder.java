package com.jancky.server;

import java.util.List;

import com.jancky.data.CommonPacketData;
import com.jancky.data.CommonPacketMessage;
import com.jancky.data.HeaderMessage;
import com.jancky.data.TailMessage;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.socket.DatagramPacket;
import io.netty.handler.codec.MessageToMessageDecoder;

public class DataMessageM2MDncoder extends MessageToMessageDecoder<DatagramPacket> {

	@Override
	protected void decode(ChannelHandlerContext ctx, DatagramPacket datagramPacket, List<Object> out) throws Exception {
		// TODO Auto-generated method stub

		ByteBuf data = datagramPacket.content(); 
		
		byte header = data.readByte();
		byte lenH = data.readByte();
		byte lenL = data.readByte();
		byte opcode = data.readByte();

		byte bStatus = data.readByte();

		byte tail = data.readByte();
		
		CommonPacketMessage message = new CommonPacketMessage();
		HeaderMessage headerMessage = new HeaderMessage();
		headerMessage.setHeader(header);
		headerMessage.setLenH(lenH);
		headerMessage.setLenL(lenL);
		headerMessage.setOpcode(opcode);
		
		message.setHeader(headerMessage);
		
		CommonPacketData body = new CommonPacketData();
		body.setbStatus(bStatus);
		
		TailMessage foot = new TailMessage();
		foot.setTail(tail);
		
		System.out.println("decode bStatus:" + bStatus);
		
		out.add(message);

	}

}
