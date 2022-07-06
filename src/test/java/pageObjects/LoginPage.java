package pageObjects;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.datatable.DataTable;
import utils.Testsetupclass;

public class LoginPage {
	public WebDriver driver;	
	public LoginPage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	By username = By.xpath("//*[@id=\"login-form_username\"]");
	By password = By.xpath("//*[@id=\"login-form_password\"]");
	By loginclick = By.xpath("//*[@id=\"login-form\"]/div[4]/div/button");
	
	public void userinloginpage()
	{
		
	}
	/*
	 * public void logindetails(DataTable dataTable) { List<List<String>> obj =
	 * dataTable.asLists();
	 * driver.findElement(username).sendKeys(obj.get(0).get(0));
	 * driver.findElement(password).sendKeys(obj.get(0).get(1));
	 * 
	 * }
	 */
	
	public void loginclick()
	{
	//	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/button/i")).click();
		driver.findElement(loginclick).click();
	}
	public void logindetails(DataTable dataTable) {
		List<List<String>> obj = dataTable.asLists();
		 driver.findElement(username).sendKeys(obj.get(0).get(0));
		 driver.findElement(password).sendKeys(obj.get(0).get(1));
		
	}


	
}
