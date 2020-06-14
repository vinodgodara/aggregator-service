package com.nagarro.aggregatorservice.services;

import com.nagarro.aggregatorservice.models.OrderDetail;

public interface OrderDetailService {

	OrderDetail getOrderDetail(final Integer userID);
	
	public String getUserServiceUrl(final Integer userID);

	public String getOrderServiceUrl(final Integer userID);
}
