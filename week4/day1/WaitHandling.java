package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Set ChromeOptions to open in guest mode (optional)
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");

		// Initialize ChromeDriver with options
		ChromeDriver driver = new ChromeDriver(opt);

		// Load the target URL
		driver.get("https://www.leafground.com/window.xhtml");

		// Maximize the browser window
		driver.manage().window().maximize();
		
		 driver.findElement(By.xpath("//span[text()='Open with delay']")).click();

	        // wait for second window
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.numberOfWindowsToBe(3));

	        System.out.println("New window opened successfully.");
	    
	
	}

}
