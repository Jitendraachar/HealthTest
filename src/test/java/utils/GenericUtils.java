package utils;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;


public class GenericUtils {

	Testsetupclass testsetupclass;
	public GenericUtils(Testsetupclass testsetupclass)
	{
		this.testsetupclass=testsetupclass;
	}
	
	public void windowhanlde() throws IOException
	{
		testsetupclass= new Testsetupclass();
		Set<String> s1=testsetupclass.driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		String parentwindow=i1.next();
		String childwindow=i1.next();
		testsetupclass.driver.switchTo().window(childwindow);
	}
}
