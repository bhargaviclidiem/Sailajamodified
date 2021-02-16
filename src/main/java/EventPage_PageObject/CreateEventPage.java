package EventPage_PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateEventPage {

	WebDriver driver;
	JavascriptExecutor jse;
	
	// WebElements for Create Event Page

	@FindBy(xpath ="//*[@id='ulmenu']/li[6]/a/span")
	public WebElement EventTab;
	
	@FindBy(xpath ="//*[@id='ulmenu']/li[6]/ul/li[1]/a")
	public WebElement CreateEventLnk;
	
	@FindBy(xpath ="//*[@id='are-u']/ul/li[1]")
	public WebElement areyouTab;
		

	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

