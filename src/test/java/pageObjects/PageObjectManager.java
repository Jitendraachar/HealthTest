package pageObjects;

import org.openqa.selenium.WebDriver;


public class PageObjectManager {
	public LoginPage loginpage;
	public Verifypage verifypage;
	public claims claimsobj;
	public LoginPagemultiple loginmultiple;
	public WebDriver driver;
	

	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public LoginPage getLoginPage()
	{
		loginpage = new LoginPage(driver);
		return loginpage;
	}
	
	public LoginPagemultiple getmultiplelogin()
	{
		loginmultiple= new LoginPagemultiple(driver);
		return loginmultiple;
	}
	
	public Verifypage getVerifypage()
	{
		verifypage = new Verifypage(driver);
		return verifypage;
	}
	

	public claims getclaims() {
		claimsobj= new claims(driver);
		return claimsobj;
	}
}
