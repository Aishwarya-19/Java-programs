package com.java.stringprograms;

import java.util.Scanner;

public class reverse_string_from_middle {
	public static void main(String[] args) {

		// Take input from the user
		System.out.print("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		int len = input.length();
		int mid = len / 2;

		String firstHalf = input.substring(0, mid); //extracts from index 0 (inclusive) to mid (exclusive)
		String secondHalf = input.substring(mid); //extracts from index mid to the end of the string

		// Manually reverse first half
		String reversedFirst = "";
		for (int i = firstHalf.length() - 1; i >= 0; i--) {
			reversedFirst += firstHalf.charAt(i);
		}

		// Manually reverse second half
		String reversedSecond = "";
		for (int i = secondHalf.length() - 1; i >= 0; i--) {
			reversedSecond += secondHalf.charAt(i);
		}

		// Combine and print
		String result = reversedFirst + reversedSecond;
		System.out.println("Reversed from middle: " + result);

	}
}
