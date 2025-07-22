package week3.day2.assgnmnts;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LowestMobile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * Assignment Details: Find the lowest mobile phone price from amazon using list
		 * interface Assignment Requirements: - Navigate to amazon.in - Search phones in
		 * the search field - Find the lowest price from the list of phones Hints to
		 * Solve: - Write common locator / xpath matching all the phone price in the
		 * page and get into List<Element> - Get the values in a list and sort the
		 * values in ascending order - Get the first item from the sorted list which is
		 * the least price
		 */

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");

		// Launch Edge Browser
		ChromeDriver driver = new ChromeDriver(opt);
		// ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement m = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		// className("Pke_EE"));
		m.sendKeys("phones");
		m.submit();
		Thread.sleep(3000);

		List<WebElement> pricelist = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		System.out.println(pricelist);
		
		int number = pricelist.size();
		System.out.println("The size of the list is: " + number);

		// Declare the String List
		List<Integer> allPrices = new ArrayList<Integer>();

		for (int i = 0; i < number; i++) {
			String text = pricelist.get(i).getText().replace(",", "");

			if (!text.isEmpty()) {

				allPrices.add(Integer.parseInt(text));
			}

		}
		System.out.println(allPrices);
		 if (!allPrices.isEmpty()) {
	            Collections.sort(allPrices);
	            int lowestPrice = allPrices.get(0);
	            System.out.println("The lowest mobile price is: ₹" + lowestPrice);
	        }
		

	}

}
