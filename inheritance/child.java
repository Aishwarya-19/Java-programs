package com.java.inheritance;
//single level inheritance
public class child extends parent {
	public void subclass() {
		System.out.println("Child class");
	}
	
	public static void main(String[] args) {
		child c = new child();
		c.print();
		c.subclass();
		
		parent p = new parent();
		p.print();
		
	}
}
