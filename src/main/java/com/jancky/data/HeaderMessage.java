package com.jancky.data;

public class HeaderMessage {

	private byte header;
	private byte lenH;
	private byte lenL;
	private byte opcode;
	private byte[] deviceID;
	//private int deviceID;
	
	public byte getHeader() {
		return header;
	}
	public void setHeader(byte header) {
		this.header = header;
	}
	public byte getLenH() {
		return lenH;
	}
	public void setLenH(byte lenH) {
		this.lenH = lenH;
	}
	public byte getLenL() {
		return lenL;
	}
	public void setLenL(byte lenL) {
		this.lenL = lenL;
	}
	public byte getOpcode() {
		return opcode;
	}
	public void setOpcode(byte opcode) {
		this.opcode = opcode;
	}
	public byte[] getDeviceID() {
		return deviceID;
	}
	public void setDeviceID(byte[] deviceID) {
		this.deviceID = deviceID;
	}

}
