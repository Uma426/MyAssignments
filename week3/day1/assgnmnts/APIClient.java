package week3.day1.assgnmnts;

public class APIClient {

	public void sendRequest(String endpoint) {
		System.out.println("The endpoint inside version 1 of Method overloading is " + endpoint);

	}

	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {

		System.out.println("The endpoint inside version 2 of Method overloading is " + endpoint);
		System.out.println("The Request Body in version 2 is " + requestBody);
		System.out.println("The Request Status in version 2 is " + requestStatus);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APIClient ap = new APIClient();
		ap.sendRequest("EndPoint1");
		ap.sendRequest("EndPoint2", "RequestBody", true);

	}

}
