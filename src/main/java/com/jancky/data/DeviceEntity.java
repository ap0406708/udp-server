package com.jancky.data;

public class DeviceEntity {

	// 1: Device selfCheck Fails; 0: Device selfCheck OK;
	private boolean selfCheckFail;
	//1: External alarm;     0: Without external alarm;
	private boolean externalAlarm;
	// 1: AutoGuard Mode;     0: Normal Mode;
	private boolean autoGuard;
	//1: ACC ON;             0: ACC OFF;
	private boolean accON;
	// 1: OverSpeed Alarm;    0: Without OverSpeed Alarm;
	private boolean overSpeedAlarm;
	// 1: InRegion Alarm;     0: Without InRegion Alarm;
	private boolean inRegionAlarm;
	// 1: OutRegion Alarm;    0: Without OutRegion Alarm;
	private boolean outRegionAlarm;
	// 1: OverTime Alarm;     0: Without OverTime Alarm;
	private boolean overTimeAlarm;

	public boolean isSelfCheckFail() {
		return selfCheckFail;
	}

	public void setSelfCheckFail(boolean selfCheckFail) {
		this.selfCheckFail = selfCheckFail;
	}

	public boolean isExternalAlarm() {
		return externalAlarm;
	}

	public void setExternalAlarm(boolean externalAlarm) {
		this.externalAlarm = externalAlarm;
	}

	public boolean isAutoGuard() {
		return autoGuard;
	}

	public void setAutoGuard(boolean autoGuard) {
		this.autoGuard = autoGuard;
	}

	public boolean isAccON() {
		return accON;
	}

	public void setAccON(boolean accON) {
		this.accON = accON;
	}

	public boolean isOverSpeedAlarm() {
		return overSpeedAlarm;
	}

	public void setOverSpeedAlarm(boolean overSpeedAlarm) {
		this.overSpeedAlarm = overSpeedAlarm;
	}

	public boolean isInRegionAlarm() {
		return inRegionAlarm;
	}

	public void setInRegionAlarm(boolean inRegionAlarm) {
		this.inRegionAlarm = inRegionAlarm;
	}

	public boolean isOutRegionAlarm() {
		return outRegionAlarm;
	}

	public void setOutRegionAlarm(boolean outRegionAlarm) {
		this.outRegionAlarm = outRegionAlarm;
	}

	public boolean isOverTimeAlarm() {
		return overTimeAlarm;
	}

	public void setOverTimeAlarm(boolean overTimeAlarm) {
		this.overTimeAlarm = overTimeAlarm;
	}

}
