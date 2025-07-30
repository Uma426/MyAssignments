package week4.day2.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ErailWebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*Precondition:
- Initialize ChromeDriver
- Load the URL (https://erail.in/)
- Maximize the browser window
- Add an implicit wait to ensure the webpage elements are fully loaded
Assignment Requirements:
- Launch the erail URL.
- Enter "MAS" as the "From" station.
- Enter "MDU" as the "To" station.
- Uncheck the "Sort on Date" checkbox.
- Retrieve the train names from the web table.
- Verify if there are any duplicate train names in the web table.
*/
		// Set ChromeOptions to open in guest mode (optional)
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("guest");

        // Initialize ChromeDriver with options
        ChromeDriver driver = new ChromeDriver(opt);

		driver.get("https://erail.in/");
		driver.manage().window().maximize();

        // Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Enter 'MAS' in 'From' station
        WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
        fromStation.clear();
        fromStation.sendKeys("MAS");

        // Wait until the value is updated to MAS and press Enter
        wait.until(ExpectedConditions.attributeContains(fromStation, "value", "MAS"));
        fromStation.sendKeys(Keys.ENTER);

        // Enter 'MDU' in 'To' station
        WebElement toStation = driver.findElement(By.id("txtStationTo"));
        toStation.clear();
        toStation.sendKeys("MDU");

        // Wait until the value is updated to MDU and press Enter
        wait.until(ExpectedConditions.attributeContains(toStation, "value", "MDU"));
        toStation.sendKeys(Keys.ENTER);

        // Uncheck "Sort on Date" if checked
        WebElement sortCheckbox = driver.findElement(By.id("chkSelectDateOnly"));
        if (sortCheckbox.isSelected()) {
            sortCheckbox.click();
        }

        
        // Small wait to allow table to refresh
        Thread.sleep(2000);
        
     // Locate all train name elements from the 2nd column of the table
        List<WebElement> trainNames = driver.findElements(By.xpath("//div[@id='divTrainsList']//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td[2]"));

        int size = trainNames.size();
        System.out.println("The count is " + size);

        System.out.println("The Train names are (from column 2):");

        // Print all train names as retrieved
        for (WebElement train : trainNames) {
            System.out.println(train.getText());
        }

     // Create a list of normalized train names
        List<String> normalizedTrainNames = new ArrayList<>();

        for (WebElement train : trainNames) {
            String trainName = train.getText().toUpperCase().replaceAll("\\s+", " ").trim();
            normalizedTrainNames.add(trainName);
            System.out.println(trainName);
        }

        // Sort the train names list
        Collections.sort(normalizedTrainNames);
        System.out.println("The sorted train names are "+normalizedTrainNames);

        Set<String> uniqueTrainNames = new HashSet<>();
        boolean hasDuplicates = false;

        // Now check duplicates by adding to set
        for (String trainName : normalizedTrainNames) {
          //  System.out.println("Checking train: [" + trainName + "]");
            if (!uniqueTrainNames.add(trainName)) {
                System.out.println("Duplicate train found: " + trainName);
                hasDuplicates = true;
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicate train names found.");
        }

            driver.quit();
        

      
	


	}
}
