package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Set ChromeOptions to open in guest mode (optional)
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("guest");

        // Initialize ChromeDriver with options
        ChromeDriver driver = new ChromeDriver(opt);

        // Load the target URL
        driver.get("https://leafground.com/frame.xhtml");

        // Maximize the browser window
        driver.manage().window().maximize();
        driver.switchTo().frame(2);
        WebElement element = driver.findElement(By.xpath("//iframe[@name='frame2']"));
        driver.switchTo().frame(element);
        //System.out.println("switched");
      WebElement el=   driver.findElement(By.id("Click"));
      el.click();
      String text = el.getText();
      System.out.println("The text is "+text);
     
       
        
      
	}

}
