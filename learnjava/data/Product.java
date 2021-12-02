package com.learnjava.data;

public class Product {
	int id;
	String name;
	private float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.setPrice(price);
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + getPrice() + "]";
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}