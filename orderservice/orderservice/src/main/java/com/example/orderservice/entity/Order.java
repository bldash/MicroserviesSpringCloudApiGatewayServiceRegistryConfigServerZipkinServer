package com.example.orderservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orderinfo")
public class Order {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int qnty;
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQnty() {
		return qnty;
	}
	public void setQnty(int qnty) {
		this.qnty = qnty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", qnty=" + qnty + ", price=" + price + "]";
	}
	public Order(int id, String name, int qnty, int price) {
	
		this.id = id;
		this.name = name;
		this.qnty = qnty;
		this.price = price;
	}
	public Order() {
		
	}
	
	

}
