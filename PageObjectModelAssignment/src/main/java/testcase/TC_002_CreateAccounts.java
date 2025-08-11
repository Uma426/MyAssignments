package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_002_CreateAccounts extends BaseClass {

	@Test
	public void createAccount() {
		LoginPage lp=new LoginPage();
        lp.enterUsername()
        .enterPassword()
        .clickLoginButton()
        .clikCrmsfa()
        .clickAccountsLink()
        .clickCreateAccountLink()
        .enterAccountName()
        .enterDescription()
        .enterNumberOfEmployees()
        .enterOfficialSiteName()
        .clickCreateAccount()
        .verifyAccount();
      
	}
	
}
