package com.jancky.server;

import com.jancky.data.CommonPacketMessage;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class UdpM2MSeverHandler extends SimpleChannelInboundHandler<CommonPacketMessage> {

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, CommonPacketMessage msg) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Client :" + msg);

	}

}
