package week3.day1.assgnmnts;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// WebElement methods
		System.out.println("Webelement methods execution:");
		WebElement we = new WebElement();

		we.setText("Gender");
		we.click();
		System.out.println();

		// Button methods
		System.out.println("Button methods execution:");
		Button btn = new Button();

		btn.setText("Gender");
		btn.click();
		btn.submit();
		System.out.println();

		// TextField methods
		System.out.println("TextField methods execution:");
		TextField tf = new TextField();

		tf.setText("Female");
		System.out.println(tf.getText());
		tf.click();
		System.out.println();

		// CheckBoxButton methods
		System.out.println("Check Button methods execution:");
		CheckBoxButton cb = new CheckBoxButton();

		cb.clickCheckButton();
		cb.click(); // inherited from WebElement
		cb.submit(); // inherited from Button
		System.out.println();

		// RadioButton methods
		System.out.println("Radio Button methods execution:");
		RadioButton rb = new RadioButton();

		rb.selectRadioButton();
		rb.click(); // inherited from WebElement
		rb.submit(); // inherited from Button
		System.out.println();
	}

}
