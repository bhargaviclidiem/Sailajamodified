package BoothsPage;

import java.util.ArrayList;
import java.util.Base64;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import EventPage_PageObject.CreateEventPage;
import HomePage_PageObject.HomePage;
import HomePage_PageObject.IndexPage;
import HomePage_PageObject.LoginPage;
import SurveyPage_Tests.SurveyRewardSingleWinnerTest;
import utilityLibrary.Helper;

public class BoothsMethods {

	

	WebDriver driver;
	LoginPage objLoginPage;
	HomePage objHomePage;
	IndexPage objIndexPage;
	JavascriptExecutor js;
	JavascriptExecutor jse;
	public int MultipleData = 0;

	// Main Flow

	// o LoginEvents
	// o CreateEventPage
	//  EventDetailPage
	//  EventDetailPageEventTicket
	// o EventOptinsPage
	// o EventTopicsPage
	//  EventTopicDetails
	//  PresentersDetails
	//  SpeakerDetails
	// o EventTicketsPage

	public void Login() throws Exception {
		// Open the application under test
		driver = Helper.openAUT(driver);
		objLoginPage = new LoginPage(driver);
		objHomePage = new HomePage(driver);
		objIndexPage = new IndexPage(driver);
		

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
	
		public void Boothslogin(int row) throws Exception {
			Thread.sleep(2000);
			objIndexPage.ThreeDotsTablocal.click();
			Thread.sleep(2000);
			objIndexPage.marketPlacelocal.click();
			Thread.sleep(2000);
			objIndexPage.BoothsBtn.click();
			Thread.sleep(2000);
			objIndexPage.AddnewBoothslnk.click();
			Thread.sleep(2000);
			objIndexPage.BoothEventDrpdwn(Helper.getData("Booths", 2, 2));
			Thread.sleep(2000);
			objIndexPage.BoothDescriptionTxtbx.sendKeys(Helper.getData("Booths", 2, 3));
			Thread.sleep(2000);
			objIndexPage.AddBoothBtn.click();
			Thread.sleep(2000);
			objIndexPage.CategoryNameTxtbx.sendKeys(Helper.getData("Booths", 2, 4));
			Thread.sleep(2000);
			objIndexPage.SizeinftXaxis.sendKeys(Helper.getData("Booths", 2, 5));
			Thread.sleep(2000);
			objIndexPage.Sizeyaxistxtbx.sendKeys(Helper.getData("Booths", 2, 6));
			Thread.sleep(2000);
			objIndexPage.Pricedrpdwn(Helper.getData("Booths", 2, 7));
			Thread.sleep(2000);
			objIndexPage.Pricetxtbx.sendKeys(Helper.getData("Booths", 2, 8));
			Thread.sleep(2000);
			objIndexPage.AdditionalFeaturesDrpdwn(Helper.getData("Booths", 2, 9));
			Thread.sleep(2000);
			objIndexPage.CurrencyDrpdwn(Helper.getData("Booths", 2, 12));
			Thread.sleep(2000);
			objIndexPage.CurrencyPricetxtbx.sendKeys(Helper.getData("Booths", 2, 13));
			Thread.sleep(2000);
			objIndexPage.IncludeChkbx.click();
			Thread.sleep(2000);
			objIndexPage.BoothnumberTxtbx.sendKeys(Helper.getData("Booths", 2, 23));
			Thread.sleep(2000);
			objIndexPage.DescriptionTxtbx.sendKeys(Helper.getData("Booths", 2, 24));
			Thread.sleep(2000);
			objIndexPage.SaveBoothBtn.click();
			Thread.sleep(2000);
			objIndexPage.SaveBtn.click();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
}
