package com.pranav.demospring;

public class Laptop implements Computer {
	
	private String brand;
	private int price;

//	public Laptop(String brand, int price) {
//		super();
//		this.brand = brand;
//		this.price = price;
//	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + "]";
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	

}
