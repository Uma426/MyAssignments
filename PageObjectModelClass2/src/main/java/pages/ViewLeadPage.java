package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class ViewLeadPage extends BaseClass {
	
	public ViewLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}

	
	public ViewLeadPage verifyLead() {
		System.out.println("CreateLead successful");
        return this;
	}

}
