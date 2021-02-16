package EventPage_Tests;

import java.util.ArrayList;
import java.util.Base64;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



import EventPage_PageObject.CreateEventPageOld;
import ExtentReports.ExtentTestManager;
import HomePage_PageObject.HomePage;
import HomePage_PageObject.IndexPages;
import HomePage_PageObject.LoginPage;

import SurveyPage_Tests.SurveyRewardSingleWinnerTest;
import utilityLibrary.Helper;

public class CreateEventTestOld extends SurveyRewardSingleWinnerTest{

	WebDriver driver;
	LoginPage objLoginPage;
	HomePage objHomePage;
	IndexPages objIndexPage;
	CreateEventPageOld objCreateEventPage;
	JavascriptExecutor js;
	SurveyRewardSingleWinnerTest objSurveyRewardSingleWinnerTest;

	@BeforeClass
	public void setUp() throws Exception {
		// Open the application under test
		driver = Helper.openAUT(driver);
		objLoginPage = new LoginPage(driver);
		objHomePage = new HomePage(driver);
		objIndexPage = new IndexPages(driver);
		objCreateEventPage = new CreateEventPageOld(driver);
		js = (JavascriptExecutor) driver;
		//objHomePage.loginLnk.click();
		Thread.sleep(20000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("The number of windows are: " + tabs.size());
		driver.switchTo().window(tabs.get(1));

		// use https://www.base64encode.org/ for encoding and decoding creds
		objLoginPage.login(Helper.getValue("userName"),
				(new String(Base64.getDecoder().decode(Helper.getValue("password")))));
		Thread.sleep(10000);

	}
	/*
	 * public void CreateEventAndOptions() throws Exception {
	 * 
	 * // ExtentTestManager.getTest().setDescription("Login to Event page.");
	 * 
	 * EventTestCases sat = new EventTestCases();
	 * 
	 * 
	 * for (int i = 0; i < 2; i++) { MultipleData = i+1; sat.CreateEventPage();
	 * sat.EventOptinsPage(); }
	 * 
	 * }
	 */
	@Test(priority = 1, description = "Verify create Event")
	public void testCase_Event_01() throws Exception {
		
		ExtentTestManager.getTest().setDescription("Login to Event page.");
	    
		Thread.sleep(2000);
//		objSurveyRewardSingleWinnerTest.testCase_SurveySingleWinner_01();
//		Thread.sleep(2000);
		objIndexPage.EventLnk.click();
		Thread.sleep(2000);
		objIndexPage.createEventLnk.click();
		Thread.sleep(5000);

		for (int i = 1; i <= Helper.getLastRowEvent(); i++) {

			objCreateEventPage.eventNameTxtBx.sendKeys(Helper.getEvents(i, 2));
			objCreateEventPage.eventEasySearchCodeTxtBx.sendKeys(Helper.getEvents(i, 3));
			objCreateEventPage.eventVenueTxtBx.sendKeys(Helper.getEvents(i, 4));
			objCreateEventPage.locationTxtBx.sendKeys(Helper.getEvents(i, 5));
			objCreateEventPage.TagsBx.sendKeys(Helper.getEvents(i, 6));

			// objCreateEventPage.eventImage.sendKeys(Helper.getEvents(i, 22));
			// objCreateEventPage.cropandProceed.click();
			objCreateEventPage.eventDescriptionTxtBx.sendKeys(Helper.getEvents(i, 7));
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 2000)");
			Thread.sleep(2000);

			objCreateEventPage.eventTypeDrpDwn(Helper.getEvents(i, 8));
			objCreateEventPage.eventCategoriesDrpDwn(Helper.getEvents(i, 9));
			objCreateEventPage.timeZoneDrpBx.sendKeys(Helper.getEvents(i, 10));
			objCreateEventPage.surveyDrpBx.sendKeys(Helper.getEvents(i, 11));
			objCreateEventPage.Youtube.sendKeys(Helper.getEvents(i, 23));
			objCreateEventPage.FBUrl.sendKeys(Helper.getEvents(i, 24));
			objCreateEventPage.LinkedinUrl.sendKeys(Helper.getEvents(i, 25));
			objCreateEventPage.twitterUrl.sendKeys(Helper.getEvents(i, 26));
			objCreateEventPage.selectAreYou(Helper.getEvents(i, 13));
			objCreateEventPage.SpeakerAndSponsorCategoriesDrpDwn(Helper.getEvents(i, 14));
			Thread.sleep(2000);
			objCreateEventPage.eventTimeSpan(Helper.getEvents(i, 21));
			objCreateEventPage.eventPrivacyRadioBtn(Helper.getEvents(i, 12));
			Thread.sleep(2000);

			String selectAreYou = Helper.getEvents(i, 13);

			if (selectAreYou.contains("Participant") || selectAreYou.contains("Sponsor") || selectAreYou.contains("VIP")
					|| selectAreYou.contains("Speaker")) {

				Thread.sleep(5000);

				objCreateEventPage.eventorganizernameTxtBx.sendKeys(Helper.getEvents(i, 15));
				objCreateEventPage.EmailTxtBx.sendKeys(Helper.getEvents(i, 16));
				objCreateEventPage.organizerdescriptionTxtBx.sendKeys(Helper.getEvents(i, 17));
				objCreateEventPage.phoneTxtBx.sendKeys(Helper.getEvents(i, 18));
				objCreateEventPage.websiteTxtBx.sendKeys(Helper.getEvents(i, 19));

				((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 2000)");
				Thread.sleep(2000);

				// objCreateEventPage.eventticketTxtBx.click();
				objCreateEventPage.eventticketTxtBx.sendKeys(Helper.getEvents(i, 20));

				objCreateEventPage.eventTimeSpan(Helper.getEvents(i, 21));

				String eventTimeSpan = Helper.getEvents(i, 21);

				if (eventTimeSpan.contains("One day event")) {

				} else if (eventTimeSpan.contains("Multiple days event")) {

				}

			} else if (selectAreYou.contains("Organizer")) {

				objCreateEventPage.eventTimeSpan(Helper.getEvents(i, 21));

				String eventTimeSpan = Helper.getEvents(i, 21);

				if (eventTimeSpan.contains("One day event")) {

					Thread.sleep(2000);
					objCreateEventPage.dateOneDay.sendKeys(Helper.getEvents(i, 27));
					Thread.sleep(2000);
					objCreateEventPage.startTimeOneDay.clear();
					objCreateEventPage.startTimeOneDay.sendKeys(Helper.getEvents(i, 28));
					Thread.sleep(2000);
					objCreateEventPage.endTimeOneDay.clear();
					objCreateEventPage.endTimeOneDay.sendKeys(Helper.getEvents(i, 29));
					Thread.sleep(2000);

					objCreateEventPage.saveAndNextBtn.click();
					Thread.sleep(5000);
					// objCreateEventPage.PreviousBtn.click();

					// Event Topic Page
					objCreateEventPage.SessionTypeDrpDwn.click();
					objCreateEventPage.SessionTypeAddNewClk.click();
					Thread.sleep(2000);
					objCreateEventPage.SessionTypeAddNewTxtBx.sendKeys(Helper.getEvents(i, 53));
					Thread.sleep(2000);
					objCreateEventPage.SessionTypeAddNewBtn.click();
					Thread.sleep(2000);

					objCreateEventPage.SelectTopicOrBooth(Helper.getEvents(i, 36));
					Thread.sleep(2000);
					// objCreateEventPage.TopicCompanyLogoImage.sendKeys(Helper.getEvents(i,
					// 35));
					Thread.sleep(2000);
					// Below SurveTopicDropBx is comment due the new survey need
					// to be created
					// objCreateEventPage.SurveyTopicDropBx(Helper.getEvents(i,
					// 36));
					Thread.sleep(2000);
					objCreateEventPage.surveyLinkChkBx.click();
					objCreateEventPage.topicNameTxtBx.sendKeys(Helper.getEvents(i, 41));
					objCreateEventPage.StartdateOne.clear();
					objCreateEventPage.StartdateOne.sendKeys(Helper.getEvents(i, 43));
					objCreateEventPage.enddateOne.clear();
					objCreateEventPage.enddateOne.sendKeys(Helper.getEvents(i, 44));
					objCreateEventPage.RoomnoTxtBx.sendKeys(Helper.getEvents(i, 51));
					objCreateEventPage.TopicEasySearchCode.sendKeys(Helper.getEvents(i, 52));

					((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 2000)");
					Thread.sleep(2000);
					objCreateEventPage.descriptionTxt.sendKeys(Helper.getEvents(i, 54));
					objCreateEventPage.addSpeakerBtn.click();

					// Add Speak details

					Thread.sleep(2000);
					// objCreateEventPage.speakerImage.sendKeys(Helper.getEvents(i,
					// 55));
					objCreateEventPage.speakerNameTxtBx.sendKeys(Helper.getEvents(i, 56));
					Thread.sleep(2000);
					objCreateEventPage.speakerTitleTxtBx.sendKeys(Helper.getEvents(i, 57));
					Thread.sleep(2000);
					objCreateEventPage.companyNameTxtBx.sendKeys(Helper.getEvents(i, 58));
					Thread.sleep(2000);
					objCreateEventPage.SpeakerEmailidTxtBx.sendKeys(Helper.getEvents(i, 59));
					Thread.sleep(2000);
					objCreateEventPage.TopicSpeakerPackageDrpDwn(Helper.getEvents(i, 60));
					Thread.sleep(2000);
					objCreateEventPage.TopicSpeakerdescriptionTxtArea.sendKeys(Helper.getEvents(i, 61));
					Thread.sleep(2000);
					objCreateEventPage.TopicSpeakerRegistered.click();
					objCreateEventPage.hostChkBx.click();
					objCreateEventPage.savespeakerBtn.click();

					((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 2000)");
					Thread.sleep(2000);
					objCreateEventPage.saveTopicBtn.click();
					((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 2000)");
					Thread.sleep(2000);
					objCreateEventPage.saveAndNextTopicPageBtn.click();

					// Sponsor Page

					((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 1000)");
					Thread.sleep(2000);
					objCreateEventPage.SponsorCompanyLogo.sendKeys(Helper.getEvents(i, 73));
					Thread.sleep(5000);
					objCreateEventPage.cropSponsorImage.click();
					Thread.sleep(5000);
					objCreateEventPage.sponsorCompanyNameTxtBx.sendKeys(Helper.getEvents(i, 74));
					objCreateEventPage.sponsorPackageDrpDwn(Helper.getEvents(i, 75));
					objCreateEventPage.sponsorContactName.sendKeys(Helper.getEvents(i, 76));
					objCreateEventPage.sponsorContactdesignation.sendKeys(Helper.getEvents(i, 77));
					objCreateEventPage.sponsorContactPhone.sendKeys(Helper.getEvents(i, 78));
					objCreateEventPage.sponsorContactEmailId.sendKeys(Helper.getEvents(i, 79));
					objCreateEventPage.IsSponsorRegistered.click();
					objCreateEventPage.SponsoerPaymentTypeRadioBtn(Helper.getEvents(i, 81));
					objCreateEventPage.sponsorCompanyDescription.sendKeys(Helper.getEvents(i, 82));

					Thread.sleep(2000);
					((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 2000)");
					objCreateEventPage.savesponsorBtn.click();
					Thread.sleep(2000);
					((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 2000)");
					Thread.sleep(2000);
					objCreateEventPage.sponsornextbtn.click();

					// Tickets Page

					objCreateEventPage.AddTicketBtn.click();
					Thread.sleep(3000);
					objCreateEventPage.startdateTicket.sendKeys(Helper.getEvents(i, 83));
					objCreateEventPage.EnddateTicket.sendKeys(Helper.getEvents(i, 84));
					objCreateEventPage.ticketsAllowPerOrderTxt.sendKeys(Helper.getEvents(i, 85));
					objCreateEventPage.registerAttendeeChxBx.click();
					Thread.sleep(2000);

					objCreateEventPage.TransactionchargesTicketDrpDwn(Helper.getEvents(i, 87));
					objCreateEventPage.landingUrl.click();
					objCreateEventPage.landingUrlName.sendKeys(Helper.getEvents(i, 88));
					
					objCreateEventPage.ReturnPolicyType(Helper.getEvents(i, 89));
					objCreateEventPage.RefundText.sendKeys(Helper.getEvents(i, 90));
					((JavascriptExecutor) driver).executeScript("window.scrollTo(0, -1500)");
					Thread.sleep(2000);
					objCreateEventPage.CancelpolicyTxtBx.sendKeys(Helper.getEvents(i, 91));
					Thread.sleep(3000);
					objCreateEventPage.TicketNameTxtBx.sendKeys(Helper.getEvents(i, 92));
					objCreateEventPage.QuantityTxtBx.sendKeys(Helper.getEvents(i, 93));
					Thread.sleep(2000);
					objCreateEventPage.PriceTicketDrpDwn(Helper.getEvents(i, 94));
					objCreateEventPage.PriceLoadTxtBx.sendKeys(Helper.getEvents(i, 95));
					Thread.sleep(2000);
					objCreateEventPage.selectTicketsessiontype(Helper.getEvents(i, 96));
					objCreateEventPage.AteendeeRegistrationFormDrpDwn(Helper.getEvents(i, 97));
					objCreateEventPage.eventTicketsdescriptionTxtBx.sendKeys(Helper.getEvents(i, 98));
					((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 1000)");
					Thread.sleep(2000);
					objCreateEventPage.Addticket.click();
					objCreateEventPage.saveticketpublish.click();

				} else if (eventTimeSpan.contains("Multiple days event")) {

					// for multiple days date and time in event detail page
					objCreateEventPage.dateM1.clear();
					objCreateEventPage.dateM1.sendKeys(Helper.getEvents(i, 28));
					Thread.sleep(2000);
					objCreateEventPage.startTimeM1.clear();
					objCreateEventPage.startTimeM1.sendKeys(Helper.getEvents(i, 29));
					((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 2000)");
					Thread.sleep(2000);
					objCreateEventPage.endTimeM1.clear();
					objCreateEventPage.endTimeM1.sendKeys(Helper.getEvents(i, 30));
					Thread.sleep(2000);
					objCreateEventPage.addDate.click();
					objCreateEventPage.dateM2.sendKeys(Helper.getEvents(i, 31));
					((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 2000)");
					Thread.sleep(2000);
					objCreateEventPage.startTimeM2.clear();
					objCreateEventPage.startTimeM2.sendKeys(Helper.getEvents(i, 32));
					Thread.sleep(2000);
					objCreateEventPage.endTimeM2.clear();
					objCreateEventPage.endTimeM2.sendKeys(Helper.getEvents(i, 33));
					Thread.sleep(2000);

					objCreateEventPage.saveAndNextBtn.click();
					Thread.sleep(5000);
					// objCreateEventPage.PreviousBtn.click();

					// Event Topic Page
					objCreateEventPage.SessionTypeDrpDwn.click();
					objCreateEventPage.SessionTypeAddNewClk.click();
					Thread.sleep(2000);
					objCreateEventPage.SessionTypeAddNewTxtBx.sendKeys(Helper.getEvents(i, 50));
					Thread.sleep(2000);
					objCreateEventPage.SessionTypeAddNewBtn.click();
					Thread.sleep(2000);

					objCreateEventPage.SelectTopicOrBooth(Helper.getEvents(i, 34));
					Thread.sleep(2000);
					// objCreateEventPage.TopicCompanyLogoImage.sendKeys(Helper.getEvents(i,
					// 35));
					Thread.sleep(2000);
					// Below SurveTopicDropBx is comment due the new survey need
					// to be created
					// objCreateEventPage.SurveyTopicDropBx(Helper.getEvents(i,
					// 36));
					Thread.sleep(2000);
					objCreateEventPage.surveyLinkChkBx.click();
					objCreateEventPage.topicNameTxtBx.sendKeys(Helper.getEvents(i, 39));

					// Day 1 details and speak information
					// for multiple days date and time in Topic page
					Thread.sleep(2000);
					objCreateEventPage.dateTopic.sendKeys(Helper.getEvents(i, 28));
					objCreateEventPage.startTimeTopic.clear();
					objCreateEventPage.startTimeTopic.sendKeys(Helper.getEvents(i, 29));
					objCreateEventPage.endTimeTopic.clear();
					objCreateEventPage.endTimeTopic.sendKeys(Helper.getEvents(i, 30));
					objCreateEventPage.RoomnoTxtBx.sendKeys(Helper.getEvents(i, 49));

					((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 2000)");
					Thread.sleep(2000);
					objCreateEventPage.descriptionTxt.sendKeys(Helper.getEvents(i, 51));
					objCreateEventPage.addSpeakerBtn.click();

					// Add Speak details

					Thread.sleep(2000);
					// objCreateEventPage.speakerImage.sendKeys(Helper.getEvents(i,
					// 52));
					objCreateEventPage.speakerNameTxtBx.sendKeys(Helper.getEvents(i, 53));
					Thread.sleep(2000);
					objCreateEventPage.speakerTitleTxtBx.sendKeys(Helper.getEvents(i, 54));
					Thread.sleep(2000);
					objCreateEventPage.companyNameTxtBx.sendKeys(Helper.getEvents(i, 55));
					Thread.sleep(2000);
					objCreateEventPage.TopicSpeakerdescriptionTxtArea.sendKeys(Helper.getEvents(i, 56));
					Thread.sleep(2000);
					objCreateEventPage.hostChkBx.click();
					objCreateEventPage.savespeakerBtn.click();

					objCreateEventPage.dateTopic.clear();
					objCreateEventPage.dateTopic.sendKeys(Helper.getEvents(i, 31));
					objCreateEventPage.startTimeTopic.clear();
					objCreateEventPage.startTimeTopic.sendKeys(Helper.getEvents(i, 32));
					objCreateEventPage.endTimeTopic.clear();
					objCreateEventPage.endTimeTopic.sendKeys(Helper.getEvents(i, 33));
					objCreateEventPage.RoomnoTxtBx.clear();
					objCreateEventPage.RoomnoTxtBx.sendKeys(Helper.getEvents(i, 49));

					((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 2000)");
					Thread.sleep(2000);
					objCreateEventPage.addSpeakerBtn.click();

					// Add Speak details for day2

					Thread.sleep(2000);
					// objCreateEventPage.speakerImage.sendKeys(Helper.getEvents(i,
					// 58));
					objCreateEventPage.speakerNameTxtBx.sendKeys(Helper.getEvents(i, 59));
					Thread.sleep(2000);
					objCreateEventPage.speakerTitleTxtBx.sendKeys(Helper.getEvents(i, 60));
					Thread.sleep(2000);
					objCreateEventPage.companyNameTxtBx.sendKeys(Helper.getEvents(i, 61));
					Thread.sleep(2000);
					objCreateEventPage.TopicSpeakerdescriptionTxtArea.sendKeys(Helper.getEvents(i, 62));
					Thread.sleep(2000);
					objCreateEventPage.hostChkBx.click();
					objCreateEventPage.savespeakerBtn.click();

					// after submitting day 1 and 2 we have save it
					((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 2000)");
					Thread.sleep(2000);
					objCreateEventPage.saveTopicBtn.click();
					((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 2000)");
					Thread.sleep(2000);
					objCreateEventPage.saveAndNextTopicPageBtn.click();
					Thread.sleep(2000);

					// Sponsor Page

					((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 1000)");
					Thread.sleep(2000);
					objCreateEventPage.SponsorCompanyLogo.click();
					objCreateEventPage.SponsorCompanyLogo.sendKeys(Helper.getEvents(i, 73));
					Thread.sleep(5000);
					objCreateEventPage.cropSponsorImage.click();

					objCreateEventPage.sponsorCompanyNameTxtBx.sendKeys(Helper.getEvents(i, 74));
					objCreateEventPage.sponsorPackageDrpDwn(Helper.getEvents(i, 75));
					objCreateEventPage.sponsorContactName.sendKeys(Helper.getEvents(i, 76));
					objCreateEventPage.sponsorContactdesignation.sendKeys(Helper.getEvents(i, 77));
					objCreateEventPage.sponsorContactPhone.sendKeys(Helper.getEvents(i, 78));
					objCreateEventPage.sponsorContactEmailId.sendKeys(Helper.getEvents(i, 79));
					objCreateEventPage.IsSponsorRegistered.click();
					objCreateEventPage.SponsoerPaymentTypeRadioBtn(Helper.getEvents(i, 81));
					objCreateEventPage.sponsorCompanyDescription.sendKeys(Helper.getEvents(i, 82));

					Thread.sleep(2000);
					((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 2000)");
					objCreateEventPage.savesponsorBtn.click();
					Thread.sleep(2000);
					((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 2000)");
					Thread.sleep(2000);
					objCreateEventPage.sponsornextbtn.click();

					// Tickets Page

					
					Thread.sleep(3000);
					objCreateEventPage.startdateTicket.sendKeys(Helper.getEvents(i, 75));
					objCreateEventPage.EnddateTicket.sendKeys(Helper.getEvents(i, 76));
					objCreateEventPage.ticketsAllowPerOrderTxt.sendKeys(Helper.getEvents(i, 77));
					objCreateEventPage.registerAttendeeChxBx.click();
					Thread.sleep(2000);
					objCreateEventPage.TransactionchargesTicketDrpDwn(Helper.getEvents(i, 79));
					objCreateEventPage.landingUrl.click();
					objCreateEventPage.landingUrlName.sendKeys(Helper.getEvents(i, 80));
					objCreateEventPage.ReturnPolicyType(Helper.getEvents(i, 79));
					objCreateEventPage.RefundText.sendKeys(Helper.getEvents(i, 82));
					objCreateEventPage.CancelpolicyTxtBx.sendKeys(Helper.getEvents(i, 83));
					((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 1000)");
					Thread.sleep(3000);
					objCreateEventPage.TicketNameTxtBx.sendKeys(Helper.getEvents(i, 84));
					objCreateEventPage.QuantityTxtBx.sendKeys(Helper.getEvents(i, 85));
					Thread.sleep(2000);
					objCreateEventPage.PriceTicketDrpDwn(Helper.getEvents(i, 86));
					objCreateEventPage.PriceLoadTxtBx.sendKeys(Helper.getEvents(i, 87));
					Thread.sleep(2000);
					objCreateEventPage.selectTicketsessiontype(Helper.getEvents(i, 88));
					objCreateEventPage.eventTicketsdescriptionTxtBx.sendKeys(Helper.getEvents(i, 89));
					((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 1000)");
					Thread.sleep(2000);
					objCreateEventPage.Addticket.click();
					objCreateEventPage.saveticketpublish.click();

				}

			}

		}

	}

}
