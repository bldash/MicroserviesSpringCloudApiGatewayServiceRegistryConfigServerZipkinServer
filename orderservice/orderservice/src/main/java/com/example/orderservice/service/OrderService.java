package com.example.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.orderservice.dto.Payment;
import com.example.orderservice.dto.TransactionRequest;
import com.example.orderservice.dto.TransactionResponse;
import com.example.orderservice.entity.Order;
import com.example.orderservice.repo.iorderrepo;

@Service
public class OrderService {
   @Autowired	
   iorderrepo orderrepo;
   @Autowired
   private RestTemplate restTemplate;
   
   public TransactionResponse saveOrder(TransactionRequest request) {
	   String response=" ";
	   Order order=request.getOrder();
		Payment payment=request.getPayment();
		payment.setOrderId(order.getId());
		payment.setAmount(order.getPrice());
		Payment paymentResponse=restTemplate.postForObject("http://localhost:8079/payment/doPayment", payment, Payment.class);
		response=paymentResponse.getPaymentStatus().equals("success")?"payment is done succesfully":"paymentisfailed";
	    orderrepo.save(order);
	    TransactionResponse tresponse=new TransactionResponse();
	    tresponse.setOrder(order);
	    tresponse.setTranstionId(paymentResponse.getTransactionid());
	    tresponse.setAmount(paymentResponse.getAmount());
	    tresponse.setMessage(response);
	    return tresponse;
   }
   

}
