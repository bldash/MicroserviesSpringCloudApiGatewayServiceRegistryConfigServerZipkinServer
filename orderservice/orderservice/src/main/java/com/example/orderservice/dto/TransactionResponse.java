package com.example.orderservice.dto;

import org.springframework.stereotype.Component;

import com.example.orderservice.entity.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponse {
 private Order order;
 private String transtionId;
 private int amount;
 private String message;

}





