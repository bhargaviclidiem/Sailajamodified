package MarketPlace_Tests;

import java.util.ArrayList;
import java.util.Base64;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import ExtentReports.ExtentTestManager;
import HomePage_PageObject.HomePage;
import HomePage_PageObject.IndexPages;
import HomePage_PageObject.LoginPage;
import MarketplacePage_PageObject.MarketplaceHotelsPage;
import utilityLibrary.Helper;

public class MarketplaceMethods {

	WebDriver driver;
	IndexPages objIndexPage;
	MarketplaceHotelsPage objMarketplaceHotelsPage;
	JavascriptExecutor js;
	LoginPage objLoginPage;
	HomePage objHomePage;

	public void loginMarketplace() throws Exception {
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

		Thread.sleep(2000);
		objIndexPage.ThreeDotsTab.click();
		Thread.sleep(2000);
		objIndexPage.marketPlaceMainLnk.click();
		Thread.sleep(2000);
	
	}

	public void CloseMarketplaceWindow() throws Exception {

		driver.quit();

	}

	public void MarketPlaceTickets(int row) throws Exception {

		Thread.sleep(2000);
		objIndexPage.TicketsTabLnk.click();
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200)");
		// Market Place Tickets

		Thread.sleep(2000);
		objIndexPage.AddNewTicketBtn.click();
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, -500)");
		Thread.sleep(5000);

		Thread.sleep(2000);
		objIndexPage.EventNameDropDwn(Helper.getData("MarketPlace-Tickets", row , 2));
		Thread.sleep(2000);
		objIndexPage.TransactionChargesTicketsDrpDwn(Helper.getData("MarketPlace-Tickets", row , 3));
		objIndexPage.salesStartDateTicket.clear();
		objIndexPage.salesStartDateTicket.sendKeys(Helper.getData("MarketPlace-Tickets", row , 4));
		objIndexPage.salesStartDateTicket.click();
		objIndexPage.salesEndDateTicket.clear();
		objIndexPage.salesEndDateTicket.sendKeys(Helper.getData("MarketPlace-Tickets", row , 5));
		objIndexPage.salesEndDateTicket.click();
		objIndexPage.ticketsAllowPerOrderTxtBx.clear();
		objIndexPage.ticketsAllowPerOrderTxtBx.sendKeys(Helper.getData("MarketPlace-Tickets", row , 6));
//		objIndexPage.SetLandingPageChkBtn(Helper.getData("MarketPlace-Tickets", row , 7));
//		objIndexPage.SetLandingPageURLTxtBx.sendKeys(Helper.getData("MarketPlace-Tickets", row , 8));
//		objIndexPage.AllAttendeesToRegisterChkBx.click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 1000)");
		Thread.sleep(2000);
		objIndexPage.ReturnPolicyRadioBtn(Helper.getData("MarketPlace-Tickets", row , 10));

		String ReturnPolicyRadioBtn = (Helper.getData("MarketPlace-Tickets", row , 10));

		if (ReturnPolicyRadioBtn.equals("Refund")) {
			objIndexPage.RefundTypeDrpDwn.sendKeys(Helper.getData("MarketPlace-Tickets", row , 11));
			objIndexPage.RefundAmountTxt.sendKeys(Helper.getData("MarketPlace-Tickets", row , 12));
			objIndexPage.RefundDaysTxtBx.clear();
			objIndexPage.RefundDaysTxtBx.sendKeys(Helper.getData("MarketPlace-Tickets", row , 13));
			objIndexPage.AddRefundTicketsBtn.click();
			Thread.sleep(2000);
		}

		else {

		}
		objIndexPage.cancellationPolicyTxtBx.clear();
		objIndexPage.cancellationPolicyTxtBx.sendKeys(Helper.getData("MarketPlace-Tickets", row , 14));
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 1000)");
		Thread.sleep(2000);
		objIndexPage.AddTicketBtnTicket.click();
		objIndexPage.TicketNameTxtBx.sendKeys(Helper.getData("MarketPlace-Tickets", row , 15));
		objIndexPage.TicketTypeDropDwn(Helper.getData("MarketPlace-Tickets", row , 16));
