package com.java.arrayprograms;

public class Intersection_of_two_array {
	public static void main(String[] args) {
		int a1[] = {23, 36, 96, 78, 55};
	    int a2[] = {78, 45, 19, 73, 55};
	    System.out.print("Intersection of two array: ");
	     for(int i=0; i<a1.length;i++) {
	    	 for(int j=0; j<a2.length;j++) {
	    		 if(a1[i]==a2[j]) {
	    			 System.out.print(a2[j] + " ");
	    		 }
	    	 }
	     }
	}
}
