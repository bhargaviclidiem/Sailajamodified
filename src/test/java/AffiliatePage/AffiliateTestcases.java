package AffiliatePage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import EventPage_PageObject.CreateEventPage;
import ExtentReports.ExtentTestManager;
import HomePage_PageObject.HomePage;
import HomePage_PageObject.IndexPage;
import HomePage_PageObject.LoginPage;
import SubscriptionsPage.SubscriptionTestCases;

public class AffiliateTestcases  extends AffiliateMethods{

	
	

	WebDriver driver;
	LoginPage objLoginPage;
	HomePage objHomePage;
	IndexPage objIndexPage;
	CreateEventPage objCreateEventPage;
	JavascriptExecutor js;
	JavascriptExecutor jse;
	public int MultipleData = 0;


@Test (description = "Affiliate_Event_Amount__Percentage_facebbok")
public void TestCase101_Affiliate_Event_Amount__Percentage_facebbok_Save() throws Exception {

	//ExtentTestManager.getTest().setDescription("Affiliate_Event_Amount__Percentage_facebbok_save");
	AffiliateTestcases jhans = new AffiliateTestcases();
	
	jhans.Login();
	Thread.sleep(2000);

	for (int i = 2; i <= 2;) {

		jhans.AffiliatePrograms(i);
	
		//jhans.Reminders(i);
	
		break;
	
	}
}
//		@Test (description = "Affiliate_Event_Amount__Percentage_facebbok")
//		public void TestCase102_Affiliate_Subscriptions_Amount__Percentage_facebbok_Save() throws Exception {
//
//		//	 ExtentTestManager.getTest().setDescription("Affiliate_Subscriptions_Amount__Percentage_facebbok_save");
//			AffiliateTestcases jhans = new AffiliateTestcases();
//	
//			jhans.Login();
//			Thread.sleep(2000);
//
//			for (int i = 3; i <= 3;) {
//
//				jhans.AffiliatePrograms(i);
//			
//				//jhans.Reminders(i);
//			
//				break;
//	
		
	

	

}
