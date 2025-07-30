package week4.day2.assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonOnePlusAction {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		/*- Initialize ChromeDriver
- Load the URL (https://www.amazon.in/)
- Maximize the browser window
- Add an implicit wait to ensure the webpage elements are fully loaded
Requirements:
1. Load the URL (https://www.amazon.in/)
2. Search for "oneplus 9 pro".
3. Get the price of the first product.
4. Print the number of customer ratings for the first displayed product.
5. Click the first text link of the first image.
6. Take a screenshot of the product displayed.
7. Click the 'Add to Cart' button.
8. Get the cart subtotal and verify if it is correct.
9. Close the browser.
*/
		
		// Set ChromeOptions to open in guest mode (optional)
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("guest");

        // Initialize ChromeDriver with options
        ChromeDriver driver = new ChromeDriver(opt);

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("oneplus 9 pro");
		//search.click();
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		List<WebElement> elements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		WebElement webElement2 = elements.get(0);
		String text4 = webElement2.getText();
		System.out.println("Price of first diplayed product is "+text4);
	       
		String text = driver.findElement(By.xpath("(//span[contains(@class,'s-underline-text')])[1]")).getText();
		System.out.println("The number of customer ratings for the first displayed product is "+text);
		
		WebElement textlink = driver.findElement(By.xpath("(//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal'])[1]"));
		String originalWindow = driver.getWindowHandle();
		textlink.click();
		// Wait for product page to load
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("productTitle")));

		TakesScreenshot tsDriver = new ChromeDriver();
		File src = tsDriver.getScreenshotAs(OutputType.FILE);
		// Take screenshot of the whole product page
		//File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/productPage29.png");
		FileUtils.copyFile(src, dest);

		System.out.println("Screenshot of product page taken.");
		
		driver.findElement(By.id("add-to-cart-button")).click();

		
		System.out.println("Added to cart");
		
		Thread.sleep(1000);
		
		String subTotal = driver.findElement(By.xpath("//h2[@class='a-size-base a-color-price a-text-bold']")).getText();
		
		System.out.println("The cart subtotal is "+subTotal);
		
		int expectedPrice = Integer.parseInt(text4);

		

		// Remove everything except digits and decimal point
		String subTotalClean = subTotal.replaceAll("[^0-9.]", "").trim(); // "299.00"

		// Parse as double first to handle decimals
		double subTotalDouble = Double.parseDouble(subTotalClean);

		// Convert to int (removing decimals)
		int subtotalInt = (int) subTotalDouble;

		// Compare expected and actual subtotal
		if (expectedPrice == subtotalInt) {
		    System.out.println("Subtotal matches expected price: " + expectedPrice);
		} else {
		    System.out.println("Subtotal does NOT match. Expected: " + expectedPrice + ", Actual: " + subtotalInt);
		}
		
		driver.quit();
		
		
	}
	

}
