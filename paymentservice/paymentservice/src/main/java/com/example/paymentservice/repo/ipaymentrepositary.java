package com.example.paymentservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.paymentservice.entity.Payment;

@Repository
public interface ipaymentrepositary extends JpaRepository<Payment,Integer> {

}
