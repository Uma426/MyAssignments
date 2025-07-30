package week4.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class MergeLead {

    @Test
    public void mergeLead() throws InterruptedException {

        // Set Chrome Options
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("guest");

        // Initialize ChromeDriver with options
        ChromeDriver driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.get("http://leaftaps.com/opentaps/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Login
        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Merge Leads")).click();

        // First Lookup
        driver.findElement(By.xpath("//img[@alt='Lookup']")).click();

        // Wait until new window opens
        Set<String> allWindows = driver.getWindowHandles();
        while (allWindows.size() == 1) {
            Thread.sleep(500);
            allWindows = driver.getWindowHandles();
        }

        List<String> allhandles = new ArrayList<>(allWindows);
        driver.switchTo().window(allhandles.get(1));
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("arjun");
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        Thread.sleep(1000);
        String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
        driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
        driver.switchTo().window(allhandles.get(0));

        // Second Lookup
        driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();

        // Wait until new window opens
        Set<String> allWindows2 = driver.getWindowHandles();
        while (allWindows2.size() <= 1) {
            Thread.sleep(500);
            allWindows2 = driver.getWindowHandles();
        }

        List<String> allhandles2 = new ArrayList<>(allWindows2);
        driver.switchTo().window(allhandles2.get(1));
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("babu");
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
        driver.switchTo().window(allhandles2.get(0));

        // Merge
        driver.findElement(By.xpath("//a[text()='Merge']")).click();
        driver.switchTo().alert().accept();

        // Verify merge
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        String text = driver.findElement(By.className("x-paging-info")).getText();

        if (text.equals("No records to display")) {
            System.out.println("Text matched");
        } else {
            System.out.println("Text not matched");
        }

        // Close browser
        driver.quit();
    }
}
