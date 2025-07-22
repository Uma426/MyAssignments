package week3.day2.assgnmnts;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Assignment Requirements: - Declare an array for {3, 2, 11, 4, 6, 7} - Declare
		 * another array for {1, 2, 8, 4, 9, 7} - Compare both the arrays - Print the
		 * values if they are equal Hints to Solve: - Add array elements to a list -
		 * Iterate the values through the length of the list - Use an appropriate
		 * conditional statement to compare the values
		 */

		
		int[] arr1 = { 3, 2, 11, 4, 6, 7 };
		int[] arr2 = { 1, 2, 8, 4, 9, 7 };

		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();

		for (int j = 0; j < arr1.length; j++) {
			l1.add(arr1[j]);
		}
		System.out.println("The List1 is "+l1);
		
		for (int k = 0; k < arr1.length; k++) {
			l2.add(arr2[k]);
		}

		System.out.println("The List2 is "+l2);
		System.out.println();
		System.out.println("The elements in common for both the given arrays are,");
		
        List <Integer> l3= new ArrayList<Integer>();
        
		for (int i = 0; i < l1.size(); i++) {
			if (l2.contains(l1.get(i))) {
				l3.add(l1.get(i));
				System.out.println(l1.get(i));
			}
			}
		System.out.println("The common elements list is "+l3);
	}

}
