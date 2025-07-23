package week3.day3.assgnmnts;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LeafGroundButton {

    public static void main(String[] args) throws InterruptedException {

        // Set ChromeOptions to open in guest mode (optional)
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("guest");

        // Initialize ChromeDriver with options
        ChromeDriver driver = new ChromeDriver(opt);

        // Load the target URL
        driver.get("https://leafground.com/button.xhtml");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Click on the button with the text 'Click and Confirm title.'
        driver.findElement(By.xpath("//span[text()='Click']")).click();

        // Pause for the page to load
        Thread.sleep(1000);

        // Verify that the title of the page is 'Dashboard'
        String expectedTitle = "Dashboard";
        String actualTitle = driver.getTitle();
        if (actualTitle.equalsIgnoreCase(expectedTitle)) {
            System.out.println("Page title is correct: " + actualTitle);
        } else {
            System.out.println("Page title mismatch. Found: " + actualTitle);
        }

        // Navigate back to the previous page
        driver.navigate().back();

        // Wait for the page to reload
        Thread.sleep(1000);

        // Check if the button with the text 'Confirm if the button is disabled' is disabled
        boolean isEnabled = driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
        System.out.println("Is 'Disabled' Button Enabled? " + isEnabled);

        // Find and print the position of the button with the text 'Submit.'
        Point submitButtonPosition = driver.findElement(By.id("j_idt88:j_idt94")).getLocation();
        System.out.println("Submit Button Position: " + submitButtonPosition);

        // Find and print the background color of the button with the text 'Find the Save button color.'
        String saveButtonColor = driver.findElement(By.id("j_idt88:j_idt96")).getCssValue("background-color");
        System.out.println("Save Button Background Color: " + saveButtonColor);

        // Find and print the height and width of the button with the text 'Find the height and width of this button.'
        Dimension size = driver.findElement(By.id("j_idt88:j_idt98")).getSize();
        System.out.println("Button Dimensions - Height: " + size.getHeight() + ", Width: " + size.getWidth());

        // Close the browser
        driver.quit();
    }
}
