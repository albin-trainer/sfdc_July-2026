package com.cg.oops;
public class Customer {
	private	int custId;//instance variables
	private	 String custName;
	private String address;
	private Cart cart;
	Customer(int custId,String custName,String address){
		this.custId=custId;
		this.custName=custName;
		this.address=address;
	}
	
	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	//generate only  getters
	public int getCustId() {
		return custId;
	}
	public String getCustName() {
		return custName;
	}
	public String getAddress() {
		return address;
	}
	
}
