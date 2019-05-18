package MavenRepository;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.Landingpage;
import pageobjects.Loginpage;

public class NavigationValidation extends base{
	@BeforeTest
	public void browseriniatiate2() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
	}
	@Test
	public void navigation() throws IOException
	{
		
		Landingpage l=new Landingpage(driver);
		Assert.assertTrue(l.headingvalidation().isDisplayed());
		
	}
	@AfterTest
	public void closebrowser2()
	{
		driver.close();
	}

}
