package HomePage_PageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	// WebElements of Home Page of Staging
	@FindBy(xpath = "//input[@id='txtusername']")
	public WebElement userNameTxtbx;

	@FindBy(xpath = "//input[@id='txtpassword']")
	public WebElement passwordTxtbx;

	@FindBy(xpath = "//div[@class='termly-consent-banner-btn-container-ae12bd']/button")
	public WebElement acceptCookies;

	@FindBy(id = "aloginbutton") // a[@id='aloginbutton']/parent::div[@class='form-group']
	public WebElement loginBtn;

	@FindBy(xpath = "//a[@onclick='ShowForgotPassword()']")
	public WebElement forgotPwd;

	@FindBy(xpath = "//div[@class='chat__prompt-header-close']/button[@class='chat__prompt-close']/img")
	public WebElement MouseHoverClose;

	@FindBy(xpath = "//div[@class='chat__prompt-header']/button[@class='chat__prompt-close']/img")
	public WebElement chatClose;

	/*
	 * @FindBy(xpath = "//a[text()='Forgot password?']") public WebElement
	 * forgotPwdLnk;
	 * 
	 * @FindBy(xpath = "//*[@id='tabs-inner']/div[7]/div/label/div/i") public
	 * WebElement staySignedInChkbx;
	 * 
	 * @FindBy(xpath = "//a[text()='Sign Up ']") public WebElement signUpLnk;
	 * 
	 * 
	 * 
	 * @FindBy(xpath = "//div[@class='desktop-visibilty-true']") public WebElement
	 * ofrLnk;
	 */

	// constructor for initializing the class objects
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all public WebElements
		PageFactory.initElements(driver, this);
		System.out.println("Loginpage driver intiated");
	}

	public void login(String userName, String password) throws AWTException, InterruptedException {
		
		System.out.println("In Login Method" + userName);
		System.out.println("In Login Method" + password);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", userNameTxtbx);
		userNameTxtbx.sendKeys(userName);
		passwordTxtbx.sendKeys(password);
		loginBtn.click();
		//js.executeScript("arguments[0].scrollIntoView();", forgotPwd);

		
		  //Robot robot = new Robot();
		  
		 // robot.keyPress(KeyEvent.VK_ENTER); System.out.println("login clicked");
		  
		 
		/*
		 * WebElement loginButton=driver.findElement(By.xpath(
		 * "//a[@id='aloginbutton']/parent::div[@class='form-group']"));
		 * loginButton.click();
		 */

		//loginBtn.click();
	}
}
