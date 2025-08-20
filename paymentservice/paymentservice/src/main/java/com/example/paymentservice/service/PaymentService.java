package com.example.paymentservice.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.paymentservice.entity.Payment;
import com.example.paymentservice.repo.ipaymentrepositary;

@Service
public class PaymentService {
	@Autowired
   ipaymentrepositary paymentrepo;
	
	public Payment savePyamentDetails(Payment payment) {
		payment.setPaymentStatus(paymentProcessing());
		payment.setTransactionid(UUID.randomUUID().toString());
		return paymentrepo.save(payment);
	}
	
	public String paymentProcessing() {
		return new Random().nextBoolean()?"success":"false";
	}

}
