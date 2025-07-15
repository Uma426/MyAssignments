package week2.day2.assgnmts;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Assignment Details: Remove the duplicate words from a String with the input:
		 * String text = “We learn Java basics as part of java sessions in java week1”;
		 * Expected output: “We learn Java basics as part of sessions in week1”
		 * Assignment Requirements: - Initialize a variable ‘count’ to keep track of the
		 * number of duplicate words found - Split the text into an array of words using
		 * space as the delimiter - Create two nested for loops to compare each word
		 * with every other word in the String array. - If a duplicate word is found, it
		 * is replaced with an empty string and the count is incremented. - After
		 * comparing all words, if the count is greater than 1 (indicating at least one
		 * duplicate was found), it prints the modified words array where duplicates
		 * have been replaced with empty strings. Hints to Solve: - If the count is
		 * greater than 1, use another for loop to print the modified String array where
		 * duplicates have been replace with empty strings. - Use the appropriate method
		 * for case-insensitive string comparisons.
		 */

		String text = "We learn Java basics as part of java sessions in java week1.";
		int count = 0;
		String result = "";
		String[] word = text.split(" ");
//		System.out.println(word[4]);
		for (int i = 0; i < word.length; i++) {
			for (int j = i + 1; j < word.length; j++) {
				if (word[i].equalsIgnoreCase(word[j])) {
					word[j] = "";
					count++;
				}

			}
		}
		if (count > 0) {
			System.out.println("Modified string without duplicates:");
			for (int k = 0; k < word.length; k++) {
				if (word[k] != "") {

					result += word[k] + " ";
				}
			}
			System.out.println(result);
		} else {
			System.out.println("No duplicates found.");
		}

	}
}
