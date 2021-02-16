package SurveyPage_Tests;

import java.util.ArrayList;
import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;

import BasePackage.BaseTest;
import ExtentReports.ExtentTestManager;
import HomePage_PageObject.HomePage;
import HomePage_PageObject.IndexPages;
import HomePage_PageObject.LoginPage;
import SurveyPage_PageObjects.SurveyQuestionsPage;
import utilityLibrary.Helper;
import SurveyPage_PageObjects.CreateSurveyQuestionsPage;

public class SurveyTestCase extends SurveyMethods {

	//WebDriver driver;
	LoginPage objLoginPage;
	HomePage objHomePage;
	IndexPages objIndexPage;
	SurveyQuestionsPage objCreateSurveyPage;
	CreateSurveyQuestionsPage objCreateSurveyQuestionsPage;
	JavascriptExecutor js;

	// Test Cases

	@Test(description = "SurveyAnonymous-CheckBox-SavePublish ", groups = {"Sanity" })
	 public void TestCase101_SurveyAnonymous_CheckBox_QSavePublish() throws
	 Exception {
	
		ExtentTestManager.getTest().setDescription("SurveyAnonymous-CheckBox-SavePublish");
		 ExtentTestManager.startTest("SurveyAnonymous-CheckBox-SavePublish", "Publishing saved Survey");
	 SurveyTestCase sat1 = new SurveyTestCase();
	
	
	 sat1.Login();
	
	 for (int i = 2; i <= 2;) {
	 sat1.DetailPage(i);
	 //sat1.AnonymousCheck();
	 sat1.DetailPageSaveAndNextBtn();
	 Thread.sleep(2000);
	 sat1.QuestionScrollDown();
	 sat1.CheckBoxQuestion();
	 sat1.QuestionSaveAndPublish();
	 Thread.sleep(2000);
	 break;
	 }
	 
	 sat1.CloseWindow();
	 ExtentTestManager.endTest();
	
	 }
	
	@Test(description = "SurveyAnonymous-CheckBox-QSaveDraft", groups = {"Sanity" })
	 public void TestCase102_SurveyAnonymous_CheckBox_SaveDraft() throws
	 Exception {
	
	 ExtentTestManager.getTest().setDescription("SurveyAnonymous_CheckBox_SaveDraft");
	 ExtentTestManager.startTest("SurveyAnonymous-CheckBox-QSaveDraft", "Saveas a draft Testcase Started");
	 
	 
	
	 SurveyTestCase sat2 = new SurveyTestCase();
	
	 sat2.Login();
	
	 for (int i = 3; i <= 3;) {
	
	 sat2.DetailPage(i);
	 sat2.AnonymousCheck();
	 sat2.DetailPageSaveAndNextBtn();
	 Thread.sleep(2000);
	 sat2.QuestionScrollDown();
	 sat2.CheckBoxQuestion();
	 Thread.sleep(2000);
	
	 sat2.QuestionSaveAndDraft();
	 Thread.sleep(2000);
	 break;
	 }
	 sat2.CloseWindow();
	 ExtentTestManager.endTest();
	
	 }
	
	@Test(description = "SuveryAnonymous-Date-QSaveDraft")
	 public void TestCase103_SuveryAnonymous_Date_QSaveDraft() throws
	 Exception {
	
	ExtentTestManager.getTest().setDescription("TestCase103_SuveryAnonymous_Date_QSaveDraft");
	
	 SurveyTestCase sat3 = new SurveyTestCase();
	
	 sat3.Login();
	
	 for (int i = 4; i <= 4;) {
	 sat3.DetailPage(i);
	 sat3.AnonymousCheck();
	 sat3.DetailPageSaveAndNextBtn();
	 Thread.sleep(3000);
	 sat3.QuestionScrollDown();
	 Thread.sleep(2000);
	 sat3.DateQuestion();
	
	 sat3.QuestionSaveAndDraft();
	 Thread.sleep(2000);
	 break;
	 }
	 sat3.CloseWindow();
	
	 }
	
	@Test(description = " SurveyAnonymous Check box and date - QSavePublish")
	 public void TestCase104_Survey_Anonymous_Checkbox_Date_QSavePublish()
	 throws Exception {
	
	 ExtentTestManager.getTest().setDescription("TestCase04_Survey_Anonymous_Checkbox_Date_QSavePublish");
	
	 SurveyTestCase sat4 = new SurveyTestCase();
	
	 sat4.Login();
	
	 for (int i = 5; i <= 5;) {
	
	 sat4.DetailPage(i);
	 sat4.AnonymousCheck();
	 sat4.DetailPageSaveAndNextBtn();
	 Thread.sleep(2000);
	 sat4.QuestionScrollDown();
	 sat4.DateQuestion();
	 Thread.sleep(2000);
	 sat4.CheckBoxQuestion();
	
	 sat4.QuestionSaveAndPublish();
	 Thread.sleep(2000);
	 break;
	 }
	 sat4.CloseWindow();
	 }
	
	 @Test(description = "Survey Reward Single Winner", groups = { "Sanity" })
	 public void TestCase105_SurveyRewardSingleWinner() throws Exception {
	
	ExtentTestManager.getTest().setDescription("Survey Reward Single winner");
	
	 SurveyTestCase sat5 = new SurveyTestCase();
	
	 sat5.Login();
	
	 for (int i = 6; i <= 6;) {
	 sat5.DetailPage(i);
	 sat5.DetailPageSaveAndNextBtn();
	 sat5.QuestionScrollDown();
	 sat5.CheckBoxQuestion();
	 sat5.QuestionPageSaveAndNextBtn();
	 Thread.sleep(2000);
	 sat5.QuestionLogicPageSaveAndNextBtn();
	 Thread.sleep(2000);
	 sat5.PreviewAndCustomizePageNextBtn();
	 Thread.sleep(2000);
	 sat5.SingleWinnerReward(i);
	 break;
	 }
	 sat5.CloseWindow();
	
	 }
	
	@Test(description = "Survey Reward Multiple Winner ", groups = {"Sanity", "Regression" })
	 public void TestCase106_SurveyRewardMultiWinner() throws Exception {
	
		ExtentTestManager.getTest().setDescription("Multiple winner Reward");
	
	 SurveyTestCase sat6 = new SurveyTestCase();
	
	 sat6.Login();
	
	 for (int i = 2; i <= 2;) {
	 sat6.DetailPageMultipleWinnerReward(i);
	 sat6.DetailPageSaveAndNextBtn();
	
	 // Creating a Questions for Survey
	 sat6.QuestionScrollDown();
	 sat6.CheckBoxQuestion();
	 Thread.sleep(2000);
	 sat6.QuestionPageSaveAndNextBtn();
	
	 Thread.sleep(2000);
	 sat6.QuestionLogicPageSaveAndNextBtn();
	
	 Thread.sleep(2000);
	 sat6.PreviewAndCustomizePageNextBtn();
	 sat6.MultipleWinnerReward(i);
	 break;
	
	 }
	
	 }

