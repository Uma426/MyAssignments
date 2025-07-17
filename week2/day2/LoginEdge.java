package week2.day2;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.WebDriver;


public class LoginEdge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\TESTING\\LearnSelenium\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

}
