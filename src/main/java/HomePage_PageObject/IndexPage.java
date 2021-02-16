
package HomePage_PageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class IndexPage {

	WebDriver driver;
	Actions action;

	// Login deatils

	@FindBy(xpath = "//*[@id='txtusername']")
	public WebElement userNameTxtbx;

	@FindBy(xpath = "//*[@id='txtpassword']")
	public WebElement passwordTxtbx;

	@FindBy(xpath = "//*[@id='aloginbutton']")
	public WebElement loginBtn;

	@FindBy(xpath = "/html/body/section[1]/div/div/div[2]/ul/li/a[3]")
	public  WebElement RegisterLnk;
	
	@FindBy(xpath = "//a[text()=' Register ']")
	public WebElement registerLnk;

	
	// Register Page web elements

	@FindBy(xpath = "//*[@id='aorganization']")
	public WebElement OrganizationLnk;

	@FindBy(xpath = "//*[@id='txtcompanyusername']")
	public WebElement OrgYourname;
	
	@FindBy(xpath = "//*[@id='txtcompanyuserlastname']")
	public WebElement Orglastname;
	

	@FindBy(xpath = "//*[@id='txtcompanyname']")
	public WebElement OrgName;

	
	
	@FindBy(xpath = "//*[@id='txtcompanyemailid']")
	public WebElement OrgEmailID;

	@FindBy(xpath = "//*[@id='selectcompanycountry']")//*[@id="selectcompanycountry"]
	public WebElement OrgCountyrDrp;

	public void OrgCountyrDrpDwn(String value) {
		Select select = new Select(OrgCountyrDrp);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='txtcompanycontactnumber']")
	public WebElement OrgContactNum;

	@FindBy(xpath = "//*[@id='txtcompanyFEIN']")
	public WebElement OrgFIEN;

	@FindBy(xpath = "//*[@id='txtcompanywebsite']")
	public WebElement OrgWebsite;

	@FindBy(xpath = "//*[@id='txtcompanypassword']")
	public WebElement OrgPassword;

	@FindBy(xpath = "//*[@id='txtcompanyconfirmpassword']")
	public WebElement OrgPasswordConf;

	@FindBy(xpath = "//*[@id='imgcompanycaptcha']")
	public WebElement OrgCodeTxt;

	@FindBy(xpath = "//*[@id='textcompanycaptcha']")
	public WebElement OrgCode;

	@FindBy(xpath = "//*[@id='tabs-company']/div[13]/div/label/div")
	public WebElement OrgAgreeChkBx;

	public void OrgAgreeChkBx(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("yes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", OrgAgreeChkBx);
			OrgAgreeChkBx.click();
		} else {

		}
	}


	@FindBy(xpath = "//*[@id='tabs-company']/div[13]/a")
	public WebElement OrgRegisterBtn;
	
	@FindBy(xpath = "//*[@id='txtverificationcode']")
	public WebElement VerificationTxtBx;
	
	@FindBy(xpath = "//*[@id='verification-form']/div/div[6]/a")
	public WebElement VerifyBtn;
	

	// Individual

	@FindBy(xpath = "//*[@id='aindividual']")
	public WebElement IndividualLnk;

	@FindBy(xpath = "//*[@id='txtcandidatefirstname']")
	public WebElement IndFirstname;

	@FindBy(xpath = "//*[@id='txtcandidatelastname']")
	public WebElement Indlastname;

	@FindBy(xpath = "//*[@id='txtcandidateemailid']")
	public WebElement IndEmailid;

	@FindBy(xpath = "//*[@id='selectcandidatecountry']")
	public WebElement IndCountryDrp;

	@FindBy(xpath = "//*[@id='txtcandidatecontactnumber']")
	public WebElement IndContact;

	@FindBy(xpath = "//*[@id='txtcandidatepassword']")
	public WebElement Indpassword;

	@FindBy(xpath = "//*[@id='txtcandidateconfirmpassword']")
	public WebElement Indpasswordconf;

	@FindBy(xpath = "//*[@id='imgcandidatecaptcha']")
	public WebElement Indcode;

	@FindBy(xpath = "//*[@id='tabs-candidate']/div[9]/div/label")
	public WebElement IndcodeText;

	@FindBy(xpath = "//*[@id='tabs-candidate']/div[10]/div/label/div/i")
	public WebElement IndAgreeChk;

	@FindBy(xpath = "//*[@id='tabs-candidate']/div[10]/a")
	public WebElement Indregister;

	@FindBy(xpath = "//*[@id='txtverificationcode']")
	public WebElement IndVerificationCode;

	@FindBy(xpath = "//*[@id='verification-form']/div[2]/div[6]/a")
	public WebElement IndVerifyBtn;
	
	
	// Company Information
	
	@FindBy(xpath = "//*[@id='menu1']/img")
	public WebElement CompanyDetailsTab;
	
	@FindBy(xpath = "//*[@id='ulmenu']/li[11]/div/content/div/ul/li[1]")
	public WebElement CDChangePassword;
	
	@FindBy(xpath = "//*[@id='ulmenu']/li[10]/div/content/div/ul/li[2]")
	public WebElement CDCompanyProfile;
	
	// Company Profile xpaths 
	
	@FindBy(xpath = "//*[@id='divviewprofiledetails']/div[4]/div/div[1]/h4/div/a")
	public WebElement CDCompanyProfileEditLnk;
	
	@FindBy(xpath = "//*[@id='textcompanylegalname']")
	public WebElement LegalNameTxtBx;
	
	@FindBy(xpath = "//*[@id='selectcompanytype']")
	public WebElement CPEditCompanyType;
	
	public void selectCPEditCompanyType(String value) {
		Select select = new Select(CPEditCompanyType);
		select.selectByVisibleText(value);
	}

	
	@FindBy(xpath = "//*[@id='companyprofileFEIN']")
	public WebElement FEINNumber;
	
	@FindBy(xpath = "//*[@id='textdunsnumber']")
	public WebElement DUNSNumber;
	
	@FindBy(xpath = "//*[@id='selectregisteredtimezone']")
	public WebElement CPEditTimeZone;
	
	public void selectCPEditTimeZone(String value) {
		Select select = new Select(CPEditTimeZone);
		select.selectByVisibleText(value);
	}
	
	
	@FindBy(xpath = "//*[@id='selectcurrency']")
	public WebElement CPEditCurrency;
	
	@FindBy(xpath = "//*[@id='textcompanywebsite']")
	public WebElement CPEditWebsite;
	
	@FindBy(xpath = "//*[@id='textcompanycontactnumber']")
	public WebElement CDEditContactNumber;
	
	@FindBy(xpath = "//*[@id='textfacebookurl']")
	public WebElement CDEditFacebookURL;
	
	@FindBy(xpath = "//*[@id='texttwitterurl']")
	public WebElement CDEditTwitterURL;
	
	@FindBy(xpath = "//*[@id='textlinkedinurl']")
	public WebElement CDEditLinkedin;
	
	@FindBy(xpath = "//*[@id='textgoogleurl']")
	public WebElement CDEditGoogle;
	
	@FindBy(xpath = "//*[@id='selectbusinessstructure']")
	public WebElement CDEditBusinessStructure;
	
	public void selectCDEditBusinessStructure(String value) {
		Select select = new Select(CDEditBusinessStructure);
		select.selectByVisibleText(value);
	}
	
	
	@FindBy(xpath = "//*[@id='selectindustry']")
	public WebElement CDEditIndustry;
	
	public void selectCDEditIndustry(String value) {
		Select select = new Select(CDEditIndustry);
		select.selectByVisibleText(value);
	}
	
	@FindBy(xpath = "//*[@id='textfoundedyear']")
	public WebElement CDEditFounderYear;
	
	@FindBy(xpath = "//*[@id='selectcompanysize']")
	public WebElement CDEditCompanySize;
	
	public void selectCDEditCompanySize(String value) {
		Select select = new Select(CDEditCompanySize);
		select.selectByVisibleText(value);
	}
	
	@FindBy(xpath = "//*[@id='textparentcomnpany']")
	public WebElement CDEditParentCompany;
	
	@FindBy(xpath = "//*[@id='selectturnovercurrency']")
	public WebElement CDEditYearly;
	
	public void selectCDEditYearly(String value) {
		Select select = new Select(CDEditYearly);
		select.selectByVisibleText(value);
	}
	
	@FindBy(xpath = "//*[@id='textturnover']")
	public WebElement CDEditTurnoverTxtBx;
	
	@FindBy(xpath = "//*[@id='selectturnoverin']")
	public WebElement CDEditTurnOverDrpDwn;
	
	public void selectCDEditTurnOverDrpDwn(String value) {
		Select select = new Select(CDEditTurnOverDrpDwn);
		select.selectByVisibleText(value);
	}
	
	@FindBy(xpath = "//*[@id='autocomplete']")
	public WebElement CDEditEnterFullAddress;
	
	@FindBy(xpath = "//*[@id='route']")
	public WebElement CDEditStreetTxtBx;
	
	@FindBy(xpath = "//*[@id='locality']")
	public WebElement CDEditCityTxtBx;
	
	@FindBy(xpath = "//*[@id='country']")
	public WebElement CDEditCountryTxtBx;
	
	
	@FindBy(xpath = "//*[@id='administrative_area_level_1']")
	public WebElement CDEditStateTxtBx;
	
	@FindBy(xpath = "//*[@id='postal_code']")
	public WebElement CDEditZipcodeTxtBx;
	
	@FindBy(xpath = "//*[@id='diveditprofiledetails']/div[4]/div/div[2]/div[7]/label[2]/label/div/i")
	public WebElement CDEditSameasRegisteredAddressChkBx;
	
	@FindBy(xpath = "//*[@id='autocomplete2']")
	public WebElement CDEditEnterFulladdress1;
	
	@FindBy(xpath = "//*[@id='route2']")
	public WebElement CDEditStreetTxtBx1;
	
	@FindBy(xpath = "//*[@id='locality2']")
	public WebElement CDEditCityTxtBx1;
	
	@FindBy(xpath = "//*[@id='country2']")
	public WebElement CDEditCountryTxtBx1;
	
	@FindBy(xpath = "//*[@id='administrative_area_level_12']")
	public WebElement CDEditStateTxtBx1;
	
	@FindBy(xpath = "//*[@id='postal_code2']")
	public WebElement CDEditZipCodeTxtBx;
	
	@FindBy(xpath = "//*[@id='aupdatepersonal']")
	public WebElement CDEditSaveBtn;
	
	// Company Public view
	
	@FindBy(xpath = "//*[@id='myTab1']/li[4]/a")
	public WebElement CDCompanyPublicViewTab;
	
	@FindBy(xpath = "//*[@id='inputFile']")
	public WebElement CDEGalleryImg1;
	
	@FindBy(xpath = "//*[@id='modalimagecrop']/div/div/div[3]/button[2]")
	public WebElement CDEGalleryCropBtn;
	
	
	@FindBy(xpath = "//*[@id='inputFile1']")
	public WebElement CDGalleryImg2;
	
	@FindBy(xpath = "//*[@id='inputFile2']")
	public WebElement CDGalleryImg3;
	
	@FindBy(xpath = "//*[@id='divpublicprofileview']/div[2]/div/div[4]/div[2]/div[3]/div[2]")
	public WebElement CDCompanyOverview;
	
	@FindBy(xpath = "//*[@id='divpublicprofileview']/div[2]/div/div[5]/div[2]/div[3]/div[2]")
	public WebElement CDUpdatesTxtBx;
	
	@FindBy(xpath = "//*[@id='aupdatepublicprofile']")
	public WebElement CDCompanyPublicViewSaveBtn;
	
//	@FindBy(xpath = "//*[@id='aupdatepersonal']")
//	public WebElement CDEditSaveBtn;
	
//	@FindBy(xpath = "//*[@id='aupdatepersonal']")
//	public WebElement CDEditSaveBtn;
//	
//	@FindBy(xpath = "//*[@id='aupdatepersonal']")
//	public WebElement CDEditSaveBtn;
//	
//	@FindBy(xpath = "//*[@id='aupdatepersonal']")
//	public WebElement CDEditSaveBtn;
//	
//	@FindBy(xpath = "//*[@id='aupdatepersonal']")
//	public WebElement CDEditSaveBtn;
//	
	
	
	


	
	
	
// My Profile xpaths
	
	@FindBy(xpath = "//*[@id='ulmenu']/li[11]/div/content/div/ul/li[3]")
	public WebElement CDMyProfile;
	
	@FindBy(xpath = "//*[@id='ulmenu']/li[11]/div/content/div/ul/li[4]")
	public WebElement CDBalanceHistory;
	
	@FindBy(xpath = "//*[@id='ulmenu']/li[11]/div/content/div/ul/li[5]")
	public WebElement CDUpgradePlan;
	
	@FindBy(xpath = "//*[@id='ulmenu']/li[11]/div/content/div/ul/li[6]")
	public WebElement CDLogOut;
	

	
	
	
	
	// Instructions Questions page 
	
	@FindBy(xpath = "//*[@id='ulmenulist']/li[1]")
	public WebElement InstructionsTab;
	
	@FindBy(xpath = "//*[@id='divconfirm']/div/div/div[3]/div[3]/div[2]")
	public WebElement InstructionsTxtBx;
	
	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div/div[4]/div[2]/div/a[2]")
	public WebElement AddInstructionsBtn;
	
	// Edit Instructions Xpaths
	
	@FindBy(xpath = "//*[@id='row4']/h2/div/button")
	public WebElement Editinstructionsactions;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div/div[4]/div/div/div/div[3]/div[3]")
	public WebElement EditInstructionsTxtBx;
	
	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div/div[4]/div[2]/div/a[2]")
	public WebElement EditAddInstructionsBtn;
	
	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div/div[4]/div[2]/div/a[3]")
	public WebElement EditUpdateInstructionsBtn;
	
	// Response page xpaths 
	
	@FindBy(xpath = "/html/body/div[6]/div[1]/div/div/div[3]/ul/li[1]/div/div/div[1]/input")
	public WebElement AddressTxtBx;
	
	@FindBy(xpath = "/html/body/div[6]/div[1]/div/div/div[3]/ul/li[1]/div/div/div[2]/input[2]")
	public WebElement AddressStreet;
	
	@FindBy(xpath = "/html/body/div[6]/div[1]/div/div/div[3]/ul/li[1]/div/div/div[3]/input")
	public WebElement AddressCity;
	
	@FindBy(xpath = "/html/body/div[6]/div[1]/div/div/div[3]/ul/li[1]/div/div/div[4]/input")
	public WebElement AddressState;
	
	@FindBy(xpath = "/html/body/div[6]/div[1]/div/div/div[3]/ul/li[1]/div/div/div[5]/input")
	public WebElement AddressCountry;
	
	@FindBy(xpath = "/html/body/div[6]/div[1]/div/div/div[3]/ul/li[1]/div/div/div[6]/input")
	public WebElement AddressZipcode;
	
	@FindBy(xpath = "/html/body/div[7]/div[1]/div/div/div[3]/ul/li[2]/div/div/div/div/input[1]")
	public WebElement Companylogo;
	
	@FindBy(xpath = "/html/body/div[9]/div/div/div[3]/button[2]")
	public WebElement CompanylogoCrpBtn;
	
	@FindBy(xpath = "/html/body/div[6]/div[1]/div/div/div[3]/ul/li[3]/div/div/div/input")
	public WebElement EmailTxtBx;
	
	@FindBy(xpath = "/html/body/div[6]/div[1]/div/div/div[3]/ul/li[4]/div/div/div[1]/input")
	public WebElement FirstNameTxtBx;
	
	@FindBy(xpath = "/html/body/div[6]/div[1]/div/div/div[3]/ul/li[4]/div/div/div[2]/input")
	public WebElement LastNameTxtBx;
	
	@FindBy(xpath = "/html/body/div[6]/div[1]/div/div/div[3]/ul/li[5]/div/div/div/input")
	public WebElement ResPasswordTxtBx;
	
	@FindBy(xpath = "/html/body/div[6]/div[1]/div/div/div[3]/ul/li[6]/div/div/div/input")
	public WebElement PhoneNumberTxtBx;
	
	@FindBy(xpath = "/html/body/div[6]/div[1]/div/div/div[3]/ul/li[7]/div/div/div/label/div/div/input[1]")
	public WebElement Profilepicture;
	
	@FindBy(xpath = "/html/body/div[8]/div/div/div[3]/button[2]")
	public WebElement ProfilepictureCropBtn;
	
	@FindBy(xpath = "/html/body/div[6]/div[1]/div/div/div[3]/ul/li[2]")
	public WebElement Checkbox;
	
	
	@FindBy(xpath = "//*[@id='ulsurveyquestions']/li/div/div[1]/div/div/div[1]")
	public WebElement CheckBoxoptions;
	
	@FindBy(xpath = "/html/body/div[6]/div[1]/div/div/div[3]/ul/li[9]/div/div/div/div/input")
	public WebElement ResDateTxtBx;
	
	@FindBy(xpath = "/html/body/div[6]/div[1]/div/div/div[3]/ul/li[10]/div/div/div/select")
	public WebElement DropdwnQuestion;
	
	@FindBy(xpath = "/html/body/div[6]/div[1]/div/div/div[3]/ul/li[11]/div/div/div/div/div/input")
	public WebElement ResFileupload;
	
	@FindBy(xpath = "/html/body/div[6]/div[1]/div/div/div[3]/ul/li[12]/div/div/div[2]/div/div[2]/div/div/a")
	public WebElement ScalerateOption1;
	
	@FindBy(xpath = "/html/body/div[6]/div[1]/div/div/div[3]/ul/li[12]/div/div/div[3]/div/div[2]/div/div/a")
	public WebElement ScalerateOption2;
	
	@FindBy(xpath = "/html/body/div[6]/div[1]/div/div/div[3]/ul/li[13]/div/div/div/div/div/label/div[2]/div/img")
	public WebElement Imagepoll;
	
	@FindBy(xpath = "/html/body/div[6]/div[1]/div/div/div[3]/ul/li[14]/div/div/div/div/div/div/input")
	public WebElement ImgTxt;
	
	@FindBy(xpath = "/html/body/div[6]/div[1]/div/div/div[3]/ul/li[15]/div/div/div/div/div[1]")
	public WebElement MultipleselectDrpDwn;
	
	@FindBy(xpath = "/html/body/div[6]/div[1]/div/div/div[3]/ul/li[15]/div/div/div/div/div[2]/div[1]/input")
	public WebElement MultipleselectDrpDwnsearchbx;
	
	@FindBy(xpath = "/html/body/div[6]/div[1]/div/div/div[3]/ul/li[15]/div/div/div/div/div[2]/div[2]/div[not(contains(@class, 'hidden'))]/span")
	public WebElement MultipleselectDrpdwnChkbx;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	 
	 

		 
	// Response page
	 
		@FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[5]/div[2]")
		public WebElement ResponsePageSubmitBtn;
		
		@FindBy(xpath = "/html/body/div[14]/div/div/div/div/div[2]/div/input")
		public WebElement ResponsePageFirstNameTxtbX;
		
		@FindBy(xpath = "/html/body/div[14]/div/div/div/div/div[3]/div/input")
		public WebElement ResponsePageLastNameTxtBx;
		
		@FindBy(xpath = "/html/body/div[14]/div/div/div/div/div[4]/div/input")
		public WebElement ResponsePageEmailidTxtBx;
		
		@FindBy(xpath = "/html/body/div[14]/div/div/div/div/div[5]/div/input")
		public WebElement ResponsePageContactNumberTxtBx;
		
		@FindBy(xpath = "/html/body/div[14]/div/div/div/div/div[7]/div/label/label/div/i")
		public WebElement ResponsePageCreateProfileChkBx;
		
		@FindBy(xpath = "/html/body/div[14]/div/div/div/div/div[8]/div[2]/div/input")
		public WebElement CreateProfilepasswordTxtbx;
		
		@FindBy(xpath = "/html/body/div[14]/div/div/div/div/div[8]/div[5]/div/input")
		public WebElement CreateProfileOrgNameTxtbx;
		
		@FindBy(xpath = "/html/body/div[14]/div/div/div/div/div[8]/div[6]/div/label")
		public WebElement CreateProfileIagreeChkBx;
		
		@FindBy(xpath = "/html/body/div[14]/div/div/div/div/div[9]/div/label/a")
		public WebElement Responsepagewithoutlogin;
		
		@FindBy(xpath = "/html/body/div[10]/div/div/div[2]/div[2]/div[1]/div/input")
		public WebElement UsernameTxtBx;
		
		@FindBy(xpath = "/html/body/div[10]/div/div/div[2]/div[2]/div[2]/div/input")
		public WebElement PasswordTxtBx;
		
		@FindBy(xpath = "/html/body/div[10]/div/div/div[2]/div[3]/button/span")
		public WebElement SubmitsurveyBtn;
		
		@FindBy(xpath = "/html/body/div[14]/div/div/div/button[2]")
		public WebElement Submitsurvey;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	// Question page - Check Box
	
	@FindBy(xpath = "//*[@id='textindiWeightage']")
	public WebElement IndividualWeightageTxtBx;

	//@FindBy(xpath = "//*[contains (text, 'Check Box')]/text")
	
	@FindBy(xpath = "//*[@id='ulmenulist']/li[2]")
	public WebElement EvaluatorcheckboxBtnClk;
	
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/section/div/div[2]/div[1]/div[2]/div/div[2]/aside/div/div/div[1]/div/ul/li[10]")
	public WebElement checkboxBtnClk;

	@FindBy(xpath = "/html/body/div[3]/div[1]/section/div/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[1]/div[2]/input")
	public WebElement Chkquestiontxt;

	@FindBy(xpath = "/html/body/div[3]/div[1]/section/div/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[1]/div[3]/div/input")
	public WebElement checkbxtags;

	@FindBy(xpath = "/html/body/div[3]/div[1]/section/div/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[1]/div[4]/select")
	public WebElement checkbxquestiongroup;

	@FindBy(xpath = "/html/body/div[3]/div[1]/section/div/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[1]/div[4]/select/option[1]")
	public WebElement AddNewGroup;

	@FindBy(xpath = "/html/body/div[3]/div[1]/section/div/div[2]/div[13]/div/div/div[2]/form/div[3]/input")
	public WebElement NewGroupName;

	@FindBy(xpath = "/html/body/div[3]/div/section/div/div[17]/div/div/div[2]/form/div[5]/button[2]")
	public WebElement AddNewGroupAddBtn;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[1]/h1/a")
	public WebElement AddNewGroupCloseBtn;

	// selectchkquestiongroup

	public void selectcheckbxquestiongroup(String value) {
		Select select = new Select(checkbxquestiongroup);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "/html/body/div[3]/div[1]/section/div/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[1]/div[5]/select")
	public WebElement numberoptions;

	// selectchkno.ofoptionsdrpdwn

	public void selectnumberoptions(String value) {
		Select select = new Select(numberoptions);
		select.selectByVisibleText(value);
	}
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/section/div/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[1]")
	public WebElement chkScroll;
	

	@FindBy(xpath = "/html/body/div[3]/div[1]/section/div/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[1]/div[10]/div[2]/div[1]/div/input[1]")
	public WebElement chkenterfirstoption;

	@FindBy(xpath = "/html/body/div[3]/div/section/div/div[2]/div/div[2]/div/div[1]/div/div[3]/div/div[1]/div[2]/div[1]/div/div/div/div/div[1]/label/div")
	public WebElement Answerchkenterfirstoption;
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/section/div/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[1]/div[10]/div[3]/div[1]/div/input[1]")
	public WebElement chkentersecondoption;
	
	@FindBy(xpath = "/html/body/div[3]/div/section/div/div[2]/div/div[2]/div/div[1]/div/div[3]/div/div[1]/div[2]/div[2]/div/div/div/div/div[1]/label/div")
	public WebElement Answerchkentersecondoption;
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/section/div/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[1]/div[10]/div[4]/div[1]/div/input")
	public WebElement chkenterThirdoption;
	
	@FindBy(xpath = "/html/body/div[3]/div/section/div/div[2]/div/div[2]/div/div[1]/div/div[3]/div/div[1]/div[2]/div[3]/div/div/div/div/div[1]/label/div")
	public WebElement AnswerchkenterThirdoption;
		
	@FindBy(xpath = "/html/body/div[3]/div/section/div/div[2]/div/div[2]/div/div[1]/div/div[3]/div/div[1]/div[2]/div[4]/div/div/input")
	public WebElement chkenterFourthoption;
	
	@FindBy(xpath = "/html/body/div[3]/div/section/div/div[2]/div/div[2]/div/div[1]/div/div[3]/div/div[1]/div[2]/div[4]/div/div/div/div/div[1]/label/div")
	public WebElement AnswerchkenterFourthoption;

	@FindBy(xpath = "/html/body/div[3]/div/section/div/div[2]/div/div[2]/div/div[1]/div/div[3]/div/div[1]/div[2]/div[5]/div/div/input")
	public WebElement chkenterFiveoption;
	
	@FindBy(xpath = "/html/body/div[3]/div/section/div/div[2]/div/div[2]/div/div[1]/div/div[3]/div/div[1]/div[2]/div[5]/div/div/div/div/div[1]/label/div")
	public WebElement AnswerchkenterFiveoption;

	@FindBy(xpath = "//*[@id='textanswer6']")
	public WebElement chkenterSixoption;
	
	@FindBy(xpath = "//*[@id='divchkanswer6']/label/div")
	public WebElement AnswerchkenterSixoption;

	@FindBy(xpath = "//*[@id='textanswer7']")
	public WebElement chkenterSevenoption;

	@FindBy(xpath = "//*[@id='divchkanswer7']/label/div")
	public WebElement AnswerchkenterSevenoption;
	
	@FindBy(xpath = "//*[@id='textanswer8']")
	public WebElement chkenterEightoption;
	
	@FindBy(xpath = "//*[@id='divchkanswer8']/label/div")
	public WebElement AnswerchkenterEightoption;

	@FindBy(xpath = "//*[@id='textanswer9']")
	public WebElement chkenterNineoption;
	
	@FindBy(xpath = "//*[@id='divchkanswer9']/label/div")
	public WebElement AnswerchkenterNineoption;

	@FindBy(xpath = "//*[@id='textanswer10']")
	public WebElement chkenterTenoption;
	
	@FindBy(xpath = "//*[@id='divchkanswer10']/label/div")
	public WebElement AnswerchkenterTenoption;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[12]/div/label/label/div/i")
	public WebElement chkbxmandatory;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[13]/div/label/label/div/i")
	public WebElement chkbxallowcomments;

	@FindBy(xpath = "//*[@id='questiondiv']/div[1]/div[3]/div/label/label/div/i")
	public WebElement chkbxallowcommentsEvaluator;
	
	@FindBy(xpath = "//*[@id='questiondiv']/div[3]/div/label/label/div/i")
	public WebElement chkbxallowcommentsTrivia;
	
	@FindBy(xpath = "//*[@id='DoesShowresultDiv']/div/label/label/div/i")
	public WebElement showquestions;

	@FindBy(xpath = "/html/body/div[3]/div[1]/section/div/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[2]/a[2]")
	public WebElement chkbxaddquestion;
	
	@FindBy(xpath = "//*[@id='divIdsaveInsertQuestion']")
	public WebElement chkbxaddquestionTrivia;
	
	@FindBy(xpath = "//*[@id='divIdsaveInsertQuestion']")
	public WebElement chkbxaddquestionEvaluator;

	@FindBy(xpath = "//*[@id='savecancel']/div/button[2]/span[1]")
	public WebElement QuestionSaveAndNextDrp;

	@FindBy(xpath = "//*[@id='profile1']/div[3]/div[1]/div[1]/ul/li[3]/a")
	public WebElement QuestionPageArrowBtn;
	
	@FindBy(xpath = "//*[@id='profile1']/div/div[4]/div/div[1]/ul/li[1]")
	public WebElement QuestionSaveAndPublish;

	@FindBy(xpath = "//*[@id='profile1']/div/div[4]/div/div[1]/ul/li[2]")
	public WebElement QuestionSaveAndDraft;

	@FindBy(xpath = "//*[@id='modalsurveyupgrade']/div/div/div[3]/a/i")
	public WebElement QuestionBillingProceedBtn;
	
	@FindBy(xpath = "//*[@id='modalsurveyupgrade']/div/div/div[3]/a/i")
	public WebElement QuestionLogicBillingProceedBtn;
	
	@FindBy(xpath = "//*[@id='modalsurveyupgrade']/div/div/div[3]/a/i")
	public WebElement QuestionPreviewAndCustomizeBillingProceedBtn;
	
	
	// Edit ChkBx Xpaths 
	
	@FindBy(xpath = "//*[@id='row2']/h2[1]/div[1]/button")//*[@id="row1"]/h2[1]/div[1]/button
	public WebElement ChkBxActions;
	
	@FindBy(xpath = "//*[@id='row2']/h2[1]/div[1]/ul/li[1]/a")
	public WebElement ChkBxActionsEditLnk;
	
	@FindBy(xpath = "//*[@id='row3']/h2/div/ul/li[2]/a")
	public WebElement ChkBxActionsDeleteLnk;
	
	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[12]/div/label/label/div/i")
	public WebElement EditChkBxisMandatory;
	
	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[13]/div/label/label/div/i")
	public WebElement EditChkBxAllowcomments;
	
	@FindBy(xpath = "//*[@id='DoesShowresultDiv']/div/label/label")
	public WebElement EditChkBxShwQues;
	
	@FindBy(xpath = "//*[@id='updatequestionanswerid']")
	public WebElement ChkBxQuestionsUpdateBtn;
	
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/section/div/div[2]/div[1]/div[2]/div/div[4]/div/div/button[1]")
	public WebElement SurveyQuestionSaveNextBtn;
	
	
		// Question type Date

	@FindBy(xpath = "//*[@id='mCSB_1_container']/div/ul/li[11]")
	public WebElement DateLnk;
	
	@FindBy(xpath = "//*[@id='textquestiontext']")
	public WebElement DateQuestiontxt;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[3]/div/input")
	public WebElement Datebxtags;

	@FindBy(xpath = "//*[@id='ddlQuestionGroupsforaddquestion']")
	public WebElement Datebxquestiongroup;

	public void selectDatebxquestiongroup(String value) {
		Select select = new Select(Datebxquestiongroup);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='Textlabel']")
	public WebElement DateLabelTxt;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[11]/div/label/label/div/i")
	public WebElement Datebxmandatory;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[12]/div/label/label/div/i")
	public WebElement Datebxallowcomments;
	
	@FindBy(xpath = "//*[@id='questiondiv']/div[3]/div/label/label/div/i")
	public WebElement DatebxallowcommentsEvaluator;

	@FindBy(xpath = "//*[@id='saveInsertQuestion']")
	public WebElement Datebxaddquestion;
	
	@FindBy(xpath = "//*[@id='saveInsertQuestion']")
	public WebElement DatebxaddquestionEvaluator;

	// Question type Dropdown

	@FindBy(xpath = "//*[@id='mCSB_1_container']/div/ul/li[10]")
	public WebElement DropdownLnk;
	
	@FindBy(xpath = "//*[contains (text, 'Dropdown')]/text")
	public WebElement checkboxBtnClkTrivia;

	@FindBy(xpath = "//*[@id='textquestiontext']")
	public WebElement Drpquestiontxt;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[3]/div/input")
	public WebElement Drpbxtags;

	@FindBy(xpath = "//*[@id='ddlQuestionGroupsforaddquestion']")
	public WebElement Drpbxquestiongroup;

	public void selectDrpbxquestiongroup(String value) {
		Select select = new Select(Drpbxquestiongroup);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='ddlselectnoofoptions']")
	public WebElement Drpnumberoptions;

	public void selectDrpnumberoptions(String value) {
		Select select = new Select(Drpnumberoptions);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='textanswer1']")
	public WebElement Drpenterfirstoption;
	
	@FindBy(xpath = "//*[@id='divRadiobut1']/div/label/i[1]")
	public WebElement AnswerDrpenterfirstoption;

	@FindBy(xpath = "//*[@id='textanswer2']")
	public WebElement Drpentersecondoption;
	
	@FindBy(xpath = "//*[@id='divRadiobut2']/div/label/i[1]")
	public WebElement AnswerDrpentersecondoption;

	@FindBy(xpath = "//*[@id='textanswer3']")
	public WebElement DrpenterThirdoption;
	
	@FindBy(xpath = "//*[@id='divRadiobut3']/div/label/i[1]")
	public WebElement AnswerDrpenterThirdoption;

	@FindBy(xpath = "//*[@id='textanswer4']")
	public WebElement DrpenterFourthoption;
	
	@FindBy(xpath = "//*[@id='divRadiobut4']/div/label/i[1]")
	public WebElement AnswerDrpenterFourthoption;

	@FindBy(xpath = "//*[@id='textanswer5']")
	public WebElement DrpenterFiveoption;
	
	@FindBy(xpath = "//*[@id='divRadiobut5']/div/label/i[1]")
	public WebElement AnswerDrpenterFiveoption;

	@FindBy(xpath = "//*[@id='textanswer6']")
	public WebElement DrpenterSixoption;
	
	@FindBy(xpath = "//*[@id='divRadiobut6']/div/label/i[1]")
	public WebElement AnswerDrpenterSixoption;

	@FindBy(xpath = "//*[@id='textanswer7']")
	public WebElement DrpenterSevenoption;
	
	@FindBy(xpath = "//*[@id='divRadiobut7']/div/label/i[1]")
	public WebElement AnswerDrpenterSevenoption;

	@FindBy(xpath = "//*[@id='textanswer8']")
	public WebElement DrpenterEightoption;
	
	@FindBy(xpath = "//*[@id='divRadiobut8']/div/label/i[1]")
	public WebElement AnswerDrpenterEightoption;

	@FindBy(xpath = "//*[@id='textanswer9']")
	public WebElement Drpenternineoption;
	
	@FindBy(xpath = "//*[@id='divRadiobut9']/div/label/i[1]")
	public WebElement AnswerDrpenternineoption;

	@FindBy(xpath = "//*[@id='textanswer10']")
	public WebElement DrpenterTenoption;
	
	@FindBy(xpath = "//*[@id='divRadiobut10']/div/label/i[1]")
	public WebElement AnswerDrpenterTenoption;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[11]/div/label/label/div/i")
	public WebElement Drpbxmandatory;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[12]/div/label/label/div")
	public WebElement Drpallowcomments;
	
	@FindBy(xpath = "//*[@id='questiondiv']/div[3]/div/label/label/div/i")
	public WebElement DrpallowcommentsEvaluator;
	
	@FindBy(xpath = "//*[@id='questiondiv']/div[3]/div/label/label/div/i")
	public WebElement DrpallowcommentsTrivia;

	@FindBy(xpath = "//*[@id='DoesShowresultDiv']/div/label/label/div/i")
	public WebElement Drpshowquestions;

	@FindBy(xpath = "//*[@id='saveInsertQuestion']")
	public WebElement Drpchkbxaddquestion;

	@FindBy(xpath = "//*[@id='row1']/h2/div/button/img")
	public WebElement DrpActionsBtn;

	@FindBy(xpath = "//*[@id='row1']/h2/div/ul/li[1]/a")
	public WebElement DrpEdit;

	@FindBy(xpath = "//*[@id='previewquestionaire']")
	public WebElement DrpSaveandNextBtn;
	
	@FindBy(xpath = "//*[@id='AddquestionDiv']/a[3]")
	public WebElement DrpSaveandNextBtnTrivia;
	
	@FindBy(xpath = "//*[@id='AddWeightagesDiv']/label/label/div/i")
	public WebElement QuestionTypeWithWiseWeightagesChkBx;

	// WebElements of Home Page

	@FindBy(xpath = "/html/body/header/section/div[3]/ul/li/a[3]")
	public WebElement RegisterBtn;

	@FindBy(xpath = "//*[@id='header']/div[3]/div/div[4]/a/span")
	public WebElement userDrpdwnLnk;

	@FindBy(xpath = "//*[@id='header']/div[3]/div/div[4]/div/ul/li[5]/a")
	public WebElement logoutLnk;

	// @FindBy(xpath = "//*[@id='ulmenu']/li[2]/a/span")
	//@FindBy(xpath = "//*[contains(text(),'Surveys')]")
