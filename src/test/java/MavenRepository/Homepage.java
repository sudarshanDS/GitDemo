package MavenRepository;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.Landingpage;
import pageobjects.Loginpage;

public class Homepage extends base{
	private static Logger log=LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void browseriniatiate() throws IOException
	{
		driver=initializeDriver();
		log.info("chrome has iniatiated");
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider="getdata")
	public void homepage(String username,String Password) throws IOException, InterruptedException
	{
		Thread.sleep(30);
		Landingpage l=new Landingpage(driver);
		l.getlogin().click();
		Thread.sleep(60);
		Loginpage ln=new Loginpage(driver);
		ln.getemail().sendKeys(username);
		ln.getpassword().sendKeys(Password);
		ln.Loginbtn().click();
	}
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data=new Object[1][2];
		data[0][0]="testmail.gmail.com";
		data[0][1]="123454";
		return data;
				
	}
	@AfterTest
	public void closebrowser()
	{
		driver.close();
		driver=null;
	}

}
