package week3.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ConfirmationDialog {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 // Set ChromeOptions to open in guest mode (optional)
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("guest");

        // Initialize ChromeDriver with options
        ChromeDriver driver = new ChromeDriver(opt);

        // Load the target URL
        driver.get("https://leafground.com/alert.xhtml");

        // Maximize the browser window
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
        
        Alert ConfirmAlert = driver.switchTo().alert();
        
        String text = ConfirmAlert.getText();
        System.out.println("The text in the confirmation alert dialog box is "+text);
        
        Thread.sleep(2500);
        ConfirmAlert.accept();
        
	}

}
