package com.iiitb.spe.calculator_jenkins_integration_sample;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(2,3);
		subtract(2, 3); 
		multiply(2, 3); 
		divide(2, 3); 
	}
	
	public static void add(int a,int b) {
		System.out.println(a+b);
	}

	public static void subtract(int a, int b) {
		System.out.println(a-b);
	}
	
	public static void multiply(int a,int b) {
		System.out.println(a*b); 
	}
	
	public static void divide(int a,int b) {
		try {
			System.out.println(a/b);
		}catch(Exception e) {
			System.out.println("Divide by zero.");
		}
	}
}
