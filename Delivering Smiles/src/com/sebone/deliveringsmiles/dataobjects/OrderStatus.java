package com.sebone.deliveringsmiles.dataobjects;

public class OrderStatus {
	private int orderId;
	private boolean orderStatus;
	private String orderStatusDescription;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public boolean isOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(boolean orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatusDescription() {
		return orderStatusDescription;
	}
	public void setOrderStatusDescription(String orderStatusDescription) {
		this.orderStatusDescription = orderStatusDescription;
	}
	
	
}
