package week3.day1;

public class Browser {

	String browserName;
	String browserVersion;
	
	/*Create a superclass Browser.
- Add at least two variables to the Broswer class: browserName and browserVersion
- Implement 3 methods openURL(), closeBrowser(), navigateBack() in the Browser class.
- Create subclasses such as Chrome, Edge and Safari
- Define openIncognito() and clearCache() methods in Chrome class
- Define takeSnap() and clearCookies() methods in Edge class
- Define readerMode() and fullScreenMode() methods in Safari class
- Demonstrate the concept by creating objects for both classes and calling their methods.*/
	
	 public void openURL(String url) {
	        System.out.println("The url is opening successfully");
	    }

	    public void closeBrowser() {
	        System.out.println("The Browser closed successfully");
	    }

	    public void navigateBack() {
	        System.out.println("Browser is navigating back");
	    }
}
