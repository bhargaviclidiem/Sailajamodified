package SubscriptionsPage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import EventPage_PageObject.CreateEventPage;
import ExtentReports.ExtentTestManager;
import HomePage_PageObject.HomePage;
import HomePage_PageObject.IndexPage;
import HomePage_PageObject.LoginPage;

public class SubscriptionTestCases extends SubscriptionMethods {

	
		WebDriver driver;
		LoginPage objLoginPage;
		HomePage objHomePage;
		IndexPage objIndexPage;
		CreateEventPage objCreateEventPage;
		JavascriptExecutor js;
		JavascriptExecutor jse;
		public int MultipleData = 0;


	//@Test (description = "Subscription_single_price__Maxnoof_individual")
	public void TestCase101_Subscription_single_price_Maxnoof_individual_Save() throws Exception {

		// ExtentTestManager.getTest().setDescription("Subscription_single_price_Maxnoof_individual_save");
		SubscriptionTestCases jhans = new SubscriptionTestCases();
		
		jhans.Login();
		Thread.sleep(2000);

		for (int i = 2; i <= 2;) {

			jhans.Subscriptions(i);
		
			jhans.Reminders(i);
		
			break;
		}
	}
		

	//@Test (description = "Subscription_itemized_price__Maxnoof_Bundle")
	public void TestCase102_Subscription_itemized_price__Maxnoof_Bundle_Save() throws Exception {

			//	 ExtentTestManager.getTest().setDescription("Subscription_itemized_price__Maxnoof_Bundle_Save");
				SubscriptionTestCases jhans1 = new SubscriptionTestCases();
				
				jhans1.Login();
				Thread.sleep(2000);

				for (int i = 3; i <= 3;) {

					jhans1.Subscriptions(i);
				
					jhans1.Reminders(i);
					
				break;
				}
	}
					

	//@Test (description = "Products_single_price__Maxnoof_individual_Approvalchk")
	public void TestCase103_Products_single_price__Maxnoof_individual_Approvalchk_Save() throws Exception {

						// ExtentTestManager.getTest().setDescription("Products_single_price__Maxnoof_individual_Approvalchk_Save");
						SubscriptionTestCases jhans2 = new SubscriptionTestCases();
						
						jhans2.Login();
						Thread.sleep(2000);

						for (int i = 4; i <= 4;) {

							jhans2.Subscriptions(i);
						
							jhans2.Reminders(i);
							
							break;
						}
	}
							

	//@Test (description = "Products_Itemized_price__Maxnoof_Bundle")
	public void TestCase104_Products_Itemized_price__Maxnoof_Bundle_Save() throws Exception {

		// ExtentTestManager.getTest().setDescription("Products_Itemized_price__Maxnoof_Bundle_Save");
								SubscriptionTestCases jhans3 = new SubscriptionTestCases();
								
								jhans3.Login();
								Thread.sleep(2000);

								for (int i = 5; i <= 5;) {

									jhans3.Subscriptions(i);
								
									jhans3.Reminders(i);
		
		
		break;
								}
	}
		
		
		
	//@Test (description = "Products_Itemized_price__Maxnoof_Bundle_Reminders")
	public void TestCase105_Products_Itemized_price__Maxnoof_Bundle_Reminders_Save() throws Exception {

	// ExtentTestManager.getTest().setDescription("Products_Itemized_price__Maxnoof_Bundle_Reminders_Save");
								SubscriptionTestCases jhans4 = new SubscriptionTestCases();
								
								jhans4.Login();
								Thread.sleep(2000);

								for (int i = 6; i <= 6;) {

									jhans4.Subscriptions(i);
								
									jhans4.Reminders(i);
		
		
		break;
								}
	}
	
	//@Test (description = "Subscription_Itemized_price__Maxnoof_Bundle_Reminders")
	public void TestCase106_Subscription_Itemized_price__Maxnoof_Bundle_Reminders_Save() throws Exception {

			// ExtentTestManager.getTest().setDescription("Subscription_Itemized_price__Maxnoof_Bundle_Reminders_Save");
								SubscriptionTestCases jhans5 = new SubscriptionTestCases();
								
								jhans5.Login();
								Thread.sleep(2000);

								for (int i = 7; i <= 7;) {

									jhans5.Subscriptions(i);
								
									jhans5.Reminders(i);
		
		
		break;
		
	}

}
}