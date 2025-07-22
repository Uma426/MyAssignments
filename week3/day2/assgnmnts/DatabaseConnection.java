package week3.day2.assgnmnts;

public interface DatabaseConnection {

	public abstract void connect();

	public abstract void disconnect();

	public abstract void executeUpdate();

}
