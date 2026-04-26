package com.java.stringprograms;

public class Sum_of_number_from_String {
	public static void main(String args[]) {

		String a = "hell4123";

		char ch[] = a.toCharArray();
		int sum = 0;

		for (int i = 0; i < a.length(); i++) {
			
			if (Character.isDigit(ch[i])) {

				int k = Integer.parseInt(String.valueOf(ch[i])); //String.valueOf(ch[i]) converts the character digit to a String
				sum = sum + k;									 //Integer.parseInt converts that String to an integer
			}
		}
		System.out.println("Sum of digit in a string is: " + sum);

	}

}
