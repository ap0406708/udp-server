package com.jancky.server;

import com.jancky.data.CommonPacketMessage;

import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.DatagramPacket;
import io.netty.util.CharsetUtil;

public class UdpM2MSeverHandler extends SimpleChannelInboundHandler<CommonPacketMessage> {

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, CommonPacketMessage msg) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Client :" + msg);

		// 服务端，回写数据给客户端
        // 直接回写整形的数据
        //String data = "Hello ,I am Server ...";  //java.lang.UnsupportedOperationException: unsupported message type: String
        //ctx.writeAndFlush(msg).sync();
        
		
        
	}

}