	 //@Test(description = "Survey_Anonymous_Dropdown_Singlewinner_Publish")
	 public void TestCase107_Survey_Anonymous_Dropdown_Singlewinner_Publish()
	 throws Exception {
	
//	 ExtentTestManager.getTest().setDescription("Survey_Anonymous_Dropdown_Singlewinner_Publish");
	
	 SurveyTestCase sat7 = new SurveyTestCase();
	
	 sat7.Login();
	
	 for (int i = 7; i <= 7;) {
	 sat7.DetailPage(i);
	 sat7.DetailPageSaveAndNextBtn();
	
	 sat7.QuestionScrollDown();
	 sat7.DropdownQuestion();
	 sat7.QuestionPageSaveAndNextBtn();
	
	 Thread.sleep(2000);
	 sat7.QuestionLogicPageSaveAndNextBtn();
	
	 Thread.sleep(2000);
	 sat7.PreviewAndCustomizePageNextBtn();
	 Thread.sleep(2000);
	
	 sat7.SingleWinnerReward(i);
	 break;
	 }
	
	 sat7.CloseWindow();
	 }

	// @Test(description = "Survey_Anonymous_FileUpload_Singlewinner_Publish")
	 public void TestCase108_Survey_Anonymous_FileUpload_Singlewinner_Publish() throws Exception {
	
//	 ExtentTestManager.getTest().setDescription("Survey_Anonymous_FileUpload_Singlewinner_Publish");
	
	 SurveyTestCase sat8 = new SurveyTestCase();
	
	 sat8.Login();
	
	 for (int i = 8; i <= 8;) {
	 sat8.DetailPage(i);
	 sat8.DetailPageSaveAndNextBtn();
	
	 sat8.QuestionScrollDown();
	 sat8.FileUploadQuestion();
	 sat8.QuestionPageSaveAndNextBtn();
	
	 Thread.sleep(2000);
	 sat8.QuestionLogicPageSaveAndNextBtn();
	
	 Thread.sleep(2000);
	 sat8.PreviewAndCustomizePageNextBtn();
	 Thread.sleep(2000);
	
	 sat8.SingleWinnerReward(i);
	 break;
	 }
	
	 sat8.CloseWindow();
	 }
	
	// @Test(description = "Survey_Anonymous_GroupScaling_Singlewinner_Publish")
	 public void TestCase109_Survey_Anonymous_GroupScaling_Singlewinner_Publish() throws Exception {
	
//	 ExtentTestManager.getTest().setDescription("Survey_Anonymous_GroupScaling_Singlewinner_Publish");
	
	 SurveyTestCase sat9 = new SurveyTestCase();
	
	 sat9.Login();
	
	 for (int i = 9; i <= 9;) {
	 sat9.DetailPage(i);
	 sat9.DetailPageSaveAndNextBtn();
	 sat9.QuestionScrollDown();
	 sat9.GroupScalingQuestion();
	 sat9.QuestionPageSaveAndNextBtn();
	 Thread.sleep(2000);
	 sat9.QuestionLogicPageSaveAndNextBtn();
	 Thread.sleep(2000);
	 sat9.PreviewAndCustomizePageNextBtn();
	 Thread.sleep(2000);
	 sat9.SingleWinnerReward(i);
	 break;
	 }
	 sat9.CloseWindow();
	
	 }
	
//	 @Test(description = "Survey_Anonymous_ImagePoll_Singlewinner_Publish")
	 public void TestCase110_Survey_Anonymous_ImagePoll_Singlewinner_Publish()	 throws Exception {
	
//	 ExtentTestManager.getTest().setDescription("Survey_Anonymous_ImagePoll_Singlewinner_Publish");
	
	 SurveyTestCase sat10 = new SurveyTestCase();
	
	 sat10.Login();
	
	 for (int i = 10; i <= 10;) {
	 sat10.DetailPage(i);
	 sat10.DetailPageSaveAndNextBtn();
	 sat10.QuestionScrollDown();
	 sat10.ImagePollQuestion();
	 sat10.QuestionPageSaveAndNextBtn();
	 Thread.sleep(2000);
	 sat10.QuestionLogicPageSaveAndNextBtn();
	 Thread.sleep(2000);
	 sat10.PreviewAndCustomizePageNextBtn();
	 Thread.sleep(2000);
	 sat10.SingleWinnerReward(i);
	 break;
	 }
	
	 sat10.CloseWindow();
	
	 }
	
//	 @Test(description = "Survey_Anonymous_ImageWithText_Singlewinner_Publish")
	 public void TestCase111_Survey_Anonymous_ImageWithText_Singlewinner_Publish() throws Exception {
	
//	 ExtentTestManager.getTest().setDescription("Survey_Anonymous_ImageWithText_Singlewinner_Publish");
	
	 SurveyTestCase sat10 = new SurveyTestCase();
	
	 sat10.Login();
	
	 for (int i = 11; i <= 11;) {
	 sat10.DetailPage(i);
	 sat10.DetailPageSaveAndNextBtn();
	 sat10.QuestionScrollDown1();
	 Thread.sleep(3000);
	 sat10.ImageWithTextQuestion();
	 Thread.sleep(2000);
	 sat10.QuestionPageSaveAndNextBtn();
	 Thread.sleep(3000);
	 sat10.QuestionLogicPageSaveAndNextBtn();
	 Thread.sleep(3000);
	 sat10.PreviewAndCustomizePageNextBtn();
	 Thread.sleep(2000);
	 sat10.SingleWinnerReward(i);
	 break;
	 }
	
	 sat10.CloseWindow();
	
	 }
	
	// @Test(description = "Survey_Anonymous_MultipleSelectDropdown_Singlewinner_Publish")
	 public void TestCase112_Survey_Anonymous_MultipleSelectDropdown_Singlewinner_Publish()	 throws Exception {
	
	// ExtentTestManager.getTest().setDescription("Survey_Anonymous_MultipleSelectDropdown_Singlewinner_Publish");
	
	 SurveyTestCase sat11 = new SurveyTestCase();
	
	 sat11.Login();
	
	 for (int i = 12; i <= 12;) {
	 sat11.DetailPage(i);
	 sat11.DetailPageSaveAndNextBtn();
	 sat11.QuestionScrollDown();
	 Thread.sleep(3000);
	 sat11.MultipleSelectDropdownQuestion();
	 Thread.sleep(2000);
	 sat11.QuestionPageSaveAndNextBtn();
	 Thread.sleep(2000);
	 sat11.QuestionLogicPageSaveAndNextBtn();
	 Thread.sleep(3000);
	 sat11.PreviewAndCustomizePageNextBtn();
	 Thread.sleep(2000);
	 sat11.SingleWinnerReward(i);
	 break;
	 }
	
	 sat11.CloseWindow();
	
	 }
	
