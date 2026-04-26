package com.java.arrayprograms;

import java.util.HashSet;

public class DuplicateNumber {
	public static void main(String[] args) {

		        int arr[] = {3,1,5,7,5,8,7,1};
		        System.out.println("Duplicate numbers in given array:");

		        HashSet<Integer> seen = new HashSet<Integer>();  //it will go through the array and store only unique value
		        HashSet<Integer> printed = new HashSet<Integer>(); //If number seen again → print it once
		        //i < arr.length	Only accesses arr[i], so safe to iterate through the full array
		        for (int i = 0; i < arr.length; i++) {
		            if (seen.contains(arr[i]) && !printed.contains(arr[i])) { //If both conditions are true:already seen before not printed yet
		                System.out.println(arr[i]);  //then we print the number
		                printed.add(arr[i]);
		            } else {
		                seen.add(arr[i]); //If the number has not appeared before, we add it to seen
		            }
		        }
		    }
		}

