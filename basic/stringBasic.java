package com.java.basic;

public class stringBasic {
	public static void main(String[] args) {
		String a= "my name is Aishwarya";
		System.out.println(a); 

		//Length of the String 
		System.out.println(a.length());
		
		// Convert to Upper case
		System.out.println("Upper case: " + a.toUpperCase());
		
		//Convert to Lower case 
		System.out.println("Lower case: " + a.toLowerCase());
		
		//CharAt This will give the character as specific index
		System.out.println(a.charAt(3));

		String p="hello";
		String q="java";
		
		//Using concat method 
		System.out.println(p.concat(q));
		
		String s= " Hello I love java ";
		System.out.println(s);
		System.out.println(s.trim()); // Trim will remove starting and ending whitespace

		String x = "hello";
		String y = "Hello";

		System.out.println(x.equals(y)); //compares string values
		//compares two strings, ignoring lower case and upper case differences
		System.out.println(x.equalsIgnoreCase(y)); 
		
		String t= "hello java";
		String u= "hello";
		//checks whether a string contains a sequence of characters.
		System.out.println(u.contains(t)); //false, in u the value of t does not contain 
		System.out.println(u.contains("o")); //true, in u we are checking the char "o" is present or not

		System.out.println(t.replace("java", "world"));
		System.out.println(t.replaceAll("a", "q"));

		String d= "I love java";
		System.out.println(d.substring(3)); //will return the value from that index
		System.out.println(d.subSequence(2,6)); //returns a subsequence from the string 
	}

}
