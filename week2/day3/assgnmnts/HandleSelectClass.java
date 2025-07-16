package week2.day3.assgnmnts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleSelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");

		// Launch Edge Browser
		ChromeDriver driver = new ChromeDriver(opt);
		// ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Uma");
		driver.findElement(By.name("lastname")).sendKeys("Rajan");
		// Handling dropdown
		// Step1: Find the element
		WebElement source1 = driver.findElement(By.id("day"));

		// Step2: Create an Object for Select Class
		Select option1 = new Select(source1);

		// Step3: Use the method to select to Select the value
		//option1.selectByIndex(17);
		// option1.selectByVisibleText("17");
		option1.selectByValue("17");
		WebElement source2 = driver.findElement(By.id("month"));

		// Step2: Create an Object for Select Class
		Select option2 = new Select(source2);

		// Step3: Use the method to select to Select the value
		//option2.selectByVisibleText("Jan");
		option2.selectByValue("Jan");

		WebElement source3 = driver.findElement(By.id("year"));

		// Step2: Create an Object for Select Class
		Select option3 = new Select(source3);

		// Step3: Use the method to select to Select the value
		option3.selectByValue("1998");

		// Select the gender
		// handling radiobutton
		WebElement genderRadio = driver.findElement(By.xpath("//input[@name='sex' and @value='1']"));
		genderRadio.click();
		driver.findElement(By.name("reg_email__")).sendKeys("umarajan123@gmail.com");

		driver.findElement(By.id("password_step_input")).sendKeys("Uma@123pass");
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 * 
		 * // Wait until the Female radio button is clickable WebElement femaleRadio =
		 * wait.until(ExpectedConditions.elementToBeClickable(
		 * By.xpath("//input[@name='sex' and @value='1']")));
		 * 
		 * // Click it femaleRadio.click();
		 */

		// WebElement genderRadio =
		// driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input"));
		// genderRadio.click();
		//driver.findElement(By.name("websubmit")).click();

	}

}
