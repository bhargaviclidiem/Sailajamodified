package HomePage_PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class IndexPages{

	//WebDriver driver;
	Actions action;

	// Login deatils

	@FindBy(xpath = "//*[@id='txtusername']")
	public WebElement userNameTxtbx;

	@FindBy(xpath = "//*[@id='txtpassword']")
	public WebElement passwordTxtbx;

	@FindBy(xpath = "//*[@id='aloginbutton']")
	public WebElement loginBtn;

	@FindBy(xpath = "/html/body/header/section/div[3]/ul/li/a[3]")
	public WebElement registerLnk;

	// Register Page web elements

	@FindBy(xpath = "//*[@id='aorganization']")
	public WebElement OrganizationLnk;

	@FindBy(xpath = "//*[@id='txtcompanyusername']")
	public WebElement OrgYourname;

	@FindBy(xpath = "//*[@id='txtcompanyname']")
	public WebElement OrgName;

	@FindBy(xpath = "//*[@id='txtcompanyemailid']")
	public WebElement OrgEmailID;

	@FindBy(xpath = "//*[@id='selectcompanycountry']")
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

	@FindBy(xpath = "//*[@id='tabs-company']/div[12]/div/label/div/i")
	public WebElement OrgAgreeChkBx;

	public void OrgAgreeChkBx(WebDriver driver, String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("yes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", OrgAgreeChkBx);
			OrgAgreeChkBx.click();
		} else {

		}
	}

	@FindBy(xpath = "//*[@id='tabs-company']/div[12]/a")
	public WebElement OrgRegisterBtn;

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

	// Question page - Check Box
	
	@FindBy(xpath = "//*[@id='textindiWeightage']")
	public WebElement IndividualWeightageTxtBx;

	@FindBy(xpath = "//*[contains (text, 'Check Box')]/text")
//	@FindBy(xpath = "//*[@id='ulmenulist']/li[2]")
	public WebElement checkboxBtnClk;

	@FindBy(xpath = "//*[@id='textquestiontext']")
	public WebElement Chkquestiontxt;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[3]/div/input")
	public WebElement checkbxtags;

	@FindBy(xpath = "//*[@id='ddlQuestionGroupsforaddquestion']")
	public WebElement checkbxquestiongroup;

	@FindBy(xpath = "//*[@id='ddlQuestionGroupsforaddquestion']/option[1]")
	public WebElement AddNewGroup;

	@FindBy(xpath = "//*[@id='txtNewQuestion']")
	public WebElement NewGroupName;

	@FindBy(xpath = "//*[@id='addNewQuestionModal']/div/div/div[2]/form/div[5]/button[2]")
	public WebElement AddNewGroupAddBtn;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[1]/h1/a")
	public WebElement AddNewGroupCloseBtn;

	// selectchkquestiongroup

	public void selectchkquestiongroup(String value) {
		Select select = new Select(checkbxquestiongroup);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='ddlselectnoofoptions']")
	public WebElement numberoptions;

	// selectchkno.ofoptionsdrpdwn

	public void selectchknumberoptions(String value) {
		Select select = new Select(numberoptions);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='textanswer1']")
	public WebElement chkenterfirstoption;

	@FindBy(xpath = "//*[@id='divchkanswer1']/label/div")
	public WebElement Answerchkenterfirstoption;
	
	@FindBy(xpath = "//*[@id='textanswer2']")
	public WebElement chkentersecondoption;
	
	@FindBy(xpath = "//*[@id='divchkanswer2']/label/div")
	public WebElement Answerchkentersecondoption;
	
	@FindBy(xpath = "//*[@id='textanswer3']")
	public WebElement chkenterThirdoption;
	
	@FindBy(xpath = "//*[@id='divchkanswer3']/label/div")
	public WebElement AnswerchkenterThirdoption;
		
	@FindBy(xpath = "//*[@id='textanswer4']")
	public WebElement chkenterFourthoption;
	
	@FindBy(xpath = "//*[@id='divchkanswer4']/label/div")
	public WebElement AnswerchkenterFourthoption;

	@FindBy(xpath = "//*[@id='textanswer5']")
	public WebElement chkenterFiveoption;
	
	@FindBy(xpath = "//*[@id='divchkanswer5']/label/div")
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

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[11]/div/label/label/div/i")
	public WebElement chkbxmandatory;

	@FindBy(xpath = "//*[@id='newquest']/div[1]/div[12]/div/label/label/div/i")
	public WebElement chkbxallowcomments;

	@FindBy(xpath = "//*[@id='questiondiv']/div[3]/div/label/label/div/i")
	public WebElement chkbxallowcommentsEvaluator;
	
	@FindBy(xpath = "//*[@id='questiondiv']/div[3]/div/label/label/div/i")
	public WebElement chkbxallowcommentsTrivia;
	
	@FindBy(xpath = "//*[@id='DoesShowresultDiv']/div/label/label/div/i")
	public WebElement showquestions;

	@FindBy(xpath = "//*[@id='saveInsertQuestion']")
	public WebElement chkbxaddquestion;
	
	@FindBy(xpath = "//*[@id='divIdsaveInsertQuestion']")
	public WebElement chkbxaddquestionTrivia;
	
	@FindBy(xpath = "//*[@id='divIdsaveInsertQuestion']")
	public WebElement chkbxaddquestionEvaluator;

	@FindBy(xpath = "//*[@id='savecancel']/div/button[2]/span[1]")
	public WebElement QuestionSaveAndNextDrp;

	@FindBy(xpath = "//*[@id='savecancel']/div/ul/li/a[1]")
	public WebElement QuestionSaveAndPublish;

	@FindBy(xpath = "//*[@id='savecancel']/div/ul/li[2]/a[1]")
	public WebElement QuestionSaveAndDraft;

	@FindBy(xpath = "//*[@id='modalsurveyupgrade']/div/div/div[3]/a/i")
	public WebElement QuestionBillingProceedBtn;
	
	@FindBy(xpath = "//*[@id='modalsurveyupgrade']/div/div/div[3]/a/i")
	public WebElement QuestionLogicBillingProceedBtn;
	
	@FindBy(xpath = "//*[@id='modalsurveyupgrade']/div/div/div[3]/a/i")
	public WebElement QuestionPreviewAndCustomizeBillingProceedBtn;
	
	// Question type Date

	@FindBy(xpath = "//*[@id='ulmenulist']/li[3]")
	public WebElement DateLnk;
	
	@FindBy(xpath = "//*[@id='textquestiontext']")
	public WebElement DateQuestiontxt;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[3]/div/input")
	public WebElement Datebxtags;

	@FindBy(xpath = "//*[@id='ddlQuestionGroupsforaddquestion']")
	public WebElement Datebxquestiongroup;

	public void selectDatebxquestiongroup(String value) {
		Select select = new Select(Datebxquestiongroup);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='Textlabel']")
	public WebElement DateLabelTxt;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[11]/div/label/label/div/i")
	public WebElement Datebxmandatory;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[12]/div/label/label/div/i")
	public WebElement Datebxallowcomments;
	
	@FindBy(xpath = "//*[@id='questiondiv']/div[3]/div/label/label/div/i")
	public WebElement DatebxallowcommentsEvaluator;

	@FindBy(xpath = "//*[@id='saveInsertQuestion']")
	public WebElement Datebxaddquestion;
	
	@FindBy(xpath = "//*[@id='divIdsaveInsertQuestion']")
	public WebElement DatebxaddquestionEvaluator;

	// Question type Dropdown

	@FindBy(xpath = "//*[@id='ulmenulist']/li[4]")
	public WebElement DropdownLnk;
	
	@FindBy(xpath = "//*[contains (text, 'Dropdown')]/text")
	public WebElement checkboxBtnClkTrivia;

	@FindBy(xpath = "//*[@id='textquestiontext']")
	public WebElement Drpquestiontxt;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[2]/div/input")
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

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[11]/div/label/label/div/i")
	public WebElement Drpbxmandatory;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[12]/div/label/label/div/i")
	public WebElement Drpallowcomments;
	
	@FindBy(xpath = "//*[@id='questiondiv']/div[3]/div/label/label/div/i")
	public WebElement DrpallowcommentsEvaluator;
	
	@FindBy(xpath = "//*[@id='questiondiv']/div[3]/div/label/label/div/i")
	public WebElement DrpallowcommentsTrivia;

	@FindBy(xpath = "//*[@id='divIdsaveInsertQuestion']")
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

	
	  @FindBy(xpath = "//a[@id='menu1']/img[@class='online']") 
	  public WebElement userDrpdwnLnk;
	 

	@FindBy(xpath = "//div[@class='collapse dropdown-menu']/ul/li[8]/a")//*[@id='header']/div[3]/div/div[4]/div/ul/li[5]/a
	public WebElement logoutLnk;

	// @FindBy(xpath = "//*[@id='ulmenu']/li[2]/a/span")
	@FindBy(xpath = "//*[contains(text(),'Surveys')]")