	// @Test(description = "Survey_Anonymous_MultipleTextBoxes_Singlewinner_Publish")
	 public void TestCase113_Survey_Anonymous_MultipleTextBoxes_Singlewinner_Publish() throws Exception {
	
	// ExtentTestManager.getTest().setDescription("Survey_Anonymous_MultipleTextBoxes_Singlewinner_Publish");
	
	 SurveyTestCase sat12 = new SurveyTestCase();
	
	 sat12.Login();
	
	 for (int i = 13; i <= 13;) {
	 sat12.DetailPage(i);
	 sat12.DetailPageSaveAndNextBtn();
	 Thread.sleep(2000);
	 sat12.QuestionScrollDown1();
	 sat12.MultipleTextBoxesQuestion();
	 Thread.sleep(2000);
	 sat12.QuestionPageSaveAndNextBtn();
	 Thread.sleep(2000);
	 sat12.QuestionLogicPageSaveAndNextBtn();
	 Thread.sleep(3000);
	 sat12.PreviewAndCustomizePageNextBtn();
	 Thread.sleep(2000);
	 sat12.SingleWinnerReward(i);
	 break;
	 }
	
	 sat12.CloseWindow();
	
	 }
	
// @Test(description = "Survey_Anonymous_NPSScore_Singlewinner_Publish")
	 public void TestCase114_Survey_Anonymous_NPSScore_Singlewinner_Publish() throws Exception {
	
	// ExtentTestManager.getTest().setDescription("Survey_Anonymous_NPSScore_Singlewinner_Publish");
	
	 SurveyTestCase sat14 = new SurveyTestCase();
	
	 sat14.Login();
	
	 for (int i = 14; i <= 14;) {
	 sat14.DetailPage(i);
	 sat14.DetailPageSaveAndNextBtn();
	 Thread.sleep(2000);
	 sat14.QuestionScrollDown1();
	 sat14.NPSScoreQuestion();
	 Thread.sleep(2000);
	 sat14.QuestionPageSaveAndNextBtn();
	 Thread.sleep(2000);
	 sat14.QuestionLogicPageSaveAndNextBtn();
	 Thread.sleep(3000);
	 sat14.PreviewAndCustomizePageNextBtn();
	 Thread.sleep(2000);
	 sat14.SingleWinnerReward(i);
	 break;
	 }
	
	 sat14.CloseWindow();
	
	 }
	
	 //@Test(description = "Survey_Anonymous_Number_Singlewinner_Publish")
	 public void TestCase115_Survey_Anonymous_Number_Singlewinner_Publish()
	 throws Exception {
	
	 //ExtentTestManager.getTest().setDescription("Survey_Anonymous_Number_Singlewinner_Publish");
	
	 SurveyTestCase sat15 = new SurveyTestCase();
	
	 sat15.Login();
	
	 for (int i = 15; i <= 15;) {
	 sat15.DetailPage(i);
	 sat15.DetailPageSaveAndNextBtn();
	 Thread.sleep(2000);
	 sat15.QuestionScrollDown1();
	 sat15.NumberQuestion();
	 Thread.sleep(2000);
	 sat15.QuestionPageSaveAndNextBtn();
	 Thread.sleep(2000);
	 sat15.QuestionLogicPageSaveAndNextBtn();
	 Thread.sleep(3000);
	 sat15.PreviewAndCustomizePageNextBtn();
	 Thread.sleep(2000);
	 sat15.SingleWinnerReward(i);
	 break;
	 }
	
	 sat15.CloseWindow();
	
	 }
	
	// @Test(description = "Survey_Anonymous_RadioButton_Singlewinner_Publish")
	 public void
	 TestCase116_Survey_Anonymous_RadioButton_Singlewinner_Publish() throws	 Exception {
	
// ExtentTestManager.getTest().setDescription("Survey_Anonymous_RadioButton_Singlewinner_Publish");
	
	 SurveyTestCase sat16 = new SurveyTestCase();
	
	 sat16.Login();
	
	 for (int i = 16; i <= 16;) {
	 sat16.DetailPage(i);
	 sat16.DetailPageSaveAndNextBtn();
	 Thread.sleep(2000);
	 sat16.QuestionScrollDown1();
	 sat16.RadioButtonQuestion();
	 Thread.sleep(2000);
	 sat16.QuestionPageSaveAndNextBtn();
	 Thread.sleep(2000);
	 sat16.QuestionLogicPageSaveAndNextBtn();
	 Thread.sleep(3000);
	 sat16.PreviewAndCustomizePageNextBtn();
	 Thread.sleep(2000);
	 sat16.SingleWinnerReward(i);
	 break;
	 }
	
//	 sat16.CloseWindow();
	
	 }

	// @Test(description = "Survey_Anonymous_ScaleRate_Singlewinner_Publish")
	 public void TestCase117_Survey_Anonymous_ScaleRate_Singlewinner_Publish()
	 throws Exception {
	
	// ExtentTestManager.getTest().setDescription("Survey_Anonymous_ScaleRate_Singlewinner_Publish");
	
	 SurveyTestCase sat17 = new SurveyTestCase();
	
	 sat17.Login();
	
	 for (int i = 17; i <= 17;) {
	 sat17.DetailPage(i);
	 sat17.DetailPageSaveAndNextBtn();
	 Thread.sleep(2000);
	 sat17.QuestionScrollDown1();
	 sat17.ScaleRateQuestion();
	 Thread.sleep(2000);
	 sat17.QuestionPageSaveAndNextBtn();
	 Thread.sleep(2000);
	 sat17.QuestionLogicPageSaveAndNextBtn();
	 Thread.sleep(3000);
	 sat17.PreviewAndCustomizePageNextBtn();
	 Thread.sleep(2000);
	 sat17.SingleWinnerReward(i);
	 break;
	 }
	
	 sat17.CloseWindow();
	
	 }

	// @Test(description = "Survey_Anonymous_SingleLineText_Singlewinner_Publish")
	 public void TestCase118_Survey_Anonymous_SingleLineText_Singlewinner_Publish() throws Exception {
	
	 //ExtentTestManager.getTest().setDescription("Survey_Anonymous_SingleLineText_Singlewinner_Publish");
	
	 SurveyTestCase sat18 = new SurveyTestCase();
	
	 sat18.Login();
	
	 for (int i = 18; i <= 18;) {
	 sat18.DetailPage(i);
	 sat18.DetailPageSaveAndNextBtn();
	 Thread.sleep(2000);
	 sat18.QuestionScrollDown1();
	 sat18.SingleLineText();
	 Thread.sleep(2000);
	 sat18.QuestionPageSaveAndNextBtn();
	 Thread.sleep(2000);
	 sat18.QuestionLogicPageSaveAndNextBtn();
	 Thread.sleep(3000);
	 sat18.PreviewAndCustomizePageNextBtn();
	 Thread.sleep(2000);
	 sat18.SingleWinnerReward(i);
	 break;
	 }
	
	 sat18.CloseWindow();
	
	 }

