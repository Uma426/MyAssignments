package week2.day1.ass1;

import java.util.Arrays;

public class PrintDuplicates {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num={2, 5, 7, 7, 5, 9, 2, 3};
		int len= num.length;
		System.out.println("The Length of the array is "+len);
		Arrays.sort(num);
		System.out.println("The sorted array is:");
		for(int j=0;j<len;j++) {
		System.out.println(num[j]);}
		System.out.println("The duplicate numbers in the array are :");
		for(int i=0;i<len-1;i++) {
			if(num[i]==num[i+1]) {
			System.out.println(num[i]);
			} 
			
		}
		

	}

}
