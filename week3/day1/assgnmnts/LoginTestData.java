package week3.day1.assgnmnts;

public class LoginTestData extends TestData {
	public void entername(String name) {
		System.out.println("Username : "+name);
	}
	 public void enterPassword(String pass) {
		 System.out.println("Password : "+pass);
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTestData l = new LoginTestData();
		l.enterCredentials();
		l.entername("Uma264");
		l.enterPassword("Uma@123");
		l.navigateToHomePage();
		
		
		
	}

}
