package EventPage_Tests;


	import java.util.ArrayList;
	import java.util.Base64;
	import java.util.Random;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.events.EventFiringWebDriver;
	import org.testng.annotations.Test;
	import EventPage_PageObject.CreateEventPage;
	import ExtentReports.ExtentTestManager;
	import HomePage_PageObject.HomePage;
	import HomePage_PageObject.IndexPage;
import HomePage_PageObject.IndexPage;
import HomePage_PageObject.LoginPage;
	import SurveyPage_Tests.SurveyRewardSingleWinnerTest;
	import utilityLibrary.Helper;

	
	public class EventMethodsStagging {
		
		WebDriver driver;
		LoginPage objLoginPage;
		HomePage objHomePage;
		IndexPage objIndexPage;
		CreateEventPage objCreateEventPage;
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

		public void LoginEvents() throws Exception {
			// Open the application under test
			driver = Helper.openAUT(driver);
			objLoginPage = new LoginPage(driver);
			objHomePage = new HomePage(driver);
			objIndexPage = new IndexPage(driver);
			objCreateEventPage = new CreateEventPage();

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

			Thread.sleep(5000);
			
			objIndexPage.EventLnk.click();
			//objIndexPage.EventLnk.click();
			//objIndexPage.EventLnkStagging.click();
			Thread.sleep(2000);
			objIndexPage.createEventLnk.click();
			Thread.sleep(5000);

		}

		public void CloseWindow() throws Exception {
			driver.close();
			// driver.quit();
		}

		// Event Detail Page

		public void CreateEventPage(int row) throws Exception {

			// this.LoginEvents();

			objIndexPage.SelectOneDrpDwn.click();

			String AreYou = Helper.getData("EventStaging", row, 2);

			if (AreYou.equals("Organizer")) {
				Thread.sleep(2000);
				objIndexPage.OrganizerTab.click();
				Thread.sleep(2000);
				this.EventDetailPage(row);
				Thread.sleep(2000);
				objIndexPage.SaveandNextBtn.click();
				Thread.sleep(2000);
			}
			
			
		else if (AreYou.equals("Sponsor")) {
				Thread.sleep(2000);
				objIndexPage.SponsorTab.click();
				Thread.sleep(2000);
				this.EventDetailPage(row);
				Thread.sleep(2000);
				this.EventDetailPageEventTicket(row);
				objIndexPage.SaveandNextBtn.click();
				this.EventSponsorOptionsPage(row);
				Thread.sleep(2000);
				this.EventOptionSaveAndNext();
				
			}
		
			else if (AreYou.contains("Speaker")) {
				Thread.sleep(2000);
				objIndexPage.SpeakerTab.click();
				Thread.sleep(2000);
				this.EventDetailPage(row);
				Thread.sleep(2000);
				this.EventDetailPageEventTicket(row);
				objIndexPage.SaveandNextBtn.click();
				this.EventSponsorOptionsPage(row);
				Thread.sleep(2000);
				this.EventOptionSaveAndNext();
				this.EventAgendasPageTypes(row);
				this.EventTicketsPage(row);
			}
		}


		

		public void EventDetailPage(int row) throws Exception {

			objIndexPage.EventNameTxt.sendKeys(Helper.getData("EventStaging", row, 3));
			Thread.sleep(2000);

			objIndexPage.EventNextBtn.click();

			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("scroll(0, 0);");
			Thread.sleep(2000);
			
			//objIndexPage.EventRdBtn(Helper.getData("CreateEventPage", row, 4));
			//((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
			
			String EventRdBtn = Helper.getData("EventStaging", 2, 4);
					
					if (EventRdBtn.contains("Public")){
						
						objIndexPage.EventPublicRdBtn.click();
						
						Thread.sleep(2000);
						
						//((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
						
					} else if (EventRdBtn.contains("Private")) {
						
						objIndexPage.EventPrivateRdBtn.click();
					}

			String OnlineEvnet = Helper.getData("EventStaging", row, 5);

			if (OnlineEvnet.equals("Yes")) {
				objIndexPage.EventNo.click();
				objIndexPage.EventURL.sendKeys(Helper.getData("EventStaging", row, 6));
			}

			else

			{
				objIndexPage.LocationTxt.sendKeys(Helper.getData("EventStaging", row, 7));
				objIndexPage.LocationTxt.click();
				objIndexPage.EventVenueTxt.sendKeys(Helper.getData("EventStaging", row, 8));
			}

			((JavascriptExecutor) driver).executeScript("scroll(0, 500);");

			objIndexPage.EventTypeDrp(Helper.getData("EventStaging", row, 9));
			objIndexPage.eventCategoriesDrpDwn(Helper.getData("EventStaging", row, 10));
			
			objIndexPage.EasySearchCodeTxt.sendKeys(Helper.getData("EventStaging", row, 29));
			((JavascriptExecutor) driver).executeScript("scroll(0, -1000);");

			objIndexPage.OrganizerNameTxtBx.clear();
			objIndexPage.OrganizerNameTxtBx.sendKeys(Helper.getData("EventStaging", row, 11));
//			objIndexPage.OrganizerEmailidTxtBx.clear();
//			objIndexPage.OrganizerEmailidTxtBx.sendKeys(Helper.getData("EventStaging", row, 12));
			objIndexPage.OrganizerPhoneTxt.clear();
			objIndexPage.OrganizerPhoneTxt.sendKeys(Helper.getData("EventStaging", row, 13));
			objIndexPage.OrganizerWebsiteTxt.clear();
			objIndexPage.OrganizerWebsiteTxt.sendKeys(Helper.getData("EventStaging", row, 14));

			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 800)");
			Thread.sleep(2000);
			objIndexPage.OrganizerDescriptionTxt.clear();
			objIndexPage.OrganizerDescriptionTxt.sendKeys(Helper.getData("EventStaging", row, 15));

			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, -800)");

			objIndexPage.ImageLnk.sendKeys(Helper.getData("EventStaging", row, 16));
			((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
			Thread.sleep(6000);
			//Helper.takeScreenshot(driver);
			objIndexPage.QuizImageCrop.click();
			Thread.sleep(3000);

			//((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 500)");
			
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 800)");
			
			objIndexPage.EventTimeZoneDrpDwn.sendKeys(Helper.getData("EventStaging", row, 31));
			
			
			//objIndexPage.EventDays(Helper.getData("CreateEventPage", row, 34));

			String EventDays = Helper.getData("EventStaging", row, 34);

			if (EventDays.equals("One day")) {
				objIndexPage.OneDayEvent.click();
				objIndexPage.Date.clear();
				objIndexPage.Date.sendKeys(Helper.getData("EventStaging", row, 35));
				objIndexPage.StartTime.clear();
				objIndexPage.StartTime.sendKeys(Helper.getData("EventStaging", row, 36));
				objIndexPage.EndTime.clear();
				objIndexPage.EndTime.sendKeys(Helper.getData("EventStaging", row, 37));
				

			} else if (EventDays.equals("Multiple days event")) {
				objIndexPage.MultipleDaysEvent.click();
				objIndexPage.Date1.sendKeys(Helper.getData("EventStaging", row, 39));
				//objIndexPage.StartTime1.click();
			objIndexPage.StartTime1.clear();
				objIndexPage.StartTime1.sendKeys(Helper.getData("EventStaging", row, 40));
				//objIndexPage.EndTime1.click();
				objIndexPage.EndTime1.clear();
				objIndexPage.EndTime1.sendKeys(Helper.getData("EventStaging", row, 41));
				objIndexPage.PlusAddBtn.click();
				Thread.sleep(2000);
				((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 1000)");
				Thread.sleep(2000);
				objIndexPage.Date2.sendKeys(Helper.getData("EventStaging", row, 42));
				objIndexPage.StartTime2.clear();
				objIndexPage.StartTime2.sendKeys(Helper.getData("EventStaging", row, 43));
				objIndexPage.EndTime2.clear();
				objIndexPage.EndTime2.sendKeys(Helper.getData("EventStaging", row, 44));
				
			}

		
		objIndexPage.EventDescriptionTxt.click();
		Thread.sleep(2000);
		objIndexPage.EventDescriptionTxt.sendKeys(Helper.getData("EventStaging", row, 89));
		}

//			objIndexPage.OrganizerYoutubeTxt.sendKeys(Helper.getData("CreateEventPage", row, 17));
//			objIndexPage.OrganizerFacebookTxt.sendKeys(Helper.getData("CreateEventPage", row, 18));
//			objIndexPage.OrganizerLinkedinTxt.sendKeys(Helper.getData("CreateEventPage", row, 19));
//			objIndexPage.OrganizerTwitterTxt.sendKeys(Helper.getData("CreateEventPage", row, 20));

		

		public void EventDetailPageEventTicket(int row) throws Exception {

			objIndexPage.EventTicket.sendKeys(Helper.getData("EventStaging", row, 21));

		}
		
		public void EventDetailsPageSaveandNext() throws Exception {
			
			objIndexPage.SaveandNextBtn.click();
		}

		// Event Options Page

		public void EventOptionsPage(int row) throws Exception {

			// this.LoginEvents();
			// Thread.sleep(3000);
			// this.CreateEventPage();
			// Thread.sleep(5000);

			//((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 500)");
//			objIndexPage.EventDescriptionTxt.click();
//			Thread.sleep(2000);
//			objIndexPage.EventDescriptionTxt.sendKeys(Helper.getData("CreateEventPage", row, 22));

			/*
			 * objIndexPage.RemoveSpeakers.sendKeys(Helper.getData(
			 * "CreateEventPage", row, 21));
			 * 
			 * String ChooseSpeaker = Helper.getData("CreateEventPage", row, 21);
			 * 
			 * if (ChooseSpeaker.equals("Yes")) {
			 * objIndexPage.RemoveSpeakers.click();
			 * 
			 * } else {}
			 * 
			 * objIndexPage.ChooseExhibitors(Helper.getData("CreateEventPage", row,
			 * 22)); objIndexPage.ChooseSponsors(Helper.getData("CreateEventPage",
			 * 2, 23)); objIndexPage.ChooseTickets(Helper.getData("CreateEventPage",
			 * 2, 24)); objIndexPage.ChooseHotels(Helper.getData("CreateEventPage",
			 * 2, 25));
			 * objIndexPage.ChooseAttendees(Helper.getData("CreateEventPage", row,
			 * 26));
			 */
			Thread.sleep(2000);
			//((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 1000)");
			Thread.sleep(2000);
//			Random rand = new Random();
//			int n = rand.nextInt(5000) + 1;

			//objIndexPage.EasySearchCodeTxt.sendKeys(Helper.getData("CreateEventPage", row, 29));
			Thread.sleep(2000);
			objIndexPage.TagsTxt.sendKeys(Helper.getData("EventStaging", row, 30));
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 500)");
			
			
			//objIndexPage.EventSurveyDrpDwn(Helper.getData("CreateEventPage", row,
			// 32));
			
			
			Thread.sleep(3000);
			//objIndexPage.SpeakerandSponsorCategoriesDrpAddNew.click();
			
			//Thread.sleep(3000);
			//((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 300)");
			
			Thread.sleep(5000);
			//objIndexPage.SponsorCategoriesAddNew.click();
			
			//driver.findElement(By.xpath("//a[contains@class,'event-ad '] and  contains(text(), ' Add New  ')")).click();
			
			//driver.findElement(By.linkText( "addnewSponsorCategory")).click();
//			
//			objIndexPage.SponsorCategoryName.sendKeys(Helper.getData("MarketPlace-SponsorPackage", row, 2));
//			
//			objIndexPage.SponsorCategoryDescription.sendKeys(Helper.getData("MarketPlace-SponsorPackage", row, 3));
//			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 500)");
//			
//			objIndexPage.SponsorCategoryAddNewBtn.click();
//			
//			objIndexPage.SponsorPackageNameTxtBx.sendKeys(Helper.getData("MarketPlace-SponsorPackage", row, 4));
//			
//			objIndexPage.SponsorCategoryegistrationDrp(Helper.getData("MarketPlace-SponsorPackage", row, 5));
//			
//			objIndexPage.SponsorCategoryPriceDrp(Helper.getData("MarketPlace-SponsorPackage", row, 6));
//			
//			objIndexPage.SponsorCategoryPriceTxtBx.sendKeys(Helper.getData("MarketPlace-SponsorPackage", row, 7));
//			
//			objIndexPage.SponsorCategoryQuantityTxtBx.sendKeys(Helper.getData("MarketPlace-SponsorPackage", row, 8));
//			
//			objIndexPage.SponsorCategoryDiscountTxtBx.sendKeys(Helper.getData("MarketPlace-SponsorPackage", row, 9));
//			
//			objIndexPage.SponsorCategoryNoofFreeTickets.sendKeys(Helper.getData("MarketPlace-SponsorPackage", row, 10));
//			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 500)");
//			
//			objIndexPage.SponsorCategoryFeaturesTxtBx.sendKeys(Helper.getData("MarketPlace-SponsorPackage", row, 11));
//			
//			objIndexPage.SponsorCategoryAddPackageBtn.click();
//			
//			objIndexPage.SponsorCategorySaveBtn.click();
//		
			
			objIndexPage.SponsorCategoriesDrpDwn(Helper.getData("EventStaging", row, 33));
		
		objIndexPage.OptionTabNextBtn.click();
		}
				
		public void EventSponsorOptionsPage(int row) throws Exception {

			// this.LoginEvents();
			// Thread.sleep(3000);
			// this.CreateEventPage();
			// Thread.sleep(5000);

			//((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 500)");
			objIndexPage.EventDescriptionTxt.click();
			Thread.sleep(2000);
			objIndexPage.EventDescriptionTxt.sendKeys(Helper.getData("EventStaging", row, 22));
			objIndexPage.EasySearchCodeTxt.sendKeys(Helper.getData("EventStaging", row, 29));
			objIndexPage.TagsTxt.sendKeys(Helper.getData("EventStaging", row, 30));
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 500)");
			objIndexPage.EventTimeZoneDrpDwn.sendKeys(Helper.getData("EventStaging", row, 31));
			objIndexPage.EventDays(Helper.getData("EventStaging", row, 34));

		
		}
		public void EventOptionSaveAndNext() throws Exception {
		
			objIndexPage.OptionTabNextBtn.click();
		}
		
		public void EventOptionPageSaveAndPublish() throws Exception {
			
			objIndexPage.OptionSaveandNextDrpBtn.click();
			Thread.sleep(2000);
			objIndexPage.OptionSaveandPublish.click();
		}
		
		
		// Agenda all Types
		
		public void EventAgendasPageallTypes(int row) throws Exception {

			((JavascriptExecutor) driver).executeScript("scroll(0, -900);");
		
			Thread.sleep(5000);

			String AgendasRadioBtn = (Helper.getData("EventStaging", row, 45));

			if (AgendasRadioBtn.contains("Sponsor")) {

				objIndexPage.SponsorandExhibitorChkBx.click();

				Thread.sleep(5000);
				objIndexPage.AgendaPageAddnewBtn.click();
				objIndexPage.SponsorPackage.sendKeys(Helper.getData("EventStaging", row, 46));
	Thread.sleep(2000);
				this.EventSponsorPage(row);
				Thread.sleep(2000);
				this.SponsorPresenter();
				Thread.sleep(3000);
				
//				objIndexPage.AgendaPageAddnewBtn.click();
//				objIndexPage.SponsorPackage.sendKeys(Helper.getData("EventStaging", row, 46));
//	Thread.sleep(2000);
//	this.EventSecondSponsorPage(row);
//	Thread.sleep(2000);
//	this.SecondSponsorPresenter();
//	Thread.sleep(2000);
				
			}
			
			
			
			 if (AgendasRadioBtn.contains("Exhibitor")) {

				objIndexPage.ExhibitorTab.click();
				Thread.sleep(5000);
				objIndexPage.ExhibitorPageAddnewBtn.click();
				Thread.sleep(3000);

				this.EventExhibitorPage(row);
				this.ExhibitorPresenter();
				Thread.sleep(2000);
				//((JavascriptExecutor) driver).executeScript("scroll(0, 1000);");
				Thread.sleep(3000);
				
			}
				 if (AgendasRadioBtn.contains("Agenda")) {
				
				objIndexPage.AgendaTab.click();
					// objIndexPage.AgendaTabStaging.click();

				Thread.sleep(2000);
				objIndexPage.AgendaPageAddnewBtn.click();
				this.EventAgendaPage(row);
				this.SpeakerDetails();
			Thread.sleep(3000);
			
			
		
			}
		
				 if (AgendasRadioBtn.contains("Challenges")) {
						
						objIndexPage.ChallengesTab.click();

						Thread.sleep(5000);
						objIndexPage.ChallengesAddnewBtn.click();
						this.EventChallengePage(row);
						this.ChallengeJudge();
					Thread.sleep(2000);
					//this.EventAgendasNextButton();
					//this.EventTicketsPage(row);
		}
		
		
		
		objIndexPage.FinishBtn.click();
		
	}
		
		// Event Agendas Page

		public void EventAgendasPageTypes(int row) throws Exception {

			// this.LoginEvents();
			// Thread.sleep(2000);
			// this.CreateEventPage();
			// Thread.sleep(2000);
			// this.EventOptinsPage();
			// Thread.sleep(2000);

			((JavascriptExecutor) driver).executeScript("scroll(0, -500);");

			//Thread.sleep(2000);

			//objIndexPage.AgendasAddNewBtn.click();

			Thread.sleep(5000);

			String AgendasRadioBtn = (Helper.getData("EventStaging", 2, 45));

			if (AgendasRadioBtn.contains("Sponsor")) {

				objIndexPage.SponsorandExhibitorChkBx.click();

				Thread.sleep(5000);
				objIndexPage.AgendaPageAddnewBtn.click();
				objIndexPage.SponsorPackage.sendKeys(Helper.getData("EventStaging", 2, 46));

				this.EventSponsorPage(row);
				Thread.sleep(2000);
				this.SponsorPresenter();
				Thread.sleep(2000);
				objIndexPage.AgendaOrgSponsorTopicNextBtn.click();
				Thread.sleep(2000);
				
				
			}

			else if (AgendasRadioBtn.contains("Exhibitor")) {

				objIndexPage.ExhibitorTab.click();
				Thread.sleep(2000);
				objIndexPage.AgendaPageAddnewBtn.click();
				Thread.sleep(2000);
				//objIndexPage.SelectExhibitorPackage(Helper.getData("CreateEventPage", row, 46));
				Thread.sleep(5000);

				this.EventExhibitorPage(row);
				this.ExhibitorPresenter();
				Thread.sleep(2000);
				((JavascriptExecutor) driver).executeScript("scroll(0, 1000);");
				Thread.sleep(2000);
				objIndexPage.TopicNextBtnExhibitors.click();
				Thread.sleep(2000);
			}

			else if ((AgendasRadioBtn.equals("Agenda"))) {

				objIndexPage.AgendaTab.click();

				Thread.sleep(5000);
				objIndexPage.AgendaPageAddnewBtn.click();
				this.EventAgendaPage(row);
				this.SpeakerDetails();
			Thread.sleep(2000);
				objIndexPage.AgendaOrgSponsorTopicNextBtn.click();
				Thread.sleep(2000);
			}

		

		
		else if ((AgendasRadioBtn.equals("Challenges"))) {

			objIndexPage.ChallengesTab.click();
			Thread.sleep(5000);
			objIndexPage.ChallengesAddnewBtn.click();
			this.EventChallengePage(row);
			this.ChallengeJudge();
		Thread.sleep(2000);
		}
		}
		
		
		
		
		public void EventSponsorPage(int row) throws Exception {
			Thread.sleep(2000);
			//objIndexPage.AgendaPageAddnewBtn.click();
			//Thread.sleep(2000);
			objIndexPage.RoomNumber.clear();
			objIndexPage.RoomNumber.sendKeys(Helper.getData("EventStaging", 2, 47));
			objIndexPage.SessionTypeDrp.click();
			Thread.sleep(2000);
			objIndexPage.SessionTypeDrpAddBtn.click();
			Thread.sleep(2000);
			objIndexPage.AddSessionTypeTxtBx.sendKeys(Helper.getData("EventStaging", 2, 83));
			Thread.sleep(2000);
			objIndexPage.AddSessionTypeBtn.click();
			Thread.sleep(2000);
			//((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
			//objIndexPage.SessionTypeDrp(Helper.getData("EventStaging", row, 48));
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("scroll(0, 450);");
			 objIndexPage.TopicDateDrpDwn(Helper.getData("EventStaging", row, 50));
			// ((JavascriptExecutor) driver).executeScript("scroll(0, 300);");
			// objIndexPage.TopicsStartTime.sendKeys(Helper.getData("CreateEventPage",
			// 2, 51));
			// objIndexPage.TopicsEndTime.sendKeys(Helper.getData("CreateEventPage",
			// 2, 52));
			((JavascriptExecutor) driver).executeScript("scroll(0, -900);");
			objIndexPage.Title.sendKeys(Helper.getData("EventStaging", row, 53));
			objIndexPage.TopicDescription.sendKeys(Helper.getData("EventStaging", row, 54));
			Random rand = new Random();
			int n = rand.nextInt(5000) + 1;
			((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
			objIndexPage.EasySearchCode.sendKeys(Helper.getData("EventStaging", row, 55) + n);
			 //objIndexPage.TopicsSurveyDrpDwn(Helper.getData("CreateEventPage",row,
			 //56));
			
			objIndexPage.SponsorCompanyNameDrpDwn.sendKeys(Helper.getData("EventStaging", row, 57));
			((JavascriptExecutor) driver).executeScript("scroll(0, 600);");
			//objIndexPage.Sponsorlogo.sendKeys(Helper.getData("CreateEventPage", row, 58));
			((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
			Thread.sleep(1000);
			//objIndexPage.SponsorLogoImageCropBtn.click();
			Thread.sleep(2000);

		}
		
		
		public void EventSecondSponsorPage(int row) throws Exception {
			Thread.sleep(2000);
			//objIndexPage.AgendaPageAddnewBtn.click();
			//Thread.sleep(2000);
			objIndexPage.RoomNumber.clear();
			objIndexPage.RoomNumber.sendKeys(Helper.getData("EventStaging", 3, 47));
			objIndexPage.SessionTypeDrp.click();
			Thread.sleep(2000);
			objIndexPage.SessionTypeDrpAddBtn.click();
			Thread.sleep(2000);
			objIndexPage.AddSessionTypeTxtBx.sendKeys(Helper.getData("EventStaging", 3, 83));
			Thread.sleep(2000);
			objIndexPage.AddSessionTypeBtn.click();
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("scroll(0, 350);");
			//objIndexPage.SessionTypeDrp(Helper.getData("EventStaging", 3, 48));
			Thread.sleep(2000);
			//((JavascriptExecutor) driver).executeScript("scroll(0, 450);");
			Thread.sleep(2000);
			 objIndexPage.TopicDateDrpDwn1(Helper.getData("EventStaging", row, 50));
			// ((JavascriptExecutor) driver).executeScript("scroll(0, 300);");
			// objIndexPage.TopicsStartTime.sendKeys(Helper.getData("CreateEventPage",
			// 2, 51));
			// objIndexPage.TopicsEndTime.sendKeys(Helper.getData("CreateEventPage",
			// 2, 52));
			((JavascriptExecutor) driver).executeScript("scroll(0, -900);");
			objIndexPage.Title.sendKeys(Helper.getData("EventStaging", 3, 53));
			objIndexPage.TopicDescription.sendKeys(Helper.getData("EventStaging", 3, 54));
			Random rand = new Random();
			int n = rand.nextInt(5000) + 1;
			((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
			objIndexPage.EasySearchCode.sendKeys(Helper.getData("EventStaging", 3, 55) + n);
			 //objIndexPage.TopicsSurveyDrpDwn(Helper.getData("CreateEventPage",row,
			 //56));
			
			objIndexPage.SponsorCompanyNameDrpDwn.sendKeys(Helper.getData("EventStaging", 3, 57));
			((JavascriptExecutor) driver).executeScript("scroll(0, 600);");
			//objIndexPage.Sponsorlogo.sendKeys(Helper.getData("CreateEventPage", row, 58));
			((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
			Thread.sleep(1000);
			//objIndexPage.SponsorLogoImageCropBtn.click();
			Thread.sleep(2000);

		}
		
		
		
		public void EventAgendaPage(int row) throws Exception {
			Thread.sleep(2000);
			//objIndexPage.AgendaPageAddnewBtn.click();
			//Thread.sleep(2000);
			objIndexPage.RoomNumber.clear();
			objIndexPage.RoomNumber.sendKeys(Helper.getData("EventStaging", row, 47));
			((JavascriptExecutor) driver).executeScript("scroll(0, 300);");
			objIndexPage.SessionTypeDrp.click();
			
			Thread.sleep(2000);
			objIndexPage.SessionTypeDrpAddBtn.click();
			Thread.sleep(2000);
			
			
			objIndexPage.AgendaAddnewTxtBx.sendKeys(Helper.getData("EventStaging", row, 87));
			Thread.sleep(2000);
			objIndexPage.AgendaAddNewBtn.click();
			Thread.sleep(2000);
			//((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
			 objIndexPage.TopicDateDrpDwn1(Helper.getData("EventStaging", row, 50));
			 Thread.sleep(2000);
			// ((JavascriptExecutor) driver).executeScript("scroll(0, -500);");
			// objIndexPage.TopicsStartTime.sendKeys(Helper.getData("CreateEventPage",
			// 2, 51));
			// objIndexPage.TopicsEndTime.sendKeys(Helper.getData("CreateEventPage",
			// 2, 52));
			((JavascriptExecutor) driver).executeScript("scroll(0, -900);");
			objIndexPage.Title.sendKeys(Helper.getData("EventStaging", row, 53));
			objIndexPage.TopicDescription.sendKeys(Helper.getData("EventStaging", row, 54));
			Random rand = new Random();
			int n = rand.nextInt(5000) + 1;
			objIndexPage.EasySearchCode.sendKeys(Helper.getData("EventStaging", row, 55) + n);
			 //objIndexPage.TopicsSurveyDrpDwn(Helper.getData("CreateEventPage",row,
			 //56));
			((JavascriptExecutor) driver).executeScript("scroll(0, 600);");
			Thread.sleep(2000);
			objIndexPage.AgendaCompanyName(Helper.getData("EventStaging", row, 88));
			//((JavascriptExecutor) driver).executeScript("scroll(0, -800);");
//			objIndexPage.Sponsorlogo.sendKeys(Helper.getData("CreateEventPage", row, 58));
//			((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
//			Thread.sleep(1000);
//			objIndexPage.SponsorLogoImageCropBtn.click();
			Thread.sleep(2000);

		}
		
		
		
		public void EventExhibitorPage(int row) throws Exception {
			Thread.sleep(2000);
			//objIndexPage.ExhibitorPackage.click();
			objIndexPage.SelectExhibitorPackage(Helper.getData("EventStaging", 2, 86));
			//objIndexPage.AgendaPageAddnewBtn.click();
			Thread.sleep(2000);
			objIndexPage.RoomNumber.clear();
			objIndexPage.RoomNumber.sendKeys(Helper.getData("EventStaging", row, 47));
			Thread.sleep(2000);
			objIndexPage.SessionTypeDrp.click();
			Thread.sleep(2000);
			objIndexPage.SessionTypeDrpAddBtn.click();
			Thread.sleep(2000);
			objIndexPage.AddSessionTypeBtn.click();
			Thread.sleep(2000);
			objIndexPage.AddSessionTypeTxtBx.sendKeys(Helper.getData("EventStaging", row, 84));
			Thread.sleep(2000);
			objIndexPage.AddSessionTypeBtn.click();
			((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
			Thread.sleep(2000);
			objIndexPage.SessionTypeDrp(Helper.getData("EventStaging", row, 85));
			Thread.sleep(2000);
			 objIndexPage.TopicDateDrpDwn(Helper.getData("EventStaging", row, 50));
			// ((JavascriptExecutor) driver).executeScript("scroll(0, 300);");
			// objIndexPage.TopicsStartTime.sendKeys(Helper.getData("CreateEventPage",
			// 2, 51));
			// objIndexPage.TopicsEndTime.sendKeys(Helper.getData("CreateEventPage",
			// 2, 52));
			((JavascriptExecutor) driver).executeScript("scroll(0, -900);");
			objIndexPage.Title.sendKeys(Helper.getData("EventStaging", row, 53));
			objIndexPage.TopicDescription.sendKeys(Helper.getData("EventStaging", row, 54));
			Random rand = new Random();
			int n = rand.nextInt(5000) + 1;
			objIndexPage.EasySearchCode.sendKeys(Helper.getData("EventStaging", row, 55) + n);
			 //objIndexPage.TopicsSurveyDrpDwn(Helper.getData("CreateEventPage",row,
			 //56));
			
			objIndexPage.SponsorCompanyName.sendKeys(Helper.getData("EventStaging", row, 90));
			//((JavascriptExecutor) driver).executeScript("scroll(0, 400);");
			Thread.sleep(5000);
//			objIndexPage.Sponsorlogo.sendKeys(Helper.getData("CreateEventPage", row, 58));
//			((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
//			Thread.sleep(1000);
//			objIndexPage.SponsorLogoImageCropBtn.click();
			Thread.sleep(5000);

		}
		
		
		
		
		public void EventChallengePage(int row) throws Exception {
			Thread.sleep(2000);
			
			
			objIndexPage.selectEnrollFormDrpDwn(Helper.getData("EventChallengeJudge", 2, 2));
			Thread.sleep(2000);
			objIndexPage.HallNumberTxtBx.sendKeys(Helper.getData("EventChallengeJudge", 2, 3));
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("scroll(0, 450);");
			
			String CompetitionBtnRadioBtn = Helper.getData("EventChallengeJudge", 2, 4);
			
			if (CompetitionBtnRadioBtn.contains("Companies")){
				
				objIndexPage.CompaniesRdBtn.click();
				
				Thread.sleep(2000);
				
			} else if (CompetitionBtnRadioBtn.contains("Individuals")) {
				
				objIndexPage.individualRdBtn.click();
			}
			 ((JavascriptExecutor) driver).executeScript("scroll(0, 700);");
			 objIndexPage.NameTxtBx.sendKeys(Helper.getData("EventChallengeJudge", 2, 5));
		
			objIndexPage.ChallengeDescriptionTxtBx.sendKeys(Helper.getData("EventChallengeJudge", 2,6));
			
			objIndexPage.ChallengeLogo.sendKeys(Helper.getData("EventChallengeJudge", 2,7));
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("scroll(0, 800);");
			Thread.sleep(4000);
			objIndexPage.ChallengeLogoCropBtn.click();
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("scroll(0, 800);");
//			
//			Random rand = new Random();
//			int n = rand.nextInt(5000) + 1;
			Thread.sleep(7000);
			objIndexPage.ChallengesDatesDrpDwn(Helper.getData("EventChallengeJudge", 2,8));
			
			objIndexPage.StarttimeTxtbx.clear();
			
			objIndexPage.StarttimeTxtbx.sendKeys(Helper.getData("EventChallengeJudge", 2,9));
			
			
			objIndexPage.EndtimeTxtbx.clear();
			objIndexPage.EndtimeTxtbx.sendKeys(Helper.getData("EventChallengeJudge", 2,10));
			
			((JavascriptExecutor) driver).executeScript("scroll(0, -1000);");
			
			objIndexPage.EnrollStartDate.sendKeys(Helper.getData("EventChallengeJudge", 2, 11));
			
			objIndexPage.EnrollEndDate.sendKeys(Helper.getData("EventChallengeJudge", 2, 12));
			
			objIndexPage.EasySearchCodeTxtBx.sendKeys(Helper.getData("EventChallengeJudge", 2, 13));
			
			
			
			//((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
			
			// objIndexPage.selectSponsorDrpDwn(Helper.getData("EventChallengeJudge",2, 11));
			 ((JavascriptExecutor) driver).executeScript("scroll(0, 200);");
			 
			 objIndexPage.selectAssignTicketDrpDwn(Helper.getData("EventChallengeJudge", 2, 14));
			 
			 String WinnerselectionCriteriaRadioBtn = Helper.getData("EventChallengeJudge", 2, 15);
				
				if (WinnerselectionCriteriaRadioBtn.contains("Weightage From Evaluator")){
					
					objIndexPage.WtgeFromEvaluator.click();
					objIndexPage.selectEvaluatorDrpDwn(Helper.getData("EventChallengeJudge", 2, 17));
					
					
					Thread.sleep(2000);
			
					
				} else if (WinnerselectionCriteriaRadioBtn.contains("Weightage From Votes")) {
					
					objIndexPage.WtgefromVotes.click();
					objIndexPage.judgetxtbx.clear();
					objIndexPage.judgetxtbx.sendKeys(Helper.getData("EventChallengeJudge", 2, 17));
					objIndexPage.ParticipantTxtBx.clear();
					objIndexPage.ParticipantTxtBx.sendKeys(Helper.getData("EventChallengeJudge", 2, 18));
					Thread.sleep(2000);
					objIndexPage.VotingStartDateTxtBx.sendKeys(Helper.getData("EventChallengeJudge", 2, 19));
					objIndexPage.VotingEndDateTxtBx.sendKeys(Helper.getData("EventChallengeJudge", 2, 20));
					((JavascriptExecutor) driver).executeScript("scroll(0, -400);");
					 
				//	objIndexPage.ScorecriteriaPlusBtn.click();
					
					objIndexPage.CriteriaNameTxtbx.sendKeys(Helper.getData("EventChallengeJudge", 2, 21));
					
					objIndexPage.selectScoreScaleDrpDwn(Helper.getData("EventChallengeJudge", 2,22));
					
					Thread.sleep(1000);
					objIndexPage.ScorecriteriaPlusBtn.click();
					Thread.sleep(2000);
					
			objIndexPage.CriteriaNameTxtBx2.sendKeys(Helper.getData("EventChallengeJudge",2, 23));
					
					objIndexPage.selectScoreScaleDrpDwn2(Helper.getData("EventChallengeJudge", 2,24));
					Thread.sleep(2000);
		    	 
		         } else if (WinnerselectionCriteriaRadioBtn.contains("Average From Above")) {
			
		         	         objIndexPage.Avrgefromabove.click();
		         
		         	        objIndexPage.selectEvaluatorDrpDwn(Helper.getData("EventChallengeJudge", 2, 17));
		         	       objIndexPage.judgetxtbx.sendKeys(Helper.getData("EventChallengeJudge", 2,18));
		   				objIndexPage.ParticipantTxtBx.sendKeys(Helper.getData("EventChallengeJudge", 2,19));
		   				objIndexPage.QuizTxtBx.sendKeys(Helper.getData("EventChallengeJudge", 2, 20));
		   				objIndexPage.VotingStartDateTxtBx.sendKeys(Helper.getData("EventChallengeJudge", 2, 21));
		   				objIndexPage.VotingEndDateTxtBx.sendKeys(Helper.getData("EventChallengeJudge", 2, 22));
		   				
			         Thread.sleep(2000);
			
			objIndexPage.CriteriaNameTxtbx.sendKeys(Helper.getData("EventChallengeJudge", 2, 23));
			
			objIndexPage.selectScoreScaleDrpDwn(Helper.getData("EventChallengeJudge", 2,24));
			
			Thread.sleep(1000);
			objIndexPage.ScorecriteriaPlusBtn.click();
			Thread.sleep(2000);
			
	objIndexPage.CriteriaNameTxtBx2.sendKeys(Helper.getData("EventChallengeJudge", 2, 25));
			
			objIndexPage.selectScoreScaleDrpDwn2(Helper.getData("EventChallengeJudge", 2, 26));
		}
		
		
		}
		
		
		public void SponsorPresenter() throws Exception {

			((JavascriptExecutor) driver).executeScript("scroll(0, -800);");

			objIndexPage.AddPresenterBtn.click();

			for (int i = 2; i <= 4; i++) 

				objIndexPage.PresenterImg.sendKeys(Helper.getData("SponsorPresenter", 2, 2));
				((JavascriptExecutor) driver).executeScript("scroll(0, 800);");
				Thread.sleep(5000);
				//Helper.takeScreenshot(driver);
				objIndexPage.PresenterImageCrop.click();
				Thread.sleep(3000);
				((JavascriptExecutor) driver).executeScript("scroll(0, -900);");
				objIndexPage.PresenterFirstName.sendKeys(Helper.getData("SponsorPresenter", 2, 3));
				objIndexPage.PresenterLastName.sendKeys(Helper.getData("SponsorPresenter", 2, 4));
				objIndexPage.PresenterEmailid.sendKeys(Helper.getData("SponsorPresenter", 2, 5));
				Thread.sleep(2000);
				objIndexPage.SelectPresenterPhoneCode(Helper.getData("SponsorPresenter", 2, 6));
				
				objIndexPage.PresenterPhoneNumber.sendKeys(Helper.getData("SponsorPresenter", 2, 7));
				//objIndexPage.PrimaryContactChkBx(Helper.getData("SponsorPresenter", 2, 4));
				objIndexPage.PresenterDesignation.sendKeys(Helper.getData("SponsorPresenter", 2, 8));
				//objIndexPage.PresenterWebsite.sendKeys(Helper.getData("SponsorPresenter", i, 6));
				// objIndexPage.PresenterType.sendKeys(Helper.getData("SponsorPresenter",
				// 2, 64));
				//objIndexPage.PresenterDescription.sendKeys(Helper.getData("SponsorPresenter", 2, 8));
				
				// objIndexPage.PrimaryContactChkBx.click();
				 
				// objIndexPage.PrimaryContactChkBx.clear();
				
				Actions actions = new Actions(driver);
				WebElement subMenu = driver.findElement(By.xpath("//*[@id='mCSB_2_scrollbar_vertical']/div"));
				actions.moveToElement(subMenu).click().build().perform();

				EventFiringWebDriver eventfiringwebdriver = new EventFiringWebDriver(driver);
				eventfiringwebdriver.executeScript("document.querySelector('#mCSB_2_scrollbar_vertical > div').scrollTop=800");
				Thread.sleep(1000);
				((JavascriptExecutor) driver).executeScript("scroll(0, 1000);");
				
//				objIndexPage.ScrollLnk.click();
//				objIndexPage.VideoLnk.clear();
		//	objIndexPage.LinkedinLnk.sendKeys(Helper.getData("SponsorPresenter", 2, 12));
				objIndexPage.PresenterSaveBtn.click();
				((JavascriptExecutor) driver).executeScript("scroll(0, -900);");
				Thread.sleep(2000);
				//objIndexPage.AddPresenterBtn.click();

			
			Thread.sleep(2000);
			//objIndexPage.AddPresenterCloseBtn.click();
			Thread.sleep(2000);
			objIndexPage.PresenterpageSaveBtn.click();
			
			
			}
		
		
		
		
		public void SecondSponsorPresenter() throws Exception {

			((JavascriptExecutor) driver).executeScript("scroll(0, -800);");

			objIndexPage.AddPresenterBtn.click();

			for (int i = 2; i <= 4; i++) 

				//objIndexPage.PresenterImg.sendKeys(Helper.getData("SponsorPresenter", i, 2));
				//((JavascriptExecutor) driver).executeScript("scroll(0, 800);");
				//Thread.sleep(3000);
				//Helper.takeScreenshot(driver);
				//objIndexPage.PresenterImageCrop.click();
				Thread.sleep(3000);
				
				Thread.sleep(5000);
				Actions actions = new Actions(driver);
				WebElement subMenu = driver.findElement(By.xpath("//*[@id='mCSB_5_dragger_vertical']"));
				actions.moveToElement(subMenu).click().build().perform();
				((JavascriptExecutor) driver).executeScript("scroll(0, -900);");

				objIndexPage.PresenterFirstName.sendKeys(Helper.getData("SponsorPresenter", 3, 3));
				objIndexPage.PresenterLastName.sendKeys(Helper.getData("SponsorPresenter", 3, 4));
				objIndexPage.PresenterEmailid.sendKeys(Helper.getData("SponsorPresenter", 3, 5));
				Thread.sleep(2000);
				objIndexPage.SelectPresenterPhoneCode(Helper.getData("SponsorPresenter", 3, 7));
				
				objIndexPage.PresenterPhoneNumber.sendKeys(Helper.getData("SponsorPresenter", 3, 6));
				Thread.sleep(2000);
				objIndexPage.PrimaryContactChkBx(Helper.getData("SponsorPresenter", 3, 9));
				Thread.sleep(2000);
				objIndexPage.PresenterDesignation.sendKeys(Helper.getData("SponsorPresenter", 3, 11));
				//objIndexPage.PresenterWebsite.sendKeys(Helper.getData("SponsorPresenter", i, 6));
				// objIndexPage.PresenterType.sendKeys(Helper.getData("SponsorPresenter",
				// 2, 64));
				objIndexPage.PresenterDescription.sendKeys(Helper.getData("SponsorPresenter", 3, 8));
				
				// objIndexPage.PrimaryContactChkBx.click();
				 
				// objIndexPage.PrimaryContactChkBx.clear();
				
				
				EventFiringWebDriver eventfiringwebdriver = new EventFiringWebDriver(driver);
				eventfiringwebdriver.executeScript("document.querySelector('#mCSB_2_scrollbar_vertical > div').scrollTop=800");
				Thread.sleep(1000);
				((JavascriptExecutor) driver).executeScript("scroll(0, 1000);");
				
//				objIndexPage.ScrollLnk.click();
//				objIndexPage.VideoLnk.clear();
		//	objIndexPage.LinkedinLnk.sendKeys(Helper.getData("SponsorPresenter", 2, 12));
				objIndexPage.PresenterSaveBtn.click();
				((JavascriptExecutor) driver).executeScript("scroll(0, -900);");
				Thread.sleep(2000);
				//objIndexPage.AddPresenterBtn.click();

			
			Thread.sleep(2000);
			//objIndexPage.AddPresenterCloseBtn.click();
			Thread.sleep(2000);
			objIndexPage.PresenterpageSaveBtn.click();
			
			
			}
		
	

		public void ExhibitorPresenter() throws Exception {

			((JavascriptExecutor) driver).executeScript("scroll(0, -900);");

			objIndexPage.AddPresenterBtn.click();

			for (int i = 2; i <= 4; i++) 
				
				
				Thread.sleep(4000);
				//objIndexPage.PresenterImg.sendKeys(Helper.getData("ExhibitorPresenter", 2, 2));
			//Thread.sleep(5000);
				//((JavascriptExecutor) driver).executeScript("scroll(0, 800);");
				//Thread.sleep(5000);
				//Helper.takeScreenshot(driver);
				//objIndexPage.PresenterImageCrop.click();
			
				Thread.sleep(3000);
				//((JavascriptExecutor) driver).executeScript("scroll(0, -500);");
				
				 //public void QuestionScrollDown() throws Exception {
			    		
//				Actions actions = new Actions(driver);
//				WebElement subMenu = driver.findElement(By.xpath("//*[@id='//*[@id='mCSB_5_scrollbar_vertical']/div/div[2]"));
//				actions.moveToElement(subMenu).click().build().perform();
//				
				((JavascriptExecutor) driver).executeScript("scroll(0, -900);");			
				//objIndexPage.PresenterName.click();
				Thread.sleep(2000);
				objIndexPage.PresenterFirstName.sendKeys(Helper.getData("ExhibitorPresenter", 2, 3));
				Thread.sleep(2000);
				objIndexPage.PresenterLastName.sendKeys(Helper.getData("ExhibitorPresenter", 2, 4));
				Thread.sleep(2000);
				objIndexPage.PresenterEmailid.sendKeys(Helper.getData("ExhibitorPresenter", 2, 5));
				Thread.sleep(2000);
				objIndexPage.PresenterPhoneNumber.sendKeys(Helper.getData("ExhibitorPresenter", 2, 7));
				Thread.sleep(2000);
				 objIndexPage.SelectPresenterPhoneCode(Helper.getData("ExhibitorPresenter", 2, 6));
				
				objIndexPage.PresenterDesignation.sendKeys(Helper.getData("ExhibitorPresenter", 2, 8));
				
				
//				objIndexPage.ExhibitorPresenterRemuneration.sendKeys(Helper.getData("ExhibitorPresenter", 2, 9));
//				objIndexPage.ExhibitorPresenterFee.sendKeys(Helper.getData("ExhibitorPresenter", 2, 10));
//				objIndexPage.ExhibitorPresenterNumberOfFreeTickets.sendKeys(Helper.getData("ExhibitorPresenter", 2, 11));
				
				// objIndexPage.PrimaryContactChkBx.click();
				Actions a = new Actions(driver);
				WebElement SM = driver.findElement(By.xpath("//*[@id='mCSB_2_scrollbar_vertical']/div"));
				a.moveToElement(SM).click().build().perform();

				EventFiringWebDriver EFW = new EventFiringWebDriver(driver);
				EFW.executeScript("document.querySelector('#mCSB_2_scrollbar_vertical > div').scrollTop=800");
				Thread.sleep(1000);
							
				objIndexPage.ExhibitorPresenterDescription.sendKeys(Helper.getData("ExhibitorPresenter", 2, 12));
				//objIndexPage.VideoLnk.clear();
				//objIndexPage.VideoLnk.sendKeys(Helper.getData("ExhibitorPresenter", i, 13));
				objIndexPage.PresenterSaveBtn.click();
				((JavascriptExecutor) driver).executeScript("scroll(0, -900);");
				Thread.sleep(2000);
				//objIndexPage.AddPresenterBtn.click();
				
				Thread.sleep(2000);
				Actions actions1 = new Actions(driver);
				WebElement subMenu1 = driver.findElement(By.xpath("//*[@id='mCSB_2_scrollbar_vertical']/div"));
				actions1.moveToElement(subMenu1).click().build().perform();
				((JavascriptExecutor) driver).executeScript("scroll(0, 0);");

			//}
			Thread.sleep(2000);
			//objIndexPage.AddPresenterCloseBtn.click();
			
			objIndexPage.PresenterpageSaveBtn.click();

			//objIndexPage.FinishBtn.click();
		}
		
		public void SpeakerDetails() throws Exception {
			((JavascriptExecutor) driver).executeScript("scroll(0, -900);");
			
			objIndexPage.SpeakerBtn.click();
			
			for (int i = 2; i <= 2; i++) {
				
			
			Thread.sleep(2000);
			//objIndexPage.SpeakerImage.sendKeys(Helper.getData("AgendaSpeaker", 2, 2));
			//((JavascriptExecutor) driver).executeScript("scroll(0, 800);");
			Thread.sleep(5000);
//			Helper.takeScreenshot(driver);
		//objIndexPage.SpeakerImageCrop.click();
	//Thread.sleep(2000);
	//((JavascriptExecutor) driver).executeScript("scroll(0, 0);");
			objIndexPage.SpeakerNameTxt.sendKeys(Helper.getData("AgendaSpeaker", 2, 3));
			Thread.sleep(2000);
			objIndexPage.SpeakerLastName.sendKeys(Helper.getData("AgendaSpeaker", 2, 4));
			Thread.sleep(2000);
			objIndexPage.SpeakerEmailid.sendKeys(Helper.getData("AgendaSpeaker", 2, 5));
			Thread.sleep(2000);
			objIndexPage.selectSpeakerPhoneCodeDrpDwn(Helper.getData("AgendaSpeaker", 2, 6));
			
			objIndexPage.SpeakerPhone.sendKeys(Helper.getData("AgendaSpeaker", 2, 7));
			Thread.sleep(2000);
			
			objIndexPage.SpeakerJob.sendKeys(Helper.getData("AgendaSpeaker", 2, 8));
			Thread.sleep(2000);
			//objIndexPage.selectSpeakerTypeDrp(Helper.getData("AgendaSpeaker", 2, 8));
			Thread.sleep(2000);
			objIndexPage.selectSpeakerRegistrationFormDrp(Helper.getData("AgendaSpeaker", 2, 10));
			
		Thread.sleep(2000);

			objIndexPage.selectSpeakerAssignTicket(Helper.getData("AgendaSpeaker", 2, 19));
			
			
			
//			objIndexPage.SpeakerRemuneration.sendKeys(Helper.getData("AgendaSpeaker", 2, 10));
//			objIndexPage.SpeakerFee.sendKeys(Helper.getData("AgendaSpeaker", i, 11));
//			objIndexPage.SpeakerNooftickets.sendKeys(Helper.getData("AgendaSpeaker", i, 12));
//			
			
			EventFiringWebDriver EFW = new EventFiringWebDriver(driver);
			EFW.executeScript("document.querySelector('#mCSB_2_scrollbar_vertical > div').scrollTop=800");
			Thread.sleep(1000);
			
//			objIndexPage.SpeakerDescription.sendKeys(Helper.getData("AgendaSpeaker", 2, 13));
//			objIndexPage.SpeakerHostChkBx.click();
//			objIndexPage.VideoLinkTxtBx.clear();
//			objIndexPage.VideoLinkTxtBx.sendKeys(Helper.getData("AgendaSpeaker", 2, 17));
			objIndexPage.SpeakerSaveBtn.click();
			((JavascriptExecutor) driver).executeScript("scroll(0, 0);");
			Thread.sleep(2000);
//			objIndexPage.SpeakerBtn.click();
			
			Thread.sleep(2000);
			Actions actions = new Actions(driver);
			WebElement subMenu = driver.findElement(By.xpath("//*[@id='mCSB_2_scrollbar_vertical']/div"));
			actions.moveToElement(subMenu).click().build().perform();
			((JavascriptExecutor) driver).executeScript("scroll(0, 0);");
			

			Thread.sleep(2000);
			//objIndexPage.AddSpeakerCloseBtn.click();
			Thread.sleep(2000);
			objIndexPage.SpeakerPageSaveBtn.click();
		

			}
		}
		
		
		
		public void ChallengeJudge() throws Exception {

			((JavascriptExecutor) driver).executeScript("scroll(0, -900);");
			

			objIndexPage.AddjudgesBtn.click();
			
			//for (int i = 2; i <= 4; i++) {
				Thread.sleep(10000);
				//objIndexPage.JudgeImage.sendKeys(Helper.getData("ChallengeJudge", 2, 2));
				//((JavascriptExecutor) driver).executeScript("scroll(0, 800);");
				Thread.sleep(5000);
				//Helper.takeScreenshot(driver);
				//objIndexPage.JudgeImageCropBtn.click();
			
				Thread.sleep(2000);
						    		
			//((JavascriptExecutor) driver).executeScript("scroll(0, 1000);");
				//objIndexPage.judgeNameTxtBx.clear();
				objIndexPage.judgeNameTxtBx.sendKeys(Helper.getData("ChallengeJudge", 2, 3));
				//Thread.sleep(2000);
				objIndexPage.JudgelastnameTxtBx.sendKeys(Helper.getData("ChallengeJudge", 2, 4));
				objIndexPage.JudgeEmailTxtBx.sendKeys(Helper.getData("ChallengeJudge", 2, 5));
				objIndexPage.selectJudgecodeDrpdwn(Helper.getData("ChallengeJudge", 2, 7));
				objIndexPage.JudgeNumberTxtBx.sendKeys(Helper.getData("ChallengeJudge", 2, 8));
				 objIndexPage.JudgeJobTitleTxtBx.sendKeys(Helper.getData("ChallengeJudge", 2, 9));
				
				objIndexPage.selectJudgeAssignticketDrpDwn(Helper.getData("ChallengeJudge", 2, 10));
				//objIndexPage.RemunerationTxtBx.sendKeys(Helper.getData("ChallengeJudge", 2, 9));
				//objIndexPage.FeeTxtBx.sendKeys(Helper.getData("ChallengeJudge", 2, 10));
				//objIndexPage.judgeNoofFreeTicketsTxtBx.sendKeys(Helper.getData("ChallengeJudge", 2, 13));
				
				Actions a = new Actions(driver);
				WebElement SM = driver.findElement(By.xpath("//*[@id='mCSB_2_scrollbar_vertical']/div"));
				a.moveToElement(SM).click().build().perform();

				EventFiringWebDriver EFW = new EventFiringWebDriver(driver);
				EFW.executeScript("document.querySelector('#mCSB_2_scrollbar_vertical > div').scrollTop=800");
				Thread.sleep(1000);
							
				//objIndexPage.judgeDescriptionTxtBx.sendKeys(Helper.getData("ChallengeJudge", 2, 14));
				//objIndexPage.judgeVideoLinkTxtBx.clear();
				//objIndexPage.judgeVideoLinkTxtBx.sendKeys(Helper.getData("ChallengeJudge", 2, 15));
				
				objIndexPage.judgeSaveBtn.click();
				
				Thread.sleep(2000);
				Actions actions2 = new Actions(driver);
				WebElement subMenu2 = driver.findElement(By.xpath("//*[@id='mCSB_2_scrollbar_vertical']/div"));
				actions2.moveToElement(subMenu2).click().build().perform();
				((JavascriptExecutor) driver).executeScript("scroll(0, 0);");

			
			Thread.sleep(2000);
			//objIndexPage.judgecloselnk.click();
			
			objIndexPage.ChallengeSaveBtn.click();
			Thread.sleep(2000);

			//objIndexPage.FinishBtn.click();
		}
		

		
		
		
//		public void EventAgendasNextButton() throws Exception {
//
//			objIndexPage.AgendaOrgSponsorTopicNextBtn.click();
//			Thread.sleep(2000);
//		}


		// Event Tickets page

		public void EventTicketsPage(int row) throws Exception {

			// this.LoginEvents();
			// Thread.sleep(2000);
			// this.CreateEventPage(row);
			// Thread.sleep(2000);
			// this.EventOptinsPage(row);
			// Thread.sleep(2000);
			// this.EventTopicsPage(row);
			//objIndexPage.AgendaOrgSponsorTopicNextBtn.click();
			((JavascriptExecutor) driver).executeScript("scroll(0, 0);");
			Thread.sleep(2000);
			objIndexPage.SalesStartDateTxtBx.sendKeys(Helper.getData("EventStaging", row, 59));
			objIndexPage.SalesStartDateTxtBx.click();
			objIndexPage.SalesEndDateTxtBx.sendKeys(Helper.getData("EventStaging", row, 60));
			objIndexPage.SalesEndDateTxtBx.click();
			objIndexPage.TicketsAllowPerOrderTxtBx.sendKeys(Helper.getData("EventStaging", row, 61));
			objIndexPage.TransactionChargesDrpDwn(Helper.getData("EventStaging", row, 62));
			objIndexPage.AllAttendeesRegisterChkBx.click();
			objIndexPage.LandingPageUrl.click();
			objIndexPage.LandingPageUrlTxtBx.sendKeys(Helper.getData("EventStaging", row, 65));
		
//			objIndexPage.RefundRadioBtn(Helper.getData("CreateEventPage", row, 66));

			String RefundRadioBtn = (Helper.getData("EventStaging", row, 66));
			

			if (RefundRadioBtn.contains("Refund"))

			{

				objIndexPage.RefundWithConditionChkBx.click();
				Thread.sleep(2000);
				objIndexPage.selectRefundTypeDrpDwn(Helper.getData("EventStaging", row, 68));
				objIndexPage.RefundTypeTxtBx.sendKeys(Helper.getData("EventStaging", row, 69));
				objIndexPage.EventStartDateTxtBx.sendKeys(Helper.getData("EventStaging", row, 70));
				objIndexPage.EventAddBtn.click();
				//objIndexPage.CancellationPolicyTxtBx.sendKeys(Helper.getData("EventStaging", row, 67));
				((JavascriptExecutor) driver).executeScript("scroll(0, 900);");
				objIndexPage.AddBtn.click();
				Thread.sleep(2000);

			} else if (RefundRadioBtn.contains("No refund")) {
				
				objIndexPage.NoRefundChkBx.click();

				objIndexPage.CancellationPolicyTxtBx.sendKeys(Helper.getData("EventStaging", row, 67));
			}

			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 800)");
			Thread.sleep(2000);
			
			
		}
			
			public void AllTicketTypeDropDwn(int row) throws Exception {
				//((JavascriptExecutor) driver).executeScript("scroll(0, 900);");
				
				
				objIndexPage.EventAddTicketsBtn.click();
				
				for (int i = 2; i <= 4; i++) 
				
			Thread.sleep(2000);
			objIndexPage.TicketNameTxtBx.click();
			objIndexPage.TicketNameTxtBx.sendKeys(Helper.getData("Tickets", 2, 2));
			
		
			
			String AllTicketTypeDropDwn = Helper.getData("EventStaging", 2, 72);
			
//			if (AllTicketTypeDropDwn.contains("General")){
//				objIndexPage.TicketTypeDropDwn(Helper.getData("Tickets", 2, 3));
//				objIndexPage.QuantityTxtBx.sendKeys(Helper.getData("Tickets", 2, 4));
//				objIndexPage.EventselectPriceDrpDwn(Helper.getData("Tickets", 2, 5));
//				objIndexPage.PriceTxtBx.sendKeys(Helper.getData("Tickets", 2, 6));
//				((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 500)");
//				Thread.sleep(2000);
//				
//				//objIndexPage.EventSessionTypeDrpDwn(Helper.getData("CreateEventPage", row, 77));
////				objIndexPage.TicketsSessionTypeDrp.click();
////				Thread.sleep(2000);
////				objIndexPage.AddnewBtn.click();
////				Thread.sleep(2000);
////				objIndexPage.AddnewTxtBx.sendKeys(Helper.getData("Tickets", 2, 10));
////				Thread.sleep(2000);
////				objIndexPage.AddnewTxtBtn.click();
////				Thread.sleep(7000);
//				objIndexPage.EventSessionTypeDrpDwn(Helper.getData("Tickets", 2, 7));
//				Thread.sleep(2000);
//				objIndexPage.selectAteendeeRegistrationFormDrpDwn(Helper.getData("Tickets", 2, 8));
//				// objIndexPage.Description.sendKeys(Helper.getData("CreateEventPage",
//				// row, 79));
//				((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 1500)");
//				Thread.sleep(2000);
//				objIndexPage.AddticketsBtn.click();
//				Thread.sleep(2000);
//				//((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 900)");
//				Thread.sleep(2000);
//				//objIndexPage.NextBtn.click();
//				Thread.sleep(2000);
//				//objIndexPage.FinishBtn.click();
				
			
				
			
				
			if (AllTicketTypeDropDwn.contains("Challenge")) {

				//objIndexPage.EventAddTicketsBtn.click();
				objIndexPage.EventAddTicketsBtn.click();
				Thread.sleep(2000);
				objIndexPage.TicketNameTxtBx.click();
				objIndexPage.TicketNameTxtBx.sendKeys(Helper.getData("Tickets", 4, 2));
				
				
				objIndexPage.TicketTypeDropDwn(Helper.getData("Tickets", 4, 3));
				objIndexPage.QuantityTxtBx.sendKeys(Helper.getData("Tickets", 4, 4));
				objIndexPage.EventselectPriceDrpDwn(Helper.getData("Tickets", 4, 5));
				objIndexPage.PriceTxtBx.sendKeys(Helper.getData("Tickets", 4, 6));
				((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 500)");
				Thread.sleep(2000);
				
				//objIndexPage.ChallengeDrpDwn(Helper.getData("Tickets", row, 80));
				
				//objIndexPage.selectAteendeeRegistrationFormDrpDwn(Helper.getData("CreateEventPage", row, 78));
				// objIndexPage.Description.sendKeys(Helper.getData("Tickets",
				// i, 79));
				((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 1500)");
				Thread.sleep(2000);
				objIndexPage.AddticketsBtn.click();
				Thread.sleep(2000);
				((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 900)");
				Thread.sleep(2000);
				
				//objIndexPage.FinishBtn.click();
				Thread.sleep(2000);
			}
			
				
//	 if (AllTicketTypeDropDwn.contains("Speaker")) {
//		// ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, -200)");
//		 objIndexPage.EventAddTicketsBtn.click();
//		 Thread.sleep(2000);
//		 objIndexPage.TicketNameTxtBx.click();
//			objIndexPage.TicketNameTxtBx.sendKeys(Helper.getData("Tickets", 3, 2));
//			
//				objIndexPage.TicketTypeDropDwn(Helper.getData("Tickets", 3, 3));
//				objIndexPage.QuantityTxtBx.sendKeys(Helper.getData("Tickets", 3, 4));
//				//objIndexPage.EventselectPriceDrpDwn(Helper.getData("CreateEventPage", row, 75));
//				
//				objIndexPage.AddticketsBtn.click();
//				Thread.sleep(2000);
//				//((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 900)");
//				Thread.sleep(2000);
				
	
				
				
				 if (AllTicketTypeDropDwn.contains("Judge")) {
						// ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, -200)");
						 objIndexPage.EventAddTicketsBtn.click();
						 Thread.sleep(2000);
						 objIndexPage.TicketNameTxtBx.click();
							objIndexPage.TicketNameTxtBx.sendKeys(Helper.getData("Tickets", 5, 2));
							
								objIndexPage.TicketTypeDropDwn(Helper.getData("Tickets", 5, 3));
								objIndexPage.QuantityTxtBx.sendKeys(Helper.getData("Tickets", 5, 4));
								//objIndexPage.EventselectPriceDrpDwn(Helper.getData("CreateEventPage", row, 75));
								
								objIndexPage.AddticketsBtn.click();
								Thread.sleep(2000);
								//((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 900)");
								Thread.sleep(2000);
				 }
				 objIndexPage.NextBtn.click();
			}
//								((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 400)");
//								
//								if (AllTicketTypeDropDwn.contains("Donations")) {
//									// ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, -200)");
//									 objIndexPage.EventAddTicketsBtn.click();
//									 Thread.sleep(2000);
//									 objIndexPage.TicketNameTxtBx.click();
//										objIndexPage.TicketNameTxtBx.sendKeys(Helper.getData("Tickets", 6, 2));
//										Thread.sleep(2000);
//								objIndexPage.TicketTypeDropDwn(Helper.getData("Tickets", 6, 3));
//								Thread.sleep(2000);
//								objIndexPage.selectDonationsDrpdwn(Helper.getData("Tickets", 2, 10));
//								Thread.sleep(2000);
//								objIndexPage.Dtxtbx1.sendKeys(Helper.getData("Tickets", 2, 11));
//								Thread.sleep(2000);
//								objIndexPage.Dtxtbx2.sendKeys(Helper.getData("Tickets", 2, 12));
//								Thread.sleep(2000);
//								objIndexPage.Dtxtbx3.sendKeys(Helper.getData("Tickets", 2, 13));
//								Thread.sleep(2000);
//								objIndexPage.Dtxtbx4.sendKeys(Helper.getData("Tickets", 2, 14));
//								Thread.sleep(2000);
//								objIndexPage.selectAteendeeRegistrationFormDrpDwn(Helper.getData("Tickets", 6, 8));
//								
//									objIndexPage.AddticketsBtn.click();
//											Thread.sleep(2000);
//											//((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 900)");
//											Thread.sleep(2000);
//								
//								
//								
//											 if (AllTicketTypeDropDwn.contains("Raffle")) {
//													// ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, -200)");
//										 objIndexPage.EventAddTicketsBtn.click();
//								 Thread.sleep(2000);
//								 objIndexPage.TicketNameTxtBx.click();
//									objIndexPage.TicketNameTxtBx.sendKeys(Helper.getData("Tickets", 7, 2));
//								 Thread.sleep(2000);
//									objIndexPage.TicketTypeDropDwn(Helper.getData("Tickets", 7, 3));
//									Thread.sleep(2000);
//									objIndexPage.QuantityTxtBx.sendKeys(Helper.getData("Tickets", 7, 4));
//									 Thread.sleep(2000);
//							objIndexPage.EventselectPriceDrpDwn(Helper.getData("Tickets", 7, 5));
//							 Thread.sleep(2000);
//						    objIndexPage.PriceTxtBx.sendKeys(Helper.getData("Tickets", 7, 6));
//						    Thread.sleep(2000);
//							objIndexPage.MaximumTicketsperorder.sendKeys(Helper.getData("Tickets", 2, 15));
//							 Thread.sleep(2000);
//							 objIndexPage.selectAteendeeRegistrationFormDrpDwn(Helper.getData("Tickets", 7, 8));
//								
//							objIndexPage.AddticketsBtn.click();
//								Thread.sleep(2000);
//							//((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 900)");
//							Thread.sleep(2000);
//							
//						//		objIndexPage.NextBtn.click();
	 
//			}
//			}
//				}
//			}
//			}
//			}
//		
//		

		public void EventTicketPageSkipandNext() throws Exception {
			objIndexPage.NextDrpDwnarrow.click();
			objIndexPage.SkipandPublishBtn.click();
			
			
		}

			// objIndexPage.BadgeTemplateDropDwn(Helper.getData("CreateEventPage",
			// row, 73));
			

					
		public void EventWithoutTicketsPublish() throws Exception {

			Thread.sleep(2000);

			objIndexPage.TicketsSaveandPublishDrpBtn.click();
			objIndexPage.TicketsSaveandNextPublishBtn.click();
			Thread.sleep(3000);
			objIndexPage.PublishDrpDwn.click();
			Thread.sleep(5000);
			objIndexPage.PublishBtn.click();
			Thread.sleep(5000);
			objIndexPage.PublishProcessBtn.click();
			Thread.sleep(5000);

		}
		
		public void SponsorSaveBtn() throws Exception {
			objIndexPage.SponsorAgendaPageSaveBtn.click();
		}
		

		public void EventTicketsSaveAndNextPublish() throws Exception {
			

		}
		
		public void EventIndivTicketsCheckIn() throws Exception {

		}

		public void EventViewPage(int row) throws Exception {
		
			Thread.sleep(2000);

			objIndexPage.AgendaManagementTab.click();
			Thread.sleep(2000);
			objIndexPage.ChallengeTab.click();
			Thread.sleep(3000);
			objIndexPage.TicketsTab.click();
			Thread.sleep(3000);
			objIndexPage.LiveTab.click();
			Thread.sleep(3000);
			objIndexPage.EmailTab.click();
			Thread.sleep(2000);
			//objIndexPage.EmailTxtBxTab.sendKeys(Helper.getData("SurveyEditMethods", 2, 24));
			//Thread.sleep(2000);
			//objIndexPage.CCBCCLnk.click();
			//Thread.sleep(2000);
			//objIndexPage.CCTxtBx.sendKeys(Helper.getData("SurveyEditMethods", 2, 25));
			//Thread.sleep(2000);
			//objIndexPage.BCCTxtBx.sendKeys(Helper.getData("SurveyEditMethods", 2, 26));
			//((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 800)");
			//Thread.sleep(2000);
			//objIndexPage.SendlaterChkBx.click();
			//Thread.sleep(2000);
			//objIndexPage.ScheduleDateTxtBx.sendKeys(Helper.getData("SurveyEditMethods", 2, 27));
			//Thread.sleep(2000);
			//objIndexPage.SendBtn.click();
			//Thread.sleep(2000);
			//((JavascriptExecutor) driver).executeScript("window.scrollTo(0, -1000)");
			objIndexPage.TicketOrderTab.click();
			Thread.sleep(3000);
			objIndexPage.AttendeesTab.click();
			Thread.sleep(3000);
			objIndexPage.ActivityPointsConfiTab.click();
			Thread.sleep(3000);
			objIndexPage.CopyURLlnk.click();
			Thread.sleep(2000);
			objIndexPage.VisitEventLnk.click();
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


