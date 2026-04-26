package com.java.polymorphism;

public class overriding2 extends overriding{
	public void print() {
		System.out.println("class2");
	}
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		overriding2 obj1 = new overriding2();
		obj1.print();
		obj1.add(10, 20);
		
		overriding obj = new overriding();
		obj.print();
		obj.add(1, 2);
	}
}
