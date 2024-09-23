package StepDefination;

import com.qa.DriverFactory.DriverFactory;

import PageObject.AccontPage;
import PageObject.BucketPage;
import PageObject.ImformationPage;
import PageObject.LoginPage;
import PageObject.OverviewPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class OverviewSteps {
	 LoginPage lp = new LoginPage(DriverFactory.getDriver());
	 AccontPage accountpage;
	 BucketPage  bucketpage;
	 ImformationPage informationpage;
	 OverviewPage overviewpage;
	 
	@Given("user is on overview page")
	public void user_is_on_overview_page() {
		 accountpage=lp.giveControlToAccount();
	     accountpage.click_on_button();
	     bucketpage=accountpage.press_in_bucket();
	     informationpage=bucketpage.click_on_checkoutbutton();
	     informationpage.fill_imformtion();
	     overviewpage=informationpage.click_on_button();
	}

	@Then("validate the text {string}")
	public void validate_the_text(String string) {
	    Assert.assertEquals(string, overviewpage.getText());
	}

	@Then("click on Finishbutton")
	public void click_on_finishbutton() {
	    overviewpage.click_on_button();
	}

}
