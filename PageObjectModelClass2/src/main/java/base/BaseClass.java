package base;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import Utils.ExcelDataRead;

public class BaseClass {

	public ChromeOptions options;
	public ChromeDriver driver;
	public String filename;
	

	@BeforeMethod
	public void preConditions() {
		 options = new ChromeOptions();
			options.addArguments("guest");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
		//driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void postConditions() {
		driver.close();

	}
	
	@DataProvider(name="fetchData")
	public String[][] setData() throws IOException{
		String[][] readData= ExcelDataRead.readData(filename);
		return readData;
		
	}

}
