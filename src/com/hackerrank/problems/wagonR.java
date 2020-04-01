package com.hackerrank.problems;

public class wagonR extends Car{
	String milleage;

	public wagonR(String milleage){
	this.carname="wagonR";
	this.milleage=milleage;
	}
	
	@Override
	public String getmilleage() {
		
	
		return "milleage is "+ milleage+ "kmpl.";
	}


	
	

}
