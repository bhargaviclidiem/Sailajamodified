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
import MarketplacePage_PageObject.MarketplaceHotelsPage;
import utilityLibrary.Helper;

public class MarketplaceHotelsTest {

	WebDriver driver;
	LoginPage objLoginPage;
	HomePage objHomePage;
	IndexPages objIndexPages;
	
	MarketplaceHotelsPage objMarketplaceHotelsPage;
	
	JavascriptExecutor js;

	@BeforeClass
	public void setUp() throws Exception {
		// Open the application under test
		driver = Helper.openAUT(driver);
		objLoginPage = new LoginPage(driver);
		objHomePage = new HomePage(driver);
		objIndexPages = new IndexPages(driver);
		objMarketplaceHotelsPage = new MarketplaceHotelsPage();
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

	@Test(priority = 1, description = "MarketPlace with Hotels")
	public void MarketPlaceHotel() throws Exception {

//		ExtentTestManager.getTest().setDescription("Marketplace with hotels");
		
		Thread.sleep(2000);
		objIndexPages.marketPlacestaging.click();
		Thread.sleep(2000);
		//objIndexPage.marketPlacesSubLnk.click();
		Thread.sleep(3000);
		//objIndexPages.HotelsTabLnk.click();
		Thread.sleep(3000);
		objIndexPages.AddNewHotelClkBtn.click();
		Thread.sleep(2000);
		
		// Market Place Services

		
			
//			WebElement UploadImg =driver.findElement(By.xpath("//*[@id='inputhotellogo']"));
//			UploadImg.sendKeys("C:\\Users\\Corevance-7\\Desktop\\Copany images\\All light CoreVance.png");
//			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
//			Thread.sleep(5000);
			
			
		//	objIndexPage.Hotellogo.sendKeys(Helper.getData("MarketPlace-Hotels", 2, 2));
	     //   ((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
//	        Thread.sleep(3000);
//	        Helper.takeScreenshot(driver);
//	        objIndexPage.HotelCropandProceed.click();
//	        Thread.sleep(3000);
		     objIndexPages.HotelNameTxtBx.click();
		     Thread.sleep(2000);
			objIndexPages.HotelNameTxtBx.sendKeys(Helper.getData("MarketPlace-Hotels", 2, 3));
			Thread.sleep(2000);
			objIndexPages.HoteleventDrpBx(Helper.getData("MarketPlace-Hotels", 2, 4));
			Thread.sleep(2000);
			//objIndexPage.TransactionChargesHotelDrpDwn(Helper.getData("EventStaging", row, 59));
			Thread.sleep(2000);
			objIndexPages.LocationHotelTxtBx.sendKeys(Helper.getData("MarketPlace-Hotels", 2, 7));
			Thread.sleep(2000);
			objIndexPages.SalesStartDateHotel.clear();
			Thread.sleep(2000);
			objIndexPages.SalesStartDateHotel.sendKeys(Helper.getData("MarketPlace-Hotels", 2, 8));
			Thread.sleep(2000);
			objIndexPages.SalesEndDateHotel.clear();
			objIndexPages.SalesEndDateHotel.sendKeys(Helper.getData("MarketPlace-Hotels", 2, 9));
			
			//objIndexPages.Isdisplaychkbx.click();
			
			objIndexPages.HotelDescriptionTxtBx.sendKeys(Helper.getData("MarketPlace-Hotels", 2, 10));
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 300	)");
			Thread.sleep(2000);
			
			objIndexPages.Hotelbookinglinktxtbx.sendKeys(Helper.getData("MarketPlace-Hotels", 2 ,6));
			
			objIndexPages.HotelReturnPolicyRadioBtn(Helper.getData("MarketPlace-Hotels", 2, 11));
			
			String HotelReturnPolicyRadioBtn = (Helper.getData("MarketPlace-Hotels", 2, 11));
			
			if (HotelReturnPolicyRadioBtn.equals("Refund")){
				
			
				Thread.sleep(2000);
				objIndexPages.HotelRefundTypeDrpDwn(Helper.getData("MarketPlace-Hotels", 2, 12));				
				objIndexPages.HotelRefundTypeAmount.sendKeys(Helper.getData("MarketPlace-Hotels", 2, 13));
				objIndexPages.RefundDaysEventTxtBx.sendKeys(Helper.getData("MarketPlace-Hotels", 2, 14));
				Thread.sleep(2000);
				objIndexPages.HotelRefundaddBtn.click();
				Thread.sleep(2000);
				((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 300)");
				objIndexPages.CancellationPolicyHotelTxtBx.sendKeys(Helper.getData("MarketPlace-Hotels", 2, 15));
				Thread.sleep(2000);
				
			
	} else if (HotelReturnPolicyRadioBtn.equals("No Refund")){
			
				objIndexPages.NoRefundHotelRadioBtn.click();
			
			objIndexPages.CancellationPolicyHotelTxtBx.sendKeys(Helper.getData("MarketPlace-Hotels", 2, 15));
			Thread.sleep(2000);
	}
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 800)");
			Thread.sleep(2000);
			objIndexPages.AddRoomsHotelBtn.click();
			
			//objIndexPages.AddRoomsHotellogo.sendKeys(Helper.getLastRowMarketPlaceHotels(2, 15));
			
			//objIndexPages.AddRoomsHotelCrpBtn.click();
			
			objIndexPages.RoomNameHotelTxtBx.sendKeys(Helper.getData("MarketPlace-Hotels", 2, 16));
			
			
			objIndexPages.QuantityHotelTxtBx.sendKeys(Helper.getData("MarketPlace-Hotels", 2, 17));
			objIndexPages.PriceHotelDrpDwn(Helper.getData("MarketPlace-Hotels", 2, 18));
			objIndexPages.PriceValueTxtBx.sendKeys(Helper.getData("MarketPlace-Hotels", 2, 19));
			// Xpath issue with Description 
			//objIndexPages.DescriptionHotelTxtBx.sendKeys(Helper.getLastRowMarketPlaceHotels(2, 19));
			Thread.sleep(2000);
			
			objIndexPages.AddHotelRoomBtn.click();
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 800)");
			Thread.sleep(2000);
			objIndexPages.SaveHotelBtn.click();
			Thread.sleep(2000);
			//objIndexPages.AddNewHotelClkBtn.click();
			Thread.sleep(5000);
	}
	}	
		// loop increment is closed

				
	
// Test Case closed

// Main Java class closed
