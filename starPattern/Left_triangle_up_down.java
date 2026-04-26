package com.java.starPattern;

public class Left_triangle_up_down {
	public static void main(String[] args) {
		int star=5;
	     for (int i = 1; i<=9; i++) {         // Outer for loop for the no of Rows
	    	 
	    	 for (int j = 1; j<=star; j++) {      // Inner For Loop for Space
	    		 System.out.print("*");
			}
	    	 System.out.println();
	    	 if(i<5) {
	    		 star--;
	    	 }
	    	 else {
	    		 star++;
	    	 }
		
	}
	}
}
