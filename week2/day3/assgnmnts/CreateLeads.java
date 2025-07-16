package week2.day3.assgnmnts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLeads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt =new ChromeOptions();
		opt.addArguments("guest");
		
		// Launch Edge Browser
		ChromeDriver driver = new ChromeDriver(opt);
		//ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		// Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click on the Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on the CRMSFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		

		//Enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		//Enter the first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Uma");
		
		//Enter the last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Makeswari");
		
		driver.findElement(By.name("generalProfTitle")).sendKeys("QA Software Engineer");
		
		driver.findElement(By.name("submitButton")).click();
	}

}
