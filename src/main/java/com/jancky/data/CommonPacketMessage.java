package com.jancky.data;

/*
 * 1.1 设备向服务器发送 请求登陆数据包 
 */

public class CommonPacketMessage extends DataMessage<CommonPacketData, TailMessage> {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer  strBuf = new StringBuffer();
		
		strBuf.append("<<<<CommonPacketMessage>>>>");
		strBuf.append("header:" + this.getHeader().getHeader()+" \t ");
		strBuf.append("lenH:" + this.getHeader().getLenH()+" \t ");
		strBuf.append("lenL:" +  this.getHeader().getLenL()+" \t ");
		strBuf.append("opcode:" + this.getHeader().getOpcode()+" \t ");
		strBuf.append("bStatus:" + this.getBody().getbStatus()+" \t ");
		strBuf.append("tail:" + this.getFooter().getTail()+" \t ");
		strBuf.append(">>>>CommonPacketMessage<<<<");
		
		return strBuf.toString();
	}

	
}
