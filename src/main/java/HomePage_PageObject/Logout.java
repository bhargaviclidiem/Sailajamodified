package HomePage_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
	WebDriver driver;
	@FindBy(xpath = "//a[@id='menu1']/img[@class='online']") 
	  public WebElement userDrpdwnLnk;
	 

	@FindBy(xpath = "//div[@class='collapse dropdown-menu']/ul/li[8]/a")//*[@id='header']/div[3]/div/div[4]/div/ul/li[5]/a
	public WebElement logoutLnk;
	
	
	  public Logout(WebDriver driver) {
	  
	  // This initElements method will create all public WebElements
	  PageFactory.initElements(driver, this);
	  
	  }
	 
	public void logout(WebDriver driver) throws InterruptedException {
		
		
		System.out.println("Logout Menu Clicked");
		
		userDrpdwnLnk.click();
		//Thread.sleep(2000);
		System.out.println("Logout Clicked");
		logoutLnk.click();
	}


}
