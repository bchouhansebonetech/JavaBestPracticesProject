package com.sebone.deliveringsmiles.interfaceimpl;

import java.util.List;


import com.sebone.deliveringsmiles.dataobjects.OrderData;
import com.sebone.deliveringsmiles.dataobjects.OrderStatus;
import com.sebone.deliveringsmiles.interfaces.Order;

public class OrderImpl implements Order{
	public OrderData assignOrder(OrderData orderData) {
		return null;
	}
	
	public List<OrderData> getOrderDetails(int orderId) {
		return null;
	}
	
	public OrderStatus orderAcceptOrNot(OrderStatus orderStatus, int OrderId) {
		return null;
	}
	
	public List<OrderData> sendOrderNotification(int driverId, String deliveryStatus) {
		return null;
	}
}
