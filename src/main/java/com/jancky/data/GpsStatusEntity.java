package com.jancky.data;

public class GpsStatusEntity {

	// 1: West Lng; 0: East Lng;
	private boolean longitude; 
	// 1: South Lat; 0: North Lat;
	private boolean latitude; 
	// 1: unValid GPS; 0: Valid GPS;
	private boolean unGPSValid; 
	// 1: GPS Blind; 0: GPS immediately;
	private boolean blind; 
	// 1: Urgent Alarm; 0: Without Urgent Alarm;
	private boolean urgentAlarm;
	// 1: BackPower; 0: External Power;
	private boolean backPower; 
	// 1: Door1 closed; 0: Door1 Opened;
	private boolean closedDoor1; 
	// 1: Door2 closed; 0: Door2 Opened;
	private boolean closedDoor2;
	
	public boolean isLongitude() {
		return longitude;
	}
	public void setLongitude(boolean longitude) {
		this.longitude = longitude;
	}
	public boolean isLatitude() {
		return latitude;
	}
	public void setLatitude(boolean latitude) {
		this.latitude = latitude;
	}
	public boolean isUnGPSValid() {
		return unGPSValid;
	}
	public void setUnGPSValid(boolean unGPSValid) {
		this.unGPSValid = unGPSValid;
	}
	public boolean isBlind() {
		return blind;
	}
	public void setBlind(boolean blind) {
		this.blind = blind;
	}
	public boolean isUrgentAlarm() {
		return urgentAlarm;
	}
	public void setUrgentAlarm(boolean urgentAlarm) {
		this.urgentAlarm = urgentAlarm;
	}
	public boolean isBackPower() {
		return backPower;
	}
	public void setBackPower(boolean backPower) {
		this.backPower = backPower;
	}
	public boolean isClosedDoor1() {
		return closedDoor1;
	}
	public void setClosedDoor1(boolean closedDoor1) {
		this.closedDoor1 = closedDoor1;
	}
	public boolean isClosedDoor2() {
		return closedDoor2;
	}
	public void setClosedDoor2(boolean closedDoor2) {
		this.closedDoor2 = closedDoor2;
	} 

}
