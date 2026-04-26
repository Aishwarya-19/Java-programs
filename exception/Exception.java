package com.java.exception;

public class Exception {
	public static void main(String[] args) {
		try {
//			int data = 50/0;
			
			int arr[]= {10,20,30};
			System.out.println(arr[5]);
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("Rest of the code will print");
	}

}
