package week3.day1;

public class BrowserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chrome chrome = new Chrome();
        chrome.openURL("https://www.google.com");
        chrome.openIncognito();
        chrome.clearCache();
        chrome.navigateBack();
        chrome.closeBrowser();

        System.out.println();

        // Edge 
        Edge edge = new Edge();
        edge.openURL("https://www.microsoft.com");
        edge.takeSnap();
        edge.clearCookies();
        edge.navigateBack();
        edge.closeBrowser();

        System.out.println();

        // Safari object
        Safari safari = new Safari();
        safari.openURL("https://www.apple.com");
        safari.readerMode();
        safari.fullScreenMode();
        safari.navigateBack();
        safari.closeBrowser();
    }
	}

