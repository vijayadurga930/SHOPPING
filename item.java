package com.capgemini.ShoppingCart.Bean;

public class Item {
	private int itemId;
	private String name;
	private double price;
	public Item() {
		super();
	}
	public Item(int itemId, String name, double price) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.price = price;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "itemId=" + itemId + ", name=" + name + ", price=" + price ;
	}
	
	


}
