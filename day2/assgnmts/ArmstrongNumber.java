package week1.day2.assgnmts;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int input= sc.nextInt();
		//int input = 153;
	    sc.close();
		int original= input;
		int output=0;
		while(input>0) {
			int rem= input%10;
			output=output+(rem*rem*rem);
			input=input/10;
			
		}
		if(output==original) {
			System.out.println("The given input is a armstrong Number");
		}
		else {
			System.out.println("The give input is not a armstrong Number");
		}
	}
	

}
