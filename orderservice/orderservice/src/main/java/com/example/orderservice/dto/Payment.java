package com.example.orderservice.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
	private int paymentId;
	private String paymentStatus;
	private String transactionid;
	private int orderId;
	private int amount;
	
}
