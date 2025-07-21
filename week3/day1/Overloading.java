package week3.day1;

public class Overloading {
	
	public void reportStep(String msg , String status){
		System.out.println("Method Overloading with 2 params");
		System.out.println("The message is "+msg);
		System.out.println("The staus is "+status);
	}
	
	public void reportStep(String msg , String status, boolean snap){
		System.out.println("Method Overloading with 3 params");
		System.out.println("The message is "+msg);
		System.out.println("The staus is "+status);
		System.out.println("The snap is present or not - "+snap);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Create a Java class.
- Inside this class, define the reportStep method with multiple overloaded versions:
- One version should accept two input arguments: a String for the message (msg) and another String for
the status (status).
- Another version of the reportStep method should accept three input arguments: a String for the message
(msg), a
String for the status (status), and a boolean parameter (snap) to indicate whether to take a snapshot.
- Create a main method to demonstrate the usage of the overloaded reportStep method.
- Call both versions of the report*/
		
		Overloading ovr= new Overloading();
		ovr.reportStep("test1", "pass");
		System.out.println();
		ovr.reportStep("test2", "passed",true);
		

	}

}
