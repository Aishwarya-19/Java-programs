package com.java.collections;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class enumerationdemo {
	public static void main(String[] args) {
		Vector v = new Vector();
        v.add("Apple");
        v.add("Banana");
        v.add("Cherry");
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
