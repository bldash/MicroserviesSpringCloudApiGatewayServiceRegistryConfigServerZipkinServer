package com.example.paymentservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="paymentinfo")
public class Payment {
	@Id
	@GeneratedValue
	private int paymentId;
	private String paymentStatus;
	private String transactionid;
	private int orderId;
	private int amount;
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(String transactionid) {
		this.transactionid = transactionid;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", paymentStatus=" + paymentStatus + ", transactionid="
				+ transactionid + ", orderId=" + orderId + ", amount=" + amount + "]";
	}
	public Payment(int paymentId, String paymentStatus, String transactionid, int orderId, int amount) {
		
		this.paymentId = paymentId;
		this.paymentStatus = paymentStatus;
		this.transactionid = transactionid;
		this.orderId = orderId;
		this.amount = amount;
	}
	public Payment() {
		
	}

}
