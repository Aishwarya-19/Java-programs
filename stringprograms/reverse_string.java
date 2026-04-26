package com.java.stringprograms;

public class reverse_string {
	public static void main(String[] args) {
		String s = "aishwarya";
		String rev = "";
		for(int i=s.length()-1; i>=0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println("Reverse of a string is: "+ rev);
	}
}
