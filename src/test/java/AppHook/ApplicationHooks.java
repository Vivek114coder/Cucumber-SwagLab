package AppHook;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.DriverFactory.DriverFactory;
import com.qa.utils.configReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {
public DriverFactory factory;
public WebDriver driver;
public configReader config;
Properties prop;
String browser1;
DriverFactory df;

@Before(order=0)
public void Reader(){
config= new configReader();
prop=config.init_Element();


}


@Before(order=1)
public void launchBrowser() {
 browser1=prop.getProperty("browser");
 df= new DriverFactory();
 driver=df.init_driver(browser1);

    
 }


@After(order=0)
public void quitbrowser() {
	DriverFactory.getDriver().close();
}

@After(order=1)
public void tearDown(Scenario scenario) {
	if(scenario.isFailed()) {
		String screeshotName=scenario.getName().replaceAll(" ", "_");
		byte [] sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(sourcePath, "image/png", screeshotName);	
	}
}

}
