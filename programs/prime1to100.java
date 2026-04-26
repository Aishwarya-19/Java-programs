package com.java.programs;

public class prime1to100 {
	public static void main(String[] args) {
		System.out.println("Prime numbers from 1 to 100 are:"); 
		for(int num=0; num<=100; num++) { //outer loop tests each number from 1 to 100
			if(num==0 || num==1) {
				continue;
			}
			Boolean result = true;
			for(int i=2; i<num; i++) { // inner loop determines if that number is prime.
				if(num%i==0) {
					result=false;
					break;
				}
			}
			if(result) { //result is already a boolean that's why it's same only if(result == true)
				System.out.println(num + " is a prime number");
			}
		}
		
	}
}
