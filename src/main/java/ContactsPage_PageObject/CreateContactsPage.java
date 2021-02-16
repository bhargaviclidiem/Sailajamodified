package ContactsPage_PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class CreateContactsPage {
	WebDriver driver;

	// WebElements for Email Marketing Page
	
	public CreateContactsPage(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all public WebElements
		PageFactory.initElements(driver, this);
	}
	
	// WebElements for Create Contacts Page
	
	@FindBy(xpath ="//*[@id='ulmenu']/li[4]/a")
	public WebElement ContactsTab;
	
	@FindBy(xpath ="//*[@id='ulmenu']/li[4]/ul/li[1]/a")
	public WebElement CreateContacts;
	
	// Personal Details
	
	@FindBy(xpath ="//*[@id='ContactID']")
	public WebElement ContactIDTxtBx;
	
	@FindBy(xpath ="//*[@id='txtnameFirstName']")
	public WebElement FirstNameTxtBx;
	
	@FindBy(xpath ="//*[@id='txtnameMiddleName']")
	public WebElement MiddleNameTxtBx;
	
	@FindBy(xpath ="//*[@id='txtnameLastName']")
	public WebElement LastNameTxtBX;
	
	@FindBy(xpath ="//*[@id='DateofBirth']")
	public WebElement DateofBirth;
	
	@FindBy(xpath ="//*[@id='MaritalStatus']")
	public WebElement MaritalstatusDrpDwn;
	
	public void selectMaritalstatusDrpDwn(String value) {
		Select select = new Select(MaritalstatusDrpDwn);
		select.selectByVisibleText(value);
	}
	
	@FindBy(xpath ="//*[@id='Gender']")
	public WebElement GenderDrpDwn;
	
	public void selectGenderDrpDwn(String value) {
		Select select = new Select(GenderDrpDwn);
		select.selectByVisibleText(value);
	}
	
	@FindBy(xpath ="//*[@id='EmailId']")
	public WebElement EmailidTxtBx;
	
	@FindBy(xpath ="//*[@id='PersonalDetails']/div[9]/div/div/div[1]/select")
	public WebElement PhoneNumDrpDwn;
	
	public void selectPhonenumDrpDwn(String value) {
		Select select = new Select(PhoneNumDrpDwn);
		select.selectByVisibleText(value);
	}
	
	@FindBy(xpath ="//*[@id='PhoneNumber']")
	public WebElement PhoneNumTxtBx;
	
	@FindBy(xpath ="//*[@id='Language']")
	public WebElement LanguageDrpDwn;
	
	public void selectlanguageDrpDwn(String value) {
		Select select = new Select(LanguageDrpDwn);
		select.selectByVisibleText(value);
	}
	
	@FindBy(xpath ="//*[@id='ContactGroupId']")
	public WebElement ContactGrpDrpDwn;
	
	@FindBy(xpath ="//*[@id='ContactGroupId']/option[2]")
	public WebElement ContactGrpAddButton;
	
	public void selectContactsGrpDrpDwn(String value) {
		Select select = new Select(ContactGrpDrpDwn);
		select.selectByVisibleText(value);
	}
	
	
	
	@FindBy(xpath ="//*[@id='txtgroupname']")
	public WebElement AddnameTxtBx;
	
	@FindBy(xpath ="//*[@id='SelectUsers']/span/div/div[1]/div")
	public WebElement UsersandRolesDrpDwn;
	
	@FindBy(xpath ="//*[@id='SelectUsers']/span/div/div[2]/div[1]/input")
	public WebElement UsersandRolesSearchDrpDwn;
	
	@FindBy(xpath ="//*[@id='SelectUsers']/span/div/div[2]/div[2]/div[2]/span/i")
	public WebElement UserandRoleChkBx;
	
	@FindBy(xpath ="//*[@id='txtgroupnotes']")
	public WebElement UsersNotesTxtBx;
	
	@FindBy(xpath ="//*[@id='addnewgroupmodal']/div/div/div[2]/form/footer/button[2]")
	public WebElement UsersaddBtn;
	
	@FindBy(xpath ="//*[@id='addnewgroupmodal']/div/div/div[2]/form/footer/button[1]")
	public WebElement UsersCancelBtn;
	
	@FindBy(xpath ="//*[@id='txtnameAge']")
	public WebElement AgeTxtBx;
	
	@FindBy(xpath ="//*[@id='autocomplete']")
	public WebElement AddressTxtBx;
	
	@FindBy(xpath ="//*[@id='route']")
	public WebElement StreetTxtBx;
	
	@FindBy(xpath ="//*[@id='locality']")
	public WebElement CityTxtBx;
	
	@FindBy(xpath ="//*[@id='country']")
	public WebElement CountryTxtBx;
	
	@FindBy(xpath ="//*[@id='administrative_area_level_1']")
	public WebElement StateTxtBx;
	
	@FindBy(xpath ="//*[@id='postal_code']")
	public WebElement ZIPCodeTxtBx;
	
	@FindBy(xpath ="//*[@id='textareaAlternateEmail']")
	public WebElement AlternateEmailidTxtBx;
	
	// Educational Details
	
	
	@FindBy(xpath ="//*[@id='HighestDegree']")
	public WebElement HighestDrpDwn;
	
	public void selectHighestDrpDwnDrpDwn(String value) {
		Select select = new Select(HighestDrpDwn);
		select.selectByVisibleText(value);
	}
	
	@FindBy(xpath ="//*[@id='textMajorStudy']")
	public WebElement MajorStudyTxtBx;
	
	@FindBy(xpath ="//*[@id='textInstitute']")
	public WebElement InstituteTxtBx;
	
	// Company Details
	
	@FindBy(xpath ="//*[@id='textCompanyName']")
	public WebElement CompanyName;
	
	@FindBy(xpath ="//*[@id='textJobTitle']")
	public WebElement JobTitleTxtBx;
	
	@FindBy(xpath ="//*[@id='CompanyDetails']/div[3]/div/div")
	public WebElement TagsTxtBx;
	
	@FindBy(xpath ="//*[@id='CompanyDetails']/div[4]/div/div/div/a[1]")
	public WebElement Rating1;
	
	@FindBy(xpath ="//*[@id='CompanyDetails']/div[4]/div/div/div/a[2]")
	public WebElement Rating2;
	
	@FindBy(xpath ="//*[@id='CompanyDetails']/div[4]/div/div/div/a[3]")
	public WebElement Rating3;
		
	@FindBy(xpath ="//*[@id='CompanyDetails']/div[4]/div/div/div/a[4]")
	public WebElement Rating4;
	
	
	@FindBy(xpath ="//*[@id='CompanyDetails']/div[4]/div/div/div/a[5]")
	public WebElement Rating5;
	
	
	@FindBy(xpath ="//*[@id='CompanyDetails']/div[4]/div/div/div/a[6]")
	public WebElement Rating6;
	
	
	@FindBy(xpath ="//*[@id='CompanyDetails']/div[4]/div/div/div/a[7]")
	public WebElement Rating7;
	
	
	@FindBy(xpath ="//*[@id='CompanyDetails']/div[4]/div/div/div/a[8]")
	public WebElement Rating8;
	
	
	@FindBy(xpath ="//*[@id='CompanyDetails']/div[4]/div/div/div/a[9]")
	public WebElement Rating9;
	
	
	@FindBy(xpath ="//*[@id='CompanyDetails']/div[4]/div/div/div/a[10]")
	public WebElement Rating10;
	
	// Details
	
	@FindBy(xpath ="//*[@id='autocomplete']")
	public WebElement OtherAddressTxtBx;
	
	
	@FindBy(xpath ="//*[@id='route']")
	public WebElement OtherStreetTxtBx;
	
	
	@FindBy(xpath ="//*[@id='locality']")
	public WebElement OtherCityTxtBx;
	
	@FindBy(xpath ="//*[@id='country']")
	public WebElement OtherCountryTxtBx;
	
	@FindBy(xpath ="//*[@id='administrative_area_level_1']")
	public WebElement OtherStateTxtBx;
	
	@FindBy(xpath ="//*[@id='postal_code']")
	public WebElement OtherZIPCodeTxtBx;
	
	// Sales Details
	
	
	@FindBy(xpath = "//*[@id='LeadSource']")
	public WebElement SalesLeadSourceDrpDwn;
	
	public void selectSalesLeadSourceDrpDwn(String value) {
		Select select = new Select(SalesLeadSourceDrpDwn);
		select.selectByVisibleText(value);
	}
	
	@FindBy(xpath ="//*[@id='LeadStatus']")
	public WebElement SalesLeadStatusDrpDwn;
	
	

	public void selectSalesLeadStatusDrpDwn(String value) {
		Select select = new Select(SalesLeadStatusDrpDwn);
		select.selectByVisibleText(value);
	}
	
	@FindBy(xpath ="//*[@id='LeadStage']")
	public WebElement SalesLeadStageDrpDwn;
	
	public void selectSalesLeadStageDrpDwn(String value) {
		Select select = new Select(SalesLeadStageDrpDwn);
		select.selectByVisibleText(value);
	}
	
	
	
	@FindBy(xpath ="//*[@id='location']/div/div[1]/div")
	public WebElement SalesSubscriptionTypeDrpDwn;
	
	
	
	@FindBy(xpath ="//*[@id='location']/div/div[2]/div[1]/input")
	public WebElement SalesSubscriptionSearchTxtBx;
	
public void selectSalesSubscriptionTypeDrpDwn(String value) throws Exception {
		
	SalesSubscriptionTypeDrpDwn.click();
		Thread.sleep(2000);
		String strMain = value;
		String[] arrSplit = strMain.split(",");
		for (int i = 0; i < arrSplit.length; i++) {
			SalesSubscriptionSearchTxtBx.sendKeys(arrSplit[i].trim());
			SalesSubscriptionChkBx.click();
			Thread.sleep(2000);
		}
		}
	
	@FindBy(xpath ="//*[@id='location']/div/div[2]/div[2]/div[4]/span/i")
	public WebElement SalesSubscriptionChkBx;
	
	@FindBy(xpath ="//*[@id='savecontactdetails']")
	public WebElement SaveBtn;
	
	@FindBy(xpath ="//*[@id='accordion-2']/div[2]/div/a[1]")
	public WebElement ResetBtn;
	
	@FindBy(xpath ="//*[@id='widget-grid']/div[1]/div[3]/div[1]/h4/div/span/a")
	public WebElement AddCreditsBtn;
	
	@FindBy(xpath ="//*[@id='widget-grid']/div[1]/div[3]/div[1]/h4/div/a[1]")
	public WebElement MyContactsBtn;
	
	@FindBy(xpath ="//*[@id='widget-grid']/div[1]/div[3]/div[1]/h4/div/a[2]")
	public WebElement ImportContactsBtn;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


