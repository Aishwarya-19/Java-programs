package com.java.abstraction;

public class concrete extends incomplete{
	public void test3() { //no need to write abstract keyword here
		System.out.println("method completed in concrete class");
	}
	public void test4()
	{
		System.out.println("Hi i am test4--> own method of concrete class");
	}
	public static void main(String[] args) {
		concrete c = new concrete();
		c.test1();
		c.test2(); //does not have a body
		c.test3();
		c.test4();
	}
}
