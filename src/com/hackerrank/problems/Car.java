package com.hackerrank.problems;

public abstract class Car {
	
	boolean isSedan;
	String seats;
	String carname;
	
	public String getIsSedan() {
		
		if(this.carname.equalsIgnoreCase("wagonR")) {
			
			return "A wagonR is not a Sedan,";
		}else if(this.carname.equalsIgnoreCase("hondaCity")) {
			
			return "A HondaCity is a Sedan,";
		}else if(this.carname.equalsIgnoreCase("innova")) {
			
			return "A Innova is a Sedan,";
		}
		
		return null;
	}
	
	public String getSeats() {
		
		if(this.carname.equalsIgnoreCase("wagonR")) {
			
			return "4-seater";
		}else if(this.carname.equalsIgnoreCase("hondaCity")) {
			
			return "4-seater";
		}else if(this.carname.equalsIgnoreCase("innova")) {
			
			return "6-seater";
		}
		
		return null;
	}
	
	public abstract String getmilleage();

	
}
