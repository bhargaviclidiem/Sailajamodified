package SurveyPage_PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SurveyQuestionsPage {

	WebDriver driver;
	JavascriptExecutor jse;

	// constructor for initializing the class objects

	public SurveyQuestionsPage(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all public WebElements
		PageFactory.initElements(driver, this);
	}

	// WebElements for Create Survey Details Page

	/*
	 * @FindBy(xpath = "//*[@id='textquestionariename']") public WebElement
	 * surveyNameTxtbx;
	 * 
	 * @FindBy(xpath = "//*[@id='textdescription']") public WebElement
	 * descriptionTxtArea;
	 * 
	 * @FindBy(xpath = "//*[@id='selectcategory']") public WebElement
	 * surveyCategoryDrpdwn;
	 * 
	 * public void selectCategory(String value) { Select select = new
	 * Select(surveyCategoryDrpdwn); select.selectByVisibleText(value); }
	 * 
	 * @FindBy(xpath = "//*[@id='divlang']/div/div[1]/div") public WebElement
	 * languagesBtn;
	 * 
	 * @FindBy(xpath = "//*[@id='selectlanguage']") public WebElement
	 * languagesDrpdwn;
	 * 
	 * @FindBy(xpath = "//*[@id='divlang']/div/div[2]/div[1]/input") public
	 * WebElement languagesSearch;
	 * 
	 * @FindBy(xpath =
	 * "//*[@id='divlang']/div/div[2]/div[2]/div[not(contains(@class, 'hidden'))]/span"
	 * ) public WebElement languagesSearchChkbx;
	 * 
	 * public void selectLanguage(String value) throws Exception {
	 * languagesBtn.click(); Thread.sleep(2000); String strMain = value;
	 * String[] arrSplit = strMain.split(","); for (int i = 0; i <
	 * arrSplit.length; i++) { languagesSearch.sendKeys(arrSplit[i].trim());
	 * languagesSearchChkbx.click(); Thread.sleep(2000);
	 * languagesSearch.clear(); Thread.sleep(4000); } }
	 * 
	 * @FindBy(xpath = "//*[@id='divlang']/label/span/a") public WebElement
	 * configureLnk;
	 * 
	 * @FindBy(xpath =
	 * "//*[@id='addnewquestionnaire']/div[3]/div/div[1]/div/label/label/div/i")
	 * public WebElement allowAnonymousResChkBx;
	 * 
	 * @FindBy(xpath =
	 * "//*[@id='addnewquestionnaire']/div[3]/div/div[2]/div/label/label/div/i")
	 * public WebElement saveAsTemplateChkBx;
	 * 
	 * @FindBy(xpath = "//*[@id='texttemplatename']") public WebElement
	 * saveAsTemplateTxBx;
	 * 
	 * @FindBy(xpath =
	 * "//*[@id='addnewquestionnaire']/div[3]/div/div[3]/div/label/label/div/i")
	 * public WebElement setYourOwnLandPageUrlChkBx;
	 * 
	 * @FindBy(xpath = "//*[@id='textlandingpage']") public WebElement
	 * setYourOwnLandPageUrlTxBx;
	 * 
	 * @FindBy(xpath =
	 * "//*[@id='addnewquestionnaire']/div[3]/div/div[4]/div/label/label/div/i")
	 * public WebElement randomizeQuestionChkBx;
	 * 
	 * @FindBy(xpath =
	 * "//*[@id='addnewquestionnaire']/div[3]/div/div[5]/div/label/label/div/i")
	 * public WebElement randomizePagesChkBx;
	 * 
	 * @FindBy(xpath = "//*[@id='nextsurveydetails']") public WebElement
	 * detailaveNextBtn;
	 */

	// New Questions group is created in Question page

	@FindBy(xpath = "//*[@id='addNewQuestionModal']/div/div/div[2]/form/div[5]/button[2]")
	public WebElement Addbtn;

	@FindBy(xpath = "//*[@id='ddlQuestionGroupsforaddquestion']")
	public WebElement questionGroupDrp;

	@FindBy(xpath = "//*[@id='ddlQuestionGroupsforaddquestion']/option[1]")
	public WebElement AddNew;

	@FindBy(xpath = "//*[@id='txtNewQuestion']")
	public WebElement NewgroupTxtBx;

	@FindBy(xpath = "//*[@id='txtNewQuestionNotes']")
	public WebElement Notes;

	/*
	 * @FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[1]/h1/a") public
	 * WebElement QuestoinTypeCloseBtn;
	 */

	// PREMIUM FEATURES in Question Page

	@FindBy(xpath = "//*[@id='ulmenulist']/li[1]")
	public WebElement instructionsClk;

	/*
	 * @FindBy(xpath = "//*[@id='divconfirm']/div/div/div[3]/div[3]/div[2]")
	 * public WebElement instructiondescription;
	 * 
	 * @FindBy(xpath = "//*[@id='AddquestionDiv']/div[1]") public WebElement
	 * reset;
	 * 
	 * @FindBy(xpath = "//*[@id='savetexins']") public WebElement
	 * addinstructions;
	 * 
	 * @FindBy(xpath = "//*[@id='previewquestionaire']") public WebElement
	 * saveandnext;
	 */

	@FindBy(xpath = "//*[@id='ulmenulist']/li[2]")
	public WebElement pagebreakClk;

	// QUICK ELEMENTS in Question Page

	@FindBy(xpath = "//*[@id='ulmenulist']/li[3]")
	public WebElement AmountQuestionClk;

	@FindBy(xpath = "//*[@id='ulmenulist']/li[4]")
	public WebElement checkboxQuestionClk;

	@FindBy(xpath = "//*[@id='ulmenulist']/li[5]")
	public WebElement dateQuestionClk;

	@FindBy(xpath = "//*[@id='ulmenulist']/li[6]")
	public WebElement dropdownQuestionClk;

	@FindBy(xpath = "//*[@id='ulmenulist']/li[7]")
	public WebElement fileuploadQuestionClk;

	@FindBy(xpath = "//*[@id='ulmenulist']/li[8]")
	public WebElement groupscalingQuestionClk;

	@FindBy(xpath = "//*[@id='ulmenulist']/li[9]")
	public WebElement imgpollQuestionClk;

	@FindBy(xpath = "//*[@id='ulmenulist']/li[10]")
	public WebElement imgwithtextQuestionClk;

	@FindBy(xpath = "//*[@id='ulmenulist']/li[11]")
	public WebElement multipleselectdrpdwnQuestionClk;

	@FindBy(xpath = "//*[@id='ulmenulist']/li[12]")
	public WebElement multipletextbxQuestionClk;

	@FindBy(xpath = "//*[@id='ulmenulist']/li[13]")
	public WebElement npsscoreQuestionClk;

	@FindBy(xpath = "//*[@id='ulmenulist']/li[14]")
	public WebElement NumberQuestionClk;

	@FindBy(xpath = "//*[@id='ulmenulist']/li[15]")
	public WebElement radiobtnQuestionClk;

	@FindBy(xpath = "//*[@id='ulmenulist']/li[16]")
	public WebElement scalerateQuestionClk;

	@FindBy(xpath = "//*[@id='ulmenulist']/li[17]")
	public WebElement singlelinetextQuestionClk;

	@FindBy(xpath = "//*[@id='ulmenulist']/li[18]")
	public WebElement TextareaQuestionClk;

	@FindBy(xpath = "//*[@id='ulmenulist']/li[19]")
	public WebElement yesornoQuestionClk;

	// FORM ELEMENTS (FEATURE) in Question Page

	@FindBy(xpath = "//*[@id='ulmenulist']/li[20]")
	public WebElement nameQuestionClk;

	@FindBy(xpath = "//*[@id='ulmenulist']/li[21]")
	public WebElement emailQuestionClk;

	@FindBy(xpath = "//*[@id='ulmenulist']/li[22]")
	public WebElement addressQuestionClk;

	@FindBy(xpath = "//*[@id='ulmenulist']/li[23]")
	public WebElement passwordQuestionClk;

	@FindBy(xpath = "//*[@id='ulmenulist']/li[24]")
	public WebElement phoneQuestionClk;

	@FindBy(xpath = "//*[@id='previewquestionaire']")
	public WebElement SaveAndNextBtnQP;

	// New Questions pop up

	@FindBy(xpath = "//*[@id='textquestiontext']")
	public WebElement QuestionTextBxQP;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[2]/div/input")
	public WebElement TagsTxtBxQP;

	public void questionGroupDrpDwnQP(String value) {
		Select select = new Select(questionGroupDrp);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='Textlabel']")
	public WebElement EnterLabelTextoptionalTxtBxQP;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[8]/div/label/label/div/i")
	public WebElement IsMandatoryChkBxQP;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[9]/div/label/label/div/i")
	public WebElement AllowCommentsChkBxQP;

	@FindBy(xpath = "//*[@id='AddquestionDiv']/div[1]/a")
	public WebElement RestBtnQP;

	@FindBy(xpath = "//*[@id='saveInsertQuestion']")
	public WebElement AddQuestionBtnQP;

	// Question Logic Page

	/*
	 * @FindBy(xpath = "//*[@id='questionlogic']/div[2]/div/div/button[1]/i")
	 * public WebElement NextBtnQLP;
	 */

	// Preview & Customize Page

	@FindBy(xpath = "//*[@id='savecancel']/div[1]/button[1]/i[1]")
	public WebElement SaveAndNextPCP;

	// Rewards Page

	@FindBy(xpath = "//*[@id='savecancel']/div[1]/button[1]/i")
	public WebElement SaveAndPublishRP;

	@FindBy(xpath = "//*[@id='skiprewardssavebutton']")
	public WebElement SkipAndPublishRP;

	// Question Text *
	// Tags
	// Question Group *
	// Enter Label Text (optional)
	// Number Of Options *
	// 1,2,3 to 10

	// Select File Types *
	// Labels 1
	// Labels 2

	// Is Mandatory
	// Allow Comments
	// Reset button
	// +Addquestions button

	// WebElements for Create Survey Details Page

	@FindBy(xpath = "//*[@id='inputsurveyimagefile1']")
	public WebElement surveyimg;

	@FindBy(xpath = "//*[@id='btnCrop']")
	public WebElement cropbtn;

	
	
	
	@FindBy(xpath = "//*[@id='addnewquestionnaire']/div[2]/div/div[1]/div/div/div[1]/label/i[1]")
	public WebElement surveyrdbtn;
	
	@FindBy(xpath = "//*[@id='addnewquestionnaire']/div[2]/div/div[1]/div/div/div[2]/label/span")
	public WebElement Formrdbtn;
	
	
	
	
	
	
	
	@FindBy(xpath = "//*[@id='textquestionariename']")
	public WebElement surveyNameTxtbx;

	@FindBy(xpath = "//*[@id='textdescription']")
	public WebElement descriptionTxtArea;

	@FindBy(xpath = "//*[@id='selectcategory']")
	public WebElement surveyCategoryDrpdwn;

	public void selectCategory(String value) {
		Select select = new Select(surveyCategoryDrpdwn);
		select.selectByVisibleText(value);
	}
	
	@FindBy(xpath = "//*[@id='selectformtype']")
	public WebElement FormCategoryDrpdwn;

	public void FormCategoryDrpdwn(String value) {
		Select select = new Select(FormCategoryDrpdwn);
		select.selectByVisibleText(value);
	}
	
	
	
	
	
	
	
	
	

	@FindBy(xpath = "//*[@id='divlang']/div/div[1]/div")
	public WebElement languagesBtn;

	@FindBy(xpath = "//*[@id='selectlanguage']")
	public WebElement languagesDrpdwn;

	@FindBy(xpath = "//*[@id='divlang']/div/div[2]/div[1]/input")
	public WebElement languagesSearch;

	@FindBy(xpath = "//*[@id='divlang']/div/div[2]/div[2]/div[not(contains(@class, 'hidden'))]/span")
	public WebElement languagesSearchChkbx;

	public void selectLanguage(String value) throws Exception {

		languagesBtn.click();
		Thread.sleep(2000);
		String strMain = value;
		String[] arrSplit = strMain.split(",");
		for (int i = 0; i < arrSplit.length; i++) {
			languagesSearch.sendKeys(arrSplit[i].trim());
			languagesSearchChkbx.click();
			Thread.sleep(2000);
			// languagesSearch.clear();
			// Thread.sleep(4000);
		}
	}

	@FindBy(xpath = "//*[@id='divlang']/label/span/a")
	public WebElement configureLnk;

	@FindBy(xpath = "//*[@id='addnewquestionnaire']/div[3]/div/div[1]/div/label/label/div/i")
	public WebElement allowAnonymousResChkBx;

	public void allowAnonymousResChkBx(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("yes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", allowAnonymousResChkBx);
			allowAnonymousResChkBx.click();
		} else {

		}
	}

	@FindBy(xpath = "//*[@id='addnewquestionnaire']/div[3]/div/div[2]/div/label/label/div/i")
	public WebElement saveAsTemplateChkBx;

	public void saveAsTemplateChkBx(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("yes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", saveAsTemplateChkBx);
			saveAsTemplateChkBx.click();
		} else {

		}
	}

	@FindBy(xpath = "//*[@id='texttemplatename']")
	public WebElement saveAsTemplateTxBx;

	@FindBy(xpath = "//*[@id='addnewquestionnaire']/div[3]/div/div[3]/div/label/label/div/i")
	public WebElement setYourOwnLandPageUrl;

	public void setYourOwnLandPageUrlChkBx(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("yes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", setYourOwnLandPageUrl);
			setYourOwnLandPageUrl.click();
		} else {

		}
	}

	@FindBy(xpath = "//*[@id='textlandingpage']")
	public WebElement setYourOwnLandPageUrlTxBx;

	@FindBy(xpath = "//*[@id='addnewquestionnaire']/div[3]/div/div[4]/div/label/label/div/i")
	public WebElement randomizeQuestion;

	public void randomizeQuestionChkBx(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("yes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", randomizeQuestion);
			randomizeQuestion.click();
		} else {

		}
	}

	@FindBy(xpath = "//*[@id='addnewquestionnaire']/div[3]/div/div[5]/div/label/label/div/i")
	public WebElement randomizePages;

	public void randomizePagesChkBx(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("yes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", randomizePages);
			randomizePages.click();
		} else {

		}
	}

	@FindBy(xpath = "//*[@id='addnewquestionnaire']/div[3]/div/div[6]/div/label/label/div")
	public WebElement ValidateEmail;

	public void ValidateEmailChkBx(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("yes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", ValidateEmail);
			ValidateEmail.click();
		} else {

		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath = "//*[@id='ResponceCrm']/div[1]/label/label/div/i")
	public WebElement SaveCRMchkbx;
	
	@FindBy(xpath = "//*[@id='selectContactgroupofCrm']")
	public WebElement SaveCRMdrpdwn;
	
	public void selectSaveCRMdrpdwn(String value) {
		Select select = new Select(SaveCRMdrpdwn);
		select.selectByVisibleText(value);
	}
	
	
	@FindBy(xpath = "//*[@id='selectContactgroupofCrm']/option[1]")
	public WebElement SaveCRMAddnew;
	
	@FindBy(xpath = "//*[@id='txtgroupname1']")
	public WebElement addnewnametxtbx;
	
	
	@FindBy(xpath = "//*[@id='txtgroupnotes1']")
	public WebElement addnewnotestxtbx;
	
	@FindBy(xpath = "//*[@id='Adddesignation3']")
	public WebElement addnewbtn;
	
	@FindBy(xpath = "//*[@id='ResponceCrm1']/div[1]/label/label/div/i")
	public WebElement SaveresponseEmailchkbx;
	
	@FindBy(xpath = "//*[@id='selectuserdiv']/div/div[1]/div")
	public WebElement SaveResponsedrpdwn;
	
	@FindBy(xpath = "//*[@id='selectuserdiv']/div/div[2]/div[1]/input")
	public WebElement Saveresponsesearchbx;
	
	@FindBy(xpath = "//*[@id='selectuserdiv']/div/div[2]/div[2]/div[not(contains(@class, 'hidden'))]/span/i")
	public WebElement Saveresponsechkbx;
	
	
	public void Saveresponseemail(String value) throws Exception {
		SaveResponsedrpdwn.click();
				Thread.sleep(2000);
				String strMain = value;
				    String[] arrSplit = strMain.split(",");
				    for (int i=0; i < arrSplit.length; i++)
				    {
				    	Saveresponsesearchbx.sendKeys(arrSplit[i].trim());
				    	Saveresponsechkbx.click();
				    	Thread.sleep(2000);
				    	SaveResponsedrpdwn.click();
				    	 Thread.sleep(2000);
				    			     }
					}

	
	//is this survey
	
	@FindBy(xpath = "//*[@id='eventsurvey']/div/div[1]/label/i[1]")
	public WebElement Eventrdbtn;
	
	@FindBy(xpath = "//*[@id='eventsurvey']/div/div[2]/label/i[1]")
	public WebElement Rewardsrdbtn;
	
	@FindBy(xpath = "//*[@id='eventsurvey']/div/div[3]/label/i[2]")
	public WebElement Nonerdbtn;
	
	public void isthissurveyRdBtn(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("Event")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", Eventrdbtn);
			Eventrdbtn.click();
		} else if (value.equalsIgnoreCase("Rewards")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", Rewardsrdbtn);
			Rewardsrdbtn.click();
		} else if (value.equalsIgnoreCase("None")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", Nonerdbtn);
			Nonerdbtn.click();
			
			
			
		}
	}
	

	
	@FindBy(xpath = "//*[@id='eventsurvey']/div/label/label/div/span[2]")
	public WebElement SurveyEventNO;

	@FindBy(xpath = "//*[@id='eventsurvey']/div/label/label/div/span[1]")
	public WebElement SurveyEventYES;

	public void SurveyEventNOYES(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("yes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", SurveyEventYES);
			SurveyEventYES.click();
		} else if (value.equalsIgnoreCase("no")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", SurveyEventNO);
			SurveyEventNO.click();
		}
	}

	@FindBy(xpath = "//*[@id='nextsurveydetails']")
	public WebElement SurveySaveNextBtn;

	@FindBy(xpath = "//*[@id='ulmenulist']")
	public WebElement questiondrpdwn1;
	
	@FindBy(xpath = "//*[@id='top']")
	public WebElement questiondrpdwnClk;
	
	@FindBy(xpath = "//*[@id='myModalLabel']/a")
	public WebElement questiondrpdwnClose1;

	@FindBy(xpath = "//*[@id='ulmenulist']/li[19]")
	public WebElement questiondrpdwn2;

	@FindBy(xpath = "//*[@id='myModalLabel']/a")
	public WebElement questiondrpdwnClose2;

	// creating Instructions

	@FindBy(xpath = "//*[@id='ulmenulist']/li[1]")
	public WebElement instructions;

	@FindBy(xpath = "//*[@id='divconfirm']/div/div/div[3]/div[3]/div[2]")
	public WebElement instructiondescription;

	@FindBy(xpath = "//*[@id='AddquestionDiv']/div[1]")
	public WebElement reset;

	@FindBy(xpath = "//*[@id='savetexins']")
	public WebElement addinstructions;

	@FindBy(xpath = "//*[@id='previewquestionaire']")
	public WebElement saveandnext;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[1]/h1/a")
	public WebElement cancel;

	// creating pagebreak

	@FindBy(xpath = "//*[@id='ulmenulist']/li[2]")
	public WebElement pagebreak;

	// creating amount

	@FindBy(xpath = "//*[@id='ulmenulist']/li[3]")
	public WebElement amount;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[1]/input")
	public WebElement questiontext;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[2]/div")
	public WebElement tags;

	@FindBy(xpath = "//*[@id='ddlQuestionGroupsforaddquestion']")
	public WebElement questiongroup;

	// selectQuestionGroup

	public void selectquestiongroup(String value) {
		Select select = new Select(questiongroup);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='txtNewQuestion]")
	public WebElement addnewname;

	@FindBy(xpath = "//*[@id='txtNewQuestionNotes']")
	public WebElement notes;

	@FindBy(xpath = "//*[@id='addNewQuestionModal']/div/div/div[2]/form/div[5]/button[2]")
	public WebElement addbtn;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[1]/h1/a")
	public WebElement QuestoinTypeCloseBtn;

	@FindBy(xpath = "//*[@id='Textlabel']")
	public WebElement enterlabeltext;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[8]/div/label/label/div")
	public WebElement mandatory;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[9]/div/label/label/div/i")
	public WebElement allowcomments;

	@FindBy(xpath = "//*[@id='saveInsertQuestion']")
	public WebElement addquestion;

	@FindBy(xpath = "//*[@id='previewquestionaire']")
	public WebElement amountsaveandnext;

	@FindBy(xpath = "//*[@id='questionlogic']/div[2]/div/div/button[1]/i")
	public WebElement NextBtnQLP;

	@FindBy(xpath = "//*[@id='questionlogic']/div[2]/div/a")
	public WebElement previousbtn;

	@FindBy(xpath = "//*[@id='previewskipnext']")
	public WebElement skipandnext;

	@FindBy(xpath = "//*[@id='btnAddrewards2']")
	public WebElement addcriteria;

	// creating single winner

	@FindBy(xpath = "//*[@id='addingcriteria']/ul/li[1]/a")
	public WebElement singlewinner;

	@FindBy(xpath = "//*[@id='singlecriterianame']")
	public WebElement criterianame;

	@FindBy(xpath = "//*[@id='inputdelivertdate']")
	public WebElement deliverydate;

	@FindBy(xpath = "//*[@id='singleselectdate']")
	public WebElement winnerdate;

	@FindBy(xpath = "//*[@id='selectselectiontype']")
	public WebElement selection;

	// selectselection

	public void selectselection(String value) {
		Select select = new Select(selection);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='singlestartdate']")
	public WebElement startdate;

	@FindBy(xpath = "//*[@id='singleenddate']")
	public WebElement enddate;

	@FindBy(xpath = "//*[@id='addrewarsds']")
	public WebElement addrewards;

	@FindBy(xpath = "//*[@id='cashrewardtitle']")
	public WebElement cashtitle;

	@FindBy(xpath = "//*[@id='cashcurrency']")
	public WebElement cashcurrency;

	@FindBy(xpath = "//*[@id='cashrewardawardamount']")
	public WebElement cashrewardspoints;

	// selectcashcurrency

	public void selectcashcurrency(String value) {
		Select select = new Select(cashcurrency);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='cashrewarddescription']")
	public WebElement cashdescription;

	@FindBy(xpath = "//*[@id='casemode']/div/div/a[1]")
	public WebElement cashaddbtn;

	@FindBy(xpath = "//*[@id='btnsavecriteria']")
	public WebElement cashsavecritreia;

	@FindBy(xpath = "//*[@id='saverewardspublishbutton']")
	public WebElement cashsaveandpublish;

	@FindBy(xpath = "//*[@id='modalsurveyupgrade']/div/div/div[3]/a")
	public WebElement rewardchargesprocessedbtn;

	// creating points

	@FindBy(xpath = "//*[@id='addingrewards']/div[2]/ul/li[3]/a")
	public WebElement SinglePointsTab;

	@FindBy(xpath = "//*[@id='pointsrewardtitle']")
	public WebElement SinglePointTitleTxtBx;

	@FindBy(xpath = "//*[@id='pointsrewardawardamount']")
	public WebElement SinglePointRewardsTxtBx;

	@FindBy(xpath = "//*[@id='Points']/div[3]/div/label/label/div/i")
	public WebElement SinglePointCanRedeemBtn;

	@FindBy(xpath = "//*[@id='pointsrewarddescription']")
	public WebElement SinglePointDescriptionTxtBx;

	@FindBy(xpath = "//*[@id='pointsmode']/div/div/a[1]")
	public WebElement SinglePointAddbtn;

	// creating Single Products

	@FindBy(xpath = "//*[@id='addingrewards']/div[2]/ul/li[4]/a")
	public WebElement Singleproducts;

	@FindBy(xpath = "//*[@id='productrewardtitle']")
	public WebElement SingleProductTitleTxt;

	@FindBy(xpath = "//*[@id='productname']")
	public WebElement SingleProductNameTxt;

	@FindBy(xpath = "//*[@id='productquantity']")
	public WebElement SingleProductQuantityTxt;

	@FindBy(xpath = "//*[@id='productvalue']")
	public WebElement SingleProductValueTxt;

	@FindBy(xpath = "//*[@id='productrewarddescription']")
	public WebElement SingleProductDescriptionTxt;

	@FindBy(xpath = "//*[@id='singlewinner1']/i[2]")
	public WebElement SingleWinnerOnlineBtn;

	@FindBy(xpath = "//*[@id='multiplewinner']/i[1]")
	public WebElement SingleWinnerOfflineBtn;

	@FindBy(xpath = "//*[@id='productcountry']")
	public WebElement SingleWinnerofflineCountry;

	@FindBy(xpath = "//*[@id='productofflineamount']")
	public WebElement SingleWinnerOfflineamount;

	@FindBy(xpath = "//*[@id='Products']/div[7]/div/a[1]")
	public WebElement SingleProductAddBtn;

	// creating multiple winners

	@FindBy(xpath = "//*[@id='multiple']/a")
	public WebElement multiplewinners;

	@FindBy(xpath = "//*[@id='multicriterianame']")
	public WebElement multiplecriterianame;

	@FindBy(xpath = "//*[@id='Noofwinners']")
	public WebElement multiplenoofwinners;

	@FindBy(xpath = "//*[@id='multiWinner']/div[1]/div/div/div[2]/label[2]/label/div/i")
	public WebElement multipleunlimitedbtn;

	@FindBy(xpath = "//*[@id='multipleselectdate']")
	public WebElement multiplewinnerdate;

	@FindBy(xpath = "//*[@id='multiWinner']/div[1]/div/div/div[3]/label[2]/label/div/i")
	public WebElement multipleautoselectbtn;

	@FindBy(xpath = "//*[@id='participents']")
	public WebElement multipleselect;

	@FindBy(xpath = "//*[@id='selectmultipletype']")
	public WebElement multipleselection;

	// selectmultipleselection

	public void selectmultipleselection(String value) {
		Select select = new Select(multipleselection);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='totalparticipents']")
	public WebElement multipleselectiontext;

	@FindBy(xpath = "//*[@id='selectdurationtype']")
	public WebElement multipleduration;

	// selectmultipleduration

	public void selectmultipleduration(String value) {
		Select select = new Select(multipleduration);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='noofdays']")
	public WebElement multiplenooftext;

	@FindBy(xpath = "//*[@id='selectdurationperiod']")
	public WebElement multipleselectperiod;

	// selectmultipledurationperiod

	public void selectmultipledurationperiod(String value) {
		Select select = new Select(multipleselectperiod);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='multiWinner']/div[4]/div/div/label/label/div/i")
	public WebElement multipleexcludeperiodsbtn;

	@FindBy(xpath = "//*[@id='multiplestartdate']")
	public WebElement multiplestartdate;

	@FindBy(xpath = "//*[@id='multipleenddate']")
	public WebElement multipleenddate;

	@FindBy(xpath = "//*[@id='deliverydays']")
	public WebElement multipledeliverydate;

	@FindBy(xpath = "//*[@id='multiWinner']/div[7]/div/div[3]/div/div[2]/a")
	public WebElement multipleaddrewards;

	@FindBy(xpath = "//*[@id='cashrewardtitle']")
	public WebElement multiplecashtitle;

	@FindBy(xpath = "//*[@id='cashcurrency']")
	public WebElement multiplecashcurrency;

	// select multiple cash currency
	public void selectmultiplecashcurrency(String value) {
		Select select = new Select(multiplecashcurrency);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='cashrewardawardamount']")
	public WebElement multiplecashpoints;

	@FindBy(xpath = "//*[@id='cashrewarddescription']")
	public WebElement multiplecashdescription;

	@FindBy(xpath = "//*[@id='casemode']/div/div/a[1]")
	public WebElement multiplecashaddbtn;

	@FindBy(xpath = "//*[@id='btnsavecriteria']")
	public WebElement multiplecashsavecriteria;

	@FindBy(xpath = "//*[@id='saverewardspublishbutton']")
	public WebElement multiplesaveandpublish;

	@FindBy(xpath = "//*[@id='modalsurveyupgrade']/div/div/div[3]/a")
	public WebElement multiplerewardsproceedbtn;

	// multiple points

	@FindBy(xpath = "//*[@id='addingrewards']/div[2]/ul/li[3]/a")
	public WebElement multiplePointsTab;

	@FindBy(xpath = "//*[@id='pointsrewardtitle']")
	public WebElement multiplePointsTitleTxt;

	@FindBy(xpath = "//*[@id='pointsrewardawardamount']")
	public WebElement multipleRewardsPointsTxt;

	@FindBy(xpath = "//*[@id='Points']/div[3]/div/label/label/div/i")
	public WebElement multiplePointscanredeemChkBtn;

	@FindBy(xpath = "//*[@id='productrewarddescription']")
	public WebElement multiplePonitsDescriptionTxt;

	@FindBy(xpath = "//*[@id='pointsmode']/div/div/a[1]")
	public WebElement multiplePointsAddBtn;

	@FindBy(xpath = "//*[@id='btnsavecriteria']")
	public WebElement multipleSavecriteria;

	// multiple Products Tab

	@FindBy(xpath = "//*[@id='addingrewards']/div[2]/ul/li[4]/a")
	public WebElement multipleProductsTab;

	@FindBy(xpath = "//*[@id='productrewardtitle']")
	public WebElement multipleProductsTitleTxt;

	@FindBy(xpath = "//*[@id='productname']")
	public WebElement multipleProductNameTxt;

	@FindBy(xpath = "//*[@id='productquantity']")
	public WebElement multipleProductQuantityTxt;

	@FindBy(xpath = "//*[@id='productvalue']")
	public WebElement multipleProductValueTxt;

	@FindBy(xpath = "//*[@id='Products']/div[7]/div/a[1]")
	public WebElement multipleProductAddBtn;

	@FindBy(xpath = "//*[@id='singlewinner1']/i[2]")
	public WebElement multipleProductOnlineBtn;

	@FindBy(xpath = "//*[@id='multiplewinner']/i[1]")
	public WebElement multipleProductOfflineBtn;

	@FindBy(xpath = "//*[@id='productcountry']")
	public WebElement multipleOfflineCountryDrpDwn;

	@FindBy(xpath = "//*[@id='productofflineamount']")
	public WebElement multipleOfflineAmountTxt;

	@FindBy(xpath = "//*[@id='btnsavecriteria']")
	public WebElement multipleProductssavecriteria;

	@FindBy(xpath = "//*[@id='modalsurveyupgrade']/div/div/div[3]/a")
	public WebElement multipleProductsProceedBtn;

	// creating checkbox

	@FindBy(xpath = "//*[@id='ulmenulist']/li[3]")
	public WebElement checkbox;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[1]/input")
	public WebElement questiontxt;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[2]/div")
	public WebElement checkbxtags;

	@FindBy(xpath = "//*[@id='ddlQuestionGroupsforaddquestion']")
	public WebElement checkbxquestiongroup;

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

	@FindBy(xpath = "//*[@id='textanswer2']")
	public WebElement chkentersecondoption;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[8]/div/label/label/div")
	public WebElement chkbxmandatory;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[9]/div/label/label/div/i")
	public WebElement chkbxallowcomments;

	@FindBy(xpath = "//*[@id='DoesShowresultDiv']/div/label/label/div/i")
	public WebElement showquestions;

	@FindBy(xpath = "//*[@id='saveInsertQuestion']")
	public WebElement chkbxaddquestion;

	@FindBy(xpath = "//*[@id='previewquestionaire']")
	public WebElement chksaveandnext;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[1]/h1/a")
	public WebElement chkbxcancelbtn;

	@FindBy(xpath = "//*[@id='questionlogic']/div[2]/div/div/button[1]/i")
	public WebElement chkNextBtnQLP;

	@FindBy(xpath = "//*[@id='previewskipnext']")
	public WebElement chkskipandnext;

	@FindBy(xpath = "//*[@id='btnAddrewards2']")
	public WebElement chkaddcriteria;

	// creating date

	@FindBy(xpath = "//*[@id='ulmenulist']/li[5]")
	public WebElement date;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[1]/input")
	public WebElement datequestiontxt;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[2]/div")
	public WebElement datetags;

	@FindBy(xpath = "//*[@id='ddlQuestionGroupsforaddquestion']")
	public WebElement datequestiongroup;

	@FindBy(xpath = "//*[@id='Textlabel']")
	public WebElement labeltext;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[8]/div/label/label/div/i")
	public WebElement ismandatory;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[9]/div/label/label/div")
	public WebElement dateallowcomments;

	@FindBy(xpath = "//*[@id='saveInsertQuestion']")
	public WebElement dateaddquestion;

	@FindBy(xpath = "//*[@id='myModalLabel']/a")
	public WebElement datecancelbtn;

	// craeting dropdown

	@FindBy(xpath = "//*[@id='ulmenulist']/li[6]")
	public WebElement dropdown;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[1]/input")
	public WebElement drpdwnquestiontxt;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[2]/div")
	public WebElement drpdwntags;

	@FindBy(xpath = "//*[@id='ddlQuestionGroupsforaddquestion']")
	public WebElement drpdwnquestiongrp;

	@FindBy(xpath = "//*[@id='ddlselectnoofoptions']")
	public WebElement drpdwnnumberoptions;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[8]/div/label/label/div/i")
	public WebElement drpdwnismandatory;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[9]/div/label/label/div")
	public WebElement drpdwnallowcomments;

	@FindBy(xpath = "//*[@id='DoesShowresultDiv']/div/label/label/div/i")
	public WebElement shwquestionbtn;

	@FindBy(xpath = "//*[@id='saveInsertQuestion']")
	public WebElement drpwnaddquestion;

	@FindBy(xpath = "//*[@id='myModalLabel']/a")
	public WebElement drpdwncancelbtn;

	// creating Fileupload

	@FindBy(xpath = "//*[@id='ulmenulist']/li[7]")
	public WebElement fileupload;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[1]/input")
	public WebElement fluplquestiontext;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[2]/div")
	public WebElement flupltags;

	@FindBy(xpath = "//*[@id='ddlQuestionGroupsforaddquestion']")
	public WebElement fluplquestiongroup;

	@FindBy(xpath = "//*[@id='Textlabel']")
	public WebElement flupllabeltext;

	// file types

	@FindBy(xpath = "//*[@id='fileoptions']/label[1]/label/div")
	public WebElement pdf;

	@FindBy(xpath = "//*[@id='fileoptions']/label[2]/label/div")
	public WebElement doc;

	@FindBy(xpath = "//*[@id='fileoptions']/label[3]/label/div/i")
	public WebElement docx;

	@FindBy(xpath = "//*[@id='fileoptions']/label[4]/label/div/i")
	public WebElement eml;

	@FindBy(xpath = "//*[@id='fileoptions']/label[5]/label/div/i")
	public WebElement gif;

	@FindBy(xpath = "//*[@id='fileoptions']/label[6]/label/div/i")
	public WebElement jpg;

	@FindBy(xpath = "//*[@id='fileoptions']/label[7]/label/div/i")
	public WebElement jpeg;

	@FindBy(xpath = "//*[@id='fileoptions']/label[8]/label/div/i")
	public WebElement msg;

	@FindBy(xpath = "//*[@id='fileoptions']/label[9]/label/div/i")
	public WebElement txt;

	@FindBy(xpath = "//*[@id='fileoptions']/label[10]/label/div/i")
	public WebElement tif;

	@FindBy(xpath = "//*[@id='fileoptions']/label[11]/label/div/i")
	public WebElement xls;

	@FindBy(xpath = "//*[@id='fileoptions']/label[12]/label/div/i")
	public WebElement xlsx;

	@FindBy(xpath = "//*[@id='fileoptions']/label[13]/label/div")
	public WebElement htm;

	@FindBy(xpath = "//*[@id='fileoptions']/label[14]/label/div")
	public WebElement html;

	@FindBy(xpath = "//*[@id='fileoptions']/label[15]/label/div/i")
	public WebElement png;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[8]/div/label/label/div/i")
	public WebElement fluplmandatory;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[9]/div/label/label/div/i")
	public WebElement fluplallowcomments;

	@FindBy(xpath = "//*[@id='saveInsertQuestion']")
	public WebElement flupladdquestion;

	@FindBy(xpath = "//*[@id='myModalLabel']/a")
	public WebElement fluplcancelbtn;

	// Group scaling

	@FindBy(xpath = "//*[@id='ulmenulist']/li[8]")
	public WebElement groupscaling;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[1]/input")
	public WebElement grpquestiontext;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[2]/div")
	public WebElement grptags;

	@FindBy(xpath = "//*[@id='ddlQuestionGroupsforaddquestion']")
	public WebElement grpquestiongroup;

	@FindBy(xpath = "//*[@id='ddlselectnoofoptions']")
	public WebElement numberofoptions;

	@FindBy(xpath = "//*[@id='textgroupscaleleft']")
	public WebElement labelspoor;

	@FindBy(xpath = "//*[@id='textgroupscaleright']")
	public WebElement labelsexceptional;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[8]/div/label/label/div/i")
	public WebElement grpismandatory;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[9]/div/label/label/div/i")
	public WebElement grpallowcomments;

	@FindBy(xpath = "//*[@id='DoesShowresultDiv']/div/label/label/div")
	public WebElement shwquestions;

	@FindBy(xpath = "//*[@id='saveInsertQuestion']")
	public WebElement grpaddquestion;

	// creating imagepoll;

	@FindBy(xpath = "//*[@id='ulmenulist']/li[9]")
	public WebElement imgpoll;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[2]/div")
	public WebElement imgtags;

	@FindBy(xpath = "//*[@id='ddlQuestionGroupsforaddquestion']")
	public WebElement imgquestiongroup;

	@FindBy(xpath = "//*[@id='ddlselectnoofoptions]")
	public WebElement imgnoofoptions;

	@FindBy(xpath = "//*[@id='textgroupscaleleft']")
	public WebElement imglabelpoor;

	@FindBy(xpath = "//*[@id='textgroupscaleright']")
	public WebElement imglabelexceptional;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[8]/div/label/label/div/i")
	public WebElement imgismandatory;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[9]/div/label/label/div/i")
	public WebElement imgallowcomments;

	@FindBy(xpath = "//*[@id='DoesShowresultDiv']/div/label/label/div/i")
	public WebElement imgshwquestions;

	@FindBy(xpath = "//*[@id='saveInsertQuestion']")
	public WebElement imgaddquestion;

	// creating Image with text

	@FindBy(xpath = "//*[@id='ulmenulist']/li[10]")
	public WebElement imgwithtext;

	@FindBy(xpath = "//*[@id='configcontactsaddbutton']/div[3]/div[1]/input")
	public WebElement imgquestiontxt;

	@FindBy(xpath = "//*[@id='ulmenulist']/li[11]")
	public WebElement multipleselectdrpdwn;

	@FindBy(xpath = "//*[@id='ulmenulist']/li[12]")
	public WebElement multipletextbx;

	@FindBy(xpath = "//*[@id='ulmenulist']/li[13]")
	public WebElement npsscore;

	@FindBy(xpath = "//*[@id='ulmenulist']/li[14]")
	public WebElement Number;

	@FindBy(xpath = "//*[@id='ulmenulist']/li[15]")
	public WebElement radiobtn;

	@FindBy(xpath = "//*[@id='ulmenulist']/li[16]")
	public WebElement scalerate;

	@FindBy(xpath = "//*[@id='ulmenulist']/li[17]")
	public WebElement singlelinetext;

	@FindBy(xpath = "//*[@id='ulmenulist']/li[18]")
	public WebElement Textarea;

	@FindBy(xpath = "//*[@id='ulmenulist']/li[19]")
	public WebElement yesorno;

	@FindBy(xpath = "//*[@id='ulmenulist']/li[20]")
	public WebElement name;

	@FindBy(xpath = "//*[@id='ulmenulist']/li[21]")
	public WebElement email;

	@FindBy(xpath = "//*[@id='ulmenulist']/li[22]")
	public WebElement address;

	@FindBy(xpath = "//*[@id='ulmenulist']/li[23]")
	public WebElement password;

	@FindBy(xpath = "//*[@id='ulmenulist']/li[24]")
	public WebElement phone;

}
