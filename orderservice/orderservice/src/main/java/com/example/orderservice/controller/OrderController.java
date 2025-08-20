package com.example.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.orderservice.dto.Payment;
import com.example.orderservice.dto.TransactionRequest;
import com.example.orderservice.dto.TransactionResponse;
import com.example.orderservice.entity.Order;
import com.example.orderservice.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	OrderService orderservice;
	
	@PostMapping("/saveOrder")
	public TransactionResponse  saveOrder(@RequestBody TransactionRequest request) {
		
		return  orderservice.saveOrder(request);
		///adeed git
	}

}
