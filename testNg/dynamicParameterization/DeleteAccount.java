package testNg.dynamicParameterization;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DeleteAccount extends BaseClass {
	
	/*@BeforeTest
	public void setValues() {
		filename="DeleteAccount";

	}*/

	public static String createdAccountName;
	@Test(dataProvider = "AccountData")
    public void deleteAccount(String name) throws InterruptedException {
       
		createdAccountName=name;
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
        //   Thread.sleep(2000);
        String noOfItems = driver.findElement(By.xpath("//span[@aria-label='Recently Viewed']")).getText();
        String[] s = noOfItems.split(" ");
        int countBeforeDelete = Integer.parseInt(s[0]);
        System.out.println(countBeforeDelete);
        driver.findElement(By.xpath("//table/tbody/tr[1]/td[6]")).click();
        driver.findElement(By.xpath("//a[@title='Delete']")).click();
        driver.findElement(By.xpath("//button[@title='Delete']")).click();
        Thread.sleep(2000);
        noOfItems = driver.findElement(By.xpath("//span[@aria-label='Recently Viewed']")).getText();
        System.out.println(noOfItems);
        s = noOfItems.split(" ");
        int countAfterDelete = Integer.parseInt(s[0]);

        Assert.assertTrue(countBeforeDelete==(countAfterDelete+1),"Verify the account has deleted");

    }


}
