package Demo;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGmultibrowserDemo {
	
	WebDriver driver;
	
	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			}
		
		else if(browserName.equalsIgnoreCase("ie")) {
			
			WebDriverManager.iedriver().setup(); 
			driver = new InternetExplorerDriver();
			}
		
	}
	
	@Test
	public void googleSearchTest() throws Exception {
		
		driver.get("https://www.google.com");
		Thread.sleep(400);
		
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.close();
	}

}
