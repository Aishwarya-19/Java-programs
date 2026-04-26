package com.java.programs;

import java.util.Scanner;

public class multiplication_without_multiple_operator {
	public static void main(String[] args) {
		int n1 = 5; //n1 → number to add
		int n2 = 4; //n2 → number of times to add
		int sum = 0;
		for (int i = 1; i <= n2; i++) { // i <= n2 Because we want to add n1 exactly n2 times. //if i=0; i<n2
			sum = sum + n1;
		}
		System.out.println("Multiplication of " + n1 + "*" + n2 + " is: " + sum);
	}
}
