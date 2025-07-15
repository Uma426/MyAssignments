package week2.day2.assgnmts;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Assignment Details:
		/*
		 * Reverse the odd position words from a String with the input: String test =
		 * "I am a software tester"; Expected output: “I ma a erawtfos tester”
		 * Assignment Requirements: - Split the words and have it in an array - Traverse
		 * through each word using loop - Find the odd index within the loop - Convert
		 * the String array into a character array - Print the even position words using
		 * another loop Hints to Solve: - Print the even position words in reverse order
		 * using nested loop - Convert words to character array if the position is odd
		 * else print the word as it is (concatenate space at the end).
		 */

		String test = "I am a software tester.";

		String[] arr = test.split("\\s");

		String result = "";

		for (int i = 0; i < arr.length; i++) {

			if (i % 2 == 0)
				// System.out.println(arr[i]);
				result += arr[i] + " ";

			if (i % 2 != 0) {
				String reversed = "";
				char[] ch = arr[i].toCharArray();
				for (int j = ch.length - 1; j >= 0; j--) {
					reversed += ch[j];
				}
				result += reversed + " ";
				// System.out.println(reversed);
			}

		}
		System.out.println(result.trim());
	}
}
