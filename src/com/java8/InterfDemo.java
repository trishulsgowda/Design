package com.java8;

public class InterfDemo {

	
	// This program demonstrates passing functions as arguments
	
	public static void main(String[] args) {
		Interf sumInterf = (a,b) -> a+b;
		Interf productInterf = (a,b) -> a*b;
		//System.out.println(sumInterf.calculate(2, 3));
		//System.out.println(productInterf.calculate(2, 3));
		InterfDemo id = new InterfDemo();
		
		
		System.out.println("Sum : " + id.sum(sumInterf, 2, 3));
		
		System.out.println("Product : " + id.sum(productInterf, 2, 3));
	}
	
	public int sum(Interf i,int a, int b){
		return i.calculate(a, b);
	}
	
	public int product(Interf i,int a, int b){
		return i.calculate(a, b);
	}
}
