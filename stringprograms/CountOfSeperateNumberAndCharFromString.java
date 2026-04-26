package com.java.stringprograms;

public class CountOfSeperateNumberAndCharFromString {
	public static void main(String[] args) {
		String a = "asdbSFGA$#@0546";

		int lower = 0;
		int upper = 0;
		int specChar = 0;
		int number = 0;

		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
				lower++;
			} else if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
				upper++;
			} else if (a.charAt(i) >= '0' && a.charAt(i) <= '9') {
				number++;
			} else {
				specChar++;
			}
		}
		System.out.println("Count of lower character: " + lower);
		System.out.println("Count of upper character: " + upper);
		System.out.println("Count of number: " + number);
		System.out.println("Count of special character: " + specChar);

	}
}