//	@FindBy(xpath = "//*[@id='ulmenu']/li[6]/a")
//	@FindBy(xpath ="//*[@id='ulmenu']/li[(contains(@class, 'Surveys'))]/a/span")
//	@FindBy(xpath ="//*[@id='ulmenu']/li[(contains(@class, 'Surveys'))]/a")
	public WebElement surveyLnk;
	
	@FindBy(xpath = "//*[@id='ulmenu']/li[5]/a")
	public WebElement surveyLnkStaging;
	
	@FindBy(xpath = "//*[@id='ulsubmenu']/li[2]/a/span")
	public WebElement createSurveyLnk;

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

	@FindBy(xpath = "//*[@id='ulmenu']/li[2]/a/span")
	public WebElement EventLnk;

	@FindBy(xpath = "//*[@id='ulmenu']/li[7]/a/i")
	public WebElement marketPlaceLnk;

	@FindBy(xpath = "//*[@id='ulsubmenu']/li[2]/a/span")
	public WebElement createEventLnk;

	@FindBy(xpath = "//*[@id='ulmenu']/li[6]/ul/li[2]/a")
	public WebElement EventListLnk;

	@FindBy(xpath = "//*[@id='ulmenu']/li[4]/a")
	public WebElement createContactsLnk;

	@FindBy(xpath = "//*[@id='ulmenu']/li[4]/ul/li[1]/a")
	public WebElement createContarctDrpBtn;

	@FindBy(xpath = "//*[@id='ulmenu']/li[5]/a/i")
	public WebElement EmailMarketingLnk;

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
	
	  public IndexPages(WebDriver driver) { 
		  //this.driver = driver;===================================================commenting because commented webdriver global
		  // This initElements method will create all public WebElements 
	  PageFactory.initElements(driver, this); }
	 

	// logout of the portal
	public void logout(WebDriver driver) throws InterruptedException {
		
		
		System.out.println("Logout Menu Clicked");
		
		userDrpdwnLnk.click();
		//Thread.sleep(2000);
		System.out.println("Logout Clicked");
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

	@FindBy(xpath = "//*[@id='ulmenu']/li[10]/div")
	public WebElement ThreeDotsTab;
	
	@FindBy(xpath = "//*[@id='ulmenu']/li[10]/div/ul/li[2]/a")
	public WebElement marketPlaceMainLnk;


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

	public void ShippingDetails(WebDriver driver, String value) {
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

	@FindBy(id = "addnewticket")
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

	public void SetLandingPageChkBtn(WebDriver driver, String value) {
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

	public void ReturnPolicyRadioBtn(WebDriver driver,String value) {
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

	@FindBy(xpath = "//*[@id='TicketSessionTypeDiv']/div/div[1]/div")
	public WebElement SeesionTypeDrpBx;

	@FindBy(xpath = "//*[@id='TicketSessionTypeDiv']/div/div[2]/div[1]/input")
	public WebElement sessionsearch;

	@FindBy(xpath = "//*[@id='TicketSessionTypeDiv']/div/div[2]/div[2]/div[not(contains(@class, 'hidden'))]/span")
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

	@FindBy(xpath = "//*[@id='ddlticketregistaionform']")
	public WebElement AteendeeRegistrationForm;

	public void AteendeeRegistrationFormDrpDwn(String value) throws InterruptedException {
		Select select = new Select(AteendeeRegistrationForm);
		select.selectByVisibleText(value);
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//*[@id='MultipleDiv']/div/div[2]/div/div[2]/div[3]/div[2]")
	public WebElement descriptionTicketsTxtBx;

	@FindBy(xpath = "//*[@id='addnewtickets']")
	public WebElement AddTicketsBtn;

	@FindBy(xpath = "//*[@id='savecancelticket']/div/a[2]")
	public WebElement saveTicketBtn;

	// MarketPlace Services

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

	@FindBy(xpath = "//*[@id='ulmenu']/li[8]/a")
	public WebElement marketPlacestaging;
	

	@FindBy(xpath = "//*[@id='ulsubmenu']/li[2]")
	public WebElement HotelsTabLnk;

	@FindBy(xpath = "//*[@id='addnewhotel']")
	public WebElement AddNewHotelClkBtn;

	@FindBy(xpath = "//*[@id='inputhotellogo']")
	public WebElement Hotellogo;

	@FindBy(xpath = "//*[@id='btnCrop']")
	public WebElement HotelCropandProceed;

	@FindBy(xpath = "//*[@id='Hotel']/div[1]/div[2]/div/div[1]/div[1]/input")
	public WebElement HotelNameTxtBx;
	
	@FindBy(xpath = "//*[@id='selectItemtype']")
	public WebElement EventHotelType;

	public void EventHotelTypeDrpDwn(String value) {
		Select select = new Select(EventHotelType);
		select.selectByVisibleText(value);
	}

	
	@FindBy(xpath ="//*[@id='Bideventdropdown1']")
	public WebElement HoteleventDrpBx;
	
	public void HoteleventDrpBx(String value) {
		Select select = new Select(HoteleventDrpBx);
		select.selectByVisibleText(value);
	}

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
	
	
	@FindBy(xpath = "//*[@id='Hotel']/div[1]/div[3]/div/label/label/div/i")
	public WebElement Isdisplaychkbx;
	

	@FindBy(xpath = "//*[@id='hoteldescription']")
	public WebElement HotelDescriptionTxtBx;
	
	
	@FindBy(xpath = "//*[@id='textbookinglinkurl']")
	public WebElement Hotelbookinglinktxtbx;
	
	
	
	
	
	
	
	

	@FindBy(xpath = "//*[@id='checkIndividualWeightageDiv1']/i[2]")
	public WebElement NoRefundHotelRadioBtn;

	@FindBy(xpath = "//*[@id='checkEqualWeightageDiv']/i[1]")
	public WebElement RefundHotelRadioBtn;

	public void HotelReturnPolicyRadioBtn(WebDriver driver, String value) {
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

	@FindBy(xpath = "//*[@id='Hotel']/div[1]/div[9]/div/div/div/div/div[3]/div[2]")
	public WebElement CancellationPolicyHotelTxtBx;

	@FindBy(xpath = "//*[@id='Hotel']/div[1]/div[10]/div[2]/div")
	public WebElement AddRoomsHotelBtn;

	@FindBy(xpath = "//*[@id='inputroomlogo']")
	public WebElement AddRoomsHotellogo;

	@FindBy(xpath = "//*[@id='btnCrop']")
	public WebElement AddRoomsHotelCrpBtn;


	
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

	@FindBy(xpath = "//*[@id='are-u']/button")
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

	@FindBy(xpath = "//*[@id='savecancel']/a[2]")
	public WebElement EventNextBtn;

	
	@FindBy(xpath = "//*[@id='tab1']/div/div[1]/div/div[2]/div[2]/div[2]/label/label/div/span[2]")
	public WebElement EventNo;

	public void EventYesNO(WebDriver driver, String value) {
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

	@FindBy(xpath = "//*[@id='tab1']/div/div[1]/div/div[2]/div[2]/div[1]/div[2]/label/i[2]")
	public WebElement EventPublicRdBtn;

	@FindBy(xpath = "//*[@id='tab1']/div/div[1]/div/div[2]/div[2]/div[1]/div[3]/label/i[1]")
	public WebElement EventPrivateRdBtn;

	public void EventRdBtn(WebDriver driver, String value) {
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

	@FindBy(xpath = "//*[@id='savecancel']/a[2]")
	public WebElement SaveandNextBtn;

	// Event Options page

	@FindBy(xpath = "//*[@id='tab2']/div[1]/div[1]/div/div[2]/div[3]/div[2]")
	public WebElement EventDescriptionTxt;

	@FindBy(xpath = "//*[@id='tab2']/div[1]/div[2]/div/div[1]/div/label/label/div/i")
	public WebElement RemoveSpeakers;

	public void ChooseSpeaker(WebDriver driver, String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("yes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", RemoveSpeakers);
			RemoveSpeakers.click();
		} else {

		}
	}

	@FindBy(xpath = "//*[@id='tab2']/div[1]/div[2]/div/div[2]/div/label/label/div/i")
	public WebElement RemoveExhibitors;

	public void ChooseExhibitors(WebDriver driver, String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("yes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", RemoveExhibitors);
			RemoveExhibitors.click();
		} else {

		}
	}

	@FindBy(xpath = "//*[@id='tab2']/div[1]/div[2]/div/div[3]/div/label/label/div/i")
	public WebElement RemoveSponsors;

	public void ChooseSponsors(WebDriver driver, String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("yes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", RemoveSponsors);
			RemoveSponsors.click();
		} else {

		}
	}

	@FindBy(xpath = "//*[@id='tab2']/div[1]/div[2]/div/div[4]/div/label/label/div")
	public WebElement RemoveTickets;

	public void ChooseTickets(WebDriver driver, String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("yes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", RemoveTickets);
			RemoveTickets.click();
		} else {

		}
	}

	@FindBy(xpath = "//*[@id='tab2']/div[1]/div[2]/div/div[5]/div/label/label/div/i")
	public WebElement RemoveHotels;

	public void ChooseHotels(WebDriver driver, String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("yes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", RemoveHotels);
			RemoveHotels.click();
		} else {

		}
	}

	@FindBy(xpath = "//*[@id='tab2']/div[1]/div[2]/div/div[6]/div/label/label/div")
	public WebElement RemoveAttendees;

	public void ChooseAttendees(WebDriver driver, String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("yes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", RemoveAttendees);
			RemoveAttendees.click();
		} else {

		}
	}

	@FindBy(xpath = "//*[@id='txtEventUniqueCode']")
	public WebElement EasySearchCodeTxt;

	@FindBy(xpath = "//*[@id='tab2']/div[1]/div[3]/div[2]/div/div/input")
	public WebElement TagsTxt;

	@FindBy(xpath = "//*[@id='EventTypeDiv']/div/div[1]/div")
	public WebElement EventTypeDrp;

	@FindBy(xpath = "//*[@id='EventTypeDiv']/div/div[2]/div[1]/input")
	public WebElement EventTypeSearchBtn;

	@FindBy(xpath = "//*[@id='EventTypeDiv']/div/div[2]/div[2]/div[not(contains(@class, 'hidden'))]/span")
	public WebElement EventTypeChkBx;

	public void eventTypeDrpDwn(String value) throws Exception {
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

	@FindBy(xpath = "//*[@id='EventCategoryDiv']/div/div[1]/div")
	public WebElement EventCategoriesDrp;

	@FindBy(xpath = "//*[@id='EventCategoryDiv']/div/div[2]/div[1]/input")
	public WebElement EventCategoriesSearchBx;

	@FindBy(xpath = "//*[@id='EventCategoryDiv']/div/div[2]/div[2]/div[not(contains(@class, 'hidden'))]/span")
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

	@FindBy(xpath = "//*[@id='ddlSurveysEvents']")
	public WebElement EventSurveyDrp;

	public void EventSurveyDrpDwn(String value) {
		Select select = new Select(EventSurveyDrp);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='ddlEventSponsorCategory']")
	public WebElement SpeakerandSponsorCategoriesDrp;

	public void SponsorCategoriesDrpDwn(String value) {
		Select select = new Select(SpeakerandSponsorCategoriesDrp);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='tab2']/div[1]/div[5]/div[1]/div[1]/label/i[2]")
	public WebElement OneDayEventChkBx;

	@FindBy(xpath = "//*[@id='tab2']/div[1]/div[5]/div[1]/div[2]/label/i[1]")
	public WebElement MultipleDaysEventChkBx;

	public void EventDays(WebDriver driver, String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("One day")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", OneDayEventChkBx);
			OneDayEventChkBx.click();
		} else if (value.equalsIgnoreCase("Multiple days")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", MultipleDaysEventChkBx);
			MultipleDaysEventChkBx.click();
		}
	}

	// One Day

	@FindBy(xpath = "//*[@id='dvOneDay']/div[1]/div/div/input")
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

	@FindBy(xpath = "//*[@id='btnAddDateTime']")
	public WebElement AddDays;

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
	@FindBy(xpath = "//*[@id='nextsurveydetailsOpt']")
	public WebElement OptionSaveandNext;
	
	
	@FindBy(xpath = "//*[@id='savecancelopt']/div/button[2]/span[1]")
	public WebElement OptionSaveandNextDrpBtn;
	
	@FindBy(xpath = "//*[@id='DirectlyPublishEvent']")
	public WebElement OptionSaveandPublish;

	// Event Agendas page
@FindBy(xpath="//*[@id='tab3']")
public WebElement scrollDiv;
	@FindBy(xpath = "//*[@id='checkOnlyTopicDiv']/label")
	public WebElement AgendaChkBx;

	@FindBy(xpath = "//*[@id='checkOnlyExhibitorDiv']/label[1]")
	public WebElement ExhibitorChkBx;

	@FindBy(xpath = "//*[@id='checkSponsorExhibitorDiv']/label")
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
		}

	}

	@FindBy(xpath = "//*[@id='tab3']/div[2]/div[2]/ul/li[1]/a")
	public WebElement SponsorAndExhibitorBtn;
	
	@FindBy(xpath = "//*[@id='checkOnlyExhibitorDiv']/label/i[1]")