	 //@Test(description = "Survey_Anonymous_TextArea_Singlewinner_Publish")
	 public void TestCase119_Survey_Anonymous_TextArea_Singlewinner_Publish() throws Exception {
	
	// ExtentTestManager.getTest().setDescription("Survey_Anonymous_TextArea_Singlewinner_Publish");
	
	 SurveyTestCase sat19 = new SurveyTestCase();
	
	 sat19.Login();
	
	 for (int i = 19; i <= 19;) {
	 sat19.DetailPage(i);
	 sat19.DetailPageSaveAndNextBtn();
	 Thread.sleep(2000);
	 sat19.QuestionScrollDown1();
	 sat19.TextAreaQuestion();
	 Thread.sleep(2000);
	 sat19.QuestionPageSaveAndNextBtn();
	 Thread.sleep(2000);
	 sat19.QuestionLogicPageSaveAndNextBtn();
	 Thread.sleep(3000);
	 sat19.PreviewAndCustomizePageNextBtn();
	 Thread.sleep(2000);
	 sat19.SingleWinnerReward(i);
	 break;
	 }
	
	 sat19.CloseWindow();
	
	 }

	 //@Test(description = "Survey_Anonymous_YesOrNo_Singlewinner_Publish")
	 public void TestCase120_Survey_Anonymous_YesOrNo_Singlewinner_Publish() throws Exception {
	
	 //ExtentTestManager.getTest().setDescription("Survey_Anonymous_YesOrNo_Singlewinner_Publish");
	
	 SurveyTestCase sat20 = new SurveyTestCase();
	
	 sat20.Login();
	
	 for (int i = 20; i <= 20;) {
	 sat20.DetailPage(i);
	 sat20.DetailPageSaveAndNextBtn();
	 Thread.sleep(2000);
	 sat20.QuestionScrollDown1();
	 Thread.sleep(2000);
	 sat20.YesOrNoQuestion();
	 Thread.sleep(2000);
	 sat20.QuestionPageSaveAndNextBtn();
	 Thread.sleep(2000);
	 sat20.QuestionLogicPageSaveAndNextBtn();
	 Thread.sleep(3000);
	 sat20.PreviewAndCustomizePageNextBtn();
	 Thread.sleep(2000);
	 sat20.SingleWinnerReward(i);
	 break;
	 }
	
	 sat20.CloseWindow();
	
	 }

	//@Test(description = "Survey_Anonymous_DropdownWithWiseWeightages_Singlewinner_Publish")
	public void TestCase121_Survey_Anonymous_DropdownWithWiseWeightages_Singlewinner_Publish() throws Exception {

		// ExtentTestManager.getTest().setDescription("Survey_Anonymous_DropdownWithWiseWeightages_Singlewinner_Publish");

		SurveyTestCase sat21 = new SurveyTestCase();

		sat21.Login();

		for (int i = 21; i <= 21;) {
			sat21.DetailPage(i);

			sat21.DetailPageSaveAndNextBtn();
			sat21.QuestionScrollDown();
			sat21.DropdownQuestionWithWiseWeightages();
			sat21.QuestionPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat21.QuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat21.PreviewAndCustomizePageNextBtn();
			Thread.sleep(2000);
			sat21.SingleWinnerReward(i);
			break;
		}

		 sat21.CloseWindow();
	}

//	@Test(description = "Survey_Anonymous_RadioButtonWithWiseWeightages_Singlewinner_Publish")
	public void TestCase122_Survey_Anonymous_RadioButtonWithWiseWeightages_Singlewinner_Publish() throws Exception {

		//ExtentTestManager.getTest().setDescription("Survey_Anonymous_RadioButtonWithWiseWeightages_Singlewinner_Publish");

		SurveyTestCase sat22 = new SurveyTestCase();

		sat22.Login();

		for (int i = 22; i <= 22;) {
			sat22.DetailPage(i);
			sat22.DetailPageSaveAndNextBtn();
			sat22.QuestionScrollDown1();
			sat22.RadioButtonQuestionWithWiseWeightages();
			sat22.QuestionPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat22.QuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat22.PreviewAndCustomizePageNextBtn();
			Thread.sleep(2000);
			sat22.SingleWinnerReward(i);
			break;
		}

		 sat22.CloseWindow();
	}

	//@Test(description = "Survey_Anonymous_ScaleRateWithWiseWeightages_Singlewinner_Publish")
	public void TestCase123_Survey_Anonymous_ScaleRateWithWiseWeightages_Singlewinner_Publish() throws Exception {

	// ExtentTestManager.getTest().setDescription("Survey_Anonymous_ScaleRateWithWiseWeightages_Singlewinner_Publish");

		SurveyTestCase sat23 = new SurveyTestCase();

		sat23.Login();

		for (int i = 23; i <= 23;) {
			sat23.DetailPage(i);
			sat23.DetailPageSaveAndNextBtn();
			sat23.QuestionScrollDown1();
			sat23.ScaleRateQuestionWithWiseWeightages();
			sat23.QuestionPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat23.QuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat23.PreviewAndCustomizePageNextBtn();
			Thread.sleep(2000);
			sat23.SingleWinnerReward(i);
			break;
		}

		// sat23.CloseWindow();
	}
	
	//@Test(description = "Survey_Anonymous_YesOrNoWithWiseWeightages_Singlewinner_Publish")
	public void TestCase124_Survey_Anonymous_YesOrNoWithWiseWeightages_Singlewinner_Publish() throws Exception {

	// ExtentTestManager.getTest().setDescription("Survey_Anonymous_YesOrNoWithWiseWeightages_Singlewinner_Publish");

		SurveyTestCase sat24 = new SurveyTestCase();

		sat24.Login();

		for (int i = 24; i <= 24;) {
			sat24.DetailPage(i);
			sat24.DetailPageSaveAndNextBtn();
			sat24.QuestionScrollDown1();
			sat24.YesOrNoQuestionWithWiseWeightages();
			sat24.QuestionPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat24.QuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat24.PreviewAndCustomizePageNextBtn();
			Thread.sleep(2000);
			sat24.SingleWinnerReward(i);
			break;
		}

		 sat24.CloseWindow();
	}
	
	//@Test(description = "SavedQuestion_Default_Singlewinner_Publish")
	public void TestCase125_SavedQuestion_Default_Singlewinner_Publish() throws Exception {

		// ExtentTestManager.getTest().setDescription("SavedQuestion_Default_Singlewinner_Publish");

		SurveyTestCase sat25 = new SurveyTestCase();

		sat25.Login();

		for (int i = 25; i <= 25;) {
			sat25.DetailPage(i);
			sat25.DetailPageSaveAndNextBtn();
		    sat25.FourQuestoinsDefault();
			sat25.QuestionPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat25.QuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat25.PreviewAndCustomizePageNextBtn();
			Thread.sleep(2000);
			sat25.SingleWinnerReward(i);
			break;
		}

//		sat25.CloseWindow();
	}
	
