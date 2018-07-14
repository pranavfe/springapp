package com.pranav.demospring;

public interface Computer {

	//	public Laptop(String brand, int price) {
	//		super();
	//		this.brand = brand;
	//		this.price = price;
	//	}
	String toString();

	String getBrand();

	void setBrand(String brand);

	int getPrice();

	void setPrice(int price);

}