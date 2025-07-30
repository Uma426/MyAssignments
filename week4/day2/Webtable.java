package week4.day2;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Set ChromeOptions to open in guest mode (optional)
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("guest");

        // Initialize ChromeDriver with options
        ChromeDriver driver = new ChromeDriver(opt);

        // Load the target URL
        driver.get("https://leafground.com/table.xhtml");

        // Maximize the browser window
        driver.manage().window().maximize();
        
        
       System.out.println("Locate the Table WebElement table"); 
        WebElement table = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody")); 
        //To count the number of rows
        List<WebElement> rows= table.findElements (By.tagName("tr"));
        int rows1 = rows.size(); 
        System.out.println(rows1);
        
      System.out.println("To count the number of columns");
        List<WebElement> columns = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[1]/td")); 
        int columnCount= columns.size(); 
        System.out.println(columnCount); 
        
        System.out.println("To retieve a particular value WebElement");
        
        WebElement rowicol2Ele = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[1]/td[2]")); 
        String rowicol2EleText= rowicol2Ele.getText();
        System.out.println(rowicol2EleText); 
        
        System.out.println("To retrieve the entire row List<WebElement>");
        //
       List<WebElement> row = driver.findElements (By.xpath("//span[text()='Customer Analytics Table']/following:: table[2]/tbody/tr[1]/td")); 
        //0 1 2 3 4 5 //[WE1, WE2, WE3, WE4, WES, WE6]
        for (int i = 0; i < row.size(); i++) { 
        	String text= row.get(i).getText(); 
        	//String text rowl.get().getText(); 
        	//text1 //String text rowl.get(1).getText(); 
        	//text2 //String text = rowl.get(5).getText(); 
        	
        	System.out.println(text);
        }
       
        	System.out.println("To retrieve all data");
        	List<WebElement> allData = driver.findElements (By.xpath("//span[text()='Customer Analytics Table']/following:: table[2]/tbody/tr/td")); 
        	//0 1 2 //[wel, we2, we3, we60] //0 1 2.59 59 
        	for (int i=0; i < allData.size(); i++) { 
        		String text2 =allData.get(i).getText(); 
        		//String text allData.get(0).getText();//textl
        		//String text allData.get(1).getText();//text2 
        		//String text allData.get(59).getText();  //text60    	
                System.out.println(text2);
        	}
       
        
        List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr/td[2]"));
        int size = elements.size();
        System.out.println("The count is "+size);
        

        System.out.println("The data in the column 2 are: ");
        for (int i = 0; i < elements.size(); i++) {
        	
           String text = elements.get(i).getText();
           
           System.out.println(text);
			
		}

	}

}
