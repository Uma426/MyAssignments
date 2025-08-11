package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class CreateAccount extends BaseClass {

	public CreateAccount enterAccountName() {
		driver.findElement(By.id("accountName")).sendKeys("Uma123");
		return this;
	}

	public CreateAccount enterDescription() {
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		return this;
	}

	public CreateAccount enterNumberOfEmployees() {
		driver.findElement(By.id("numberEmployees")).sendKeys("15");
		return this;
	}

	public CreateAccount enterOfficialSiteName() {
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		return this;

	}

	public ViewAccountsPage clickCreateAccount() {
		driver.findElement(By.className("smallSubmit")).click();
		return new ViewAccountsPage();
	}

}
