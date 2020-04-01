package com.hackerrank.problems;

import java.util.Scanner;

public class HondaCity extends Car{
	
	String milleage;
	
	public HondaCity(String milleage) {
		this.carname="hondaCity";
		this.milleage=milleage;
	}

	@Override
	public String getmilleage() {
		// TODO Auto-generated method stub
		return "milleage is "+ milleage+ "kmpl.";
	}
	

}
