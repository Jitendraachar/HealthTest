package StepDefinations;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
import pageObjects.LoginPagemultiple;
import pageObjects.PageObjectManager;
import pageObjects.Verifypage;
import utils.Testsetupclass;

public class PortalmultipleloginandverifyHomepage {
	//WebDriver driver;
	By username = By.xpath("//*[@id=\"login-form_username\"]");
	By password = By.xpath("//*[@id=\"login-form_password\"]");
	Testsetupclass testsetup;
	PageObjectManager PageObjectManger;
	
public PortalmultipleloginandverifyHomepage(Testsetupclass testsetup)
{
	this.testsetup=testsetup;
	
}
	

//@Given("User is on Login Page")
//public void user_is_on_login_page() {
//	
//}
//  
//  @When("User login to application with username and passowrd") 
//  public void user_login_to_application_with_username_and_passowrd(DataTable dataTable) {
//  LoginPage login = testsetup.PageObjectManger.getLoginPage();
//  login.logindetails(dataTable); login.loginclick(); }
// 

@When("^User login to application with username(.+) and password(.+)$")
public void user_login_to_application_with_username_and_password(String username,String password) throws Throwable {
	LoginPagemultiple login=testsetup.PageObjectManger.getmultiplelogin();
	login.logindetailsmultiple(username, password);
	//login.loginclick(); 
	LoginPage login1=testsetup.PageObjectManger.getLoginPage();
	login1.loginclick();
}




//  @Then("home page is displayed") public void home_page_is_displayed() throws
//  InterruptedException {
//  testsetup.PageObjectManger.driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS); 
//  Verifypage verifypage=testsetup.PageObjectManger.getVerifypage();
//  verifypage.verify();
//  }
//  
//  @Then("Claims are displayed")
//  public void claims_are_displayed() {
//      // Write code here that turns the phrase above into concrete actions
//      throw new io.cucumber.java.PendingException();
//  }
//  
	
}
