package com.java.collections;

import java.util.TreeSet;

public class treeset {
	public static void main(String[] args) {
		TreeSet s = new TreeSet();
		s.add("Alice");
		s.add("Bob");
		s.add("Charlie");
		System.out.println(s);
		System.out.println(s.pollFirst()); //pollFirst() removes and returns the first element.
		System.out.println(s); 
	}
}
