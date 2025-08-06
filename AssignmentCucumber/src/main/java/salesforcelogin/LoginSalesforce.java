package salesforcelogin;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
//import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class LoginSalesforce {
    public static void main(String[] args) throws InterruptedException {
    	
    	// Set ChromeOptions to open in guest mode (optional)
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("guest");

        // Initialize ChromeDriver with options
        ChromeDriver driver = new ChromeDriver(opt);

		//driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       

            // 1. Login to Salesforce
            driver.get("https://login.salesforce.com");
            driver.findElement(By.id("username")).sendKeys("umarajan2124152@agentforce.com"); // Replace with your username
            driver.findElement(By.id("password")).sendKeys("Uma@testleaf26");          // Replace with your password
            driver.findElement(By.id("Login")).click();

            // 2. Open App Launcher (waffle icon)
            Thread.sleep(5000); // wait for homepage to load
            driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();

            // 3. Click View All and select Sales app
            Thread.sleep(5000);
            driver.findElement(By.xpath("//button[text()='View All']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//p[text()='Sales']")).click();

            // 4. Click on Accounts tab
            Thread.sleep(5000); // wait for app to load
             driver.findElement(By.xpath("//one-app-nav-bar-item-root[@data-target-selection-name='sfdc:TabDefinition.standard-Account']")).click();
          //  accountsTab.click();
         // //5. Click on New button
            Thread.sleep(5000);
            driver.findElement(By.xpath("//div[@title='New']")).click();
           // newButton.click();

            // 6. Enter name in Account Name field
            Thread.sleep(3000);
            String myName = "Rajan";
            driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(myName);

            // 7. Select Ownership = Public
            WebElement ownershipDropdown = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
            ownershipDropdown.click();
            driver.findElement(By.xpath("//span[@title='Public']")).click();

            // 8. Click Save
            driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();

            // 9. Verify Account Name
            Thread.sleep(3000);
            WebElement accountHeader = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']"));
            Assert.assertEquals(accountHeader.getText(), myName);

            System.out.println("Account created successfully with name: " + myName);
        
            Thread.sleep(5000);
            driver.quit();
        
}
}
