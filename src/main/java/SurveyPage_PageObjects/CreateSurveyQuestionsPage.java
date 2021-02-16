package SurveyPage_PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateSurveyQuestionsPage {

	WebDriver driver;
	JavascriptExecutor jse;
	CreateSurveyQuestionsPage objCreateSurveyQuestionsPage;

	// constructor for initializing the class objects
	public CreateSurveyQuestionsPage(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all public WebElements
		PageFactory.initElements(driver, this);
	}

	// Creating a Questions for Survey

	@FindBy(xpath = "//*[@id='textquestiontext']")
	public WebElement questionTextBx;

	@FindBy(xpath = "//*[@id='textquestiontext']")
	public WebElement addquestionTextBx;

	@FindBy(xpath = "//*[@id=\'defaultdisplayDiv\']/div[2]/div/div/input")
	public WebElement tagsTxBx;

	@FindBy(xpath = "//*[@id='ddlQuestionGroupsforaddquestion']")
	public WebElement questionGroupDrpDwn;

	@FindBy(xpath = "//*[@id='ddlQuestionGroupsforaddquestion']")
	public WebElement selectquestionGroupDrpDwn;

	public void addQuestionGroup(String value) {
		Select select = new Select(selectquestionGroupDrpDwn);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='ulmenulist']/li[2]")
	public WebElement clickonequestion;

	@FindBy(xpath = "//*[@id='ddlQuestionGroupsforaddquestion']/option[1]")
	public WebElement AddNew;

	@FindBy(xpath = "//*[@id='txtNewQuestion']")
	public WebElement NewgroupTxtBx;

	@FindBy(xpath = "//*[@id='txtNewQuestionNotes']")
	public WebElement Notes;

	@FindBy(xpath = "//*[@id='addNewQuestionModal']/div/div/div[2]/form/div[5]/button[2]")
	public WebElement Addbtn;

	@FindBy(xpath = "//*[@id='ddlanswertype']")
	public WebElement answerTypeDrpDwn;

	@FindBy(xpath = "//*[@id='Textlabel']")
	public WebElement Textlabel;

	@FindBy(xpath = "//*[@id='questiondiv']/div[3]/div/label/label/div")
	public WebElement Mandatory;

	@FindBy(xpath = "//*[@id='questiondiv']/div[4]/div/label/label/div/i")
	public WebElement allowCommentsChkBx;

	@FindBy(xpath = "//*[@id='saveInsertQuestion']")
	public WebElement addQuestionbtn;

	@FindBy(xpath = "//*[@id='previewquestionaire']")
	public WebElement saveAndNextQuestionbtn;

	// Number of Options for checkbox / dropdown / Multiple select dropdown /
	// Multiple Textboxes / Radio Button

	@FindBy(xpath = "//*[@id='ddlselectnoofoptions']")
	public WebElement numberOfOptionsDrpDwn;

	@FindBy(xpath = "//*[@id='textanswer1']")
	public WebElement option1TxBx;

	@FindBy(xpath = "//*[@id='textanswer2']")
	public WebElement option2TxBx;

	@FindBy(xpath = "//*[@id='textanswer3']")
	public WebElement option3TxBx;

	@FindBy(xpath = "//*[@id='textanswer4']")
	public WebElement option4TxBx;

	@FindBy(xpath = "//*[@id='textanswer5']")
	public WebElement option5TxBx;

	@FindBy(xpath = "//*[@id='textanswer6']")
	public WebElement option6TxBx;

	@FindBy(xpath = "//*[@id='textanswer7']")
	public WebElement option7TxBx;

	@FindBy(xpath = "//*[@id='textanswer8']")
	public WebElement option8TxBx;

	@FindBy(xpath = "//*[@id='textanswer9']")
	public WebElement option9TxBx;

	@FindBy(xpath = "//*[@id='textanswer10']")
	public WebElement option10TxBx;

	// Answer type Image with text

	@FindBy(xpath = "//*[@id='inputFile1']")
	public WebElement Image1;

	@FindBy(xpath = "//*[@id='inputFile2']")
	public WebElement Image2;

	@FindBy(xpath = "//*[@id='inputFile3']")
	public WebElement Image3;

	@FindBy(xpath = "//*[@id='inputFile4']")
	public WebElement Image4;

	@FindBy(xpath = "//*[@id='inputFile5']")
	public WebElement Image5;

	@FindBy(xpath = "//*[@id='inputFile6']")
	public WebElement Image6;

	@FindBy(xpath = "//*[@id='inputFile7']")
	public WebElement Image7;

	@FindBy(xpath = "//*[@id='inputFile8']")
	public WebElement Image8;

	@FindBy(xpath = "//*[@id='inputFile9']")
	public WebElement Image9;

	@FindBy(xpath = "//*[@id='inputFile10']")
	public WebElement Image10;

	@FindBy(xpath = "//*[@id='btnCrop']")
	public WebElement Imagecropproceed;

	// Answer type File upload

	@FindBy(xpath = "//*[@id='fileoptions']/label[1]/label/div/i")
	public WebElement fileTypePdf;

	@FindBy(xpath = "//*[@id='fileoptions']/label[2]/label/div/i")
	public WebElement fileTypeDoc;

	@FindBy(xpath = "//*[@id='fileoptions']/label[3]/label/div/i")
	public WebElement fileTypeDocx;

	@FindBy(xpath = "//*[@id='fileoptions']/label[4]/label/div/i")
	public WebElement fileTypeEml;

	@FindBy(xpath = "//*[@id='fileoptions']/label[5]/label/div/i")
	public WebElement fileTypeGif;

	@FindBy(xpath = "//*[@id='fileoptions']/label[6]/label/div/i")
	public WebElement fileTypeJpg;

	@FindBy(xpath = "//*[@id='fileoptions']/label[7]/label/div/i")
	public WebElement fileTypeJpeg;

	@FindBy(xpath = "//*[@id='fileoptions']/label[8]/label/div/i")
	public WebElement fileTypeMsgf;

	@FindBy(xpath = "//*[@id='fileoptions']/label[9]/label/div/i")
	public WebElement fileTypeTxt;

	@FindBy(xpath = "//*[@id='fileoptions']/label[10]/label/div/i")
	public WebElement fileTypeTif;

	@FindBy(xpath = "//*[@id='fileoptions']/label[11]/label/div/i")
	public WebElement fileTypeXls;

	@FindBy(xpath = "//*[@id='fileoptions']/label[12]/label/div/i")
	public WebElement fileTypeXlsx;

	@FindBy(xpath = "//*[@id='fileoptions']/label[13]/label/div/i")
	public WebElement fileTypeHtm;

	@FindBy(xpath = "//*[@id='fileoptions']/label[14]/label/div/i")
	public WebElement fileTypeHtml;

	@FindBy(xpath = "//*[@id='fileoptions']/label[15]/label/div/i")
	public WebElement fileTypePng;

	public void selectFileUpload(String value) throws Exception {
		Thread.sleep(2000);
		String strMain = value;
		String[] arrSplit = strMain.split(",");
		for (int i = 0; i < arrSplit.length; i++) {
			if (arrSplit[i].contains("pdf")) {
				fileTypePdf.click();
			} else if (arrSplit[i].contains("doc")) {
				fileTypeDoc.click();
			} else if (arrSplit[i].contains("docx")) {
				fileTypeDocx.click();
			} else if (arrSplit[i].contains("eml")) {
				fileTypeEml.click();
			} else if (arrSplit[i].contains("gif")) {
				fileTypeGif.click();
			} else if (arrSplit[i].contains("jpg")) {
				fileTypeJpg.click();
			} else if (arrSplit[i].contains("jpeg")) {
				fileTypeJpeg.click();
			} else if (arrSplit[i].contains("msgf")) {
				fileTypeMsgf.click();
			} else if (arrSplit[i].contains("txt")) {
				fileTypeTxt.click();
			} else if (arrSplit[i].contains("tif")) {
				fileTypeTif.click();
			} else if (arrSplit[i].contains("xls")) {
				fileTypeXls.click();
			} else if (arrSplit[i].contains("xlsx")) {
				fileTypeXlsx.click();
			} else if (arrSplit[i].contains("htm")) {
				fileTypeHtm.click();
			} else if (arrSplit[i].contains("html")) {
				fileTypeHtml.click();
			} else if (arrSplit[i].contains("png")) {
				fileTypePng.click();
			} else {
				Thread.sleep(3000);
				objCreateSurveyQuestionsPage.Mandatory.click();
				objCreateSurveyQuestionsPage.allowCommentsChkBx.click();
				objCreateSurveyQuestionsPage.addQuestionbtn.click();
			}

		}
	}

	// Scale Grouping answer type

	@FindBy(xpath = "//*[@id='textgroupscaleleft']")
	public WebElement leftLabeTxt;

	@FindBy(xpath = "//*[@id='textgroupscaleright']")
	public WebElement rightLabeTxt;

	// Creating a Questions for Survey responses

	@FindBy(xpath = "//*[@id='addexistingquestions']")
	public WebElement saveQuestionsBtn;

	@FindBy(xpath = "//*[@id='selectQuestionGroups']")
	public WebElement addSavedQuestionsDrp;

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

	@FindBy(xpath = "//*[@id='previewquestionaire']")
	public WebElement SurveyQuestoinSaveNextBtn;
	
	@FindBy(xpath = "//*[@id='savecancel']/div/button[1]")
	public WebElement SingleSurveyQuestoinSaveNextBtn;
	
	@FindBy(xpath = "//*[@id='nextQuizLogicid']")
	public WebElement EvaluatorQuestoinSaveNextBtn;
	
	@FindBy(xpath = "//*[@id='savecancel']/div/button[2]/span[1]")
	public WebElement EvaluatorQuestoinSaveASDraft;
	
	@FindBy(xpath = "//*[@id='savecancel']/div/ul/li/a[1]")
	public WebElement EvaluatorQuestoinSaveAndPublish;
	

	@FindBy(xpath = "//*[@id='previewquestionaire']")
	public WebElement SurveyQuestoinSaveNextBtnYesOrNo;
	
	// Creating a Questions logic page
	
	@FindBy(xpath = "//*[@id='questionlogic']/div[2]/div/div/button[1]")
	public WebElement questionLogicNextBtn;
	

	
	@FindBy(xpath = "//*[@id='nextPreviewAndCustomizeid']")
	public WebElement questionLogicNextBtnEvaluator;
	
	// Creating a Questions Preview & Customize page

	@FindBy(xpath = "//*[@id='messages']/div[3]/div[1]/div[1]/button[1]")
	public WebElement PreviewAndCustomizeNextBtn;
	
	@FindBy(xpath = "//*[@id='savecancel']/div[2]/button[1]")
	public WebElement PreviewAndCustomizeNextBtnEvaluator;
	
	
	@FindBy(xpath = "//*[@id='savecancel']/div[2]/button[2]/span[1]")
	public WebElement PreviewAndCustomizeSaveAsDraftEvaluator;
	
	@FindBy(xpath = "//*[@id='savecancel']/div[2]/ul/li/a")
	public WebElement PreviewAndCustomizeSaveAndPublishEvaluator;

	// Reward Section Page button

	@FindBy(xpath = "//*[@id='btnAddrewards2']")
	public WebElement criteriaaddBtnn;

	@FindBy(xpath = "//*[@id='singlecriterianame']")
	public WebElement criteriaNameTxtBx;

	@FindBy(xpath = "//*[@id='datetimepicker4']/input[1]")
	public WebElement deliveryDate;

	@FindBy(xpath = "//*[@id='datetimepicker4']/span[2]/span")
	public WebElement CalClear;

	// Rewards section for Single Winner

	@FindBy(xpath = "//*[@id='singleselectdate']")
	public WebElement winnerSelectionDate;

	@FindBy(xpath = "//*[@id='selectselectiontype']")
	public WebElement selectionDrpDwn;

	public void SingleSelection(String value) {
		Select select = new Select(selectionDrpDwn);
		select.selectByVisibleText(value);
	}


	@FindBy(xpath = "//*[@id='singlestartdate']")
	public WebElement startDate;


	@FindBy(xpath = "//*[@id='singleenddate']")
	public WebElement endDate;

	@FindBy(xpath = "//*[@id='addrewarsds']")
	public WebElement SingleAddRewardBtn;
	
	

	@FindBy(xpath = "//*[@id='cashrewardtitle']")
	public WebElement CashTitleTxtBx;

	@FindBy(xpath = "//*[@id='cashcurrency']")
	public WebElement CashAmountDrp;

	public void CashAmountDrpDwn(String value) {
		Select select = new Select(CashAmountDrp);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='cashrewardawardamount']")
	public WebElement CashRewardAmountTxtBx;

	@FindBy(xpath = "//*[@id='cashrewarddescription']")
	public WebElement CashRewardDescriptionTxtBx;

	@FindBy(xpath = "//*[@id='casemode']/div/div/a[2]")//*[@id="casemode"]/div/div/a[2]
	public WebElement CashRewardAddBtn;

	@FindBy(xpath = "//*[@id='btnsavecriteria']")
	public WebElement CashRewardSaveCriteriaBtn;

	@FindBy(xpath = "//*[@id='saverewardspublishbutton']")
	public WebElement RewardSaveAndPublishBtn;

	@FindBy(xpath = "//*[@id='modalsurveyupgrade']/div/div/div[3]/a")
	public WebElement AmountProcessedBtn;

	@FindBy(xpath = "//*[@id='RewardsLi']/a")
	public WebElement RewardsTabClk;

	@FindBy(xpath = "//*[@id='Rewards']/div[1]/div/ul/li[2]/a")
	public WebElement WinnerSelectionBtn;
	
	// Single Winner Points 
	
	@FindBy(xpath ="//*[@id='addingrewards']/div[2]/ul/li[3]/a")
	public WebElement SinglePointsTab;
	
	@FindBy(xpath ="//*[@id='pointsrewardtitle']")
	public WebElement SinglePointTitleTxtBx;
	

	@FindBy(xpath ="//*[@id='pointsrewardawardamount']")
	public WebElement SinglePointRewardsTxtBx;
	

	@FindBy(xpath ="//*[@id='Points']/div[3]/div/label/label/div/i")
	public WebElement SinglePointCanRedeemChkBtn;
	

	@FindBy(xpath ="//*[@id='pointsrewarddescription']")
	public WebElement SinglePointDescriptionTxtBx;
	
	@FindBy(xpath ="//*[@id='pointsmode']/div/div/a[1]")
	public WebElement SinglePointAddbtn;
	
	// creating Single Products
	
	@FindBy(xpath ="//*[@id='addingrewards']/div[2]/ul/li[4]/a")
	public WebElement SingleproductsTab;
	
	@FindBy(xpath ="//*[@id='productrewardtitle']")
	public WebElement SingleProductTitleTxt;
	
	@FindBy(xpath ="//*[@id='productname']")
	public WebElement SingleProductNameTxt;
	
	@FindBy(xpath ="//*[@id='productquantity']")
	public WebElement SingleProductQuantityTxt;
	
	@FindBy(xpath ="//*[@id='productvalue']")
	public WebElement SingleProductValueTxt;
	
	@FindBy(xpath ="//*[@id='productrewarddescription']")
	public WebElement SingleProductDescriptionTxt;
	
	@FindBy(xpath ="//*[@id='singlewinner1']/i[2]")
	public WebElement SingleWinnerOnlineBtn;
	
	@FindBy(xpath ="//*[@id='multiplewinner']/i[1]")
	public WebElement SingleWinnerOfflineBtn;
	
	public void SinglePointOnlineAndOffline(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("Online")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", SingleWinnerOnlineBtn);
			SingleWinnerOnlineBtn.click();
		} else if (value.equalsIgnoreCase("Offline")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", SingleWinnerOfflineBtn);
			SingleWinnerOfflineBtn.click();
		}
	}
	
	
	@FindBy(xpath ="//*[@id='productcountry']")
	public WebElement SingleWinnerofflineCountryDrp;
	
	public void SingleWinnerofflineCountryDrpDwn(String value) {
		Select select = new Select(SingleWinnerofflineCountryDrp);
		select.selectByVisibleText(value);
	}
	
	@FindBy(xpath ="//*[@id='productofflineamount']")
	public WebElement SingleWinnerOfflineamount;
	
	@FindBy(xpath ="//*[@id='Products']/div[7]/div/a[1]")
	public WebElement SingleProductAddBtn;
	

	// Rewards section for Multiple Winner

	@FindBy(xpath = "//*[@id='multiple']/a")
	public WebElement multipleWinnersTabBtn;

	@FindBy(xpath = "//*[@id='multicriterianame']")
	public WebElement multipleCriteriaNameTxtBx;

	@FindBy(xpath = "//*[@id='Noofwinners']")
	public WebElement multipleNoOfWinnersTxtBx;

	@FindBy(xpath = "//*[@id='multiWinner']/div[1]/div/div/div[2]/label[2]/label/div/i")
	public WebElement multipleUnlimitedChkBtn;
	

	public void multipleUnlimitedChkBtn(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("yes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", multipleUnlimitedChkBtn);
			multipleUnlimitedChkBtn.click();
		} else  {
			
		}
	}
	
	@FindBy(xpath = "//*[@id='Noofwinners']")
	public WebElement ExceptedNoOfWinners;
	
	
	@FindBy(xpath = "//*[@id='multipleselectdate']")
	public WebElement multipleWinnerSelectionDate;

	@FindBy(xpath = "//*[@id='multiWinner']/div[1]/div/div/div[3]/label[2]/label/div/i")
	public WebElement multipleAutoSelectBtn;
	
	public void multipleAutoSelectBtn(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("yes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", multipleAutoSelectBtn);
			multipleAutoSelectBtn.click();
		} else  {
			
		}
	}

	@FindBy(xpath = "//*[@id='participents']")
	public WebElement multiplePeriodicWinnerCountTxtBx;

	@FindBy(xpath = "//*[@id='selectmultipletype']")
	public WebElement multipleSelectionDrp;

	public void multipleSelectionDrpDwn(String value) {
		Select select = new Select(multipleSelectionDrp);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='totalparticipents']")
	public WebElement multipleTotalParticipantsTxtBx;

	@FindBy(xpath = "//*[@id='selectdurationtype']")
	public WebElement multipleDurationDrp;

	public void multipleDurationDrpDwn(String value) {
		Select select = new Select(multipleDurationDrp);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='noofdays']")
	public WebElement multipleNoOfTextBx;

	@FindBy(xpath = "//*[@id='selectdurationperiod']")
	public WebElement multipleSelectPeriodDrp;

	public void multipleSelectPeriodDrpDwn(String value) {
		Select select = new Select(multipleSelectPeriodDrp);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='multiWinner']/div[6]/div/div/label/label/div")
	public WebElement multipleExcludePeriodsChkBtn;
	
	public void multipleExcludePeriodsChkBtn(String value) {
		jse = (JavascriptExecutor) driver;
		if (value.equalsIgnoreCase("yes")) {
			jse.executeScript("arguments[0].scrollIntoView(true);", multipleExcludePeriodsChkBtn);
			multipleExcludePeriodsChkBtn.click();
		} else  {
			
		}
	}


	@FindBy(xpath = "//*[@id='multiplestartdate']")
	public WebElement multipleStartDate;

	@FindBy(xpath = "//*[@id='multipleenddate']")
	public WebElement multiplEendDate;

	@FindBy(xpath = "//*[@id='deliverydays']")
	public WebElement multipleRewardsDeliveryDays;

	@FindBy(xpath = "//*[@id='multiWinner']/div[7]/div/div[3]/div/div[2]/a")
	public WebElement multipleAddRewardsBtn;

	@FindBy(xpath = "//*[@id='cashrewardtitle']")
	public WebElement multipleCashTitleTxtBx;

	@FindBy(xpath = "//*[@id='cashcurrency']")
	public WebElement multipleCashCurrencyDrp;

	public void multipleCashCurrencyDrpDwn(String value) {
		Select select = new Select(multipleCashCurrencyDrp);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='cashrewardawardamount']")
	public WebElement multipleCashRewardAmountTxtBx;

	@FindBy(xpath = "//*[@id='cashrewarddescription']")
	public WebElement multipleCashDescriptionTxtBx;

	@FindBy(xpath = "//*[@id='casemode']/div/div/a[1]")
	public WebElement multipleCashAddBtn;

	@FindBy(xpath = "//*[@id='btnsavecriteria']")
	public WebElement multipleCashSaveCriteriaBtn;

	@FindBy(xpath = "//*[@id='saverewardspublishbutton']")
	public WebElement multipleSaveAndPublishBtn;

	@FindBy(xpath = "//*[@id='modalsurveyupgrade']/div/div/div[3]/a")
	public WebElement multipleRewardsProceedBtn;
	
	// multiple points
	
			@FindBy(xpath ="//*[@id='addingrewards']/div[2]/ul/li[3]/a")
			public WebElement multiplePointsTab;
			
			@FindBy(xpath ="//*[@id='pointsrewardtitle']")
			public WebElement multiplePointsTitleTxt;
			
			@FindBy(xpath ="//*[@id='pointsrewardawardamount']")
			public WebElement multipleRewardsPointsTxt;
			
			@FindBy(xpath ="//*[@id='Points']/div[3]/div/label/label/div/i")
			public WebElement multiplePointscanredeemChkBtn;
			
			public void multiplePointscanredeemChkBtn(String value) {
				jse = (JavascriptExecutor) driver;
				if (value.equalsIgnoreCase("yes")) {
					jse.executeScript("arguments[0].scrollIntoView(true);", multiplePointscanredeemChkBtn);
					multiplePointscanredeemChkBtn.click();
				} else  {
					
				}
			}

			
			@FindBy(xpath ="//*[@id='Points']/div[4]/div/textarea")
			public WebElement multiplePonitsDescriptionTxt;
			
			@FindBy(xpath ="//*[@id='pointsmode']/div/div/a[1]")
			public WebElement multiplePointsAddBtn;
			
			@FindBy(xpath ="//*[@id='btnsavecriteria']")
			public WebElement multipleSavecriteria;
			
			// multiple Products Tab
			
			@FindBy(xpath ="//*[@id='addingrewards']/div[2]/ul/li[4]/a")
			public WebElement multipleProductsTab;
			
			@FindBy(xpath ="//*[@id='productrewardtitle']")
			public WebElement multipleProductsTitleTxt;
			
			@FindBy(xpath ="//*[@id='productname']")
			public WebElement multipleProductNameTxt;
			
			@FindBy(xpath ="//*[@id='productquantity']")
			public WebElement multipleProductQuantityTxt;
			
			@FindBy(xpath ="//*[@id='productvalue']")
			public WebElement multipleProductValueTxt;
			
			@FindBy(xpath ="//*[@id='productvalue']")
			public WebElement multipleDescriptionTxt;
			
			@FindBy(xpath ="//*[@id='Products']/div[7]/div/a[1]")
			public WebElement multipleProductAddBtn;
			
			@FindBy(xpath ="//*[@id='singlewinner1']/i[2]")
			public WebElement multipleProductOnlineBtn;
			
			@FindBy(xpath ="//*[@id='multiplewinner']/i[1]")
			public WebElement multipleProductOfflineBtn;
						
			@FindBy(xpath ="//*[@id='productcountry']")
			public WebElement multipleOfflineCountryDrpDwn;
			
			@FindBy(xpath ="//*[@id='productofflineamount']")
			public WebElement multipleOfflineAmountTxt;
			
			@FindBy(xpath ="//*[@id='btnsavecriteria']")
			public WebElement multipleProductssavecriteria;
			
			@FindBy(xpath ="//*[@id='modalsurveyupgrade']/div/div/div[3]/a")
			public WebElement multipleProductsProceedBtn;
			
			

}
