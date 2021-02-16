package EventPage_Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import EventPage_PageObject.CreateEventPage;
import ExtentReports.ExtentTestManager;
import HomePage_PageObject.HomePage;
import HomePage_PageObject.IndexPages;
import HomePage_PageObject.LoginPage;
import SurveyPage_Tests.SurveyRewardSingleWinnerTest;
import utilityLibrary.Helper;

public class EventsTestCases extends EventsMethods

{

	WebDriver driver;
	LoginPage objLoginPage;
    HomePage objHomePage;
	IndexPages objIndexPage;
	CreateEventPage objCreateEventPage;
	JavascriptExecutor js;
	SurveyRewardSingleWinnerTest objSurveyRewardSingleWinnerTest;
	JavascriptExecutor jse;
	public int MultipleData = 0;

	@Test (description ="Organizer_OnlE_ODay_Sponsor_Presenter_Ticket_Refund")
	public void TestCase501_Organizer_OnlE_ODay_Sponsor_Presenter_Ticket_Refund() throws Exception {

		 ExtentTestManager.getTest().setDescription("Organizer_OnlE_ODay_Sponsor_Presenter_Ticket_Refund");

		EventsTestCases sat1 = new EventsTestCases();

		sat1.LoginEvents();
		Thread.sleep(2000);

		for (int i = 2; i <= 2;) {
			sat1.CreateEventPage(i);
			Thread.sleep(2000);
			//sat1.EventDetailPage(i);
			Thread.sleep(2000);
			//sat1.EventDetailsPageSaveandNext();
			sat1.EventOptionsPage(i);
			Thread.sleep(2000);
			//this.EventOptionPageSaveAndPublish();
		//sat1.EventOptionSaveAndNext();
			Thread.sleep(2000);
			
			Thread.sleep(2000);
			//sat1.EventAgendasNextButton();
			sat1.EventTicketsPage(i);
			Thread.sleep(2000);
			sat1.AllTicketTypeDropDwn(i);
			Thread.sleep(2000);
			//sat1.EventTicketPageSkipandNext();
//			Thread.sleep(2000);
//			sat1.AllTicketTypeDropDwn(i);
//			Thread.sleep(2000);
			sat1.EventAgendasPageallTypes(i);
			
			//sat1.EventViewPage(i);
			break;

		}

		}
		
//		sat1.CloseWindow();
	

