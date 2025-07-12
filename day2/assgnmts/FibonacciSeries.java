package week1.day2.assgnmts;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num= 8;
		int n1=0,n2=1,n3;
		 System.out.println("The Fibonacci Series is ");
		System.out.println(n1);
		System.out.println(n2);
		for (int i = 2; i < num; i++) {      
          n3=n1+n2;
          System.out.println(n3);
          n1=n2;
          n2=n3;
		
     
	}

	}
}
