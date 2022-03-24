package com.sebone.deliveringsmiles.dataobjects;

import java.util.List;

public class DriverData {
	private int driverId;
	private String driverName;
	private String driverEmail;
	private String driverContact;
	private String driverGovtId;
	private String driverUserName;
	private String driverPassword;	
	private List<DriverAddress> driverAddress;
	private DriverStatus driverStatus;
	
	
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getDriverEmail() {
		return driverEmail;
	}
	public void setDriverEmail(String driverEmail) {
		this.driverEmail = driverEmail;
	}
	public String getDriverContact() {
		return driverContact;
	}
	public void setDriverContact(String driverContact) {
		this.driverContact = driverContact;
	}
	public String getDriverGovtId() {
		return driverGovtId;
	}
	public void setDriverGovtId(String driverGovtId) {
		this.driverGovtId = driverGovtId;
	}
	public String getDriverUserName() {
		return driverUserName;
	}
	public void setDriverUserName(String driverUserName) {
		this.driverUserName = driverUserName;
	}
	public String getDriverPassword() {
		return driverPassword;
	}
	public void setDriverPassword(String driverPassword) {
		this.driverPassword = driverPassword;
	}
	public List<DriverAddress> getDriverAddress() {
		return driverAddress;
	}
	public void setDriverAddress(List<DriverAddress> driverAddress) {
		this.driverAddress = driverAddress;
	}
	public DriverStatus getDriverStatus() {
		return driverStatus;
	}
	public void setDriverStatus(DriverStatus driverStatus) {
		this.driverStatus = driverStatus;
	}
	
	
}
