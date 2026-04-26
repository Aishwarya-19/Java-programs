package com.java.stringprograms;

import java.util.Arrays;

public class count_of_each_word_from_string {
	public static void main(String[] args) {
		String a="My name is Aishwarya";
		String word[]=a.split(" ");
		System.out.println(Arrays.toString(word));
		for(int i=0; i<word.length;i++) {
			System.out.println(word[i].length());
		}
	}
}
