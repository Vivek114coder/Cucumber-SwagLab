package StepDefination;

import com.qa.DriverFactory.DriverFactory;

import PageObject.AccontPage;
import PageObject.BucketPage;
import PageObject.ImformationPage;
import PageObject.LoginPage;
import PageObject.OverviewPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ImformationStep {
 LoginPage lp = new LoginPage(DriverFactory.getDriver());
 AccontPage accountpage;
 BucketPage  bucketpage;
 ImformationPage informationpage;

@Given("user is on Imforamtion page")
public void user_is_on_imforamtion_page() {
	 accountpage=lp.giveControlToAccount();
     accountpage.click_on_button();
     bucketpage=accountpage.press_in_bucket();
     informationpage=bucketpage.click_on_checkoutbutton();
     
}

@Then("fill imfomation")
public void fill_imfomation() {
    informationpage.fill_imformtion();
    try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	};
}

@Then("click on continuebutton")
public void click_on_continuebutton() {
   informationpage.click_on_button();
  
}


}
