package com.java.arrayprograms;
import java.util.Arrays;

public class Separate_0_and_1_from_Array {
	public static void main(String[] args) {

		int arr[] = { 0, 1, 0, 0, 1, 1, 1, 0, 1 };
		int count = 0;
		//count the number of 0
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count++;
			}
		}
		//printing the first part of array with 0
		for (int i = 0; i < count; i++) {
			arr[i] = 0;
		}
		//printing the remaining part of array with 1
		for (int i = count; i < arr.length; i++) {
			arr[i] = 1;
		}

		System.out.println(Arrays.toString(arr));
	}
}
