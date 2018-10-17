package com.jancky.data;

/*
 * 149.1 设备向服务器发送 无线开关量信号数据包
 */
public class MailMessage extends DataMessage<MailData, TailMessage> {


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer  strBuf = new StringBuffer();
		
		strBuf.append("<<<<CommonPacketMessage>>>>");
		strBuf.append("header:" + this.getHeader().getHeader()+" \t ");
		strBuf.append("lenH:" + this.getHeader().getLenH()+" \t ");
		strBuf.append("lenL:" +  this.getHeader().getLenL()+" \t ");
		strBuf.append("opcode:" + this.getHeader().getOpcode()+" \t ");
		
		strBuf.append("gatewayID:" + this.getBody().getGatewayID()+" \t ");
		strBuf.append("ch:" + this.getBody().getCh()+" \t ");
		strBuf.append("rssi:" + this.getBody().getRssi()+" \t ");
		strBuf.append("sensorIp:" + this.getBody().getSensorIp()+" \t ");
		strBuf.append("sensorPort:" + this.getBody().getSensorPort()+" \t ");
		strBuf.append("sensorId:" + this.getBody().getSensorId()+" \t ");
		strBuf.append("time:" + this.getBody().getTime()+" \t ");
		strBuf.append("date:" + this.getBody().getDate()+" \t ");
		strBuf.append("status1:" + this.getBody().getStatus1()+" \t ");
		
		strBuf.append("valid1:" + this.getBody().getValid1()+" \t ");
		strBuf.append("signal1:" + this.getBody().getSignal1()+" \t ");
		strBuf.append("valid2:" + this.getBody().getValid2()+" \t ");
		strBuf.append("signal2:" + this.getBody().getSignal2()+" \t ");
		strBuf.append("battery:" + this.getBody().getBattery()+" \t ");
		strBuf.append("status3:" + this.getBody().getStatus3()+" \t ");
		
		strBuf.append("tail:" + this.getFooter()==null?"null":this.getFooter().getTail()+" \t ");
		strBuf.append(">>>>CommonPacketMessage<<<<");
		
		return strBuf.toString();
	}

	
	
}
