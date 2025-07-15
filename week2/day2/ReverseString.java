package week2.day2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String companyName= "TestLeaf";
		String rev="";
		int n= companyName.length();
		System.out.println("The length of the string is "+n);
		System.out.println("The reverse of the string is:");
		
		for(int i=n-1;i>=0;i--) {
			rev=rev+companyName.charAt(i);
		}
		System.out.println(rev);
		
	}

}