//	@FindBy(xpath = "//*[@id='ulmenu']/li[6]/a")
//	@FindBy(xpath ="//*[@id='ulmenu']/li[(contains(@class, 'Surveys'))]/a/span")
//	@FindBy(xpath ="//*[@id='ulmenu']/li[(contains(@class, 'Surveys'))]/a")
	
	@FindBy(xpath = "//*[@id='ulmenu']/li[6]/a")
	public WebElement surveyLnk;
	
	@FindBy(xpath = "//*[@id='ulmenu']/li[4]/a")
	public WebElement surveyLnkStaging;
	
	@FindBy(xpath = "//*[@id='ulmenu']/li[6]/a")
	public WebElement surveyLnk1;
	
	
	

	
	@FindBy(xpath = "//*[@id='ulsubmenu']/li[2]/a/span")
	public WebElement createSurveyLnk;
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/section/div[1]/div[3]/div/div/div[1]/div/div[2]/div/span/a[2]/img")
	public WebElement createSurveyLnkStaging;
	
	
	@FindBy(xpath ="//*[@id='tbodyGetQuestionnairList']/tr[1]/td[2]/div")
	public WebElement SurveyList;
	

	@FindBy(xpath = "//*[@id='ulmenu']/li[2]/ul/li[2]/a")
	public WebElement mySurveyLnk;

	@FindBy(xpath = "//*[@id='ulmenu']/li[2]/ul/li[3]/a")
	public WebElement AnsweredSurveyLnk;

	@FindBy(xpath = "//*[contains(text(),'Evaluator')]")
	public WebElement EvaluatorLnk;

	@FindBy(xpath = "//*[@id='ulsubmenu']/li[2]/a/span")
	public WebElement CreateEvaluatorLnk;
	
	@FindBy(xpath = "//*[contains(text(),'Trivia')]")