	//@Test (description ="Organizer_OnlE_ODay_Sponsor_Presenter_Ticket_NoRefund")
	public void TestCase502_Organizer_OnlE_ODay_Sponsor_Presenter_Ticket_NoRefund() throws Exception {

		// ExtentTestManager.getTest().setDescription("Organizer_OnlE_ODay_Sponsor_Presenter_Ticket_NoRefund");

		EventsTestCases sat2 = new EventsTestCases();

		sat2.LoginEvents();
		Thread.sleep(2000);

		for (int i = 3; i <= 3;) {

			sat2.CreateEventPage(i);
			Thread.sleep(2000);
			sat2.EventOptionsPage(i);
			
			Thread.sleep(2000);
			//sat2.EventAgendasPageTypes(i);
			Thread.sleep(2000);
			sat2.EventTicketsPage(i);
			Thread.sleep(2000);
			sat2.AllTicketTypeDropDwn(i);
			Thread.sleep(2000);
			sat2.EventTicketPageSkipandNext();
			break;

		}
		
//		sat2.CloseWindow();
	}

//	@Test (description = "Organizer_OnlE_ODay_Exhibitor_Presenter_Ticket_Refund")
	public void TestCase503_Organizer_OnlE_ODay_Exhibitor_Presenter_Ticket_Refund() throws Exception {

	// ExtentTestManager.getTest().setDescription("Organizer_OnlE_ODay_Exhibitor_Presenter_Ticket_Refund");

		EventsTestCases sat3 = new EventsTestCases();

		sat3.LoginEvents();
		Thread.sleep(2000);

		for (int i = 4; i <= 4;) {

			sat3.CreateEventPage(i);
			Thread.sleep(2000);
			sat3.EventOptionsPage(i);
			
			Thread.sleep(2000);
			//sat3.EventAgendasPageTypes(i);
			Thread.sleep(2000);
			sat3.EventTicketsPage(i);
			Thread.sleep(2000);
			sat3.AllTicketTypeDropDwn(i);
			Thread.sleep(2000);
			sat3.EventTicketPageSkipandNext();
			break;

		}
		
//		sat3.CloseWindow();
	}

//	@Test (description = "Organizer_OnlE_ODay_Exhibitor_Presenter_Ticket_NoRefund")
	public void TestCase504_Organizer_OnlE_ODay_Exhibitor_Presenter_Ticket_NoRefund() throws Exception {

		//ExtentTestManager.getTest().setDescription("Organizer_OnlE_ODay_Exhibitor_Presenter_Ticket_Refund");

		this.LoginEvents();
		Thread.sleep(2000);

		for (int i = 5; i <= Helper.getLastRowEvents();) {

			this.CreateEventPage(i);
			Thread.sleep(2000);
			this.EventOptionsPage(i);
			
			Thread.sleep(2000);
			//this.EventAgendasPageTypes(i);
			Thread.sleep(2000);
			this.EventTicketsPage(i);
			Thread.sleep(2000);
			this.AllTicketTypeDropDwn(i);
			Thread.sleep(2000);
			this.EventTicketPageSkipandNext();
			break;

		}
	}

//	@Test (description = "Organizer_OnlE_ODay_Agenda_Speaker_Ticket_Refund")
	public void TestCase505_Organizer_OnlE_ODay_Agenda_Speaker_Ticket_Refund() throws Exception {

	//	ExtentTestManager.getTest().setDescription("Organizer_OnlE_ODay_Agenda_Speaker_Ticket_Refund");

		this.LoginEvents();
		Thread.sleep(2000);

		for (int i = 6; i <= Helper.getLastRowEvents();) {

			this.CreateEventPage(i);
			Thread.sleep(2000);
			this.EventOptionsPage(i);
			
			Thread.sleep(2000);
			//this.EventAgendasPageTypes(i);
			Thread.sleep(2000);
			this.EventTicketsPage(i);
			Thread.sleep(2000);
			this.AllTicketTypeDropDwn(i);
			Thread.sleep(2000);
			this.EventTicketPageSkipandNext();
			break;

		}
	}

	// @Test (description = "Organizer_OnlE_ODay_Agenda_Speaker_Ticket_NoRefund")
	public void TestCase506_Organizer_OnlE_ODay_Agenda_Speaker_Ticket_NoRefund() throws Exception {

	//	ExtentTestManager.getTest().setDescription("Organizer_OnlE_ODay_Agenda_Speaker_Ticket_Refund");

		this.LoginEvents();
		Thread.sleep(2000);

		for (int i = 7; i <= Helper.getLastRowEvents();) {

			this.CreateEventPage(i);
			Thread.sleep(2000);
			this.EventOptionsPage(i);
			
			Thread.sleep(2000);
			//this.EventAgendasPageTypes(i);
			Thread.sleep(2000);
			this.EventTicketsPage(i);
			Thread.sleep(2000);
			this.AllTicketTypeDropDwn(i);
			Thread.sleep(2000);
			this.EventTicketPageSkipandNext();
			break;

		}
	}

	// @Test (description = "Organizer_OnlE_MDay_Sponsor_Presenter_Ticket_Refund")
	public void TestCase507_Organizer_OnlE_MDay_Sponsor_Presenter_Ticket_Refund() throws Exception {

	//	ExtentTestManager.getTest().setDescription("Organizer_OnlE_MDay_Sponsor_Presenter_Ticket_Refund");

		this.LoginEvents();
		Thread.sleep(2000);

		for (int i = 8; i <= Helper.getLastRowEvents();) {

			this.CreateEventPage(i);
			Thread.sleep(2000);
			this.EventOptionsPage(i);
			
			Thread.sleep(2000);
			//this.EventAgendasPageTypes(i);
			Thread.sleep(2000);
			this.EventTicketsPage(i);
			Thread.sleep(2000);
			this.AllTicketTypeDropDwn(i);
			Thread.sleep(2000);
			this.EventTicketPageSkipandNext();
			break;

		}
	}

