package com.jancky.data;

public class MailData extends BodyMessage {

	private byte[] gatewayID = new byte[5];
	private int ch;
	private int rssi;
	private byte[] sensorIp;
	private int sensorPort;
	private byte[] sensorId = new byte[5];
	
	private byte[] time = new byte[3];
	private byte[] date = new byte[3];
	private byte status1;
	private byte valid1;
	private byte signal1;
	private byte valid2;
	private byte signal2;
	private byte battery;
	private byte status3;
	
	public byte[] getGatewayID() {
		return gatewayID;
	}
	public void setGatewayID(byte[] gatewayID) {
		this.gatewayID = gatewayID;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public int getRssi() {
		return rssi;
	}
	public void setRssi(int rssi) {
		this.rssi = rssi;
	}
	public byte[] getSensorIp() {
		return sensorIp;
	}
	public void setSensorIp(byte[] sensorIp) {
		this.sensorIp = sensorIp;
	}
	public int getSensorPort() {
		return sensorPort;
	}
	public void setSensorPort(int sensorPort) {
		this.sensorPort = sensorPort;
	}
	public byte[] getSensorId() {
		return sensorId;
	}
	public void setSensorId(byte[] sensorId) {
		this.sensorId = sensorId;
	}
	public byte[] getTime() {
		return time;
	}
	public void setTime(byte[] time) {
		this.time = time;
	}
	public byte[] getDate() {
		return date;
	}
	public void setDate(byte[] date) {
		this.date = date;
	}
	public byte getStatus1() {
		return status1;
	}
	public void setStatus1(byte status1) {
		this.status1 = status1;
	}
	public byte getValid1() {
		return valid1;
	}
	public void setValid1(byte valid1) {
		this.valid1 = valid1;
	}
	public byte getSignal1() {
		return signal1;
	}
	public void setSignal1(byte signal1) {
		this.signal1 = signal1;
	}
	public byte getValid2() {
		return valid2;
	}
	public void setValid2(byte valid2) {
		this.valid2 = valid2;
	}
	public byte getSignal2() {
		return signal2;
	}
	public void setSignal2(byte signal2) {
		this.signal2 = signal2;
	}
	public byte getBattery() {
		return battery;
	}
	public void setBattery(byte battery) {
		this.battery = battery;
	}
	public byte getStatus3() {
		return status3;
	}
	public void setStatus3(byte status3) {
		this.status3 = status3;
	}

}
