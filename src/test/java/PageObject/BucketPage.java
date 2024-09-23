package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class BucketPage  {
private static final String xpath = null;
public WebDriver driver;
public BucketPage(WebDriver driver) {
	
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}

@FindBy(xpath="//*[@id=\"checkout\"]")
WebElement checkoutbutton;

@FindBy(xpath="//*[@id=\"item_4_title_link\"]/div")
WebElement selectedItem;

public ImformationPage click_on_checkoutbutton() {
	checkoutbutton.click();
	return new ImformationPage(driver);
}

public void check_selected_item() {
	Assert.assertEquals("Sauce Labs Backpack",selectedItem.getText());
}

public void selected_item_is_Clickable() {
	selectedItem.click();
}




}
