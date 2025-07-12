package week1.day2.assgnmts;

public class FindOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int maxRange=10;
		System.out.println("The odd numbers are: ");
		for(int i=1;i<=maxRange;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}

	}

}
