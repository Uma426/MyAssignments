package week3.day2;

public class Amazon extends CanaraBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon a = new Amazon();

		a.cashOnDelivery();
		a.upiPayments();
		a.cardPayments();
		a.internetBanking();
		a.recordPaymentDetails();
	}

	@Override
	public void cashOnDelivery() {
		// TODO Auto-generated method stub
		System.out.println("Payment Mode - Cash on Delivery.");

	}

	@Override
	public void upiPayments() {
		// TODO Auto-generated method stub
		System.out.println("Payment Mode - Upi Payments.");

	}

	@Override
	public void cardPayments() {
		// TODO Auto-generated method stub
		System.out.println("Payment Mode - Card payment.");

	}

	@Override
	public void internetBanking() {
		// TODO Auto-generated method stub
		System.out.println("Payment Mode - Internet Banking.");

	}

	@Override
	public void recordPaymentDetails() {
		// TODO Auto-generated method stub
		System.out.println("Payment Details Recorded.");

	}

}
