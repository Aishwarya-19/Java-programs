package com.java.stringprograms;

public class Occurences_of_letter {
	public static void main(String[] args) {
		String a="My name is Aishwarya".toLowerCase();
		int count=0;
		for(int i=0; i<a.length();i++) {
			if(a.charAt(i)=='a') {
				count++;
			}
		}
		System.out.println("Occurence of letter a: " + count);
	}
}
