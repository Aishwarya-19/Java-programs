package com.java.stringprograms;

public class Total_no_of_occurences_without_using_loop {
	public static void main(String[] args) {
		String a = "My name is Aishwarya".toLowerCase();
		int len = a.length();
		int len2 = a.replace("a", "").length();
		int count=len-len2;
		System.out.println(count);
	}
}
