package com.java.abstraction;

public class child implements father, mother {
	public void money() {// fathers property
		System.out.println("money method completed by child");
	}

	public void property() {// fathers property
		System.out.println("property completed by child");
	}

	public void receipe() {// mothers property
		System.out.println("receipe method completed child");
	}

	public void look() {// mothers property
		System.out.println("look method completed by child");
	}
	public static void main(String[] args) {
		child c= new child();// creating object of child class
		c.receipe();//method form mother
		c.look();// method from mother
		c.money();// method from father
		c.property();// method from father

	}
}
