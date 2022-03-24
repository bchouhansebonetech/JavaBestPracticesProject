package com.sebone.deliveringsmiles.dataobjects;

public class DriverStatus {
	private int driverId;
	private boolean driverStatus;
	private String driverStatusDescription;
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public boolean isDriverStatus() {
		return driverStatus;
	}
	public void setDriverStatus(boolean driverStatus) {
		this.driverStatus = driverStatus;
	}
	public String getDriverStatusDescription() {
		return driverStatusDescription;
	}
	public void setDriverStatusDescription(String driverStatusDescription) {
		this.driverStatusDescription = driverStatusDescription;
	}
	
	
}
