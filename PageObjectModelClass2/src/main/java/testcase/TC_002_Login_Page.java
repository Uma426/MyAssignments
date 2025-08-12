package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_002_Login_Page extends BaseClass {
	
	@BeforeTest
	public void setValues() {
		filename="TC_002_Loginfunctionality";

	}
	
	@Test(dataProvider = "fetchData")
	public void login(String username, String password) {
		LoginPage lp=new LoginPage(driver);
        lp.enterUsername(username)
        .enterPassword(password)
        .clickLoginButton();
}
}
