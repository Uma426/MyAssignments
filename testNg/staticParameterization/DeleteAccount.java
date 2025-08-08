package testNg.staticParameterization;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteAccount extends BaseClass {

	@Test(dependsOnMethods = {
		    "textNgMarathon.staticParameterization.CreateAccount.createAccount",
		    "textNgMarathon.staticParameterization.EditAccount.editAccount"
		})
    public void deleteAccount() throws InterruptedException {
       
      
        //driver.executeScript("arguments[0].click()",accountsTab);
      //  Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@placeholder='Search this list...']")).sendKeys("Uma"+ Keys.ENTER);
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
