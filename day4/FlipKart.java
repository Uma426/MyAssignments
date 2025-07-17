package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlipKart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");

		// Launch Edge Browser
		ChromeDriver driver = new ChromeDriver(opt);
		// ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement m = driver.findElement(By.xpath("//input[@name='q']"));
			//	className("Pke_EE"));
		m.sendKeys("Men's shirt");
		m.submit();
		
		driver.findElement(By.xpath("(//a[contains(text(),'Men')])[2]")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text() ='Casual Shirts']")).click();
		Thread.sleep(1000);
		String title= driver.getTitle();
		System.out.println("The title of the page is "+title);
		//Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[contains(text(),'Men')])[1]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text() ='Formal Shirts']")).click();
		Thread.sleep(1000);
		String title1= driver.getTitle();
		System.out.println("The title1 of the page is "+title1);
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Men')])[1]")).click();
		Thread.sleep(3000);
		String title3= driver.getTitle();
		System.out.println("The title3 of the page is "+title3);
		//Thread.sleep(2000);
		driver.close()
;		
	}

}