//	@FindBy(xpath = "//*[@id='tab3']/div[2]/div[2]/ul/li[2]/a")
	public WebElement ExhibitorBtn;
	
	@FindBy(xpath = "//*[@id='checkTopicDiv']/i[1]")
	public WebElement AgendasRadioBtn;
	
//	@FindBy(xpath = "//*[@id='checkOnlyTopicDiv']/label/i[1]")
	@FindBy(xpath = "//*[@id='addnewblock']")
	public WebElement AgendasAddNewBtn;
	
	@FindBy(xpath = "//*[@id='ddlsponsoredpackage']")
	public WebElement SponsorPackage;

	public void SponsorPackageDrp(String value) throws Exception {

		Select satish = new Select(SponsorPackage);
		satish.selectByValue(value);

	}

	@FindBy(xpath = "//*[@id='txtroomnumber']")
	public WebElement RoomNumber;

	@FindBy(xpath = "//*[@id='ddltopictype']")
	public WebElement SessionType;

	@FindBy(xpath = "//*[@id='ddltopictype']/option[2]")
	public WebElement SessionTypeDrpAddBtn;

	@FindBy(xpath = "//*[@id='ddltopictype']")
	public WebElement SessionTypeDrp;

	public void selectSessionTypeTopicDrp(String value) {
		Select select = new Select(SessionTypeDrp);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='txttopictype']")
	public WebElement AddSessionTypeTxtBx;

	@FindBy(xpath = "//*[@id='Adddesignation']")
	public WebElement AddSessionTypeBtn;

	@FindBy(xpath = "//*[@id='TopicdateDiv']/div/div[1]")
	public WebElement TopicDateDrp;

	@FindBy(xpath = "//*[@id='TopicdateDiv']/div/div[2]/div[1]/input")
	public WebElement TopicDateSearchBx;

