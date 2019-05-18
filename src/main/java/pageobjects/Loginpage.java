package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	 WebDriver driver;
		
		public Loginpage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(xpath="//*[@id='user_email']")
		WebElement emailenter;
		
		@FindBy(xpath="//*[@id='user_password']")
		WebElement passwordinput;
		
		@FindBy(xpath="//*[@value='Log In']")
		WebElement Loginbtn;
				
		
		public WebElement getemail()
		{
			return emailenter; 
		}
		public WebElement getpassword()
		{
			return passwordinput; 
		}
		public WebElement Loginbtn()
		{
			return Loginbtn; 
		}


		
}
