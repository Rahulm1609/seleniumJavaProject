package Demo;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import pages.googleSearch;

public class DesiredCapabilitiesDemo {

	
	public static void main(String[] args) {
		
		WebDriver driver;
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("ignoreProtectedModeSettings", true);
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\rahul\\OneDrive\\Desktop\\selenium\\seleniumTestJava\\drivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
		driver.get("https://www.google.com");
		googleSearch googleSearchObj = new googleSearch(driver);		
		googleSearchObj.TextBoxSearch("Rahul M youtube");
		googleSearchObj.SearchButton();
		driver.close();

	}

}
