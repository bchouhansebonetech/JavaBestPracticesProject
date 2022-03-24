package com.sebone.deliveringsmiles.interfaceimpl;

import java.util.List;

import com.sebone.deliveringsmiles.dataobjects.LoginDetails;
import com.sebone.deliveringsmiles.dataobjects.LoginStatus;
import com.sebone.deliveringsmiles.interfaces.DriverLogin;

public class DriverLoginImpl implements DriverLogin{
	public LoginStatus userAuthentication(String driverEmail , String driverPassword) {
		return null;
	}
	
	public List<LoginDetails> getLoginDetails(int driverId) {
		return null;
	}
}
