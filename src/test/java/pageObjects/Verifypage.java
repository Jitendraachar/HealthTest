package pageObjects;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import utils.Testsetupclass;

public class Verifypage {
	public WebDriver driver;
	public Verifypage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void verify() throws InterruptedException 
	{
		Thread.sleep(1000);
		 String currenturl= driver.getCurrentUrl();
		 String expectedurl="https://stg-provider.ihx.in/claims/in-patient";
		 Assert.assertEquals(currenturl, expectedurl);	
	}
}
