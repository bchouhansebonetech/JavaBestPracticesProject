package com.sebone.deliveringsmiles.interfaceimpl;

import java.util.List;

import com.sebone.deliveringsmiles.dataobjects.OrderStatus;
import com.sebone.deliveringsmiles.dataobjects.PayoutData;
import com.sebone.deliveringsmiles.interfaces.Payout;

public class PayoutImpl implements Payout{
	public PayoutData payoutByOrder(int orderId, int driverId) {
		return null;
	}
	
	public List<PayoutData> payoutOfTheDays(OrderStatus orderStatus, int driverId , String startDate, String endDate) {
		return null;
	}
	
	public List<PayoutData> totalPayout(int driverId) {
		return null;
	}
}
