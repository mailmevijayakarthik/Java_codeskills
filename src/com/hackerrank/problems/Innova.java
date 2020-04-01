package com.hackerrank.problems;

public class Innova extends Car{
	
	String milleage;
	
	public Innova(String milleage) {
		this.carname="innova";
		this.milleage=milleage;
	}

	@Override
	public String getmilleage() {
		
		
		return "milleage is "+ milleage+ "kmpl.";
	}

}