//	@FindBy(xpath = "//*[@id='TopicdateDiv']/div/div[2]/div[not(contains(@class, 'hidden'))]/span")
	@FindBy(xpath = "//*[@id='TopicdateDiv']/div/div[2]/div[not(contains(@class, 'hidden'))]/div/span/i")
	public WebElement TopicDateChkBx;

	public void TopicDateDrpDwn(String value) throws Exception {
		TopicDateDrp.click();
		Thread.sleep(2000);
		String strMain = value;
		String[] arrSplit = strMain.split(",");
		for (int i = 0; i < arrSplit.length; i++) {
			TopicDateSearchBx.sendKeys(arrSplit[i].trim());
			TopicDateChkBx.click();
			Thread.sleep(2000);
			TopicDateSearchBx.clear();
			// Thread.sleep(4000);
		}
	}

	@FindBy(xpath = "//*[@id='texttimetoreachfromTPC']")
	public WebElement TopicsStartTime;

	@FindBy(xpath = "//*[@id='texttimetoreachToTPC']")
	public WebElement TopicsEndTime;

	@FindBy(xpath = "//*[@id='filedocumentnameSponsor']")
	public WebElement Sponsorlogo;

	@FindBy(xpath = "//*[@id='modalSponsorLogoimagecrop']/div/div/div[3]/button[2]")
	public WebElement EventTopicImageCrop;

	@FindBy(xpath = "//*[@id='tab3']/div[2]/div[1]/div[2]/div/div[2]/div/div[2]/div/div[5]/input")
	public WebElement SponsorCompanyName;

	@FindBy(xpath = "//*[@id='txtTopicName']")
	public WebElement Title;

	@FindBy(xpath = "//*[@id='txtTopicDescription']")
	public WebElement TopicDescription;

	@FindBy(xpath = "//*[@id='txtTopicuniqueCode']")
	public WebElement EasySearchCode;

	@FindBy(xpath = "//*[@id='ddlSurveys']")
	public WebElement TopicsSurvey;

	public void TopicsSurveyDrpDwn(String value) throws Exception {

		Select satish = new Select(TopicsSurvey);
		satish.deselectByValue(value);

	}

	@FindBy(xpath = "//*[@id='tab3']/div[2]/div[1]/div[1]/div/div/div[2]/div/button[1]")
	public WebElement TopicSaveBtn;
	
	@FindBy(xpath = "//*[@id='btnsaveTopics']")
	public WebElement AgendaSaveBtn;

	@FindBy(xpath = "//*[@id='savecancel1']/div/button[1]")
	public WebElement AgendaOrgSponsorTopicNextBtn;
	

	@FindBy(xpath = "//*[@id='savecancel1']/div/button[1]")
	public WebElement TopicNextBtnExhibitors;

	// Events Add Presenter

	@FindBy(xpath = "//*[@id='addtopicspeaker']/span")
	public WebElement AddPresenterBtn;
	
	@FindBy(xpath = "//*[@id='add-spea']/div[1]/h4/a")
	public WebElement AddPresenterCloseBtn;
	
	@FindBy(xpath = "//*[@id='myModalNewSpeaker']/a")
	public WebElement AddSpeakerCloseBtn;

	@FindBy(xpath = "//*[@id='filedocumentname1']")
	public WebElement PresenterImg;

	@FindBy(xpath = "//*[@id='modalskprimagecrop']/div/div/div[3]/button[2]")
	public WebElement PresenterImageCrop;

	@FindBy(xpath = "//*[@id='txtName']")
	public WebElement PresenterName;

	@FindBy(xpath = "//*[@id='txtTitle']")
	public WebElement PresenterTitle;

	@FindBy(xpath = "//*[@id='txtSpeakerEmailId']")
	public WebElement PresenterEmailid;

	@FindBy(xpath = "//*[@id='txtSpeakerPhoneNumber']")
	public WebElement PresenterPhone;

	@FindBy(xpath = "//*[@id='ddlSpeakerType']")
	public WebElement PresenterType;

	@FindBy(xpath = "//*[@id='txtDescription']")
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
	
	@FindBy(xpath = "//*[@id='txtDescription']")
	public WebElement ExhibitorPresenterDescription;
	
	@FindBy(xpath = "//*[@id='Labelcheckprimarycontact']/div/i")
	public WebElement PrimaryContactChkBx;

	public void PrimaryContactChkBx(WebDriver driver,String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("yes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", PrimaryContactChkBx);
			PrimaryContactChkBx.click();
		} else {

		}
	}

	@FindBy(xpath = "//*[@id='add-spea']/div[2]/div/div/div[1]/div[1]/div/div[4]/label/label/div/i")
	public WebElement PublishTOWebsiteChkBx;

	public void PublishTOWebsiteChkBx(WebDriver driver,String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("yes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", PublishTOWebsiteChkBx);
			PublishTOWebsiteChkBx.click();
		} else {

		}
	}

	@FindBy(xpath = "//*[@id='add-spea']/div[2]/div/div/div[1]/div[1]/div/div[5]/label/label/div/i")
	public WebElement SendRegisterationLinKChkBx;

	public void SendRegisterationLinKChkBx(WebDriver driver, String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("yes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", SendRegisterationLinKChkBx);
			SendRegisterationLinKChkBx.click();
		} else {

		}
	}

	@FindBy(xpath = "//*[@id='mCSB_2_container']/div/div[1]/div/div[7]/div/input")
	public WebElement VideoLnk;

	@FindBy(xpath = "//*[@id='btnSaveSpeaker']")
	public WebElement PresenterSaveBtn;

	@FindBy(xpath = "//*[@id='btnPublishTopics']")
	public WebElement NextBtn;

	// Web element for Speakers

	@FindBy(xpath = "//*[@id='addtopicspeaker']")
	public WebElement SpeakerBtn;

	@FindBy(xpath = "//*[@id='filedocumentname1']")
	public WebElement SpeakerImage;

	@FindBy(xpath = "//*[@id='modalskprimagecrop']/div/div/div[3]/button[2]")
	public WebElement SpeakerImageCrop;

	@FindBy(xpath = "//*[@id='txtName']")
	public WebElement SpeakerNameTxt;

	@FindBy(xpath = "//*[@id='txtTitle']")
	public WebElement SpeakerTitle;

	@FindBy(xpath = "//*[@id='txtSpeakerEmailId']")
	public WebElement SpeakerEmailid;

	@FindBy(xpath = "//*[@id='txtSpeakerPhoneNumber']")
	public WebElement SpeakerPhone;

	@FindBy(xpath = "//*[@id='txtSpkrCompany']")
	public WebElement SpeakerCompany;

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

	@FindBy(xpath = "//*[@id='ticketsdiv']/div[2]/div/div[1]/div/div/div/div[1]/label/i[2]")
	public WebElement NoRefundChkBx;
	
	@FindBy(xpath = "//*[@id='ticketsdiv']/div[2]/div/div[1]/div/div/div/div[2]/label/i[1]")
	public WebElement RefundWithConditionChkBx;

	public void RefundRadioBtn(WebDriver driver,String value) {
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

	@FindBy(xpath = "//*[@id='tab4']/div[3]/div[2]/div")
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

	@FindBy(xpath = "//*[@id='TicketSessionTypeDiv']/div/div[2]/div[1]/input")
	public WebElement SessionSearchBx;

	@FindBy(xpath = "//*[@id='TicketSessionTypeDiv']/div/div[2]/div[2]/div[not(contains(@class, 'hidden'))]/span")
	public WebElement SessionChkBx;

	public void EventSessionTypeDrpDwn(String value) throws Exception {

		TicketsSessionTypeDrp.click();
		Thread.sleep(2000);
		String strMain = value;
		String[] arrSplit = strMain.split(",");
		for (int i = 0; i < arrSplit.length; i++) {
			SessionSearchBx.sendKeys(arrSplit[i].trim());
			SessionChkBx.click();
			Thread.sleep(2000);

		}
	}

	@FindBy(xpath = "//*[@id='TicketSessionTypeDiv']/div/div[2]/div[2]/div[1]")
	public WebElement AddnewBtn;

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

	public void SaveTemplateChkBx(WebDriver driver, String value) {
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

	public void SetLandingurlChkBx(WebDriver driver, String value) {
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

	public void AutoEvaluationChkBx(WebDriver driver, String value) {
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

	public void QuizDuration(WebDriver driver, String value) {
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

	public void GeneralQuizAndTrivia(WebDriver driver,String value) {
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

	public void weightageRadioBtn(WebDriver driver, String value) {
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

	@FindBy(xpath = "//*[@id='ulmenulist']/li[5]")
	public WebElement Fileupload;

	@FindBy(xpath = "//*[@id='textquestiontext']")
	public WebElement Filequestiontxt;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[3]/div/input")
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

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[11]/div/label/label/div/i")
	public WebElement Filemandatory;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[12]/div/label/label/div/i")
	public WebElement Fileallowcomments;
	
	@FindBy(xpath = "//*[@id='questiondiv']/div[3]/div/label/label/div/i")
	public WebElement FileallowcommentsEvaluator;

	@FindBy(xpath = "//*[@id='divIdsaveInsertQuestion']")
	public WebElement Fileaddquestion;

	// Survey Question type Group Scaling

	@FindBy(xpath = "//*[@id='ulmenulist']/li[6]")
	public WebElement GroupscalingBtn;

	@FindBy(xpath = "//*[@id='textquestiontext']")
	public WebElement Groupquestiontxt;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[3]/div/input")
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

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[11]/div/label/label/div/i")
	public WebElement Grpmandatory;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[12]/div/label/label/div/i")
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


	@FindBy(xpath = "//*[@id='ulmenulist']/li[7]")
	public WebElement Imgpoll;

	@FindBy(xpath = "//*[@id='textquestiontext']")
	public WebElement Imgquestiontxt;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[3]/div/input")
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

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[11]/div/label/label/div/i")
	public WebElement Imgmandatory;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[12]/div/label/label/div/i")
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

	
	@FindBy(xpath = "//*[@id='ulmenulist']/li[11]")
	public WebElement ImgwithText;

	@FindBy(xpath = "//*[@id='textquestiontext']")
	public WebElement ImgTextquestiontxt;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[3]/div/input")
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

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[11]/div/label/label/div/i")
	public WebElement ImgTextmandatory;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[12]/div/label/label/div/i")
	public WebElement ImgTextallowcomments;
	
	@FindBy(xpath = "//*[@id='questiondiv']/div[3]/div/label/label/div/i")
	public WebElement ImgTextallowcommentsEvaluator;

	@FindBy(xpath = "//*[@id='divIdsaveInsertQuestion']")
	public WebElement ImgTextaddquestion;

	// Survey Multiple Select dropdown question type

	@FindBy(xpath = "//*[@id='ulmenulist']/li[8]")
	public WebElement MultipleSelectdropdown;
	
	@FindBy(xpath = "//*[@id='Fieldtype']/ul/li[8]/a/text")
	public WebElement MultipleSelectdropdownTrivia;

	@FindBy(xpath = "//*[@id='textquestiontext']")
	public WebElement Multiplequestiontxt;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[3]/div/input")
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

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[11]/div/label/label/div/i")
	public WebElement Multiplemandatory;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[12]/div/label/label/div/i")
	public WebElement Multipleallowcomments;
	
	@FindBy(xpath = "//*[@id='questiondiv']/div[3]/div/label/label/div/i")
	public WebElement MultipleallowcommentsEvaluator;
	
	@FindBy(xpath = "//*[@id='questiondiv']/div[3]/div/label/label/div/i")
	public WebElement MultipleallowcommentsTrivia;

	@FindBy(xpath = "//*[@id='DoesShowresultDiv']/div/label/label/div/i")
	public WebElement Multipleshowquestions;

	@FindBy(xpath = "//*[@id='divIdsaveInsertQuestion']")
	public WebElement Multipleaddquestion;
	
	@FindBy(xpath = "//*[@id='divIdsaveInsertQuestion']")
	public WebElement MultipleaddquestionTrivia;

	// Survey Multiple Textboxes question type

	@FindBy(xpath = "//*[@id='ulmenulist']/li[9]")
	public WebElement MultipleTextboxes;

	@FindBy(xpath = "//*[@id='textquestiontext']")
	public WebElement MultipleTextquestiontxt;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[3]/div/input")
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

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[11]/div/label/label/div/i")
	public WebElement MultipleTextmandatory;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[12]/div/label/label/div/i")
	public WebElement MultipleTextallowcomments;
	
	@FindBy(xpath = "//*[@id='questiondiv']/div[3]/div/label/label/div/i")
	public WebElement MultipleTextallowcommentsEvaluator;

	@FindBy(xpath = "//*[@id='divIdsaveInsertQuestion']")
	public WebElement MultipleTextaddquestion;

	// Survey NPS Score question type

	@FindBy(xpath = "//*[@id='ulmenulist']/li[16]")
	public WebElement NPSScoreBtn;

	@FindBy(xpath = "//*[@id='textquestiontext']")
	public WebElement NPSQuestionText;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[3]/div/input")
	public WebElement NPSTags;

	@FindBy(xpath = "//*[@id='ddlQuestionGroupsforaddquestion']")
	public WebElement NPSQuestionGroup;

	public void selectNPSQuestionGroup(String value) {
		Select select = new Select(NPSQuestionGroup);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='Textlabel']")
	public WebElement NPSLabelText;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[11]/div/label/label/div/i")
	public WebElement NPSIsMandatory;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[12]/div/label/label/div/i")
	public WebElement NPSAllowcomments;

	@FindBy(xpath = "//*[@id='DoesShowresultDiv']/div/label/label/div/i")
	public WebElement NPSShowthisquestion;

	@FindBy(xpath = "//*[@id='saveInsertQuestion']")
	public WebElement NPSAddquestion;

	// Survey Number Question type

	@FindBy(xpath = "//*[@id='ulmenulist']/li[10]")
	public WebElement NumberBtn;

	@FindBy(xpath = "//*[@id='textquestiontext']")
	public WebElement Numberquestiontxt;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[3]/div/input")
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

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[11]/div/label/label/div/i")
	public WebElement Numbermandatory;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[12]/div/label/label/div/i")
	public WebElement Numberallowcomments;
	
	@FindBy(xpath = "//*[@id='questiondiv']/div[3]/div/label/label/div/i")
	public WebElement NumberallowcommentsEvaluator;

	@FindBy(xpath = "//*[@id='divIdsaveInsertQuestion']")
	public WebElement Numberaddquestion;

	// Survey Radio Button Question type

	@FindBy(xpath = "//*[@id='ulmenulist']/li[12]")
	public WebElement RadioButton;
	
	@FindBy(xpath = "//*[@id='Fieldtype']/ul/li[12]/a/text")
	public WebElement RadioButtonTrivia;

	@FindBy(xpath = "//*[@id='textquestiontext']")
	public WebElement Radioquestiontxt;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[3]/div/input")
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
	
	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[11]/div/label/label/div/i")
	public WebElement Radiomandatory;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[12]/div/label/label/div/i")
	public WebElement Radioallowcomments;
	
	@FindBy(xpath = "//*[@id='questiondiv']/div[3]/div/label/label/div/i")
	public WebElement RadioallowcommentsEvaluator;
	
	@FindBy(xpath = "//*[@id='questiondiv']/div[3]/div/label/label/div/i")
	public WebElement RadioallowcommentsTrivia;

	@FindBy(xpath = "//*[@id='DoesShowresultDiv']/div/label/label/div/i")
	public WebElement Radioshowquestions;

	@FindBy(xpath = "//*[@id='divIdsaveInsertQuestion']")
	public WebElement RadioaddquestionBtn;
	
	@FindBy(xpath = "//*[@id='divIdsaveInsertQuestion']")
	public WebElement RadioaddquestionBtnTrivia;
	
	
	// Survey Scale Rate question type

	@FindBy(xpath = "//*[@id='ulmenulist']/li[13]")
	public WebElement ScaleRateTabClk;

	@FindBy(xpath = "//*[@id='textquestiontext']")
	public WebElement Scalequestiontxt;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[3]/div/input")
	public WebElement Scaletags;

	@FindBy(xpath = "//*[@id='ddlQuestionGroupsforaddquestion']")
	public WebElement Scalequestiongroup;

	public void selectScalequestiongroup(String value) {
		Select select = new Select(Scalequestiongroup);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='Textlabel']")
	public WebElement ScaleLabelText;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[11]/div/label/label/div/i")
	public WebElement Scalemandatory;

	@FindBy(xpath = "//*[@id='questiondiv']/div[3]/div/label/label/div/i")
	public WebElement Scaleallowcomments;

	@FindBy(xpath = "//*[@id='DoesShowresultDiv']/div/label/label/div/i")
	public WebElement Scaleshowquestions;

	@FindBy(xpath = "//*[@id='divIdsaveInsertQuestion']")
	public WebElement Scaleaddquestion;
	

	// Survey Single line question type

	@FindBy(xpath = "//*[@id='ulmenulist']/li[14]")
	public WebElement SinglelineText;

	@FindBy(xpath = "//*[@id='textquestiontext']")
	public WebElement Singlelinequestiontxt;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[3]/div/input")
	public WebElement Singlelinetags;

	@FindBy(xpath = "//*[@id='ddlQuestionGroupsforaddquestion']")
	public WebElement Singlelinequestiongroup;

	public void selectSinglelinequestiongroup(String value) {
		Select select = new Select(Singlelinequestiongroup);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='Textlabel']")
	public WebElement SinglelineLabelText;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[11]/div/label/label/div/i")
	public WebElement Singlelinemandatory;

	@FindBy(xpath = "//*[@id='questiondiv']/div[3]/div/label/label/div/i")
	public WebElement Singlelineallowcomments;

	@FindBy(xpath = "//*[@id='divIdsaveInsertQuestion']")
	public WebElement Singlelineaddquestion;
	
	

	// Survey Text area question type

	@FindBy(xpath = "//*[@id='ulmenulist']/li[15]")
	public WebElement TextArea;

	@FindBy(xpath = "//*[@id='textquestiontext']")
	public WebElement Textareaquestiontxt;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[3]/div/input")
	public WebElement Textareatags;

	@FindBy(xpath = "//*[@id='ddlQuestionGroupsforaddquestion']")
	public WebElement Textareaquestiongroup;

	public void selectTextareaquestiongroup(String value) {
		Select select = new Select(Textareaquestiongroup);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='Textlabel']")
	public WebElement TextareaLabelText;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[11]/div/label/label/div/i")
	public WebElement Textareamandatory;

	@FindBy(xpath = "//*[@id='questiondiv']/div[3]/div/label/label/div/i")
	public WebElement Textareaallowcomments;

	@FindBy(xpath = "//*[@id='divIdsaveInsertQuestion']")
	public WebElement Textareaaddquestion;

	// Survey Yes or No quesiton type

	@FindBy(xpath = "//*[@id='ulmenulist']/li[16]")
	public WebElement YesorNo;

	@FindBy(xpath = "//*[@id='textquestiontext']")
	public WebElement Yesquestiontxt;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[3]/div/input")
	public WebElement Yestags;

	@FindBy(xpath = "//*[@id='ddlQuestionGroupsforaddquestion']")
	public WebElement Yesquestiongroup;

	public void selectYesquestiongroup(String value) {
		Select select = new Select(Yesquestiongroup);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='Textlabel']")
	public WebElement YesLabelText;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[11]/div/label/label/div/i")
	public WebElement Yesmandatory;

	@FindBy(xpath = "//*[@id='questiondiv']/div[3]/div/label/label/div/i")
	public WebElement Yesallowcomments;

	@FindBy(xpath = "//*[@id='divIdsaveInsertQuestion']")
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
	
	@FindBy(xpath = "//*[@id='settings']/div[2]/div[1]/div[1]/button[2]")
	public WebElement RewardsPageSkipAndPublishDrpDwn;
	
	@FindBy(xpath = "//*[@id='skiprewardssavebutton']")
	public WebElement RewardsPageSkipAndPublishBtn;
	
	@FindBy(xpath = "//*[@id='modalsurveyupgrade']/div/div/div[3]/a")
	public WebElement RewardsBillingProceedBtn;
}
























