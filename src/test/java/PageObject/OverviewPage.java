package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage {
	public WebDriver driver;	
	
    public OverviewPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}  

	@FindBy(xpath="//*[@id=\"header_container\"]/div[2]/span")
	WebElement Overview;


	@FindBy(xpath="//*[@id=\"finish\"]")
	WebElement finish;


	

	public String getText() {
		return Overview.getText();
	}


	public FinalPage click_on_button() {
		finish.click();
		return  new FinalPage(driver);
		
		
	}
}
