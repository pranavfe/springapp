package com.pranav.demospring;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Buyer  {
	
	private String pname;
	
	@Autowired
	@Qualifier("desktop")
	private Computer lap;

	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}

	
//	public Buyer(String name, Laptop lap) {
//		super();
//		this.name = name;
//		this.lap = lap;
//	}

	
	
	
	public Computer getLap() {
		return lap;
	}
	public void setLap(Computer lap) {
		this.lap = lap;
	}

	public void laptopdetails() {

		System.out.println("Laptop Details:" +pname+ "    "+lap);
	}
	
	

}
