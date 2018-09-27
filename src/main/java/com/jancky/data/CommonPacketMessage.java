package com.jancky.data;

public class CommonPacketMessage extends DataMessage<CommonPacketData, TailMessage> {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer  strBuf = new StringBuffer();
		
		strBuf.append("<<<<CommonPacketMessage>>>>");
		strBuf.append("header:" + this.getHeader().getHeader()+"\t ");
		strBuf.append("lenH:" + this.getHeader().getLenH()+"\t ");
		strBuf.append("lenL:" +  this.getHeader().getLenL()+"\t ");
		strBuf.append("opcode:" + this.getHeader().getOpcode()+"\t ");
		strBuf.append("bStatus:" + this.getBody()==null?"null":this.getBody().getbStatus()+"\t ");
		strBuf.append("tail:" + this.getFooter()==null?"null":this.getFooter().getTail()+"\t ");
		strBuf.append(">>>>CommonPacketMessage<<<<");
		
		return strBuf.toString();
	}

	
}
