package com.jancky.server;

import com.jancky.data.CommonPacketMessage;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class UdpM2MSeverHandler2 extends ChannelInboundHandlerAdapter  {

	@Override
    public void channelRead(ChannelHandlerContext ctx, Object msg)
            throws Exception {
        // 接受客户端的数据
		CommonPacketMessage message = (CommonPacketMessage) msg;
        System.out.println("Client :" + message);
        // 服务端，回写数据给客户端
        // 直接回写整形的数据
        String data = "Hello ,I am Server ...";
        ctx.writeAndFlush(data);

    }

   
}
