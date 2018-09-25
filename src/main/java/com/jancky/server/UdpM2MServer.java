package com.jancky.server;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioDatagramChannel;

@Component
public class UdpM2MServer implements CommandLineRunner{

	private final static Logger LOGGER = LoggerFactory.getLogger(UdpServer.class);

	private EventLoopGroup group = new NioEventLoopGroup();

	@Value("${netty.server.port}")
	private int nettyPort;
	
	/**
	 * 启动 Netty
	 *
	 * @return
	 * @throws InterruptedException
	 */
	@PostConstruct
	public void start() throws InterruptedException {

		Bootstrap bootstrap = new Bootstrap().group(group).channel(NioDatagramChannel.class)
				.option(ChannelOption.SO_KEEPALIVE, true).handler(new ChannelInitializer<Channel>() {
                    @Override
                    protected void initChannel(Channel channel) throws Exception {
                        ChannelPipeline pipeline = channel.pipeline();
                        pipeline.addLast(new DataMessageM2MDncoder()); 
                        pipeline.addLast(new DataMessageM2MEncoder());
                    }
                });

		ChannelFuture future = bootstrap.bind(nettyPort).sync();
		if (future.isSuccess()) {
			LOGGER.info("启动 Netty 成功");
		}

		// cf.channel().closeFuture().sync();
		// 服务端监听在9999端口
		// b.bind(9999).sync().channel().closeFuture().await();
	}

	/**
	 * 销毁
	 */
	@PreDestroy
	public void destroy() {
		group.shutdownGracefully().syncUninterruptibly();
		LOGGER.info("关闭 Netty 成功");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		LOGGER.info("Netty is running");
	}

}
