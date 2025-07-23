package week3.day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Assignment Details: - Writing a Java program that takes a string as input and
		 * prints only the unique characters from that String using the Set interface
		 * and its implementation class. - Given the String companyName = "google"`, the
		 * program should print: "gole" Assignment Requirements: - You are provided with
		 * a string variable: companyName = "google" - Create a Set to store unique
		 * characters. - Iterate through each character in the companyName string. - Add
		 * each character into the Set. - Print the unique characters from the string.
		 * Hints to Solve: - Initialize a Set of type Character to store unique
		 * characters. - Loop through each character in the input string. - Use
		 * appropriate method to add characters to the Set. - To get the required output
		 * use the correct implementation class.
		 */

		String companyName = "google";
		System.out.println("The given string is " + companyName);
		char[] ch = companyName.toCharArray();
		Set<Character> unique = new LinkedHashSet<Character>();
		for (char i : ch) {
			unique.add(i);
		}
		System.out.println("The unique characters in the string are " + unique);

	}

}