	//@Test(description = "AllowAnonymous_QuestionPage_SaveAndPublish")
	public void TestCase126_AllowAnonymous_QuestionPage_SaveAndPublish() throws Exception {

	//	 ExtentTestManager.getTest().setDescription("AllowAnonymous_QuestionPage_SaveAndPublish");

		SurveyTestCase sat26 = new SurveyTestCase();

		sat26.Login();

		for (int i = 26; i <= 26;) {
			sat26.DetailPage(i);
			sat26.AnonymousCheck();
			sat26.DetailPageSaveAndNextBtn();
			sat26.FourQuestoinsDefault();
			sat26.QuestionSaveAndPublish();
			break;
		}

//		sat26.CloseWindow();
	}
	
	//@Test(description = "LandingPage_QuestionPage_SaveAndPublish")
	public void TestCase127_LandingPage_QuestionPage_SaveAndPublish() throws Exception {

	// ExtentTestManager.getTest().setDescription("LandingPage_QuestionPage_SaveAndPublish");

		SurveyTestCase sat27 = new SurveyTestCase();

		sat27.Login();

		for (int i = 27; i <= 27;) {
			sat27.DetailPage(i);
			sat27.SetYourOwnLandPageUrl(i);
			sat27.DetailPageSaveAndNextBtn();
			sat27.FourQuestoinsDefault();
			sat27.QuestionSaveAndPublish();
			Thread.sleep(2000);
			sat27.QuestionBillingProceed();
			break;
		}

//		sat27.CloseWindow();
	}
	
//	@Test(description = "Languages_QuestionPage_SaveAndPublish")
	public void TestCase128_Languages_QuestionPage_SaveAndPublish() throws Exception {

//		 ExtentTestManager.getTest().setDescription("Languages_QuestionPage_SaveAndPublish");

		SurveyTestCase sat28 = new SurveyTestCase();

		sat28.Login();

		for (int i = 28; i <= 28;) {
			sat28.DetailPage(i);
			sat28.selectLanguage();
			sat28.DetailPageSaveAndNextBtn();
			sat28.FourQuestoinsDefault();
			sat28.QuestionSaveAndPublish();
			break;
		}

//		sat28.CloseWindow();
	}
	
//	@Test(description = "AllowAnonymous_LogicPage_SaveAndPublish")
	public void TestCase129_AllowAnonymous_LogicPage_SaveAndPublish() throws Exception {

	//	 ExtentTestManager.getTest().setDescription("AllowAnonymous_LogicPage_SaveAndPublish");

		SurveyTestCase sat29 = new SurveyTestCase();

		sat29.Login();

		for (int i = 29; i <= 29;) {
			sat29.DetailPage(i);
			sat29.AnonymousCheck();
			sat29.DetailPageSaveAndNextBtn();
			sat29.FourQuestoinsDefault();
			sat29.QuestionPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat29.QuestionLogicPageSaveAndPublish();
			break;
		}

//		sat29.CloseWindow();
	}
	
	//@Test(description = "LandingPage_LogicPage_SaveAndPublish")
	public void TestCase130_LandingPage_LogicPage_SaveAndPublish() throws Exception {

	// ExtentTestManager.getTest().setDescription("LandingPage_LogicPage_SaveAndPublish");

		SurveyTestCase sat30 = new SurveyTestCase();

		sat30.Login();

		for (int i = 30; i <= 30;) {
			sat30.DetailPage(i);
			sat30.SetYourOwnLandPageUrl(i);
			sat30.DetailPageSaveAndNextBtn();
			sat30.FourQuestoinsDefault();
			sat30.QuestionPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat30.QuestionLogicPageSaveAndPublish();
			Thread.sleep(2000);
			sat30.QuestionLogicBillingProceed();
			break;

		}

//		sat30.CloseWindow();
	}
	
	//@Test(description = "Languages_LogicPage_SaveAndPublish")
	public void TestCase131_Languages_LogicPage_SaveAndPublish() throws Exception {

//		 ExtentTestManager.getTest().setDescription("Languages_LogicPage_SaveAndPublish");

		SurveyTestCase sat31 = new SurveyTestCase();

		sat31.Login();

		for (int i = 31; i <= 31;) {
			sat31.DetailPage(i);
			sat31.selectLanguage();
			sat31.DetailPageSaveAndNextBtn();
			sat31.FourQuestoinsDefault();
			sat31.QuestionPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat31.QuestionLogicPageSaveAndPublish();
			Thread.sleep(2000);
			sat31.QuestionLogicBillingProceed();
			break;

		}

//		sat31.CloseWindow();
	}
	
	//@Test(description = "AllowAnonymous_PreviewAndCust_SkipAndPublish")
	public void TestCase132_AllowAnonymous_PreviewAndCust_SkipAndPublish() throws Exception {

	//	 ExtentTestManager.getTest().setDescription("AllowAnonymous_PreviewAndCust_SkipAndPublish");

		SurveyTestCase sat32 = new SurveyTestCase();

		sat32.Login();

		for (int i = 32; i <= 32;) {
			sat32.DetailPage(i);
			sat32.AnonymousCheck();
			sat32.DetailPageSaveAndNextBtn();
			sat32.FourQuestoinsDefault();
			sat32.QuestionPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat32.QuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat32.QuestionPreviewAndCustomizePageSkipAndPublish();
			break;

		}

//		sat32.CloseWindow();
	}
	
