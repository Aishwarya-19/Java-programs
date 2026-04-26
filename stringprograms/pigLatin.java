package com.java.stringprograms;

public class pigLatin {
	public static void main(String[] args) {
		String a = "Spilt".toLowerCase();
		String b="";
		for(int i=0; i<a.length();i++) {
			char ch=a.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				b=a.substring(i)+a.substring(0,i)+"AY";
				System.out.println(b);
				break;
			}
		}
		
	}
}
