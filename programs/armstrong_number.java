package com.java.programs;

import java.util.Scanner;

public class armstrong_number {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = num;
		int sum= 0, d;
		while(n>0) {
			d=n%10;			  //Gets the last digit.
			sum=sum+(d*d*d);  //Adds the cube of the digit to sum
			n = n/10;		  //Removes the last digit from the number.
		}
		if(num==sum) {
			System.out.println("It is an armstrong number");
		}else {
			System.out.println("It is not an armstrong number");
		}
	}
}
