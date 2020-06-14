package com.nagarro.aggregatorservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nagarro.aggregatorservice.models.OrderDetail;
import com.nagarro.aggregatorservice.models.User;
import com.nagarro.aggregatorservice.models.UserOrder;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${userservice.url}")
	private String userServiceURL;

	@Value("${orderservice.url}")
	private String orderServiceURL;

	@Override
	public OrderDetail getOrderDetail(Integer userID) {
		final User user = restTemplate.getForObject(getUserServiceUrl(userID), User.class);

		final UserOrder userOrder = restTemplate.getForObject(getOrderServiceUrl(userID), UserOrder.class);

		final OrderDetail orderDetail = new OrderDetail();
		orderDetail.setUserDetails(user);
		orderDetail.setOrders(userOrder.getOrders());

		return orderDetail;
	}

	public String getUserServiceUrl(final Integer userID) {
		return userServiceURL + "/users/" + userID;
	}

	public String getOrderServiceUrl(final Integer userID) {
		return orderServiceURL + "/orders/" + userID;
	}
}
