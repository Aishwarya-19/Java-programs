package com.java.programs;

import java.util.Scanner;

public class reverse_number {
	public static void main(String[] args) {
//		System.out.println("Enter a number");
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		int n=435345;
		int rev = 0, d;
		while (n > 0) { 		// n=123
			d = n % 10; 		// Get the last digit (e.g. 123 % 10 = 3) 			(copy)
			rev = rev*10 +d; 	//We multiply by 10 to shift digits to the left and add the new digit to the reversed number     			(paste)
			n = n / 10; 		// Remove the last digit (e.g. 123 / 10 = 12)		(cut)	
		}
		System.out.print(rev);
	}
}
