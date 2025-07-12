package week1.day2.assgnmts;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 1551;
		int original= input;
		int output=0;
		while(input>0) {
			int rem= input%10;
			output=(output*10)+rem;
			input=input/10;
			
		}
		if(output==original) {
			System.out.println("The given input is a Palindrome Number");
		}
		else {
			System.out.println("The give input is not a Palindrome Number");
		}
	}

}
