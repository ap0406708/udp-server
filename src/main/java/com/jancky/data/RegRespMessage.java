package com.jancky.data;

/*
 * 1.2 服务器向设备发送 请求登陆回应数据包
 */
public class RegRespMessage extends DataMessage<RegRespData, TailMessage> {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer  strBuf = new StringBuffer();
		
		strBuf.append("<<<<CommonPacketMessage>>>>");
		strBuf.append("header:" + this.getHeader().getHeader()+"\t ");
		strBuf.append("lenH:" + this.getHeader().getLenH()+"\t ");
		strBuf.append("lenL:" +  this.getHeader().getLenL()+"\t ");
		strBuf.append("opcode:" + this.getHeader().getOpcode()+"\t ");
		strBuf.append("ack:" + this.getBody()==null?"null":this.getBody().getAck()+"\t ");
		strBuf.append("nBasicGPSPacketPeriod:" + this.getBody()==null?"null":this.getBody().getnBasicGPSPacketPeriod()+"\t ");
		strBuf.append("tail:" + this.getFooter()==null?"null":this.getFooter().getTail()+"\t ");
		strBuf.append(">>>>CommonPacketMessage<<<<");
		
		return strBuf.toString();
	}
	
}
