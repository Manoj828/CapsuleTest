package com.capsule.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.capsule.utils.TestUtilC;
import com.capsule.utils.WebEventListener;

public class TestBaseC {

	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	
	public TestBaseC()
	{
		String FilePath="C:\\Users\\Admin\\eclipse-workspace\\CapsuleTestAutomation\\src\\main\\java\\com\\capsule\\config\\config.properties";
		
		try {
			 prop = new Properties();
			FileInputStream fis= new FileInputStream(FilePath); 
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
	}
	
	
	public static void initialisation() throws IOException
	{
		String BrowserName=prop.getProperty("browser");
		
		if(BrowserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E:\\Testing\\chromedriver.exe");
		      driver= new ChromeDriver();
		}
		
		else if(BrowserName.equalsIgnoreCase("FF"))
		{
			driver=new FirefoxDriver();
		}
		
		
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		 
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtilC.Implicity_Time, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtilC.Implicity_Time, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}
	
	
	
	
	
	
	
	
}
