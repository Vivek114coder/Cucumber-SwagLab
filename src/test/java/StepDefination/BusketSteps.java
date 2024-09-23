package StepDefination;

import com.qa.DriverFactory.DriverFactory;

import PageObject.AccontPage;
import PageObject.BucketPage;
import PageObject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class BusketSteps {
	LoginPage loginpage= new LoginPage(DriverFactory.getDriver());
	AccontPage accountpage;
	BucketPage bucketpage;
	

    @Given("user is on bucket page")
    public void user_is_on_bucket_page() {
        accountpage=loginpage.giveControlToAccount();
        accountpage.click_on_button();
        bucketpage=accountpage.press_in_bucket();
        
    
    }
	@Then("select item clickable")
	public void select_item_clickable() {
	   Assert.assertTrue(false);
	   bucketpage.check_selected_item();
	}
	
	@Then("click on checkoutButton")
	public void click_on_checkout_button() {
	   bucketpage.click_on_checkoutbutton();
	}
    
	


}
