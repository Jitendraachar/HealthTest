package pageObjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.datatable.DataTable;
import utils.Testsetupclass;

public class LoginPagemultiple {
	public WebDriver driver;	
	public LoginPagemultiple(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	By username = By.xpath("//*[@id=\"login-form_username\"]");
	By password = By.xpath("//*[@id=\"login-form_password\"]");
	//By loginclick = By.xpath("//*[@id=\"login-form\"]/div[4]/div/button");
	
//	public void userinloginpage()
//	{
//		
//	}
	public void logindetailsmultiple(String uname,String pwd) 
	{
		/*
		 * List<List<String>> obj = dataTable.asLists(String.class);
		 * driver.findElement(username).sendKeys(obj.get(0).get(0));
		 * driver.findElement(password).sendKeys(obj.get(0).get(1));
		 */
	 
		 driver.findElement(username).sendKeys(uname);
		 driver.findElement(password).sendKeys(pwd);
		 
	}
	
//	public void loginclick()
//	{
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/button/i")).click();
//		driver.findElement(loginclick).click();
//	}
//

	
}
