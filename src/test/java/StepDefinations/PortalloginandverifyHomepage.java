package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPage;
import pageObjects.PageObjectManager;
import pageObjects.Verifypage;
import utils.Testsetupclass;

public class PortalloginandverifyHomepage {
	//WebDriver driver;
	Testsetupclass testsetup;
	PageObjectManager PageObjectManger;
	
public PortalloginandverifyHomepage(Testsetupclass testsetup)
{
	this.testsetup=testsetup;
}
	

@Given("User is on Login Page")
public void user_is_on_login_page() {
	
}
   

@When("User login to application with username and passowrd")
public void user_login_to_application_with_username_and_passowrd(DataTable dataTable)
 {
	  LoginPage login = testsetup.PageObjectManger.getLoginPage();
	  login.logindetails(dataTable);
	  login.loginclick(); 
 }
  	

	@Then("home page is displayed")
	public void home_page_is_displayed() throws InterruptedException {
		Thread.sleep(1000);
		Verifypage verifypage= testsetup.PageObjectManger.getVerifypage();
		verifypage.verify();   
	}
//	@Then("Claims are displayed")
//	public void claims_are_displayed() {
//	    
//	}
}
