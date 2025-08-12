package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_001_CreateLead extends BaseClass {

	@BeforeTest
	public void setValues() {
		filename="TC_001_Createlead";

	}
	
	
	@Test(dataProvider = "fetchData")
	public void createLead(String username, String password,String companyName,String firstName,String lastName) {
		LoginPage lp=new LoginPage(driver);
        lp.enterUsername(username)
        .enterPassword(password)
        .clickLoginButton()
        .clikCrmsfa()
        .clickLeadsLink()
        .clickCreateLeadLink()
        .enterCompanyName(companyName)
        .enterFirstName(firstName)
        .enterLastName(lastName)
        .clickCreateLead()
        .verifyLead();
	}
	
}
