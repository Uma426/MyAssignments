package week3.day2.assgnmnts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Find the second largest number from the given array Assignment Requirements:
		 * - Declare an array {3, 2, 11, 4, 6, 7}. - Pick the 2nd element from the last
		 * and print it. Hints to Solve: - Arrange the collection in ascending order -
		 * Use the get method to print the second largest number
		 */

		int[] arr1 = { 3, 2, 11, 4, 6, 7 };
		List<Integer> l1 = new ArrayList<Integer>();
		for (int j = 0; j < arr1.length; j++) {
			l1.add(arr1[j]);
		}
		System.out.println("The List1 is " + l1);
		Collections.sort(l1);
		System.out.println("The sorted list is " + l1);
		int num = l1.get(l1.size() - 2);
		System.out.println("The 2nd largest element is " + num);

	}

}
