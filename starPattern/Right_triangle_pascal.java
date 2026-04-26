package com.java.starPattern;

public class Right_triangle_pascal {
	public static void main(String[] args) {
		int star=1;
	     for (int i = 1; i<=7; i++) {         // Outer for loop for the no of Rows
	    	 
	    	 for (int j = 1; j<=star; j++) {      // Inner For Loop for Space
	    		 System.out.print("*");
			}
	    	 System.out.println();
	    	 if(i<4) {
	    		 star++;
	    	 }
	    	 else {
	    		 star--;
	    	 }
		
	}
	}
}
