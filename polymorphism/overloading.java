package com.java.polymorphism;
//no need of inheritance for overloading
public class overloading {
	public int add(int a, int b) {
		int sum = a+b;
		return sum;
//		System.out.println(a + b );
	}
	
	public void add(int x, int y, int z) {
		System.out.println(x + y + z );
	}
	
	public static void main(String[] args) {
		overloading obj = new overloading();
		int sum = obj.add(10,20);
			System.out.println(sum);
		
		obj.add(10,20,30);
	}
}
