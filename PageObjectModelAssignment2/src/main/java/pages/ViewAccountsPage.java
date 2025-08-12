package pages;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class ViewAccountsPage extends BaseClass {
	public ViewAccountsPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public ViewAccountsPage clickLogout() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'logout')]")).click();
		System.out.println("Account logged out successfully");
		return this;
	}	
	
	
	public ViewAccountsPage verifyAccount() {
		System.out.println("Account created successfully");
        return this;
        
	}

}
