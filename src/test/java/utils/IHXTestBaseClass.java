package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IHXTestBaseClass {

	
	public WebDriver driver;
	
	public WebDriver WebDriverManger() throws IOException
	{
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\global.properties");
		Properties prop= new Properties();
		prop.load(fis);
		String url=prop.getProperty("QAurl");
		String browser_properties=prop.getProperty("browser");
		String browser_mvn=System.getProperty("browser");
		//result=testcondition?value1:value2
		String browser=browser_mvn!=null?browser_mvn:browser_properties;
		
		if(driver== null)
		{
			
			if(browser.equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				
				ChromeOptions co= new ChromeOptions();
				driver=new ChromeDriver(co);
			}
			if(browser.equalsIgnoreCase("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				
			}
			if(browser.equalsIgnoreCase("edge"))
			{
				WebDriverManager.edgedriver().setup();
			}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		}
		return driver;
	}
}
