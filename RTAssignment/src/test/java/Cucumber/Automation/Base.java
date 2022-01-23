package Cucumber.Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public static WebDriver driver;
	
	public static WebDriver getdriver() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Automation\\src\\test\\java\\Cucumber\\Automation\\global.properties");
		
				prop.load(fis);
	
	 System.setProperty("WebDriver.gecko.driver","C:\\Users\\DELL\\Desktop\\selenium1\\geckodriver");
	 WebDriver driver = new FirefoxDriver();
	 
	 driver.manage().window().maximize();
	 driver.get(prop.getProperty("url"));
	 return driver;
	 


}
	
}
