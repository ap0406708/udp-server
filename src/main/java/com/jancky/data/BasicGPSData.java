package com.jancky.data;

import java.util.Date;

public class BasicGPSData extends BodyMessage {

	private Date sDateTime; // Format: "2000-01-01 00:00:00"
	private double dLng;
	private double dLat;
	private double dSpeed;
	private double dDirection;
	private GpsStatusEntity gpsStatus;
	private DeviceEntity deviceEntity;
	private int nPeriod;
	
	public Date getsDateTime() {
		return sDateTime;
	}
	public void setsDateTime(Date sDateTime) {
		this.sDateTime = sDateTime;
	}
	public double getdLng() {
		return dLng;
	}
	public void setdLng(double dLng) {
		this.dLng = dLng;
	}
	public double getdLat() {
		return dLat;
	}
	public void setdLat(double dLat) {
		this.dLat = dLat;
	}
	public double getdSpeed() {
		return dSpeed;
	}
	public void setdSpeed(double dSpeed) {
		this.dSpeed = dSpeed;
	}
	public double getdDirection() {
		return dDirection;
	}
	public void setdDirection(double dDirection) {
		this.dDirection = dDirection;
	}
	public GpsStatusEntity getGpsStatus() {
		return gpsStatus;
	}
	public void setGpsStatus(GpsStatusEntity gpsStatus) {
		this.gpsStatus = gpsStatus;
	}
	public DeviceEntity getDeviceEntity() {
		return deviceEntity;
	}
	public void setDeviceEntity(DeviceEntity deviceEntity) {
		this.deviceEntity = deviceEntity;
	}
	public int getnPeriod() {
		return nPeriod;
	}
	public void setnPeriod(int nPeriod) {
		this.nPeriod = nPeriod;
	}

}
