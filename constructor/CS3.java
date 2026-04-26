package com.java.constructor;

public class CS3 {
	int b=90;//global variable 
	public static void main(String[] args)  
	{ 
		CS3 t= new CS3(); 
		t.display();//10 
		t.display1();//20 
	} 
	public void display() 
	{ 
	int a=10;//local variable 
	System.out.println("local value of a is "+a); 
	System.out.println("local value of b is "+b); 
	} 
	public void display1() 
	{ 
	int a=20;//local variable 
	System.out.println("local value of a is "+a); 
	System.out.println("local value of b is "+b); 
	} 
} 

