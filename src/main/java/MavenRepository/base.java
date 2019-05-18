package MavenRepository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {  
	public static WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException
	{
	prop=new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\amanpreet kaur\\SDB\\src\\main\\java\\MavenRepository\\data.properties");
	prop.load(fis);
	String browsername=prop.getProperty("browser");
	System.out.println(browsername);
	if(browsername.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C://JavaProject//chromedriver_win32 (2)//chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	else if(browsername.equals("firefox"))
	{
		driver= new FirefoxDriver();
	}
	else if(browsername.equals("internetexplorer"))
	{
		System.setProperty("webdriver.ie.driver","C://Users//amanpreet kaur//Downloads//chromedriver_win32//chromedriver.exe");
		driver = new InternetExplorerDriver();
		
	}
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	return driver;
	}
	
	public void getscreenshot(String result) throws IOException
	{
		File src =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		org.apache.commons.io.FileUtils.copyFile(src,new File("c://test//"+result+"screenshot.png"));
		
	}	

}
