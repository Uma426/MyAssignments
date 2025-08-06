package week4.day4.assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StaticParameterization extends BaseClass {
		// TODO Auto-generated method stub
		
		/*- Login to https://login.salesforce.com
- Click on the toggle menu button from the left corner
- Click View All and click Legal Entities from App Launcher
- Click on the Dropdown icon in the legal Entities tab
- Click on New Legal Entity
- Enter the Company name as 'TestLeaf'.
- Enter Description as 'Salesforces'.
- Select Status as 'Active'
- Click on Save
- Verify the Alert message (Complete this field) displayed for Name
Requirements:
- Identify the test steps that need to be parameterized through XML (e.g., URL, username, password).
- In this assignment, you will learn how to parameterize test methods using TestNG by reading parameters from
an XML file. */
		
		// Set ChromeOptions to open in guest mode (optional)
       @Test
		public void salesforceParametrization() throws InterruptedException {
	    	
	    
	       
	            // 2. Open App Launcher (waffle icon)
	            Thread.sleep(5000); // wait for homepage to load
	            driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();

	            // 3. Click View All and select Legal Entities
	            Thread.sleep(5000);
	            driver.findElement(By.xpath("//button[text()='View All']")).click();
	            Thread.sleep(5000);
	            
	            
	            Actions act= new Actions(driver);
	            WebElement scroll = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
	    		act.scrollToElement(scroll).perform();
	    		scroll.click();

	    		System.out.println("Scrolled down , Legal entities clicked");
	    		
	    	//	            driver.findElement(By.xpath("//p[text()='Legal Entities']")).click();

	            // 4. Click on dropdown in legal entities tab
	            Thread.sleep(5000); // wait for app to load
	             driver.findElement(By.xpath("//a[contains(@href,'LegalEntity')]/following-sibling::one-app-nav-bar-item-dropdown")).click();
	             System.out.println("Legal entity dropdown clicked");
	          //  accountsTab.click();
	         // //5. Click on New legal entity button
	            Thread.sleep(5000);
	            driver.findElement(By.xpath("(//one-app-nav-bar-menu-item[@class='slds-dropdown__item'])[1]")).click();
	            System.out.println("New legal entity clicked");
	         //   driver.findElement(By.xpath("//a[contains(@href,'LegalEntity&save')]")).click();
	          
	           // newButton.click();

	            // 6. Enter name in Company Name and legal entity name
	            Thread.sleep(3000);
	          

	            
	            //driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("TestLeafTest");
	          //  System.out.println("Name entered");
	            driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
	            System.out.println("Company Name entered");
	            driver.findElement(By.xpath("(//div[@class='slds-form-element__control slds-grow textarea-container']//textarea)[2]")).sendKeys("Salesforces");
	            System.out.println("Description entered");
	            

	            // 7. Select Ownership = Public
	            WebElement ownershipDropdown = driver.findElement(By.xpath("//button[@aria-label='Status']"));
	            ownershipDropdown.click();
	            driver.findElement(By.xpath("(//span[@class='slds-media__body'])//span[text()='Active']")).click();

	            // 8. Click Save
	            driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();

	            // 9. Verify Account Name
	       /*     Thread.sleep(3000);
	            WebElement accountHeader = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']"));
	            Assert.assertEquals(accountHeader.getText(), myName);

	            System.out.println("Account created successfully with name: " + myName);
	        
	            Thread.sleep(5000);
	            driver.quit();
	            */
	            String text = driver.findElement(By.xpath("//div[@class='fieldLevelErrors']")).getText();

	            
	           // String text = ConfirmAlert.getText();
	            System.out.println("The text in the alert dialog box is "+text);
	            
	            Thread.sleep(2500);
	          //div[@class='fieldLevelErrors']
	            
	          driver.findElement(By.xpath("//button[@title='Close error dialog']"));
	         driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("TestLeafTest");
		          System.out.println("Name entered");
	           driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	           
	           System.out.println("Leagal entity created successfully");
	           
	         

	        
		
		

	}

}
