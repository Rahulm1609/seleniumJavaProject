package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesTest {
	
	static String projectPath = System.getProperty("user.dir");
	static Properties prop = new Properties();
	
	
	
	public static void main(String[] args) {
		
		getProperties();
		setProperties();
		getProperties();
	}
	
	public static void getProperties() {
		
		try {
			InputStream inStream = new FileInputStream(projectPath + "\\src\\test\\java\\config\\config.properties");
			prop.load(inStream);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
public static void setProperties() {
		
		try {
			OutputStream outStream = new FileOutputStream(projectPath + "\\src\\test\\java\\config\\config.properties");
			prop.setProperty("browser", "chrome");
			prop.store(outStream, "done!");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
