package com.java.arrayprograms;

import java.util.Arrays;

public class Array_Reverse_Order {
	public static void main(String[] args) {
		int a[]= {10,20,30,40};
//		System.out.println(Arrays.toString(a));  
		for(int i=a.length-1; i>=0; i--) {
			System.out.print(a[i] + " ");
		}
	}
}

//System.out.println(a[]); this will give error
//System.out.println(a); output:[I@15db9742
//This is the memory reference of the array, not the elements.
//So to print the array we are converting it to string 
