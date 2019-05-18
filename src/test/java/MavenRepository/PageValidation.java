package MavenRepository;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.Landingpage;
import pageobjects.Loginpage;

public class PageValidation extends base{
	@BeforeTest
	public void browseriniatiate3() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
	}
	@Test
	public void pagevalidation() throws IOException
	{

		Landingpage l=new Landingpage(driver);
		Assert.assertEquals(l.getheading().getText(), "FEATURED COURSES");
		
	}
	
	@AfterTest
	public void closebrowser3()
	{
		driver.close();
	}

}
