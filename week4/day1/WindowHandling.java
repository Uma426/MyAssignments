package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandling {

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

		driver.findElement(By.xpath("//span[text()='Open']")).click();

		String parentAddr = driver.getWindowHandle();
		System.out.println("The parent window address is "+parentAddr);

		Set<String> allAddr = driver.getWindowHandles();
		System.out.println("Address of all window :"+allAddr);

		List<String> address = new ArrayList<String>(allAddr);

		String childWindowAddr = address.get(1);
		System.out.println("Child window address "+childWindowAddr);

		System.out.println("Title before switching is: " + driver.getTitle());

		driver.switchTo().window(childWindowAddr);

		System.out.println("Title after switching is: " + driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(address.get(0));
		
		System.out.println("Title after switching is: " + driver.getTitle());
		
		driver.quit();

	}

}