//		objIndexPage.BadgeTemplateDropDwn(Helper.getData("MarketPlace-Tickets", row , 17));
		objIndexPage.quantityTxtBx.sendKeys(Helper.getData("MarketPlace-Tickets", row , 18));
		objIndexPage.priceTicketsDropDwn(Helper.getData("MarketPlace-Tickets", row , 19));
		objIndexPage.PricevalueTxtBx.sendKeys(Helper.getData("MarketPlace-Tickets", row , 20));
		objIndexPage.SeesionTypeDrpDwn(Helper.getData("MarketPlace-Tickets", row , 21));
		objIndexPage.AteendeeRegistrationFormDrpDwn(Helper.getData("MarketPlace-Tickets", row , 22));
		objIndexPage.descriptionTicketsTxtBx.sendKeys(Helper.getData("MarketPlace-Tickets", row , 23));
		objIndexPage.AddTicketsBtn.click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 1500)");
		Thread.sleep(2000);
		objIndexPage.saveTicketBtn.click();

	}

	public void MarketplaceServices(int row) throws Exception {

		objIndexPage.ServicesTabLnk.click();
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("scroll(0, 1000);");
		objIndexPage.AddNewServicesBtn.click();
		Thread.sleep(5000);

		objIndexPage.serviceNameTxtBx.sendKeys(Helper.getData("MarketPlace-Services", row, 2));
		objIndexPage.serviceDescriptionTxtBx.sendKeys(Helper.getData("MarketPlace-Services", row, 3));
		objIndexPage.serviceDurationDrpDwn(Helper.getData("MarketPlace-Services", row, 4));
		objIndexPage.ActivefromServiceDate.sendKeys(Helper.getData("MarketPlace-Services", row, 5));
		objIndexPage.ActivetoServiceDate.sendKeys(Helper.getData("MarketPlace-Services", row, 6));
		objIndexPage.PriceDrpDwn(Helper.getData("MarketPlace-Services", row, 7));
		objIndexPage.servicePriceTxtBx.sendKeys(Helper.getData("MarketPlace-Services", row, 8));
		objIndexPage.UrlServiceTxtBx.sendKeys(Helper.getData("MarketPlace-Services", row, 9));
		objIndexPage.serviceTransactionchargesDrpDwn(Helper.getData("MarketPlace-Services", row, 10));
		Thread.sleep(2000);
		objIndexPage.saveServiceBtn.click();
		Thread.sleep(2000);

	}

	public void MarketPlaceHotel(int row) throws Exception {

		Thread.sleep(2000);
		objIndexPage.HotelsTabLnk.click();
		Thread.sleep(5000);
		objIndexPage.AddNewHotelClkBtn.click();
		Thread.sleep(5000);

		// Market Place Services

		objIndexPage.Hotellogo.sendKeys(Helper.getData("MarketPlace-Hotels", row, 2));
		((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
		Thread.sleep(3000);
		Helper.takeScreenshot(driver);
		objIndexPage.HotelCropandProceed.click();
		Thread.sleep(3000);

		objIndexPage.HotelNameTxtBx.sendKeys(Helper.getData("MarketPlace-Hotels", row, 3));
		objIndexPage.EventHotelTypeDrpDwn(Helper.getData("MarketPlace-Hotels", row, 4));
		objIndexPage.EventHotelDrpDwn(Helper.getData("MarketPlace-Hotels", row, 5));
		objIndexPage.TransactionChargesHotelDrpDwn(Helper.getData("MarketPlace-Hotels", row, 6));
		objIndexPage.LocationHotelTxtBx.sendKeys(Helper.getData("MarketPlace-Hotels", row, 7));
		objIndexPage.SalesStartDateHotel.clear();
		objIndexPage.SalesStartDateHotel.sendKeys(Helper.getData("MarketPlace-Hotels", row, 8));
		objIndexPage.SalesEndDateHotel.clear();
		objIndexPage.SalesEndDateHotel.sendKeys(Helper.getData("MarketPlace-Hotels", row, 9));
		objIndexPage.HotelDescriptionTxtBx.sendKeys(Helper.getData("MarketPlace-Hotels", row, 10));
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 300	)");
		Thread.sleep(2000);

		objIndexPage.HotelReturnPolicyRadioBtn(Helper.getData("MarketPlace-Hotels", row, 11));

		String HotelReturnPolicyRadioBtn = (Helper.getData("MarketPlace-Hotels", row, 11));

		if (HotelReturnPolicyRadioBtn.equals("Refund"))

		{
			Thread.sleep(2000);
			objIndexPage.HotelRefundTypeDrpDwn(Helper.getData("MarketPlace-Hotels", row, 12));
			objIndexPage.HotelRefundTypeAmount.sendKeys(Helper.getData("MarketPlace-Hotels", row, 13));
			objIndexPage.RefundDaysEventTxtBx.sendKeys(Helper.getData("MarketPlace-Hotels", row, 14));
			objIndexPage.HotelRefundaddBtn.click();
		}

		else {

		}

		objIndexPage.CancellationPolicyHotelTxtBx.sendKeys(Helper.getData("MarketPlace-Hotels", row, 15));
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 800)");
		Thread.sleep(2000);
		objIndexPage.AddRoomsHotelBtn.click();
		objIndexPage.RoomNameHotelTxtBx.sendKeys(Helper.getData("MarketPlace-Hotels", row, 16));
		objIndexPage.QuantityHotelTxtBx.sendKeys(Helper.getData("MarketPlace-Hotels", row, 17));
		objIndexPage.PriceHotelDrpDwn(Helper.getData("MarketPlace-Hotels", row, 18));
		objIndexPage.PriceValueTxtBx.sendKeys(Helper.getData("MarketPlace-Hotels", row, 19));
		objIndexPage.AllEventPrice.sendKeys(Helper.getData("MarketPlace-Hotels", row, 20));
//		objIndexPage.DescriptionHotelTxtBx.sendKeys(Helper.getData("MarketPlace-Hotels", row, 21));
		Thread.sleep(2000);
		objIndexPage.AddHotelRoomBtn.click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 800)");
		Thread.sleep(2000);
		objIndexPage.SaveHotelBtn.click();
		Thread.sleep(2000);
