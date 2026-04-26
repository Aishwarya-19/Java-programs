package com.java.stringprograms;

import java.util.ArrayList;

public class lower_uppercase_string {
	public static void main(String args[]) {
		String a = "AiShWaRyA";
		ArrayList<Character> obj = new ArrayList<Character>();
		ArrayList<Character> obj1 = new ArrayList<Character>();

		for (int i = 0; i < a.length(); i++) {

			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {

				obj.add(a.charAt(i));
			} else {

				obj1.add(a.charAt(i));
			}

		}
//		System.out.println(obj); //output: [j, i, f, g, h]
		System.out.print("Lowercase:");
		for (char b : obj) { //applying for loop so that the output comes in string
			System.out.print(b);
		}
		System.out.println();
		System.out.print("Uppercase:");
		for (char c : obj1) {
			System.out.print(c);
		}
	}

}