	//@Test(description = "LandingPage_PreviewAndCust_SkipAndPublish")
	public void TestCase133_LandingPage_PreviewAndCust_SkipAndPublish() throws Exception {

	// ExtentTestManager.getTest().setDescription("LandingPage_PreviewAndCust_SkipAndPublish");

		SurveyTestCase sat33 = new SurveyTestCase();

		sat33.Login();

		for (int i = 33; i <= 33;) {
			sat33.DetailPage(i);
			sat33.SetYourOwnLandPageUrl(i);
			sat33.DetailPageSaveAndNextBtn();
			sat33.FourQuestoinsDefault();
			sat33.QuestionPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat33.QuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat33.QuestionPreviewAndCustomizePageSkipAndPublish();
			Thread.sleep(2000);
			sat33.QuestionPreviewAndCustomizeBillingProceed();
			break;

		}

//		sat33.CloseWindow();
	}
	
//	@Test(description = "Languages_PreviewAndCust_SkipAndPublish")
	public void TestCase134_Languages_PreviewAndCust_SkipAndPublish() throws Exception {

//		 ExtentTestManager.getTest().setDescription("Languages_PreviewAndCust_SkipAndPublish");

		SurveyTestCase sat34 = new SurveyTestCase();

		sat34.Login();

		for (int i = 34; i <= 34;) {
			sat34.DetailPage(i);
			sat34.selectLanguage();
			sat34.DetailPageSaveAndNextBtn();
			sat34.FourQuestoinsDefault();
			sat34.QuestionPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat34.QuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat34.QuestionPreviewAndCustomizePageSkipAndPublish();
			Thread.sleep(2000);
			sat34.QuestionPreviewAndCustomizeBillingProceed();
			break;

		}

//		sat34.CloseWindow();
	}
	
//	@Test(description = "AllowAnonymous_PreviewAndCust_SaveAndPublish")
	public void TestCase135_AllowAnonymous_PreviewAndCust_SaveAndPublish() throws Exception {

	//	 ExtentTestManager.getTest().setDescription("AllowAnonymous_PreviewAndCust_SaveAndPublish");

		SurveyTestCase sat35 = new SurveyTestCase();

		sat35.Login();

		for (int i = 35; i <= 35;) {
			sat35.DetailPage(i);
			sat35.AnonymousCheck();
			sat35.DetailPageSaveAndNextBtn();
			sat35.FourQuestoinsDefault();
			sat35.QuestionPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat35.QuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat35.PreviewAndCustomizePageSaveAndPublish();
			break;

		}

//		sat35.CloseWindow();
	}
	
	//@Test(description = "LandingPage_PreviewAndCust_SaveAndPublish")
	public void TestCase136_LandingPage_PreviewAndCust_SaveAndPublish() throws Exception {

	// ExtentTestManager.getTest().setDescription("LandingPage_PreviewAndCust_SaveAndPublish");

		SurveyTestCase sat36 = new SurveyTestCase();

		sat36.Login();

		for (int i = 36; i <= 36;) {
			sat36.DetailPage(i);
			sat36.SetYourOwnLandPageUrl(i);
			sat36.DetailPageSaveAndNextBtn();
			sat36.FourQuestoinsDefault();
			sat36.QuestionPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat36.QuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat36.PreviewAndCustomizePageSaveAndPublish();
			Thread.sleep(2000);
			sat36.QuestionPreviewAndCustomizeBillingProceed();
			break;

		}

//		sat36.CloseWindow();
	}
	
//	@Test(description = "Languages_PreviewAndCust_SaveAndPublish")
	public void TestCase137_Languages_PreviewAndCust_SaveAndPublish() throws Exception {

//		 ExtentTestManager.getTest().setDescription("Languages_PreviewAndCust_SaveAndPublish");

		SurveyTestCase sat37 = new SurveyTestCase();

		sat37.Login();

		for (int i = 37; i <= 37;) {
			sat37.DetailPage(i);
			sat37.selectLanguage();
			sat37.DetailPageSaveAndNextBtn();
			sat37.FourQuestoinsDefault();
			sat37.QuestionPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat37.QuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat37.PreviewAndCustomizePageSaveAndPublish();
			Thread.sleep(2000);
			sat37.QuestionPreviewAndCustomizeBillingProceed();
			break;

		}

//		sat37.CloseWindow();
	}
	
//	@Test(description = "AllowAnonymous_Rewards_SaveAndPublish")
	public void TestCase138_AllowAnonymous_Rewards_SaveAndPublish() throws Exception {

//		 ExtentTestManager.getTest().setDescription("AllowAnonymous_Rewards_SaveAndPublish");

		SurveyTestCase sat38 = new SurveyTestCase();

		sat38.Login();

		for (int i = 38; i <= 38;) {
			sat38.DetailPage(i);
			sat38.AnonymousCheck();
			sat38.DetailPageSaveAndNextBtn();
			sat38.FourQuestoinsDefault();
			sat38.QuestionPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat38.QuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat38.PreviewAndCustomizePageNextBtn();
			Thread.sleep(2000);
			sat38.RewardsPageSaveAndPublish();
			break;

		}

//		sat38.CloseWindow();
	}
	
//	@Test(description = "LandingPage_Rewards_SaveAndPublish")
	public void TestCase139_LandingPage_Rewards_SaveAndPublish() throws Exception {

//		 ExtentTestManager.getTest().setDescription("LandingPage_Rewards_SaveAndPublish");

		SurveyTestCase sat39 = new SurveyTestCase();

		sat39.Login();

		for (int i = 39; i <= 39;) {
			sat39.DetailPage(i);
			sat39.SetYourOwnLandPageUrl(i);
			sat39.DetailPageSaveAndNextBtn();
			sat39.FourQuestoinsDefault();
			sat39.QuestionPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat39.QuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat39.PreviewAndCustomizePageNextBtn();
			Thread.sleep(2000);
			sat39.RewardsPageSaveAndPublish();
			break;

		}

//		sat39.CloseWindow();
	}
	
//	@Test(description = "Languages_Rewards_SaveAndPublish")
	public void TestCase140_Languages_Rewards_SaveAndPublish() throws Exception {

//		 ExtentTestManager.getTest().setDescription("Languages_Rewards_SaveAndPublish");

		SurveyTestCase sat40 = new SurveyTestCase();

		sat40.Login();

		for (int i = 40; i <= 40;) {
			sat40.DetailPage(i);
			sat40.selectLanguage();
			sat40.DetailPageSaveAndNextBtn();
			sat40.FourQuestoinsDefault();
			sat40.QuestionPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat40.QuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat40.PreviewAndCustomizePageNextBtn();
			Thread.sleep(2000);
			sat40.RewardsPageSaveAndPublish();
			break;

		}

//		sat40.CloseWindow();
	}
	
	//@Test(description = "AllowAnonymous_Rewards_SkipAndPublish")
	public void TestCase141_AllowAnonymous_Rewards_SkipAndPublish() throws Exception {

	// ExtentTestManager.getTest().setDescription("AllowAnonymous_Rewards_SkipAndPublish");

		SurveyTestCase sat41 = new SurveyTestCase();

		sat41.Login();

		for (int i = 41; i <= 41;) {
			sat41.DetailPage(i);
			sat41.AnonymousCheck();
			sat41.DetailPageSaveAndNextBtn();
			sat41.FourQuestoinsDefault();
			sat41.QuestionPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat41.QuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat41.PreviewAndCustomizePageNextBtn();
			Thread.sleep(2000);
			sat41.RewardsPageSkipAndPublish();
			break;

		}

//		sat41.CloseWindow();
	}
	
