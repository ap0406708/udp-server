package com.jancky.server;

import java.util.List;

import com.jancky.data.CommonPacketMessage;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;

public class DataMessageM2MEncoder extends MessageToMessageEncoder<CommonPacketMessage> {

	@Override
	protected void encode(ChannelHandlerContext ctx, CommonPacketMessage msg, List<Object> out) throws Exception {
		// TODO Auto-generated method stub

		byte header = msg.getHeader().getHeader();
		byte lenH = msg.getHeader().getLenH();
		byte lenL = msg.getHeader().getLenL();
		byte opcode = msg.getHeader().getOpcode();

		byte bStatus = msg.getBody().getbStatus();

		byte tail = msg.getFooter().getTail();

		ByteBuf buf = ctx.alloc().buffer(6);

		buf.writeByte(header);
		buf.writeByte(lenH);
		buf.writeByte(lenL);
		buf.writeByte(opcode);
		buf.writeByte(bStatus);
		buf.writeByte(tail);

		System.out.println("--------------------------------------------");
		System.out.println("encode header:" + header);
		System.out.println("encode lenH:" + lenH);
		System.out.println("encode lenL:" + lenL);
		System.out.println("encode opcode:" + opcode);
		System.out.println("encode bStatus:" + bStatus);
		System.out.println("encode tail:" + tail);
		System.out.println("-------------------------------------------");

		out.add(buf);


	}

}
