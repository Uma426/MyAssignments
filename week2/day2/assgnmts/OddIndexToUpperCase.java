package week2.day2.assgnmts;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Change the odd index of a given String to uppercase with the input : String
		 * test = “changeme”;
		 * 
		 * Requirements: - Convert the given String to a character array. - Implement a
		 * loop to iterate through each character of the String (from end to start). -
		 * Find the odd index within the loop - Inside the loop, change the character to
		 * uppercase only if the index is odd - Print the characters with the expected
		 * output: cHaNgEmE Hints to solve: - Use appropriate method to convert the
		 * String into a character array. - Use the appropriate operator to get the odd
		 * index - Use toUpperCase() method from the Character class to convert the odd
		 * index values to uppercase Expected Outcome: Upon completion, you should be: -
		 * Understand how to extract the characters from String - Understand the basic
		 * manipulation on String. - Learn about the Character class
		 */

		String test = "changeme";
		char[] ch = test.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (i % 2 != 0) {
				ch[i] = Character.toUpperCase(ch[i]);
			}
		}
		System.out.println("The modified String is:");
		System.out.println(ch);

	}

}
