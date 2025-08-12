package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_002_Logout_Page extends BaseClass{

	@BeforeTest
	public void setValues() {
		filename="TC002_Account_Creation";

	}
	
	@Test(dataProvider = "fetchdata")
	public void logout(String username,String password,String accountName,String description,String numberEmployees,String officeSiteName) throws InterruptedException {
	
		LoginPage lp=new LoginPage(driver);
        lp.enterUsername(username)
        .enterPassword(password)
        .clickLoginButton()
        .clikCrmsfa()
        .clickAccountsLink()
        .clickCreateAccountLink()
        .enterAccountName(accountName)
        .enterDescription(description)
        .enterNumberOfEmployees(numberEmployees)
        .enterOfficialSiteName(officeSiteName)
        .clickCreateAccount()
        .verifyAccount()
        .clickLogout();
	
	}
}
