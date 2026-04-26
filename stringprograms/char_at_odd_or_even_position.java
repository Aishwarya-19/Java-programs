package com.java.stringprograms;

public class char_at_odd_or_even_position {
	public static void main(String[] args) {
		String s = "Aishwarya".toLowerCase();
		
		for(int i=0; i<s.length(); i++) {
			if(i%2 != 0) { //for odd 
//			if(i%2 == 0) { //even 
				System.out.print(s.charAt(i) + " ");
			}
		}
	}
}
