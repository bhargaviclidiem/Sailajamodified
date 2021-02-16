package HomePage_Tests;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BasePackage.BaseTest;
import ExtentReports.ExtentTestManager;
import HomePage_PageObject.HomePage;
import HomePage_PageObject.IndexPages;
import HomePage_PageObject.LoginPage;
import HomePage_PageObject.Logout;
import utilityLibrary.Helper;

public class LoginTest {
	public WebDriver driver;
	LoginPage objLoginPage;
	HomePage objHomePage;
	IndexPages objIndexPage;
	//Logout logoutPage=new Logout();

	
	  @BeforeClass 
	  public void setUp() throws Exception { 
		  // Open the application under test 
		 // driver = Helper.openAUT(driver);
		  driver =BaseTest.setup();
		  objLoginPage = new LoginPage(driver); 
		  objIndexPage=new IndexPages(driver);
	  System.out.println("driver intiated");
	  
	  }
	 
//@Test(priority = 1, description = "Verify whether user is able to login")
	@Test( description = "Verify whether user is able to login",groups = { "Sanity" })
	public void testCase_01(Method method) throws Exception {
	ExtentTestManager.startTest(method.getName(), "Invalid Login Scenario with empty username and password.");
		ExtentTestManager.getTest().setDescription("Login Testcase");
		
		Thread.sleep(15000);
		
		
		objLoginPage.login(Helper.getValue("userName"),Helper.getValue("password"));
		Thread.sleep(10000);
		Helper.takeScreenshot(driver);
		System.out.println("Helper getDFDData ::"+Helper.getDFDData(2, "LoginPage"));
		Assert.assertEquals(driver.getTitle(), Helper.getDFDData(2, "LoginPage"));
		System.out.println("Logout going to execute");
		Helper.takeScreenshot(driver);
		
		
		
		objIndexPage.logout(driver);
		
		//logoutPage.logout(driver);
		/*
		 * @FindBy(xpath =
		 * "//a[@id='menu1']/img[@class='online']")////*[@id='header']/div[3]/div/div[4]
		 * /a/span public WebElement userDrpdwnLnk;
		 * 
		 * @FindBy(xpath =
		 * "//div[@class='collapse dropdown-menu']/ul/li[8]/a")//*[@id='header']/div[3]/
		 * div/div[4]/div/ul/li[5]/a public WebElement logoutLnk;
		 */
		
		/*
		 * WebElement userDrpdwnLnk=driver.findElement(By.xpath(
		 * "//a[@id='menu1']/img[@class='online']")); userDrpdwnLnk.click();
		 */
		//Thread.sleep(5000);
	}

/*	@Test(priority = 2, description = "Verify whether the users are able to login", dataProvider = "loginData")
	public void testCase_02(String userName, String password) throws Exception {
		objHomePage.loginLnk.click();
		Thread.sleep(6000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		// use https://www.base64encode.org/ for encoding and decoding creds
		objLoginPage.login(userName, password);
		Thread.sleep(10000);
		Helper.takeScreenshot(driver);
		Assert.assertEquals(driver.getTitle(), Helper.getDFDData(2, "LoginPage"));
		objIndexPage.logout(driver);
		Thread.sleep(5000);
	}
*/
	
	/*
	 * @DataProvider public Object[][] loginData() throws IOException {
	 * 
	 * Object[][] data = { { Helper.getData("LoginPage",5,3),
	 * Helper.getData("LoginPage",5,4) }, { "user1", "password1" } }; return data; }
	 */
/*	@Test( description = "Verify whether user is able to login secondtime",groups = { "Sanity" })
	public void testCase_02() throws Exception {
		
		Thread.sleep(15000);
		
		System.out.println("before Login_Method"+Helper.getValue("userName"));
		System.out.println("before Login_Method"+Helper.getValue("password"));
		objLoginPage.login(Helper.getValue("userName"),Helper.getValue("password"));
		Thread.sleep(10000);
		Helper.takeScreenshot(driver);
		System.out.println("Helper getDFDData ::"+Helper.getDFDData(2, "LoginPage"));
		Assert.assertEquals(driver.getTitle(), Helper.getDFDData(2, "LoginPage"));
		System.out.println("Logout going to execute");
		
		
		//logoutPage.logout(driver);
		objIndexPage.logout(driver);
		
		
		
	}
*/

	@AfterClass
	public void tearDown() {
		//driver.quit();
	}

}
