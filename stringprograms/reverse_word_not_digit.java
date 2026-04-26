package com.java.stringprograms;


public class reverse_word_not_digit {
//	public static void main(String[] args) {
//		
//		        String s = "java 456 selenium";
//
//		        String[] words = s.split(" ");
//		        StringBuilder result = new StringBuilder();
//
//		        for (String word : words) {
//		            if (word.matches("[a-zA-Z]+")) {
//		                // Reverse only if the word contains only letters
//		                result.append(new StringBuilder(word).reverse());
//		            } else {
//		                // Leave digits or mixed content as is
//		                result.append(word);
//		            }
//		            result.append(" "); // add space after each word
//		        }
//
//		        // Trim trailing space and print
//		        System.out.println(result.toString().trim());
//		    }
//		}


//public class ReverseOnlyWordsManual {
    public static void main(String[] args) {
        String s = "java 456 selenium";
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.matches("[a-zA-Z]+")) {
                // Reverse manually using loop
                StringBuilder reversedWord = new StringBuilder();
                for (int i = word.length() - 1; i >= 0; i--) {
                    reversedWord.append(word.charAt(i));
                }
                result.append(reversedWord);
            } else {
                // Leave digits or mixed content as is
                result.append(word);
            }
            result.append(" "); // add space after each word
        }

        // Trim the trailing space
        System.out.println(result);
    }
}



