
package marathon1.july25;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonBags {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:\\TESTING\\Marathon\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		// String text2 = driver.findElement(By.xpath("//h2[text()='Click the button
		// below to continue shopping']")).getText();
		// driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();

		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Bags for boys");
		search.click();

		driver.findElement(By.xpath("(//div[text()='bags for boys'])[1]")).click();

		// driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();

		Thread.sleep(1000);

		String text = driver.findElement(By.xpath("//span[contains(text(),'results for')]")).getText();
		String text2 = driver.findElement(By.xpath("//span[contains(text(),'bags for boys')]")).getText();
		System.out.println("The resulted text is " + text + " " + text2);

		// List<String>check= new ArrayList<String>();
		List<WebElement> check = driver
				.findElements(By.xpath("//ul[@id='filter-p_123']//li[@aria-labelledby='-title']//div"));

		System.out.println(check);

		for (int i = 0; i < 2 && i < check.size(); i++) {
			List<WebElement> check1 = driver
					.findElements(By.xpath("//ul[@id='filter-p_123']//li[@aria-labelledby='-title']//div"));

			check1.get(i).click();
			System.out.println("Product clicked");
			Thread.sleep(1000); // wait for page to refresh
		}
		
		String text5 = driver.findElement(By.xpath("//span[contains(text(),'results for')]")).getText();
		String text6 = driver.findElement(By.xpath("//span[contains(text(),'bags for boys')]")).getText();
		System.out.println("After selecting the 2 products the resulted text is " + text5 + " " + text6);
		WebElement drop = driver.findElement(By.id("a-autoid-0-announce"));
		drop.click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		String text7 = driver.findElement(By.xpath("//span[contains(text(),'results for')]")).getText();
		String text8 = driver.findElement(By.xpath("//span[contains(text(),'bags for boys')]")).getText();
		System.out.println("After sorting the resulted text is " + text7 + " " + text8);
		List<WebElement> product = driver.findElements(By.xpath("//a[@class='a-link-normal s-line-clamp-2 s-line-clamp-3-for-col-12 s-link-style a-text-normal']//span"));
		WebElement webElement = product.get(0);
		String text3 = webElement.getText();
		System.out.println("The product name is "+text3);
		List<WebElement> elements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		WebElement webElement2 = elements.get(0);
		String text4 = webElement2.getText();
		System.out.println("Price is "+text4);
		
		System.out.println("Page Title: " + driver.getTitle());
       // driver.close();

	}

}
