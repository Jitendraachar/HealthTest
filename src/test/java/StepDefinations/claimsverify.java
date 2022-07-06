package StepDefinations;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import pageObjects.PageObjectManager;
import pageObjects.claims;
import utils.Testsetupclass;

public class claimsverify {
	WebDriver driver;
	Testsetupclass testsetup;
	PageObjectManager PageObjectManger;
	
	public claimsverify(Testsetupclass testsetup)
	{
	this.testsetup=testsetup;
	}
	
	@And("Claims are displayed")
	public void claims_are_displayed() 
	{
		claims claims=testsetup.PageObjectManger.getclaims();
		claims.checkclaims();
	}

}