	//@Test(description = "LandingPage_Rewards_SkipAndPublish")
	public void TestCase142_LandingPage_Rewards_SkipAndPublish() throws Exception {

	 //ExtentTestManager.getTest().setDescription("LandingPage_Rewards_SkipAndPublish");

		SurveyTestCase sat42 = new SurveyTestCase();

		sat42.Login();

		for (int i = 42; i <= 42;) {
			sat42.DetailPage(i);
			sat42.SetYourOwnLandPageUrl(i);
			sat42.DetailPageSaveAndNextBtn();
			sat42.FourQuestoinsDefault();
			sat42.QuestionPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat42.QuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat42.PreviewAndCustomizePageNextBtn();
			Thread.sleep(2000);
			sat42.RewardsPageSkipAndPublish();
			Thread.sleep(2000);
			sat42.RewardsBillingProceed();
			break;

		}

//		sat42.CloseWindow();
	}
	
//	@Test(description = "Languages_Rewards_SkipAndPublish")
	public void TestCase143_Languages_Rewards_SkipAndPublish() throws Exception {

//		 ExtentTestManager.getTest().setDescription("Languages_Rewards_SkipAndPublish");

		SurveyTestCase sat43 = new SurveyTestCase();

		sat43.Login();

		for (int i = 43; i <= 43;) {
			sat43.DetailPage(i);
			sat43.selectLanguage();
			sat43.DetailPageSaveAndNextBtn();
			sat43.FourQuestoinsDefault();
			sat43.QuestionPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat43.QuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat43.PreviewAndCustomizePageNextBtn();
			Thread.sleep(2000);
			sat43.RewardsPageSkipAndPublish();
			Thread.sleep(2000);
			sat43.RewardsBillingProceed();
			break;

		}

//		sat43.CloseWindow();
	}
	
	//@Test(description = "MultipleWinner_EveryDays_Cash")
	public void TestCase144_MultipleWinner_EveryDays_Cash() throws Exception {

//		 ExtentTestManager.getTest().setDescription("MultipleWinner_EveryDays_Cash");

		SurveyTestCase sat44 = new SurveyTestCase();

		sat44.Login();

		for (int i = 3; i <= 3;) {
			sat44.DetailPageMultipleWinnerReward(i);
			sat44.DetailPageSaveAndNextBtn();
			sat44.FourQuestoinsDefault();
			sat44.QuestionPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat44.QuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat44.PreviewAndCustomizePageNextBtn();
			Thread.sleep(2000);
			sat44.MultipleWinnerReward(i);
			break;

		}

//		sat44.CloseWindow();
	}
	
	//@Test(description = "MultipleWinner_EveryDays_Unlimited_Cash")
	public void TestCase145_MultipleWinner_EveryDays_Unlimited_Cash() throws Exception {

//		 ExtentTestManager.getTest().setDescription("MultipleWinner_EveryDays_Unlimited_Cash");

		SurveyTestCase sat45 = new SurveyTestCase();

		sat45.Login();

		for (int i = 4; i <= 4;) {
			sat45.DetailPageMultipleWinnerReward(i);
			sat45.DetailPageSaveAndNextBtn();
			sat45.FourQuestoinsDefault();
			sat45.QuestionPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat45.QuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat45.PreviewAndCustomizePageNextBtn();
			Thread.sleep(2000);
			sat45.MultipleWinnerReward(i);
			break;

		}

//		sat45.CloseWindow();
	}
	
	//@Test(description = "MultipleWinner_EveryDays_Auto_Cash")
	public void TestCase146_MultipleWinner_EveryDays_Auto_Cash() throws Exception {

//		 ExtentTestManager.getTest().setDescription("MultipleWinner_EveryDays_Auto_Cash");

		SurveyTestCase sat46 = new SurveyTestCase();

		sat46.Login();

		for (int i = 5; i <= 5;) {
			sat46.DetailPageMultipleWinnerReward(i);
			sat46.DetailPageSaveAndNextBtn();
			sat46.FourQuestoinsDefault();
			sat46.QuestionPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat46.QuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat46.PreviewAndCustomizePageNextBtn();
			Thread.sleep(2000);
			sat46.MultipleWinnerReward(i);
			break;

		}

//		sat46.CloseWindow();
	}
	
	//@Test(description = "MultipleWinner_EveryDays_UnlimitedAndAuto_Cash")
	public void TestCase147_MultipleWinner_EveryDays_UnlimitedAndAuto_Cash() throws Exception {

//		 ExtentTestManager.getTest().setDescription("MultipleWinner_EveryDays_UnlimitedAndAuto_Cash");

		SurveyTestCase sat47 = new SurveyTestCase();

		sat47.Login();

		for (int i = 6; i <= 6;) {
			sat47.DetailPageMultipleWinnerReward(i);
			sat47.DetailPageSaveAndNextBtn();
			sat47.FourQuestoinsDefault();
			sat47.QuestionPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat47.QuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat47.PreviewAndCustomizePageNextBtn();
			Thread.sleep(2000);
			sat47.MultipleWinnerReward(i);
			break;

		}

//		sat47.CloseWindow();
	}
	
	//@Test(description = "MultipleWinner_EveryDays_Exclude_Cash")
	public void TestCase148_MultipleWinner_EveryDays_Exclude_Cash() throws Exception {

//		 ExtentTestManager.getTest().setDescription("MultipleWinner_EveryDays_Exclude_Cash");

		SurveyTestCase sat48 = new SurveyTestCase();

		sat48.Login();

		for (int i = 7; i <= 7;) {
			sat48.DetailPageMultipleWinnerReward(i);
			sat48.DetailPageSaveAndNextBtn();
			sat48.FourQuestoinsDefault();
			sat48.QuestionPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat48.QuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat48.PreviewAndCustomizePageNextBtn();
			Thread.sleep(2000);
			sat48.MultipleWinnerReward(i);
			break;

		}

//		sat48.CloseWindow();
	}
	
	//@Test(description = "MultipleWinner_EveryDays_UnlimitedAndAutoAndExclude_Cash")
	public void TestCase149_MultipleWinner_EveryDays_UnlimitedAndAutoAndExclude_Cash() throws Exception {

//		 ExtentTestManager.getTest().setDescription("MultipleWinner_EveryDays_UnlimitedAndAutoAndExclude_Cash");

		SurveyTestCase sat49 = new SurveyTestCase();

		sat49.Login();

		for (int i = 8; i <= 8;) {
			sat49.DetailPageMultipleWinnerReward(i);
			sat49.DetailPageSaveAndNextBtn();
			sat49.FourQuestoinsDefault();
			sat49.QuestionPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat49.QuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat49.PreviewAndCustomizePageNextBtn();
			Thread.sleep(2000);
			sat49.MultipleWinnerReward(i);
			break;

		}

//		sat49.CloseWindow();
	}
	
	//@Test(description = "MultipleWinner_AllEvent_Cash")
	public void TestCase150_MultipleWinner_AllEvent_Cash() throws Exception {

//		 ExtentTestManager.getTest().setDescription("MultipleWinner_AllEvent_Cash");

		SurveyTestCase sat50 = new SurveyTestCase();

		sat50.Login();

		for (int i = 9; i <= 9;) {
			sat50.DetailPageMultipleWinnerReward(i);
			sat50.DetailPageSaveAndNextBtn();
			sat50.FourQuestoinsDefault();
			sat50.QuestionPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat50.QuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat50.PreviewAndCustomizePageNextBtn();
			Thread.sleep(2000);
			sat50.MultipleWinnerReward(i);
			break;

		}

//		sat50.CloseWindow();
	}
	
