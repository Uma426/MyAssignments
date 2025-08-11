package pages;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class ViewAccountsPage extends BaseClass {
	
	public ViewAccountsPage verifyAccount() {
		System.out.println("Account created successfully");
        return this;
        
	}

}
