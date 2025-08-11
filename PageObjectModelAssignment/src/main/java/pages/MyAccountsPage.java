package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class MyAccountsPage extends BaseClass {
	
public CreateAccount clickCreateAccountLink() {
	driver.findElement(By.linkText("Create Account")).click();
	return new CreateAccount();
}
}
