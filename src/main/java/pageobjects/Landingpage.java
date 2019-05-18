package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landingpage {
	 WebDriver driver;
	
	public Landingpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id='homepage']/header/div[1]/div/nav/ul/li[4]/a")
	WebElement signin;
	@FindBy(xpath="//*[@id='content']/div/div/h2")
	WebElement titleresource;
	@FindBy(xpath="//*[@id='homepage']/header/div[2]/div/nav/ul/li[8]/a")
	WebElement navigationvalidate;
	public WebElement getlogin()
	{
		return signin; 
	}
	
	public WebElement getheading()
	{
		return titleresource; 
	}
	public WebElement headingvalidation()
	{
		return navigationvalidate; 
	}


	

}
