package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageobjects.Landingpage;
import pageobjects.Loginpage;

import org.junit.runner.RunWith;

import MavenRepository.base;

@RunWith(Cucumber.class)
public class stepDefinition extends base{

	@Given("^initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver=initializeDriver(); 
	}

	@When("^Login to the \"([^\"]*)\" site$")
	public void login_to_the_site(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
	}

	@When("^click on the Login button$")
	public void click_on_the_Login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Landingpage l=new Landingpage(driver);
		l.getlogin().click();
		Thread.sleep(60); 
	}

	@When("^Enter the \"([^\"]*)\" and \"([^\"]*)\" in the loginpage$")
	public void enter_the_and_in_the_loginpage(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Loginpage ln=new Loginpage(driver);
		ln.getemail().sendKeys(arg1);
		ln.getpassword().sendKeys(arg2);
		ln.Loginbtn().click();
	    
	}

	@Then("^verify the user is successfully login$")
	public void verify_the_user_is_successfully_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("successfully login");
	}


}