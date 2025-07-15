package week2.day2.assgnmts;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Assignment Details: - An anagram is a word or phrase formed by rearranging
		 * the letters of another word or phrase, typically using all the original
		 * letters exactly once. - Input two strings: text1 = “stops”; text2 = “potss”
		 * Requirements: - Define two input strings. - Check if the lengths of the two
		 * strings are equal: - If equal, continue; otherwise, print
		 * "Lengths mismatch, therefore the strings are not an Anagram" and exit. -
		 * Convert both the strings to character arrays - Sort both the character arrays
		 * - Check if the sorted arrays are equal - If equal, print
		 * "The given strings are Anagram." - Otherwise, print
		 * "The given strings are not an Anagram." Hints to solve: - Use appropriate
		 * method to sort the arrays - Use appropriate method from Arrays class to
		 * compare both the values
		 */

		String text1 = "stops";
		String text2 = "potss";
		int len1 = text1.length();
		int len2 = text2.length();
		if (len1 == len2) {
			char[] ch1 = text1.toCharArray();
			char[] ch2 = text2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if (Arrays.equals(ch1, ch2)) {
				System.out.println("The given strings are Anagram.");
			} else {
				System.out.println("The given strings are not an Anagram");
			}
		}

		else {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
	}
}
