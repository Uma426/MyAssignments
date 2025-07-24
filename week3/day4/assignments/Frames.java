package week3.day4.assignments;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frames {

    public static void main(String[] args) throws InterruptedException {
        // Set ChromeOptions to open in guest mode (optional)
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("guest");

        // Initialize ChromeDriver with the given options
        ChromeDriver driver = new ChromeDriver(opt);

        // Load the W3Schools Tryit Editor URL
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Add an implicit wait to allow time for elements to load
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Switch to the iframe that contains the Try It button (index 1)
        driver.switchTo().frame(1);

        // Click the "Try it" button inside the frame
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        System.out.println("Try it button clicked");

        // Switch to the alert that appears after clicking the button
        Alert alert = driver.switchTo().alert();

        // Send input into the prompt box
        alert.sendKeys("Uma");

        // Get and print the alert message text
        String text = alert.getText();
        System.out.println("The text in the alert is " + text);

        // Pause execution for 1 second (just for clarity, can be skipped)
        Thread.sleep(1000);

        // Accept the alert (click OK)
        alert.accept();
        System.out.println("Alert handled");

        // Retrieve the result text displayed after accepting the alert
        String text2 = driver.findElement(By.xpath("//p[@id='demo']")).getText();
        System.out.println(text2);

        // Verify if the entered name is reflected in the result text
        if (text2.contains("Uma")) {
            System.out.println("Verified text.");
        } else {
            System.out.println("Text not verified.");
        }

        // Close the browser
        driver.quit();
    }
}
