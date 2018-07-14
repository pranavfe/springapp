package com.pranav.demospring;


public class Alien {

	private String aname=null;

	private String aname1=null;
	
	public Alien(String aname, String aname1) {
		this.aname = aname;
		this.aname1 = aname1;
	}

	public void show() {

		System.out.println("hi spring....." +aname +aname1);
	}

	public String getAname1() {
		return aname1;
	}

	public void setAname1(String aname1) {
		this.aname1 = aname1;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	

}
