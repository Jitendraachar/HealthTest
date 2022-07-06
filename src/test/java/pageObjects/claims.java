package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class claims {
	public WebDriver driver;
	
	public claims(WebDriver driver) 
	{
		this.driver=driver;
	}
	public void checkclaims() 
	{
		String claimtext= driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div[2]/div[1]/div[2]/div/div[1]/h1")).getText();
		String expectedtext="Claims Management";
		Assert.assertEquals(claimtext, expectedtext);
	}

}
