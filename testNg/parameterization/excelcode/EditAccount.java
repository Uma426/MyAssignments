package testNg.parameterization.excelcode;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class EditAccount extends BaseClass{
	public static String createdAccountName;
	
	/*@BeforeTest
	public void setValues() {
		filename="Accounts";

	}*/

	@Test(dataProvider = "fetchData")
    public void editAccount(String name) throws InterruptedException {
		
		createdAccountName = name;
       
        Thread.sleep(5000); // wait for homepage to load
        driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
        Thread.sleep(5000);
        //driver.findElement(By.className("slds-icon- waffle")).click();
        driver.findElement(By.xpath("//button[text()='View All']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//p[text()='Sales']/ancestor::a")).click();
        Thread.sleep(5000);
        //WebElement accountsTab = driver.findElement(By.xpath("//one-app-nav-bar-item-root[@data-target-selection-name='sfdc:TabDefinition.standard-Account']"));
        driver.findElement(By.xpath("//one-app-nav-bar-item-root[@data-target-selection-name='sfdc:TabDefinition.standard-Account']")).click();
        Thread.sleep(5000);
        //driver.executeScript("arguments[0].click()",accountsTab);
      //  Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@placeholder='Search this list...']")).sendKeys(name+ Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//table/tbody/tr[1]/th[1])//a")).click();
        driver.findElement(By.xpath("//lightning-button-menu[@class='menu-button-item slds-dropdown_actions slds-dropdown-trigger slds-dropdown-trigger_click']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='Edit']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@aria-label='Type']")).click();
       // driver.executeScript("arguments[0].click()",typeDD);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Technology Partner']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@aria-label='Industry']")).click();
        //driver.executeScript("arguments[0].click()",industryDD);
        
        Thread.sleep(5000);
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Healthcare']")).click();
        Thread.sleep(5000);
        WebElement biilingStreet = driver.findElement(By.xpath("//label[text()='Billing Street']/following::textarea"));
        biilingStreet.clear();
        biilingStreet.sendKeys("Testleaf, Wipro street, Tek meadows");
       // Thread.sleep(5000);
        WebElement shippingStreet = driver.findElement(By.xpath("(//label[text()='Shipping Street'])/following::textarea[1]"));
        shippingStreet.clear();
        shippingStreet.sendKeys("Testleaf, Wipro street, Tek meadows");
        //Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@aria-label='Customer Priority']")).click();
        //driver.executeScript("arguments[0].click()",priorityDD);
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Low']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@aria-label='SLA']")).click();
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Silver']")).click();
        Thread.sleep(5000);
        
        WebElement activeDD= driver.findElement(By.xpath("//button[@aria-label='Active']"));
        driver.executeScript("arguments[0].click()",activeDD);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='No']")).click();
        Thread.sleep(5000);
        int randomNum1 = (int)(Math.random()*999999);
        int randomNum2 = (int)(Math.random()*999999);
        String phno = ""+randomNum1+randomNum2;
        phno = phno.substring(0,10);
        System.out.println(phno);
        WebElement phnoField = driver.findElement(By.xpath("//input[@name='Phone']"));
        phnoField.clear();
        phnoField.sendKeys(phno);
        Thread.sleep(5000);
        WebElement upsellOpportunityDD = driver.findElement(By.xpath("//button[@aria-label='Upsell Opportunity']"));
        driver.executeScript("arguments[0].click()",upsellOpportunityDD);
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='No']")).click();
        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
        Thread.sleep(5000);
        String phnoStr = driver.findElement(By.xpath("//table/tbody/tr[1]/td[4]")).getText();
        System.out.println(phnoStr);
        String expected = phno.replaceAll("[^0-9]", "");
        String actual = phnoStr.replaceAll("[^0-9]", "");

        Assert.assertEquals(actual,expected,"verify the mobileNumber");



    }

}
