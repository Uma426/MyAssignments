package week2.day4.assgnmnts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLeads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * - Enter the Username as "DemoSalesManager" and the Password as "crmsfa". -
		 * Click on the Login Button. - Click on the CRM/SFA Link. - Click on the Leads
		 * Button. - Click on Create Lead. - Enter the CompanyName Field Using Xpath. -
		 * Enter the FirstName Field Using Xpath. - Enter the LastName Field Using
		 * Xpath. - Enter the FirstName (Local) Field Using Xpath. - Enter the
		 * Department Field Using any Locator of Your Choice. - Enter the Description
		 * Field Using any Locator of your choice. - Enter your email in the E-mail
		 * address Field using the locator of your choice. - Select State/Province as
		 * NewYork Using Visible Text. - Click on the Create Button. - Click on the edit
		 * button. - Clear the Description Field. - Fill the Important Note Field with
		 * Any text. - Click on the update button. - Get the Title of the Resulting
		 * Page. - Close the browser window.
		 */

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");

		// Launch Edge Browser
		ChromeDriver driver = new ChromeDriver(opt);
		// ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		// Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click on the Login button
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on the CRMSFA link
		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Create Lead")).click();

		WebElement company = driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']"));
		company.sendKeys("TestLeaf");

		WebElement fname = driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
		fname.sendKeys("Uma");

		WebElement lname = driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']"));
		lname.sendKeys("Makeswari N");

		WebElement fnameLocal = driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']"));
		fnameLocal.sendKeys("Uma");

		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Testing");

		WebElement des = driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']"));
		des.sendKeys("Selenium Automation Tester");

		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("umarajan124@gmail.com");

		WebElement country = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));

		Select opt1 = new Select(country);
		opt1.selectByVisibleText("New York");

		driver.findElement(By.name("submitButton")).click();

		driver.findElement(By.xpath("//a[text()='Edit']")).click();

		driver.findElement(By.name("description")).clear();

		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']"))
				.sendKeys("Selenium Tester Course");

		driver.findElement(By.name("submitButton")).click();

		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);

		driver.close();

	}

}
