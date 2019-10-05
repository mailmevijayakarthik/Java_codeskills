package com.codingchallenge;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMap_example {

	public static void main(String arg[]) {
		HashMap<Integer, String> employeeList =storeEmployeerecords();


		for(Entry<Integer, String> EmpID :employeeList.entrySet()) {
			if(EmpID.getKey()==242078) {
				System.out.println(EmpID.getValue());

			}

		}

	}

	public static HashMap<Integer, String> storeEmployeerecords() {
		HashMap<Integer, String> employeeList = new HashMap<>();
		employeeList.put(242074, "Vijayakarthikeyan");
		employeeList.put(242075,"dhivya");
		employeeList.put(242076,"mahathi");
		employeeList.put(242077,"yethin");
		employeeList.put(242078,"Agilan");
		employeeList.put(242079,"Arul");

		return employeeList;
	}



}
