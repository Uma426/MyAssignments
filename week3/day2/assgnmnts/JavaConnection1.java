package week3.day2.assgnmnts;

public class JavaConnection1 extends MySqlConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection1 java1 = new JavaConnection1();
		java1.connect();
		java1.executeQuery();
		java1.executeUpdate();
		java1.disconnect();
		

	}
	
	public void executeQuery() {
		super.executeQuery();
		System.out.println("Query executed inside the Java Connection 1");
	}


	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connection established for the Java1 DB");
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Connection disconnected for the Java1 DB");
		
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Executed update for the Java1 DB");
		
	}

}
