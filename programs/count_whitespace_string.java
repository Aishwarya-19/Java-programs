package com.java.programs;

import java.util.Scanner;

public class count_whitespace_string {
	public static void main(String[] args) {
		System.out.println("Enter a string:");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		int length = input.length(); // length of a string
		// it will replace the whitespace with no space
		int length2 = input.replace(" ", "").length(); // length of string without whitespace
		int count = length - length2;
		System.out.println("Count of white spaces in a given string: " + count);

	}
}
