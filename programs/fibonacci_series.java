package com.java.programs;

import java.util.Scanner;

public class fibonacci_series {
	public static void main(String[] args) {
		System.out.println("Enter a number:");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int sum = 0, f1 = 0, f2 = 1;
		System.out.print(f1 + "+");
        if (n > 1) {
            System.out.print(f2 + "+");
        }

		for (int i = 1; i <= n; i++) {
			sum = f1 + f2;
			System.out.print(sum + "+");
			f1 = f2;
			f2 = sum;
		}

//	System.out.println("Fibonacci series of "+ n + " is " + sum);
	}
}
