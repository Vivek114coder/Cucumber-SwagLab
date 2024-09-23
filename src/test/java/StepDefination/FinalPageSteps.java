package StepDefination;

import com.qa.DriverFactory.DriverFactory;

import PageObject.AccontPage;
import PageObject.BucketPage;
import PageObject.FinalPage;
import PageObject.ImformationPage;
import PageObject.LoginPage;
import PageObject.OverviewPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class FinalPageSteps {
	 
	LoginPage lp = new LoginPage(DriverFactory.getDriver());
	 AccontPage accountpage;
	 BucketPage  bucketpage;
	 ImformationPage informationpage;
	 OverviewPage overviewpage;
	 FinalPage finalpage;
	
	@Given("user is on final page")
	public void user_is_on_final_page() {
		 accountpage=lp.giveControlToAccount();
	     accountpage.click_on_button();
	     bucketpage=accountpage.press_in_bucket();
	     informationpage=bucketpage.click_on_checkoutbutton();
	     informationpage.fill_imformtion();
	     overviewpage=informationpage.click_on_button();
	     finalpage=overviewpage.click_on_button();
	}

	@Then("text {string} is displayed")
	public void text_is_displayed(String string) {
	    Assert.assertEquals(string, finalpage.getText());
	}

	@Then("back home button is diplayed")
	public void back_home_button_is_diplayed() {
	   Assert.assertTrue(finalpage.button_is_diplayed());
	}

}
