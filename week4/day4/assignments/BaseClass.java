package week4.day4.assignments;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;



public class BaseClass {
	
	public ChromeOptions options;
	
	public ChromeDriver driver;
	
	//public String filename;
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void PreConditions(String url,String username,String password) {
    options = new ChromeOptions();
	options.addArguments("guest");
	driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get(url);
     driver.findElement(By.id("username")).sendKeys(username); // Replace with your username
     driver.findElement(By.id("password")).sendKeys(password);          // Replace with your password
     driver.findElement(By.id("Login")).click();
}
	
	@AfterMethod
	public void PostCoditions() {
		driver.quit();
		

	
    }
	
}