	//@Test(description = "MultipleWinner_AllEvent_Unlimited_Cash")
	public void TestCase151_MultipleWinner_AllEvent_Unlimited_Cash() throws Exception {

//		 ExtentTestManager.getTest().setDescription("MultipleWinner_AllEvent_Unlimited_Cash");

		SurveyTestCase sat51 = new SurveyTestCase();

		sat51.Login();

		for (int i = 10; i <= 10;) {
			sat51.DetailPageMultipleWinnerReward(i);
			sat51.DetailPageSaveAndNextBtn();
			sat51.FourQuestoinsDefault();
			sat51.QuestionPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat51.QuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat51.PreviewAndCustomizePageNextBtn();
			Thread.sleep(2000);
			sat51.MultipleWinnerReward(i);
			break;

		}

//		sat51.CloseWindow();
	}
	
	//@Test(description = "MultipleWinner_AllEvent_Unlimited_Cash")
	public void TestCase152_MultipleWinner_AllEvent_Unlimited_Cash() throws Exception {

//		 ExtentTestManager.getTest().setDescription("MultipleWinner_AllEvent_Unlimited_Cash");

		SurveyTestCase sat52 = new SurveyTestCase();

		sat52.Login();

		for (int i = 11; i <= 11;) {
			sat52.DetailPageMultipleWinnerReward(i);
			sat52.DetailPageSaveAndNextBtn();
			sat52.FourQuestoinsDefault();
			sat52.QuestionPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat52.QuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat52.PreviewAndCustomizePageNextBtn();
			Thread.sleep(2000);
			sat52.MultipleWinnerReward(i);
			break;

		}

//		sat52.CloseWindow();
	}
	
//	@Test(description = "MultipleWinner_AllEvent_UnlimitedAndAuto_Cash")
	public void TestCase153_MultipleWinner_AllEvent_UnlimitedAndAuto_Cash() throws Exception {

//		 ExtentTestManager.getTest().setDescription("MultipleWinner_AllEvent_UnlimitedAndAuto_Cash");

		SurveyTestCase sat53 = new SurveyTestCase();

		sat53.Login();

		for (int i = 12; i <= 12;) {
			sat53.DetailPageMultipleWinnerReward(i);
			sat53.DetailPageSaveAndNextBtn();
			sat53.FourQuestoinsDefault();
			sat53.QuestionPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat53.QuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat53.PreviewAndCustomizePageNextBtn();
			Thread.sleep(2000);
			sat53.MultipleWinnerReward(i);
			break;

		}

//		sat53.CloseWindow();
	}
	
//@Test(description = "MultipleWinner_First_Cash")
	public void TestCase154_MultipleWinner_First_Cash() throws Exception {

//		 ExtentTestManager.getTest().setDescription("MultipleWinner_First_Cash");

		SurveyTestCase sat54 = new SurveyTestCase();

		sat54.Login();

		for (int i = 13; i <= 13;) {
			sat54.DetailPageMultipleWinnerReward(i);
			sat54.DetailPageSaveAndNextBtn();
			sat54.FourQuestoinsDefault();
			sat54.QuestionPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat54.QuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat54.PreviewAndCustomizePageNextBtn();
			Thread.sleep(2000);
			sat54.MultipleWinnerReward(i);
			break;

		}

//		sat54.CloseWindow();
	}
	
	//@Test(description = "MultipleWinner_First_Unlimited_Cash")
	public void TestCase155_MultipleWinner_First_Unlimited_Cash() throws Exception {

//		 ExtentTestManager.getTest().setDescription("MultipleWinner_First_Unlimited_Cash");

		SurveyTestCase sat55 = new SurveyTestCase();

		sat55.Login();

		for (int i = 14; i <= 14;) {
			sat55.DetailPageMultipleWinnerReward(i);
			sat55.DetailPageSaveAndNextBtn();
			sat55.FourQuestoinsDefault();
			sat55.QuestionPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat55.QuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat55.PreviewAndCustomizePageNextBtn();
			Thread.sleep(2000);
			sat55.MultipleWinnerReward(i);
			break;

		}

//		sat55.CloseWindow();
	}
	
	//@Test(description = "MultipleWinner_First_Auto_Cash")
	public void TestCase156_MultipleWinner_First_Auto_Cash() throws Exception {

//		 ExtentTestManager.getTest().setDescription("MultipleWinner_First_Auto_Cash");

		SurveyTestCase sat56 = new SurveyTestCase();

		sat56.Login();

		for (int i = 15; i <= 15;) {
			sat56.DetailPageMultipleWinnerReward(i);
			sat56.DetailPageSaveAndNextBtn();
			sat56.FourQuestoinsDefault();
			sat56.QuestionPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat56.QuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat56.PreviewAndCustomizePageNextBtn();
			Thread.sleep(2000);
			sat56.MultipleWinnerReward(i);
			break;

		}

//		sat56.CloseWindow();
	}
	
	//@Test(description = "MultipleWinner_First_UnlimitedAndAuto_Cash")
	public void TestCase157_MultipleWinner_First_UnlimitedAndAuto_Cash() throws Exception {

//		 ExtentTestManager.getTest().setDescription("MultipleWinner_First_UnlimitedAndAuto_Cash");

		SurveyTestCase sat57 = new SurveyTestCase();

		sat57.Login();

		for (int i = 16; i <= 16;) {
			sat57.DetailPageMultipleWinnerReward(i);
			sat57.DetailPageSaveAndNextBtn();
			sat57.FourQuestoinsDefault();
			sat57.QuestionPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat57.QuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat57.PreviewAndCustomizePageNextBtn();
			Thread.sleep(2000);
			sat57.MultipleWinnerReward(i);
			break;

		}

//		sat57.CloseWindow();
	}
	
	//@Test(description = "MultipleWinner_EveryDays_Points")
	public void TestCase158_MultipleWinner_EveryDays_Points() throws Exception {

//		 ExtentTestManager.getTest().setDescription("MultipleWinner_EveryDays_Points");

		SurveyTestCase sat58 = new SurveyTestCase();

		sat58.Login();

		for (int i = 17; i <= 17;) {
			sat58.DetailPageMultipleWinnerReward(i);
			sat58.DetailPageSaveAndNextBtn();
			sat58.FourQuestoinsDefault();
			sat58.QuestionPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat58.QuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat58.PreviewAndCustomizePageNextBtn();
			Thread.sleep(2000);
			sat58.MultipleWinnerReward(i);
			break;

		}

//		sat58.CloseWindow();
	}
	
}
