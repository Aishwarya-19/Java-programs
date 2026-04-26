package com.java.programs;
import java.util.Scanner;

public class even_odd_number {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

//		input = input % 2;
		if (input % 2 == 0) {
			System.out.println("It is a Even Number");
		} else {
			System.out.println("It is a Odd Number");
		}

	}

}
