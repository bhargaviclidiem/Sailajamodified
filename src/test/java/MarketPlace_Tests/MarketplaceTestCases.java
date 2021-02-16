package MarketPlace_Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import ExtentReports.ExtentTestManager;
import HomePage_PageObject.HomePage;
import HomePage_PageObject.IndexPages;
import HomePage_PageObject.LoginPage;
import MarketplacePage_PageObject.MarketplaceHotelsPage;

public class MarketplaceTestCases extends MarketplaceMethods {

	WebDriver driver;
	IndexPages objIndexPage;
	MarketplaceHotelsPage objMarketplaceHotelsPage;
	JavascriptExecutor js;
	LoginPage objLoginPage;
	HomePage objHomePage;

	// Marketplace Test Cases

//	@Test(description = "MarketPlaceTicket_General_Ipay_Lpage_Refund_Percentage")
	public void TestCase601_1_MarketPlaceTicket_General_Ipay_Lpage_Refund_Percentage() throws Exception {

		// ExtentTestManager.getTest().setDescription("MarketPlaceTicket_General_Ipay_Lpage_Refund_Percentage");

		MarketplaceTestCases sat2 = new MarketplaceTestCases();

		sat2.loginMarketplace();
		Thread.sleep(2000);
		for (int i = 2; i <= 2;) {

			sat2.MarketPlaceTickets(i);
			Thread.sleep(2000);
			break;
		}
		// sat2.CloseMarketplaceWindow();
	}

//	@Test(description = "MarketPlaceTicket_Donations_Ipay_Lpage_Refund_Percentage")
	public void TestCase601_2_MarketPlaceTicket_Donations_Ipay_Lpage_Refund_Percentage() throws Exception {

		// ExtentTestManager.getTest().setDescription("MarketPlaceTicket_Donations_Ipay_Lpage_Refund_Percentage");

		MarketplaceTestCases sat3 = new MarketplaceTestCases();

		sat3.loginMarketplace();
		Thread.sleep(2000);
		for (int i = 3; i <= 3;) {

			sat3.MarketPlaceTickets(i);
			Thread.sleep(2000);
			break;
		}
		// sat3.CloseMarketplaceWindow();
	}
	
//	@Test(description = "MarketPlaceTicket_Raffle_Ipay_Lpage_Refund_Percentage")
	public void TestCase601_3_MarketPlaceTicket_Raffle_Ipay_Lpage_Refund_Percentage() throws Exception {

		// ExtentTestManager.getTest().setDescription("MarketPlaceTicket_Raffle_Ipay_Lpage_Refund_Percentage");

		MarketplaceTestCases sat4 = new MarketplaceTestCases();

		sat4.loginMarketplace();
		Thread.sleep(2000);
		for (int i = 4; i <= 4;) {

			sat4.MarketPlaceTickets(i);
			Thread.sleep(2000);
			break;
		}
		// sat4.CloseMarketplaceWindow();
	}

//	 @Test(description = "MarketPlaceServices_Service_IwillPay_Daily")
	public void TestCase602_1_MarketPlaceServices_Service_IwillPay_Daily() throws Exception {

//		ExtentTestManager.getTest().setDescription("MarketPlaceServices_Service_IwillPay_Daily");

		 MarketplaceTestCases sat4 = new MarketplaceTestCases();
		 
		sat4.loginMarketplace();
		Thread.sleep(2000);
		for (int i = 2; i <= 2;) {

			sat4.MarketplaceServices(i);
			Thread.sleep(2000);
			break;
		}
//		sat4.CloseMarketplaceWindow();
	}

//	 @Test(description = "MarketPlaceServices_Service_PartiWillPay_Daily")
	public void TestCase602_2_MarketPlaceServices_Service_PartiWillPay_Daily() throws Exception {

//		ExtentTestManager.getTest().setDescription("MarketPlaceServices_Service_PartiWillPay_Daily");

		 MarketplaceTestCases sat5 = new MarketplaceTestCases();
		 
		sat5.loginMarketplace();
		Thread.sleep(2000);
		for (int i = 6; i <= 6;) {

			sat5.MarketplaceServices(i);
			Thread.sleep(2000);
			break;

		}

//		sat5.CloseMarketplaceWindow();
	}

//	@Test(description = "MarketPlaceHotels_WillPay Refund Percentage")
	public void TestCase603_1_MarketPlaceHotels_WillPay_Refund_Percentage() throws Exception {

//		ExtentTestManager.getTest().setDescription("MarketPlaceHotels_WillPay Refund Percentage");

		 MarketplaceTestCases sat6 = new MarketplaceTestCases();
		 
		sat6.loginMarketplace();
		Thread.sleep(2000);

		for (int i = 2; i <= 2;) {

			sat6.MarketPlaceHotel(i);
			Thread.sleep(2000);
			break;
		}

//		this.CloseMarketplaceWindow();

	}

//	 @Test(description = "MarketPlaceHotels_PartWillPay Refund Amount")
	public void TestCase603_2_MarketPlaceHotels_PartWillPay_Refund_Amount() throws Exception {

//		ExtentTestManager.getTest().setDescription("MarketPlaceHotels_PartWillPay Refund Amount");

		MarketplaceTestCases sat7 = new MarketplaceTestCases();
		
		sat7.loginMarketplace();
		Thread.sleep(2000);

		for (int i = 6; i <= 6;) {

			sat7.MarketPlaceHotel(i);
			Thread.sleep(2000);
			break;
		}

//		sat7.CloseMarketplaceWindow();
	}

//	 @Test(description = "MarketPlaceSponsorPackage")
	public void TestCase604_MarketPlaceSponsorPackage() throws Exception {

//		ExtentTestManager.getTest().setDescription("MarketPlaceSponsorPackage");

		 MarketplaceTestCases sat8 = new MarketplaceTestCases();
		 
		 sat8.loginMarketplace();
		Thread.sleep(2000);

		for (int i = 2; i <= 2;) {

			sat8.MarketPlaceSponsorPackage(i);
			Thread.sleep(2000);
			break;
		}

//		sat8.CloseMarketplaceWindow();
	}

//	 @Test(description = "MarketPlace_EventAmount")
	public void TestCase605_1_MarketplaceCouponCodes_EventAmount() throws Exception {

//		ExtentTestManager.getTest().setDescription("MarketPlace_EventAmount");
		
		MarketplaceTestCases sat9 = new MarketplaceTestCases();

		sat9.loginMarketplace();
		Thread.sleep(2000);
		for (int i = 2; i <= 2;) {

			sat9.MarketplaceCouponCodes(i);
			Thread.sleep(2000);
			break;
		}

//		sat9.CloseMarketplaceWindow();
	}

//	@Test(description = "MarketPlace_EventPercentage")
	public void TestCase605_2_MarketplaceCouponCodes_EventPercentage() throws Exception {

//		ExtentTestManager.getTest().setDescription("MarketPlace_EventPercentage");

		MarketplaceTestCases sat10 = new MarketplaceTestCases();
		
		sat10.loginMarketplace();
		Thread.sleep(2000);

		int i = 5;

		while (i <= 5) {
			sat10.MarketplaceCouponCodes(i);
			Thread.sleep(2000);
			break;

		}

//		sat10.CloseMarketplaceWindow();

	}
	
//	@Test(description = "MarketPlace_EventPercentage")
	public void TestCase605_3_MarketplaceCouponCodes_EventPercentage() throws Exception {

//		ExtentTestManager.getTest().setDescription("MarketPlace_EventPercentage");

		MarketplaceTestCases sat10 = new MarketplaceTestCases();
		
		sat10.loginMarketplace();
		Thread.sleep(2000);

		int i = 5;

		while (i <= 5) {
			sat10.MarketplaceCouponCodes(i);
			Thread.sleep(2000);
			break;

		}

//		sat10.CloseMarketplaceWindow();

	}

}
