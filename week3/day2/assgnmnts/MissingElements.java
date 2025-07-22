package week3.day2.assgnmnts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Find the missing element from the list of integers
Assignment Requirements:
- Declare an array {1, 2, 3, 4, 10, 6, 8}.
- Do a comparison check if there is a gap in the sequence of numbers.
- Print the numbers that are missing.
Hints to Solve:
- Arrange the collection in ascending order
- Inside the loop, check the current element + 1 is not equal to the next element. This comparison checks if
there is a gap in the sequence of numbers
- Use the get() method to get an element from the list
- Print the number if a gap is detected. */
		
		int[] arr= {1, 2, 3, 4, 10, 6, 8};
		List<Integer> l1 = new ArrayList<>();

		for (int j = 0; j < arr.length; j++) {
			l1.add(arr[j]);
		}
		System.out.println("The List is "+l1);
		Collections.sort(l1);
		System.out.println("The sorted list is "+l1);
		System.out.println("Missing numbers are:");
		for(int i=0;i<l1.size()-1;i++) {
			if(l1.get(i+1)!= l1.get(i)+1 ){
			
				for(int k=l1.get(i)+1;k<l1.get(i+1);k++){
				System.out.println(k);
			}
		}

	}

		
		}
		}
