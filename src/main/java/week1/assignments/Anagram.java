package week1.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		       //Declare a String 
				String text1 = "stop";
				//Declare another String
				String text2 = "pots";
				
				//build logic to check the given words are anagram or not
				
				/*
				 * Pseudo Code
				 * a) Check length of the strings are same then
				 * b) Convert both Strings in to characters
				 * c) Sort Both the arrays
				 * d) Check both the arrays has same value
				 * 
				 */
				
				int length = text1.length();
				int length2 = text2.length();
				if(length == length2) {
					System.out.println("both the strings are same length");
				}else {
					System.out.println("Strings are not same");
				}
				char[] charArray = text1.toCharArray();
				char[] charArray2 = text2.toCharArray();
				Arrays.sort(charArray);
				Arrays.sort(charArray2);
				//System.out.println(charArray);
				for (int i = 0; i < charArray.length; i++) {
					for (int j = charArray2.length-1; j >=0 ; j--) {
						if (charArray[i] == (charArray2[j])) {
							   System.out.print(charArray[i]);	
							}
					}
				}
				

	}

}
