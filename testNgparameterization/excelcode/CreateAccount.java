package testNgparameterization.excelcode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class CreateAccount extends BaseClass {
	
	public static String createdAccountName;
	
/*	@BeforeTest
	public void setValues() {
		filename="Accounts";

	}*/

	 

	@Test(dataProvider = "fetchData")
    public void createAccount(String name) throws InterruptedException {
        
		createdAccountName = name;
        Thread.sleep(5000); // wait for homepage to load
        driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
        Thread.sleep(5000);
       // driver.findElement(By.className("slds-icon- waffle")).click();
        driver.findElement(By.xpath("//button[text()='View All']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//p[text()='Sales']/ancestor::a")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//one-app-nav-bar-item-root[@data-target-selection-name='sfdc:TabDefinition.standard-Account']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@title='New']")).click();
        Thread.sleep(5000);
       // String accountName = "Uma";
        
        driver.findElement(By.xpath("//label[text()='Account Name']/following::input")).sendKeys(name);
        WebElement ownershipDD = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
        driver.executeScript("arguments[0].click()",ownershipDD);
       
        driver.findElement(By.xpath("//span[@title='Public']")).click();
        //driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='public']")).click();
        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
        String toastMessage = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
        System.out.println(toastMessage);
        Assert.assertTrue(toastMessage.contains(name),"Verify the Account name");
    }

}
