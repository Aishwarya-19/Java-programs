package com.java.programs;

import java.util.Scanner;

public class prime_number {
	public static void main(String[] args) {
		System.out.println("Enter a number:");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n <= 1) {
			System.out.println("Number is not prime (it must be greater than 1).");
			return; // Stop the program here
		}
		boolean result = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				result = false;
				System.out.println("It is not a prime number.");
				break;
			}

		}
		if (result == true) {
			System.out.println("It is a prime number.");
		}

	}
}
