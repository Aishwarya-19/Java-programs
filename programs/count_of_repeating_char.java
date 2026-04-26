package com.java.programs; 

import java.util.Scanner;

public class count_of_repeating_char {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter a string: ");
//		String input = scanner.nextLine().toLowerCase(); // convert to lowercase
		String input ="Aishwarya".toLowerCase();
		
		int count[] = new int[256]; // An array to store count of each character (ASCII)

		// Go through each character and count it
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c != ' ') { // skip spaces
				count[c]++; // increase count at the character's ASCII value
			}
		}
		System.out.println("Repeating characters:");
		// Go through the count array and print characters that appear more than once
		for (int i = 0; i < 256; i++) {
			if (count[i] > 1) {
				System.out.println("Character " + "'" + (char)i + "'" + " repeats " + count[i] + " times");
			}
		}
	}	

}
