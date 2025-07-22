package week3.day2.assgnmnts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseStringElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Assignment Requirements:
Declare a String array and add the values as {HCL, Wipro, Aspire Systems, CTS}
Add the collection to a list
Iterate the values in the list
Print the required output as Wipro, HCL, CTS, Aspire Systems
Hints to Solve:
- Arrange the collection in ascending order
- Use reverse loop to iterate the collection*/
		
		String[] arr1={"HCL", "Wipro", "Aspire Systems", "CTS"};
		List<String> companyList = Arrays.asList(arr1);
		System.out.println("The list :");
		System.out.println(companyList);
		System.out.println();
		Collections.sort(companyList);
		System.out.println("After sorting:");
		System.out.println(companyList);
		System.out.println();
		System.out.println("Iteration via printing desired o/p");
		for (int i = companyList.size() - 1; i >= 0; i--) {
            System.out.println(companyList.get(i));
        }
		System.out.println();
		System.out.println("Sorting  via printing desired o/p- After sorting in reverse order:");
        
        Collections.sort(companyList, Collections.reverseOrder());
        
        System.out.println(companyList);
        
		}
	
	}


