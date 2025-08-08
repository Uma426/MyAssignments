package testNg.staticParameterization;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CreateAccount extends BaseClass {

	@Test
    public void createAccount() throws InterruptedException {
        
    
        driver.findElement(By.xpath("//a[@title='New']")).click();
        Thread.sleep(5000);
        String accountName = "Uma";
        
        driver.findElement(By.xpath("//label[text()='Account Name']/following::input")).sendKeys(accountName);
        WebElement ownershipDD = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
        driver.executeScript("arguments[0].click()",ownershipDD);
       
        driver.findElement(By.xpath("//span[@title='Public']")).click();
        //driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='public']")).click();
        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
        String toastMessage = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
        System.out.println(toastMessage);
        Assert.assertTrue(toastMessage.contains(accountName),"Verify the Account name");
    }

}
