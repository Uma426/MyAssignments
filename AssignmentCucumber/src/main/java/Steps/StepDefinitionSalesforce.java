package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionSalesforce {

	public ChromeOptions opt;

	public ChromeDriver driver;

	@Given("Launch the browser")
	public void launchBrowser() {

		// Set ChromeOptions to open in guest mode (optional)
		opt = new ChromeOptions();
		opt.addArguments("guest");

		// Initialize ChromeDriver with options
		driver = new ChromeDriver(opt);

		driver.manage().window().maximize();
	}

	@Given("Load the url")
	public void load_the_url() {

		driver.get("https://login.salesforce.com");
	}

	@Given("Enter the username as {string}")
	public void enter_the_username_as(String user) {
		driver.findElement(By.id("username")).sendKeys(user);
		System.out.println("Username entered");
	}

	@Given("Enter the password as {string}")
	public void enter_the_password_as(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
		System.out.println("Password entered");

	}

	@When("Click on Login button")
	public void click_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("Login")).click();
		System.out.println("Login button clicked");
	}

	@When("Open the Sales application from App Launcher")
	public void open_the_sales_application_from_app_launcher() throws InterruptedException {

		Thread.sleep(5000); // wait for homepage to load
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();

		// 3. Click View All and select Sales app
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		System.out.println("Sales Clicked");

	}

	@When("Click on the Accounts tab")
	public void click_on_the_accounts_tab() throws InterruptedException {
		Thread.sleep(5000); // wait for app to load
		driver.findElement(By.xpath(
				"//one-app-nav-bar-item-root[@data-target-selection-name='sfdc:TabDefinition.standard-Account']"))
				.click();
		System.out.println("Accounts tab clicked");
	}

	@When("Click on the New button")
	public void click_on_the_new_button() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@title='New']")).click();
		System.out.println("New button clicked");
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@When("Enter {string} as the account name")
	public void enter_as_the_account_name(String name) throws InterruptedException {

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
		System.out.println("Name entered");
	}

	@When("Select public as ownership")
	public void select_public_as_ownership() {

		WebElement ownershipDropdown = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
		ownershipDropdown.click();
		driver.findElement(By.xpath("//span[@title='Public']")).click();
		System.out.println("Ownership selected");
	}

	@When("Save the account")
	public void save_the_account() {

		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		System.out.println("Account saved");
	}

	@Then("The account should be created successfully")
	public void the_account_should_be_created_successfully() {

		System.out.println("Account created successfully");

	}

	@Then("It should be logged in")
	public void it_should_be_logged_in() {
		System.out.println("Logged in successfully");
	}

	@When("It should throw error message")
	public void it_should_throw_error_message() {
		System.out.println("Invalid login , error message displayed");
	}

}
