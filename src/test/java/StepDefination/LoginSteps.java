package StepDefination;

import org.openqa.selenium.WebDriver;

import com.qa.DriverFactory.DriverFactory;

import PageObject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginSteps {
	
	
	public LoginPage lp = new LoginPage(DriverFactory.getDriver());
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    DriverFactory.getDriver().get("https://www.saucedemo.com/");
	}

	@When("^user enter username (.*)$")
	public void user_enter_username_standard_user(String username) {
	   lp.setUsername(username);
	}

	@When("^user enter Password (.*)$")
	public void user_enter_password_secret_sauce(String password) {
		
	   lp.setPassword(password);
    }

	@When("user click on login button")
	public void user_click_on_login_button() {
	    lp.click_on_button();
	}

	@Then("user gets the text {string}")
	public void user_gets_the_text(String product) {
	   Assert.assertEquals(product, lp.getText1());
	}


	@Then("user remains on page")
	public void user_remains_on_page() {
	   Assert.assertTrue(lp.remain_on_same_page());
	}
;
	    
	}


