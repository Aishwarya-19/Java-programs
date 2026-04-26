package com.java.starPattern;

public class Right_left_triangle_pascal {
	public static void main(String[] args) {
		int star=1;
		int space=5;
		int star2=1;
		int space2=4;
	     for (int i = 1; i<=9; i++) {         // Outer for loop for the no of Rows
	    	 
	    	 for (int j = 1; j<=star; j++) {      // Inner For Loop for Space
	    		 System.out.print("*");
			}
	    	 for (int k = 1; k<=space; k++) {      // Inner For Loop for Space
	    		 System.out.print(" ");
			}
	    	 for (int m = 1; m<=space2; m++) {      // Inner For Loop for Space
	    		 System.out.print(" ");
			}
	    	 for (int n = 1; n<=star2; n++) {      // Inner For Loop for Space
	    		 System.out.print("*");
			}
	    	 System.out.println();
	    	 if(i<5) {
	    		 star++;
	    		 space--;
	    		 star2++;
	    		 space2--;
	    	 }
	    	 else {
	    		 star--;
	    		 space++;
	    		 star2--;
	    		 space2++;
	    	 }
		
	}
}
}
