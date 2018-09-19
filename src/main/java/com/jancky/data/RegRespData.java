package com.jancky.data;

public class RegRespData extends BodyMessage {

	private byte ack;
	private int nBasicGPSPacketPeriod;
	
	public byte getAck() {
		return ack;
	}
	public void setAck(byte ack) {
		this.ack = ack;
	}
	public int getnBasicGPSPacketPeriod() {
		return nBasicGPSPacketPeriod;
	}
	public void setnBasicGPSPacketPeriod(int nBasicGPSPacketPeriod) {
		this.nBasicGPSPacketPeriod = nBasicGPSPacketPeriod;
	}

}
