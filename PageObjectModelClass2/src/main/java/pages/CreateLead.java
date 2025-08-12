package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateLead extends BaseClass {
	
	public CreateLead(ChromeDriver driver) {
		this.driver=driver;
	}
	

public CreateLead enterCompanyName(String companyName) {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
    return this;
	}

public CreateLead enterFirstName(String firstName) {
	
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	return this;
}

public CreateLead enterLastName(String lastName) {
	
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	return this;
}

public ViewLeadPage clickCreateLead() {
	
	driver.findElement(By.name("submitButton")).click();
	return new ViewLeadPage(driver);
}

	
}
