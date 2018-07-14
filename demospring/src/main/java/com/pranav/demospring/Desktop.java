package com.pranav.demospring;

public class Desktop implements Computer {
	
	String brand;
	int price;
	

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand=brand;

	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		
		this.price=price;

	}

	@Override
	public String toString() {
		return "Desktop [brand=" + brand + ", price=" + price + "]";
	}

}