//	@FindBy(xpath = "//*[@id='ulmenu']/li[7]/a/span")
	public WebElement TriviaLnk;

	@FindBy(xpath = "//*[@id='ulsubmenu']/li[2]/a/span")
	public WebElement CreateTriviaLnk;

	@FindBy(xpath = "/html/body/header/aside/ul/li[2]/a")
	public WebElement EventLnk;
	
	
	@FindBy(xpath = "//*[@id='ulmenu']/li[2]/a")
	public WebElement EventLnkStagging;
	
	
	
	@FindBy(xpath = "/html/body/header/aside/ul/li[2]/a/span")
	public WebElement EventLnkLive;

	@FindBy(xpath = "//*[@id='ulmenu']/li[7]/a/i")
	public WebElement marketPlaceLnk;

	@FindBy(xpath = "/html/body/div[3]/div/section/div[1]/div[3]/div/div/div[1]/div/div[2]/div/span/a[2]/img")
	public WebElement createEventLnk;

	@FindBy(xpath = "//*[@id='ulmenu']/li[6]/ul/li[2]/a")
	public WebElement EventListLnk;

	@FindBy(xpath = "//*[@id='ulmenu']/li[4]/a")
	public WebElement createContactsLnk;

	@FindBy(xpath = "//*[@id='ulmenu']/li[4]/ul/li[1]/a")
	public WebElement createContarctDrpBtn;

	@FindBy(xpath = "//*[@id='left-panel']/ul/li[10]")
	public WebElement EmailMarketingDots;
	
	@FindBy(xpath = "//*[@id='ulmenu']/li[10]/div/ul/li[2]/a")
	public WebElement EmailMarketinglnk;


	@FindBy(xpath = "//*[@id='ulmenu']/li[5]/ul/li[1]/a")
	public WebElement SendEmailMarketingLnk;

	// My survey from Survey tab

	@FindBy(xpath = "//*[@id='widget-grid']/div[1]/div[3]/div/div/div[1]/h4/div/a[1]")
	public WebElement newSurveyBtn;

	@FindBy(xpath = "//*[@id='widget-grid']/div[1]/div[3]/div/div/div[1]/h4/div/a[3]")
	public WebElement advanceSearchBtn;

	@FindBy(xpath = "//*[@id='datatable_fixed_column']/thead/tr[1]/th[2]/input")
	public WebElement surveyNameTxtBx;

	@FindBy(xpath = "//*[@id='datatable_fixed_column']/thead/tr[1]/th[3]/input")
	public WebElement categoryTxtBx;

	@FindBy(xpath = "//*[@id='datatable_fixed_column']/thead/tr[1]/th[4]/input")
	public WebElement descriptionTxtBx;

	@FindBy(xpath = "//*[@id='datatable_fixed_column']/thead/tr[1]/th[5]/input")
	public WebElement statusTxtBx;

	@FindBy(xpath = "//*[@id='datatable_fixed_column']/thead/tr[1]/th[6]/input")
	public WebElement responsesTxtBx;

	@FindBy(xpath = "//*[@id='datatable_fixed_column']/thead/tr[1]/th[7]/input")
	public WebElement questionsTxtBx;

	@FindBy(xpath = "//*[@id='datatable_fixed_column']/thead/tr[1]/th[8]/input")
	public WebElement languagesTxtBx;

	@FindBy(xpath = "//*[@id='datatable_fixed_column']/thead/tr[1]/th[9]/input")
	public WebElement pagesTxtBx;

	@FindBy(xpath = "//*[@id='datatable_fixed_column']/thead/tr[1]/th[10]/input")
	public WebElement createdOnTxtBx;

	@FindBy(xpath = "//*[@id='tbodyGetQuestionnairList']/tr[1]/td[2]/a[1]")
	public WebElement AdvSurveyNameClk;

	// constructor for initializing the objects
	public IndexPage(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all public WebElements
		PageFactory.initElements(driver, this);
	}

	// logout of the portal
	public void logout(WebDriver driver) throws Exception {
		userDrpdwnLnk.click();
		Thread.sleep(2000);
		logoutLnk.click();
	}

	// Go to Survey page
	public void gotoSurvey(WebDriver driver) throws Exception {
		surveyLnk.click();
		Thread.sleep(2000);
		createSurveyLnk.click();
	}

	// Adding money to wallet with new credit card

	@FindBy(xpath = "//*[@id='spanwalletamount']")
	public WebElement WalletLnk;

	@FindBy(xpath = "//*[@id='widget-grid']/div[3]/div[1]/div/div/div[1]/h4/div/a[2]")
	public WebElement AddMoneywallet;

	@FindBy(xpath = "//*[@id='textamount']")
	public WebElement walletAmount;

	@FindBy(xpath = "//*[@id='addnewcard']")
	public WebElement newcard;

	@FindBy(xpath = "//*[@id='txtzipcode']")
	public WebElement Zipcode;

	@FindBy(xpath = "//*[@id='txtcardnumber']")
	public WebElement cardNum;

	@FindBy(xpath = "//*[@id='txtexpiredate']")
	public WebElement ExpirationDate;

	@FindBy(xpath = "//*[@id='txtcvc']")
	public WebElement CVV;

	@FindBy(xpath = "//*[@id='myModalPayment']/div/div/div[2]/button")
	public WebElement proceedBtn;

	// Adding money to wallet with existing credit card

	@FindBy(xpath = "//*[@id='widget-grid']/div[3]/div[1]/div/div/div[1]/h4/div/a[2]")
	public WebElement AddMoneytowallet;

	@FindBy(xpath = "//*[@id='textamount']")
	public WebElement Amount;

	@FindBy(xpath = "//*[@id='creditcardslist']/div[1]/div/div/div[1]/div/label/i[1]")
	public WebElement Existingcard;

	@FindBy(xpath = "//*[@id='txtcardcvc0']")
	public WebElement Existingcardnum;

	// MarketPlace Page with Ticket packages

	
	@FindBy(xpath = "//*[@id='ulmenu']/li[10]")
	public WebElement ThreeDotsTablocal;
	
	@FindBy(xpath = "//*[@id='ulmenu']/li[10]")
	public WebElement ThreeDotsTab;
	
	@FindBy(xpath = "//*[@id='ulmenu']/li[10]/div/ul/li[1]/a")//*[@id="ulmenu"]/li[10]/div/ul/li[1]/a
	public WebElement marketPlaceMainLnk;

	@FindBy(xpath = "//*[@id='ulmenu']/li[8]/a")
	public WebElement marketPlacestaging;
	
	@FindBy(xpath = "//*[@id='ulmenu']/li[10]/div/ul/li[1]")
	public WebElement marketPlacelocal;
	

	@FindBy(xpath = "//*[@id='addnewticket']")
	public WebElement TicketAddNewBtn;

	@FindBy(xpath = "//*[@id='textSponsorCategory']")
	public WebElement GroupNameTicketPackage;

	@FindBy(xpath = "//*[@id='txtAboutSponsorCategory']")
	public WebElement GroupDescriptionTicketPackage;

	@FindBy(xpath = "//*[@id='textSponsorPackage']")
	public WebElement PackageNameTicketPackage;

	@FindBy(xpath = "//*[@id='ddlSponsorTicketTregistaionform']")
	public WebElement RegistrationFormTicketPackage;

	public void RegistrationFormTicketPackageDrpDwn(String value) throws InterruptedException {
		Select select = new Select(RegistrationFormTicketPackage);
		select.selectByVisibleText(value);
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//*[@id='ddlpackageCurrency']")
	public WebElement PriceTicketPackage;

	public void PriceTicketPackageDrpDwn(String value) throws InterruptedException {
		Select select = new Select(PriceTicketPackage);
		select.selectByVisibleText(value);
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//*[@id='textSponsorPackageamount']")
	public WebElement PriceAmountTicketPackage;

	@FindBy(xpath = "//*[@id='textSponsorPackageDiscountprice']")
	public WebElement DiscountAmountTicketPackage;

	@FindBy(xpath = "//*[@id='textFreeticket']")
	public WebElement NoOfFreeTicktesTicketPackage;

	@FindBy(xpath = "//*[@id='SponsorPackages']/div[3]/div/div/div[2]/div/div[2]/div[3]/div[2]")
	public WebElement FeaturesTicketPackage;

	@FindBy(xpath = "//*[@id='addnewSponsorPackages']")
	public WebElement AddTicketPackageBtn;

	@FindBy(xpath = "//*[@id='SaveSponsorCategory']")
	public WebElement SaveTicketPackageBtn;

	// Marketplace Coupon codes

	@FindBy(xpath = "//*[@id='marketplace']/div[2]/ul/li[6]/a")
	public WebElement CouponcodeBtn;

	@FindBy(xpath = "//*[@id='addnewcoupon']")
	public WebElement CouponCodeAddBtn;

	@FindBy(xpath = "//*[@id='coupontitle']")
	public WebElement CouponTitleTxtBx;

	@FindBy(xpath = "//*[@id='selectcoupon']")
	public WebElement CouponTypeTxtBx;

	public void CouponTypeDrpDwn(String value) throws InterruptedException {
		Select select = new Select(CouponTypeTxtBx);
		select.selectByVisibleText(value);
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//*[@id='selectHotelcoupondiv']/div/div[1]/span")
	public WebElement SelectSomeOptionHotelDrpBx;

	@FindBy(xpath = "//*[@id='selectHotelcoupondiv']/div/div[2]/div[1]/input")
	public WebElement SelectSomeOptionHotelSearch;

	@FindBy(xpath = "//*[@id='selectHotelcoupondiv']/div/div[2]/div[2]/div[not(contains(@class, 'hidden'))]/span")
	public WebElement SelectSomeOptionHotelChkBx;

	public void SelectSomeOptionHotelDrpDwn(String value) throws Exception {
		SelectSomeOptionHotelDrpBx.click();
		Thread.sleep(2000);
		String strMain = value;
		String[] arrSplit = strMain.split(",");
		for (int i = 0; i < arrSplit.length; i++) {
			SelectSomeOptionHotelSearch.clear();
			SelectSomeOptionHotelSearch.sendKeys(arrSplit[i].trim());
			SelectSomeOptionHotelChkBx.click();
			Thread.sleep(2000);
		}
	}

	@FindBy(xpath = "//*[@id='selectEventcoupondiv']/div/div[1]/span")
	public WebElement SelectSomeOptionEventDrpBx;

	@FindBy(xpath = "//*[@id='selectEventcoupondiv']/div/div[2]/div[1]/input")
	public WebElement SelectSomeOptionEventSearch;

	@FindBy(xpath = "//*[@id='selectEventcoupondiv']/div/div[2]/div[2]/div[not(contains(@class, 'hidden'))]/span")
	public WebElement SelectSomeOptionEventChkBx;

	public void SelectSomeOptionEventDrpDwn(String value) throws Exception {
		SelectSomeOptionEventDrpBx.click();
		Thread.sleep(2000);
		String strMain = value;
		String[] arrSplit = strMain.split(",");
		for (int i = 0; i < arrSplit.length; i++) {
			SelectSomeOptionEventSearch.clear();
			SelectSomeOptionEventSearch.sendKeys(arrSplit[i].trim());
			SelectSomeOptionEventChkBx.click();
			Thread.sleep(2000);
		}
	}

	@FindBy(xpath = "//*[@id='selectServicescoupondiv']/div/div[1]/span")
	public WebElement SelectSomeOptionServicesDrpBx;

	@FindBy(xpath = "//*[@id='selectServicescoupondiv']/div/div[2]/div[1]/input")
	public WebElement SelectSomeOptionServicesSerachBx;

	@FindBy(xpath = "//*[@id='selectServicescoupondiv']/div/div[2]/div[2]/div[not(contains(@class, 'hidden'))]/span")
	public WebElement SelectSomeOptionServicesChkBx;

	public void SelectSomeOptionServicesDrpDwn(String value) throws Exception {
		SelectSomeOptionServicesDrpBx.click();
		Thread.sleep(2000);
		String strMain = value;
		String[] arrSplit = strMain.split(",");
		for (int i = 0; i < arrSplit.length; i++) {
			SelectSomeOptionServicesSerachBx.clear();
			SelectSomeOptionServicesSerachBx.sendKeys(arrSplit[i].trim());
			SelectSomeOptionServicesChkBx.click();
			Thread.sleep(2000);
		}
	}

	@FindBy(xpath = "//*[@id='coupondescription']")
	public WebElement DescriptionCouponcodeTxtBx;

	@FindBy(xpath = "//*[@id='txtactivecoupondate']")
	public WebElement ActivationFromTxtCouponcodeBx;

	@FindBy(xpath = "//*[@id='txtExpiryCoupon']")
	public WebElement ExpiryDateTxtCouponcodeBx;

	@FindBy(xpath = "//*[@id='selectoffertype']")
	public WebElement OfferTypeCouponcode;

	public void OfferTypeCouponcodeDrpDwn(String value) throws InterruptedException {
		Select select = new Select(OfferTypeCouponcode);
		select.selectByVisibleText(value);
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//*[@id='txtofferpercentage']")
	public WebElement OfferTypeCouponcodeupto1;

	@FindBy(xpath = "//*[@id='txtofferpercentageamount']")
	public WebElement OfferTypeCouponcodeupto2;

	@FindBy(xpath = "//*[@id='txtofferamount']")
	public WebElement OfferTypeCouponcodeAmounttxtbx;

	@FindBy(xpath = "//*[@id='couponcode']")
	public WebElement CouponCodeTxtBx;

	@FindBy(xpath = "//*[@id='selectuserdiv']/div/div[1]/span")
	public WebElement UsersDrp;

	@FindBy(xpath = "//*[@id='selectuserdiv']/div/div[2]/div[1]/input")
	public WebElement UserSearch;

	@FindBy(xpath = "//*[@id='selectuserdiv']/div/div[2]/div[2]/div[not(contains(@class, 'hidden'))]/span")
	public WebElement UserCheckBx;

	public void UsersDrpDwn(String value) throws InterruptedException {
		UsersDrp.click();
		Thread.sleep(2000);
		String strMain = value;
		String[] arrSplit = strMain.split(",");
		for (int i = 0; i < arrSplit.length; i++) {
			UserSearch.clear();
			UserSearch.sendKeys(arrSplit[i].trim());
			UserCheckBx.click();
			Thread.sleep(2000);
			// UserSearch.clear();
			// Thread.sleep(4000);
		}

	}

	@FindBy(xpath = "//*[@id='txtnumberofuser']")
	public WebElement NoofUserCouponcodeTxtBx;

	@FindBy(xpath = "//*[@id='add']")
	public WebElement AddCouponcodeBtn;

	@FindBy(xpath = "//*[@id='couponcode']")
	public WebElement CouponcodeTxtBx2;

	@FindBy(xpath = "//*[@id='row2']/span/span[1]/span")
	public WebElement UserDrpCouponcodeDwn2;

	@FindBy(xpath = "//*[@id='txtnumberofuser']")
	public WebElement NoofUserCouponcodeTxtBx2;

	@FindBy(xpath = "//*[@id='txtnumberofcodegroup']")
	public WebElement NoofUserforcodeCouponcodeTxtBx;

	@FindBy(xpath = "//*[@id='savecancelCoupon']/div/a[2]")
	public WebElement SaveCouponcodeBtn;

	/////

	@FindBy(xpath = "//*[@id='productdescription']")
	public WebElement descriptionTxtBxMarketPProd;

	@FindBy(xpath = "//*[@id='singlewinner']/i[2]")
	public WebElement onlineRadioBtn;

	@FindBy(xpath = "//*[@id='multiplewinner']/i[1]")
	public WebElement offlineRadioBtn;

	JavascriptExecutor jse;

	public void ShippingDetails(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("online")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", onlineRadioBtn);
			onlineRadioBtn.click();
		} else if (value.equalsIgnoreCase("offline")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", offlineRadioBtn);
			offlineRadioBtn.click();
		}
	}

	@FindBy(xpath = "//*[@id='productcountry1']")
	public WebElement country1;

	public void countryDrpDwn1(String value) throws InterruptedException {
		Select select = new Select(country1);
		select.selectByVisibleText(value);
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//*[@id='productofflineamount1']")
	public WebElement shippingCostTxtBx1;

	@FindBy(xpath = "//*[@id='productcountry2']")
	public WebElement country2;

	public void countryDrpDwn2(String value) throws InterruptedException {
		Select select = new Select(country2);
		select.selectByVisibleText(value);
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//*[@id='productofflineamount2']")
	public WebElement shippingCostTxtBx2;

	@FindBy(xpath = "//*[@id='productcountry3']")
	public WebElement country3;

	public void countryDrpDwn3(String value) throws InterruptedException {
		Select select = new Select(country3);
		select.selectByVisibleText(value);
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//*[@id='productofflineamount3']")
	public WebElement shippingCostTxtBx3;

	@FindBy(xpath = "//*[@id='addnewshipping']")
	public WebElement shippingCostAddBtn;

	@FindBy(xpath = "//*[@id='savecancelproduct']/div/a[1]")
	public WebElement saveBtnProduct;

	// Market Place Ticket tab

	@FindBy(xpath = "//*[@id='marketplace']/div[2]/ul/li[2]/a")
	public WebElement TicketsTabLnk;

	@FindBy(xpath ="//*[@id='divticketsdemo']/a[1]")
	public WebElement AddNewTicketBtn;

	@FindBy(xpath = "//*[@id='eventdropdown']")
	public WebElement EventNameTicket;

	public void EventNameDropDwn(String value) throws InterruptedException {
		Select select = new Select(EventNameTicket);
		select.selectByVisibleText(value);
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//*[@id='feedropdown']")
	public WebElement TransactionChargesTickets;

	public void TransactionChargesTicketsDrpDwn(String value) throws InterruptedException {
		Select select = new Select(TransactionChargesTickets);
		select.selectByVisibleText(value);
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//*[@id='txtFromDateTime']")
	public WebElement salesStartDateTicket;

	@FindBy(xpath = "//*[@id='txtToDateTime']")
	public WebElement salesEndDateTicket;

	@FindBy(xpath = "//*[@id='ticketsorder']")
	public WebElement ticketsAllowPerOrderTxtBx;

	@FindBy(xpath = "//*[@id='Ticket']/div[1]/div[6]/div/label/label/div/i")
	public WebElement SetLandingPage;

	public void SetLandingPageChkBtn(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("yes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", SetLandingPage);
			SetLandingPage.click();
		} else {

		}
	}

	@FindBy(xpath = "//*[@id='textlandingpage']")
	public WebElement SetLandingPageURLTxtBx;

	@FindBy(xpath = "//*[@id='Ticket']/div[1]/div[7]/div/label/label/div/i")
	public WebElement AllAttendeesToRegisterChkBx;

	@FindBy(xpath = "//*[@id='checkEqualWeightageDiv']/i[1]")
	public WebElement RefundBtnTicketRadioBtn;

	@FindBy(xpath = "//*[@id='checkIndividualWeightageDiv']/i[2]")
	public WebElement NoRefundBtnTicketRadioBtn;

	public void ReturnPolicyRadioBtn(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("Refund")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", RefundBtnTicketRadioBtn);
			RefundBtnTicketRadioBtn.click();
		} else if (value.equalsIgnoreCase("No Refund")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", NoRefundBtnTicketRadioBtn);
			NoRefundBtnTicketRadioBtn.click();
		}
	}

	@FindBy(xpath = "//*[@id='txtCancellationPolicyticket']")
	public WebElement RefundType;

	public void RefundTypeDrpDwn(String value) throws InterruptedException {
		Select select = new Select(RefundType);
		select.selectByVisibleText(value);
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//*[@id='refundbeforedays']")
	public WebElement RefundAmountTxt;

	@FindBy(xpath = "//*[@id='refundvalue']")
	public WebElement RefundDaysTxtBx;

	@FindBy(xpath = "//*[@id='addnewrefund']")
	public WebElement AddRefundTicketsBtn;

	@FindBy(xpath = "//*[@id='Ticket']/div[1]/div[10]/div/div/div[3]/div[2]")
	public WebElement cancellationPolicyTxtBx;

	@FindBy(xpath = "//*[@id='Ticket']/div[1]/div[11]/div[2]/div")
	public WebElement AddTicketBtnTicket;

	@FindBy(xpath = "//*[@id='textticketname1']")
	public WebElement TicketNameTxtBx;
	
	@FindBy(xpath = "//*[@id='SelectTicketType']")
	public WebElement TicketType;
	
	public void TicketTypeDropDwn(String value) throws InterruptedException {
		Select select = new Select(TicketType);
		select.selectByVisibleText(value);
		Thread.sleep(2000);
	}
	
	
	
	
	@FindBy(xpath = "//*[@id='SelectBadgeTemplate']")
	public WebElement BadgeTemplate;
	
	public void BadgeTemplateDropDwn(String value) throws InterruptedException {
		Select select = new Select(BadgeTemplate);
		select.selectByVisibleText(value);
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//*[@id='textticketquantity1']")
	public WebElement quantityTxtBx;

	@FindBy(xpath = "//*[@id='ddlTicketCurrency']")
	public WebElement PriceTicketDrp;

	public void priceTicketsDropDwn(String value) throws InterruptedException {
		Select select = new Select(PriceTicketDrp);
		select.selectByVisibleText(value);
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//*[@id='textticketprice1']")
	public WebElement PricevalueTxtBx;

	@FindBy(xpath ="/html/body/div[3]/div[7]/form/div/div[4]/div[4]/div[5]/div[2]/div/div[1]/div/div[1]/div/div/div/div[6]/div/div/div[1]/div")
	public WebElement SeesionTypeDrpBx;

	@FindBy(xpath = "/html/body/div[3]/div[7]/form/div/div[4]/div[4]/div[5]/div[2]/div/div[1]/div/div[1]/div/div/div/div[6]/div/div/div[2]/div[1]/input")
	public WebElement sessionsearch;

	@FindBy(xpath = "/html/body/div[3]/div[7]/form/div/div[4]/div[4]/div[5]/div[2]/div/div[1]/div/div[1]/div/div/div/div[6]/div/div/div[2]/div[2]/div[not(contains(@class, 'hidden'))]/span")
	public WebElement sessionchkBx;

	public void SeesionTypeDrpDwn(String value) throws Exception {
		SeesionTypeDrpBx.click();
		Thread.sleep(2000);
		String strMain = value;
		String[] arrSplit = strMain.split(",");
		for (int i = 0; i < arrSplit.length; i++) {
			sessionsearch.sendKeys(arrSplit[i].trim());
			sessionchkBx.click();
			Thread.sleep(2000);
			sessionsearch.clear();
			Thread.sleep(4000);
		}
	}

	@FindBy(xpath = "/html/body/div[3]/div[7]/form/div/div[4]/div[4]/div[5]/div[2]/div/div[1]/div/div[1]/div/div/div/div[8]/div/select")
	public WebElement AteendeeRegistrationForm;

	public void AteendeeRegistrationForm(String value) throws InterruptedException {
		Select select = new Select(AteendeeRegistrationForm);
		select.selectByVisibleText(value);
		Thread.sleep(2000);
	}

	@FindBy(xpath = "/html/body/div[3]/div[7]/form/div/div[4]/div[4]/div[5]/div[2]/div/div[1]/div/div[1]/div/div/div/div[13]/div/div[2]/div[3]/div[2]")
	public WebElement descriptionTicketsTxtBx;
	
	
	//donations & raffle

	@FindBy(xpath = "//*[@id='ddlTicketCurrency']")
	public WebElement DonationsDrpdwn;
	
	
	public void selectDonationsDrpdwn(String value) throws InterruptedException {
		Select select = new Select(DonationsDrpdwn);
		select.selectByVisibleText(value);
	
	}
	
	@FindBy(xpath = "//*[@id='textticketprice1']")
	public WebElement Dtxtbx1;
	
	@FindBy(xpath = "//*[@id='textticketprice2']")
	public WebElement Dtxtbx2;
	
	@FindBy(xpath = "//*[@id='textticketprice3']")
	public WebElement Dtxtbx3;
	
	@FindBy(xpath = "//*[@id='textticketprice4']")
	public WebElement Dtxtbx4;
	
	
	@FindBy(xpath = "//*[@id='textmaxticketperorder']")
	public WebElement MaximumTicketsperorder;
	
//	@FindBy(xpath = "/html/body/div[3]/div[7]/form/div/div[4]/div[4]/div[4]/div[1]/div/button[1]")
//	public WebElement NextBtn;
//	@FindBy(xpath = "/html/body/div[3]/div[7]/form/div/div[4]/div[4]/div[4]/div[1]/div/button[1]")
//	public WebElement NextBtn;
//	@FindBy(xpath = "/html/body/div[3]/div[7]/form/div/div[4]/div[4]/div[4]/div[1]/div/button[1]")
//	public WebElement NextBtn;
//	@FindBy(xpath = "/html/body/div[3]/div[7]/form/div/div[4]/div[4]/div[4]/div[1]/div/button[1]")
//	public WebElement NextBtn;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath = "/html/body/div[3]/div[7]/form/div/div[4]/div[4]/div[5]/div[2]/div/div[2]/div/a[2]")
	public WebElement AddTicketsBtn;
	
	@FindBy(xpath = "/html/body/div[3]/div[7]/form/div/div[4]/div[4]/div[4]/div[1]/div/button[1]")
	public WebElement NextBtn;

	// MarketPlace Services

	@FindBy(xpath = "//*[@id='marketplace']/div/ul/li[2]/a")
	public WebElement ProductsTabLnk;
	
	@FindBy(xpath ="//*[@id='addnewmarket']")
	public WebElement ProductsAddNewBtn;
	
	
	@FindBy(xpath = "//*[@id='marketplace']/div[2]/ul/li[3]/a")
	public WebElement ServicesTabLnk;

	@FindBy(xpath = "//*[@id='addnewservice']")
	public WebElement AddNewServicesBtn;

	@FindBy(xpath = "//*[@id='servicetitle']")
	public WebElement serviceNameTxtBx;

	@FindBy(xpath = "//*[@id='servicedescription']")
	public WebElement serviceDescriptionTxtBx;

	@FindBy(xpath = "//*[@id='serviceduration']")
	public WebElement serviceDurationDrp;

	public void serviceDurationDrpDwn(String value) throws InterruptedException {
		Select select = new Select(serviceDurationDrp);
		select.selectByVisibleText(value);
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//*[@id='txtFromDate']")
	public WebElement ActivefromServiceDate;

	@FindBy(xpath = "//*[@id='txtToDate']")
	public WebElement ActivetoServiceDate;

	@FindBy(xpath = "//*[@id='ddlservercurrency']")
	public WebElement PriceDrp;

	public void PriceDrpDwn(String value) throws InterruptedException {
		Select select = new Select(PriceDrp);
		select.selectByVisibleText(value);
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//*[@id='textserviceprice']")
	public WebElement servicePriceTxtBx;

	@FindBy(xpath = "//*[@id='texturl']")
	public WebElement UrlServiceTxtBx;

	@FindBy(xpath = "//*[@id='txtransactionchatgesservice']")
	public WebElement serviceTransactionchargesDrp;

	public void serviceTransactionchargesDrpDwn(String value) throws InterruptedException {
		Select select = new Select(serviceTransactionchargesDrp);
		select.selectByVisibleText(value);
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//*[@id='savecancelservice']/div/a[2]")
	public WebElement saveServiceBtn;

	// Creating Marketplace Hotels

	@FindBy(xpath = "//*[@id='marketplace']/div[2]/ul/li[4]/a")
	public WebElement HotelsTabLnk;

	@FindBy(xpath = "//*[@id='addnewhotel']")
	public WebElement AddNewHotelClkBtn;

	@FindBy(xpath = "//*[@id='inputhotellogo']")
	public WebElement Hotellogo;

	@FindBy(xpath = "//*[@id='btnCrop']")
	public WebElement HotelCropandProceed;

	@FindBy(xpath = "//*[@id='texthotelname1']")
	public WebElement HotelNameTxtBx;
	
	@FindBy(xpath = "//*[@id='selectItemtype']")
	public WebElement EventHotelType;

	public void EventHotelTypeDrpDwn(String value) {
		Select select = new Select(EventHotelType);
		select.selectByVisibleText(value);
	}

	
	@FindBy(xpath ="//*[@id='Bideventdropdown1div']/div/div[1]/span")
	public WebElement HoteleventDrpBx;

	@FindBy(xpath ="//*[@id='Bideventdropdown1div']/div/div[2]/div[1]/input")
	public WebElement HoteleventSearch;

	@FindBy(xpath ="//*[@id='Bideventdropdown1div']/div/div[2]/div[not(contains(@class, 'hidden'))]/div/span/i")
	public WebElement HoteleventChkBx;
					
	public void EventHotelDrpDwn(String value) throws Exception {
		HoteleventDrpBx.click();
				Thread.sleep(2000);
				String strMain = value;
				    String[] arrSplit = strMain.split(",");
				    for (int i=0; i < arrSplit.length; i++)
				    {
				    	HoteleventSearch.sendKeys(arrSplit[i].trim());
				    	HoteleventChkBx.click();
				    	Thread.sleep(2000);
				    //	eventSearch.clear();
				    	// Thread.sleep(4000);
				    			     }
					}


	@FindBy(xpath = "//*[@id='feedropdown1']")
	public WebElement TransactionChargesHotelDrp;

	public void TransactionChargesHotelDrpDwn(String value) {
		Select select = new Select(TransactionChargesHotelDrp);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='autocomplete']")
	public WebElement LocationHotelTxtBx;

	@FindBy(xpath = "//*[@id='txthotelFromDateTime1']")
	public WebElement SalesStartDateHotel;

	@FindBy(xpath = "//*[@id='txthotelToDateTime1']")
	public WebElement SalesEndDateHotel;

	@FindBy(xpath = "//*[@id='hoteldescription']")
	public WebElement HotelDescriptionTxtBx;

	@FindBy(xpath = "//*[@id='checkIndividualWeightageDiv1']/i[2]")
	public WebElement NoRefundHotelRadioBtn;

	@FindBy(xpath = "//*[@id='Hotel']/div[1]/div[3]/div[2]/label/i[1]")
	public WebElement RefundHotelRadioBtn;

	public void HotelReturnPolicyRadioBtn(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("Refund")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", RefundHotelRadioBtn);
			RefundHotelRadioBtn.click();
		} else if (value.equalsIgnoreCase("No Refund")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", NoRefundHotelRadioBtn);
			NoRefundHotelRadioBtn.click();
		}
	}

	@FindBy(xpath = "//*[@id='selectrefundhotel']")
	public WebElement HotelRefundType;

	public void HotelRefundTypeDrpDwn(String value) {
		Select select = new Select(HotelRefundType);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='refundbeforedayshotel']")
	public WebElement HotelRefundTypeAmount;

	@FindBy(xpath = "//*[@id='refundvaluehotel']")
	public WebElement RefundDaysEventTxtBx;

	@FindBy(xpath = "//*[@id='addnewrefundhotel']")
	public WebElement HotelRefundaddBtn;

	@FindBy(xpath = "//*[@id='Hotel']/div[1]/div[4]/div/div/div[3]/div[2]")
	public WebElement CancellationPolicyHotelTxtBx;

	@FindBy(xpath = "//*[@id='Hotel']/div[1]/div[5]/div[2]/div")
	public WebElement AddRoomsHotelBtn;

	@FindBy(xpath = "//*[@id='textroomname1']")
	public WebElement RoomNameHotelTxtBx;

	@FindBy(xpath = "//*[@id='textroomquantity1']")
	public WebElement QuantityHotelTxtBx;

	@FindBy(xpath = "//*[@id='selectcurrency1']")
	public WebElement PriceHotelDrp;

	public void PriceHotelDrpDwn(String value) {
		Select select = new Select(PriceHotelDrp);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='textroomprice1']")
	public WebElement PriceValueTxtBx;
	
	@FindBy(xpath = "//*[@id='textroomprice2']")
	public WebElement AllEventPrice;

	@FindBy(xpath = "//*[@id='MultipleDiv']/div/div[2]/div/div[2]/div[3]/div[2]")
	public WebElement DescriptionHotelTxtBx;

	@FindBy(xpath = "//*[@id='addnewrooms']")
	public WebElement AddHotelRoomBtn;

	@FindBy(xpath = "//*[@id='savecancelhotel']/div/a[2]")
	public WebElement SaveHotelBtn;

	@FindBy(xpath = "//*[@id='savecancelhotel']/div/a[2]")
	public WebElement CancelHotelBtn;

	// marketplace Sponsor Package

	@FindBy(xpath = "//*[@id='asponsorcategories']")
	public WebElement sponsorTabBtn;

	@FindBy(xpath = "//*[@id='addnewSponsorCategory']")
	public WebElement addsponsorBtn;

	@FindBy(xpath = "//*[@id='textSponsorCategory']")
	public WebElement SponsorGroupName;

	@FindBy(xpath = "//*[@id='txtAboutSponsorCategory']")
	public WebElement SponsorGroupDescriptionTxtBx;

	@FindBy(xpath = "//*[@id='SponsorPackages']/div[3]/div/div/div[2]/div")
	public WebElement AddPackageBx;

	@FindBy(xpath = "//*[@id='textSponsorPackage']")
	public WebElement PackageName;

	@FindBy(xpath = "//*[@id='ddlSponsorTicketTregistaionform']")
	public WebElement SponsorRegistrationFormDrp;

	public void selectSponsorRegistrationFormDrp(String value) throws InterruptedException {
		Select select = new Select(SponsorRegistrationFormDrp);
		select.selectByVisibleText(value);
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//*[@id='ddlpackageCurrency']")
	public WebElement SponsorPriceDrp;

	public void selectSponsorPriceDrp(String value) throws InterruptedException {
		Select select = new Select(SponsorPriceDrp);
		select.selectByVisibleText(value);
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//*[@id='textSponsorPackageamount']")
	public WebElement SponsorAmountTxtBx;

	@FindBy(xpath = "//*[@id='textSponsorPackageDiscountprice']")
	public WebElement SponsorDiscountAmountTxtBx;

	@FindBy(xpath = "//*[@id='textFreeticket']")
	public WebElement NoofFreeTicketsTxtBx;

	@FindBy(xpath = "//*[@id='add-sponpack']/div[2]/div[2]/div/div[2]/div[3]/div[2]")
	public WebElement FeaturesTxtBx;

	@FindBy(xpath = "//*[@id='addnewSponsorPackages']")
	public WebElement AddpackagesBtn;

	@FindBy(xpath = "//*[@id='SaveSponsorCategory']")
	public WebElement SponsorSaveBtn;

	// Create New Event Page tabs

	@FindBy(xpath = "/html/body/div[3]/div[7]/form/div/div[2]/div/button/i")
	public WebElement SelectOneDrpDwn;
	
	@FindBy(xpath = "//*[@id='areOrganizer']")
	public WebElement OrganizerTab;

	@FindBy(xpath = "//*[@id='areSponser']")
	public WebElement SponsorTab;

	@FindBy(xpath = "//*[@id='areSpeaker']")
	public WebElement SpeakerTab;

	@FindBy(xpath = "//*[@id='areParticipant']")
	public WebElement ParticipantTab;

	@FindBy(xpath = "//*[@id='txtEventName']")
	public WebElement EventNameTxt;

	@FindBy(xpath = "//*[@id='overhide']/div[2]/div[1]/a[2]")
	public WebElement EventNextBtn;

	
	@FindBy(xpath = "//*[@id='WholeDiv']/div/div[1]/div/div[2]/div[2]/div[2]/label/label/div/span[2]")
	public WebElement EventNo;

	public void EventYesNO(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("Yes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", EventNo);
			EventNo.click();
		} else {

		}
	}

	@FindBy(xpath = "//*[@id='txtEventURL']")
	public WebElement EventURL;

	@FindBy(xpath = "//*[@id='txtEventVenue']")
	public WebElement EventVenueTxt;

	@FindBy(xpath = "//*[@id='autocomplete']")
	public WebElement LocationTxt;

	@FindBy(xpath = "//*[@id='WholeDiv']/div/div[1]/div/div[2]/div[2]/div[1]/div[2]/label/span")
	public WebElement EventPublicRdBtn;

	@FindBy(xpath = "//*[@id='WholeDiv']/div/div[1]/div/div[2]/div[2]/div[1]/div[3]/label/span")
	public WebElement EventPrivateRdBtn;

	public void EventRdBtn(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("Public")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", EventPublicRdBtn);
			EventPublicRdBtn.click();
		} else if (value.equalsIgnoreCase("Private")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", EventPrivateRdBtn);
			EventPrivateRdBtn.click();
		}
	}
	
	

	@FindBy(xpath = "//*[@id='txtOrganizerName']")
	public WebElement OrganizerNameTxtBx;

	@FindBy(xpath = "//*[@id='txtOrganizerEmail']")
	public WebElement OrganizerEmailidTxtBx;

	@FindBy(xpath = "//*[@id='txtOrganizerDescription']")
	public WebElement OrganizerDescriptionTxt;

	@FindBy(xpath = "//*[@id='txtOrganizerPhone']")
	public WebElement OrganizerPhoneTxt;

	@FindBy(xpath = "//*[@id='filedocumentname']")
	public WebElement ImageLnk;

	@FindBy(xpath = "//*[@id='txtOrganizerWebsite']")
	public WebElement OrganizerWebsiteTxt;

	@FindBy(xpath = "//*[@id='textYoutubepage']")
	public WebElement OrganizerYoutubeTxt;

	@FindBy(xpath = "//*[@id='textFacebookpage']")
	public WebElement OrganizerFacebookTxt;

	@FindBy(xpath = "//*[@id='textLinkedInpage']")
	public WebElement OrganizerLinkedinTxt;

	@FindBy(xpath = "//*[@id='textTwitterpage']")
	public WebElement OrganizerTwitterTxt;

	// @FindBy(xpath = "//*[@id='divdocumentTicket']/div/span/label")
	// @FindBy(xpath = "//*[@id='divdocumentTicket']/div/input")
	@FindBy(xpath = "//*[@id='filedocumentnameTicket']")
	public WebElement EventTicket;

	@FindBy(xpath = "//*[@id='overhide']/div[2]/div[1]/a[2]")
	public WebElement SaveandNextBtn;

	// Event Options page

	@FindBy(xpath = "/html/body/div[3]/div[7]/form/div/div[4]/div[1]/div/div/div[5]/div/div[2]/div/div[2]/div[3]/div[2]")
	public WebElement EventDescriptionTxt;

	@FindBy(xpath = "//*[@id='tab2']/div[1]/div[2]/div/div[1]/div/label/label/div/i")
	public WebElement RemoveSpeakers;

	public void ChooseSpeaker(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("yes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", RemoveSpeakers);
			RemoveSpeakers.click();
		} else {

		}
	}

	@FindBy(xpath = "//*[@id='tab2']/div[1]/div[2]/div/div[2]/div/label/label/div/i")
	public WebElement RemoveExhibitors;

	public void ChooseExhibitors(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("yes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", RemoveExhibitors);
			RemoveExhibitors.click();
		} else {

		}
	}

	@FindBy(xpath = "//*[@id='tab2']/div[1]/div[2]/div/div[3]/div/label/label/div/i")
	public WebElement RemoveSponsors;

	public void ChooseSponsors(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("yes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", RemoveSponsors);
			RemoveSponsors.click();
		} else {

		}
	}

	@FindBy(xpath = "//*[@id='tab2']/div[1]/div[2]/div/div[4]/div/label/label/div")
	public WebElement RemoveTickets;

	public void ChooseTickets(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("yes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", RemoveTickets);
			RemoveTickets.click();
		} else {

		}
	}

	@FindBy(xpath = "//*[@id='tab2']/div[1]/div[2]/div/div[5]/div/label/label/div/i")
	public WebElement RemoveHotels;

	public void ChooseHotels(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("yes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", RemoveHotels);
			RemoveHotels.click();
		} else {

		}
	}

	@FindBy(xpath = "//*[@id='tab2']/div[1]/div[2]/div/div[6]/div/label/label/div")
	public WebElement RemoveAttendees;

	public void ChooseAttendees(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("yes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", RemoveAttendees);
			RemoveAttendees.click();
		} else {

		}
	}

	@FindBy(xpath = "/html/body/div[3]/div[7]/form/div/div[4]/div[1]/div/div/div[1]/div/div[2]/div[2]/div[8]/input")
	public WebElement EasySearchCodeTxt;

	@FindBy(xpath = "/html/body/div[3]/div[7]/form/div/div[4]/div[3]/div[1]/div/div[2]/div/div/div/div[1]/div/div/input")
	public WebElement TagsTxt;

	@FindBy(xpath = "/html/body/div[3]/div[7]/form/div/div[4]/div[1]/div/div/div[1]/div/div[2]/div[2]/div[6]/div/div[1]/div")
	public WebElement EventTypeDrp;

	@FindBy(xpath = "/html/body/div[3]/div[7]/form/div/div[4]/div[1]/div/div/div[1]/div/div[2]/div[2]/div[6]/div/div[2]/div[1]/input")
	public WebElement EventTypeSearchBtn;

	@FindBy(xpath = "/html/body/div[3]/div[7]/form/div/div[4]/div[1]/div/div/div[1]/div/div[2]/div[2]/div[6]/div/div[2]/div[2]/div[not(contains(@class, 'hidden'))]/span")
	public WebElement EventTypeChkBx;

	public void EventTypeDrp(String value) throws Exception {
		EventTypeDrp.click();
		Thread.sleep(2000);
		String strMain = value;
		String[] arrSplit = strMain.split(",");
		for (int i = 0; i < arrSplit.length; i++) {
			EventTypeSearchBtn.sendKeys(arrSplit[i].trim());
			EventTypeChkBx.click();
			Thread.sleep(2000);
			EventTypeSearchBtn.clear();
			// Thread.sleep(4000);
			EventTypeDrp.click();
		}
	}

	@FindBy(xpath = "/html/body/div[3]/div[7]/form/div/div[4]/div[1]/div/div/div[1]/div/div[2]/div[2]/div[7]/div/div[1]/div")
	public WebElement EventCategoriesDrp;

	@FindBy(xpath = "/html/body/div[3]/div[7]/form/div/div[4]/div[1]/div/div/div[1]/div/div[2]/div[2]/div[7]/div/div[2]/div[1]/input")
	public WebElement EventCategoriesSearchBx;

	@FindBy(xpath = "/html/body/div[3]/div[7]/form/div/div[4]/div[1]/div/div/div[1]/div/div[2]/div[2]/div[7]/div/div[2]/div[2]/div[not(contains(@class, 'hidden'))]/span")
	public WebElement EventCategoriesChkBx;

	public void eventCategoriesDrpDwn(String value) throws Exception {
		EventCategoriesDrp.click();
		Thread.sleep(2000);
		String strMain = value;
		String[] arrSplit = strMain.split(",");
		for (int i = 0; i < arrSplit.length; i++) {
			EventCategoriesSearchBx.sendKeys(arrSplit[i].trim());
			EventCategoriesChkBx.click();
			Thread.sleep(2000);
			EventCategoriesSearchBx.clear();
			// Thread.sleep(4000);
			EventCategoriesDrp.click();
		}
	}

	@FindBy(xpath = "//*[@id='selecttimezone']")
	public WebElement EventTimeZoneDrpDwn;

	@FindBy(xpath = "//*[@id='EvntSurveyDivid']/div/select")
	public WebElement EventSurveyDrp;

	public void EventSurveyDrpDwn(String value) {
		Select select = new Select(EventSurveyDrp);
		select.selectByVisibleText(value);
	}


	@FindBy(xpath = "//*[@id='SponsorCatDivid']/div/div/label[3]/a")
	public WebElement SpeakerandSponsorCategoriesDrpAddNew;
	
	@FindBy(xpath = "//*[@id='asponsorcategories']")
	public WebElement SponsorCategoriesTab;
	
	@FindBy(xpath = "//*[@id='createSponaorCategory']/div[1]/a")
	public WebElement SponsorCategoriesAddNew;
	
	@FindBy(xpath = "//*[@id='textSponsorCategory']")
	public WebElement SponsorCategoryName;
	
	@FindBy(xpath = "//*[@id='SponsorPackages']/div[2]/div/textarea")
	public WebElement SponsorCategoryDescription;
	
	@FindBy(xpath = "//*[@id='SponsorPackages']/div[3]/div/div/div[2]")
	public WebElement SponsorCategoryAddNewBtn;
	
	@FindBy(xpath = "//*[@id='textSponsorPackage']")
	public WebElement SponsorPackageNameTxtBx;
	
	@FindBy(xpath = "//*[@id='ddlSponsorTicketTregistaionform']")
	public WebElement SponsorCategoryegistrationDrp;
	
	
	public void SponsorCategoryegistrationDrp(String value) {
		Select select = new Select(SponsorCategoryegistrationDrp);
		select.selectByVisibleText(value);
	}
	
	
	@FindBy(xpath = "//*[@id='ddlpackageCurrency']")
	public WebElement SponsorCategoryPriceDrp;
	
	public void SponsorCategoryPriceDrp(String value) {
		Select select = new Select(SponsorCategoryPriceDrp);
		select.selectByVisibleText(value);
	}
	
	@FindBy(xpath = "//*[@id='textSponsorPackageamount']")
	public WebElement SponsorCategoryPriceTxtBx;
	
	@FindBy(xpath = "//*[@id='PackageQuntity']")
	public WebElement SponsorCategoryQuantityTxtBx;
	
	@FindBy(xpath = "//*[@id='textSponsorPackageDiscountprice']")
	public WebElement SponsorCategoryDiscountTxtBx;
	
	@FindBy(xpath = "//*[@id='textFreeticket']")
	public WebElement SponsorCategoryNoofFreeTickets;
	
	@FindBy(xpath = "//*[@id='mCSB_7_container']/div[2]/div/div[2]/div[3]/div[2]")
	public WebElement SponsorCategoryFeaturesTxtBx;
	
	@FindBy(xpath = "//*[@id='addnewSponsorPackages']")
	public WebElement SponsorCategoryAddPackageBtn;
	
	@FindBy(xpath = "//*[@id='savecancelSponsorCategory']/div/div/div/a[2]")
	public WebElement SponsorCategorySaveBtn;
	
	
	@FindBy(xpath = "//*[@id='ddlEventSponsorCategory']")
	public WebElement SponsorCategoriesDrpDwn;

	public void SponsorCategoriesDrpDwn(String value) {
		Select select = new Select(SponsorCategoriesDrpDwn);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='WholeDiv']/div/div[4]/div/div[2]/div/div[1]/div[2]/label/i[1]")
	public WebElement OneDayEvent;

	@FindBy(xpath = "//*[@id='WholeDiv']/div/div[4]/div/div[2]/div/div[1]/div[3]/label/span")
	public WebElement MultipleDaysEvent;

	public void EventDays(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("One day Event")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", OneDayEvent);
			OneDayEvent.click();
		} else if (value.equalsIgnoreCase("Multiple days event")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", MultipleDaysEvent);
			MultipleDaysEvent.click();
		}
	}

	// One Day

	@FindBy(xpath = "//*[@id='txtEndDate0']")
	public WebElement Date;

	@FindBy(xpath = "//*[@id='texttimetoreachfrom0']")
	public WebElement StartTime;

	@FindBy(xpath = "//*[@id='texttimetoreachTo0']")
	public WebElement EndTime;

	// Multiple days

	@FindBy(xpath = "//*[@id='txtEndDate1']")
	public WebElement Date1;

	@FindBy(xpath = "//*[@id='texttimetoreachfrom1']")
	public WebElement StartTime1;

	@FindBy(xpath = "//*[@id='texttimetoreachTo1']")
	public WebElement EndTime1;

	@FindBy(xpath = "//*[@id='mCSB_1_container']/div/div[2]/div[4]/div/div[3]/div/a")
	public WebElement PlusAddBtn;

	@FindBy(xpath = "//*[@id='btnAddDateTime']")
	public WebElement AddDateforsame;

	@FindBy(xpath = "//*[@id='mCSB_1_container']/div/div[2]/div[1]/table/thead/tr/th[4]/div/label/label/div/i")
	public WebElement SameTimeForAllDays;

	@FindBy(xpath = "//*[@id='txtEndDate2']")
	public WebElement Date2;

	@FindBy(xpath = "//*[@id='texttimetoreachfrom2']")
	public WebElement StartTime2;

	@FindBy(xpath = "//*[@id='texttimetoreachTo2']")
	public WebElement EndTime2;

	// @FindBy(xpath = "//*[@id='savecancelopt']/div/button[1]")
	@FindBy(xpath = "/html/body/div[3]/div[7]/form/div/div[4]/div[3]/div[2]/div[1]/div/button")
	public WebElement OptionTabNextBtn;
	
	
	@FindBy(xpath = "//*[@id='savecancelopt']/div/button[2]")
	public WebElement OptionSaveandNextDrpBtn;
	
	@FindBy(xpath = "//*[@id='savecancelopt']/div/ul/li[2]/a")
	public WebElement OptionSaveandPublish;

	// Event Agendas page
@FindBy(xpath="//*[@id='tab3']")
public WebElement scrollDiv;
	@FindBy(xpath = "/html/body/div[3]/div[7]/form/div/div[4]/div[4]/div[2]/div[2]/ul/li[3]/a")
	public WebElement AgendaChkBx;
	

	@FindBy(xpath = "/html/body/div[3]/div[7]/form/div/div[4]/div[5]/div[2]/div[2]/ul/li[2]/a")
	public WebElement ExhibitorChkBx;

	@FindBy(xpath = "/html/body/div[3]/div[7]/form/div/div[4]/div[5]/div[2]/div[2]/ul/li[1]/a")
	public WebElement SponsorandExhibitorChkBx;
	
	
	
	

	public void AgendasRadioBtn(String value) {
		

		if (value.equalsIgnoreCase("Sponsor")) 
			{
			jse.executeScript("arguments[0].scrollIntoView(true);", SponsorandExhibitorChkBx);
			SponsorandExhibitorChkBx.click();
			
		} else if (value.equalsIgnoreCase("Exhibitor")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", ExhibitorChkBx);
			ExhibitorChkBx.click();
		} else if (value.equalsIgnoreCase("Agenda")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", AgendaChkBx);
			AgendaChkBx.click();
		}else if (value.equalsIgnoreCase("Challenges")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", ChallengesTab);
			ChallengesTab.click();

	}
	}

	@FindBy(xpath = "//*[@id='tab3']/div[2]/div[2]/ul/li[1]/a")
	public WebElement SponsorAndExhibitorTab;
	
	@FindBy(xpath = "//*[@id='addnewblock']")
	public WebElement AgendaPageAddnewBtn;
	
	@FindBy(xpath = "//*[@id='addnewblock']")
	public WebElement ExhibitorPageAddnewBtn;
	
	@FindBy(xpath = "//*[@id='ExhibitorsTab']/a")
//	@FindBy(xpath = "//*[@id='tab3']/div[2]/div[2]/ul/li[2]/a")
	public WebElement ExhibitorTab;
	
	@FindBy(xpath = "//*[@id='AgendasTab']/a")
	public WebElement AgendaTab;
	
	@FindBy(xpath = "//*[@id='AgendasTab']/a")
	public WebElement AgendaTabStaging;
	
	
//	@FindBy(xpath = "//*[@id='checkOnlyTopicDiv']/label/i[1]")
	@FindBy(xpath = "//*[@id='/html/body/div[3]/div[7]/form/div/div[4]/div[4]/div[2]/div[1]/div[1]/div[1]/div/div[2]/div/button[3]")
	public WebElement AgendasAddNewBtn;
	
	
	@FindBy(xpath = "/html/body/div[3]/div[7]/form/div/div[4]/div[5]/div[2]/div[1]/div[1]/div[2]/div/div[1]/div/div[2]/div[2]/div/select")
	public WebElement SponsorPackage;

	public void selectSponsorPackage(String value) {
		Select select = new Select(SponsorPackage);
		select.selectByVisibleText(value);
	}
	
	@FindBy(xpath = "//*[@id='ddlexhibitorpackage']")
	public WebElement ExhibitorPackage;
	
	
	public void SelectExhibitorPackage(String value) {
		Select select = new Select(ExhibitorPackage);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='txtroomnumber']")
	public WebElement RoomNumber;

	@FindBy(xpath = "//*[@id='ddltopictype']")
	public WebElement SessionType;

	@FindBy(xpath = "/html/body/div[3]/div[7]/form/div/div[4]/div[5]/div[2]/div[1]/div[1]/div[2]/div/div[1]/div/div[2]/div[6]/div/select/option[2]")
	public WebElement SessionTypeDrpAddBtn;

	@FindBy(xpath = "/html/body/div[3]/div[7]/form/div/div[4]/div[5]/div[2]/div[1]/div[1]/div[2]/div/div[1]/div/div[2]/div[6]/div/select")
	public WebElement SessionTypeDrp;

	public void SessionTypeDrp(String value) {
		Select select = new Select(SessionTypeDrp);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "/html/body/div[3]/div[7]/div[22]/div/div/div[2]/form/fieldset/section/div/div/label/input")
	public WebElement AddSessionTypeTxtBx;

	@FindBy(xpath = "/html/body/div[3]/div[7]/div[22]/div/div/div[2]/form/footer/button[2]")
	public WebElement AddSessionTypeBtn;

	@FindBy(xpath = "//*[@id='TopicdateDiv']/div/div[1]/div")
	public WebElement TopicDateDrp;

	@FindBy(xpath = "//*[@id='TopicdateDiv']/div/div[2]/div[1]/input")
	public WebElement TopicDateSearchBx;
	
//	@FindBy(xpath = "//*[@id='TopicdateDiv']/div/div[2]/div[not(contains(@class, 'hidden'))]/span")
	//@FindBy(xpath = "//*[@id="TopicdateDiv']/div/div[2]/div[2][not(contains(@class, 'hidden'))]/div/span")
	@FindBy(xpath ="//*[@id='TopicdateDiv']/div/div[2]/div[2]/div/span")
	public WebElement TopicDateChkBx;

	public void TopicDateDrpDwn(String value) throws Exception {
		TopicDateDrp.click();
		Thread.sleep(2000);
		String strMain = value;
		String[] arrSplit = strMain.split(",");
		for (int i = 0; i < arrSplit.length; i++) {
			//TopicDateSearchBx.sendKeys(arrSplit[i].trim());
			Thread.sleep(2000);
			//TopicDateChkBx.click();
			Thread.sleep(2000);
			//TopicDateSearchBx.clear();
			TopicDateDrp.click();
			
			// Thread.sleep(4000);
		}
	}
	
	@FindBy(xpath = "//*[@id='TopicdateDiv']/div/div[1]/div")
	public WebElement TopicDateDrp1;
	
	@FindBy(xpath = "//*[@id='TopicdateDiv']/div/div[2]/div[1]/input")//*[@id="TopicdateDiv"]/div/div[2]/div[1]/input
	public WebElement TopicDateSearchBx1;
	
	@FindBy(xpath ="//*[@id='TopicdateDiv']/div/div[2]/div[not(contains(@class, 'hidden'))]/div/span")
	public WebElement TopicDateChkBx1;
	
	public void TopicDateDrpDwn1(String value) throws Exception {
		TopicDateDrp1.click();
		Thread.sleep(2000);
		String strMain = value;
		String[] arrSplit = strMain.split(",");
		for (int i = 0; i < arrSplit.length; i++) {
			//TopicDateSearchBx1.sendKeys(arrSplit[i].trim());
			Thread.sleep(2000);
			TopicDateChkBx1.click();
			Thread.sleep(2000);
			//TopicDateSearchBx.clear();
			TopicDateDrp1.click();
			
			// Thread.sleep(4000);
		}
	}

	@FindBy(xpath = "//*[@id='texttimetoreachfromTPC']")
	public WebElement TopicsStartTime;

	@FindBy(xpath = "//*[@id='texttimetoreachToTPC']")
	public WebElement TopicsEndTime;

	@FindBy(xpath = "//*[@id='divdocumentSponsor']/div/input[1]")
	public WebElement Sponsorlogo;

	@FindBy(xpath = "//*[@id='modalSponsorLogoimagecrop']/div/div/div[3]/button[2]")
	public WebElement EventTopicImageCrop;

	
	@FindBy(xpath = "//*[@id='modalSponsorLogoimagecrop']/div/div/div[3]/button[2]")
	public WebElement SponsorLogoImageCropBtn;

	
	@FindBy(xpath = "//*[@id='txtTopicCompanyNamesngl']")
	public WebElement SponsorCompanyName;

	@FindBy(xpath = "//*[@id='txtTopicName']")
	public WebElement Title;

	@FindBy(xpath = "//*[@id='Agendarow']/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[3]/div[2]")
	public WebElement TopicDescription;

	@FindBy(xpath = "//*[@id='txtTopicuniqueCode']")
	public WebElement EasySearchCode;

	@FindBy(xpath = "//*[@id='ddlSurveys']")
	public WebElement TopicsSurvey;

	public void TopicsSurveyDrpDwn(String value) throws Exception {

		Select satish = new Select(TopicsSurvey);
		satish.deselectByValue(value);

	}
	
	@FindBy(xpath = "//*[@id='txtTopicCompanyNamesngl']")
	public WebElement SponsorCompanyNameDrpDwn;
	
	public void SponsorCompanyNameDrpDwn(String value) {
		Select select = new Select(SponsorCompanyNameDrpDwn);
		select.selectByVisibleText(value);
	}
	
	

	@FindBy(xpath = "//*[@id='tab3']/div[2]/div[1]/div[1]/div/div/div[2]/div/button[1]")
	public WebElement TopicSaveBtn;
	
	@FindBy(xpath = "//*[@id='btnsaveTopics']")
	public WebElement AgendaSaveBtn;

	@FindBy(xpath = "/html/body/div[3]/div[7]/form/div/div[4]/div[3]/div[2]/div[1]/div/button")
	public WebElement AgendaOrgSponsorTopicNextBtn;
	

	@FindBy(xpath = "//*[@id='savecancel1']/div/button[1]")
	public WebElement TopicNextBtnExhibitors;

	// Events Add Presenter

	@FindBy(xpath = "/html/body/div[3]/div[7]/form/div/div[4]/div[5]/div[2]/div[1]/div[1]/div[2]/div/div[3]/div/div[2]/div/h4/div")
	public WebElement AddPresenterBtn;
	
	@FindBy(xpath = "/html/body/div[3]/div[7]/form/div/div[4]/div[5]/div[2]/div[1]/div[1]/div[1]/div/div[2]/div/button[2]")
	public WebElement PresenterpageSaveBtn;
	
	@FindBy(xpath = "//*[@id='add-spea']/div[1]/h4/a")
	public WebElement AddPresenterCloseBtn;
	
	@FindBy(xpath = "//*[@id='btnSaveTopic']")
	public WebElement SpeakerPageSaveBtn;
	
	@FindBy(xpath = "//*[@id='myModalNewSpeaker']/a")
	public WebElement AddSpeakerCloseBtn;

	@FindBy(xpath = "/html/body/div[3]/div[7]/div[1]/div/div[2]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/div/input[1]")
	public WebElement PresenterImg;

	@FindBy(xpath = "//*[@id='modalskprimagecrop']/div/div/div[3]/button[2]")
	public WebElement PresenterImageCrop;

	@FindBy(xpath = "/html/body/div[3]/div[7]/div[1]/div/div[2]/div/div/div[1]/div/div[1]/div/div[2]/div/div[1]/div/input")
	public WebElement PresenterFirstName;

	@FindBy(xpath = "//*[@id='textlastname']")
	public WebElement PresenterLastName;

	@FindBy(xpath = "//*[@id='txtSpeakerEmailId']")
	public WebElement PresenterEmailid;

	@FindBy(xpath = "//*[@id='selectCountryCode']")
	public WebElement PresenterPhoneCode;
	
	public void SelectPresenterPhoneCode(String value) {
		Select select = new Select(PresenterPhoneCode);
		select.selectByVisibleText(value);
	}
	
	

	@FindBy(xpath = "//*[@id='textcontactnumber']")
	public WebElement PresenterPhoneNumber;
	
	@FindBy(xpath = "//*[@id='Designation']")
	public WebElement PresenterDesignation;
	
	@FindBy(xpath = "//*[@id='textwebsite']")
	public WebElement PresenterWebsite;
	
	@FindBy(xpath = "/html/body/div[3]/div[7]/div[1]/div/div[2]/div/div/div[1]/div/div[1]/div/div[2]/div/div[9]/div/div/div/div/div[3]/div[2]")
	public WebElement PresenterDescription;
	
	
	
	
	
	
	
	
	

	
	@FindBy(xpath = "//*[@id='ddlSpeakerRegistrationform']")
	public WebElement ExhibitorPresenterRegistrationForm;

	
	public void ExhibitorPresenterRegistrationFormDrpDwn(String value) {
		Select select = new Select(ExhibitorPresenterRegistrationForm);
		select.selectByVisibleText(value);
	}
	
	@FindBy(xpath = "//*[@id='textSpeakerRemuneration']")
	public WebElement ExhibitorPresenterRemuneration;
	
	@FindBy(xpath = "//*[@id='textSpeakerfee']")
	public WebElement ExhibitorPresenterFee;
	
	@FindBy(xpath = "//*[@id='textSpeakerFreTickets']")
	public WebElement ExhibitorPresenterNumberOfFreeTickets;
	
	@FindBy(xpath = "//*[@id='changer_main_c1']/div/div/div[3]/div[2]")
	public WebElement ExhibitorPresenterDescription;
	
	@FindBy(xpath = "/html/body/div[3]/div[7]/div[1]/div/div[2]/div/div/div[1]/div/div[1]/div/div[1]/div/div[2]/label/label")
	public WebElement PrimaryContactChkBx;
	
	@FindBy(xpath = "/html/body/div[3]/div[7]/div[1]/div/div[2]/div/div/div[1]/div/div[1]/div/div[1]/div/div[3]/label[1]/label/div/i")
	public WebElement Sendinvoiceonly;
	
	@FindBy(xpath = "/html/body/div[3]/div[7]/div[1]/div/div[2]/div/div/div[1]/div/div[1]/div/div[1]/div/div[3]/label[2]/label/div/i")
	public WebElement Offlinecollected;

	public void PrimaryContactChkBx(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("yes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", PrimaryContactChkBx);
			PrimaryContactChkBx.click();
		} else {
			if (value.equalsIgnoreCase("No")) {
				jse.executeScript("arguments[0].scrollIntoView(true);", PrimaryContactChkBx);
				PrimaryContactChkBx.clear();
		}
	}
	}
	@FindBy(xpath = "//*[@id='add-spea']/div[2]/div/div/div[1]/div[1]/div/div[4]/label/label/div/i")
	public WebElement PublishTOWebsiteChkBx;

	public void PublishTOWebsiteChkBx(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("yes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", PublishTOWebsiteChkBx);
			PublishTOWebsiteChkBx.click();
		} else {

		}
	}

	@FindBy(xpath = "//*[@id='add-spea']/div[2]/div/div/div[1]/div[1]/div/div[5]/label/label/div/i")
	public WebElement SendRegisterationLinKChkBx;

	public void SendRegisterationLinKChkBx(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("yes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", SendRegisterationLinKChkBx);
			SendRegisterationLinKChkBx.click();
		} else {

		}
	}

	@FindBy(xpath = "/html/body/div[3]/div[7]/div[1]/div/div[2]/div/div/div[1]/div/div[1]/div/div[1]/div/div[9]/div[2]/div[1]/input")
	public WebElement YoutubeLnk;
	
	@FindBy(xpath = "/html/body/div[3]/div[7]/div[1]/div/div[2]/div/div/div[1]/div/div[1]/div/div[1]/div/div[9]/div[2]/div[2]/input")
	public WebElement FacebookLnk;
	
	@FindBy(xpath = "//*[@id='spkrtextLinkedInpage']")
	public WebElement LinkedinLnk;
	
	@FindBy(xpath = "/html/body/div[3]/div[7]/div[1]/div/div[2]/div/div/div[1]/div/div[1]/div/div[1]/div/div[9]/div[2]/div[4]/input")
	public WebElement TwitterLnk;
	
	
	
	

	@FindBy(xpath = "/html/body/div[3]/div[7]/div[1]/div/div[2]/div/div/div[2]/div[2]/div/div/a")
	public WebElement PresenterSaveBtn;

	@FindBy(xpath = "/html/body/div[3]/div[7]/form/div/div[4]/div[5]/div[2]/div[8]/div[1]/div/button[1]")
	public WebElement FinishBtn;

	// Web element for Speakers

	
	// Agenda session Type 
	
	
	
	@FindBy(xpath = "//*[@id='CompanyMultiDiv']/div/div[1]/div")
	public WebElement AgendaCompanyNameDrpDwn;

	@FindBy(xpath = "//*[@id='CompanyMultiDiv']/div/div[2]/div[1]/input")
	public WebElement AgendaCompanyNameSearchBx;

	@FindBy(xpath = "//*[@id='CompanyMultiDiv']/div/div[2]/div[2]/div[not(contains(@class, 'hidden'))]/span")
	public WebElement AgendaCompanyNameChkBx;

	
	public void AgendaCompanyName(String value) throws Exception {
		AgendaCompanyNameDrpDwn.click();
		Thread.sleep(2000);
		String strMain = value;
		String[] arrSplit = strMain.split(",");
		for (int i = 0; i < arrSplit.length; i++) {
			AgendaCompanyNameSearchBx.sendKeys(arrSplit[i].trim());
			Thread.sleep(3000);
			AgendaCompanyNameChkBx.click();
			Thread.sleep(2000);
			//TopicDateSearchBx.clear();
			AgendaCompanyNameDrpDwn.click();
			
			// Thread.sleep(4000);
		}
	}
	

	@FindBy(xpath = "//*[@id='ddltopictype']/option[2]")
	public WebElement AgendaSessionType;

	@FindBy(xpath = "//*[@id='txtnewsessiontype']")
	public WebElement AgendaAddnewTxtBx;

	@FindBy(xpath = "/html/body/div[3]/div[7]/div[22]/div/div/div[2]/form/footer/button[2]")
	public WebElement AgendaAddNewBtn;

	
	@FindBy(xpath = "//*[@id='addtopicspeaker']")
	public WebElement SpeakerBtn;

	@FindBy(xpath = "//*[@id='filedocumentname1']")
	public WebElement SpeakerImage;

	@FindBy(xpath = "//*[@id='modalskprimagecrop']/div/div/div[3]/button[2]")
	public WebElement SpeakerImageCrop;

	@FindBy(xpath = "//*[@id='txtName']")
	public WebElement SpeakerNameTxt;

	@FindBy(xpath = "//*[@id='textlastname']")
	public WebElement SpeakerLastName;

	@FindBy(xpath = "//*[@id='txtSpeakerEmailId']")
	public WebElement SpeakerEmailid;

	
	@FindBy(xpath = "//*[@id='selectCountryCode']")
	public WebElement SpeakerPhoneCodeDrpDwn;
	
	public void selectSpeakerPhoneCodeDrpDwn(String value) {
		Select select = new Select(SpeakerPhoneCodeDrpDwn);
		select.selectByVisibleText(value);
	}

	
	@FindBy(xpath = "//*[@id='textcontactnumber']")
	public WebElement SpeakerPhone;

	@FindBy(xpath = "//*[@id='Designation']")
	public WebElement SpeakerJob;
	
	

	@FindBy(xpath = "//*[@id='ddlSpeakerType']")
	public WebElement SpeakerTypeDrp;

	public void selectSpeakerTypeDrp(String value) {
		Select select = new Select(SpeakerTypeDrp);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='ddlSpeakerRegistrationform']")
	public WebElement SpeakerRegistrationFormDrp;

	public void selectSpeakerRegistrationFormDrp(String value) {
		Select select = new Select(SpeakerRegistrationFormDrp);
		select.selectByVisibleText(value);
	}

	
	

	@FindBy(xpath = "//*[@id='ddlassignspeakerticket']")
	public WebElement SpeakerAssignTicket;
	
	public void selectSpeakerAssignTicket(String value) {
		Select select = new Select(SpeakerAssignTicket);
		select.selectByVisibleText(value);
	}
	
	
	
	
	
	
	@FindBy(xpath = "//*[@id='textSpeakerRemuneration']")
	public WebElement SpeakerRemuneration;

	@FindBy(xpath = "//*[@id='textSpeakerfee']")
	public WebElement SpeakerFee;

	@FindBy(xpath = "//*[@id='textSpeakerFreTickets']")
	public WebElement SpeakerNooftickets;

	@FindBy(xpath = "//*[@id='txtDescription']")
	public WebElement SpeakerDescription;

	@FindBy(xpath = "//*[@id='divspeakerishost']/label/label/div/i")
	public WebElement SpeakerHostChkBx;

	@FindBy(xpath = "//*[@id='textvideolink']")
	public WebElement VideoLinkTxtBx;

	@FindBy(xpath = "//*[@id='btnSaveSpeaker']")
	public WebElement SpeakerSaveBtn;
	
	
	// Challenges
	
	@FindBy(xpath = "//*[@id='Challenge']/a")
	public WebElement ChallengesTab;
	
	@FindBy(xpath = "//*[@id='addnewChallenge']")
	public WebElement ChallengesAddnewBtn;
	
	@FindBy(xpath = "//*[@id='EnrollFormddl']")
	public WebElement EnrollFormDrpDwn;
	
	public void selectEnrollFormDrpDwn(String value) {
		Select select = new Select(EnrollFormDrpDwn);
		select.selectByVisibleText(value);
	}
	
	@FindBy(xpath = "//*[@id='ChallengeHallNumber']")
	public WebElement HallNumberTxtBx;
	
	@FindBy(xpath = "//*[@id='challengerow']/div/div[1]/div/div[2]/div[4]/div[1]/label/span")
	public WebElement CompaniesRdBtn;
	
	@FindBy(xpath = "//*[@id='challengerow']/div/div[1]/div/div[2]/div[5]/div[2]/label/i[1]")
	public WebElement individualRdBtn;
	
public void CompetitionBtnRadioBtn(String value) {
		

		if (value.equalsIgnoreCase("Companies")) 
			{
			jse.executeScript("arguments[0].scrollIntoView(true);", CompaniesRdBtn);
			CompaniesRdBtn.click();
			
		} else if (value.equalsIgnoreCase("Individuals")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", individualRdBtn);
			individualRdBtn.click();
	
		}
}
	
	
	
	@FindBy(xpath = "//*[@id='txtChallengeName']")
	public WebElement NameTxtBx;
	
	@FindBy(xpath = "//*[@id='challengerow']/div/div[1]/div/div[4]/div[2]/div/div[2]/div[3]/div[2]")
	public WebElement ChallengeDescriptionTxtBx;
	
	@FindBy(xpath = "//*[@id='filedocumentChalngLogo']")
	public WebElement ChallengeLogo;
	
	@FindBy(xpath = "//*[@id='modalLogoimagecrop']/div/div/div[3]/button[2]")
	public WebElement ChallengeLogoCropBtn;
	
	@FindBy(xpath = "//*[@id='TopicdateDiv1']/div/div[1]/div")
	public WebElement ChallengeDatesDrpDwn;
	
	@FindBy(xpath = "//*[@id='TopicdateDiv1']/div/div[2]/div[1]/input")
	public WebElement ChallengesDatesSearchBx;
	
	@FindBy(xpath = "//*[@id='TopicdateDiv1']/div/div[2]/div[not(contains(@class, 'hidden'))]/div/span")
	//*[@id="TopicdateDiv1"]/div/div[2]/div[not(contains(@class, 'hidden'))]/div/span
	public WebElement ChallengesDateschkbx;
	
	
	
	
	public void ChallengesDatesDrpDwn(String value) throws Exception {
		ChallengeDatesDrpDwn.click();
		Thread.sleep(2000);
		String strMain = value;
		String[] arrSplit = strMain.split(",");
		for (int i = 0; i < arrSplit.length; i++) {
			ChallengesDatesSearchBx.sendKeys(arrSplit[i].trim());
			Thread.sleep(10000);
			//ChallengesDateschkbx.click();
			Thread.sleep(2000);
			//TopicDateSearchBx.clear();
			//ChallengeDatesDrpDwn.click();
			 Thread.sleep(4000);
		}
	}
	
	
	@FindBy(xpath = "//*[@id='texttimetoreachfromTPC1']")
	public WebElement StarttimeTxtbx;
	
	@FindBy(xpath = "//*[@id='texttimetoreachToTPC1']")
	public WebElement EndtimeTxtbx;
	
		
	
	@FindBy(xpath = "//*[@id='txtChallengeFromDateTime']")
	public WebElement EnrollStartDate;
	
	@FindBy(xpath = "//*[@id='txtChallengeEndDateTime']")
	public WebElement EnrollEndDate;
	
	

	
	
	@FindBy(xpath = "//*[@id='ChallengeUniqueCode']")
	public WebElement EasySearchCodeTxtBx;
	
	@FindBy(xpath = "//*[@id='ddlChallengeSponsors']")
	public WebElement SponsorDrpDwn;
	
	public void selectSponsorDrpDwn(String value) {
		Select select = new Select(SponsorDrpDwn);
		select.selectByVisibleText(value);
	}
	
	@FindBy(xpath = "//*[@id='ddlassignChallengeticket']")//*[@id="ddlassignChallengeticket"]
	public WebElement AssignTicketDrpDwn;
	
	public void selectAssignTicketDrpDwn(String value) {
		Select select = new Select(AssignTicketDrpDwn);
		select.selectByVisibleText(value);
	}
	
	
	@FindBy(xpath = "//*[@id='challengerow']/div/div[2]/div/div[3]/div[1]/div[1]/label/span")
	public WebElement WtgeFromEvaluator;
	
	@FindBy(xpath = "//*[@id='challengerow']/div/div[2]/div/div[3]/div[1]/div[2]/label/span")
	
	public WebElement WtgefromVotes;
	
	@FindBy(xpath = "//*[@id='challengerow']/div/div[2]/div/div[3]/div[1]/div[3]/label/span")
	public WebElement Avrgefromabove;
	
	
	
public void WinnerselectionCriteriaRadioBtn(String value) {
		

		if (value.equalsIgnoreCase("Weightage From Evaluator")) 
			{
			jse.executeScript("arguments[0].scrollIntoView(true);", WtgeFromEvaluator);
			WtgeFromEvaluator.click();
			
		} else if (value.equalsIgnoreCase("Weightage From Votes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", WtgefromVotes);
			WtgefromVotes.click();
		} else if (value.equalsIgnoreCase("Average From Above")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", Avrgefromabove);
			Avrgefromabove.click();
		}

	}
	
	
	
	
	@FindBy(xpath = "//*[@id='Quizddl']")
	public WebElement EvaluatorDrpDwn;
	
	public void selectEvaluatorDrpDwn(String value) {
		Select select = new Select(EvaluatorDrpDwn);
		select.selectByVisibleText(value);
	}
	
	
	@FindBy(xpath = "//*[@id='JudgeWtagePrcntg']")
	public WebElement judgetxtbx;
	
	@FindBy(xpath = "//*[@id='PublicWtagePrcntg']")
	public WebElement ParticipantTxtBx;
	
	@FindBy(xpath = "//*[@id='QuizWtagePrcntg']")
	public WebElement QuizTxtBx;
	
	@FindBy(xpath = "//*[@id='txtChallengeVotingStartDateTime']")
	public WebElement VotingStartDateTxtBx;
	
	@FindBy(xpath = "//*[@id='txtChallengeVotingEndDateTime']")
	public WebElement VotingEndDateTxtBx;
	
	@FindBy(xpath = "//*[@id='CriteriaName1']")
	public WebElement CriteriaNameTxtbx;
	
	@FindBy(xpath = "//*[@id='CriteriaScale1']")
	public WebElement ScoreScaleDrpDwn;
	
	public void selectScoreScaleDrpDwn(String value) {
		Select select = new Select(ScoreScaleDrpDwn);
		select.selectByVisibleText(value);
	}
	
	
	@FindBy(xpath ="//*[@id='AddMorecriteriaDiv']/div")
	public WebElement ScorecriteriaPlusBtn;
	
	@FindBy(xpath ="//*[@id='CriteriaName2']")
	public WebElement CriteriaNameTxtBx2;

	@FindBy(xpath ="//*[@id='CriteriaScale2']")
	public WebElement ScoreScaleDrpDwn2;
	
	public void selectScoreScaleDrpDwn2(String value) {
		Select select = new Select(ScoreScaleDrpDwn2);
		select.selectByVisibleText(value);
	}
	
	
	@FindBy(xpath ="//*[@id='WinnerCriteria']/div[2]/div[3]/div")
	public WebElement DeleteLnk;
	
	@FindBy(xpath ="//*[@id='CriteriaName3']")
	public WebElement CriteriaNameTxtBx3;
	
	@FindBy(xpath ="//*[@id='CriteriaScale3']")
	public WebElement ScoreScaleDrpDwn3;
	
	@FindBy(xpath ="//*[@id='addtopicJudges']")
	public WebElement AddjudgesBtn;
	
	@FindBy(xpath ="//*[@id='filedocumentJudgename1']")
	public WebElement JudgeImage;
	
	@FindBy(xpath ="//*[@id='modalskprimagecrop']/div/div/div[3]/button[2]")
	public WebElement JudgeImageCropBtn;
	
	
	@FindBy(xpath ="//*[@id='txtName']")
	public WebElement judgeNameTxtBx;
	
	@FindBy(xpath ="//*[@id='textlastname']")
	public WebElement JudgelastnameTxtBx;
	
	@FindBy(xpath ="//*[@id='txtSpeakerEmailId']")
	public WebElement JudgeEmailTxtBx;
	
	@FindBy(xpath ="//*[@id='selectCountryCode']")
	public WebElement JudgecodeDrpdwn;
	
	
	public void selectJudgecodeDrpdwn(String value) {
		Select select = new Select(JudgecodeDrpdwn);
		select.selectByVisibleText(value);
	}
	
	@FindBy(xpath ="//*[@id='textcontactnumber']")
	public WebElement JudgeNumberTxtBx;
	
	
	
	@FindBy(xpath ="//*[@id='Designation']")
	public WebElement JudgeJobTitleTxtBx;
	
	@FindBy(xpath ="//*[@id='ddlassignjudgeticket']")
	public WebElement JudgeAssignticketDrpDwn;
	

	public void selectJudgeAssignticketDrpDwn(String value) {
		Select select = new Select(JudgeAssignticketDrpDwn);
		select.selectByVisibleText(value);
	}
	
	
	@FindBy(xpath ="//*[@id='textJudgeRemuneration']")
	public WebElement RemunerationTxtBx;
	
	@FindBy(xpath ="//*[@id='textJudgefee']")
	public WebElement FeeTxtBx;
	
	@FindBy(xpath ="//*[@id='mCSB_6_container']/div/div[1]/div/div[3]/label/label/div/i")
	public WebElement SendRegistrationChkBx;
	
	public void SendRegistrationChkBx(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("yes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", SendRegistrationChkBx);
			SendRegistrationChkBx.click();
		} else {

		}
	}
	
	@FindBy(xpath ="//*[@id='mCSB_6_container']/div/div[1]/div/div[4]/label/label/div/i")
	public WebElement NotifyChkBx;
	
	public void NotifyChkBx(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("yes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", NotifyChkBx);
			NotifyChkBx.click();
		} else {

		}
	}
	
	@FindBy(xpath ="//*[@id='textvideolinkJudge']")
	public WebElement judgeVideoLinkTxtBx;
	
	@FindBy(xpath ="//*[@id='textJudgeFreTickets']")
	public WebElement judgeNoofFreeTicketsTxtBx;
	
	@FindBy(xpath ="//*[@id='txtDescriptionJudge']")
	public WebElement judgeDescriptionTxtBx;
	
	@FindBy(xpath ="//*[@id='btnSaveSpeaker']")
	public WebElement judgeSaveBtn;

	@FindBy(xpath ="//*[@id='myModalNewjudge']/a")
	public WebElement judgecloselnk;
	
	@FindBy(xpath ="//*[@id='btnSaveChallenge']")
	public WebElement ChallengeSaveBtn;
	
	@FindBy(xpath ="//*[@id='TicketChallegesDiv']/div/div[1]/div")
	public WebElement ChallengeDrpDwn;
	
	@FindBy(xpath ="//*[@id='TicketChallegesDiv']/div/div[2]/div[1]/input")
	public WebElement ChallengeSearchBx;
	
	@FindBy(xpath ="//*[@id='TicketChallegesDiv']/div/div[2]/div[2]/div/span")
	public WebElement ChallengeChkBx;
	
	//
	
	public void ChallengeDrpDwn(String value) throws Exception {
		ChallengeDrpDwn.click();
		Thread.sleep(2000);
		String strMain = value;
		String[] arrSplit = strMain.split(",");
		for (int i = 0; i < arrSplit.length; i++) {
			ChallengeSearchBx.sendKeys(arrSplit[i].trim());
			Thread.sleep(2000);
			ChallengeChkBx.click();
			Thread.sleep(2000);
			
			ChallengeDrpDwn.click();
			
			
		}
	}
	

	// Event Tickets

	@FindBy(xpath = "//*[@id='txtFromDateTime']")
	public WebElement SalesStartDateTxtBx;

	@FindBy(xpath = "//*[@id='txtToDateTime']")
	public WebElement SalesEndDateTxtBx;

	@FindBy(xpath = "//*[@id='ticketsorder']")
	public WebElement TicketsAllowPerOrderTxtBx;

	@FindBy(xpath = "//*[@id='ticketsdiv']/div[1]/div/div[2]/div/div[1]/div/label/label/div/i")
	public WebElement AllAttendeesRegisterChkBx;

	@FindBy(xpath = "//*[@id='feedropdown']")
	public WebElement TransactionChargesDrp;

	public void TransactionChargesDrpDwn(String value) {
		Select select = new Select(TransactionChargesDrp);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='TopicBoothsDiv']/div/i")
	public WebElement LandingPageUrl;

	@FindBy(xpath = "//*[@id='textlandingpage']")
	public WebElement LandingPageUrlTxtBx;

	@FindBy(xpath = "//*[@id='checkIndividualWeightageDiv']/i[2]")
	public WebElement NoRefundChkBx;
	
	@FindBy(xpath = "//*[@id='checkEqualWeightageDiv']/i[2]")
	public WebElement RefundWithConditionChkBx;

	public void RefundRadioBtn(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("No refund")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", NoRefundChkBx);
			NoRefundChkBx.click();
		} else if (value.equalsIgnoreCase("Refund")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", RefundWithConditionChkBx);
			RefundWithConditionChkBx.click();
		}
	}

	@FindBy(xpath = "//*[@id='txtCancellationPolicy']")
	public WebElement CancellationPolicyTxtBx;

	@FindBy(xpath = "//*[@id='selectrefund']")
	public WebElement RefundTypeDrpDwn;

	public void selectRefundTypeDrpDwn(String value) {
		Select select = new Select(RefundTypeDrpDwn);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='refundbeforedays']")
	public WebElement RefundTypeTxtBx;

	@FindBy(xpath = "//*[@id='refundvalue']")
	public WebElement EventStartDateTxtBx;

	@FindBy(xpath = "//*[@id='addnewrefund']")
	public WebElement EventAddBtn;

	@FindBy(xpath = "/html/body/div[3]/div[7]/form/div/div[4]/div[4]/div[3]/div[2]/div")
	public WebElement EventAddTicketsBtn;

	@FindBy(xpath = "//*[@id='textticketname1']")
	public WebElement EventTicketNameTxtBx;

	@FindBy(xpath = "//*[@id='textticketquantity1']")
	public WebElement QuantityTxtBx;

	@FindBy(xpath = "//*[@id='ddlTicketCurrency']")
	public WebElement PriceDrpDwn;

	public void EventselectPriceDrpDwn(String value) {
		Select select = new Select(PriceDrpDwn);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='textticketprice1']")
	public WebElement PriceTxtBx;

	@FindBy(xpath = "//*[@id='TicketSessionTypeDiv']/div/div[1]/div")
	public WebElement TicketsSessionTypeDrp;

	@FindBy(xpath = "//*[@id='TicketSessionTypeDiv']/div/div/div[2]/div[1]/input")
	public WebElement SessionSearchBx;

	@FindBy(xpath = "//*[@id='TicketSessionTypeDiv']/div/div/div[2]/div[2]/div/span[not(contains(@class, 'hidden'))]")
	public WebElement SessionChkBx;

	public void EventSessionTypeDrpDwn(String value) throws Exception {

		TicketsSessionTypeDrp.click();
		Thread.sleep(2000);
		String strMain = value;
		String[] arrSplit = strMain.split(",");
		for (int i = 0; i < arrSplit.length; i++) {
			SessionSearchBx.sendKeys(arrSplit[i].trim());
			SessionChkBx.click();
			TicketsSessionTypeDrp.click();
			Thread.sleep(2000);

		}
	}

	@FindBy(xpath = "//*[@id='TicketSessionTypeDiv']/div/div[2]/div[2]/div[1]")
	public WebElement AddnewBtn;
	
	@FindBy(xpath = "/html/body/div[3]/div[7]/div[22]/div/div/div[2]/form/fieldset/section/div/div/label/input")
	public WebElement AddnewTxtBx;
	
	@FindBy(xpath = "/html/body/div[3]/div[7]/div[22]/div/div/div[2]/form/footer/button[2]")
	public WebElement AddnewTxtBtn;

	@FindBy(xpath = "//*[@id='txttopictype']")
	public WebElement SessionTypeTxtBx;

	@FindBy(xpath = "//*[@id='Adddesignation']")
	public WebElement SessionTypeAddBtn;

	@FindBy(xpath = "//*[@id='ddlticketregistaionform']")
	public WebElement AteendeeRegistrationFormDrpDwn;

	public void selectAteendeeRegistrationFormDrpDwn(String value) {
		Select select = new Select(AteendeeRegistrationFormDrpDwn);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='MultipleDiv']/div/div/div[6]/div/div[2]/div[3]/div[2]")
	public WebElement Description;

	@FindBy(xpath = "//*[@id='addnewtickets']")
	public WebElement AddticketsBtn;

	@FindBy(xpath = "//*[@id='savecancel2']/div")
	public WebElement SaveandPublishBtn;
	
	@FindBy(xpath = "//*[@id='tab3']/div[4]/div[1]/div/button[2]")
	public WebElement NextDrpDwnarrow;
	
	@FindBy(xpath = "//*[@id='tab3']/div[4]/div[1]/div/ul")
	public WebElement SkipandPublishBtn;

	// event publish without tickets

	@FindBy(xpath = "//*[@id='savecancel2']/div/button[2]")
	public WebElement TicketsSaveandPublishDrpBtn;

	@FindBy(xpath = "//*[@id='btnSkipTicketsAndNext1']")
	public WebElement TicketsSaveandNextPublishBtn;

	@FindBy(xpath = "//*[@id='divactionsquestionnaire']/button")
	public WebElement PublishDrpDwn;

	@FindBy(xpath = "//*[@id='divactionsquestionnaire']/ul/li[3]/a")
	public WebElement PublishBtn;

	@FindBy(xpath = "//*[@id='PublishEventModal']/div/div/div[3]/button[2]")
	public WebElement PublishProcessBtn;
	
	
	@FindBy(xpath = "//*[@id='btnsaveTopics']")
	public WebElement SponsorAgendaPageSaveBtn;
	
	
	// event view tabs
	
	@FindBy(xpath = "//*[@id='etopic']")
	public WebElement AgendaManagementTab;
	
	@FindBy(xpath = "//*[@id='echallenge']")
	public WebElement ChallengeTab;
	
	@FindBy(xpath = "//*[@id='eticket']")
	public WebElement TicketsTab;
	
	
	@FindBy(xpath = "//*[@id='livechat']")
	public WebElement LiveTab;
	
	@FindBy(xpath = "//*[@id='shareeventtoemail']")
	public WebElement EmailTab;
	
	@FindBy(xpath = "//*[@id='textshareEmailIds']")
	public WebElement EmailTxtBxTab;
	
	@FindBy(xpath = "//*[@id='showccbccDiv']/a")
	public WebElement CCBCCLnk;
	
	@FindBy(xpath = "//*[@id='textshareCC']")
	public WebElement CCTxtBx;
	
	@FindBy(xpath = "//*[@id='textshareBCC']")
	public WebElement BCCTxtBx;
	
	@FindBy(xpath = "//*[@id='Email']/div[1]/div/div[2]/div/div[5]/div/label/label/div/i")
	public WebElement SendlaterChkBx;
	
	@FindBy(xpath = "//*[@id='SendlatterTextbox']/div/div/input")
	public WebElement ScheduleDateTxtBx;
	
	@FindBy(xpath = "//*[@id='Divsendbutton']/div/button")
	public WebElement SendBtn;
	
	@FindBy(xpath = "//*[@id='TicketsOrder']/a")
	public WebElement TicketOrderTab;
	
	@FindBy(xpath = "//*[@id='AttendeesLi']/a")
	public WebElement AttendeesTab;
	
	@FindBy(xpath = "//*[@id='activepoint']")
	public WebElement ActivityPointsConfiTab;
	
	@FindBy(xpath = "//*[@id='copyButton']")
	public WebElement CopyURLlnk;
	
	@FindBy(xpath ="//*[@id='eventurlvisit']")
	public WebElement VisitEventLnk;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	// WebElements for Create Quiz Page

	@FindBy(xpath = "//*[@id='divdocumentedit']/input[1]")
	public WebElement QuizImage;

	@FindBy(xpath = "//*[@id='btnCrop']")
	public WebElement QuizImageCrop;

	@FindBy(xpath = "//*[@id='selectsurveytemplate']")
	public WebElement SelectTemplate;

	@FindBy(xpath = "//*[@id='selectcategory']")
	public WebElement QuizDurationType;

	public void QuizDurationTypeDrpDwn(String value) {
		Select select = new Select(QuizDurationType);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='addnewquestionnaire']/div[2]/div/div[3]/div/div/div[1]/div")
	public WebElement LanguagesBx;

	@FindBy(xpath = "//*[@id='addnewquestionnaire']/div[2]/div/div[3]/div/div/div[2]/div[1]/input")
	public WebElement LanguagesSearchBx;

	@FindBy(xpath = "//*[@id='addnewquestionnaire']/div[2]/div/div[3]/div/div/div[2]/div[2]/div[not(contains(@class, 'hidden'))]/span")
	public WebElement LanguagesCheckBx;

	public void QuizLanguagesDrpDwn(String value) throws Exception {
		LanguagesBx.click();
		Thread.sleep(2000);
		String strMain = value;
		String[] arrSplit = strMain.split(",");
		for (int i = 0; i < arrSplit.length; i++) {
			LanguagesSearchBx.sendKeys(arrSplit[i].trim());
			LanguagesCheckBx.click();
			Thread.sleep(2000);
			// eventSearch.clear();
		}
	}

	@FindBy(xpath = "//*[@id='textquestionariename']")
	public WebElement QuizName;

	@FindBy(xpath = "//*[@id='textdescription']")
	public WebElement QuizDescription;
	
	@FindBy(xpath = "//*[@id='textExpiresIn']")
	public WebElement QuizWithoutExpireDays;

	@FindBy(xpath = "//*[@id='addnewquestionnaire']/div[3]/div/div[1]/div/label/label/div/i")
	public WebElement SaveTemplateChk;

	public void SaveTemplateChkBx(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("yes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", SaveTemplateChk);
			SaveTemplateChk.click();
		} else {

		}
	}

	@FindBy(xpath = "//*[@id='texttemplatename']")
	public WebElement SaveTemplateTxtBx;

	@FindBy(xpath = "//*[@id='addnewquestionnaire']/div[3]/div/div[2]/div[1]/label/label/div/i")
	public WebElement SetLandingurlChk;

	public void SetLandingurlChkBx(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("yes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", SetLandingurlChk);
			SetLandingurlChk.click();
		} else {

		}
	}

	@FindBy(xpath = "//*[@id='textlandingpage']")
	public WebElement SetLandingurlTxtBx;

	@FindBy(xpath = "//*[@id='addnewquestionnaire']/div[3]/div/div[2]/div[2]/label/label/div/i")
	public WebElement AutoEvaluationChk;

	public void AutoEvaluationChkBx(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("yes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", AutoEvaluationChk);
			AutoEvaluationChk.click();
		} else {

		}
	}

	@FindBy(xpath = "//*[@id='TotalQuizdurationDiv']/i[2]")
	public WebElement TotalQuizDurationRadioBtn;

	@FindBy(xpath = "//*[@id='checkEqualDuration']/i[1]")
	public WebElement EqualDurationQuestionsRadioBtn;

	@FindBy(xpath = "//*[@id='checkIndividualDuration']/i[1]")
	public WebElement IndividualQuestionRadioBtn;

	public void QuizDuration(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("Total")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", TotalQuizDurationRadioBtn);
			TotalQuizDurationRadioBtn.click();
		} else if (value.equalsIgnoreCase("Equal")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", EqualDurationQuestionsRadioBtn);
			EqualDurationQuestionsRadioBtn.click();
		} else if (value.equalsIgnoreCase("Individual")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", IndividualQuestionRadioBtn);
			IndividualQuestionRadioBtn.click();
		}
	}

	@FindBy(xpath = "//*[@id='textTotalDuration']")
	public WebElement TotalDurationTxtBx;
	
	@FindBy(xpath = "//*[@id='textindivudDuration']")
	public WebElement IndividualDurationTxtBx;

	@FindBy(xpath = "//*[@id='textEqualDurationsec']")
	public WebElement EqualDurationTxtBx;

	@FindBy(xpath = "//*[@id='checkgeneralquizdiv']/i[2]")
	public WebElement GeneralQuizRadioBtn;

	@FindBy(xpath = "//*[@id='checkfortriviaquizdiv']/i[1]")
	public WebElement TriviaRadioBtn;

	public void GeneralQuizAndTrivia(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("General Quiz")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", GeneralQuizRadioBtn);
			GeneralQuizRadioBtn.click();
		} else if (value.equalsIgnoreCase("Trivia")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", TriviaRadioBtn);
			TriviaRadioBtn.click();
		}
	}

	@FindBy(xpath = "//*[@id='checkEqualWeightageDiv']/i[2]")
	public WebElement EqualWeightageRadioBtn;

	@FindBy(xpath = "//*[@id='checkIndividualWeightageDiv']/i[1]")
	public WebElement IndividualWeightageRadioBtn;

	public void weightageRadioBtn(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("Equal")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", EqualWeightageRadioBtn);
			EqualWeightageRadioBtn.click();
		} else if (value.equalsIgnoreCase("Individual")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", IndividualWeightageRadioBtn);
			IndividualWeightageRadioBtn.click();
		}
	}

	@FindBy(xpath = "//*[@id='textEqualWeightageScore']")
	public WebElement EqualWeightageTxtBx;

	@FindBy(xpath = "//*[@id='nextQuizQuestionsid']")
	public WebElement NextQuizDetailBtn;

	@FindBy(xpath = "//*[@id='nextQuizQuestionsid']")
	public WebElement TriviaNextQuizDetailBtn;

	@FindBy(xpath = "//*[@id='nextQuizLogicid']")
	public WebElement TriviasaveQuestionsBtn;
	
	@FindBy(xpath = "//*[@id='savequestionaire']")
	public WebElement TriviasaveQuestionsSaveAndDraftBtn;
	
	@FindBy(xpath = "//*[@id='QuizQuestionstab']/div/div[5]/div[1]/div[1]/button[2]")
	public WebElement TriviasaveQuestionsSaveAndDraftDrpBtn;
	
	@FindBy(xpath = "//*[@id='QuizQuestionstab']/div/div[5]/div[1]/div[1]/ul/li/a")
	public WebElement TriviasaveQuestionsSaveAndPublishBtn;

	@FindBy(xpath = "//*[@id='selectQuestionGroups']")
	public WebElement addSavedQuestionsDrp;

	public void QuizQuestionDropDwn(String value) {
		Select select = new Select(addSavedQuestionsDrp);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='ulallquestions']/li[1]/div/h2")
	public WebElement q1Drp;

	@FindBy(xpath = "//*[@id='ulallquestions']/li[2]/div/h2")
	public WebElement q2Drp;

	@FindBy(xpath = "//*[@id='ulallquestions']/li[4]/div/h2")
	public WebElement q3Drp;

	@FindBy(xpath = "//*[@id='ulallquestions']/li[5]/div/h2")
	public WebElement q4Drp;

	@FindBy(xpath = "//*[@id='divexistingquestions']/div[3]/a[3]")
	public WebElement questionDoneClk;

	@FindBy(xpath = "//*[@id='nextQuizLogicid']")
	public WebElement QuizSaveandNextBtn;

	// Quiz Triva page

	@FindBy(xpath = "//*[@id='textquestionariename']")
	public WebElement QuizNameTxtBx;

	@FindBy(xpath = "//*[@id='textdescription']")
	public WebElement QuizTrivaDescriptionTxtBx;

	@FindBy(xpath = "//*[@id='textEqualDurationsec']")
	public WebElement TrivaEqualDurationTxtBx;

	@FindBy(xpath = "//*[@id='textEqualWeightageScore']")
	public WebElement TrivaEqualWeightageTxtBx;

	@FindBy(xpath = "//*[@id='textEqualNegativeWeightageScore']")
	public WebElement NegativeWeightageTxtBx;

	@FindBy(xpath = "//*[@id='addnewquestionnaire']/div[3]/div/div[1]/div/label/label/div")
	public WebElement SaveasTemplateRdbtn;

	@FindBy(xpath = "//*[@id='texttemplatename']")
	public WebElement SaveasTemplateTxtBx;

	@FindBy(xpath = "//*[@id='addnewquestionnaire']/div[3]/div/div[2]/div[1]/label/label/div/i")
	public WebElement LandingpageURLRdBtn;

	@FindBy(xpath = "//*[@id='textlandingpage']")
	public WebElement LandingpageURLTxtBx;

	@FindBy(xpath = "//*[@id='nextQuizQuestionsid']")
	public WebElement QuizDetailNextBtn;

	@FindBy(xpath = "//*[@id='addexistingquestions']")
	public WebElement SavedQuestionBtn;

	@FindBy(xpath = "//*[@id='selectQuestionGroups']")
	public WebElement SelectquestiongroupLnk;

	@FindBy(xpath = "//*[@id='divexistingquestions']/div[3]/a[2]")
	public WebElement SelectallBtn;

	@FindBy(xpath = "//*[@id='divexistingquestions']/div[3]/a[3]")
	public WebElement DoneBtn;

	@FindBy(xpath = "//*[@id='savecancel']/a[2]")
	public WebElement QuizQuestionSaveandNextBtn;

	@FindBy(xpath = "//*[@id='nextPreviewAndCustomizeid']")
	public WebElement QuestionlogicNextBtn;

	@FindBy(xpath = "//*[@id='nextPreviewAndCustomizeid']")
	public WebElement QuestionlogicNextBtnTrivia;
	
	@FindBy(xpath = "//*[@id='savecancel']/div[2]/button[1]")
	public WebElement PreviewPageSaveandNextBtn;
	
	@FindBy(xpath = "//*[@id='PreviewAndCustomizetab']/div[3]/div[1]/div[1]/button[1]")
	public WebElement TriviaPreviewPageSkipAndNextBtn;
	
	@FindBy(xpath = "//*[@id='savecancel']/div[2]/button[2]")
	public WebElement TriviaPreviewAndCustomizeSaveDrpBtn;
	
	@FindBy(xpath = "//*[@id='savecancel']/div[2]/ul/li/a")
	public WebElement TriviaPreviewAndCustomizeSaveAndPublish;
	
	@FindBy(xpath = "//*[@id='PreviewAndCustomizetab']/div[3]/div[1]/div[1]/button[2]")
	public WebElement TriviaPreviewAndCustomizeSkipDrpBtn;
	
	@FindBy(xpath = "//*[@id='PreviewAndCustomizetab']/div[3]/div[1]/div[1]/ul/li/a")
	public WebElement TriviaPreviewAndCustomizeSkipAndPublish;

	@FindBy(xpath = "//*[@id='btnAddrewards2']")
	public WebElement AddCriteriaBtn;

	// single winner

	@FindBy(xpath = "//*[@id='singlecriterianame']")
	public WebElement CriteriaNameTxtBx;

	@FindBy(xpath = "//*[@id='inputdelivertdate']")
	public WebElement DeliveryDateTxtBx;

	@FindBy(xpath = "//*[@id='singleselectdate']")
	public WebElement WinnerselectionDateTxtBx;

	@FindBy(xpath = "//*[@id='selectselectiontype']")
	public WebElement SelectionSingleWinner;

	public void SelectionSingleWinnerDrpDwn(String value) {
		Select select = new Select(SelectionSingleWinner);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='singlestartdate']")
	public WebElement StartDateTxtBx;

	@FindBy(xpath = "//*[@id='singleenddate']")
	public WebElement EndDateTxtBx;

	@FindBy(xpath = "//*[@id='addrewarsds']")
	public WebElement AddRewardsLnk;
	
	@FindBy(xpath = "//*[@id='addrewarsds']")
	public WebElement AddRewardsLnkEvaluator;

	@FindBy(xpath = "//*[@id='cashrewardtitle']")
	public WebElement CashTitleTxtBx;

	@FindBy(xpath = "//*[@id='cashcurrency']")
	public WebElement CashCurrency;

	public void CashCurrencyDrpDwn(String value) {
		Select select = new Select(CashCurrency);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='cashrewardawardamount']")
	public WebElement CashrewardamountTxtBx;

	@FindBy(xpath = "//*[@id='cashrewarddescription']")
	public WebElement QuizCashDescription;

	@FindBy(xpath = "//*[@id='casemode']/div/div/a[2]")
	public WebElement QuizAddBtn;

	@FindBy(xpath = "//*[@id='btnsavecriteria']")
	public WebElement SaveCriteriaBtn;

	@FindBy(xpath = "//*[@id='saverewardspublishbutton']")
	public WebElement QuizSingleSaveandPublishBtn;

	
	@FindBy(xpath = "//*[@id='settings']/div[2]/div[1]/div[1]/button[1]")
	public WebElement TriviaRewardsSaveAndPublish;
	
	@FindBy(xpath = "//*[@id='settings']/div[2]/div[1]/div[1]/button[2]")
	public WebElement TriviaRewardsSkipDrpBtn;
	
	@FindBy(xpath = "//*[@id='settings']/div[2]/div[1]/div[1]/ul/li/a")
	public WebElement TriviaRewardsSkipAndPublish;
	
	// Creating a Questions logic page

	@FindBy(xpath = "//*[@id='nextPreviewAndCustomizeid']")
	public WebElement questionLogicNextBtn;

	@FindBy(xpath = "//*[@id='savecancel']/div[2]/button[2]/span[1]")
	public WebElement QuizPreviewdropbutton;

	@FindBy(xpath = "//*[@id='savecancel']/div[2]/ul/li/a")
	public WebElement QuizPreviewdPublish;

	// Creating a Questions Preview & Customize page

	@FindBy(xpath = "//*[@id='savecancel']/div[2]/button[1]")
	public WebElement QuizPreviewAndCustomizeNextBtn;

	@FindBy(xpath = "//*[@id='savecancel']/div/button[2]/span[2]")
	public WebElement RewardsSkip;

	@FindBy(xpath = "//*[@id='skiprewardssavebutton']")
	public WebElement RewardSkipAndPublish;

	// Task Page

	@FindBy(xpath = "//*[@id='ulmenu']/li[5]/a/span")
	public WebElement TaskTab;

	@FindBy(xpath = "//*[@id='ulsubmenu']/li[2]/a/span")
	public WebElement CreateTask;
	
	@FindBy(xpath = "//*[@id='ddltaskgroup']/option[1]")
	public WebElement ProjectNameAddNewBtn;
	
	@FindBy(xpath = "//*[@id='txtNewTask']")
	public WebElement ProjectNameTextBx;
	
	@FindBy(xpath = "//*[@id='ClidiemUser-form']/footer/button[2]")
	public WebElement ProjectNameAddBtn;
	

	@FindBy(xpath = "//*[@id='taskdet']/div/div/div[1]/div[1]/div[1]/select")
	public WebElement TaskProject;

	public void TaskProjectDrp(String value) {
		Select select = new Select(TaskProject);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='taskdet']/div/div/div[1]/div[2]/div/input")
	public WebElement TaskNameTxtBx;

	@FindBy(xpath = "//*[@id='ddlselecttaskfor']")
	public WebElement TaskAssigntoDrp;

	public void selectTaskAssigntoDrp(String value) {
		Select select = new Select(TaskAssigntoDrp);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='Divmultiselectdrop']/div/div[1]/span")
	public WebElement ParticipantsTxtBx;
	
	@FindBy(xpath = "//*[@id='Divmultiselectdrop']/div/div[2]/div[1]/input")
	public WebElement ParticipantsSearchBx;
	
	@FindBy(xpath = "//*[@id='Divmultiselectdrop']/div/div[2]/div[2]/div[not(contains(@class, 'hidden'))]/span/i")
	public WebElement ParticipantsCheckBx;
	
	
	public void ParticipantsDrpDwn(String value) throws Exception {
		ParticipantsTxtBx.click();
		Thread.sleep(2000);
		String strMain = value;
		    String[] arrSplit = strMain.split(",");
		    for (int i=0; i < arrSplit.length; i++)
		    {
		    	ParticipantsSearchBx.sendKeys(arrSplit[i].trim());
		    	ParticipantsCheckBx.click();
		    	Thread.sleep(2000);
		    //	eventSearch.clear();
		    	// Thread.sleep(4000);
		    			     }
			}

	

	@FindBy(xpath = "//*[@id='selectObserversdiv']/div/div[1]/span")
	public WebElement ObserversTxtBx;
	
	@FindBy(xpath = "//*[@id='selectObserversdiv']/div/div[2]/div[1]/input")
	public WebElement ObserversSearchBx;
	
	@FindBy(xpath = "//*[@id='selectObserversdiv']/div/div[2]/div[not(contains(@class, 'hidden'))]/div/span/i")
	public WebElement ObserversCheckBx;
	
	
	public void ObserversDrpDwn(String value) throws Exception {
		ObserversTxtBx.click();
		Thread.sleep(2000);
		String strMain = value;
		    String[] arrSplit = strMain.split(",");
		    for (int i=0; i < arrSplit.length; i++)
		    {
		    	ObserversSearchBx.sendKeys(arrSplit[i].trim());
		    	ObserversCheckBx.click();
		    	Thread.sleep(2000);
		    //	eventSearch.clear();
		    	// Thread.sleep(4000);
		    			     }
			}

	@FindBy(xpath = "//*[@id='ddlselectpriority']")
	public WebElement PriorityDrp;

	public void selectPriorityDrp(String value) {
		Select select = new Select(PriorityDrp);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='selecttaskstatus']")
	public WebElement StatusDrp;

	public void selectStatusDrp(String value) {
		Select select = new Select(StatusDrp);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='taskdet']/div/div/div[1]/div[8]/div/input")
	public WebElement SubTaskDrp;

	@FindBy(xpath = "//*[@id='taskdet']/div/div/div[1]/div[9]/div/span/span[1]/span")
	public WebElement LeadownerTxtBx;

	@FindBy(xpath = "//*[@id='selecttasktys']")
	public WebElement TaskTyprDrp;

	public void selectTaskTyprDrp(String value) {
		Select select = new Select(TaskTyprDrp);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='taskdet']/div/div/div[2]/div/div/div[2]/div[3]/div[2]")
	public WebElement TaskDescription;
	
	@FindBy(xpath ="//*[@id='checkdatediv']/i[1]")
	public WebElement TaskDateChkBx;
	
	@FindBy(xpath ="//*[@id='checknumberofdaysdiv']/i[1]")
	public WebElement TaskNoofDaysChkBx;

	@FindBy(xpath = "//*[@id='txtStartDate']")
	public WebElement StartDate;

	@FindBy(xpath = "//*[@id='txtEndDate']")
	public WebElement EndDate;
	
	@FindBy(xpath ="//*[@id='textenddays']")
	public WebElement EndDays;

	@FindBy(xpath = "//*[@id='taskdet']/div/div/div[3]/div[3]/div/label/span")
	public WebElement AddSkipDays;

	@FindBy(xpath ="//*[@id='skip']/label[2]/label/div")
	public WebElement SundayChkBx;
	
	@FindBy(xpath ="//*[@id='skip']/label[3]/label/div")
	public WebElement MondayChkBx;
	
	@FindBy(xpath ="//*[@id='skip']/label[4]/label/div")
	public WebElement TuesdayChkBx;
	
	@FindBy(xpath ="//*[@id='skip']/label[5]/label/div")
	public WebElement WednesdayChkBx;
	
	@FindBy(xpath ="//*[@id='skip']/label[6]/label/div")
	public WebElement ThursdayChkBx;
	
	@FindBy(xpath ="//*[@id='skip']/label[7]/label/div")
	public WebElement FridayChkBx;
	
	@FindBy(xpath ="//*[@id='skip']/label[8]/label/div")
	public WebElement SaturdayChkBx;
	
	@FindBy(xpath = "//*[@id='texttasktime1']")
	public WebElement ReminderTxtBx1;

	@FindBy(xpath = "//*[@id='ddlremindersession1']")
	public WebElement SelectDurationDrp1;

	public void selectSelectDurationDrp1(String value) {
		Select select = new Select(SelectDurationDrp1);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='ddlreminderset1']")
	public WebElement SelectScheduleDrp1;

	public void selectSelectScheduleDrp1(String value) {
		Select select = new Select(SelectScheduleDrp1);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='aaddsinglereminder']/i")
	public WebElement PlusBtn;

	@FindBy(xpath = "//*[@id='texttasktime2']")
	public WebElement ReminderTxtBx2;

	@FindBy(xpath = "//*[@id='ddlremindersession2']")
	public WebElement SelectDurationDrp2;

	public void selectSelectDurationDrp2(String value) {
		Select select = new Select(SelectDurationDrp2);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='ddlreminderset2']")
	public WebElement SelectScheduleDrp2;

	public void selectSelectScheduleDrp2(String value) {
		Select select = new Select(SelectScheduleDrp2);
		select.selectByVisibleText(value);
	}
	
	@FindBy(xpath = "//*[@id='texttasktime3']")
	public WebElement ReminderTxtBx3;

	@FindBy(xpath = "//*[@id='ddlremindersession3']")
	public WebElement SelectDurationDrp3;

	public void selectSelectDurationDrp3(String value) {
		Select select = new Select(SelectDurationDrp3);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='ddlreminderset3']")
	public WebElement SelectScheduleDrp3;

	public void selectSelectScheduleDrp3(String value) {
		Select select = new Select(SelectScheduleDrp3);
		select.selectByVisibleText(value);
	}
	
	@FindBy(xpath = "//*[@id='texttasktime4']")
	public WebElement ReminderTxtBx4;

	@FindBy(xpath = "//*[@id='ddlremindersession4']")
	public WebElement SelectDurationDrp4;

	public void selectSelectDurationDrp4(String value) {
		Select select = new Select(SelectDurationDrp4);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='ddlreminderset4']")
	public WebElement SelectScheduleDrp4;

	public void selectSelectScheduleDrp4(String value) {
		Select select = new Select(SelectScheduleDrp4);
		select.selectByVisibleText(value);
	}
	
	@FindBy(xpath = "//*[@id='texttasktime5']")
	public WebElement ReminderTxtBx5;

	@FindBy(xpath = "//*[@id='ddlremindersession5']")
	public WebElement SelectDurationDrp5;

	public void selectSelectDurationDrp5(String value) {
		Select select = new Select(SelectDurationDrp5);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='ddlreminderset5']")
	public WebElement SelectScheduleDrp5;

	public void selectSelectScheduleDrp5(String value) {
		Select select = new Select(SelectScheduleDrp4);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='taskdet']/div/div/div[3]/div[5]/div/div/label/label/div/i")
	public WebElement VisibleChkBx;

	@FindBy(xpath = "//*[@id='divAttachment']/div[1]/input")
	public WebElement AttachmentInput;

	@FindBy(xpath = "//*[@id='divAttachment']/div[1]/span")
	public WebElement AttachmentClick;

	@FindBy(xpath = "//*[@id='taskdet']/div/div/a[1]")
	public WebElement TaskSaveBtn;

	@FindBy(xpath = "//*[@id='taskdet']/div/div/a[2]")
	public WebElement SaveandNewBtn;

	@FindBy(xpath = "//*[@id='taskdet']/div/div/a[3]")
	public WebElement ResetBtn;

	// WebElements for Email Marketing Page

	@FindBy(xpath = "//*[@id='main']/div/div[1]/div/div[2]/a")
	public WebElement AddCredits;

	@FindBy(xpath = "//*[@id='addcreditstxt']")
	public WebElement AmountTxtBx;

	@FindBy(xpath = "//*[@id='AddSpeakOrSpon']")
	public WebElement AddBtn;

	@FindBy(xpath = "//*[@id='main']/div/div[2]/div/div[3]/div[1]/div[1]/div/div[2]/div[1]/div[1]/div/label[2]/label/div/i")
	public WebElement SendtoNonRespondsRDBtn;

	@FindBy(xpath = "//*[@id='Divshowtemplates']/label/label/div/i")
	public WebElement MessageTmpRDBtn;

	@FindBy(xpath = "//*[@id='TemplateNameId']")
	public WebElement Entertemplate;

	@FindBy(xpath = "//*[@id='ddlEmailType']")
	public WebElement SubscriptionTypeDrp;

	public void selectSubscriptionTypeDrp(String value) {
		Select select = new Select(SubscriptionTypeDrp);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='emailcontacts']/span/div/div[1]")
	public WebElement contactsDrpdwn;

	@FindBy(xpath = "//*[@id='emailcontacts']/span/div/div[2]/div[1]/input")
	public WebElement contactsSearch;

	@FindBy(xpath = "//*[@id='emailcontacts']/span/div/div[2]/div[2]/div[not(contains(@class, 'hidden'))]/span")
	public WebElement ContactsChkBx;

	public void selectcontactsDrpdwn(String value) throws Exception {
		contactsDrpdwn.click();
		Thread.sleep(2000);
		contactsSearch.sendKeys(value);
		Thread.sleep(5000);
		ContactsChkBx.click();
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//*[@id='ddlTemplates']")
	public WebElement Messagetemp;

	@FindBy(xpath = "//*[@id='main']/div/div[2]/div/div[3]/div[1]/div[1]/div/div[6]/div/label/label/div/i")
	public WebElement emailChkBx;

	@FindBy(xpath = "//*[@id='ToEmail']")
	public WebElement EmailTo;

	@FindBy(xpath = "//*[@id='main']/div/div[2]/div/div[3]/div[1]/div[1]/div/div[7]/div/label/label/div/i")
	public WebElement sendLaterChkBx;

	@FindBy(xpath = "//*[@id='txtEndDate']")
	public WebElement DateTxtBx;

	@FindBy(xpath = "//*[@id='buttonshowccbcc']")
	public WebElement Ccbcc;

	@FindBy(xpath = "//*[@id='textshareCC']")
	public WebElement CC;

	@FindBy(xpath = "//*[@id='textshareBCC']")
	public WebElement Bcc;

	@FindBy(xpath = "//*[@id='textsubject_sharesurvey']")
	public WebElement Subject;

	@FindBy(xpath = "//*[@id='divconfirm']/div/div/div[3]/div[3]/div[2]")
	public WebElement Msg;

	@FindBy(xpath = "//*[@id='ul111']/li[1]")
	public WebElement CurrentDateandtime;

	@FindBy(xpath = "//*[@id='ul111']/li[2]")
	public WebElement CurrentDate;

	@FindBy(xpath = "//*[@id='ul3']/li[1]")
	public WebElement ReceiverName;

	@FindBy(xpath = "//*[@id='ul3']/li[1]")
	public WebElement ReceiverJob;

	@FindBy(xpath = "//*[@id='ul3']/li[1]")
	public WebElement ReceiverEmailID;

	@FindBy(xpath = "//*[@id='ul3']/li[1]")
	public WebElement ReceiverContactNumber;

	@FindBy(xpath = "//*[@id='ul3']/li[1]")
	public WebElement ReceiverContactGroup;

	@FindBy(xpath = "//*[@id='ul3']/li[1]")
	public WebElement ReceiverCompanyName;

	@FindBy(xpath = "//*[@id='ul3']/li[1]")
	public WebElement ReceiverAddress;

	@FindBy(xpath = "//*[@id='ul2']/li[1]")
	public WebElement TwitterUrl;

	@FindBy(xpath = "//*[@id='ul2']/li[2]")
	public WebElement RegisteredAddress;

	@FindBy(xpath = "//*[@id='ul2']/li[3]")
	public WebElement ParentCompany;

	@FindBy(xpath = "//*[@id='ul2']/li[4]")
	public WebElement OrganizationWebsite;

	@FindBy(xpath = "//*[@id='ul2']/li[5]")
	public WebElement OrganizationEmailID;

	@FindBy(xpath = "//*[@id='ul2']/li[6]")
	public WebElement OrganizationContactNumber;

	@FindBy(xpath = "//*[@id='ul2']/li[7]")
	public WebElement LinkedinUrl;

	@FindBy(xpath = "//*[@id='ul2']/li[8]")
	public WebElement LegalName;

	@FindBy(xpath = "//*[@id='ul2']/li[9]")
	public WebElement Google;

	@FindBy(xpath = "//*[@id='ul2']/li[10]")
	public WebElement FoundedYear;

	@FindBy(xpath = "//*[@id='ul2']/li[11]")
	public WebElement facebookURL;

	@FindBy(xpath = "//*[@id='//*[@id='My organization']")
	public WebElement CompanyType;

	@FindBy(xpath = "//*[@id='ul2']/li[13]")
	public WebElement BusinessStructure;

	@FindBy(xpath = "//*[@id='ul1']/li[1]")
	public WebElement MyRole;

	@FindBy(xpath = "//*[@id='ul1']/li[2]")
	public WebElement MyName;

	@FindBy(xpath = "//*[@id='ul1']/li[3]")
	public WebElement MyEmployeeID;

	@FindBy(xpath = "//*[@id='ul1']/li[4]")
	public WebElement MyEmailID;

	@FindBy(xpath = "//*[@id='ul1']/li[5]")
	public WebElement MyDesignation;

	@FindBy(xpath = "//*[@id='ul1']/li[6]")
	public WebElement MyContactNumber;

	@FindBy(xpath = "//*[@id='ul1']/li[7]")
	public WebElement MyAddress;

	@FindBy(xpath = "//*[@id='Divsendbutton']/div/button")
	public WebElement sendBtn;

	// select Other fields
	public void OtherFields(String data) throws Exception {
		CurrentDateandtime.click();
		Thread.sleep(2000);
	}

	// select Receiver fields
	public void Receiver(String data) throws Exception {
		ReceiverName.click();
		Thread.sleep(2000);
	}

	// select myorganization
	public void Myorganization(String data) throws Exception {
		TwitterUrl.click();
		Thread.sleep(2000);
	}

	// select myself fields
	public void MySelf(String data) throws Exception {
		MyRole.click();
		Thread.sleep(2000);
	}

	// Survey Question Type File Upload

	@FindBy(xpath = "//*[@id='mCSB_1_container']/div/ul/li[13]")
	public WebElement Fileupload;

	@FindBy(xpath = "//*[@id='textquestiontext']")
	public WebElement Filequestiontxt;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[3]/div/input")
	public WebElement Filetags;

	@FindBy(xpath = "//*[@id='ddlQuestionGroupsforaddquestion']")
	public WebElement Filequestiongroup;

	public void selectFilequestiongroup(String value) {
		Select select = new Select(Filequestiongroup);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='Textlabel']")
	public WebElement FileLabelText;

	@FindBy(xpath = "//*[@id='fileoptions']/label[1]/label/div/i")
	public WebElement FilePdfChkBx;

	@FindBy(xpath = "//*[@id='fileoptions']/label[2]/label/div/i")
	public WebElement FiledocChkBx;

	@FindBy(xpath = "//*[@id='fileoptions']/label[3]/label/div/i")
	public WebElement FiledocxChkBx;

	@FindBy(xpath = "//*[@id='fileoptions']/label[4]/label/div/i")
	public WebElement FileemlChkBx;

	@FindBy(xpath = "//*[@id='fileoptions']/label[5]/label/div/i")
	public WebElement FilegifChkBx;

	@FindBy(xpath = "//*[@id='fileoptions']/label[6]/label/div/i")
	public WebElement FilejpgChkBx;

	@FindBy(xpath = "//*[@id='fileoptions']/label[2]/label/div/i")
	public WebElement FilejpegChkBx;

	@FindBy(xpath = "//*[@id='fileoptions']/label[7]/label/div/i")
	public WebElement FilemsgChkBx;

	@FindBy(xpath = "//*[@id='fileoptions']/label[8]/label/div/i")
	public WebElement FiletxtChkBx;

	@FindBy(xpath = "//*[@id='fileoptions']/label[9]/label/div/i")
	public WebElement FiletifChkBx;

	@FindBy(xpath = "//*[@id='fileoptions']/label[10]/label/div/i")
	public WebElement FilexlsChkBx;

	@FindBy(xpath = "//*[@id='fileoptions']/label[11]/label/div/i")
	public WebElement FilexlsxChkBx;

	@FindBy(xpath = "//*[@id='fileoptions']/label[13]/label/div/i")
	public WebElement FilehtmChkBx;

	@FindBy(xpath = "//*[@id='fileoptions']/label[14]/label/div/i")
	public WebElement FilehtmlChkBx;

	@FindBy(xpath = "//*[@id='fileoptions']/label[15]/label/div/i")
	public WebElement FilepngChkBx;

	public void selectFileUpload(String value) throws Exception {
		Thread.sleep(2000);
		String strMain = value;
		String[] arrSplit = strMain.split(",");
		for (int i = 0; i < arrSplit.length; i++) {
			if (arrSplit[i].equals("pdf")) {
				FilePdfChkBx.click();
			} else if (arrSplit[i].equals("doc")) {
				FiledocChkBx.click();
			} else if (arrSplit[i].equals("docx")) {
				FiledocxChkBx.click();
			} else if (arrSplit[i].equals("eml")) {
				FileemlChkBx.click();
			} else if (arrSplit[i].equals("gif")) {
				FilegifChkBx.click();
			} else if (arrSplit[i].equals("jpg")) {
				FilejpgChkBx.click();
			} else if (arrSplit[i].equals("jpeg")) {
				FilejpegChkBx.click();
			} else if (arrSplit[i].equals("msgf")) {
				FilemsgChkBx.click();
			} else if (arrSplit[i].equals("txt")) {
				FiletxtChkBx.click();
			} else if (arrSplit[i].equals("tif")) {
				FiletifChkBx.click();
			} else if (arrSplit[i].equals("xls")) {
				FilexlsChkBx.click();
			} else if (arrSplit[i].equals("xlsx")) {
				FilexlsxChkBx.click();
			} else if (arrSplit[i].equals("htm")) {
				FilehtmChkBx.click();
			} else if (arrSplit[i].equals("html")) {
				FilehtmlChkBx.click();
			} else if (arrSplit[i].equals("png")) {
				FilepngChkBx.click();
			} else {
			}
		}
	}

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[11]/div/label/label/div/i")
	public WebElement Filemandatory;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[12]/div/label/label/div")
	public WebElement Fileallowcomments;
	
	@FindBy(xpath = "//*[@id='questiondiv']/div[3]/div/label/label/div/i")
	public WebElement FileallowcommentsEvaluator;

	@FindBy(xpath = "//*[@id='saveInsertQuestion']")
	public WebElement Fileaddquestion;

	// Survey Question type Group Scaling

	@FindBy(xpath = "//*[@id='mCSB_1_container']/div/ul/li[12]")
	public WebElement GroupscalingBtn;
	
	@FindBy(xpath = "//*[@id='mCSB_1_container']/div/ul/li[14]")
	public WebElement GroupscalingBtnStagging;

	@FindBy(xpath = "//*[@id='textquestiontext']")
	public WebElement Groupquestiontxt;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[3]/div/input")
	public WebElement Grouptags;

	@FindBy(xpath = "//*[@id='ddlQuestionGroupsforaddquestion']")
	public WebElement Groupquestiongroup;

	public void selectGroupquestiongroup(String value) {
		Select select = new Select(Groupquestiongroup);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='ddlselectnoofoptions']")
	public WebElement Groupnumberoptions;

	public void selectGroupnumberoptions(String value) {
		Select select = new Select(Groupnumberoptions);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='textanswer1']")
	public WebElement Grpenterfirstoption;

	@FindBy(xpath = "//*[@id='textanswer2']")
	public WebElement Grpentersecondoption;

	@FindBy(xpath = "//*[@id='textanswer3']")
	public WebElement GrpenterThirdoption;

	@FindBy(xpath = "//*[@id='textanswer4']")
	public WebElement GrpenterFourthoption;

	@FindBy(xpath = "//*[@id='textanswer5']")
	public WebElement GrpenterFiveoption;

	@FindBy(xpath = "//*[@id='textanswer6']")
	public WebElement GrpenterSixoption;

	@FindBy(xpath = "//*[@id='textanswer7']")
	public WebElement GrpenterSevenoption;

	@FindBy(xpath = "//*[@id='textanswer8']")
	public WebElement GrpenterEightoption;

	@FindBy(xpath = "//*[@id='textanswer9']")
	public WebElement Grpenternineoption;

	@FindBy(xpath = "//*[@id='textanswer10']")
	public WebElement GrpenterTenoption;

	@FindBy(xpath = "//*[@id='textgroupscaleleft']")
	public WebElement GrplabelleftTxtBx;

	@FindBy(xpath = "//*[@id='textgroupscaleright']")
	public WebElement GrplabelrightTxtBx;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[11]/div/label/label/div/i")
	public WebElement Grpmandatory;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[12]/div/label/label/div")
	public WebElement Grpallowcomments;

	@FindBy(xpath = "//*[@id='questiondiv']/div[3]/div/label/label/div/i")
	public WebElement GrpallowcommentsEvaluator;
	
	@FindBy(xpath = "//*[@id='DoesShowresultDiv']/div/label/label/div/i")
	public WebElement Grpshowquestions;

	@FindBy(xpath = "//*[@id='saveInsertQuestion']")
	public WebElement Grpaddquestion;
	
	@FindBy(xpath = "//*[@id='divIdsaveInsertQuestion']")
	public WebElement GrpaddquestionEvaluator;

	// Survey Question type ImagePoll


	@FindBy(xpath = "//*[@id='mCSB_1_container']/div/ul/li[13]")
	public WebElement Imgpoll;
	
	@FindBy(xpath = "//*[@id='mCSB_1_container']/div/ul/li[15]")
	public WebElement ImgpollStagging;
	

	@FindBy(xpath = "//*[@id='textquestiontext']")
	public WebElement Imgquestiontxt;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[3]/div/input")
	public WebElement Imgtags;

	@FindBy(xpath = "//*[@id='ddlQuestionGroupsforaddquestion']")
	public WebElement Imgquestiongroup;

	public void selectImgquestiongroup(String value) {
		Select select = new Select(Imgquestiongroup);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='ddlselectnoofoptions']")
	public WebElement Imgnumberoptions;

	public void selectImgnumberoptions(String value) {
		Select select = new Select(Imgnumberoptions);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='inputFile1']")
	public WebElement Imgfirstoption;

	@FindBy(xpath = "//*[@id='textImagename1']")
	public WebElement ImgfirstTxtbx;
	
//	public void ImgfirstRabiobx(String value) 
//	{
//				jse = (JavascriptExecutor) driver;
//				if (value.equalsIgnoreCase("yes")) 
//					{
//					jse.executeScript("arguments[0].scrollIntoView(true);", ImgfirstRabiobx);
//					ImgfirstRabiobx.click();
//				} else {
//					
//				}
//			}


	@FindBy(xpath = "//*[@id='inputFile2']")
	public WebElement Imgsecondoption;

	@FindBy(xpath = "//*[@id='textImagename2']")
	public WebElement ImgsecondTxtbx;

	@FindBy(xpath = "//*[@id='inputFile3']")
	public WebElement ImgThirdoption;

	@FindBy(xpath = "//*[@id='textImagename3']")
	public WebElement ImgThirdTxtbx;
	
	@FindBy(xpath = "//*[@id='divRadioimgbut3']/div/label/i[1]")
	public WebElement ImgThirdTxtbxTrivia;

	@FindBy(xpath = "//*[@id='inputFile4']")
	public WebElement ImgFourthoption;

	@FindBy(xpath = "//*[@id='textImagename4']")
	public WebElement ImgfourthTxtbx;

	@FindBy(xpath = "//*[@id='inputFile5']")
	public WebElement Imgfiveoption;

	@FindBy(xpath = "//*[@id='textImagename5']")
	public WebElement ImgfiveTxtbx;

	@FindBy(xpath = "//*[@id='inputFile6']")
	public WebElement Imgsixoption;

	@FindBy(xpath = "//*[@id='textImagename6']")
	public WebElement ImgSixTxtbx;

	@FindBy(xpath = "//*[@id='inputFile7']")
	public WebElement Imgsevenoption;

	@FindBy(xpath = "//*[@id='textImagename7']")
	public WebElement ImgsevenTxtbx;

	@FindBy(xpath = "//*[@id='inputFile8']")
	public WebElement ImgEightoption;

	@FindBy(xpath = "//*[@id='textImagename8']")
	public WebElement ImgEightTxtbx;

	@FindBy(xpath = "//*[@id='inputFile9']")
	public WebElement ImgNineoption;

	@FindBy(xpath = "//*[@id='textImagename9']")
	public WebElement ImgNineTxtbx;

	@FindBy(xpath = "//*[@id='inputFile10']")
	public WebElement ImgTenoption;

	@FindBy(xpath = "//*[@id='textImagename10']")
	public WebElement ImgTenTxtbx;

	@FindBy(xpath = "//*[@id='btnCrop']")
	public WebElement ImgPollCropBtn;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[11]/div/label/label/div/i")
	public WebElement Imgmandatory;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[12]/div/label/label/div")
	public WebElement Imgallowcomments;
	
	@FindBy(xpath = "//*[@id='questiondiv']/div[3]/div/label/label/div/i")
	public WebElement ImgallowcommentsTrivia;
	
	@FindBy(xpath = "//*[@id='questiondiv']/div[3]/div/label/label/div/i")
	public WebElement ImgallowcommentsEvaluator;

	@FindBy(xpath = "//*[@id='saveInsertQuestion']")
	public WebElement Imgaddquestion;
	
	@FindBy(xpath = "//*[@id='divIdsaveInsertQuestion']")
	public WebElement ImgaddquestionTrivia;
	
	@FindBy(xpath = "//*[@id='AddquestionDiv']/a[3]")
	public WebElement ImgaddquestionEvaluator;

	// Survey Question type Image With Text

	
	@FindBy(xpath = "//*[@id='ulmenulist']/li[13]")
	public WebElement ImgwithText;

	@FindBy(xpath = "//*[@id='textquestiontext']")
	public WebElement ImgTextquestiontxt;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[3]/div")
	public WebElement ImgTexttags;

	@FindBy(xpath = "//*[@id='ddlQuestionGroupsforaddquestion']")
	public WebElement ImgTextquestiongroup;

	public void selectImgTextquestiongroup(String value) {
		Select select = new Select(ImgTextquestiongroup);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='ddlselectnoofoptions']")
	public WebElement ImgTextnumberoptions;

	public void selectImgTextnumberoptions(String value) {
		Select select = new Select(ImgTextnumberoptions);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='inputFile1']")
	public WebElement ImgwithText1;

	@FindBy(xpath = "//*[@id='inputFile2']")
	public WebElement ImgwithText2;

	@FindBy(xpath = "//*[@id='inputFile3']")
	public WebElement ImgwithText3;

	@FindBy(xpath = "//*[@id='inputFile4']")
	public WebElement ImgwithText4;

	@FindBy(xpath = "//*[@id='inputFile5']")
	public WebElement ImgwithText5;

	@FindBy(xpath = "//*[@id='inputFile6']")
	public WebElement ImgwithText6;

	@FindBy(xpath = "//*[@id='inputFile7']")
	public WebElement ImgwithText7;

	@FindBy(xpath = "//*[@id='inputFile8']")
	public WebElement ImgwithText8;

	@FindBy(xpath = "//*[@id='inputFile9']")
	public WebElement ImgwithText9;

	@FindBy(xpath = "//*[@id='inputFile10']")
	public WebElement ImgwithText10;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[11]/div/label/label")
	public WebElement ImgTextmandatory;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[12]/div/label/label/div/i")
	public WebElement ImgTextallowcomments;
	
	@FindBy(xpath = "//*[@id='questiondiv']/div[3]/div/label/label/div/i")
	public WebElement ImgTextallowcommentsEvaluator;

	@FindBy(xpath = "//*[@id='divIdsaveInsertQuestion']")
	public WebElement ImgTextaddquestion;

	// Survey Multiple Select dropdown question type

	@FindBy(xpath = "//*[@id='mCSB_1_container']/div/ul/li[14]")
	public WebElement MultipleSelectdropdown;
	
	@FindBy(xpath = "//*[@id='mCSB_1_container']/div/ul/li[17]")
	public WebElement MultipleSelectdropdownStagging;
	
	
	@FindBy(xpath = "//*[@id='Fieldtype']/ul/li[8]/a/text")
	public WebElement MultipleSelectdropdownTrivia;

	@FindBy(xpath = "//*[@id='textquestiontext']")
	public WebElement Multiplequestiontxt;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[3]/div")
	public WebElement Multipletags;

	@FindBy(xpath = "//*[@id='ddlQuestionGroupsforaddquestion']")
	public WebElement Multiplequestiongroup;

	public void selectMultiplequestiongroup(String value) {
		Select select = new Select(Multiplequestiongroup);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='ddlselectnoofoptions']")
	public WebElement Multiplenumberoptions;

	public void selectMultiplenumberoptions(String value) {
		Select select = new Select(Multiplenumberoptions);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='textanswer1']")
	public WebElement Multipleenterfirstoption;
	
	@FindBy(xpath = "//*[@id='divchkanswer1']/label/div")
	public WebElement MultipleenterfirstoptionChk;

	@FindBy(xpath = "//*[@id='textanswer2']")
	public WebElement Multipleentersecondoption;
	
	@FindBy(xpath = "//*[@id='divchkanswer2']/label/div")
	public WebElement MultipleentersecondoptionChk;

	@FindBy(xpath = "//*[@id='textanswer3']")
	public WebElement MultipleenterThirdoption;
	
	@FindBy(xpath = "//*[@id='divchkanswer3']/label/div")
	public WebElement MultipleenterThirdoptionChk;

	@FindBy(xpath = "//*[@id='textanswer4']")
	public WebElement MultipleenterFourthoption;
	
	@FindBy(xpath = "//*[@id='divchkanswer4']/label/div")
	public WebElement MultipleenterFourthoptionChk;

	@FindBy(xpath = "//*[@id='textanswer5']")
	public WebElement MultipleenterFiveoption;
	
	@FindBy(xpath = "//*[@id='divchkanswer5']/label/div")
	public WebElement MultipleenterFiveoptionChk;

	@FindBy(xpath = "//*[@id='textanswer6']")
	public WebElement MultipleenterSixoption;
	
	@FindBy(xpath = "//*[@id='divchkanswer6']/label/div")
	public WebElement MultipleenterSixoptionChk;

	@FindBy(xpath = "//*[@id='textanswer7']")
	public WebElement MultipleenterSevenoption;
	
	@FindBy(xpath = "//*[@id='divchkanswer7']/label/div")
	public WebElement MultipleenterSevenoptionChk;

	@FindBy(xpath = "//*[@id='textanswer8']")
	public WebElement MultipleenterEightoption;
	
	@FindBy(xpath = "//*[@id='divchkanswer8']/label/div")
	public WebElement MultipleenterEightoptionChk;

	@FindBy(xpath = "//*[@id='textanswer9']")
	public WebElement Multipleenternineoption;
	
	@FindBy(xpath = "//*[@id='divchkanswer9']/label/div")
	public WebElement MultipleenternineoptionChk;

	@FindBy(xpath = "//*[@id='textanswer10']")
	public WebElement MultipleenterTenoption;
	
	@FindBy(xpath = "//*[@id='divchkanswer10']/label/div")
	public WebElement MultipleenterTenoptionChk;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[11]/div/label/label")
	public WebElement Multiplemandatory;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[12]/div/label/label/div/i")
	public WebElement Multipleallowcomments;
	
	@FindBy(xpath = "//*[@id='questiondiv']/div[3]/div/label/label/div/i")
	public WebElement MultipleallowcommentsEvaluator;
	
	@FindBy(xpath = "//*[@id='questiondiv']/div[3]/div/label/label/div/i")
	public WebElement MultipleallowcommentsTrivia;

	@FindBy(xpath = "//*[@id='DoesShowresultDiv']/div/label/label/div/i")
	public WebElement Multipleshowquestions;

	@FindBy(xpath = "//*[@id='saveInsertQuestion']")
	public WebElement Multipleaddquestion;
	
	@FindBy(xpath = "//*[@id='divIdsaveInsertQuestion']")
	public WebElement MultipleaddquestionTrivia;

	// Survey Multiple Textboxes question type

	@FindBy(xpath = "//*[@id='mCSB_1_container']/div/ul/li[15]")
	public WebElement MultipleTextboxes;
	
	@FindBy(xpath = "//*[@id='mCSB_1_container']/div/ul/li[18]")
	public WebElement MultipleTextboxesStaging;
	

	@FindBy(xpath = "//*[@id='textquestiontext']")
	public WebElement MultipleTextquestiontxt;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[3]/div/input")
	public WebElement MultipleTexttags;

	@FindBy(xpath = "//*[@id='ddlQuestionGroupsforaddquestion']")
	public WebElement MultipleTextquestiongroup;

	public void selectMultipleTextquestiongroup(String value) {
		Select select = new Select(MultipleTextquestiongroup);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='ddlselectnoofoptions']")
	public WebElement MultipleTextnumberoptions;

	public void selectMultipleTextnumberoptions(String value) {
		Select select = new Select(MultipleTextnumberoptions);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='textanswer1']")
	public WebElement MultipleTextenterfirstoption;

	@FindBy(xpath = "//*[@id='textanswer2']")
	public WebElement MultipleTextentersecondoption;

	@FindBy(xpath = "//*[@id='textanswer3']")
	public WebElement MultipleTextenterThirdoption;

	@FindBy(xpath = "//*[@id='textanswer4']")
	public WebElement MultipleTextenterFourthoption;

	@FindBy(xpath = "//*[@id='textanswer5']")
	public WebElement MultipleTextenterFiveoption;

	@FindBy(xpath = "//*[@id='textanswer6']")
	public WebElement MultipleTextenterSixoption;

	@FindBy(xpath = "//*[@id='textanswer7']")
	public WebElement MultipleTextenterSevenoption;

	@FindBy(xpath = "//*[@id='textanswer8']")
	public WebElement MultipleTextenterEightoption;

	@FindBy(xpath = "//*[@id='textanswer9']")
	public WebElement MultipleTextenternineoption;

	@FindBy(xpath = "//*[@id='textanswer10']")
	public WebElement MultipleTextenterTenoption;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[11]/div/label/label")
	public WebElement MultipleTextmandatory;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[12]/div/label/label/div/i")
	public WebElement MultipleTextallowcomments;
	
	@FindBy(xpath = "//*[@id='questiondiv']/div[3]/div/label/label/div/i")
	public WebElement MultipleTextallowcommentsEvaluator;

	@FindBy(xpath = "//*[@id='saveInsertQuestion']")
	public WebElement MultipleTextaddquestion;

	// Survey NPS Score question type

	@FindBy(xpath = "//*[@id='mCSB_1_container']/div/ul/li[16]")
	public WebElement NPSScoreBtn;
	
	@FindBy(xpath = "//*[@id='mCSB_1_container']/div/ul/li[19]")
	public WebElement NPSScoreBtnStaging;

	@FindBy(xpath = "//*[@id='textquestiontext']")
	public WebElement NPSQuestionText;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[3]/div/input")
	public WebElement NPSTags;

	@FindBy(xpath = "//*[@id='ddlQuestionGroupsforaddquestion']")
	public WebElement NPSQuestionGroup;

	public void selectNPSQuestionGroup(String value) {
		Select select = new Select(NPSQuestionGroup);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='Textlabel']")
	public WebElement NPSLabelText;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[11]/div/label/label")
	public WebElement NPSIsMandatory;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[12]/div/label/label/div/i")
	public WebElement NPSAllowcomments;

	@FindBy(xpath = "//*[@id='DoesShowresultDiv']/div/label/label/div/i")
	public WebElement NPSShowthisquestion;

	@FindBy(xpath = "//*[@id='saveInsertQuestion']")
	public WebElement NPSAddquestion;

	// Survey Number Question type

	@FindBy(xpath = "//*[@id='mCSB_1_container']/div/ul/li[17]")
	public WebElement NumberBtn;
	
	@FindBy(xpath = "//*[@id='mCSB_1_container']/div/ul/li[20]")
	public WebElement NumberBtnStaging;

	@FindBy(xpath = "//*[@id='textquestiontext']")
	public WebElement Numberquestiontxt;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[3]/div/input")
	public WebElement Numbertags;

	@FindBy(xpath = "//*[@id='ddlQuestionGroupsforaddquestion']")
	public WebElement Numberquestiongroup;

	public void selectNumberquestiongroup(String value) {
		Select select = new Select(Numberquestiongroup);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='ddlselectnoofoptions']")
	public WebElement Numberofnumberoptions;

	public void selectNumberofnumberoptions(String value) {
		Select select = new Select(Numberofnumberoptions);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='Textlabel']")
	public WebElement NumberLabelText;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[11]/div/label/label")
	public WebElement Numbermandatory;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[12]/div/label/label/div/i")
	public WebElement Numberallowcomments;
	
	@FindBy(xpath = "//*[@id='questiondiv']/div[3]/div/label/label/div/i")
	public WebElement NumberallowcommentsEvaluator;

	@FindBy(xpath = "//*[@id='saveInsertQuestion']")
	public WebElement Numberaddquestion;

	
	// Pictionary
	
	

	@FindBy(xpath = "//*[@id='mCSB_1_container']/div/ul/li[18]")
	public WebElement Pictionary;

	@FindBy(xpath = "//*[@id='textquestiontext']")
	public WebElement PictionaryQuestiontxt;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[3]/div/input")
	public WebElement Pictionarytags;

	@FindBy(xpath = "//*[@id='ddlQuestionGroupsforaddquestion']")
	public WebElement Pictionaryquestiongroup;

	public void selectPictionaryquestiongroup(String value) {
		Select select = new Select(Pictionaryquestiongroup);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='ddlselectnoofoptions']")
	public WebElement Pictionarynumberoptions;

	public void selectPictionarynumberoptions(String value) {
		Select select = new Select(Pictionarynumberoptions);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='inputFile1']")
	public WebElement Pfirstoption;

	
	@FindBy(xpath = "//*[@id='inputFile2']")
	public WebElement Psecondoption ;

	@FindBy(xpath = "//*[@id='inputFile3']")
	public WebElement PThirdoption;

	@FindBy(xpath = "//*[@id='inputFile4']")
	public WebElement Pfouroption;

	@FindBy(xpath = "//*[@id='inputFile5']")
	public WebElement Pfiveoption;

	@FindBy(xpath = "//*[@id='inputFile6']")
	public WebElement Psixoption;

	@FindBy(xpath = "//*[@id='inputFile7']")
	public WebElement Psevenoption;

	@FindBy(xpath = "//*[@id='inputFile8']")
	public WebElement PEightoption;

	@FindBy(xpath = "//*[@id='inputFile9']")
	public WebElement PNineoption;

	@FindBy(xpath = "//*[@id='inputFile10']")
	public WebElement PTenOption;
	

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[11]/div/label/label")
	public WebElement Pictionarymandatory;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[12]/div/label/label/div/i")
	public WebElement Pictionaryallowcomments;
	
	@FindBy(xpath = "//*[@id='saveInsertQuestion']")
	public WebElement Pictionaryaddquestion;
	
	
	// Survey Radio Button Question type

	@FindBy(xpath = "//*[@id='mCSB_1_container']/div/ul/li[19]")
	public WebElement RadioButton;
	
	@FindBy(xpath = "//*[@id='mCSB_1_container']/div/ul/li[21]")
	public WebElement RadioButtonStaging;
	
	
	@FindBy(xpath = "//*[@id='Fieldtype']/ul/li[12]/a/text")
	public WebElement RadioButtonTrivia;

	@FindBy(xpath = "//*[@id='textquestiontext']")
	public WebElement Radioquestiontxt;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[3]/div/input")
	public WebElement Radiotags;

	@FindBy(xpath = "//*[@id='ddlQuestionGroupsforaddquestion']")
	public WebElement Radioquestiongroup;

	public void selectRadioquestiongroup(String value) {
		Select select = new Select(Radioquestiongroup);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='ddlselectnoofoptions']")
	public WebElement Radionumberoptions;

	public void selectRadionumberoptions(String value) {
		Select select = new Select(Radionumberoptions);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='textanswer1']")
	public WebElement Radioenterfirstoption;
	
	@FindBy(xpath = "//*[@id='divRadiobut1']/div/label/i[1]")
	public WebElement AnswerRadioenterfirstoption;

	@FindBy(xpath = "//*[@id='textanswer2']")
	public WebElement Radioentersecondoption;
	
	@FindBy(xpath = "//*[@id='divRadiobut2']/div/label/i[1]")
	public WebElement AnswerRadioentersecondoption;

	@FindBy(xpath = "//*[@id='textanswer3']")
	public WebElement RadioenterThirdoption;
	
	@FindBy(xpath = "//*[@id='divRadiobut3']/div/label/i[1]")
	public WebElement AnswerRadioenterThirdoption;

	@FindBy(xpath = "//*[@id='textanswer4']")
	public WebElement RadioenterFourthoption;
	
	@FindBy(xpath = "//*[@id='divRadiobut4']/div/label/i[1]")
	public WebElement AnswerRadioenterFourthoption;

	@FindBy(xpath = "//*[@id='textanswer5']")
	public WebElement RadioenterFiveoption;
	
	@FindBy(xpath = "//*[@id='divRadiobut5']/div/label/i[1]")
	public WebElement AnswerRadioenterFiveoption;

	@FindBy(xpath = "//*[@id='textanswer6']")
	public WebElement RadioenterSixoption;
	
	@FindBy(xpath = "//*[@id='divRadiobut6']/div/label/i[1]")
	public WebElement AnswerRadioenterSixoption;

	@FindBy(xpath = "//*[@id='textanswer7']")
	public WebElement RadioenterSevenoption;
	
	@FindBy(xpath = "//*[@id='divRadiobut7']/div/label/i[1]")
	public WebElement AnswerRadioenterSevenoption;

	@FindBy(xpath = "//*[@id='textanswer8']")
	public WebElement RadioenterEightoption;
	
	@FindBy(xpath = "//*[@id='divRadiobut8']/div/label/i[1]")
	public WebElement AnswerRadioenterEightoption;

	@FindBy(xpath = "//*[@id='textanswer9']")
	public WebElement Radioenternineoption;
	
	@FindBy(xpath = "//*[@id='divRadiobut9']/div/label/i[1]")
	public WebElement AnswerRadioenternineoption;

	@FindBy(xpath = "//*[@id='textanswer10']")
	public WebElement RadioenterTenoption;

	@FindBy(xpath = "//*[@id='divRadiobut10']/div/label/i[1]")
	public WebElement AnswerRadioenterTenoption;
	
	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[11]/div/label/label")
	public WebElement Radiomandatory;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[12]/div/label/label/div/i")
	public WebElement Radioallowcomments;
	
	@FindBy(xpath = "//*[@id='questiondiv']/div[3]/div/label/label/div/i")
	public WebElement RadioallowcommentsEvaluator;
	
	@FindBy(xpath = "//*[@id='questiondiv']/div[3]/div/label/label/div/i")
	public WebElement RadioallowcommentsTrivia;

	@FindBy(xpath = "//*[@id='DoesShowresultDiv']/div/label/label/div/i")
	public WebElement Radioshowquestions;

	@FindBy(xpath = "//*[@id='saveInsertQuestion']")
	public WebElement RadioaddquestionBtn;
	
	@FindBy(xpath = "//*[@id='saveInsertQuestion']")
	public WebElement RadioaddquestionBtnTrivia;
	
	
	// Survey Scale Rate question type

	@FindBy(xpath = "//*[@id='mCSB_1_container']/div/ul/li[20]")
	public WebElement ScaleRateTabClk;
	
	@FindBy(xpath = "//*[@id='mCSB_1_container']/div/ul/li[22]")
	public WebElement ScaleRateTabClkStaging;

	@FindBy(xpath = "//*[@id='textquestiontext']")
	public WebElement Scalequestiontxt;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[3]/div/input")
	public WebElement Scaletags;

	@FindBy(xpath = "//*[@id='ddlQuestionGroupsforaddquestion']")
	public WebElement Scalequestiongroup;

	public void selectScalequestiongroup(String value) {
		Select select = new Select(Scalequestiongroup);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='Textlabel']")
	public WebElement ScaleLabelText;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[11]/div/label/label")
	public WebElement Scalemandatory;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[12]/div/label/label/div/i")
	public WebElement Scaleallowcomments;

	@FindBy(xpath = "//*[@id='DoesShowresultDiv']/div/label/label/div/i")
	public WebElement Scaleshowquestions;

	@FindBy(xpath = "//*[@id='saveInsertQuestion']")
	public WebElement Scaleaddquestion;
	

	// Survey Single line question type

	@FindBy(xpath = "//*[@id='mCSB_1_container']/div/ul/li[21]")
	public WebElement SinglelineText;
	
	@FindBy(xpath = "//*[@id='mCSB_1_container']/div/ul/li[23]")
	public WebElement SinglelineTextStaging;
	

	@FindBy(xpath = "//*[@id='textquestiontext']")
	public WebElement Singlelinequestiontxt;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[3]/div/input")
	public WebElement Singlelinetags;

	@FindBy(xpath = "//*[@id='ddlQuestionGroupsforaddquestion']")
	public WebElement Singlelinequestiongroup;

	public void selectSinglelinequestiongroup(String value) {
		Select select = new Select(Singlelinequestiongroup);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='Textlabel']")
	public WebElement SinglelineLabelText;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[11]/div/label/label")
	public WebElement Singlelinemandatory;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[12]/div/label/label/div/i")
	public WebElement Singlelineallowcomments;

	@FindBy(xpath = "//*[@id='saveInsertQuestion']")
	public WebElement Singlelineaddquestion;
	
	

	// Survey Text area question type

	@FindBy(xpath = "//*[@id='mCSB_1_container']/div/ul/li[22]")
	public WebElement TextArea;
	
	@FindBy(xpath = "//*[@id='mCSB_1_container']/div/ul/li[24]")
	public WebElement TextAreaStaging;

	@FindBy(xpath = "//*[@id='textquestiontext']")
	public WebElement Textareaquestiontxt;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[3]/div/input")
	public WebElement Textareatags;

	@FindBy(xpath = "//*[@id='ddlQuestionGroupsforaddquestion']")
	public WebElement Textareaquestiongroup;

	public void selectTextareaquestiongroup(String value) {
		Select select = new Select(Textareaquestiongroup);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='Textlabel']")
	public WebElement TextareaLabelText;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[11]/div/label/label")
	public WebElement Textareamandatory;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[12]/div/label/label/div/i")
	public WebElement Textareaallowcomments;

	@FindBy(xpath = "//*[@id='saveInsertQuestion']")
	public WebElement Textareaaddquestion;

	// Survey Yes or No quesiton type

	@FindBy(xpath = "//*[@id='mCSB_1_container']/div/ul/li[23]")
	public WebElement YesorNo;
	
	@FindBy(xpath = "//*[@id='mCSB_1_container']/div/ul/li[25]")
	public WebElement YesorNoStaging;

	@FindBy(xpath = "//*[@id='textquestiontext']")
	public WebElement Yesquestiontxt;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[3]/div/input")
	public WebElement Yestags;

	@FindBy(xpath = "//*[@id='ddlQuestionGroupsforaddquestion']")
	public WebElement Yesquestiongroup;

	public void selectYesquestiongroup(String value) {
		Select select = new Select(Yesquestiongroup);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='Textlabel']")
	public WebElement YesLabelText;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[11]/div/label/label")
	public WebElement Yesmandatory;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[12]/div/label/label/div/i")
	public WebElement Yesallowcomments;

	@FindBy(xpath = "//*[@id='saveInsertQuestion']")
	public WebElement Yesaddquestion;

	@FindBy(xpath = "//*[@id='DoesShowresultDiv']/div/label/label/div/i")
	public WebElement Yesshowquestions;
	
	@FindBy(xpath = "//*[@id='savecancel']/div/button[1]")
	public WebElement SurveyQuestoinSaveNextBtn;

	// Trivia Multiple Winner Rewards
	
	@FindBy(xpath = "//*[@id='multiple']/a/span")
	public WebElement TriviamultipleWinnersTabBtn;
	
	@FindBy(xpath = "//*[@id='multicriterianame']")
	public WebElement TriviamultipleCriteriaNameTxtBx;
	
	@FindBy(xpath = "//*[@id='Noofwinners']")
	public WebElement TriviamultipleNoOfWinnersTxtBx;
	
	@FindBy(xpath = "//*[@id='multiWinner']/div[1]/div/div/div[2]/label[2]/label/div/i")
	public WebElement TriviamultipleUnlimitedChkBtn;
		
	@FindBy(xpath = "//*[@id='Noofwinners']")
	public WebElement TriviaExceptedNoOfWinners;
	
	@FindBy(xpath = "//*[@id='multiWinner']/div[1]/div/div/div[3]/label[2]/label/div/i")
	public WebElement TriviamultipleAutoSelectBtn;
	
	@FindBy(xpath = "//*[@id='multipleselectdate']")
	public WebElement TriviamultipleWinnerSelectionDate;
	
	// Create Question logic page 
	
	@FindBy(xpath = "//*[@id='addnewquestionnaire']/div[3]/div/div[3]/div/label/label/div/i")
	public WebElement setYourOwnLandPageUrl;
	
	@FindBy(xpath = "//*[@id='textlandingpage']")
	public WebElement setYourOwnLandPageUrlTxBx;
	
	// Create Question logic page 
	
	@FindBy(xpath = "//*[@id='questionlogic']/div[2]/div/div/button[2]/span[1]")
	public WebElement questionLogicNextBtnDrpDwn;
	
	@FindBy(xpath = "//*[@id='questionlogic']/div[2]/div/div/ul/li/a[1]")
	public WebElement questionLogicNextBtnSaveAndPublish;
	
	// Create Preview and Customize page 
	
	@FindBy(xpath = "//*[@id='savecancel']/div[2]/button[1]")
	public WebElement PreviewAndCustomizeSkipandNextBtn;
	
	@FindBy(xpath = "//*[@id='savecancel']/div[2]/button[2]")
	public WebElement PreviewAndCustomizeSkipandNextArrowBtn;
	
	@FindBy(xpath = "//*[@id='savecancel']/div[2]/ul/li[1]")
	public WebElement PreviewAndCustomizeSkipandPublishBtn;
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/section/div/div[2]/div[1]/div[4]/div[3]/div/div[1]/button[1]")
	public WebElement PreviewAndCustomizeSaveandNextBtn;
	
	@FindBy(xpath = "//*[@id='messages']/div[3]/div/div[1]/button[2]")
	public WebElement PreviewAndCustomizeSaveandNextArrowBtn;
	
	@FindBy(xpath = "//*[@id='messages']/div[3]/div/div[1]/ul/li[1]")
	public WebElement PreviewAndCustomizeSaveandPublishBtn;
	
	@FindBy(xpath = "//*[@id='messages']/div[3]/div/div[1]/ul/li[2]")
	public WebElement PreviewAndCustomizeSaveandDraftBtn;
	
	//
	
	@FindBy(xpath = "//*[@id='savecancel']/div[2]/button[2]/span[1]")
	public WebElement questionPreviewAndCustomizeSkipAndNextBtnDrpDwn;
	
	@FindBy(xpath = "//*[@id='savecancel']/div[2]/ul/li/a")
	public WebElement questionPreviewAndCustomizeSkipAndPublish;
	
	@FindBy(xpath = "//*[@id='savecancel']/div[2]/button[2]/span[1]")
	public WebElement questionPreviewAndCustomizeSaveAndNextBtnDrpDwn;
	
	@FindBy(xpath = "//*[@id='savecancel']/div[2]/ul/li/a")
	public WebElement questionPreviewAndCustomizeSaveAndPublish;
	
	// Create Rewards page 
	
	@FindBy(xpath = "//*[@id='saverewardspublishbutton']")
	public WebElement RewardsPageSaveAndPublish;
	
	@FindBy(xpath = "//*[@id='settings']/div[2]/div/div/button[2]")
	public WebElement RewardsPageSkipAndPublishDrpDwn;
	
	@FindBy(xpath = "//*[@id='settings']/div[2]/div/div/ul/li[2]")
	public WebElement RewardsPageSkipAndPublishBtn;
	
	@FindBy(xpath = "//*[@id='modalsurveyupgrade']/div/div/div[3]/a")
	public WebElement RewardsBillingProceedBtn;
	
	
	
	@FindBy(xpath ="/html/body/div[3]/div[7]/div[1]/div/div[2]/div/div/div[1]/div/div[2]/div")
	public WebElement ScrollLnk;
	
	
	// Survey List xpaths 
	
	
	
	@FindBy(xpath ="//*[@id='tbodyGetQuestionnairList']/tr[1]/td[1]/div[1]/button[1]")
	public WebElement SurveyListActionsLnk;
	
	@FindBy(xpath ="//*[@id='tbodyGetQuestionnairList']/tr[1]/td[1]/div[1]/ul/li[2]/a")
	public WebElement SurveyView;
	
	
	
	
	
	

	
	
	// Create survey Edit Xpaths
	
	@FindBy(xpath ="//*[@id='nextsurveydetails']")
	public WebElement SurveyEditUpdateandNextBtn;
	
	@FindBy(xpath ="//*[@id='home']/div[2]/div[1]/div/button[2]")
	public WebElement SurveyEditArrowBtn;
	
	@FindBy(xpath ="//*[@id='home']/div[2]/div[1]/div/ul/li/a")
	public WebElement SurveyEditSkipandNextBtn;
	
	
	// Survey Questions page xpaths
	
	@FindBy(xpath ="//*[@id='profile1']/div[3]/div[1]//div[1]/button[1]")
	public WebElement SurveyEditQuestionapageUpdateandNextBtn;

	@FindBy(xpath ="//*[@id='profile1']/div[3]/div[1]//div[1]/button[2]")
public WebElement SurveyQuestionapageArrowBtn;
	
	@FindBy(xpath ="//*[@id='profile1']/div[3]/div[1]/div[1]/ul/li[1]/a")
	public WebElement SurveyEditQuestionapageUpdateandPublishBtn;
	
	@FindBy(xpath ="//*[@id='profile1']/div[3]/div[1]/div[1]/ul/li[3]/a")
	public WebElement SurveyEditQuestionapageSkipandNextBtn;
	
	// Survey last page edit xapths
	
	@FindBy(xpath ="//*[@id='divactionsquestionnaire']")
	public WebElement SurveyLastpageActions;
	
	@FindBy(xpath ="//*[@id='divactionsquestionnaire']/ul[2]/li[1]/a/i")
	public WebElement SurveyLastpageEdit;

	@FindBy(xpath ="//*[@id='divactionsquestionnaire']/ul[3]/li[2]/a/i")
	public WebElement SurveyClose;
	
	@FindBy(xpath ="//*[@id='CloseQuestionnaireModal']/div/div/div[3]/button[2]")
	public WebElement SurveyCloseBtn;

	@FindBy(xpath ="//*[@id='divactionsquestionnaire']/ul[3]/li[3]/a/i")
	public WebElement SurveyShare;
	
	@FindBy(xpath ="//*[@id='textshareEmailIds']")
	public WebElement SurveyshareEmailTxtBx;
	
	@FindBy(xpath ="//*[@id='buttonshowccbcc']")
	public WebElement SurveyShareEmailCCLnk;
	
	@FindBy(xpath ="//*[@id='textshareCC']")
	public WebElement SurveyShareEmailCCTxtBx;
	
	@FindBy(xpath ="//*[@id='textshareBCC']")
	public WebElement SurveyShareEmailBCCTxtBx;
	
	@FindBy(xpath ="//*[@id='Email']/div[2]/div[1]/div/div[2]/div/div[5]/div/label/label/div/i")
	public WebElement SurveyShareEmailSendLaterChkBx;
	
	@FindBy(xpath ="//*[@id='txtEndDate']")
	public WebElement SurveyShareScheduleDate;
	
	@FindBy(xpath ="//*[@id='Divsendbutton']/div/button")
	public WebElement SurveyShareSendBtn;

	@FindBy(xpath ="//*[@id='fullw']/ul/div[1]/ul[2]/li[4]/a")
	public WebElement SurveyDelete;
	
	
	// Subscriptions
	
	@FindBy(xpath ="//*[@id='ulsubmenu']/li[11]")
	public WebElement SubscriptionsLnk;
	
	@FindBy(xpath ="//*[@id='Subscriptions']/div/div[1]/div/div[2]/div[1]/div[2]/label/i[2]")
	public WebElement ProductsRdbtn;
	
	
	
	@FindBy(xpath ="//*[@id='createsub']/img")
	public WebElement SubscriptionsplusBtn;
	
	
	@FindBy(xpath ="//*[@id='txtSubscriptionName']")
	public WebElement SubscriptionNameTxtBx;
	
	@FindBy(xpath ="//*[@id='txtFromDateTime']")
	public WebElement SubscriptionActivefromDate;
	
	@FindBy(xpath ="//*[@id='txtToDateTime']")
	public WebElement SubscriptionActiveToDate;
	
	@FindBy(xpath ="//*[@id='ddlRenewalPeriod']")
	public WebElement SubscriptionRenewalPeriodDrpDwn;
	
	public void selectSubscriptionRenewalPeriodDrpDwn(String value) {
		Select select = new Select(SubscriptionRenewalPeriodDrpDwn);
		select.selectByVisibleText(value);
	}

	
	
	
	@FindBy(xpath ="//*[@id='ddlSubscriptionDuration']")
	public WebElement SubscriptionDurationDrpDwn;
	
	
	public void selectSubscriptionDurationDrpDwn(String value) {
		Select select = new Select(SubscriptionDurationDrpDwn);
		select.selectByVisibleText(value);
	}
	
	
	@FindBy(xpath ="//*[@id='txtMaxSubscriptions']")
	public WebElement SubscriptionMaxsubscriptionDrpdwn;
	
	
	
	@FindBy(xpath ="//*[@id='txtBundlemaxQuantity']")
	public WebElement BundleTxtbx;

	
	public void selectSubscriptionMaxsubscriptionDrpdwn(String value) {
		Select select = new Select(SubscriptionMaxsubscriptionDrpdwn);
		select.selectByVisibleText(value);
	}
	
	
	
	
	@FindBy(xpath ="//*[@id='Subscriptions']/div/div/div/div[2]/div[2]/div[8]/div/label/label/div/i")
	
	public WebElement AutoRenewalChkBx;
	
	
	
	@FindBy(xpath ="//*[@id='TransactionCharges']")
	public WebElement SubscriptionTransctionchargesDrpDwn;
	
	public void selectSubscriptionTransctionchargesDrpDwn(String value) {
		Select select = new Select(SubscriptionTransctionchargesDrpDwn);
		select.selectByVisibleText(value);
	}
	
	
	@FindBy(xpath ="//*[@id='RedirectURL']")
	public WebElement RedirectURL;
	
	@FindBy(xpath ="//*[@id='Subscriptions']/div/div[1]/div/div[2]/div[2]/div[8]/div/label/label/div/i")
	public WebElement Subscriptionyourapproalchkbx;
	
	
	public void Subscriptionyourapproalchkbx(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("yes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", Subscriptionyourapproalchkbx);
			Subscriptionyourapproalchkbx.click();
		} else {

		}
	}

	
	@FindBy(xpath ="//*[@id='Subscriptions']/div/div[1]/div/div[2]/div[2]/div[9]/div/label/label/div/i")
	public WebElement isDisplayChkbx;
	
	@FindBy(xpath ="//*[@id='Subscriptions']/div/div[1]/div/div[2]/div[2]/div[10]/div/div[2]/div[3]/div[2]")
	public WebElement SubscriptionDescriptionTxtBx;
	

	@FindBy(xpath ="//*[@id='Subscriptions']/div/div/div/div[2]/div[2]/div[13]/div/div[1]/label/i[1]")
	public WebElement Singlepricequantitychkbx;
	
	
	@FindBy(xpath ="//*[@id='Subscriptions']/div/div[3]/div/div/div[1]/div/div[2]/label/i[1]")
	public WebElement itemizedpricequantitychkbx;
	
	
	public void PriceQuantityChkBx(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("Single")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", Singlepricequantitychkbx);
			Singlepricequantitychkbx.click();
		} else if (value.equalsIgnoreCase("itemized")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", itemizedpricequantitychkbx);
			itemizedpricequantitychkbx.click();
		}
	}
	
	
	
	@FindBy(xpath ="//*[@id='ddlPriceCurrency']")
	public WebElement Subscriptionpricedrpdwn;
	
	public void selectSubscriptionpricedrpdwn(String value) {
		Select select = new Select(Subscriptionpricedrpdwn);
		select.selectByVisibleText(value);
	}
	
	
	
	@FindBy(xpath ="//*[@id='Price']")
	public WebElement SubscriptionpriceTxtbx;
	
	@FindBy(xpath ="//*[@id='Promotionalprice']")
	public WebElement Promotionaltxtbx;
	
	@FindBy(xpath ="//*[@id='txtPromotionalEndDate']")
	public WebElement PromotionalPriceEndDateTxtBx;
	
	@FindBy(xpath ="//*[@id='txtmaxQuantity']")
	public WebElement AvailabilityStockTxtBx;
	
	@FindBy(xpath ="//*[@id='filedocumentSubscriptionLogo1']")
	public WebElement Subimg1;
	
	@FindBy(xpath ="//*[@id='modalimagecrop']/div/div/div[3]/button[2]")
	public WebElement Subimg1Cropbtn;
	
	
	@FindBy(xpath ="//*[@id='AddMoreImagesDiv']")
	public WebElement imgplusBtn;
	
	@FindBy(xpath ="//*[@id='filedocumentSubscriptionLogo2']")
	public WebElement subimg2;
	
	
	@FindBy(xpath ="//*[@id='TaxPercentage1']")
	public WebElement TaxesTxtBx;
	
	@FindBy(xpath ="//*[@id='TaxDescription1']")
	public WebElement ShortDescriptionTxtBx;
	
	@FindBy(xpath ="//*[@id='AddMoreTaxDiv']/i")
	public WebElement SubscriptionplusBtn;
	
	@FindBy(xpath ="//*[@id='TaxPercentage2']")
	public WebElement TaxesTxtBx2;
	
	@FindBy(xpath ="//*[@id='TaxDescription2']")
	public WebElement ShortDescriptionTxtBxtBx2;
	
	@FindBy(xpath ="//*[@id='savecancelopt']/div/button[1]")
	public WebElement SubscriptionNextBtn;
	
	
	
	@FindBy(xpath ="//*[@id='ddlCategory1']")
	public WebElement itemOptionsDrp1;
	
	public void selectitemOptionsDrp1(String value) {
		Select select = new Select(itemOptionsDrp1);
		select.selectByVisibleText(value);
	}
	
	
	@FindBy(xpath ="//*[@id='DefualtOptions11']")
	public WebElement OptionNameTxtbx1;
	
	@FindBy(xpath ="//*[@id='ddlCategory2']")
	public WebElement itemOptionsDrp2;
	
	public void selectitemOptionsDrp2(String value) {
		Select select = new Select(itemOptionsDrp2);
		select.selectByVisibleText(value);
	}
	
	@FindBy(xpath ="//*[@id='DefualtOptions21']")
	public WebElement OptionNameTxtbx2;
	
	@FindBy(xpath ="//*[@id='ddlCategory3']")
	public WebElement itemOptionsDrp3;
	
	public void selectitemOptionsDrp3(String value) {
		Select select = new Select(itemOptionsDrp3);
		select.selectByVisibleText(value);
	}
	
	@FindBy(xpath ="//*[@id='DefualtOptions31']")
	public WebElement OptionNameTxtbx3;
	
	
	

	
	
	@FindBy(xpath ="//*[@id='OptionValue1']")
	public WebElement ValueTxtBx;
	
	@FindBy(xpath ="//*[@id='ddlOptionsCurrency1']")
	public WebElement OptionPriceDrpDwn;
	
	public void selectOptionPriceDrpDwn(String value) {
		Select select = new Select(OptionPriceDrpDwn);
		select.selectByVisibleText(value);
	}
	
	
	@FindBy(xpath ="//*[@id='OptionPrice1']")
	public WebElement OptionPriceTxtBx;
	
	@FindBy(xpath ="//*[@id='PromotionalPrice1']")
	public WebElement OptionPromotionalPriceTxtBx;
	
	
	@FindBy(xpath ="//*[@id='txtOptionPromotEndDate1']")
	public WebElement OptionPPriceEndDate;
	
	@FindBy(xpath ="//*[@id='AvailabilityStock1']")
	public WebElement OptionAvailabilityStockTxtBx;
	
	@FindBy(xpath ="//*[@id='AddMoreOptionsDiv']/div")
	public WebElement OptionPlusBtn;
	
	@FindBy(xpath ="//*[@id='savecancelopt']/div/button[1]")
	public WebElement SubNextBtn;
	
	

	
	// Reminders
	
	@FindBy(xpath ="//*[@id='EmailTemplates1']")//*[@id="EmailTemplates1"]
	public WebElement EmailTemplateDrpDwn;
	
	public void selectEmailTemplateDrpDwn(String value) {
		Select select = new Select(EmailTemplateDrpDwn);
		select.selectByVisibleText(value);
	}
	
	
	@FindBy(xpath ="//*[@id='WhenToMail1']")
	public WebElement EmailTemplateDrpDwn2;
	
	public void selectEmailTemplateDrpDwn2(String value) {
		Select select = new Select(EmailTemplateDrpDwn2);
		select.selectByVisibleText(value);
	}
	

	@FindBy(xpath ="//*[@id='NoOfDaysOfSubscriptionEnd1']")
	public WebElement NoofDaysTxtBx;
	
	@FindBy(xpath ="//*[@id='AddMoreRemindersDiv']")
	public WebElement EmailTemplatePlusBtn;
	
	@FindBy(xpath ="//*[@id='EmailTemplates2']")
	public WebElement TemplateDrpDwn;
	
	public void selectTemplateDrpDwn(String value) {
		Select select = new Select(TemplateDrpDwn);
		select.selectByVisibleText(value);
	}
	
	
	
	@FindBy(xpath ="//*[@id='WhenToMail2']")
	public WebElement TemplateDrpDwn2;
	
	public void selectTemplateDrpDwn2(String value) {
		Select select = new Select(TemplateDrpDwn2);
		select.selectByVisibleText(value);
	}
	
	
	
	@FindBy(xpath ="//*[@id='NoOfDaysOfSubscriptionEnd2']")
	public WebElement NoofDaysTxtbx2;
	
	@FindBy(xpath ="//*[@id='savecancelopt']/div/button[2]")
	public WebElement NextBtn2;
	
	
	
	
	// affiliate program
	
	
	
	@FindBy(xpath ="//*[@id='affiliateacouponcodes']")
	public WebElement AffiliateTab;
	
	@FindBy(xpath ="//*[@id='addnewaffiliatecoupon']")
	public WebElement AffiliateAddnewBtn;
	
	@FindBy(xpath ="//*[@id='affiliatecoupontitle']")
	public WebElement CouponTitleTxtbx;
	
	@FindBy(xpath ="//*[@id='selectaffiliatecoupon']")
	public WebElement CoupontypeDrp;
	
	public void selectCoupontypeDrp(String value) {
		Select select = new Select(CoupontypeDrp);
		select.selectByVisibleText(value);
	}
	
	@FindBy(xpath ="//*[@id='selectaffiliateEventcoupondiv']/div/div[1]/div")
	public WebElement EventDrpDwn;
	
	@FindBy(xpath ="//*[@id='selectaffiliateEventcoupondiv']/div/div[2]/div[1]/input")
	public WebElement EventsearchBx;
	
	@FindBy(xpath ="//*[@id='selectaffiliateEventcoupondiv']/div/div[2]/div[2]/div[not(contains(@class, 'hidden'))]/span")
	public WebElement EventChkBx;
	
	
	public void Eventdrpdwn(String value) throws Exception {
		EventDrpDwn.click();
		Thread.sleep(2000);
		String strMain = value;
		String[] arrSplit = strMain.split(",");
		for (int i = 0; i < arrSplit.length; i++) {
			EventsearchBx.sendKeys(arrSplit[i].trim());
			Thread.sleep(3000);
			EventChkBx.click();
			Thread.sleep(2000);
			//TopicDateSearchBx.clear();
			EventDrpDwn.click();
			
			// Thread.sleep(4000);
		}
	}
	
	
	
	@FindBy(xpath ="//*[@id='selectaffiliateTicketcoupondiv']/div/div[1]/div")
	public WebElement TicketsDrpDwn;
	
	@FindBy(xpath ="//*[@id='selectaffiliateTicketcoupondiv']/div/div[2]/div[1]/input")
	public WebElement TicketsSearchbx;
	
	@FindBy(xpath ="//*[@id='selectaffiliateTicketcoupondiv']/div/div[2]/div[2]/div[not(contains(@class, 'hidden'))]/span")
	public WebElement TicketsChkbx;
	
	
	public void TicketsDrpDwn(String value) throws Exception {
		TicketsDrpDwn.click();
		Thread.sleep(2000);
		String strMain = value;
		String[] arrSplit = strMain.split(",");
		for (int i = 0; i < arrSplit.length; i++) {
			TicketsSearchbx.sendKeys(arrSplit[i].trim());
			Thread.sleep(3000);
			TicketsChkbx.click();
			Thread.sleep(2000);
			//TopicDateSearchBx.clear();
			TicketsDrpDwn.click();
			
			// Thread.sleep(4000);
		}
	}
	
	
	
	
	
	
	@FindBy(xpath ="//*[@id='selectaffiliateHotelcoupondiv']/div/div[1]/div")
	public WebElement HotelsDrpDwn;
	
	@FindBy(xpath ="//*[@id='selectaffiliateHotelcoupondiv']/div/div[2]/div[1]/input")
	public WebElement Hotelssearchbx;
	
	@FindBy(xpath ="//*[@id='selectaffiliateHotelcoupondiv']/div/div[2]/div[2]/div[1]/span")
	public WebElement Hotelschkbx;
	
	
	
	
	
	
	public void HotelsDrpDwn(String value) throws Exception {
		HotelsDrpDwn.click();
		Thread.sleep(2000);
		String strMain = value;
		String[] arrSplit = strMain.split(",");
		for (int i = 0; i < arrSplit.length; i++) {
			Hotelssearchbx.sendKeys(arrSplit[i].trim());
			Thread.sleep(3000);
			Hotelschkbx.click();
			Thread.sleep(2000);
			//TopicDateSearchBx.clear();
			HotelsDrpDwn.click();
			
			// Thread.sleep(4000);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath ="//*[@id='selectaffiliateServicescoupondiv']/div/div[1]/div")
	public WebElement Subscriptionsdrpdwn;
	
	@FindBy(xpath ="//*[@id='selectaffiliateServicescoupondiv']/div/div[2]/div[1]/input")
	public WebElement Subscriptionssearchbx;
	
	@FindBy(xpath ="//*[@id='selectaffiliateServicescoupondiv']/div/div[2]/div[2]/div[1]/span")
	public WebElement Subscriptionschkbx;
	
	
	
	
	public void Subscriptionsdrpdwn(String value) throws Exception {
		Subscriptionsdrpdwn.click();
		Thread.sleep(2000);
		String strMain = value;
		String[] arrSplit = strMain.split(",");
		for (int i = 0; i < arrSplit.length; i++) {
			Subscriptionssearchbx.sendKeys(arrSplit[i].trim());
			Thread.sleep(3000);
			Subscriptionschkbx.click();
			Thread.sleep(2000);
			//TopicDateSearchBx.clear();
			Subscriptionsdrpdwn.click();
			
			// Thread.sleep(4000);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath ="//*[@id='txtaffiliateactivecoupondate']")
	public WebElement Activationformdatetxtbx;
	
	@FindBy(xpath ="//*[@id='txtaffiliateExpiryCoupon']")
	public WebElement Expiredatetxtbx;
	
	@FindBy(xpath ="//*[@id='selectfeetype']")
	public WebElement Referralfeedrpdwn;
	
	public void Referralfeedrpdwn(String value) {
		Select select = new Select(Referralfeedrpdwn);
		select.selectByVisibleText(value);
	}
	
	@FindBy(xpath ="//*[@id='txtfeepercentage']")
	public WebElement PercentageTxtbx;
	
	@FindBy(xpath ="//*[@id='selectfeepercentagecurrency']")
	public WebElement PercentageCurrencydrpdwn;
	
	public void PercentageCurrencydrpdwn(String value) {
		Select select = new Select(PercentageCurrencydrpdwn);
		select.selectByVisibleText(value);
	}
	
	
	@FindBy(xpath ="//*[@id='txtfeepercentageamount']")
	public WebElement PercentageCurrencytxtbx;
	
	@FindBy(xpath ="//*[@id='ddlamountcurrency']")
	public WebElement Amountcurrencydrpdwn;
	
	public void Amountcurrencydrpdwn(String value) {
		Select select = new Select(Amountcurrencydrpdwn);
		select.selectByVisibleText(value);
	}
	
	
	@FindBy(xpath ="//*[@id='txtfeeamount']")
	public WebElement Amountcurrencytxtbx;
	
	@FindBy(xpath ="//*[@id='selectfeedisctype']")
	public WebElement Discountdrpdwn;
	
	public void Discountdrpdwn(String value) {
		Select select = new Select(Discountdrpdwn);
		select.selectByVisibleText(value);
	}
	
	@FindBy(xpath ="//*[@id='discfeetxtpercentage']")
	public WebElement Discountpercentagetxtbx;
	
	@FindBy(xpath ="//*[@id='selectdiscpercentagecurrency']")
	public WebElement DiscountPercentageCurrencydrpdwn;
	
	
	public void DiscountPercentageCurrencydrpdwn(String value) {
		Select select = new Select(DiscountPercentageCurrencydrpdwn);
		select.selectByVisibleText(value);
	}
	
	
	
	@FindBy(xpath ="//*[@id='txtdiscpercentageamount']")
	public WebElement DiscountPercentageCurrencyTxtbx;
	
	@FindBy(xpath ="//*[@id='ddldiscamountcurrency']")
	public WebElement DiscountAmountDrpdwn;
	
	public void DiscountAmountDrpdwn(String value) {
		Select select = new Select(DiscountAmountDrpdwn);
		select.selectByVisibleText(value);
	}
	
	
	@FindBy(xpath ="//*[@id='txtdiscfeeamount']")
	public WebElement DiscountAmountTxtbx;
	
	@FindBy(xpath ="//*[@id='affiliatecoupondescription']")
	public WebElement AffiliatedescriptionTxtbx;
	
	@FindBy(xpath ="//*[@id='refferalcode']")
	public WebElement ReferalCode;
	
	@FindBy(xpath ="//*[@id='txtrefferreremailid']")
	public WebElement ReferrerEmailid;
	
	@FindBy(xpath ="//*[@id='txtrefferallink']")
	public WebElement Referrallink;
	
	@FindBy(xpath ="//*[@id='txtnumberofaffiliateuser']")
	public WebElement Noofusers;
	
	
	@FindBy(xpath ="//*[@id='savecancelAffiliateCoupon']/a[2]")
	public WebElement Affiliatesavebtn;


// Booths





@FindBy(xpath ="//*[@id='booths']")
public WebElement BoothsBtn;

@FindBy(xpath ="//*[@id='addnewBoothConfig']")
public WebElement AddnewBoothslnk;

@FindBy(xpath ="//*[@id='eventdropdownbooth']")
public WebElement BoothEventDrpdwn;


public void BoothEventDrpdwn(String value) {
	Select select = new Select(BoothEventDrpdwn);
	select.selectByVisibleText(value);
}


@FindBy(xpath ="//*[@id='Boothpackages']/div[2]/div/div[2]/div[3]/div[2]")
public WebElement BoothDescriptionTxtbx;

@FindBy(xpath ="//*[@id='Boothpackages']/div[3]/div[3]/div")
public WebElement AddBoothBtn;

@FindBy(xpath ="//*[@id='textcategoryname']")
public WebElement CategoryNameTxtbx;

@FindBy(xpath ="//*[@id='textboothxsize']")
public WebElement SizeinftXaxis;

@FindBy(xpath ="//*[@id='textboothysize']")
public WebElement Sizeyaxistxtbx;

@FindBy(xpath ="//*[@id='selectcurrency']")
public WebElement Pricedrpdwn;

public void Pricedrpdwn(String value) {
	Select select = new Select(Pricedrpdwn);
	select.selectByVisibleText(value);
}



@FindBy(xpath ="//*[@id='textboothprice0']")
public WebElement Pricetxtbx;

@FindBy(xpath ="//*[@id='OptionalDiv1']/div/div[1]/div")
public WebElement AdditionalFeaturesDrpdwn;

@FindBy(xpath ="//*[@id='OptionalDiv1']/div/div[2]/div[1]/input")
public WebElement Additionalfeaturessearchbx;

@FindBy(xpath ="//*[@id='OptionalDiv1']/div/div[2]/div[2]/div[not(contains(@class, 'hidden'))]/span")
public WebElement AdditionalfeaturesChkbx;



public void AdditionalFeaturesDrpdwn(String value) throws Exception {
	AdditionalFeaturesDrpdwn.click();
	Thread.sleep(2000);
	String strMain = value;
	String[] arrSplit = strMain.split(",");
	for (int i = 0; i < arrSplit.length; i++) {
		Additionalfeaturessearchbx.sendKeys(arrSplit[i].trim());
		Thread.sleep(3000);
		AdditionalfeaturesChkbx.click();
		Thread.sleep(2000);
		//TopicDateSearchBx.clear();
		AdditionalFeaturesDrpdwn.click();
		
	}
}


@FindBy(xpath ="//*[@id='btnAddPrice']")
public WebElement Plusbtn;

@FindBy(xpath ="//*[@id='OptionalDiv1']/div/div[2]/div[2]/div[1]")
public WebElement AdditionalfeaturesAddnewLnk;

@FindBy(xpath ="//*[@id='txtboothoption']")
public WebElement OptionsNameTxtbx;

@FindBy(xpath ="//*[@id='txtboothnote']")
public WebElement CommentsTxtbx;

@FindBy(xpath ="//*[@id='Adddesignation']")
public WebElement AdditionalAddBtn;

@FindBy(xpath ="//*[@id='selectcurrency01']")
public WebElement CurrencyDrpdwn;

public void CurrencyDrpdwn(String value) {
	Select select = new Select(CurrencyDrpdwn);
	select.selectByVisibleText(value);
}


@FindBy(xpath ="//*[@id='textboothprice1']")
public WebElement CurrencyPricetxtbx;

@FindBy(xpath ="//*[@id='MultiplePriceDiv']/div[1]/div[4]/label/label/div/i")
public WebElement IncludeChkbx;

@FindBy(xpath ="//*[@id='OptionalDiv2']/div/div[1]/div")
public WebElement AdditionalFeaturesDrpdwn1;

@FindBy(xpath ="//*[@id='OptionalDiv2']/div/div[2]/div[1]/input")
public WebElement Additionalfeaturessearchbx1;

@FindBy(xpath ="//*[@id='OptionalDiv2']/div/div[2]/div[2]/div[not(contains(@class, 'hidden'))]/span")
public WebElement AdditionalfeaturesChkbx1;

@FindBy(xpath ="//*[@id='selectcurrency2']")
public WebElement CurrencyDrpdwn1;

@FindBy(xpath ="//*[@id='textboothprice2']")
public WebElement CurrencyPricetxtbx1;

@FindBy(xpath ="//*[@id='MultiplePriceDiv']/div[2]/div[4]/label/label/div/i")
public WebElement Includechkbx1;

@FindBy(xpath ="//*[@id='MultiplePriceDiv']/div[2]/div[5]/a")
public WebElement Delete1;

@FindBy(xpath ="//*[@id='OptionalDiv3']/div/div[1]/div")
public WebElement AdditionalFeaturesDrpdwn2;

@FindBy(xpath ="//*[@id='OptionalDiv3']/div/div[2]/div[1]/input")
public WebElement Additionalfeaturessearchbx2;

@FindBy(xpath ="//*[@id='OptionalDiv3']/div/div[2]/div[2]/div[not(contains(@class, 'hidden'))]/span")
public WebElement AdditionalfeaturesChkbx2;

@FindBy(xpath ="//*[@id='MultiplePriceDiv']/div[3]/div[4]/label/label/div/i")
public WebElement Includechkbx2;

@FindBy(xpath ="//*[@id='MultiplePriceDiv']/div[3]/div[5]/a")
public WebElement Delete2;

@FindBy(xpath ="//*[@id='ClidiemUser-form']/div[1]/div[6]/div/div/input")
public WebElement BoothnumberTxtbx;

@FindBy(xpath ="//*[@id='ClidiemUser-form']/div[2]/div[2]/div[3]/div[2]")
public WebElement DescriptionTxtbx;

@FindBy(xpath ="//*[@id='addnewbooths']")
public WebElement SaveBoothBtn;

@FindBy(xpath ="//*[@id='SaveBoothCategory']")
public WebElement SaveBtn;






}





















