package SubscriptionsPage;

import java.util.ArrayList;
import java.util.Base64;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import HomePage_PageObject.HomePage;
import HomePage_PageObject.IndexPage;
import HomePage_PageObject.IndexPages;
import HomePage_PageObject.LoginPage;
import SurveyPage_PageObjects.CreateSurveyQuestionsPage;
import SurveyPage_PageObjects.SurveyQuestionsPage;
import utilityLibrary.Helper;

public class SubscriptionMethods {

	

		WebDriver driver;
		LoginPage objLoginPage;
		HomePage objHomePage;
		IndexPage objIndexPage;
		CreateSurveyQuestionsPage objCreateSurveyQuestionsPage;
		JavascriptExecutor js;

		// Login and Quit Methods

		public void Login() throws Exception {
			
			// Open the application under test
			driver = Helper.openAUT(driver);
			objLoginPage = new LoginPage(driver);
			objHomePage = new HomePage(driver);
			objIndexPage = new IndexPage(driver);
			
			objCreateSurveyQuestionsPage = new CreateSurveyQuestionsPage(driver);

			objHomePage.loginLnk.click();
			Thread.sleep(20000);
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			System.out.println("The number of windows are: " + tabs.size());
			driver.switchTo().window(tabs.get(1));

			// use https://www.base64encode.org/ for encoding and decoding creds
			objLoginPage.login(Helper.getValue("userName"),
					(new String(Base64.getDecoder().decode(Helper.getValue("password")))));
			Thread.sleep(10000);

			Thread.sleep(2000);
			objIndexPage.EventLnk.click();
			Thread.sleep(10000);
		
		}

