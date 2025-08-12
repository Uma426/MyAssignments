package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyAccountsPage extends BaseClass {
	
	public MyAccountsPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	
public CreateAccount clickCreateAccountLink() {
	driver.findElement(By.linkText("Create Account")).click();
	return new CreateAccount(driver);
}
}
