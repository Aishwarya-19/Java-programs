package com.java.stringprograms;

import java.util.Scanner;

public class palindrome_string {
	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		String rev = "";
		for (int i = n.length() - 1; i >= 0; i--) {
			rev = rev + n.charAt(i);
		}
		System.out.println("Reverse string: " + rev);
		if (n.equals(rev)) {
			System.out.println("It is a palindrome string");
		} else {
			System.out.println("It is not a palindrome string");
		}
	}
}
