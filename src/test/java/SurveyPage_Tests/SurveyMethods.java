package SurveyPage_Tests;

import java.util.ArrayList;
import java.util.Base64;
import java.util.regex.Pattern;

import javax.swing.Spring;

import org.apache.xpath.operations.Bool;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

import BasePackage.BaseTest;
import HomePage_PageObject.HomePage;
import HomePage_PageObject.IndexPages;
import HomePage_PageObject.LoginPage;
import SurveyPage_PageObjects.SurveyQuestionsPage;
import net.bytebuddy.implementation.bind.annotation.Super;
import SurveyPage_PageObjects.CreateSurveyQuestionsPage;
import utilityLibrary.Helper;

public class SurveyMethods {

	
	
	public static  WebDriver driver;
	
	LoginPage objLoginPage;
	HomePage objHomePage;
	IndexPages objIndexPage;
	SurveyQuestionsPage objCreateSurveyPage;
	CreateSurveyQuestionsPage objCreateSurveyQuestionsPage;
	JavascriptExecutor js;

	// Login and Quit Methods

	public void Login() throws Exception {
		
		

		driver=BaseTest.setup();
		
		objLoginPage = new LoginPage(driver);
		objHomePage = new HomePage(driver);
		objIndexPage = new IndexPages(driver);
		objCreateSurveyPage = new SurveyQuestionsPage(driver);
		objCreateSurveyQuestionsPage = new CreateSurveyQuestionsPage(driver);

		objHomePage.loginLnk.click();
		Thread.sleep(20000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("The number of windows are: " + tabs.size());
		driver.switchTo().window(tabs.get(1));

		// use https://www.base64encode.org/ for encoding and decoding creds
		objLoginPage.login(Helper.getValue("userName"),
				(new String(Base64.getDecoder().decode(Helper.getValue("password")))));
		Thread.sleep(10000);

		Thread.sleep(2000);
		objIndexPage.surveyLnk.click();
		Thread.sleep(2000);

		objIndexPage.createSurveyLnk.click();
		Thread.sleep(3000);

	}
	//===========added these to check extent report
		public WebDriver getDriver() 
		  { 
			  
			  return driver; 
		  }
		//=======================
	public void CloseWindow() throws Exception {
//		 driver.close();
		driver.quit();
	}

	// General Methods
	
	public void Screenshot() throws Exception {
		Helper.takeScreenshot(driver);
	}

	// Details Page Methods
		
	public void selectLanguage() throws Exception {
		objCreateSurveyPage.selectLanguage(Helper.getData("SurveySingleWinner", 2, 5));
	}
	public void AnonymousCheck() throws Exception {
		objCreateSurveyPage.allowAnonymousResChkBx.click();
	}
	public void saveAsTemplateChkBx() throws Exception {
		objCreateSurveyPage.saveAsTemplateChkBx.click();
		objCreateSurveyPage.saveAsTemplateTxBx.sendKeys(Helper.getData("SurveySingleWinner", 2, 7));
	}
	public void SetYourOwnLandPageUrl(int row) throws Exception {

		objIndexPage.setYourOwnLandPageUrl.click();
		objIndexPage.setYourOwnLandPageUrlTxBx.sendKeys(Helper.getData("SurveyRewardSingleWinner", row, 8));
	}
	public void randomizeQuestionCheck() throws Exception {
		objCreateSurveyPage.randomizeQuestion.click();
	}
	public void randomizePagesCheck() throws Exception {
		objCreateSurveyPage.randomizePages.click();
	}
	public void DetailPage(int row) throws Exception {
		
//		SurveyMethods de= new SurveyMethods();
		

		Thread.sleep(2000);
		
		
		
		
		String SurveyRadioBtn = Helper.getData("SurveyRewardSingleWinner", row, 9);
		
		if (SurveyRadioBtn.contains("Survey")){
			
			objCreateSurveyPage.surveyrdbtn.click();
			((JavascriptExecutor) driver).executeScript("scroll(0, 800);");
			objCreateSurveyPage.selectCategory(Helper.getData("SurveyRewardSingleWinner", row, 4));
			Thread.sleep(2000);
			
		} else if (SurveyRadioBtn.contains("Form")) {
			
			objCreateSurveyPage.Formrdbtn.click();
			((JavascriptExecutor) driver).executeScript("scroll(0, 800);");
			objCreateSurveyPage.FormCategoryDrpdwn(Helper.getData("SurveyRewardSingleWinner", row, 34));
		}
		
		objCreateSurveyPage.surveyNameTxtbx.sendKeys(Helper.getData("SurveyRewardSingleWinner", row, 2));
			
//		String surveyNameTxtbx = (Helper.getData("SurveyRewardSingleWinner", row, 2));
//		
//		int i=0;
//		do {
//			if(surveyNameTxtbx.length() <= 5 && Pattern.matches("[a-zA-Z]+", surveyNameTxtbx))
//		{
//		   System.out.println("Survey Name allows upto 5 characters and won't accepts symblos and numbers");
//		   break;
//		 		   
//		}
//						
//		} while (i<=0);
	
		objCreateSurveyPage.descriptionTxtArea.sendKeys(Helper.getData("SurveyRewardSingleWinner", row, 3));
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("scroll(0, 800);");
//		objCreateSurveyPage.selectCategory(Helper.getData("SurveyRewardSingleWinner", row, 34));
//		((JavascriptExecutor) driver).executeScript("scroll(0, 800);");
	
	
	objCreateSurveyPage.SaveCRMchkbx.click();
	Thread.sleep(2000);
	objCreateSurveyPage.selectSaveCRMdrpdwn(Helper.getData("SurveyRewardSingleWinner", row, 35));
	Thread.sleep(2000);
	((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
	objCreateSurveyPage.SaveresponseEmailchkbx.click();
	Thread.sleep(2000);
	((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
	Thread.sleep(2000);
	objCreateSurveyPage.Saveresponseemail(Helper.getData("SurveyRewardSingleWinner", row, 36));
	Thread.sleep(2000);
	((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
	objCreateSurveyPage.isthissurveyRdBtn(Helper.getData("SurveyRewardSingleWinner", row, 37));
	Thread.sleep(2000);
	objCreateSurveyPage.descriptionTxtArea.sendKeys(Helper.getData("SurveyRewardSingleWinner", row, 3));
	Thread.sleep(2000);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void DetailPageSaveAndNextBtn() throws Exception {
		objCreateSurveyPage.SurveySaveNextBtn.click();
	}
	
	// Question Page Methods
	
	public void AddQuestionGrop() throws Exception {

		objIndexPage.checkboxBtnClk.click();
		objIndexPage.checkbxquestiongroup.click();
		objIndexPage.AddNewGroup.click();
		objIndexPage.NewGroupName.sendKeys(Helper.getData("Question Type", 2, 5));
		objIndexPage.AddNewGroupAddBtn.click();
		objIndexPage.AddNewGroupCloseBtn.click();

	}
	public void FourQuestoinsDefault() throws Exception {

		// Creating a Questions for Survey
		Helper.takeScreenshot(driver);
		Thread.sleep(5000);
		objCreateSurveyQuestionsPage.saveQuestionsBtn.click();
		Thread.sleep(5000);
		objCreateSurveyQuestionsPage.addSavedQuestionsDrp.sendKeys(Helper.getData("LoginPage", 2, 5));
		Thread.sleep(2000);
		objCreateSurveyQuestionsPage.q1Drp.click();
		Thread.sleep(2000);
		objCreateSurveyQuestionsPage.q2Drp.click();
		Thread.sleep(2000);
		objCreateSurveyQuestionsPage.q3Drp.click();
		Thread.sleep(2000);
		objCreateSurveyQuestionsPage.q4Drp.click();
		Thread.sleep(2000);
		objCreateSurveyQuestionsPage.questionDoneClk.click();
		Thread.sleep(2000);
	}
	public void CheckBoxQuestion() throws Exception {

		Thread.sleep(2000);
		objIndexPage.checkboxBtnClk.click();
		objIndexPage.Chkquestiontxt.sendKeys(Helper.getData("Question Types", 2, 3));
		objIndexPage.checkbxtags.sendKeys(Helper.getData("Question Types", 2, 4));
		objIndexPage.selectchkquestiongroup(Helper.getData("Question Types", 2, 5));
		Thread.sleep(2000);
		objIndexPage.selectchknumberoptions(Helper.getData("Question Types", 2, 6));
		Thread.sleep(3000);
		int count = Integer.parseInt(Helper.getData("Question Types", 2, 6));
		if (count >= 1) {
			String option = Helper.getData("Question Types", 2, 7);
			if (option != "") {
				objIndexPage.chkenterfirstoption.sendKeys(Helper.getData("Question Types", 2, 7));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 2) {
			String option = Helper.getData("Question Types", 2, 8);
			if (option != "") {
				objIndexPage.chkentersecondoption.sendKeys(Helper.getData("Question Types", 2, 8));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 3) {
			String option = Helper.getData("Question Types", 2, 9);
			if (option != "") {
				objIndexPage.chkenterThirdoption.sendKeys(Helper.getData("Question Types", 2, 9));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 4) {
			String option = Helper.getData("Question Types", 2, 10);
			if (option != "") {
				objIndexPage.chkenterFourthoption.sendKeys(Helper.getData("Question Types", 2, 10));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 5) {
			String option = Helper.getData("Question Types", 2, 11);
			if (option != "") {
				objIndexPage.chkenterFiveoption.sendKeys(Helper.getData("Question Types", 2, 11));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 6) {
			String option = Helper.getData("Question Types", 2, 12);
			if (option != "") {
				objIndexPage.chkenterSixoption.sendKeys(Helper.getData("Question Types", 2, 12));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 7) {
			String option = Helper.getData("Question Types", 2, 13);
			if (option != "") {
				objIndexPage.chkenterSevenoption.sendKeys(Helper.getData("Question Types", 2, 13));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 8) {
			String option = Helper.getData("Question Types", 2, 14);
			if (option != "") {
				objIndexPage.chkenterEightoption.sendKeys(Helper.getData("Question Types", 2, 14));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 9) {
			String option = Helper.getData("Question Types", 2, 15);
			if (option != "") {
				objIndexPage.chkenterNineoption.sendKeys(Helper.getData("Question Types", 2, 15));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 10) {
			String option = Helper.getData("Question Types", 2, 16);
			if (option != "") {
				objIndexPage.chkenterTenoption.sendKeys(Helper.getData("Question Types", 2, 16));
				Helper.takeScreenshot(driver);
			}
		}
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("scroll(0, 3000);");
		Thread.sleep(3000);
		objIndexPage.chkbxmandatory.click();
		objIndexPage.chkbxallowcomments.click();
		Thread.sleep(2000);
		objIndexPage.chkbxaddquestion.click();
		Thread.sleep(2000);
	}
	public void DateQuestion() throws Exception {

		objIndexPage.DateLnk.click();
		objIndexPage.DateQuestiontxt.sendKeys(Helper.getData("Question Types", 5, 3));
		// objIndexPage.Datebxtags.sendKeys(Helper.getData("Question Types", 5,
		// 4));
		objIndexPage.selectDatebxquestiongroup(Helper.getData("Question Types", 5, 5));
		objIndexPage.DateLabelTxt.sendKeys(Helper.getData("Question Types", 5, 17));
		((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
		objIndexPage.Datebxmandatory.click();
		objIndexPage.Datebxallowcomments.click();
		objIndexPage.Datebxaddquestion.click();
		Thread.sleep(2000);
	}
	public void DropdownQuestion() throws Exception {
		objIndexPage.DropdownLnk.click();
		objIndexPage.Drpquestiontxt.sendKeys(Helper.getData("Question Types", 8, 3));
		// objIndexPage.checkbxtags.sendKeys(Helper.getData("Question Types", 8,
		// 4));
		objIndexPage.Drpbxquestiongroup.click();
		objIndexPage.selectDrpbxquestiongroup(Helper.getData("Question Types", 8, 5));
		Thread.sleep(2000);
		objIndexPage.selectDrpnumberoptions(Helper.getData("Question Types", 8, 6));
		int count = Integer.parseInt(Helper.getData("Question Types", 8, 6));
		if (count >= 1) {
			String option = Helper.getData("Question Types", 8, 7);
			if (option != "") {
				objIndexPage.Drpenterfirstoption.sendKeys(Helper.getData("Question Types", 8, 7));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 2) {
			String option = Helper.getData("Question Types", 8, 8);
			if (option != "") {
				objIndexPage.Drpentersecondoption.sendKeys(Helper.getData("Question Types", 8, 8));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 3) {
			String option = Helper.getData("Question Types", 8, 9);
			if (option != "") {
				objIndexPage.DrpenterThirdoption.sendKeys(Helper.getData("Question Types", 8, 9));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 4) {
			String option = Helper.getData("Question Types", 8, 10);
			if (option != "") {
				objIndexPage.DrpenterFourthoption.sendKeys(Helper.getData("Question Types", 8, 10));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 5) {
			String option = Helper.getData("Question Types", 8, 11);
			if (option != "") {
				objIndexPage.DrpenterFiveoption.sendKeys(Helper.getData("Question Types", 8, 11));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 6) {
			String option = Helper.getData("Question Types", 8, 12);
			if (option != "") {
				objIndexPage.DrpenterSixoption.sendKeys(Helper.getData("Question Types", 8, 12));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 7) {
			String option = Helper.getData("Question Types", 8, 13);
			if (option != "") {
				objIndexPage.DrpenterSevenoption.sendKeys(Helper.getData("Question Types", 8, 13));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 8) {
			String option = Helper.getData("Question Types", 8, 14);
			if (option != "") {
				objIndexPage.DrpenterEightoption.sendKeys(Helper.getData("Question Types", 8, 14));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 9) {
			String option = Helper.getData("Question Types", 8, 15);
			if (option != "") {
				objIndexPage.Drpenternineoption.sendKeys(Helper.getData("Question Types", 8, 15));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 10) {
			String option = Helper.getData("Question Types", 8, 16);
			if (option != "") {
				objIndexPage.DrpenterTenoption.sendKeys(Helper.getData("Question Types", 8, 16));
				Helper.takeScreenshot(driver);
			}
		}

		((JavascriptExecutor) driver).executeScript("scroll(0, 800);");
		objIndexPage.Drpbxmandatory.click();
		objIndexPage.Drpallowcomments.click();
		objIndexPage.Drpshowquestions.click();
		objIndexPage.Drpchkbxaddquestion.click();
		objIndexPage.DrpSaveandNextBtn.click();

	}
	public void DropdownQuestionWithWiseWeightages() throws Exception {
				
		objIndexPage.DropdownLnk.click();
		((JavascriptExecutor) driver).executeScript("scroll(0, 0);");
		objIndexPage.QuestionTypeWithWiseWeightagesChkBx.click();
		objIndexPage.Drpquestiontxt.sendKeys(Helper.getData("Question Types", 8, 3));
		objIndexPage.checkbxtags.sendKeys(Helper.getData("Question Types", 8, 4));
		objIndexPage.Drpbxquestiongroup.click();
		objIndexPage.selectDrpbxquestiongroup(Helper.getData("Question Types", 8, 5));
		Thread.sleep(2000);
		objIndexPage.selectDrpnumberoptions(Helper.getData("Question Types", 8, 6));
		((JavascriptExecutor) driver).executeScript("scroll(0, 800);");
		int count = Integer.parseInt(Helper.getData("Question Types", 8, 6));
		if (count >= 1) {
			String option = Helper.getData("Question Types", 8, 7);
			if (option != "") {
				objIndexPage.Drpenterfirstoption.sendKeys(Helper.getData("Question Types", 8, 7));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 2) {
			String option = Helper.getData("Question Types", 8, 8);
			if (option != "") {
				objIndexPage.Drpentersecondoption.sendKeys(Helper.getData("Question Types", 8, 8));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 3) {
			String option = Helper.getData("Question Types", 8, 9);
			if (option != "") {
				objIndexPage.DrpenterThirdoption.sendKeys(Helper.getData("Question Types", 8, 9));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 4) {
			String option = Helper.getData("Question Types", 8, 10);
			if (option != "") {
				objIndexPage.DrpenterFourthoption.sendKeys(Helper.getData("Question Types", 8, 10));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 5) {
			String option = Helper.getData("Question Types", 8, 11);
			if (option != "") {
				objIndexPage.DrpenterFiveoption.sendKeys(Helper.getData("Question Types", 8, 11));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 6) {
			String option = Helper.getData("Question Types", 8, 12);
			if (option != "") {
				objIndexPage.DrpenterSixoption.sendKeys(Helper.getData("Question Types", 8, 12));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 7) {
			String option = Helper.getData("Question Types", 8, 13);
			if (option != "") {
				objIndexPage.DrpenterSevenoption.sendKeys(Helper.getData("Question Types", 8, 13));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 8) {
			String option = Helper.getData("Question Types", 8, 14);
			if (option != "") {
				objIndexPage.DrpenterEightoption.sendKeys(Helper.getData("Question Types", 8, 14));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 9) {
			String option = Helper.getData("Question Types", 8, 15);
			if (option != "") {
				objIndexPage.Drpenternineoption.sendKeys(Helper.getData("Question Types", 8, 15));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 10) {
			String option = Helper.getData("Question Types", 8, 16);
			if (option != "") {
				objIndexPage.DrpenterTenoption.sendKeys(Helper.getData("Question Types", 8, 16));
				Helper.takeScreenshot(driver);
			}
		}

		((JavascriptExecutor) driver).executeScript("scroll(0, 800);");
		objIndexPage.Drpbxmandatory.click();
		objIndexPage.Drpallowcomments.click();
		objIndexPage.Drpshowquestions.click();
		objIndexPage.Drpchkbxaddquestion.click();
		objIndexPage.DrpSaveandNextBtn.click();
	}
	public void FileUploadQuestion() throws Exception {

		objIndexPage.Fileupload.click();
		objIndexPage.Filequestiontxt.sendKeys(Helper.getData("Question Types", 13, 3));
		objIndexPage.Filetags.sendKeys(Helper.getData("Question Types", 13, 4));
		objIndexPage.selectFilequestiongroup(Helper.getData("Question Types", 13, 5));
		objIndexPage.FileLabelText.sendKeys(Helper.getData("Question Types", 13, 17));
		objIndexPage.selectFileUpload(Helper.getData("Question Types", 13, 18));
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("scroll(0, 3000);");

		objIndexPage.Filemandatory.click();
		objIndexPage.Fileallowcomments.click();
		objIndexPage.Fileaddquestion.click();

	}
	public void GroupScalingQuestion() throws Exception {

		objIndexPage.GroupscalingBtn.click();
		objIndexPage.Groupquestiontxt.sendKeys(Helper.getData("Question Types", 16, 3));
		objIndexPage.Grouptags.sendKeys(Helper.getData("Question Types", 16, 4));
		objIndexPage.selectGroupquestiongroup(Helper.getData("Question Types", 16, 5));
		objIndexPage.Groupnumberoptions.sendKeys(Helper.getData("Question Types", 16, 6));
		Thread.sleep(3000);
		int count = Integer.parseInt(Helper.getData("Question Types", 16, 6));
		if (count >= 1) {
			String option = Helper.getData("Question Types", 16, 7);
			if (option != "") {
				objIndexPage.Grpenterfirstoption.sendKeys(Helper.getData("Question Types", 16, 7));
			}
		}
		if (count >= 2) {
			String option = Helper.getData("Question Types", 16, 8);
			if (option != "") {
				objIndexPage.Grpentersecondoption.sendKeys(Helper.getData("Question Types", 16, 8));
			}
		}
		if (count >= 3) {
			String option = Helper.getData("Question Types", 16, 9);
			if (option != "") {
				objIndexPage.GrpenterThirdoption.sendKeys(Helper.getData("Question Types", 16, 9));
			}
		}
		if (count >= 4) {
			String option = Helper.getData("Question Types", 16, 10);
			if (option != "") {
				objIndexPage.GrpenterFourthoption.sendKeys(Helper.getData("Question Types", 16, 10));
			}
		}
		if (count >= 5) {
			String option = Helper.getData("Question Types", 16, 11);
			if (option != "") {
				objIndexPage.GrpenterFiveoption.sendKeys(Helper.getData("Question Types", 16, 11));
			}
		}
		if (count >= 6) {
			String option = Helper.getData("Question Types", 16, 12);
			if (option != "") {
				objIndexPage.GrpenterSixoption.sendKeys(Helper.getData("Question Types", 16, 12));
			}
		}
		if (count >= 7) {
			String option = Helper.getData("Question Types", 16, 13);
			if (option != "") {
				objIndexPage.GrpenterSevenoption.sendKeys(Helper.getData("Question Types", 16, 13));
			}
		}
		if (count >= 8) {
			String option = Helper.getData("Question Types", 16, 14);
			if (option != "") {
				objIndexPage.GrpenterEightoption.sendKeys(Helper.getData("Question Types", 16, 14));
			}
		}
		if (count >= 9) {
			String option = Helper.getData("Question Types", 16, 15);
			if (option != "") {
				objIndexPage.Grpenternineoption.sendKeys(Helper.getData("Question Types", 16, 15));
			}
		}
		if (count >= 10) {
			String option = Helper.getData("Question Types", 16, 16);
			if (option != "") {
				objIndexPage.GrpenterTenoption.sendKeys(Helper.getData("Question Types", 16, 16));
			}
		}
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("scroll(0, 3000);");

		objIndexPage.GrplabelleftTxtBx.sendKeys(Helper.getData("Question Types", 16, 19));
		objIndexPage.GrplabelrightTxtBx.sendKeys(Helper.getData("Question Types", 16, 20));
		objIndexPage.Grpmandatory.click();
		objIndexPage.Grpallowcomments.click();
		objIndexPage.Grpshowquestions.click();
		objIndexPage.Grpaddquestion.click();

	}
	public void ImagePollQuestion() throws Exception {
	
	objIndexPage.Imgpoll.click();
	((JavascriptExecutor) driver).executeScript("scroll(0, 0);");
	objIndexPage.Imgquestiontxt.sendKeys(Helper.getData("Question Types", 19, 3));
	objIndexPage.Imgtags.sendKeys(Helper.getData("Question Types", 19, 4));
	objIndexPage.selectImgquestiongroup(Helper.getData("Question Types", 19, 5));
	objIndexPage.selectImgnumberoptions(Helper.getData("Question Types", 19, 6));
	
	Thread.sleep(3000);
	int count = Integer.parseInt(Helper.getData("Question Types", 19, 6));
	if (count >= 1) {
		String option = Helper.getData("Question Types", 19, 21);
		if (option != "") {
			objIndexPage.Imgfirstoption.sendKeys(Helper.getData("Question Types", 19, 21));
			((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
			Thread.sleep(3000);
			Helper.takeScreenshot(driver);
			objIndexPage.ImgPollCropBtn.click();
			Thread.sleep(3000);
			objIndexPage.ImgfirstTxtbx.sendKeys(Helper.getData("Question Types", 19, 22));
			Thread.sleep(2000);
		}
	}
	if (count >= 2) {
		String option = Helper.getData("Question Types", 19, 23);
		if (option != "") {
			objIndexPage.Imgsecondoption.sendKeys(Helper.getData("Question Types", 19, 23));
			((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
			Thread.sleep(3000);
			Helper.takeScreenshot(driver);
			objIndexPage.ImgPollCropBtn.click();
			Thread.sleep(3000);
			objIndexPage.ImgsecondTxtbx.sendKeys(Helper.getData("Question Types", 19, 24));
			Thread.sleep(2000);
		}
	}
	if (count >= 3) {
		String option = Helper.getData("Question Types", 19, 25);
		if (option != "") {
			objIndexPage.ImgThirdoption.sendKeys(Helper.getData("Question Types", 19, 25));
			((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
			Thread.sleep(3000);
			Helper.takeScreenshot(driver);
			objIndexPage.ImgPollCropBtn.click();
			Thread.sleep(3000);
			objIndexPage.ImgThirdTxtbx.sendKeys(Helper.getData("Question Types", 19, 26));
			Thread.sleep(2000);
		}
	}
	if (count >= 4) {
		String option = Helper.getData("Question Types", 19, 27);
		if (option != "") {
			objIndexPage.ImgFourthoption.sendKeys(Helper.getData("Question Types", 19, 27));
			((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
			Thread.sleep(3000);
			Helper.takeScreenshot(driver);
			objIndexPage.ImgPollCropBtn.click();
			Thread.sleep(3000);
			objIndexPage.ImgfourthTxtbx.sendKeys(Helper.getData("Question Types", 19, 28));
			Thread.sleep(2000);
		}
	}
	if (count >= 5) {
		String option = Helper.getData("Question Types", 19, 29);
		if (option != "") {
			objIndexPage.Imgfiveoption.sendKeys(Helper.getData("Question Types", 19, 29));
			((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
			Thread.sleep(3000);
			Helper.takeScreenshot(driver);
			objIndexPage.ImgPollCropBtn.click();
			Thread.sleep(3000);
			objIndexPage.ImgfiveTxtbx.sendKeys(Helper.getData("Question Types", 19, 30));
			Thread.sleep(2000);
		}
	}
	if (count >= 6) {
		String option = Helper.getData("Question Types", 19, 31);
		if (option != "") {
			objIndexPage.Imgsixoption.sendKeys(Helper.getData("Question Types", 19, 31));
			((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
			Thread.sleep(3000);
			Helper.takeScreenshot(driver);
			objIndexPage.ImgPollCropBtn.click();
			Thread.sleep(3000);
			objIndexPage.ImgSixTxtbx.sendKeys(Helper.getData("Question Types", 19, 32));
			Thread.sleep(2000);
		}
	}
	if (count >= 7) {
		String option = Helper.getData("Question Types", 19, 33);
		if (option != "") {
			objIndexPage.Imgsevenoption.sendKeys(Helper.getData("Question Types", 19, 33));
			((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
			Thread.sleep(3000);
			Helper.takeScreenshot(driver);
			objIndexPage.ImgPollCropBtn.click();
			Thread.sleep(3000);
			objIndexPage.ImgsevenTxtbx.sendKeys(Helper.getData("Question Types", 19, 34));
			Thread.sleep(3000);
		}
	}
	if (count >= 8) {
		String option = Helper.getData("Question Types", 19, 35);
		if (option != "") {
			objIndexPage.ImgEightoption.sendKeys(Helper.getData("Question Types", 19, 35));
			((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
			Thread.sleep(3000);
			Helper.takeScreenshot(driver);
			objIndexPage.ImgPollCropBtn.click();
			Thread.sleep(3000);
			objIndexPage.ImgEightTxtbx.sendKeys(Helper.getData("Question Types", 19, 36));
			Thread.sleep(2000);
		}
	}
	if (count >= 9) {
		String option = Helper.getData("Question Types", 19, 37);
		if (option != "") {
			objIndexPage.ImgNineoption.sendKeys(Helper.getData("Question Types", 19, 37));
			((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
			Thread.sleep(3000);
			Helper.takeScreenshot(driver);
			objIndexPage.ImgPollCropBtn.click();
			Thread.sleep(3000);
			objIndexPage.ImgNineTxtbx.sendKeys(Helper.getData("Question Types", 19, 38));
			Thread.sleep(2000);
		}
	}
	if (count >= 10) {
		String option = Helper.getData("Question Types", 19, 39);
		if (option != "") {
			objIndexPage.ImgTenoption.sendKeys(Helper.getData("Question Types", 19, 39));
			((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
			Thread.sleep(3000);
			Helper.takeScreenshot(driver);
			objIndexPage.ImgPollCropBtn.click();
			Thread.sleep(3000);
			objIndexPage.ImgTenTxtbx.sendKeys(Helper.getData("Question Types", 19, 40));
			Thread.sleep(2000);
		}
	}
	objIndexPage.Imgmandatory.click();
	objIndexPage.Imgallowcomments.click();
	objIndexPage.Imgaddquestion.click();
	
		
}
	public void ImageWithTextQuestion() throws Exception {
	 		
	 objIndexPage.ImgwithText.click();
	 objIndexPage.ImgTextquestiontxt.sendKeys(Helper.getData("Question Types", 22, 3));
	 objIndexPage.ImgTexttags.sendKeys(Helper.getData("Question Types", 22, 4));
	 objIndexPage.selectImgTextquestiongroup(Helper.getData("Question Types", 22, 5));
	 objIndexPage.selectImgTextnumberoptions(Helper.getData("Question Types", 22, 6));
	 Thread.sleep(3000);
		int count = Integer.parseInt(Helper.getData("Question Types", 22, 6));
		if (count >= 1) {
			String option = Helper.getData("Question Types", 22, 21);
			if (option != "") {
				objIndexPage.ImgwithText1.sendKeys(Helper.getData("Question Types", 22, 21));
				((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
				Thread.sleep(3000);
				Helper.takeScreenshot(driver);
				objIndexPage.ImgPollCropBtn.click();
				Thread.sleep(3000);
				
			}
		}
		if (count >= 2) {
			String option = Helper.getData("Question Types", 22, 23);
			if (option != "") {
				objIndexPage.ImgwithText2.sendKeys(Helper.getData("Question Types", 22, 23));
				((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
				Thread.sleep(3000);
				Helper.takeScreenshot(driver);
				objIndexPage.ImgPollCropBtn.click();
				Thread.sleep(3000);

			}
		}
		if (count >= 3) {
			String option = Helper.getData("Question Types", 22, 25);
			if (option != "") {
				objIndexPage.ImgwithText3.sendKeys(Helper.getData("Question Types", 22, 25));
				((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
				Thread.sleep(3000);
				Helper.takeScreenshot(driver);
				objIndexPage.ImgPollCropBtn.click();
				Thread.sleep(3000);

			}
		}
		if (count >= 4) {
			String option = Helper.getData("Question Types", 22, 27);
			if (option != "") {
				objIndexPage.ImgwithText4.sendKeys(Helper.getData("Question Types", 22, 27));
				((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
				Thread.sleep(3000);
				Helper.takeScreenshot(driver);
				objIndexPage.ImgPollCropBtn.click();
				Thread.sleep(3000);

			}
		}
		if (count >= 5) {
			String option = Helper.getData("Question Types", 22, 29);
			if (option != "") {
				objIndexPage.ImgwithText5.sendKeys(Helper.getData("Question Types", 22, 29));
				((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
				Thread.sleep(3000);
				Helper.takeScreenshot(driver);
				objIndexPage.ImgPollCropBtn.click();
				Thread.sleep(3000);

			}
		}
		if (count >= 6) {
			String option = Helper.getData("Question Types", 22, 31);
			if (option != "") {
				objIndexPage.ImgwithText6.sendKeys(Helper.getData("Question Types", 22, 31));
				((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
				Thread.sleep(3000);
				Helper.takeScreenshot(driver);
				objIndexPage.ImgPollCropBtn.click();
				Thread.sleep(3000);

			}
		}
		if (count >= 7) {
			String option = Helper.getData("Question Types", 22, 33);
			if (option != "") {
				objIndexPage.ImgwithText7.sendKeys(Helper.getData("Question Types", 22, 33));
				((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
				Thread.sleep(3000);
				Helper.takeScreenshot(driver);
				objIndexPage.ImgPollCropBtn.click();
				Thread.sleep(3000);

			}
		}
		if (count >= 8) {
			String option = Helper.getData("Question Types", 22, 35);
			if (option != "") {
				objIndexPage.ImgwithText8.sendKeys(Helper.getData("Question Types", 22, 35));
				((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
				Thread.sleep(3000);
				Helper.takeScreenshot(driver);
				objIndexPage.ImgPollCropBtn.click();
				Thread.sleep(3000);

			}
		}
		if (count >= 9) {
			String option = Helper.getData("Question Types", 22, 37);
			if (option != "") {
				objIndexPage.ImgwithText9.sendKeys(Helper.getData("Question Types", 22, 37));
				((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
				Thread.sleep(3000);
				Helper.takeScreenshot(driver);
				objIndexPage.ImgPollCropBtn.click();
				Thread.sleep(3000);

			}
		}
		if (count >= 10) {
			String option = Helper.getData("Question Types", 22, 39);
			if (option != "") {
				objIndexPage.ImgwithText10.sendKeys(Helper.getData("Question Types", 22, 39));
				((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
				Thread.sleep(3000);
				Helper.takeScreenshot(driver);
				objIndexPage.ImgPollCropBtn.click();
				Thread.sleep(3000);

			}
		}
		
		objIndexPage.ImgTextmandatory.click();
		objIndexPage.ImgTextallowcomments.click();
		objIndexPage.ImgTextaddquestion.click();
	 
 }
  	public void MultipleSelectDropdownQuestion() throws Exception {
  		
  		objIndexPage.MultipleSelectdropdown.click();
		objIndexPage.Multiplequestiontxt.sendKeys(Helper.getData("Question Types", 25, 3));
		objIndexPage.Multipletags.sendKeys(Helper.getData("Question Types", 25, 4));
		objIndexPage.selectMultiplequestiongroup(Helper.getData("Question Types", 25, 5));
		Thread.sleep(2000);
		objIndexPage.selectMultiplenumberoptions(Helper.getData("Question Types", 25, 6));
		int count = Integer.parseInt(Helper.getData("Question Types", 25, 6));
		if (count >= 1) {
			String option = Helper.getData("Question Types", 25, 7);
			if (option != "") {
				objIndexPage.Multipleenterfirstoption.sendKeys(Helper.getData("Question Types", 25, 7));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 2) {
			String option = Helper.getData("Question Types", 25, 8);
			if (option != "") {
				objIndexPage.Multipleentersecondoption.sendKeys(Helper.getData("Question Types", 25, 8));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 3) {
			String option = Helper.getData("Question Types", 25, 9);
			if (option != "") {
				objIndexPage.MultipleenterThirdoption.sendKeys(Helper.getData("Question Types", 25, 9));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 4) {
			String option = Helper.getData("Question Types", 25, 10);
			if (option != "") {
				objIndexPage.MultipleenterFourthoption.sendKeys(Helper.getData("Question Types", 25, 10));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 5) {
			String option = Helper.getData("Question Types", 25, 11);
			if (option != "") {
				objIndexPage.MultipleenterFiveoption.sendKeys(Helper.getData("Question Types", 25, 11));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 6) {
			String option = Helper.getData("Question Types", 25, 12);
			if (option != "") {
				objIndexPage.MultipleenterSixoption.sendKeys(Helper.getData("Question Types", 25, 12));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 7) {
			String option = Helper.getData("Question Types", 25, 13);
			if (option != "") {
				objIndexPage.MultipleenterSevenoption.sendKeys(Helper.getData("Question Types", 25, 13));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 8) {
			String option = Helper.getData("Question Types", 25, 14);
			if (option != "") {
				objIndexPage.MultipleenterEightoption.sendKeys(Helper.getData("Question Types", 25, 14));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 9) {
			String option = Helper.getData("Question Types", 25, 15);
			if (option != "") {
				objIndexPage.Multipleenternineoption.sendKeys(Helper.getData("Question Types", 25, 15));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 10) {
			String option = Helper.getData("Question Types", 25, 16);
			if (option != "") {
				objIndexPage.MultipleenterTenoption.sendKeys(Helper.getData("Question Types", 25, 16));
				Helper.takeScreenshot(driver);
			}
		}

		((JavascriptExecutor) driver).executeScript("scroll(0, 800);");
		objIndexPage.Multiplemandatory.click();
		objIndexPage.Multipleallowcomments.click();
		objIndexPage.Multipleaddquestion.click();
		
	 
 }
 	public void MultipleTextBoxesQuestion() throws Exception {
  		
 		objIndexPage.MultipleTextboxes.click();
		objIndexPage.MultipleTextquestiontxt.sendKeys(Helper.getData("Question Types", 28, 3));
		objIndexPage.MultipleTexttags.sendKeys(Helper.getData("Question Types", 28, 4));
		objIndexPage.selectMultipleTextquestiongroup(Helper.getData("Question Types", 28, 5));
		Thread.sleep(2000);
		objIndexPage.selectMultipleTextnumberoptions(Helper.getData("Question Types", 28, 6));
		int count = Integer.parseInt(Helper.getData("Question Types", 28, 6));
		if (count >= 1) {
			String option = Helper.getData("Question Types", 28, 7);
			if (option != "") {
				objIndexPage.MultipleTextenterfirstoption.sendKeys(Helper.getData("Question Types", 28, 7));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 2) {
			String option = Helper.getData("Question Types", 28, 8);
			if (option != "") {
				objIndexPage.MultipleTextentersecondoption.sendKeys(Helper.getData("Question Types", 28, 8));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 3) {
			String option = Helper.getData("Question Types", 28, 9);
			if (option != "") {
				objIndexPage.MultipleTextenterThirdoption.sendKeys(Helper.getData("Question Types", 28, 9));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 4) {
			String option = Helper.getData("Question Types", 28, 10);
			if (option != "") {
				objIndexPage.MultipleTextenterFourthoption.sendKeys(Helper.getData("Question Types", 28, 10));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 5) {
			String option = Helper.getData("Question Types", 28, 11);
			if (option != "") {
				objIndexPage.MultipleTextenterFiveoption.sendKeys(Helper.getData("Question Types", 28, 11));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 6) {
			String option = Helper.getData("Question Types", 28, 12);
			if (option != "") {
				objIndexPage.MultipleTextenterSixoption.sendKeys(Helper.getData("Question Types", 28, 12));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 7) {
			String option = Helper.getData("Question Types", 28, 13);
			if (option != "") {
				objIndexPage.MultipleTextenterSevenoption.sendKeys(Helper.getData("Question Types", 28, 13));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 8) {
			String option = Helper.getData("Question Types", 28, 14);
			if (option != "") {
				objIndexPage.MultipleTextenterEightoption.sendKeys(Helper.getData("Question Types", 28, 14));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 9) {
			String option = Helper.getData("Question Types", 28, 15);
			if (option != "") {
				objIndexPage.MultipleTextenternineoption.sendKeys(Helper.getData("Question Types", 28, 15));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 10) {
			String option = Helper.getData("Question Types", 28, 16);
			if (option != "") {
				objIndexPage.MultipleTextenterTenoption.sendKeys(Helper.getData("Question Types", 28, 16));
				Helper.takeScreenshot(driver);
			}
		}

		((JavascriptExecutor) driver).executeScript("scroll(0, 800);");
		objIndexPage.MultipleTextmandatory.click();
		objIndexPage.MultipleTextallowcomments.click();
		objIndexPage.MultipleTextaddquestion.click();
	
		 	}
 	public void NPSScoreQuestion() throws Exception {
 		
 		objIndexPage.NPSScoreBtn.click();
 		objIndexPage.NPSQuestionText.sendKeys(Helper.getData("Question Types", 31, 3));
 		objIndexPage.NPSTags.sendKeys(Helper.getData("Question Types", 31, 4));
 		objIndexPage.selectNPSQuestionGroup(Helper.getData("Question Types", 31, 5));
 		objIndexPage.NPSLabelText.sendKeys(Helper.getData("Question Types", 31, 17));
 		objIndexPage.NPSIsMandatory.click();
 		objIndexPage.NPSAllowcomments.click();
 		objIndexPage.NPSShowthisquestion.click();
 		objIndexPage.NPSAddquestion.click();
 	}
 	public void NumberQuestion() throws Exception {
 		
	objIndexPage.NumberBtn.click();
	objIndexPage.Numberquestiontxt.sendKeys(Helper.getData("Question Types", 34, 3));
	objIndexPage.Numbertags.sendKeys(Helper.getData("Question Types", 34, 4));
	objIndexPage.selectNumberquestiongroup(Helper.getData("Question Types", 34, 5));
	objIndexPage.NumberLabelText.sendKeys(Helper.getData("Question Types", 34, 17));
	objIndexPage.Numbermandatory.click();
	objIndexPage.Numberallowcomments.click();
	objIndexPage.Numberaddquestion.click();

 	}
    public void RadioButtonQuestion() throws Exception {
	
	objIndexPage.RadioButton.click();
	objIndexPage.Radioquestiontxt.sendKeys(Helper.getData("Question Types", 37, 3));
	objIndexPage.Radiotags.sendKeys(Helper.getData("Question Types", 37, 4));
	objIndexPage.selectRadioquestiongroup(Helper.getData("Question Types", 37, 5));
	Thread.sleep(2000);
	objIndexPage.selectRadionumberoptions(Helper.getData("Question Types", 37, 6));
	int count = Integer.parseInt(Helper.getData("Question Types", 37, 6));
	if (count >= 1) {
		String option = Helper.getData("Question Types", 37, 7);
		if (option != "") {
			objIndexPage.Radioenterfirstoption.sendKeys(Helper.getData("Question Types", 37, 7));
			Helper.takeScreenshot(driver);
		}
	}
	if (count >= 2) {
		String option = Helper.getData("Question Types", 37, 8);
		if (option != "") {
			objIndexPage.Radioentersecondoption.sendKeys(Helper.getData("Question Types", 37, 8));
			Helper.takeScreenshot(driver);
		}
	}
	if (count >= 3) {
		String option = Helper.getData("Question Types", 37, 9);
		if (option != "") {
			objIndexPage.RadioenterThirdoption.sendKeys(Helper.getData("Question Types", 37, 9));
			Helper.takeScreenshot(driver);
		}
	}
	if (count >= 4) {
		String option = Helper.getData("Question Types", 37, 10);
		if (option != "") {
			objIndexPage.RadioenterFourthoption.sendKeys(Helper.getData("Question Types", 37, 10));
			Helper.takeScreenshot(driver);
		}
	}
	if (count >= 5) {
		String option = Helper.getData("Question Types", 37, 11);
		if (option != "") {
			objIndexPage.RadioenterFiveoption.sendKeys(Helper.getData("Question Types", 37, 11));
			Helper.takeScreenshot(driver);
		}
	}
	if (count >= 6) {
		String option = Helper.getData("Question Types", 37, 12);
		if (option != "") {
			objIndexPage.RadioenterSixoption.sendKeys(Helper.getData("Question Types", 37, 12));
			Helper.takeScreenshot(driver);
		}
	}
	if (count >= 7) {
		String option = Helper.getData("Question Types", 37, 13);
		if (option != "") {
			objIndexPage.RadioenterSevenoption.sendKeys(Helper.getData("Question Types", 37, 13));
			Helper.takeScreenshot(driver);
		}
	}
	if (count >= 8) {
		String option = Helper.getData("Question Types", 37, 14);
		if (option != "") {
			objIndexPage.RadioenterEightoption.sendKeys(Helper.getData("Question Types", 37, 14));
			Helper.takeScreenshot(driver);
		}
	}
	if (count >= 9) {
		String option = Helper.getData("Question Types", 37, 15);
		if (option != "") {
			objIndexPage.Radioenternineoption.sendKeys(Helper.getData("Question Types", 37, 15));
			Helper.takeScreenshot(driver);
		}
	}
	if (count >= 10) {
		String option = Helper.getData("Question Types", 37, 16);
		if (option != "") {
			objIndexPage.RadioenterTenoption.sendKeys(Helper.getData("Question Types", 37, 16));
			Helper.takeScreenshot(driver);
		}
	}

	((JavascriptExecutor) driver).executeScript("scroll(0, 800);");
	objIndexPage.Radiomandatory.click();
	objIndexPage.Radioallowcomments.click();
	objIndexPage.Radioshowquestions.click();
	objIndexPage.RadioaddquestionBtn.click();
	
}
  	public void RadioButtonQuestionWithWiseWeightages() throws Exception {
    	    
    	objIndexPage.RadioButton.click();
    	((JavascriptExecutor) driver).executeScript("scroll(0, 0);");
    	objIndexPage.QuestionTypeWithWiseWeightagesChkBx.click();
    	objIndexPage.Radioquestiontxt.sendKeys(Helper.getData("Question Types", 37, 3));
    	objIndexPage.Radiotags.sendKeys(Helper.getData("Question Types", 37, 4));
    	objIndexPage.selectRadioquestiongroup(Helper.getData("Question Types", 37, 5));
    	Thread.sleep(2000);
    	objIndexPage.selectRadionumberoptions(Helper.getData("Question Types", 37, 6));
    	((JavascriptExecutor) driver).executeScript("scroll(0, 800);");
    	int count = Integer.parseInt(Helper.getData("Question Types", 37, 6));
    	if (count >= 1) {
    		String option = Helper.getData("Question Types", 37, 7);
    		if (option != "") {
    			objIndexPage.Radioenterfirstoption.sendKeys(Helper.getData("Question Types", 37, 7));
    			Helper.takeScreenshot(driver);
    		}
    	}
    	if (count >= 2) {
    		String option = Helper.getData("Question Types", 37, 8);
    		if (option != "") {
    			objIndexPage.Radioentersecondoption.sendKeys(Helper.getData("Question Types", 37, 8));
    			Helper.takeScreenshot(driver);
    		}
    	}
    	if (count >= 3) {
    		String option = Helper.getData("Question Types", 37, 9);
    		if (option != "") {
    			objIndexPage.RadioenterThirdoption.sendKeys(Helper.getData("Question Types", 37, 9));
    			Helper.takeScreenshot(driver);
    		}
    	}
    	if (count >= 4) {
    		String option = Helper.getData("Question Types", 37, 10);
    		if (option != "") {
    			objIndexPage.RadioenterFourthoption.sendKeys(Helper.getData("Question Types", 37, 10));
    			Helper.takeScreenshot(driver);
    		}
    	}
    	if (count >= 5) {
    		String option = Helper.getData("Question Types", 37, 11);
    		if (option != "") {
    			objIndexPage.RadioenterFiveoption.sendKeys(Helper.getData("Question Types", 37, 11));
    			Helper.takeScreenshot(driver);
    		}
    	}
    	if (count >= 6) {
    		String option = Helper.getData("Question Types", 37, 12);
    		if (option != "") {
    			objIndexPage.RadioenterSixoption.sendKeys(Helper.getData("Question Types", 37, 12));
    			Helper.takeScreenshot(driver);
    		}
    	}
    	if (count >= 7) {
    		String option = Helper.getData("Question Types", 37, 13);
    		if (option != "") {
    			objIndexPage.RadioenterSevenoption.sendKeys(Helper.getData("Question Types", 37, 13));
    			Helper.takeScreenshot(driver);
    		}
    	}
    	if (count >= 8) {
    		String option = Helper.getData("Question Types", 37, 14);
    		if (option != "") {
    			objIndexPage.RadioenterEightoption.sendKeys(Helper.getData("Question Types", 37, 14));
    			Helper.takeScreenshot(driver);
    		}
    	}
    	if (count >= 9) {
    		String option = Helper.getData("Question Types", 37, 15);
    		if (option != "") {
    			objIndexPage.Radioenternineoption.sendKeys(Helper.getData("Question Types", 37, 15));
    			Helper.takeScreenshot(driver);
    		}
    	}
    	if (count >= 10) {
    		String option = Helper.getData("Question Types", 37, 16);
    		if (option != "") {
    			objIndexPage.RadioenterTenoption.sendKeys(Helper.getData("Question Types", 37, 16));
    			Helper.takeScreenshot(driver);
    		}
    	}

    	((JavascriptExecutor) driver).executeScript("scroll(0, 800);");
    	objIndexPage.Radiomandatory.click();
    	objIndexPage.Radioallowcomments.click();
    	objIndexPage.Radioshowquestions.click();
    	objIndexPage.RadioaddquestionBtn.click();
    	
    }
    public void ScaleRateQuestion() throws Exception {
	
	objIndexPage.ScaleRateTabClk.click();
	objIndexPage.Scalequestiontxt.sendKeys(Helper.getData("Question Types", 40, 3));
	objIndexPage.Scaletags.sendKeys(Helper.getData("Question Types", 40, 4));
	objIndexPage.selectScalequestiongroup(Helper.getData("Question Types", 40, 5));
	objIndexPage.ScaleLabelText.sendKeys(Helper.getData("Question Types", 40, 17));
	objIndexPage.Scalemandatory.click();
	objIndexPage.Scaleallowcomments.click();
	objIndexPage.Scaleshowquestions.click();
	objIndexPage.Scaleaddquestion.click();
	
}
    public void ScaleRateQuestionWithWiseWeightages() throws Exception {
    	
    	objIndexPage.ScaleRateTabClk.click();
    	((JavascriptExecutor) driver).executeScript("scroll(0, 0);");
    	objIndexPage.QuestionTypeWithWiseWeightagesChkBx.click();
    	objIndexPage.Scalequestiontxt.sendKeys(Helper.getData("Question Types", 40, 3));
    	objIndexPage.Scaletags.sendKeys(Helper.getData("Question Types", 40, 4));
    	objIndexPage.selectScalequestiongroup(Helper.getData("Question Types", 40, 5));
    	objIndexPage.ScaleLabelText.sendKeys(Helper.getData("Question Types", 40, 17));
    	((JavascriptExecutor) driver).executeScript("scroll(0, 800);");
    	objIndexPage.Scalemandatory.click();
    	objIndexPage.Scaleallowcomments.click();
    	objIndexPage.Scaleshowquestions.click();
    	objIndexPage.Scaleaddquestion.click();
    	
    }
    public void SingleLineText() throws Exception {
	
    	objIndexPage.SinglelineText.click();
    	objIndexPage.Singlelinequestiontxt.sendKeys(Helper.getData("Question Types", 43, 3));
    	objIndexPage.Singlelinetags.sendKeys(Helper.getData("Question Types", 43, 4));
    	objIndexPage.selectSinglelinequestiongroup(Helper.getData("Question Types", 43, 5));
    	objIndexPage.SinglelineLabelText.sendKeys(Helper.getData("Question Types", 43, 17));
    	objIndexPage.Singlelinemandatory.click();
    	objIndexPage.Singlelineallowcomments.click();
    	objIndexPage.Singlelineaddquestion.click();
	
}
    public void TextAreaQuestion() throws Exception {
    	   	
    	objIndexPage.TextArea.click();
    	objIndexPage.Textareaquestiontxt.sendKeys(Helper.getData("Question Types", 46, 3));
  	   	objIndexPage.Textareatags.sendKeys(Helper.getData("Question Types", 46, 4));
    	objIndexPage.selectTextareaquestiongroup(Helper.getData("Question Types", 46, 5));
    	objIndexPage.TextareaLabelText.sendKeys(Helper.getData("Question Types", 46, 17));
    	objIndexPage.Textareamandatory.click();
    	objIndexPage.Textareaallowcomments.click();
    	objIndexPage.Textareaaddquestion.click();
    	Thread.sleep(2000);
	
}
    public void YesOrNoQuestion() throws Exception {
	   	
    
    	objIndexPage.YesorNo.click();
    	objIndexPage.Yesquestiontxt.sendKeys(Helper.getData("Question Types", 49, 3));
    	objIndexPage.Yestags.sendKeys(Helper.getData("Question Types", 49, 4));
    	objIndexPage.selectYesquestiongroup(Helper.getData("Question Types", 49, 5));
    	objIndexPage.YesLabelText.sendKeys(Helper.getData("Question Types", 49, 17));
    	objIndexPage.Yesmandatory.click();
    	objIndexPage.Yesallowcomments.click();
    	objIndexPage.Yesshowquestions.click();
    	Thread.sleep(2000);
    	
	
}
    public void YesOrNoQuestionWithWiseWeightages() throws Exception {
	   	
        
    	objIndexPage.YesorNo.click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("scroll(0, 0);");
		Thread.sleep(2000);
    	objIndexPage.QuestionTypeWithWiseWeightagesChkBx.click();
    	objIndexPage.Yesquestiontxt.sendKeys(Helper.getData("Question Types", 49, 3));
    	objIndexPage.Yestags.sendKeys(Helper.getData("Question Types", 49, 4));
    	objIndexPage.selectYesquestiongroup(Helper.getData("Question Types", 49, 5));
    	objIndexPage.YesLabelText.sendKeys(Helper.getData("Question Types", 49, 17));
    	objIndexPage.Yesmandatory.click();
    	objIndexPage.Yesallowcomments.click();
    	objIndexPage.Yesaddquestion.click();
//    	objIndexPage.Yesshowquestions.click();
    	Thread.sleep(2000);
    	
	
}
    
    public void QuestionScrollDown() throws Exception {
	
		Actions actions = new Actions(driver);
		WebElement subMenu = driver.findElement(By.xpath("//*[@id='mCSB_1']"));
		actions.moveToElement(subMenu).click().build().perform();
		
		Thread.sleep(2000);
		
		EventFiringWebDriver eventfiringwebdriver = new EventFiringWebDriver(driver);
		eventfiringwebdriver.executeScript("document.querySelector('#mCSB_1').scrollTop=400");
				
	}
  	
    public void QuestionScrollDown1() throws Exception {
  		
		Actions actions = new Actions(driver);
		WebElement subMenu = driver.findElement(By.xpath("//*[@id='mCSB_1']"));
		actions.moveToElement(subMenu).click().build().perform();
		
		Thread.sleep(2000);
		
		EventFiringWebDriver eventfiringwebdriver = new EventFiringWebDriver(driver);
		eventfiringwebdriver.executeScript("document.querySelector('#mCSB_1').scrollTop=700");
				
	}
  	
    public void DropdownWithoutWeightageQuestion() throws Exception {

		objIndexPage.DropdownLnk.click();
		objIndexPage.Drpquestiontxt.sendKeys(Helper.getData("Question Types", 8, 3));
		objIndexPage.checkbxtags.sendKeys(Helper.getData("Question Types", 8, 4));
		objIndexPage.selectDrpbxquestiongroup(Helper.getData("Question Types", 8, 5));
		Thread.sleep(2000);
		objIndexPage.selectDrpnumberoptions(Helper.getData("Question Types", 8, 6));
		Thread.sleep(3000);
		int count = Integer.parseInt(Helper.getData("Question Types", 8, 6));
		if (count >= 1) {
			String option = Helper.getData("Question Types", 8, 7);
			if (option != "") {
				objIndexPage.Drpenterfirstoption.sendKeys(Helper.getData("Question Types", 8, 7));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 2) {
			String option = Helper.getData("Question Types", 8, 8);
			if (option != "") {
				objIndexPage.Drpentersecondoption.sendKeys(Helper.getData("Question Types", 8, 8));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 3) {
			String option = Helper.getData("Question Types", 8, 9);
			if (option != "") {
				objIndexPage.DrpenterThirdoption.sendKeys(Helper.getData("Question Types", 8, 9));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 4) {
			String option = Helper.getData("Question Types", 8, 10);
			if (option != "") {
				objIndexPage.DrpenterFourthoption.sendKeys(Helper.getData("Question Types", 8, 10));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 5) {
			String option = Helper.getData("Question Types", 8, 11);
			if (option != "") {
				objIndexPage.DrpenterFiveoption.sendKeys(Helper.getData("Question Types", 8, 11));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 6) {
			String option = Helper.getData("Question Types", 8, 12);
			if (option != "") {
				objIndexPage.DrpenterSixoption.sendKeys(Helper.getData("Question Types", 8, 12));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 7) {
			String option = Helper.getData("Question Types", 8, 13);
			if (option != "") {
				objIndexPage.DrpenterSevenoption.sendKeys(Helper.getData("Question Types", 8, 13));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 8) {
			String option = Helper.getData("Question Types", 8, 14);
			if (option != "") {
				objIndexPage.DrpenterEightoption.sendKeys(Helper.getData("Question Types", 8, 14));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 9) {
			String option = Helper.getData("Question Types", 8, 15);
			if (option != "") {
				objIndexPage.Drpenternineoption.sendKeys(Helper.getData("Question Types", 8, 15));
				Helper.takeScreenshot(driver);
			}
		}
		if (count >= 10) {
			String option = Helper.getData("Question Types", 8, 16);
			if (option != "") {
				objIndexPage.DrpenterTenoption.sendKeys(Helper.getData("Question Types", 8, 16));
				Helper.takeScreenshot(driver);
			}
		}
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("scroll(0, 3000);");
		Thread.sleep(3000);

		objIndexPage.Drpbxmandatory.click();
		objIndexPage.Drpallowcomments.click();
		objIndexPage.Drpshowquestions.click();

	}
	public void QuestionPageSaveAndNextBtn() throws Exception {
		((JavascriptExecutor) driver).executeScript("scroll(0, 800);");
		objCreateSurveyQuestionsPage.SingleSurveyQuestoinSaveNextBtn.click();
	}
	public void SurveyQuestoinSaveNextBtnYesOrNoBtn() throws Exception {
		((JavascriptExecutor) driver).executeScript("scroll(0, 800);");
		objCreateSurveyQuestionsPage.SurveyQuestoinSaveNextBtnYesOrNo.click();
	}
	public void QuestionSaveAndPublish() throws Exception {
		objIndexPage.QuestionSaveAndNextDrp.click();
		objIndexPage.QuestionSaveAndPublish.click();
	}
	public void QuestionSaveAndDraft() throws Exception {
		objIndexPage.QuestionSaveAndNextDrp.click();
		objIndexPage.QuestionSaveAndDraft.click();
	}
	
    public void QuestionBillingProceed() throws Exception {
		
		objIndexPage.QuestionBillingProceedBtn.click();
	}

	// Question Logic Page Methods

	public void QuestionLogicPageSaveAndNextBtn() throws Exception {
	
		objCreateSurveyQuestionsPage.questionLogicNextBtn.click();
	}
	public void QuestionLogicPageSaveAndPublish() throws Exception {
		
		objIndexPage.questionLogicNextBtnDrpDwn.click();
		objIndexPage.questionLogicNextBtnSaveAndPublish.click();
	}
	public void QuestionLogicBillingProceed() throws Exception {
		
		objIndexPage.QuestionLogicBillingProceedBtn.click();
	}

	// Preview and Customize Page Methods
	
	public void PreviewAndCustomizePageNextBtn() throws Exception {
		objCreateSurveyQuestionsPage.PreviewAndCustomizeNextBtn.click();
	}
	public void QuestionPreviewAndCustomizePageSkipAndPublish() throws Exception {
		
		objIndexPage.questionPreviewAndCustomizeSkipAndNextBtnDrpDwn.click();
		objIndexPage.questionPreviewAndCustomizeSkipAndPublish.click();
	}
    public void PreviewAndCustomizePageSaveAndPublish() throws Exception {
		
		objIndexPage.questionPreviewAndCustomizeSaveAndNextBtnDrpDwn.click();
		objIndexPage.questionPreviewAndCustomizeSaveAndPublish.click();
	}
	public void QuestionPreviewAndCustomizeBillingProceed() throws Exception {
		
		objIndexPage.QuestionPreviewAndCustomizeBillingProceedBtn.click();
	}
	
	
	// Rewards Page Methods

	public void DetailPageMultipleWinnerReward(int row) throws Exception {

		Thread.sleep(2000);
		objCreateSurveyPage.surveyNameTxtbx.sendKeys(Helper.getData("SurveyRewardMultipleWinner", row, 2));
		objCreateSurveyPage.descriptionTxtArea.sendKeys(Helper.getData("SurveyRewardMultipleWinner", row, 3));
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("scroll(0, 800);");
		objCreateSurveyPage.selectCategory(Helper.getData("SurveyRewardMultipleWinner", row, 4));
		((JavascriptExecutor) driver).executeScript("scroll(0, 800);");
	}
	public void SingleWinnerReward(int row) throws Exception {
		// Rewards section
		((JavascriptExecutor) driver).executeScript("scroll(0, 250);");
		Thread.sleep(2000);
		Helper.takeScreenshot(driver);
		objCreateSurveyQuestionsPage.criteriaaddBtnn.click();

		// Rewards section for Single Winner
		Thread.sleep(5000);
		Helper.takeScreenshot(driver);
		objCreateSurveyQuestionsPage.criteriaNameTxtBx.sendKeys((Helper.getData("SurveyRewardSingleWinner", row, 11)));
		objCreateSurveyQuestionsPage.deliveryDate.sendKeys((Helper.getData("SurveyRewardSingleWinner", row, 12)));
		objCreateSurveyQuestionsPage.winnerSelectionDate.sendKeys(Helper.getData("SurveyRewardSingleWinner", row, 13));
		objCreateSurveyQuestionsPage.SingleSelection(Helper.getData("SurveyRewardSingleWinner", row, 14));
		objCreateSurveyQuestionsPage.startDate.sendKeys(Helper.getData("SurveyRewardSingleWinner", row, 15));
		objCreateSurveyQuestionsPage.endDate.sendKeys(Helper.getData("SurveyRewardSingleWinner", row, 16));
		objCreateSurveyQuestionsPage.SingleAddRewardBtn.click();
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("scroll(0, 700);");

		String Rewards = Helper.getData("SurveyRewardSingleWinner", row, 17);

		if (Rewards.equals("Cash")) {

			// Rewards Cash tab details for single winner
			Helper.takeScreenshot(driver);
			objCreateSurveyQuestionsPage.CashTitleTxtBx.sendKeys(Helper.getData("SurveyRewardSingleWinner", row, 18));
			objCreateSurveyQuestionsPage.CashAmountDrpDwn(Helper.getData("SurveyRewardSingleWinner", row, 19));
			objCreateSurveyQuestionsPage.CashRewardAmountTxtBx
					.sendKeys(Helper.getData("SurveyRewardSingleWinner", row, 20));
			objCreateSurveyQuestionsPage.CashRewardDescriptionTxtBx
					.sendKeys(Helper.getData("SurveyRewardSingleWinner", row, 21));
			objCreateSurveyQuestionsPage.CashRewardAddBtn.click();

			Thread.sleep(3000);
			((JavascriptExecutor) driver).executeScript("scroll(0, 1000);");
			objCreateSurveyQuestionsPage.CashRewardSaveCriteriaBtn.click();
			Thread.sleep(3000);
			objCreateSurveyQuestionsPage.RewardSaveAndPublishBtn.click();
			Thread.sleep(3000);
			//objCreateSurveyQuestionsPage.AmountProcessedBtn.click();

			Helper.takeScreenshot(driver);

		} else if (Rewards.equals("Points")) {

			// Rewards Points tab details for single winner
			Helper.takeScreenshot(driver);
			objCreateSurveyQuestionsPage.SinglePointsTab.click();
			objCreateSurveyQuestionsPage.SinglePointTitleTxtBx
					.sendKeys(Helper.getData("SurveyRewardSingleWinner", row, 22));
			objCreateSurveyQuestionsPage.SinglePointRewardsTxtBx
					.sendKeys(Helper.getData("SurveyRewardSingleWinner", row, 23));
			objCreateSurveyQuestionsPage.SinglePointCanRedeemChkBtn.click();
			objCreateSurveyQuestionsPage.SinglePointDescriptionTxtBx
					.sendKeys(Helper.getData("SurveyRewardSingleWinner", row, 25));
			objCreateSurveyQuestionsPage.SinglePointAddbtn.click();

			Thread.sleep(5000);
			((JavascriptExecutor) driver).executeScript("scroll(0, 1000);");
			objCreateSurveyQuestionsPage.CashRewardSaveCriteriaBtn.click();
			objCreateSurveyQuestionsPage.RewardSaveAndPublishBtn.click();

		} else if (Rewards.equals("Products"))

		{
			// Rewards Products tab details for single winner
			Helper.takeScreenshot(driver);

			objCreateSurveyQuestionsPage.SingleproductsTab.click();
			objCreateSurveyQuestionsPage.SingleProductTitleTxt
					.sendKeys(Helper.getData("SurveyRewardSingleWinner", row, 26));
			objCreateSurveyQuestionsPage.SingleProductNameTxt
					.sendKeys(Helper.getData("SurveyRewardSingleWinner", row, 27));
			objCreateSurveyQuestionsPage.SingleProductQuantityTxt
					.sendKeys(Helper.getData("SurveyRewardSingleWinner", row, 28));
			objCreateSurveyQuestionsPage.SingleProductValueTxt
					.sendKeys(Helper.getData("SurveyRewardSingleWinner", row, 29));
			objCreateSurveyQuestionsPage.SingleProductDescriptionTxt
					.sendKeys(Helper.getData("SurveyRewardSingleWinner", row, 30));
			objCreateSurveyQuestionsPage
					.SinglePointOnlineAndOffline(Helper.getData("SurveyRewardSingleWinner", row, 31));

			String OffOnline = Helper.getData("SurveyRewardSingleWinner", row, 31);

			if (OffOnline.equals("Offline")) {

				objCreateSurveyQuestionsPage
						.SingleWinnerofflineCountryDrpDwn(Helper.getData("SurveyRewardSingleWinner", row, 32));
				objCreateSurveyQuestionsPage.SingleWinnerOfflineamount
						.sendKeys(Helper.getData("SurveyRewardSingleWinner", row, 33));
				objCreateSurveyQuestionsPage.SingleProductAddBtn.click();

				Thread.sleep(5000);
				((JavascriptExecutor) driver).executeScript("scroll(0, 1000);");
				objCreateSurveyQuestionsPage.CashRewardSaveCriteriaBtn.click();
				objCreateSurveyQuestionsPage.RewardSaveAndPublishBtn.click();
			} else {
				objCreateSurveyQuestionsPage.SingleProductAddBtn.click();
				Thread.sleep(2000);
				((JavascriptExecutor) driver).executeScript("scroll(0, 1000);");
				objCreateSurveyQuestionsPage.CashRewardSaveCriteriaBtn.click();
				objCreateSurveyQuestionsPage.RewardSaveAndPublishBtn.click();
			}

		}
	}
	public void MultipleWinnerReward(int row) throws Exception {

		// Rewards section
		((JavascriptExecutor) driver).executeScript("scroll(0, 250);");
		Thread.sleep(2000);
		Helper.takeScreenshot(driver);
		objCreateSurveyQuestionsPage.criteriaaddBtnn.click();

		// Rewards section for Multiple Winner

		Thread.sleep(5000);
		Helper.takeScreenshot(driver);
		objCreateSurveyQuestionsPage.multipleWinnersTabBtn.click();
		objCreateSurveyQuestionsPage.multipleCriteriaNameTxtBx.sendKeys((Helper.getData("SurveyRewardMultipleWinner", row, 11)));
		
		Thread.sleep(2000);

		String unlimited = Helper.getData("SurveyRewardMultipleWinner", row, 13);

		if (unlimited.contains("yes")) {
			objCreateSurveyQuestionsPage.multipleUnlimitedChkBtn.click();
			objCreateSurveyQuestionsPage.ExceptedNoOfWinners.sendKeys((Helper.getData("SurveyRewardMultipleWinner", row, 14)));
		} else {
			objCreateSurveyQuestionsPage.multipleNoOfWinnersTxtBx.sendKeys((Helper.getData("SurveyRewardMultipleWinner", row, 12)));
		}
		Thread.sleep(2000);
		
		String autoselect = Helper.getData("SurveyRewardMultipleWinner", row, 15);
		if (autoselect.contains("yes"))
		{
		objCreateSurveyQuestionsPage.multipleAutoSelectBtn.click();
		}
		
		Thread.sleep(2000);
		objCreateSurveyQuestionsPage.multipleWinnerSelectionDate.sendKeys((Helper.getData("SurveyRewardMultipleWinner", row, 16)));
		objCreateSurveyQuestionsPage.multiplePeriodicWinnerCountTxtBx.sendKeys((Helper.getData("SurveyRewardMultipleWinner", row, 17)));
		Thread.sleep(2000);
		
		objCreateSurveyQuestionsPage.multipleSelectionDrpDwn((Helper.getData("SurveyRewardMultipleWinner", row, 18)));

		String SelectionType = Helper.getData("SurveyRewardMultipleWinner", row, 18);

		if (SelectionType.contains("Every")) {

			objCreateSurveyQuestionsPage.multipleTotalParticipantsTxtBx.sendKeys((Helper.getData("SurveyRewardMultipleWinner", row, 19)));
			Thread.sleep(2000);
			objCreateSurveyQuestionsPage.multipleDurationDrpDwn((Helper.getData("SurveyRewardMultipleWinner", row, 20)));
			objCreateSurveyQuestionsPage.multipleNoOfTextBx.sendKeys((Helper.getData("SurveyRewardMultipleWinner", row, 21)));
			Thread.sleep(2000);
			objCreateSurveyQuestionsPage.multipleSelectPeriodDrpDwn((Helper.getData("SurveyRewardMultipleWinner", row, 22)));
			Thread.sleep(2000);
						
			String ExcludePeriods = Helper.getData("SurveyRewardMultipleWinner", row, 23);
			if (ExcludePeriods.contains("yes"))
			{
			objCreateSurveyQuestionsPage.multipleExcludePeriodsChkBtn.click();
			}
			
			objCreateSurveyQuestionsPage.multipleStartDate.sendKeys(Helper.getData("SurveyRewardMultipleWinner", row, 24));
			objCreateSurveyQuestionsPage.multiplEendDate.sendKeys(Helper.getData("SurveyRewardMultipleWinner", row, 25));
			objCreateSurveyQuestionsPage.multipleRewardsDeliveryDays.sendKeys(Helper.getData("SurveyRewardMultipleWinner", row, 26));
			objCreateSurveyQuestionsPage.multipleAddRewardsBtn.click();

		} else if (SelectionType.contains("All Event")) {

			objCreateSurveyQuestionsPage.multipleStartDate.sendKeys(Helper.getData("SurveyRewardMultipleWinner", row, 24));
			objCreateSurveyQuestionsPage.multiplEendDate.sendKeys(Helper.getData("SurveyRewardMultipleWinner", row, 25));
			objCreateSurveyQuestionsPage.multipleRewardsDeliveryDays.sendKeys(Helper.getData("SurveyRewardMultipleWinner", row, 26));
			objCreateSurveyQuestionsPage.multipleAddRewardsBtn.click();
			
		} else {

			objCreateSurveyQuestionsPage.multiplePeriodicWinnerCountTxtBx.sendKeys((Helper.getData("SurveyRewardMultipleWinner", row, 17)));
			Thread.sleep(2000);

			objCreateSurveyQuestionsPage.multipleTotalParticipantsTxtBx.sendKeys((Helper.getData("SurveyRewardMultipleWinner", row, 19)));
			Thread.sleep(2000);
			objCreateSurveyQuestionsPage.multipleDurationDrpDwn((Helper.getData("SurveyRewardMultipleWinner", row, 20)));
			objCreateSurveyQuestionsPage.multipleNoOfTextBx.sendKeys((Helper.getData("SurveyRewardMultipleWinner", row, 21)));
			Thread.sleep(2000);
			objCreateSurveyQuestionsPage.multipleSelectPeriodDrpDwn((Helper.getData("SurveyRewardMultipleWinner", row, 22)));
			Thread.sleep(2000);
			objCreateSurveyQuestionsPage.multipleStartDate.sendKeys(Helper.getData("SurveyRewardMultipleWinner", row, 24));
			objCreateSurveyQuestionsPage.multiplEendDate.sendKeys(Helper.getData("SurveyRewardMultipleWinner", row, 25));
			objCreateSurveyQuestionsPage.multipleRewardsDeliveryDays.sendKeys(Helper.getData("SurveyRewardMultipleWinner", row, 26));
			objCreateSurveyQuestionsPage.multipleAddRewardsBtn.click();
		}

		
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("scroll(0, 700);");

		String Rewards = (Helper.getData("SurveyRewardMultipleWinner", row, 27));

		if (Rewards.contains("Cash")) {

			// Rewards Cash tab details for Multiple winner
			Helper.takeScreenshot(driver);
			objCreateSurveyQuestionsPage.CashTitleTxtBx.sendKeys(Helper.getData("SurveyRewardMultipleWinner", row, 28));
			objCreateSurveyQuestionsPage.CashAmountDrpDwn(Helper.getData("SurveyRewardMultipleWinner", row, 29));
			objCreateSurveyQuestionsPage.CashRewardAmountTxtBx.sendKeys(Helper.getData("SurveyRewardMultipleWinner", row, 30));
			objCreateSurveyQuestionsPage.CashRewardDescriptionTxtBx.sendKeys(Helper.getData("SurveyRewardMultipleWinner", row, 31));
			objCreateSurveyQuestionsPage.CashRewardAddBtn.click();
			Thread.sleep(5000);
			((JavascriptExecutor) driver).executeScript("scroll(0, 1000);");
			objCreateSurveyQuestionsPage.CashRewardSaveCriteriaBtn.click();
			objCreateSurveyQuestionsPage.RewardSaveAndPublishBtn.click();
			((JavascriptExecutor) driver).executeScript("scroll(0, 800);");
			Thread.sleep(2000);
			objCreateSurveyQuestionsPage.AmountProcessedBtn.click();
			Thread.sleep(2000);
		} else if (Rewards.contains("Points")) {
			objCreateSurveyQuestionsPage.multiplePointsTab.click();
			objCreateSurveyQuestionsPage.multiplePointsTitleTxt.sendKeys(Helper.getData("SurveyRewardMultipleWinner", row, 32));
			objCreateSurveyQuestionsPage.multipleRewardsPointsTxt.sendKeys(Helper.getData("SurveyRewardMultipleWinner", row, 33));
			
			String PointscanredeemChkBtn = Helper.getData("SurveyRewardMultipleWinner", row, 34);
			
			if (PointscanredeemChkBtn.contains("yes"))
			{
				objCreateSurveyQuestionsPage.multiplePointscanredeemChkBtn.click();
			}
			
			objCreateSurveyQuestionsPage.multiplePonitsDescriptionTxt.sendKeys(Helper.getData("SurveyRewardMultipleWinner", row, 35));
			objCreateSurveyQuestionsPage.multiplePointsAddBtn.click();
			Thread.sleep(5000);
			((JavascriptExecutor) driver).executeScript("scroll(0, 1000);");
			objCreateSurveyQuestionsPage.multipleSavecriteria.click();
			objCreateSurveyQuestionsPage.RewardSaveAndPublishBtn.click();
			objCreateSurveyQuestionsPage.AmountProcessedBtn.click();
			

		} else

		{
			objCreateSurveyQuestionsPage.multipleProductsTab.click();
			objCreateSurveyQuestionsPage.multipleProductsTitleTxt.sendKeys(Helper.getData("SurveyRewardMultipleWinner", row, 36));
			objCreateSurveyQuestionsPage.multipleProductNameTxt.sendKeys(Helper.getData("SurveyRewardMultipleWinner", row, 37));
			objCreateSurveyQuestionsPage.multipleProductQuantityTxt.sendKeys(Helper.getData("SurveyRewardMultipleWinner", row, 38));
			objCreateSurveyQuestionsPage.multipleProductValueTxt.sendKeys(Helper.getData("SurveyRewardMultipleWinner", row, 39));
			objCreateSurveyQuestionsPage.multipleDescriptionTxt.sendKeys(Helper.getData("SurveyRewardMultipleWinner", row, 40));
			objCreateSurveyQuestionsPage.SinglePointOnlineAndOffline(Helper.getData("SurveyRewardMultipleWinner", row, 41));

			/*
			 * String OffOnline = (Helper.getData("SurveyRewardMultipleWinner",
			 * row, 41));
			 * 
			 * if (OffOnline.contains("Offline")) {
			 * 
			 * objCreateSurveyQuestionsPage. SingleWinnerofflineCountryDrpDwn(
			 * Helper.getdataSurveyRewardSingleMultiple(i, 33));
			 * objCreateSurveyQuestionsPage.SingleWinnerOfflineamount. sendKeys(
			 * Helper.getdataSurveyRewardSingleMultiple(i, 34));
			 * objCreateSurveyQuestionsPage.SingleProductAddBtn.click();
			 * 
			 * Thread.sleep(5000); ((JavascriptExecutor)
			 * driver).executeScript("scroll(0, 1000);");
			 * objCreateSurveyQuestionsPage.CashRewardSaveCriteriaBtn.click( );
			 * objCreateSurveyQuestionsPage.RewardSaveAndPublishBtn.click(); }
			 * else { objCreateSurveyQuestionsPage.SingleProductAddBtn.click();
			 * Thread.sleep(2000); ((JavascriptExecutor)
			 * driver).executeScript("scroll(0, 1000);");
			 * objCreateSurveyQuestionsPage.CashRewardSaveCriteriaBtn.click( );
			 * objCreateSurveyQuestionsPage.RewardSaveAndPublishBtn.click(); }
			 */

		}
		
		// objCreateSurveyQuestionsPage.AmountProcessedBtn.click();
	}
    public void RewardsPageSaveAndPublish() throws Exception {
		
		objIndexPage.RewardsPageSaveAndPublish.click();
	}
	public void RewardsPageSkipAndPublish() throws Exception {
		
		objIndexPage.RewardsPageSkipAndPublishDrpDwn.click();
		objIndexPage.RewardsPageSkipAndPublishBtn.click();
	}
    public void RewardsBillingProceed() throws Exception {
		
		objIndexPage.RewardsBillingProceedBtn.click();
	}

}
