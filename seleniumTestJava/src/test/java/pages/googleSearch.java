package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class googleSearch {

	WebDriver driver = null;
	
	public googleSearch(WebDriver driver) {
		this.driver = driver;
	}
	
	By textBoxSearch = By.xpath("//input[@name='q']");
	By searchButton = By.xpath("//input[@name='q']");
	
	public void TextBoxSearch(String text) {
		driver.findElement(textBoxSearch).sendKeys(text);
	}
	
	public void SearchButton() {
		driver.findElement(searchButton).sendKeys(Keys.RETURN);
		
	}

}
