package com.cg.oops;

public class Product {
	private	int productId; //instance variables
	private	String prodName;
	private	String category;
	private	float price;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		//validation/security ...
		this.productId = productId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
