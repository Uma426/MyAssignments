package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateAccount extends BaseClass {
	
	public CreateAccount(ChromeDriver driver) {
		this.driver=driver;
	}
	

	public CreateAccount enterAccountName(String accountName) {
		driver.findElement(By.id("accountName")).sendKeys(accountName);
		return this;
	}

	public CreateAccount enterDescription(String description) {
		driver.findElement(By.name("description")).sendKeys(description);
		return this;
	}

	public CreateAccount enterNumberOfEmployees(String numberEmployees ) {
		driver.findElement(By.id("numberEmployees")).sendKeys(numberEmployees);
		return this;
	}

	public CreateAccount enterOfficialSiteName(String officeSiteName) {
		driver.findElement(By.id("officeSiteName")).sendKeys(officeSiteName);
		return this;

	}

	public ViewAccountsPage clickCreateAccount() {
		driver.findElement(By.className("smallSubmit")).click();
		return new ViewAccountsPage(driver);
	}

}
