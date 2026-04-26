package com.java.constructor; // without parameters

public class CS1 {
	String city = "Pune";
	String name;
	
	public CS1(){			//constructor without parameter
		name= "Aishwarya";
	}
	
	public static void main(String[] args) {
		CS1 obj= new CS1();
		obj.display();		//non-satic method is called from object name.method name
		CS1.display1();		// static method is called either from class name or just method name
		//dispaly1();
	}
	public void display()
	{
		System.out.println("I am non static display method");
		System.out.println("My city name is "+city);
		System.out.println("My name is "+name);
	}
	
	public static void display1()
	{
		System.out.println("I am static display1 method");
	}


}
