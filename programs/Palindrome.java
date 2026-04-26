package com.java.programs;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = n;

		int rev = 0, d;
		while (n > 0) { // n=143
			d = n % 10; // 3
			rev = rev * 10 + d;
			n = n / 10; // 14
		}
		System.out.println("Reverse number: " + rev);
		if (rev == num) {
			System.out.println("It is a palindrome number");
		} else {
			System.out.println("It is not a palindrome number");
		}
	}
}
