package com.sebone.deliveringsmiles.interfaces;

import com.sebone.deliveringsmiles.dataobjects.DriverData;
import com.sebone.deliveringsmiles.dataobjects.DriverStatus;

public interface DriverRegistration {
	DriverData submitDriverData(DriverData driverData);
	DriverData getDriverDetails(int driverId);
	DriverStatus updateDriverData(DriverData driverData);
}
