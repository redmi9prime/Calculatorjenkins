package com.test;

import java.util.Scanner;

public class Calc {

	
	static void multiply(int a, int b) {
		
		System.out.println(a*b);
	}
	
	static void div(int a ,int b) {
		
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b =sc.nextInt();
		System.out.println("Enetr your choice *,/");
		String c=sc.next();
		switch (c){
		
		case "*":
			multiply(a,b);
			break;
			
		case "/":
			div(a,b);
		}
	}

}
