package EventPage_Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import EventPage_PageObject.CreateEventPage;
import ExtentReports.ExtentTestManager;
import HomePage_PageObject.HomePage;
import HomePage_PageObject.IndexPage;
import HomePage_PageObject.IndexPage;
import HomePage_PageObject.LoginPage;
import SurveyPage_Tests.SurveyRewardSingleWinnerTest;

public class EventsTestCasesStagging extends EventMethodsStagging{

	
	WebDriver driver;
	LoginPage objLoginPage;
	HomePage objHomePage;
	IndexPage objIndexPage;
	CreateEventPage objCreateEventPage;
	JavascriptExecutor js;
	JavascriptExecutor jse;
	public int MultipleData = 0;


@Test (description = "Organizer_OnlE_MDay__Sponsor_judge_Save")
public void TestCase101_Organizer_OnlE_ODay_Challenges_judge_Save() throws Exception {

	 ExtentTestManager.getTest().setDescription("Organizer_OnlE_ODay_Challenges_judge_Save");
	EventsTestCasesStagging jhan1 = new EventsTestCasesStagging();
	
	jhan1.LoginEvents();
	Thread.sleep(2000);

	for (int i = 2; i <= 2;) {

		jhan1.CreateEventPage(i);
		Thread.sleep(2000);
		//sat1.EventDetailPage(i);
		Thread.sleep(2000);
		//sat1.EventDetailsPageSaveandNext();
		jhan1.EventOptionsPage(i);
		Thread.sleep(2000);
		//this.EventOptionPageSaveAndPublish();
	//sat1.EventOptionSaveAndNext();
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		//sat1.EventAgendasNextButton();
		jhan1.EventTicketsPage(i);
		Thread.sleep(2000);
		jhan1.AllTicketTypeDropDwn(i);
		Thread.sleep(2000);
		jhan1.EventAgendasPageallTypes(i);
		//sat1.EventTicketPageSkipandNext();
//		Thread.sleep(2000);
		//sat1.EventViewPage(i);
		break;

	}
		
		
	}
}

