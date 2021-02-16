package MarketPlace_Tests;

import java.util.ArrayList;
import java.util.Base64;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ExtentReports.ExtentTestManager;
import HomePage_PageObject.HomePage;
import HomePage_PageObject.IndexPages;
import HomePage_PageObject.LoginPage;
import MarketplacePage_PageObject.MarketplaceHotelsPage;
import utilityLibrary.Helper;

public class MarketplaceServicesTest {

	WebDriver driver;
	LoginPage objLoginPage;
	HomePage objHomePage;
	IndexPages objIndexPage;
	MarketplaceHotelsPage objMarketplaceHotelsPage;
	JavascriptExecutor js;

	@BeforeClass
	public void setUp() throws Exception {
		// Open the application under test
		driver = Helper.openAUT(driver);
		objLoginPage = new LoginPage(driver);
		objHomePage = new HomePage(driver);
		objIndexPage = new IndexPages(driver);
		js = (JavascriptExecutor) driver;

		objHomePage.loginLnk.click();
		Thread.sleep(20000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("The number of windows are: " + tabs.size());
		driver.switchTo().window(tabs.get(1));

		// use https://www.base64encode.org/ for encoding and decoding creds
		objLoginPage.login(Helper.getValue("userName"),
				(new String(Base64.getDecoder().decode(Helper.getValue("password")))));
		Thread.sleep(10000);

	}

	@Test(priority = 1, description = "MarketPlace with Services")
	public void MarketplaceServices() throws Exception {
		
//		ExtentTestManager.getTest().setDescription("Marketplace with Services");

		Thread.sleep(2000);
		objIndexPage.marketPlaceMainLnk.click();
		Thread.sleep(2000);
		//objIndexPage.marketPlacesSubLnk.click();
		Thread.sleep(2000);
		objIndexPage.ServicesTabLnk.click();
		Thread.sleep(5000);
		objIndexPage.AddNewServicesBtn.click();
		Thread.sleep(5000);
		
		// Market Place Services

		for (int i = 1; i <= Helper.getLastRowMarketPlaceServices(); i++) 
		{
			
			objIndexPage.serviceNameTxtBx.sendKeys(Helper.getLastRowMarketPlaceServices(i, 2));
			objIndexPage.serviceDescriptionTxtBx.sendKeys(Helper.getLastRowMarketPlaceServices(i, 3));
			objIndexPage.serviceDurationDrpDwn(Helper.getLastRowMarketPlaceServices(i, 4));
			objIndexPage.ActivefromServiceDate.sendKeys(Helper.getLastRowMarketPlaceServices(i, 5));
			objIndexPage.ActivetoServiceDate.sendKeys(Helper.getLastRowMarketPlaceServices(i, 6));
			objIndexPage.servicePriceTxtBx.sendKeys(Helper.getLastRowMarketPlaceServices(i, 7));
			objIndexPage.UrlServiceTxtBx.sendKeys(Helper.getLastRowMarketPlaceServices(i, 8));
			objIndexPage.serviceTransactionchargesDrpDwn(Helper.getLastRowMarketPlaceServices(i, 9));
			objIndexPage.saveServiceBtn.click();
			Thread.sleep(5000);
			objIndexPage.AddNewServicesBtn.click();
			
		} // loop increment is closed
		
		
	} // Test Case closed
	
	@AfterTest
	public void tearDown() {
		// closing all the browser windows
		driver.quit();
	}

}// Main Java class closed
