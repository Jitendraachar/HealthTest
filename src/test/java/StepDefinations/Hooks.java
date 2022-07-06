package StepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.Testsetupclass;

public class Hooks {

	Testsetupclass testsetupclass;
	public Hooks(Testsetupclass testsetupclass)
	{
		this.testsetupclass=testsetupclass;
	}
	
	@After
	public void Afterscenario()
	{
		testsetupclass.ihxtestbaseclass.driver.quit();
	}
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException
	{
		WebDriver driver=testsetupclass.ihxtestbaseclass.WebDriverManger();
		if(scenario.isFailed())
		{
		File sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		byte[] filecontent= FileUtils.readFileToByteArray(sourcePath);
		scenario.attach(filecontent, "image/png", "errorimages");
		}
	}
	
	
}