		public void Subscriptions(int row) throws Exception {
		
			//objIndexPage.SubscriptionsLnk.click();
			Thread.sleep(5000);
			objIndexPage.SubscriptionsplusBtn.click();
			Thread.sleep(2000);
			
			
//String CrtSubRdbtn = Helper.getData("Subscriptions", 2, 2);
//			
//			if (CrtSubRdbtn.contains("Subscription")){
				
				objIndexPage.SubscriptionNameTxtBx.sendKeys(Helper.getData("Subscriptions", row, 3));
				
				objIndexPage.selectSubscriptionRenewalPeriodDrpDwn(Helper.getData("Subscriptions", row, 4));
			
				objIndexPage.selectSubscriptionDurationDrpDwn(Helper.getData("Subscriptions", row, 5));
				
				objIndexPage.selectSubscriptionMaxsubscriptionDrpdwn(Helper.getData("Subscriptions", row, 6));
				
				objIndexPage.BundleTxtbx.sendKeys(Helper.getData("Subscriptions", row, 7));
				
				objIndexPage.selectSubscriptionTransctionchargesDrpDwn(Helper.getData("Subscriptions", row, 8));
				
				objIndexPage.RedirectURL.sendKeys(Helper.getData("Subscriptions", row, 9));
				
//			} else if (CrtSubRdbtn.contains("Products")) {
//
//				objIndexPage.ProductsRdbtn.click();
//				Thread.sleep(2000);
//				objIndexPage.SubscriptionNameTxtBx.sendKeys(Helper.getData("Subscriptions", row, 3));
//				
//				objIndexPage.selectSubscriptionRenewalPeriodDrpDwn(Helper.getData("Subscriptions", row, 4));
//			
//				objIndexPage.selectSubscriptionDurationDrpDwn(Helper.getData("Subscriptions", row, 5));
//				
//				objIndexPage.selectSubscriptionMaxsubscriptionDrpdwn(Helper.getData("Subscriptions", row, 6));
//				
////				String Maxnoof = Helper.getData("Subscriptions", row, 6);
////				
////				if (CrtSubRdbtn.contains("Individual")){
////					
////				
////			} else if (CrtSubRdbtn.contains("Bundle")) {
//				
//				objIndexPage.BundleTxtbx.sendKeys(Helper.getData("Subscriptions", row, 7));
//				
//				objIndexPage.selectSubscriptionTransctionchargesDrpDwn(Helper.getData("Subscriptions", row, 8));
//				
//				objIndexPage.RedirectURL.sendKeys(Helper.getData("Subscriptions", row, 9));
//					
			
			//objIndexPage.Subscriptionyourapproalchkbx.sendKeys(Helper.getData("Subscriptions", 2, 10));
				objIndexPage.isDisplayChkbx.click();
			
			((JavascriptExecutor) driver).executeScript("scroll(0, 300);");
			
			objIndexPage.SubscriptionDescriptionTxtBx.sendKeys(Helper.getData("Subscriptions", row, 11));
			
			((JavascriptExecutor) driver).executeScript("scroll(0, -900);");
			
			objIndexPage.Subimg1.sendKeys(Helper.getData("Subscriptions", row, 12));
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("scroll(0, 1000);");
			Thread.sleep(3000);
			objIndexPage.Subimg1Cropbtn.click();
			Thread.sleep(3000);
			((JavascriptExecutor) driver).executeScript("scroll(0, -900);");
//			
//			objIndexPage.imgplusBtn.click();
//			Thread.sleep(2000);
//			objIndexPage.subimg2.sendKeys(Helper.getData("Subscriptions", row, 13));
//			Thread.sleep(2000);
//			((JavascriptExecutor) driver).executeScript("scroll(0, 1000);");
//			objIndexPage.Subimg1Cropbtn.click();
			Thread.sleep(5000);
			((JavascriptExecutor) driver).executeScript("scroll(0, -500);");
			Thread.sleep(2000);
			objIndexPage.TaxesTxtBx.sendKeys(Helper.getData("Subscriptions", row, 14));
			Thread.sleep(2000);
			objIndexPage.ShortDescriptionTxtBx.sendKeys(Helper.getData("Subscriptions", row, 15));
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("scroll(0, 200);");
			objIndexPage.SubscriptionplusBtn.click();
			Thread.sleep(2000);
			objIndexPage.TaxesTxtBx2.sendKeys(Helper.getData("Subscriptions", row, 16));
			Thread.sleep(2000);
			objIndexPage.ShortDescriptionTxtBxtBx2.sendKeys(Helper.getData("Subscriptions", row, 17));
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
			
			String PriceQuantityChkBx = Helper.getData("Subscriptions", 2, 18);
			
			if (PriceQuantityChkBx.contains("single")){
				
			//	objIndexPage.Singlepricequantitychkbx.click();
				Thread.sleep(2000);
				objIndexPage.selectSubscriptionpricedrpdwn(Helper.getData("Subscriptions", row, 25));
				Thread.sleep(2000);
				objIndexPage.SubscriptionpriceTxtbx.sendKeys(Helper.getData("Subscriptions", row, 26));
				Thread.sleep(2000);
				objIndexPage.Promotionaltxtbx.sendKeys(Helper.getData("Subscriptions", row, 27));
				Thread.sleep(2000);
				objIndexPage.PromotionalPriceEndDateTxtBx.sendKeys(Helper.getData("Subscriptions", row, 28));
				Thread.sleep(2000);
				objIndexPage.AvailabilityStockTxtBx.sendKeys(Helper.getData("Subscriptions", row, 29));
				Thread.sleep(2000);
				objIndexPage.SubNextBtn.click();
				
			} else if (PriceQuantityChkBx.contains("Itemized")) {
				
				objIndexPage.itemizedpricequantitychkbx.click();
				Thread.sleep(2000);
				objIndexPage.selectitemOptionsDrp1(Helper.getData("Subscriptions", row, 19));
				Thread.sleep(2000);
				objIndexPage.OptionNameTxtbx1.sendKeys(Helper.getData("Subscriptions", row, 20));
				Thread.sleep(2000);
				objIndexPage.selectitemOptionsDrp2(Helper.getData("Subscriptions", row, 21));
				Thread.sleep(2000);
				objIndexPage.OptionNameTxtbx2.sendKeys(Helper.getData("Subscriptions", row, 22));
				Thread.sleep(2000);
				objIndexPage.selectitemOptionsDrp3(Helper.getData("Subscriptions", row, 23));
				Thread.sleep(2000);
				objIndexPage.OptionNameTxtbx3.sendKeys(Helper.getData("Subscriptions", row, 24));
				Thread.sleep(2000);
				objIndexPage.selectOptionPriceDrpDwn(Helper.getData("Subscriptions", row, 25));
				Thread.sleep(2000);
				objIndexPage.OptionPriceTxtBx.sendKeys(Helper.getData("Subscriptions", row, 26));
				Thread.sleep(2000);
				objIndexPage.OptionPromotionalPriceTxtBx.sendKeys(Helper.getData("Subscriptions", row, 27));
				Thread.sleep(2000);
				objIndexPage.OptionPPriceEndDate.sendKeys(Helper.getData("Subscriptions", row, 28));
				Thread.sleep(2000);
				objIndexPage.OptionAvailabilityStockTxtBx.sendKeys(Helper.getData("Subscriptions", row, 29));
				Thread.sleep(2000);
				objIndexPage.SubNextBtn.click();
				
				
			}
			}
		
			
			
			public void Reminders(int row) throws Exception {
			Thread.sleep(3000);
				objIndexPage.selectEmailTemplateDrpDwn(Helper.getData("Reminders", row, 3));
				Thread.sleep(2000);
				objIndexPage.selectEmailTemplateDrpDwn2(Helper.getData("Reminders", row, 4));
				Thread.sleep(2000);
				objIndexPage.NoofDaysTxtBx.sendKeys(Helper.getData("Reminders", row, 5));
				Thread.sleep(2000);
				objIndexPage.EmailTemplatePlusBtn.click();
				Thread.sleep(2000);
				objIndexPage.selectTemplateDrpDwn(Helper.getData("Reminders", row, 7));
				Thread.sleep(2000);
				objIndexPage.selectTemplateDrpDwn2(Helper.getData("Reminders", row, 8));
				Thread.sleep(2000);
				objIndexPage.NoofDaysTxtbx2.sendKeys(Helper.getData("Reminders", row, 9));
				Thread.sleep(2000);
				objIndexPage.NextBtn2.click();
			
			

			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}


