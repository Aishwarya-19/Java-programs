package com.java.arrayprograms;

public class PairSum {
	public static void main(String[] args) {

		        int a[] = { 10, 15, 20, 5, 7, 17, 8};
		        System.out.println("Pairs whose sum is 25:");

		        for (int i = 0; i < a.length; i++) {
		            for (int j = i + 1; j < a.length; j++) {
//j = i + 1 Each unique pair is checked once.The loop moves forward and avoids comparing elements already processed.
		                if (a[i] + a[j] == 25) {
//		                    System.out.println("(" + (int) a[i] + ", " + (int) a[j] + ")");
		                	System.out.println("(" + a[i] + ", " +  a[j] + ")");
		                }
		            }
		        }
		    }
		}