	// @Test (description ="Organizer_OnlE_MDay_Exhibitor_Presenter_Ticket_Refund")
	public void TestCase508_Organizer_OnlE_ODay_Exhibitor_Presenter_Ticket_Refund() throws Exception {

	//	ExtentTestManager.getTest().setDescription("Organizer_OnlE_MDay_Exhibitor_Presenter_Ticket_Refund");

		this.LoginEvents();
		Thread.sleep(2000);

		for (int i = 9; i <= 9;) {

			this.CreateEventPage(i);
			Thread.sleep(2000);
			this.EventOptionsPage(i);
		
			Thread.sleep(2000);
			//			this.EventAgendasPageTypes(i);
//			Thread.sleep(2000);
			this.EventTicketsPage(i);
			Thread.sleep(2000);
			this.AllTicketTypeDropDwn(i);
			Thread.sleep(2000);
			this.EventTicketPageSkipandNext();
			break;

		}
	}

	// @Test (description = "Organizer_OnlE_MDay_Topic_Speaker_Ticket_Refund")
	public void TestCase509_Organizer_OnlE_ODay_Topic_Speaker_Ticket_Refund() throws Exception {

		//ExtentTestManager.getTest().setDescription("Organizer_OnlE_MDay_Topic_Speaker_Ticket_Refund");

		this.LoginEvents();
		Thread.sleep(2000);

		for (int i = 10; i <= 10;) {

			this.CreateEventPage(i);
			Thread.sleep(2000);
			this.EventOptionsPage(i);
			
			Thread.sleep(2000);
			
//			this.EventAgendasPageTypes(i);
//			Thread.sleep(2000);
			this.EventTicketsPage(i);
			Thread.sleep(2000);
			this.AllTicketTypeDropDwn(i);
			Thread.sleep(2000);
			this.EventTicketPageSkipandNext();
			break;

		}
	}

	// @Test (description = "Sponsor_OnlE_ODay_Sponsor_Presenter_OptionSaveAndPublish")
	public void TestCase510_Sponsor_OnlE_ODay_Sponsor_Presenter_OptionSaveAndPublish() throws Exception {

	//	ExtentTestManager.getTest().setDescription("Sponsor_OnlE_ODay_Sponsor_Presenter_OptionSaveAndPublish");

		this.LoginEvents();
		Thread.sleep(2000);

		for (int i = 11; i <= 11;) {

			Thread.sleep(2000);
			this.CreateEventPage(i);
			this.EventDetailPageEventTicket(i);
			Thread.sleep(2000);
			this.EventOptionsPage(i);
			Thread.sleep(2000);
			this.EventTicketsPage(i);
			Thread.sleep(2000);
			this.AllTicketTypeDropDwn(i);
			Thread.sleep(2000);
			this.EventTicketPageSkipandNext();
			break;

		}
	}

//	@Test (description = "Organizer_OnlE_ODay_Sponsor_Presenter_Ticket_Refund_IndivTicketCheckIn")
	public void TestCase511_Organizer_OnlE_ODay_Sponsor_Presenter_Ticket_Refund_IndivTicketCheckIn() throws Exception {

		// ExtentTestManager.getTest().setDescription("Organizer_OnlE_ODay_Sponsor_Presenter_Ticket_Refund_IndivTicketCheckIn");

		this.LoginEvents();
		Thread.sleep(2000);

		for (int i = 12; i <= 12;) {

			this.CreateEventPage(i);
			Thread.sleep(2000);
			this.EventOptionsPage(i);
			this.EventOptionSaveAndNext();
			Thread.sleep(2000);
			this.EventAgendasPageTypes(i);
			Thread.sleep(2000);
			this.EventTicketsPage(i);
			Thread.sleep(2000);
			break;

		}
	}

	//@Test (description = "Organizer_OnlE_ODay_Sponsor_Presenter_Ticket_Refund_SaveAndNext")
	public void TestCase512_Organizer_OnlE_ODay_Sponsor_Presenter_Ticket_Refund_SaveAndNext() throws Exception {

		// ExtentTestManager.getTest().setDescription("Organizer_OnlE_ODay_Sponsor_Presenter_Ticket_Refund_SaveAndNext");

		this.LoginEvents();
		Thread.sleep(2000);

		for (int i = 13; i <= 13;) {

			this.CreateEventPage(i);
			Thread.sleep(2000);
			this.EventOptionsPage(i);
			this.EventOptionSaveAndNext();
			Thread.sleep(2000);
			this.EventTicketsPage(i);
			Thread.sleep(2000);
			break;

		}
	}

}
