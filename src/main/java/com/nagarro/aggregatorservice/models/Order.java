package com.nagarro.aggregatorservice.models;

import java.util.Date;

public class Order {

	private Integer id;

	private Integer orderAmount;

	private Date orderDate;

	private Integer user;

	public Order() {

	}

	public Order(final Integer id, final Integer orderAmount, final Date orderDate, final Integer user) {
		this.id = id;
		this.orderAmount = orderAmount;
		this.orderDate = orderDate;
		this.user = user;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Integer orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Integer getUser() {
		return user;
	}

	public void setUser(Integer user) {
		this.user = user;
	}
}
