package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;
import pages.googleSearch;

public class GoogleSearchTest {
	
	 WebDriver driver = null;
	
//	public static void main(String[] args) {
//		
//		googleSearchTest();
//	}
	 
	
	 
	@BeforeTest
	public void setup() {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void googleSearchTest() {

		driver.get("https://www.google.com");
		googleSearch googleSearchObj = new googleSearch(driver);
		
		
		googleSearchObj.TextBoxSearch("Rahul M youtube");
		googleSearchObj.SearchButton();
		
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.close();
	}

}
