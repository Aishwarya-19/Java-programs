package com.java.stringprograms;

public class Length_of_string_using_split {
	public static void main(String[] args) {
		String s = "My name is Aishwarya";
		String arr[]=s.split(" ");
		System.out.println("Length of string after split: " + arr.length);
	}
}
