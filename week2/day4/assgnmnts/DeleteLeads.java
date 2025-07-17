package week2.day4.assgnmnts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLeads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * - Enter the username. - Enter the password. - Click the Login button. - Click
		 * the "crm/sfa" link. - Click the "Leads" link. - Click "Find leads." - Click
		 * on the "Phone" tab. - Enter the phone number. - Click the "Find leads"
		 * button. - Capture the lead ID of the first resulting lead. - Click the first
		 * resulting lead. - Click the "Delete" button. - Click "Find leads" again. -
		 * Enter the captured lead ID. - Click the "Find leads" button. - Verify the
		 * presence of the message "No records to display" in the Lead List. This
		 * message confirms the successful deletion. - Close the browser.
		 */

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");

		// Launch Edge Browser
		ChromeDriver driver = new ChromeDriver(opt);
		// ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		// Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click on the Login button
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on the CRMSFA link
		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();

		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//driver.findElement(By.name("phoneCountryCode")).sendKeys("");
		//driver.findElement(By.name("phoneAreaCode")).sendKeys("");
		driver.findElement(By.name("phoneNumber")).sendKeys("98127");

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		//Wait for results
		Thread.sleep(2000);
		
		WebElement leadId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		String id = leadId.getText();
		System.out.println("The captured lead id is "+id);
		leadId.click();
		
		driver.findElement(By.xpath("//a[text()='Delete']")).click();

		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();

		driver.findElement(By.name("id")).sendKeys(id);

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		// Wait for search results
		Thread.sleep(2000);

		String message = driver.findElement(By.className("x-paging-info")).getText();
		System.out.println(message);
		if (message.equals("No records to display")) {
			System.out.println("Lead id successfully deleted.");
		} else {
			System.out.println("Lead id was NOT deleted.");
		}
  
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);

		driver.close();

	}

}
