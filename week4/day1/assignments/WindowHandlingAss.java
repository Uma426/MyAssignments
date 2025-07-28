package week4.day1.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandlingAss {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("guest");
        ChromeDriver driver = new ChromeDriver(opt);

        driver.get("http://leaftaps.com/opentaps/control/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();

        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.xpath("//a[text()='Contacts']")).click();
        driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();

        // Click From Contact
        driver.findElement(By.xpath("//a[contains(@href,'partyIdFrom')]")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        Set<String> fromWindows = driver.getWindowHandles();
        List<String> fromList = new ArrayList<>(fromWindows);
        driver.switchTo().window(fromList.get(1));

        WebElement fromContact = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]//a"));
        String fromText = fromContact.getText();
        System.out.println("Selected From Contact: " + fromText);
        fromContact.click();

        driver.switchTo().window(fromList.get(0));

        // Click To Contact
        driver.findElement(By.xpath("//a[contains(@href,'partyIdTo')]")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        Set<String> toWindows = driver.getWindowHandles();
        List<String> toList = new ArrayList<>(toWindows);
        driver.switchTo().window(toList.get(1));

        WebElement toContact = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]//a"));
        String toText = toContact.getText();
        System.out.println("Selected To Contact: " + toText);
        toContact.click();

        driver.switchTo().window(toList.get(0));

        WebElement mergeButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Merge']")));
        mergeButton.click();
        

        // Accept alert
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert: " + alert.getText());
        alert.accept();

        // Confirm title
        String finalTitle = driver.getTitle();
        System.out.println("Final Page Title: " + finalTitle);

       driver.quit();
    }
}
