package week4.day2;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollandMousehover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Set ChromeOptions to open in guest mode (optional)
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("guest");

        // Initialize ChromeDriver with options
        ChromeDriver driver = new ChromeDriver(opt);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Step1: create object for actions class 
		Actions act= new Actions(driver);
		
		//Step2 : find element
		
		WebElement element = driver.findElement(By.xpath("//a[@class='nav-a nav-a-2 icp-link-style-2']"));
		
		//step3: perform action with methods
		
		act.moveToElement(element).perform();
		
		System.out.println("Mouse Hovered");
		
		driver.findElement(By.xpath("//span[text()='English']")).click();
		
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		
		System.out.println("Saved changes");
		
		Thread.sleep(1000);
		
		WebElement scroll = driver.findElement(By.linkText("Conditions of Use & Sale"));
		act.scrollToElement(scroll).perform();
		scroll.click();

		System.out.println("Scrolled down");
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		System.out.println("Navigated back to main page");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@id='navBackToTop']")).click(); // Amazon logo
		
		System.out.println("Scrolled up to top of page");
	}

}
