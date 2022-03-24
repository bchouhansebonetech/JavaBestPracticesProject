package com.sebone.deliveringsmiles.interfaces;

import java.util.List;


import com.sebone.deliveringsmiles.dataobjects.OrderData;
import com.sebone.deliveringsmiles.dataobjects.OrderStatus;

public interface Order {
	OrderData assignOrder(OrderData orderData);
	List<OrderData> getOrderDetails(int orderId);
	OrderStatus orderAcceptOrNot(OrderStatus orderStatus, int OrderId);
	List<OrderData> sendOrderNotification(int driverId, String deliveryStatus);
}
