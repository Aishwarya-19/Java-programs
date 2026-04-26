package com.java.stringprograms;

import java.util.LinkedHashSet;
//import java.util.HashSet;

public class remove_duplicate {
	public static void main(String[] args) {
		   String s="AISHwarya";
		   String a = s.toLowerCase();
		   char ch []=a.toCharArray();

//A 'HashSet' only stores **unique values**, so any duplicate characters will be **automatically removed**.
//		   HashSet<Character> hs=new HashSet<Character>();
		   
		// LinkedHashSet preserves the insertion order
		   LinkedHashSet<Character> hs = new LinkedHashSet<Character>(); 
		   for(char b:ch){
		       
		       hs.add(b);
		   }
		   System.out.println("Original: " + a);
//		   System.out.print("After removing duplicate character: " + hs); //it will give the output in array format [p, r, o, g, a, m, i, n]
		   System.out.print("After removing duplicate character: ");
		   for(char c:hs){
		       System.out.print(c); // prints all unique characters in order
		   }

	}
}
