package week2.day2.assgnmts;

public class CountCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Your task is to count the occurrences of character ‘e’ in the given String
		 * input="TestLeaf". Requirements: - Create a class with a main method. -
		 * Initialize a variable to 0. - Convert the given String to a character array.
		 * - Use loop to iterate through each character in the array. - Compare each
		 * character with the target character. - If a match is found, increment the
		 * count. - Finally, print the count Hints to solve: - Use appropriate method to
		 * convert the String into a character array. - Utilize proper loop to iterate
		 * through the character array. - Use an if condition to compare each character
		 * with the target character and increment the count accordingly. Expected
		 * Outcome: Upon completion, you should be: - Understand how to count the
		 * occurrences of a specific character in a String. - Grasp the fundamental
		 * principles of String manipulation and conditional logic in Java.
		 */

		String input = "TestLeaf";
		char[] in = input.toCharArray();
		int count = 0;
		for (int i = 0; i < in.length; i++) {
			{
				if (in[i] == 'e') {
					count++;
				}
			}

		}
		System.out.println("The occurence of character 'e' in the given string is " + count + ".");
	}

}
