package EventPage_PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateEventPageOld {

	WebDriver driver;
	JavascriptExecutor jse;

	// constructor for initializing the class objects
	public CreateEventPageOld(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all public WebElements
		PageFactory.initElements(driver, this);
	}

	// Creating New Event as 22nd OCT 2018

	@FindBy(xpath = "//*[@id='txtEventName']")
	public WebElement eventNameTxtBx;
	
	@FindBy(xpath = "//*[@id='txtEventUniqueCode']")
	public WebElement eventEasySearchCodeTxtBx;

	@FindBy(xpath = "//*[@id='txtEventVenue']")
	public WebElement eventVenueTxtBx;

	@FindBy(xpath = "//input[@id='autocomplete']")
	public WebElement locationTxtBx;

	@FindBy(xpath = "//*[@id='tab1']/div[1]/div/div[2]/div/div[2]/div[4]/div/div/input")
	public WebElement TagsBx;

	@FindBy(xpath = "//*[@id='tab1']/div[1]/div/div[2]/div/div[2]/div[5]/div/div[2]/div[3]/div[2]")
	public WebElement eventDescriptionTxtBx;

	@FindBy(xpath = "//*[@id='EventTypeDiv']/div/div[1]/div")
	public WebElement eventTypeDrpBx;

	@FindBy(xpath = "//*[@id='EventTypeDiv']/div/div[2]/div[1]/input")
	public WebElement eventSearch;

	@FindBy(xpath = "//*[@id='EventTypeDiv']/div/div[2]/div[2]/div[not(contains(@class, 'hidden'))]/span")
	public WebElement eventChkBx;

	public void eventTypeDrpDwn(String value) throws Exception {
		eventTypeDrpBx.click();
		Thread.sleep(2000);
		String strMain = value;
		String[] arrSplit = strMain.split(",");
		for (int i = 0; i < arrSplit.length; i++) {
			eventSearch.sendKeys(arrSplit[i].trim());
			eventChkBx.click();
			Thread.sleep(2000);
			eventSearch.clear();
			Thread.sleep(4000);
		}
	}

	@FindBy(xpath = "//*[@id='EventCategoryDiv']/div/div[1]/div")
	public WebElement eventCategoriesDrpBx;

	@FindBy(xpath = "//*[@id='EventCategoryDiv']/div/div[2]/div[1]/input")
	public WebElement eventCategoriesSearch;

	@FindBy(xpath = "//*[@id='EventCategoryDiv']/div/div[2]/div[2]/div[not(contains(@class, 'hidden'))]/span")
	public WebElement eventCategoriesChkBx;

	public void eventCategoriesDrpDwn(String value) throws Exception {
		eventCategoriesDrpBx.click();
		Thread.sleep(2000);
		String strMain = value;
		String[] arrSplit = strMain.split(",");
		for (int i = 0; i < arrSplit.length; i++) {
			eventCategoriesSearch.sendKeys(arrSplit[i].trim());
			eventCategoriesChkBx.click();
			Thread.sleep(2000);
			eventCategoriesSearch.clear();
			Thread.sleep(4000);
		}
	}

	@FindBy(xpath = "//*[@id='selecttimezone']")
	public WebElement timeZoneDrpBx;

	@FindBy(xpath = "//*[@id='ddlSurveysEvents']")
	public WebElement surveyDrpBx;

	@FindBy(xpath = "//*[@id='tab1']/div[1]/div/div[2]/div/div[2]/div[14]/div/div[2]/label/i[2]")
	public WebElement eventPublicRadioBtn;

	@FindBy(xpath = "//*[@id='tab1']/div[1]/div/div[2]/div/div[2]/div[14]/div/div[3]/label/i[1]")
	public WebElement eventPrivateRadioBtn;

	public void eventPrivacyRadioBtn(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("Public")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", eventPublicRadioBtn);
			eventPublicRadioBtn.click();
		} else if (value.equalsIgnoreCase("Private")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", eventPrivateRadioBtn);
			eventPrivateRadioBtn.click();
		}
	}

	// Are you Xpaths

	@FindBy(xpath = "//*[@id='ddlAreyou']")
	public WebElement AreyouDrpDwn;

	public void selectAreYou(String value) {
		Select select = new Select(AreyouDrpDwn);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='ddlEventSponsorCategory']")
	public WebElement SpeakerAndSponsorCategories;
	
	public void SpeakerAndSponsorCategoriesDrpDwn(String value) {
		Select select = new Select(SpeakerAndSponsorCategories);
		select.selectByVisibleText(value);
	}
	
	@FindBy(xpath = "//*[@id='txtOrganizerName']")
	public WebElement eventorganizernameTxtBx;

	@FindBy(xpath = "//*[@id='txtOrganizerEmail']")
	public WebElement EmailTxtBx;

	@FindBy(xpath = "//*[@id='txtOrganizerDescription']")
	public WebElement organizerdescriptionTxtBx;

	@FindBy(xpath = "//*[@id='txtOrganizerPhone']")
	public WebElement phoneTxtBx;

	@FindBy(xpath = "//*[@id='txtOrganizerWebsite']")
	public WebElement websiteTxtBx;

	/*
	 * @FindBy(xpath = "//*[@id='divdocumentTicket']/div/span/label/span[1]")
	 * public WebElement eventticketTxtBx;
	 */

	@FindBy(xpath = "//*[@id='filedocumentnameTicket']")
	public WebElement eventticketTxtBx;

	// One day and Multiple days

	
	@FindBy(xpath = "//*[@id='tab1']/div[1]/div/div[2]/div/div[2]/div[13]/div[2]/label/i[2]")
	public WebElement onedayRadioBtn;

	@FindBy(xpath = "//*[@id='tab1']/div[1]/div/div[2]/div/div[2]/div[13]/div[3]/label/i[1]")
	public WebElement MultipledayRadioBtn;

	public void eventTimeSpan(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("One day event")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", onedayRadioBtn);
			onedayRadioBtn.click();
		} else if (value.equalsIgnoreCase("Multiple days event")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", MultipledayRadioBtn);
			MultipledayRadioBtn.click();
		}
	}
	// Image and URL

	@FindBy(xpath = "//*[@id='filedocumentname']")
	public WebElement eventImage;

	@FindBy(xpath = "//*[@id='btnCrop']")
	public WebElement cropandProceed;

	@FindBy(xpath = "//*[@id='textYoutubepage']")
	public WebElement Youtube;

	@FindBy(xpath = "//*[@id='textFacebookpage']")
	public WebElement FBUrl;

	@FindBy(xpath = "//*[@id='textLinkedInpage']")
	public WebElement LinkedinUrl;

	@FindBy(xpath = "//*[@id='textTwitterpage']")
	public WebElement twitterUrl;

	// Date, Start and End dates

	@FindBy(xpath = "//*[@id='txtEndDate0']")
	public WebElement dateOneDay;

	@FindBy(xpath = "//*[@id='texttimetoreachfrom0']")
	public WebElement startTimeOneDay;

	@FindBy(xpath = "//*[@id='texttimetoreachTo0']")
	public WebElement endTimeOneDay;

	// for multiple days date and time in event detail page

	@FindBy(xpath = "//*[@id='txtEndDate1']")
	public WebElement dateM1;

	@FindBy(xpath = "//*[@id='texttimetoreachfrom1']")
	public WebElement startTimeM1;

	@FindBy(xpath = "//*[@id='texttimetoreachTo1']")
	public WebElement endTimeM1;

	@FindBy(xpath = "//*[@id='add']")
	public WebElement addDate;

	@FindBy(xpath = "//*[@id='txtEndDate2']")
	public WebElement dateM2;

	@FindBy(xpath = "//*[@id='texttimetoreachfrom2']")
	public WebElement startTimeM2;

	@FindBy(xpath = "//*[@id='texttimetoreachTo2']")
	public WebElement endTimeM2;

	// for multiple days date and time in Topic page

	@FindBy(xpath = "//*[@id='tab2']/div[1]/div[2]/div[1]/div[3]/div/div/input")
	public WebElement dateTopic;

	@FindBy(xpath = "//*[@id='texttimetoreachfromTPC']")
	public WebElement startTimeTopic;

	@FindBy(xpath = "//*[@id='texttimetoreachToTPC']")
	public WebElement endTimeTopic;

	@FindBy(xpath = "//*[@id='nextsurveydetails']")
	public WebElement saveAndNextBtn;

	@FindBy(xpath = "//*[@id='savecancel1']/a")
	public WebElement PreviousBtn;

	// Event Topic Page

	@FindBy(xpath = "//*[@id='tab2']/div[1]/div[1]/div[1]/div[2]/div[1]")
	public WebElement topicRadioBtn;

	@FindBy(xpath = "//*[@id='tab2']/div[1]/div[1]/div[1]/div[2]/div[2]")
	public WebElement boothRadioBtn;

	public void SelectTopicOrBooth(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("Topic")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", topicRadioBtn);
			topicRadioBtn.click();
		} else if (value.equalsIgnoreCase("Booth")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", boothRadioBtn);
			boothRadioBtn.click();
		}
	}

	@FindBy(xpath = "//*[@id='filedocumentComLogo']")
	public WebElement TopicCompanyLogoImage;

	@FindBy(xpath = "//*[@id='ddlSurveys']")
	public WebElement surveyEventDrpBx;

	public void SurveyTopicDropBx(String value) {
		Select select = new Select(surveyEventDrpBx);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='tab2']/div[1]/div[1]/div[4]/label")
	public WebElement surveyLinkChkBx;

	/*
	 * // No need to give company name as it get default
	 * 
	 * @FindBy(xpath = "//*[@id='txtTopicCompanyName']") public WebElement
	 * companyNameTxtBx;
	 */

	@FindBy(xpath = "//*[@id='txtTopicName']")
	public WebElement topicNameTxtBx;

	@FindBy(xpath = "//*[@id='texttimetoreachfromTPC']")
	public WebElement StartdateOne;

	@FindBy(xpath = "//*[@id='texttimetoreachToTPC']")
	public WebElement enddateOne;

	@FindBy(xpath = "//*[@id='txtroomnumber']")
	public WebElement RoomnoTxtBx;
	
	@FindBy(xpath = "//*[@id='txtTopicuniqueCode']")
	public WebElement TopicEasySearchCode;

	@FindBy(xpath = "//*[@id='ddltopictype']")
	public WebElement SessionTypeDrpDwn;

	@FindBy(xpath = "//*[@id='ddltopictype']/option[2]")
	public WebElement SessionTypeAddNewClk;

	@FindBy(xpath = "//*[@id='txttopictype']")
	public WebElement SessionTypeAddNewTxtBx;

	@FindBy(xpath = "//*[@id='ClidiemUser-form']/footer/button[2]")
	public WebElement SessionTypeAddNewBtn;

	@FindBy(xpath = "//*[@id='txtTopicDescription']")
	public WebElement descriptionTxt;

	@FindBy(xpath = "//*[@id='tab2']/div[1]/div[2]/div[3]")
	public WebElement addSpeakerBtn;

	// Add Speak details

	@FindBy(xpath = "//*[@id='filedocumentname1']")
	public WebElement speakerImage;

	@FindBy(xpath = "//*[@id='add-spea']/div[2]/div/div/div/div[2]/div/div[1]/div/input")
	public WebElement speakerNameTxtBx;

	@FindBy(xpath = "//*[@id='txtTitle']")
	public WebElement speakerTitleTxtBx;

	@FindBy(xpath = "//*[@id='txtSpkrCompany']")
	public WebElement companyNameTxtBx;
	
	@FindBy(xpath = "//*[@id='txtSpeakerEmailId']")
	public WebElement SpeakerEmailidTxtBx;
	
	@FindBy(xpath = "//*[@id='ddlSpeakerpackage']")
	public WebElement TopicSpeakerPackageDrp;
	
	public void TopicSpeakerPackageDrpDwn(String value) {
		Select select = new Select(TopicSpeakerPackageDrp);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='txtDescription']")
	public WebElement TopicSpeakerdescriptionTxtArea;
	
	@FindBy(xpath = "//*[@id='add-spea']/div[2]/div/div/div/div[1]/div[2]/label/label/div/i")
	public WebElement TopicSpeakerRegistered;

	@FindBy(xpath = "//*[@id='add-spea']/div[2]/div/div/div/div[1]/div[3]/label/label/div/i")
	public WebElement hostChkBx;

	@FindBy(xpath = "//*[@id='btnSaveSpeaker']")
	public WebElement savespeakerBtn;

	@FindBy(xpath = "//*[@id='btnSaveTopic']")
	public WebElement saveTopicBtn;

	@FindBy(xpath = "//*[@id='btnPublishTopics']")
	public WebElement saveAndNextTopicPageBtn;

	// without organi save button

	@FindBy(xpath = "//*[@id='savecancel1']/div/button[2]")
	public WebElement saveBtnTopicPage;

	// Sponsor Page

	@FindBy(xpath = "//*[@id='filedocumentnameSponsor']")
	public WebElement SponsorCompanyLogo;

	@FindBy(xpath = "//*[@id='modalSponsorLogoimagecrop']/div/div/div[3]/button[2]")
	public WebElement cropSponsorImage;

	@FindBy(xpath = "//*[@id='txtsponsorCompanyName']")
	public WebElement sponsorCompanyNameTxtBx;

	@FindBy(xpath = "//*[@id='ddlsponsoredpackage']")
	public WebElement sponsorPackageDrp;
	
	public void sponsorPackageDrpDwn(String value) {
		Select select = new Select(sponsorPackageDrp);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='txtsponsorContactName']")
	public WebElement sponsorContactName;

	@FindBy(xpath = "//*[@id='txtSponsorContactDesignation']")
	public WebElement sponsorContactdesignation;

	@FindBy(xpath = "//*[@id='txtSponsorContactPhone']")
	public WebElement sponsorContactPhone;

	@FindBy(xpath = "//*[@id='txtSponsorContactEmail']")
	public WebElement sponsorContactEmailId;

	@FindBy(xpath = "//*[@id='tab3']/div[2]/div[2]/div[1]/div[7]/div/label[1]/div/i")
	public WebElement IsSponsorRegistered;
	
	@FindBy(xpath = "//*[@id='checkOfflineDiv']/i[2]")
	public WebElement SponsoerPaymentTypeOffline;
	
	@FindBy(xpath = "//*[@id='checkOnlineDiv']/i[1]")
	public WebElement SponsoerPaymentTypeOnline;
	
	public void SponsoerPaymentTypeRadioBtn(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("Offline")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", SponsoerPaymentTypeOffline);
			SponsoerPaymentTypeOffline.click();
		} else if (value.equalsIgnoreCase("Online")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", SponsoerPaymentTypeOnline);
			SponsoerPaymentTypeOnline.click();
		}
	}
	
	@FindBy(xpath = "//*[@id='txtSponsorCompanyDescription']")
	public WebElement sponsorCompanyDescription;
	

	@FindBy(xpath = "//*[@id='SaveSponserButton']")
	public WebElement savesponsorBtn;

	@FindBy(xpath = "//*[@id='tab3']/div[4]/div/div/button[1]")
	public WebElement sponsornextbtn;

	// Tickets Page

	@FindBy(xpath = "//*[@id='btnAddrewards']")
	public WebElement AddTicketBtn;
	
	@FindBy(xpath = "//*[@id='ticketsdiv']/div[1]/div/div[1]/div/div/input")
	public WebElement startdateTicket;

	@FindBy(xpath = "//*[@id='txtToDateTime']")
	public WebElement EnddateTicket;

	@FindBy(xpath = "//*[@id='ticketsorder']")
	public WebElement ticketsAllowPerOrderTxt;

	@FindBy(xpath = "//*[@id='ticketsdiv']/div[1]/div/div[4]/div/label/label/div")
	public WebElement registerAttendeeChxBx;

	@FindBy(xpath = "//*[@id='feedropdown']")
	public WebElement Transactioncharges;

	public void TransactionchargesTicketDrpDwn(String value) throws InterruptedException {
		Select select = new Select(Transactioncharges);
		select.selectByVisibleText(value);
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//*[@id='ticketsdiv']/div[2]/div/div[2]/div/label/label/div/i")
	public WebElement landingUrl;

	@FindBy(xpath = "//*[@id='textlandingpage']")
	public WebElement landingUrlName;

	@FindBy(xpath = "//*[@id='checkEqualWeightageDiv']/i[2]")
	public WebElement partcipantsRadioBtn;

	@FindBy(xpath = "//*[@id='checkIndividualWeightageDiv']/i[1]")
	public WebElement NoRefundRadioBtn;

	public void ReturnPolicyType(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("refund")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", partcipantsRadioBtn);
			partcipantsRadioBtn.click();
		} else if (value.equalsIgnoreCase("No refund")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", NoRefundRadioBtn);
			NoRefundRadioBtn.click();
		}
	}

	@FindBy(xpath = "//*[@id='refundstext']")
	public WebElement RefundText;

	@FindBy(xpath = "//*[@id='txtCancellationPolicy']")
	public WebElement CancelpolicyTxtBx;

	@FindBy(xpath = "//*[@id='textticketname1']")
	public WebElement TicketNameTxtBx;

	@FindBy(xpath = "//*[@id='textticketquantity1']")
	public WebElement QuantityTxtBx;

	@FindBy(xpath = "//*[@id='ddlTicketCurrency']")
	public WebElement PriceDrpDwn;

	public void PriceTicketDrpDwn(String value) throws InterruptedException {
		Select select = new Select(PriceDrpDwn);
		select.selectByVisibleText(value);
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//*[@id='textticketprice1']")
	public WebElement PriceLoadTxtBx;

	@FindBy(xpath = "//*[@id='TicketSessionTypeDiv']/div")
	public WebElement Ticketsessiontype;

	@FindBy(xpath = "//*[@id='TicketSessionTypeDiv']/div/div[2]/div[1]/input")
	public WebElement Searchbx;

	@FindBy(xpath = "//*[@id='TicketSessionTypeDiv']/div/div[2]/div[2]/div[not(contains(@class, 'hidden'))]/span")
	public WebElement Ticketsessionchkbx;

	public void selectTicketsessiontype(String value) throws Exception {
		Ticketsessiontype.click();
		Thread.sleep(2000);
		String strMain = value;
		String[] arrSplit = strMain.split(",");
		for (int i = 0; i < arrSplit.length; i++) {
			Searchbx.sendKeys(arrSplit[i].trim());
			Ticketsessionchkbx.click();
			Thread.sleep(2000);
		}
	}
	
	@FindBy(xpath = "//*[@id='ddlticketregistaionform']")
	public WebElement AteendeeRegistrationFormDrp;
	
	public void AteendeeRegistrationFormDrpDwn(String value) throws InterruptedException {
		Select select = new Select(AteendeeRegistrationFormDrp);
		select.selectByVisibleText(value);
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//*[@id='MultipleDiv']/div/div/div[6]/div/div[2]/div[3]/div[2]")
	public WebElement eventTicketsdescriptionTxtBx;

	@FindBy(xpath = "//*[@id='addnewtickets']")
	public WebElement Addticket;

	@FindBy(xpath = "//*[@id='savecancel2']/div/button[1]")
	public WebElement saveticketpublish;

}
