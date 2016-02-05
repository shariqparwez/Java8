package com.training.apps;

import java.util.ArrayList;

public class FirstApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeting grt = () -> {System.out.println("I Know Java 8");};
		grt.show();
		
		ArrayList<String> namesList = new ArrayList<String>();
		namesList.add("Shariq");
		namesList.add("Srishti");
		namesList.add("Mayank");
		namesList.add("Rahul");
		
		namesList.forEach(System.out::println);
		}
	}

