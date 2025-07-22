package week3.day2.assgnmnts;

public abstract class MySqlConnection implements DatabaseConnection {
	public void executeQuery() {
		System.out.println("Query executed inside MySqlConnection");
	}

}
