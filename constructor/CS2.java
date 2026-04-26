package com.java.constructor;

public class CS2 {
	int num1, num2, num3;		//variable declaration
//	int num2;
//	int num3;
	
	public CS2() {		//constructor without parameter
		num1 = 10;
		num2 = 20;
		num3 = 30;
	}
	
	public CS2(int a) {		//constructor with single parameter
		num1 = a;
	}
	
	public CS2(int a, int b) {		//constructor with double parameter
		num1 = a;
		num2 = b;
	}
	
	public CS2(int a, int b, int c) {		//constructor with 3 parameter
		num1 = a;
		num2 = b;
		num3 = c;
	}
	
	public static void main(String[] args) {
		CS2 obj1 = new CS2();
		obj1.addition();
		
		CS2 obj2 = new CS2(100);
		obj2.addition();
		
		CS2 obj3 = new CS2(100, 200);
		obj3.addition();
		
		CS2 obj4 = new CS2(100, 200, 300);
		obj4.addition();
	}
	
	public void addition() {
		int sum = num1 + num2 + num3;
		System.out.println("Addition is "+sum);
	}
}
