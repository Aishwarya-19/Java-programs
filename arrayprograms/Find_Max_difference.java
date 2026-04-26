package com.java.arrayprograms;

public class Find_Max_difference {
	public static void main(String[] args) {
		int arr[]= {8,5,6,4,8,9,2};
		int diff=0;
		//i < arr.length - 1	To safely use arr[i + 1] and avoid out-of-bounds access
		for(int i=0; i<arr.length-1;i++) { 
			if(arr[i+1]-arr[i]>diff) {
				diff=arr[i+1]-arr[i];
			}
		}
		System.out.println(diff);
	}
}
