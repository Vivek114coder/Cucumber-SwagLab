package PageObject;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.DriverFactory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccontPage {

	public WebDriver driver;

	String buttonAfterclick;

	public AccontPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}




	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
	WebElement button1;

	@FindBy(xpath="//*[@id=\"remove-sauce-labs-backpack\"]")
	WebElement button2;

	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
	WebElement shoppingcart;
	
	public String  getTitle() {
		return driver.getTitle();
	}

	public String button_before_click() {
		return button1.getText();
	}
	public void click_on_button() {

		Actions  action= new  Actions(driver);
	    action.moveToElement(button1).click().perform();

	}

	public  String button_After_click() {
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement visibleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]")));
		return visibleElement.getText();
	


	}
	public BucketPage press_in_bucket() {
		shoppingcart.click();
		return new BucketPage(driver);
	}





}
