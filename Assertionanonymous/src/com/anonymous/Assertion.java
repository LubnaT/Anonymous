package com.anonymous;

import java.util.Scanner; 

public class Assertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age: ");
		
		int value = scanner.nextInt();
		assert value>=18:"Not Valid";
		
		System.out.println("From Test: "+value);
		

	}

}

