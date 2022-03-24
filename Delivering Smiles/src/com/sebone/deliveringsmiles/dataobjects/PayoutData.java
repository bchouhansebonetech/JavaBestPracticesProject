package com.sebone.deliveringsmiles.dataobjects;

public class PayoutData {
	private int payoutId;
	private int orderId;
	private float payoutAmount;
	private String orderDeliveryTime;
	private float firstMileDistance;
	private float lastMileDistance;
	private float incentives;
	
	
	public int getPayoutId() {
		return payoutId;
	}
	public void setPayoutId(int payoutId) {
		this.payoutId = payoutId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public float getPayoutAmount() {
		return payoutAmount;
	}
	public void setPayoutAmount(float payoutAmount) {
		this.payoutAmount = payoutAmount;
	}
	public String getOrderDeliveryTime() {
		return orderDeliveryTime;
	}
	public void setOrderDeliveryTime(String orderDeliveryTime) {
		this.orderDeliveryTime = orderDeliveryTime;
	}
	public float getFirstMileDistance() {
		return firstMileDistance;
	}
	public void setFirstMileDistance(float firstMileDistance) {
		this.firstMileDistance = firstMileDistance;
	}
	public float getLastMileDistance() {
		return lastMileDistance;
	}
	public void setLastMileDistance(float lastMileDistance) {
		this.lastMileDistance = lastMileDistance;
	}
	public float getIncentives() {
		return incentives;
	}
	public void setIncentives(float incentives) {
		this.incentives = incentives;
	}
	
	
}
