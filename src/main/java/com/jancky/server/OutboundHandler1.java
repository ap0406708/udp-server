package com.jancky.server;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;
import io.netty.util.CharsetUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OutboundHandler1 extends ChannelOutboundHandlerAdapter {

	private static Logger   logger  = LoggerFactory.getLogger(OutboundHandler1.class);  

	@Override  
    // 向client发送消息  
	public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {  
		logger.info("OutboundHandler1.write");
		System.out.println("OutboundHandler1.write--------");
		ByteBuf encoded = Unpooled.copiedBuffer("Hello，我是Server，我的时间戳是"+System.currentTimeMillis(), CharsetUtil.UTF_8);
		ctx.write(encoded);  
        ctx.flush();  

		
	}
	
	
}
