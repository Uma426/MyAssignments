package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_002_Login_Page extends BaseClass {
	@Test
	public void createAccount() {
		LoginPage lp=new LoginPage();
        lp.enterUsername()
        .enterPassword()
        .clickLoginButton();
}
}
