package utils;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class Testsetupclass {

	public WebDriver driver;
	public PageObjectManager PageObjectManger;
	public IHXTestBaseClass ihxtestbaseclass;
	
	public Testsetupclass() throws IOException
	{
		ihxtestbaseclass= new IHXTestBaseClass();
		
		PageObjectManger= new PageObjectManager(ihxtestbaseclass.WebDriverManger());
	}
}