//		objIndexPage.AddNewHotelClkBtn.click();
		Thread.sleep(5000);

	}

	public void MarketPlaceSponsorPackage(int row) throws Exception {

		Thread.sleep(2000);
		objIndexPage.sponsorTabBtn.click();
		Thread.sleep(2000);
		objIndexPage.addsponsorBtn.click();

		objIndexPage.SponsorGroupName.sendKeys(Helper.getData("MarketPlace-SponsorPackage", row, 2));
		objIndexPage.SponsorGroupDescriptionTxtBx.sendKeys(Helper.getData("MarketPlace-SponsorPackage", row, 3));
		objIndexPage.AddPackageBx.click();
		objIndexPage.PackageName.sendKeys(Helper.getData("MarketPlace-SponsorPackage", row, 4));
		objIndexPage.selectSponsorRegistrationFormDrp(Helper.getData("MarketPlace-SponsorPackage", row, 5));
		objIndexPage.selectSponsorPriceDrp(Helper.getData("MarketPlace-SponsorPackage", row, 6));
		objIndexPage.SponsorAmountTxtBx.sendKeys(Helper.getData("MarketPlace-SponsorPackage", row, 7));
		objIndexPage.SponsorDiscountAmountTxtBx.sendKeys(Helper.getData("MarketPlace-SponsorPackage", row, 8));
		objIndexPage.NoofFreeTicketsTxtBx.sendKeys(Helper.getData("MarketPlace-SponsorPackage", row, 9));
		objIndexPage.FeaturesTxtBx.sendKeys(Helper.getData("MarketPlace-SponsorPackage", row, 10));
		objIndexPage.AddpackagesBtn.click();
		objIndexPage.SponsorSaveBtn.click();

	}

	public void MarketplaceCouponCodes(int row) throws Exception {

		Thread.sleep(2000);
		objIndexPage.CouponcodeBtn.click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 300)");

		Thread.sleep(5000);
		objIndexPage.CouponCodeAddBtn.click();
		objIndexPage.CouponTitleTxtBx.sendKeys(Helper.getData("MarketPlace-CouponCodes", row, 2));
		Thread.sleep(2000);
		objIndexPage.CouponTypeDrpDwn(Helper.getData("MarketPlace-CouponCodes", row, 3));
		Thread.sleep(2000);
		String CouponTypeDrpDwn = (Helper.getData("MarketPlace-CouponCodes", row, 3));
		if (CouponTypeDrpDwn.equals("Event")) {
			objIndexPage.SelectSomeOptionEventDrpDwn(Helper.getData("MarketPlace-CouponCodes", row, 4));
		} else if (CouponTypeDrpDwn.equals("Hotels")) {
			objIndexPage.SelectSomeOptionHotelDrpDwn(Helper.getData("MarketPlace-CouponCodes", row, 4));
		} else {
			objIndexPage.SelectSomeOptionServicesDrpDwn(Helper.getData("MarketPlace-CouponCodes", row, 4));
		}
		objIndexPage.DescriptionCouponcodeTxtBx.sendKeys(Helper.getData("MarketPlace-CouponCodes", row, 5));
		objIndexPage.ActivationFromTxtCouponcodeBx.sendKeys(Helper.getData("MarketPlace-CouponCodes", row, 6));
		objIndexPage.ExpiryDateTxtCouponcodeBx.sendKeys(Helper.getData("MarketPlace-CouponCodes", row, 7));
		Thread.sleep(2000);
		objIndexPage.OfferTypeCouponcodeDrpDwn(Helper.getData("MarketPlace-CouponCodes", row, 8));

		String OfferTypeCouponcodeDrpDwn = (Helper.getData("MarketPlace-CouponCodes", row, 8));

		if (OfferTypeCouponcodeDrpDwn.equals("Amount")) {

			objIndexPage.OfferTypeCouponcodeAmounttxtbx.sendKeys(Helper.getData("MarketPlace-CouponCodes", row, 11));
			objIndexPage.OfferTypeCouponcodeAmounttxtbx.click();

		} else {

			objIndexPage.OfferTypeCouponcodeupto1.sendKeys(Helper.getData("MarketPlace-CouponCodes", row, 9));
			objIndexPage.OfferTypeCouponcodeupto2.sendKeys(Helper.getData("MarketPlace-CouponCodes", row, 10));

		}

		objIndexPage.CouponCodeTxtBx.sendKeys(Helper.getData("MarketPlace-CouponCodes", row, 12));
		objIndexPage.UsersDrpDwn(Helper.getData("MarketPlace-CouponCodes", row, 13));
		objIndexPage.NoofUserCouponcodeTxtBx.sendKeys(Helper.getData("MarketPlace-CouponCodes", row, 14));
		objIndexPage.NoofUserCouponcodeTxtBx.click();
		objIndexPage.SaveCouponcodeBtn.click();

	}


}
