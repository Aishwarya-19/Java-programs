package com.java.collections;

import java.util.HashMap;

public class hashmapq {
	public static void main(String[] args) {

		// No need to mention the
		// Generic type twice
		HashMap hm1 = new HashMap();

		hm1.put(null, null);
		hm1.put(1, null);
		hm1.put(null, 2);
		hm1.put(null, 3);
		hm1.put(2, "two");
		
		System.out.println(hm1);
	}
}
