package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoITdemo {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver  driver = new ChromeDriver();
		driver.get("http://www.tinyupload.com");
		driver.findElement(By.name("uploaded_file")).click();
		try {
			Runtime.getRuntime().exec("C:\\Users\\rahul\\OneDrive\\Desktop\\selenium\\data\\autoITscript.exe");
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		driver.close();

	}

}
