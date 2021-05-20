package com.wipro.order.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Order {

	@Id
	@GeneratedValue
	private int ID;
	private int custID;
	private String paymentID;
	private String orderStatus;
	private String shippingAddress;
	private ArrayList products;
	private String trackInfo;
		
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	public String getPaymentID() {
		return paymentID;
	}
	public void setPaymentID(String paymentID) {
		this.paymentID = paymentID;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public ArrayList getProducts() {
		return products;
	}
	public void setProducts(ArrayList products) {
		this.products = products;
	}
	public String getTrackInfo() {
		return trackInfo;
	}
	public void setTrackInfo(String trackInfo) {
		this.trackInfo = trackInfo;
	}	
	
}
