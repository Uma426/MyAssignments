package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead extends BaseClass  {
	
	@DataProvider (name = "fetchData")
	public String[][] setData() {
	String[][] data = new String[2][3];
	data[0][0] = "CTS";
	data[0][1] = "Uma";
	data[0][2] = "Rajan";
	data[1][0] = "Neovia";
	data[1][1] = "Prashanth";
	data[1][2] = "A";
	return data;
	}
	
	@Test(dataProvider = "fetchData")
	public void createLead(String companyName, String firstName, String lastName) {
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys (firstName);
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	driver.findElement(By.name("submitButton")).click();
}
}






