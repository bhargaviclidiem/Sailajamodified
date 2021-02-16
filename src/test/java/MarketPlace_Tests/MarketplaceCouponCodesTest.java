package MarketPlace_Tests;

import java.util.ArrayList;
import java.util.Base64;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ExtentReports.ExtentTestManager;
import HomePage_PageObject.HomePage;
import HomePage_PageObject.IndexPages;
import HomePage_PageObject.LoginPage;
import utilityLibrary.Helper;

public class MarketplaceCouponCodesTest {

	WebDriver driver;
	LoginPage objLoginPage;
	HomePage objHomePage;
	IndexPages objIndexPage;
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

	@Test(priority = 1, description = "MarketPlace with CouponCodes")
	public void MarketplaceCouponCodes() throws Exception {
		
		ExtentTestManager.getTest().setDescription("Marketplace with CouponCodes");

		Thread.sleep(2000);
		objIndexPage.marketPlaceMainLnk.click();
		Thread.sleep(2000);
		//objIndexPage.marketPlacesSubLnk.click();
		Thread.sleep(2000);
		objIndexPage.CouponcodeBtn.click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 300)");

		for (int i = 1; i <= Helper.getLastRowMarketPlaceCouponCodes(); i++) {

			Thread.sleep(5000);
			objIndexPage.CouponCodeAddBtn.click();
			objIndexPage.CouponTitleTxtBx.sendKeys(Helper.getLastRowMarketPlaceCouponCodes(i, 2));
			Thread.sleep(2000);
			objIndexPage.CouponTypeDrpDwn(Helper.getLastRowMarketPlaceCouponCodes(i, 3));
			Thread.sleep(2000);
			String CouponTypeDrpDwn = (Helper.getLastRowMarketPlaceCouponCodes(i, 3));
			if (CouponTypeDrpDwn.equals("Event"))
			{
				objIndexPage.SelectSomeOptionEventDrpDwn(Helper.getLastRowMarketPlaceCouponCodes(i, 4));
			}
			else if (CouponTypeDrpDwn.equals("Hotels"))
			{
				objIndexPage.SelectSomeOptionHotelDrpDwn(Helper.getLastRowMarketPlaceCouponCodes(i, 4));
			}
			else
			{
				objIndexPage.SelectSomeOptionServicesDrpDwn(Helper.getLastRowMarketPlaceCouponCodes(i, 4));
			}
			objIndexPage.DescriptionCouponcodeTxtBx.sendKeys(Helper.getLastRowMarketPlaceCouponCodes(i, 5));
			objIndexPage.ActivationFromTxtCouponcodeBx.sendKeys(Helper.getLastRowMarketPlaceCouponCodes(i, 6));
			objIndexPage.ExpiryDateTxtCouponcodeBx.sendKeys(Helper.getLastRowMarketPlaceCouponCodes(i, 7));
			Thread.sleep(2000);
			objIndexPage.OfferTypeCouponcodeDrpDwn(Helper.getLastRowMarketPlaceCouponCodes(i, 8));

			String OfferTypeCouponcodeDrpDwn = (Helper.getLastRowMarketPlaceCouponCodes(i, 8));

			if (OfferTypeCouponcodeDrpDwn.equals("Percentage")) {
				objIndexPage.OfferTypeCouponcodeupto1.sendKeys(Helper.getLastRowMarketPlaceCouponCodes(i, 9));
				objIndexPage.OfferTypeCouponcodeupto2.sendKeys(Helper.getLastRowMarketPlaceCouponCodes(i, 10));

			} else {
				objIndexPage.OfferTypeCouponcodeAmounttxtbx.sendKeys(Helper.getLastRowMarketPlaceCouponCodes(i, 11));
				objIndexPage.OfferTypeCouponcodeAmounttxtbx.click();

			}

			objIndexPage.CouponCodeTxtBx.sendKeys(Helper.getLastRowMarketPlaceCouponCodes(i, 12));
			objIndexPage.UsersDrpDwn(Helper.getLastRowMarketPlaceCouponCodes(i, 13));
			objIndexPage.NoofUserCouponcodeTxtBx.sendKeys(Helper.getLastRowMarketPlaceCouponCodes(i, 14));
			objIndexPage.NoofUserCouponcodeTxtBx.click();
			objIndexPage.SaveCouponcodeBtn.click();

		}
	}

}
