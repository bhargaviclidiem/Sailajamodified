package AffiliatePage;

import java.util.ArrayList;
import java.util.Base64;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import HomePage_PageObject.HomePage;
import HomePage_PageObject.IndexPage;
import HomePage_PageObject.LoginPage;

import utilityLibrary.Helper;

public class AffiliateMethods {

	
	
	
	WebDriver driver;
	LoginPage objLoginPage;
	HomePage objHomePage;
	IndexPage objIndexPage;
	
	JavascriptExecutor js;

	// Login and Quit Methods

	public void Login() throws Exception {
		
		// Open the application under test
		driver = Helper.openAUT(driver);
		objLoginPage = new LoginPage(driver);
		objHomePage = new HomePage(driver);
		objIndexPage = new IndexPage(driver);
		
		

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
		
		public void AffiliatePrograms(int row) throws Exception {
		Thread.sleep(2000);
		//objIndexPage.ThreeDotsTab.click();
		Thread.sleep(2000);
		objIndexPage.marketPlacestaging.click();
		Thread.sleep(2000);
		objIndexPage.AffiliateTab.click();
		Thread.sleep(2000);

		objIndexPage.AffiliateAddnewBtn.click();
		objIndexPage.CouponTitleTxtbx.sendKeys(Helper.getData("Affiliate", 2, 2));
		
		objIndexPage.selectCoupontypeDrp(Helper.getData("Affiliate", 2, 3));
		
		
		String Coupontype = Helper.getData("Affiliate", 2, 3);
		
		if (Coupontype.contains("Event")){
			
			Thread.sleep(2000);
			objIndexPage.Eventdrpdwn(Helper.getData("Affiliate", 2, 4));
			Thread.sleep(2000);
			objIndexPage.TicketsDrpDwn(Helper.getData("Affiliate", 2, 5));
	
			
		} else if (Coupontype.contains("Hotels")) {
			
			
			objIndexPage.HotelsDrpDwn(Helper.getData("Affiliate", 2, 6));
			Thread.sleep(2000);
		
		} else if (Coupontype.contains("Affiliate")) {
			
			objIndexPage.Subscriptionsdrpdwn(Helper.getData("Affiliate", 2, 7));
			
			
		}
			
		objIndexPage.Activationformdatetxtbx.sendKeys(Helper.getData("Affiliate", 2, 8));
		
		objIndexPage.Expiredatetxtbx.sendKeys(Helper.getData("Affiliate", 2, 9));
		
		
		objIndexPage.Referralfeedrpdwn(Helper.getData("Affiliate", 2, 10));
		
String ReferralFeeDrp = Helper.getData("Affiliate", 2, 10);
		
		if (ReferralFeeDrp.contains("Percentage")){
		
		objIndexPage.PercentageTxtbx.sendKeys(Helper.getData("Affiliate", 2, 11));
		
		objIndexPage.PercentageCurrencydrpdwn(Helper.getData("Affiliate", 2, 12));
		
		objIndexPage.PercentageCurrencytxtbx.sendKeys(Helper.getData("Affiliate", 2, 13));
		
		
		
		} else if (ReferralFeeDrp.contains("Amount")) {
		
		
	
		objIndexPage.Amountcurrencydrpdwn(Helper.getData("Affiliate", 2, 12));
		
		objIndexPage.Amountcurrencytxtbx.sendKeys(Helper.getData("Affiliate", 2, 13));
		
		}
		
		
		objIndexPage.Discountdrpdwn(Helper.getData("Affiliate", 2, 14));
		
String DiscountDrp = Helper.getData("Affiliate", 2, 14);
		
		if (DiscountDrp.contains("Percentage")){
		
		objIndexPage.Discountpercentagetxtbx.sendKeys(Helper.getData("Affiliate", 2, 15));
		
		objIndexPage.DiscountPercentageCurrencydrpdwn(Helper.getData("Affiliate", 2, 16));
		
		objIndexPage.DiscountPercentageCurrencyTxtbx.sendKeys(Helper.getData("Affiliate", 2, 17));
		
		
		
		} else if (DiscountDrp.contains("Amount")) {
		
		
	
		objIndexPage.DiscountAmountDrpdwn(Helper.getData("Affiliate", 2, 16));
		
		objIndexPage.DiscountAmountTxtbx.sendKeys(Helper.getData("Affiliate", 2, 17));
		
		}
		
		objIndexPage.AffiliatedescriptionTxtbx.sendKeys(Helper.getData("Affiliate", 2, 18));
		
		
		objIndexPage.ReferalCode.sendKeys(Helper.getData("Affiliate", 2, 19));
		
		objIndexPage.ReferrerEmailid.sendKeys(Helper.getData("Affiliate", 2, 20));
		
		objIndexPage.Noofusers.sendKeys(Helper.getData("Affiliate", 2, 22));
		
		objIndexPage.Affiliatesavebtn.click();
		
		
			
			
	

}
}