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
        System.out.println("Client UdpM2MSeverHandler2 :" + message);
        // 服务端，回写数据给客户端
        // 直接回写整形的数据
        String data = "Hello ,I am Server ...";
        //ctx.writeAndFlush(data).sync();;
        ctx.writeAndFlush(msg).sync();
        
        //-------------------------------------------
        /*
        2018-09-28 14:38:50.975  WARN 12272 --- [ntLoopGroup-2-1] io.netty.channel.DefaultChannelPipeline  : An exceptionCaught() event was fired, and it reached at the tail of the pipeline. It usually means the last handler in the pipeline did not handle the exception.

        java.nio.channels.NotYetConnectedException: null
        	at sun.nio.ch.DatagramChannelImpl.write(Unknown Source) ~[na:1.8.0_181]
        	at io.netty.channel.socket.nio.NioDatagramChannel.doWriteMessage(NioDatagramChannel.java:294) ~[netty-all-4.1.21.Final.jar:4.1.21.Final]
        	at io.netty.channel.nio.AbstractNioMessageChannel.doWrite(AbstractNioMessageChannel.java:142) ~[netty-all-4.1.21.Final.jar:4.1.21.Final]
        	at io.netty.channel.AbstractChannel$AbstractUnsafe.flush0(AbstractChannel.java:934) ~[netty-all-4.1.21.Final.jar:4.1.21.Final]
       */ 			

    }

   
}
