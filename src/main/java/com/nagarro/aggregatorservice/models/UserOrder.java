package com.nagarro.aggregatorservice.models;

import java.util.List;

public class UserOrder {
	private List<Order> orders;

	public UserOrder() {

	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
}
