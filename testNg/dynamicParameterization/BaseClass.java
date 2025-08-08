package testNg.dynamicParameterization;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

//import week5.day2.ExcelDataRead;

public class BaseClass {
	public ChromeOptions options;
	public static ChromeDriver driver;
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void preConditions(String url,String username,String password) {
		
		  options = new ChromeOptions();
	        options.addArguments("--disable-notifications");
	        driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	        driver.get(url);
	        driver.findElement(By.id("username")).sendKeys(username);
	        driver.findElement(By.id("password")).sendKeys(password);
	        driver.findElement(By.id("Login")).click();
	
}
	@AfterMethod
	public void postConditions() {
		driver.close();
	}
	
	@DataProvider(name = "AccountData")
	public Object[][] getData() {
	    return new Object[][] {
	        {"TestUser1"},
	        {"TestUser2"}
	    };
	}
}