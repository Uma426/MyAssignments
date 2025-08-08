package textNgMarathon.staticParameterization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	public ChromeOptions options;
	public static ChromeDriver driver;
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void preConditions(String url,String username,String password) throws InterruptedException {
		
		  options = new ChromeOptions();
	        options.addArguments("--disable-notifications");
	        driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	        driver.get(url);
	        driver.findElement(By.id("username")).sendKeys(username);
	        driver.findElement(By.id("password")).sendKeys(password);
	        driver.findElement(By.id("Login")).click();
	        Thread.sleep(5000); // wait for homepage to load
	        driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	        Thread.sleep(5000);
	        //driver.findElement(By.className("slds-icon- waffle")).click();
	        driver.findElement(By.xpath("//button[text()='View All']")).click();
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//p[text()='Sales']/ancestor::a")).click();
	        Thread.sleep(5000);
	        //WebElement accountsTab = driver.findElement(By.xpath("//one-app-nav-bar-item-root[@data-target-selection-name='sfdc:TabDefinition.standard-Account']"));
	        driver.findElement(By.xpath("//one-app-nav-bar-item-root[@data-target-selection-name='sfdc:TabDefinition.standard-Account']")).click();
	        Thread.sleep(5000);
	
}
	@AfterMethod
	public void postConditions() {
		driver.close();
	}
}