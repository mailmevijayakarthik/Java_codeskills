package com.hackerrank.problems;

import java.util.Scanner;

public class solution {
	
	public static void main(String[] arg) {
		
		Scanner in = new Scanner(System.in);
		int type = in.nextInt();
		String milleage = in.next();
		if(type==0) {
			Car newcar = new wagonR(milleage);
			System.out.println(newcar.getIsSedan()+ newcar.getSeats()+ newcar.getmilleage());
		}else if(type==1) {
			Car newcar = new HondaCity(milleage);
			System.out.println(newcar.getIsSedan()+ newcar.getSeats()+ newcar.getmilleage());
		}else if(type==0) {
			Car newcar = new Innova(milleage);
			System.out.println(newcar.getIsSedan()+ newcar.getSeats()+ newcar.getmilleage());
		}
	}

}
