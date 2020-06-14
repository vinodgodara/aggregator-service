package com.nagarro.aggregatorservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.aggregatorservice.models.OrderDetail;
import com.nagarro.aggregatorservice.services.OrderDetailService;

@RestController
public class OrderDetailController {

	@Autowired
	private OrderDetailService orderDetailService;

	@GetMapping("/")
	public String home() {
		return "Welcome to Aggregator Service.";
	}

	@GetMapping("/orderdetails/{id}")
	public OrderDetail getOrderDetails(@PathVariable final Integer id) {
		return orderDetailService.getOrderDetail(id);
	}
}
