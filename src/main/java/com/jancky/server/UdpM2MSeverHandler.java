package com.jancky.server;

import com.jancky.data.CommonPacketMessage;
import com.jancky.data.DataMessage;
import com.jancky.data.HeaderMessage;
import com.jancky.data.MailMessage;

import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.DatagramPacket;
import io.netty.util.CharsetUtil;

public class UdpM2MSeverHandler extends SimpleChannelInboundHandler<DataMessage> {

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, DataMessage msg) throws Exception {
		// TODO Auto-generated method stub
		
		HeaderMessage header = msg.getHeader();
		
		System.out.println("header.getOpcode() :" + header.getOpcode());
		
		int opcode = 0xFF & (int) header.getOpcode();
		
		System.out.println("opcode :" + opcode);
		
		if(opcode==149)
		{
			System.out.println("Client :" + "0x95");
			MailMessage message = (MailMessage) msg;
			System.out.println("message:" + message);
			
		}
		else if(opcode==1)
		{
			System.out.println("Client :" + "0x01");
			CommonPacketMessage message = (CommonPacketMessage) msg;
			System.out.println("message:" + message);
		}
		else
		{
			System.out.println("Client error msg:" + opcode);
		}

		// 服务端，回写数据给客户端
        // 直接回写整形的数据
        //String data = "Hello ,I am Server ...";  //java.lang.UnsupportedOperationException: unsupported message type: String
        //ctx.writeAndFlush(msg).sync();
        
		
        
	}

}
