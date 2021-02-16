package EmailMarketingPage_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class EmailMarketingPage {

	WebDriver driver;

	@FindBy(xpath ="//*[@id='ulmenu']/li[5]/a")
	public WebElement EmailMarketingLnk;

	@FindBy(xpath ="//*[@id='ulmenu']/li[5]/ul/li[1]/a")
	public WebElement SendEmailMarketingLnk;
	
	
	// WebElements for Email Marketing Page
	
	@FindBy(xpath ="//*[@id='main']/div/div[1]/div/div[2]/a")
	public WebElement AddCredits;

	@FindBy(xpath ="//*[@id='addcreditstxt']")
	public WebElement AmountTxtBx;

	@FindBy(xpath ="//*[@id='AddcreditsAmount']")
	public WebElement AddBtn;

	@FindBy(xpath ="//*[@id='main']/div/div[2]/div/div[3]/div[1]/div[1]/div/div[2]/div[1]/div[1]/div/label[2]/label/div/i")
	public WebElement SendtoNonRespondsRDBtn;

	@FindBy(xpath ="//*[@id='Divshowtemplates']/label/label/div/i")
	public WebElement MessageTmpRDBtn;

	@FindBy(xpath ="//*[@id='TemplateNameId']")
	public WebElement Entertemplate;

	@FindBy(xpath ="//*[@id='ddlEmailType']")
	public WebElement SubscriptionTypeDrp;

	public void selectSubscriptionTypeDrp(String value) {
		Select select = new Select(SubscriptionTypeDrp );
			select.selectByVisibleText(value);
	}

	@FindBy(xpath ="//*[@id='emailcontacts']/span/div/div[1]")
	public WebElement contactsDrpdwn;

	
	public void selectcontactsDrpdwn(String value) throws Exception {
		contactsDrpdwn.click();
		Thread.sleep(2000);
		contactsSearch.sendKeys(value);
		 Thread.sleep(5000);
		 ContactsChkBx.click();
	 Thread.sleep(2000);
	}

	@FindBy(xpath ="//*[@id='emailcontacts']/span/div/div[2]/div[1]/input")
	public WebElement contactsSearch;

	@FindBy(xpath ="//*[@id='emailcontacts']/span/div/div[2]/div[2]/div[1]/span/i")
	public WebElement ContactsChkBx;

	@FindBy(xpath ="//*[@id='ddlTemplates']")
	public WebElement Messagetemp;

	@FindBy(xpath ="//*[@id='main']/div/div[2]/div/div[3]/div[1]/div[1]/div/div[6]/div/label/label/div/i")
	public WebElement emailChkBx;

	@FindBy(xpath ="//*[@id='ToEmail']")
	public WebElement EmailTo;

	@FindBy(xpath ="//*[@id='main']/div/div[2]/div/div[3]/div[1]/div[1]/div/div[7]/div/label/label/div/i")
	public WebElement sendLaterChkBx;

	@FindBy(xpath ="//*[@id='txtEndDate']")
	public WebElement DateTxtBx;

	@FindBy(xpath ="//*[@id='buttonshowccbcc']")
	public WebElement Ccbcc;

	@FindBy(xpath ="//*[@id='textshareCC']")
	public WebElement CC;

	@FindBy(xpath ="//*[@id='textshareBCC']")
	public WebElement Bcc;

	@FindBy(xpath ="//*[@id='textsubject_sharesurvey']")
	public WebElement Subject;

	@FindBy(xpath ="//*[@id='divconfirm']/div/div/div[3]/div[3]/div[2]")
	public WebElement Msg;

	@FindBy(xpath ="//*[@id='ul111']/li[1]")
	public WebElement CurrentDateandtime;

	@FindBy(xpath ="//*[@id='ul111']/li[2]")
	public WebElement CurrentDate;

	@FindBy(xpath ="//*[@id='ul3']/li[1]")
	public WebElement ReceiverName;

	@FindBy(xpath ="//*[@id='ul3']/li[1]")
	public WebElement ReceiverJob;

	@FindBy(xpath ="//*[@id='ul3']/li[1]")
	public WebElement ReceiverEmailID;

	@FindBy(xpath ="//*[@id='ul3']/li[1]")
	public WebElement ReceiverContactNumber;

	@FindBy(xpath ="//*[@id='ul3']/li[1]")
	public WebElement ReceiverContactGroup;

	@FindBy(xpath ="//*[@id='ul3']/li[1]")
	public WebElement ReceiverCompanyName;

	@FindBy(xpath ="//*[@id='ul3']/li[1]")
	public WebElement ReceiverAddress;

	@FindBy(xpath ="//*[@id='ul2']/li[1]")
	public WebElement TwitterUrl;

	@FindBy(xpath ="//*[@id='ul2']/li[2]")
	public WebElement RegisteredAddress;

	@FindBy(xpath ="//*[@id='ul2']/li[3]")
	public WebElement ParentCompany;

	@FindBy(xpath ="//*[@id='ul2']/li[4]")
	public WebElement OrganizationWebsite;

	@FindBy(xpath ="//*[@id='ul2']/li[5]")
	public WebElement OrganizationEmailID;

	@FindBy(xpath ="//*[@id='ul2']/li[6]")
	public WebElement OrganizationContactNumber;

	@FindBy(xpath ="//*[@id='ul2']/li[7]")
	public WebElement LinkedinUrl;

	@FindBy(xpath ="//*[@id='ul2']/li[8]")
	public WebElement LegalName;

	@FindBy(xpath ="//*[@id='ul2']/li[9]")
	public WebElement Google;

	@FindBy(xpath ="//*[@id='ul2']/li[10]")
	public WebElement FoundedYear;

	@FindBy(xpath ="//*[@id='ul2']/li[11]")
	public WebElement facebookURL;

	@FindBy(xpath ="//*[@id='//*[@id='My organization']")
	public WebElement CompanyType;

	@FindBy(xpath ="//*[@id='ul2']/li[13]")
	public WebElement BusinessStructure;

	@FindBy(xpath ="//*[@id='ul1']/li[1]")
	public WebElement MyRole;

	@FindBy(xpath ="//*[@id='ul1']/li[2]")
	public WebElement MyName;

	@FindBy(xpath ="//*[@id='ul1']/li[3]")
	public WebElement MyEmployeeID;

	@FindBy(xpath ="//*[@id='ul1']/li[4]")
	public WebElement MyEmailID;

	@FindBy(xpath ="//*[@id='ul1']/li[5]")
	public WebElement MyDesignation;

	@FindBy(xpath ="//*[@id='ul1']/li[6]")
	public WebElement MyContactNumber;

	@FindBy(xpath ="//*[@id='ul1']/li[7]")
	public WebElement MyAddress;

	@FindBy(xpath ="//*[@id='Divsendbutton']/div/button")
	public WebElement sendBtn;
					
	// select  Other fields
	public void OtherFields(String data) throws Exception{
		CurrentDateandtime.click();
		Thread.sleep(2000);
	}

	// select  Receiver fields
	public void Receiver(String data) throws Exception{
		ReceiverName.click();
		Thread.sleep(2000);
	}	
	
	// select  myorganization
	public void Myorganization(String data) throws Exception{
		TwitterUrl.click();
		Thread.sleep(2000);
	}
	
	// select  myself fields
	public void MySelf(String data) throws Exception{
		MyRole.click();
		Thread.sleep(2000);	
	}
		
	
}