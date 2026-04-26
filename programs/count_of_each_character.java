package com.java.programs;

import java.util.Scanner;

public class count_of_each_character {

	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int len = s.length();
		int count[] = new int[256];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c != ' ') {
				count[c]++;
			}
		}

		System.out.println("Repeating character: ");
		for (int i = 0; i < 256; i++) {
			if (count[i] > 0) {
				System.out.println("Character " + (char) i + " repeats " + count[i] + " times");
			}
		}
	}
}
