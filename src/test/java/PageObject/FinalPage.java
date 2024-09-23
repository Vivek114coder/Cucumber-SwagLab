package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinalPage {
	public WebDriver driver;	
	
    public FinalPage (WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}  

	@FindBy(xpath="//*[@id=\"checkout_complete_container\"]/h2")
	WebElement text;


	@FindBy(xpath="//*[@id=\"back-to-products\"]")
	WebElement back_to_home_button;


	

	public String getText() {
		return text.getText();
	}


	public boolean button_is_diplayed() {
		
		return back_to_home_button.isDisplayed();
		
	}
}
