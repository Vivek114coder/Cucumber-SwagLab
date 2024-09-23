package StepDefination;

import java.util.List;
import java.util.Map;


import com.qa.DriverFactory.DriverFactory;

import PageObject.AccontPage;

import PageObject.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class AccoutnPageSteps {

	LoginPage loginpage= new LoginPage(DriverFactory.getDriver());
	AccontPage homepage;
	
	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable dataTable) {
	    List<Map<String,String>> credits=   dataTable.asMaps();
	    String username=credits.get(0).get("username");
	    String password=credits.get(0).get("Password");
	    DriverFactory.getDriver().get("https://www.saucedemo.com/");
	    loginpage.doLogin(username, password);
	    loginpage.click_on_button();
	   
	}

	@Given("user is on Account Page")
	public void user_is_on_account_page() {
	    homepage=loginpage.giveControlToAccount();
	    System.out.println(homepage.getTitle());
	}

	@Then("AddToCartButton {string} is clickable")
	public void add_to_cart_button_is_clickable(String string)throws InterruptedException {
	    homepage.click_on_button();
	    
	}
	
	@Then("print title of homepage")
	public void print_title_of_homepage()  {
	    System.out.println(homepage.getTitle());
	   
	}

	@Then("Before clicking the text is {string}")
	public void before_clicking_the_text_is(String string) {
	   Assert.assertEquals(string, homepage.button_before_click());
	   homepage.click_on_button();
	}

	@Then("After clicking the text is {string}")
	public void after_clicking_the_text_is(String string) {
	   homepage.button_After_click();
	}
	
	@Then("add on shopping cart button")
	public void add_on_shopping_cart_button() {
	  homepage.press_in_bucket();
	}

}
