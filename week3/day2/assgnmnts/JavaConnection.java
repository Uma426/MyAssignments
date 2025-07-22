package week3.day2.assgnmnts;

public class JavaConnection implements DatabaseConnection{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		JavaConnection java=new JavaConnection();
		java.connect();
		java.executeUpdate();
		java.disconnect();
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connection established to the Java Database.");
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
	 System.out.println("Disconnected from the Java Database.");
		
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Executed update on the Java Database.");
		
	}

}




