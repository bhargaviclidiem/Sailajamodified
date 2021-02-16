package EvaluatorPage_Tests;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ExtentReports.ExtentTestManager;
import HomePage_PageObject.HomePage;
import HomePage_PageObject.IndexPages;
import HomePage_PageObject.LoginPage;
import QuizPage_PageObject.CreateQuizPage;
import SurveyPage_PageObjects.SurveyQuestionsPage;
import SurveyPage_PageObjects.CreateSurveyQuestionsPage;


public class EvaluatorTestCase extends EvaluatorMethods {

	WebDriver driver;
	LoginPage objLoginPage;
	HomePage objHomePage;
	IndexPages objIndexPage;
	SurveyQuestionsPage objCreateSurveyPage;
	CreateSurveyQuestionsPage objCreateSurveyQuestionsPage;
	JavascriptExecutor js;
	CreateQuizPage objCreateQuizPage;

	// Test Cases
	
	//@Test(description = "Evaluator_WithDuration_TotalID_Equal_SingleWinner_CheckBoxQuestion", groups = { "Sanity" })
	public void TestCase201_Evaluator_WithDuration_TotalID_Equal_SingleWinner_CheckBoxQuestion() throws Exception {

		//ExtentTestManager.getTest().setDescription("Evaluator_WithDuration_TotalID_Equal_SingleWinner_CheckBoxQuestion");

		EvaluatorTestCase sat1 = new EvaluatorTestCase();

		sat1.LoginEvaluator();

		for (int i = 2; i <= 2;) {
			sat1.EvaluatorDetailPage(i);
			sat1.CheckBoxQuestionWithDuration(i);
			sat1.QuestionPageSaveAndNextBtn();
			Thread.sleep(3000);
			sat1.EvaluatorQuestionLogicPageSaveAndNextBtn();
			Thread.sleep(3000);
			sat1.PreviewAndCustomizePageNextBtn();
			Thread.sleep(2000);
			sat1.SingleWinnerReward();
			break;
			
		}
		
		sat1.CloseWindow();

	}
	
	//@Test(description = "Evaluator_WithDuration_TotalID_Individual_SingleWinner_CheckBoxQuestion", groups = { "Sanity" })
	public void TestCase202_Evaluator_WithDuration_TotalID_Individual_SingleWinner_CheckBoxQuestion() throws Exception {

		 //ExtentTestManager.getTest().setDescription("Evaluator_WithDuration_TotalID_Individual_SingleWinner_CheckBoxQuestion");

		EvaluatorTestCase sat2 = new EvaluatorTestCase();

		sat2.LoginEvaluator();

		for (int i = 3; i <= 3;) {
			sat2.EvaluatorDetailPage(i);
			sat2.CheckBoxQuestionWithDuration(i);
			Thread.sleep(2000);
			sat2.QuestionPageSaveAndNextBtn();
			Thread.sleep(3000);
			sat2.EvaluatorQuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat2.PreviewAndCustomizePageNextBtn();
			Thread.sleep(2000);
			sat2.SingleWinnerReward();
			break;
		}
		
	sat2.CloseWindow();

	}
	
	//@Test(description = "Evaluator_WithDuration_EqualID_Equal_SingleWinner_CheckBoxQuestion", groups = { "Sanity" })
	public void TestCase203_Evaluator_WithDuration_EqualID_Equal_SingleWinner_CheckBoxQuestion() throws Exception {

		// ExtentTestManager.getTest().setDescription("Evaluator_WithDuration_EqualID_Equal_SingleWinner_CheckBoxQuestion");

		EvaluatorTestCase sat3 = new EvaluatorTestCase();

		sat3.LoginEvaluator();

		for (int i = 4; i <= 4;) {
			sat3.EvaluatorDetailPage(i);
			sat3.CheckBoxQuestionWithDuration(i);
			Thread.sleep(2000);
			sat3.QuestionPageSaveAndNextBtn();
			Thread.sleep(3000);
			sat3.EvaluatorQuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat3.PreviewAndCustomizePageNextBtn();
			Thread.sleep(2000);
			sat3.SingleWinnerReward();
			break;
		}
		
		sat3.CloseWindow();

	}
	
	//@Test(description = "Evaluator_WithDuration_EqualID_Individual_SingleWinner_CheckBoxQuestion", groups = { "Sanity" })
	public void TestCase204_Evaluator_WithDuration_EqualID_Individual_SingleWinner_CheckBoxQuestion() throws Exception {

		 //ExtentTestManager.getTest().setDescription("Evaluator_WithDuration_EqualID_Individual_SingleWinner_CheckBoxQuestion");

		EvaluatorTestCase sat4 = new EvaluatorTestCase();

		sat4.LoginEvaluator();

		for (int i = 5; i <= 5;) {
			sat4.EvaluatorDetailPage(i);
			sat4.CheckBoxQuestionWithDuration(i);
			Thread.sleep(2000);
			sat4.QuestionPageSaveAndNextBtn();
			Thread.sleep(3000);
			sat4.EvaluatorQuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat4.PreviewAndCustomizePageNextBtn();
			Thread.sleep(2000);
			sat4.SingleWinnerReward();
			break;
		}
		
		sat4.CloseWindow();

	}

	//@Test(description = "Evaluator WithDuration IndividualID Equal SingleWinner CheckBoxQuestion", groups = { "Sanity" })
	public void TestCase205_Evaluator_WithDuration_IndividualID_Equal_SingleWinner_CheckBoxQuestion() throws Exception {

		// ExtentTestManager.getTest().setDescription("Evaluator WithDuration IndividualID Equal SingleWinner CheckBoxQuestion");

		EvaluatorTestCase sat5 = new EvaluatorTestCase();

		sat5.LoginEvaluator();

		for (int i = 6; i <= 6;) {
			sat5.EvaluatorDetailPage(i);
			sat5.CheckBoxQuestionWithDuration(i);
			Thread.sleep(2000);
			sat5.QuestionPageSaveAndNextBtn();
			Thread.sleep(3000);
			sat5.EvaluatorQuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat5.PreviewAndCustomizePageNextBtn();
			Thread.sleep(2000);
			sat5.SingleWinnerReward();
			break;
		}
		
		sat5.CloseWindow();

	}
	
	//@Test(description = "Evaluator WithDuration IndividualID Individual SingleWinner CheckBoxQuestion", groups = { "Sanity" })
	public void TestCase206_Evaluator_WithDuration_IndividualID_Individual_SingleWinner_CheckBoxQuestion() throws Exception {

		// ExtentTestManager.getTest().setDescription("Evaluator WithDuration IndividualID Individual SingleWinner CheckBoxQuestion");

		EvaluatorTestCase sat6 = new EvaluatorTestCase();

		sat6.LoginEvaluator();

		for (int i = 7; i <= 7;) {
			sat6.EvaluatorDetailPage(i);
			sat6.CheckBoxQuestionWithDuration(i);
			Thread.sleep(2000);
			sat6.QuestionPageSaveAndNextBtn();
			Thread.sleep(3000);
			sat6.EvaluatorQuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat6.PreviewAndCustomizePageNextBtn();
			Thread.sleep(2000);
			sat6.SingleWinnerReward();
			break;
		}
		
	sat6.CloseWindow();

	}
	
	//@Test(description = "Evaluator WithoutDuration Expires EqualW SingleWinner CheckBoxQuestion", groups = { "Sanity" })
	public void TestCase207_Evaluator_WithoutDuration_Expires_EqualW_SingleWinner_CheckBoxQuestion() throws Exception {

		// ExtentTestManager.getTest().setDescription("Evaluator WithoutDuration Expires EqualW SingleWinner CheckBoxQuestion");

		EvaluatorTestCase sat7 = new EvaluatorTestCase();

		sat7.LoginEvaluator();

		for (int i = 8; i <= 8;) {
			sat7.EvaluatorDetailPage(i);
			sat7.CheckBoxQuestionWithOutDuration(i);
			Thread.sleep(2000);
			sat7.QuestionPageSaveAndNextBtn();
			Thread.sleep(3000);
			sat7.EvaluatorQuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat7.PreviewAndCustomizePageNextBtn();
			Thread.sleep(2000);
			sat7.SingleWinnerReward();
			break;
		}
		
		sat7.CloseWindow();

	}
	
	//@Test(description = "Evaluator WithoutDuration Expires IndividuaW SingleWinner CheckBoxQuestion", groups = { "Sanity" })
	public void TestCase208_Evaluator_WithoutDuration_Expires_IndividuaW_SingleWinner_CheckBoxQuestion() throws Exception {

		 //ExtentTestManager.getTest().setDescription("Evaluator WithoutDuration Expires IndividuaW SingleWinner CheckBoxQuestion");

		EvaluatorTestCase sat8 = new EvaluatorTestCase();

		sat8.LoginEvaluator();

		for (int i = 9; i <= 9;) {
			sat8.EvaluatorDetailPage(i);
			sat8.CheckBoxQuestionWithOutDuration(i);
			Thread.sleep(2000);
			sat8.QuestionPageSaveAndNextBtn();
			Thread.sleep(3000);
			sat8.EvaluatorQuestionLogicPageSaveAndNextBtn();
			Thread.sleep(2000);
			sat8.PreviewAndCustomizePageNextBtn();
			Thread.sleep(2000);
			sat8.SingleWinnerReward();
			break;
		}
		
		sat8.CloseWindow();

	}
	
	//@Test(description = "Evaluator WithDuration TotalID Equal CheckBoxQuestion QuestionPageSaveDraftAndPublish", groups = { "Sanity" })
	public void TestCase209_Evaluator_WithDuration_TotalID_Equal_CheckBoxQuestion_QuestionPageSaveDraftAndPublish() throws Exception {

		// ExtentTestManager.getTest().setDescription("Evaluator WithDuration TotalID Equal CheckBoxQuestion QuestionPageSaveDraftAndPublish");

		EvaluatorTestCase sat9 = new EvaluatorTestCase();

		sat9.LoginEvaluator();

		for (int i = 10; i <= 10;) {
			sat9.EvaluatorDetailPage(i);
			sat9.CheckBoxQuestionWithDuration(i);
			Thread.sleep(3000);
			sat9.QuestionPageSaveDraftAndPublish();
			break;
			
		}
		
		sat9.CloseWindow();

	}
	
 //@Test(description = "Evaluator WithDuration TotalID Equal CheckBoxQuestion PreviewAndCustomizePageSaveDraftAndPublish", groups = { "Sanity" })
	public void TestCase210_Evaluator_WithDuration_TotalID_Equal_CheckBoxQuestion_PreviewAndCustomizePageSaveDraftAndPublish() throws Exception {

		// ExtentTestManager.getTest().setDescription("Evaluator WithDuration TotalID Equal CheckBoxQuestion PreviewAndCustomizePageSaveDraftAndPublish");

		EvaluatorTestCase sat10 = new EvaluatorTestCase();

		sat10.LoginEvaluator();

		for (int i = 11; i <= 11;) {
			sat10.EvaluatorDetailPage(i);
			sat10.CheckBoxQuestionWithDuration(i);
			Thread.sleep(3000);
			sat10.QuestionPageSaveAndNextBtn();
			Thread.sleep(3000);
			sat10.QuestionLogicPageSaveAndNextBtn();
			Thread.sleep(3000);
			sat10.PreviewAndCustomizePageSaveDraftAndPublish();
			break;
			
		}
		
		sat10.CloseWindow();

	}
	
	//@Test(description = "Evaluator_WithDuration_TotalID_Equal_SingleWinner_DateQuestion", groups = { "Sanity" })
	public void TestCase211_Evaluator_WithDuration_TotalID_Equal_SingleWinner_DateQuestion() throws Exception {

		// ExtentTestManager.getTest().setDescription("Evaluator_WithDuration_TotalID_Equal_SingleWinner_DateQuestion");

		EvaluatorTestCase sat11 = new EvaluatorTestCase();

		sat11.LoginEvaluator();

		for (int i = 12; i <= 12;) {
			sat11.EvaluatorDetailPage(i);
			sat11.DateQuestion();
			sat11.QuestionPageSaveAndNextBtn();
			Thread.sleep(3000);
			sat11.EvaluatorQuestionLogicPageSaveAndNextBtn();
			Thread.sleep(3000);
			sat11.PreviewAndCustomizePageNextBtn();
			sat11.SingleWinnerReward();
			break;
		}
		
		sat11.CloseWindow();

	}
	
	//@Test(description = "Evaluator_WithDuration_TotalID_Equal_SingleWinner_DropdownWithoutWeightageQuestion", groups = { "Sanity" })
	public void TestCase212_Evaluator_WithDuration_TotalID_Equal_SingleWinner_DropdownWithoutWeightageQuestion() throws Exception {

		// ExtentTestManager.getTest().setDescription("Evaluator_WithDuration_TotalID_Equal_SingleWinner_DropdownWithoutWeightageQuestion");

		EvaluatorTestCase sat12 = new EvaluatorTestCase();

		sat12.LoginEvaluator();

		for (int i = 13; i <= 13;) {
			sat12.EvaluatorDetailPage(i);
			sat12.DropdownWithoutWeightageQuestion();
			Thread.sleep(3000);
			sat12.QuestionPageSaveAndNextBtn();
			Thread.sleep(3000);
			sat12.EvaluatorQuestionLogicPageSaveAndNextBtn();
			Thread.sleep(3000);
			sat12.PreviewAndCustomizePageNextBtn();
			Thread.sleep(3000);
			sat12.SingleWinnerReward();
			break;
		}
		
		sat12.CloseWindow();

	}
	
	 //@Test(description = "Evaluator_WithDuration_TotalID_Equal_SingleWinner_FileUploadQuestion", groups = { "Sanity" })
	public void TestCase213_Evaluator_WithDuration_TotalID_Equal_SingleWinner_FileUploadQuestion() throws Exception {

		// ExtentTestManager.getTest().setDescription("Evaluator_WithDuration_TotalID_Equal_SingleWinner_FileUploadQuestion");

		EvaluatorTestCase sat14 = new EvaluatorTestCase();

		sat14.LoginEvaluator();

		for (int i = 14; i <= 14;) {
			sat14.EvaluatorDetailPage(i);
			sat14.FileUploadQuestion();
			sat14.QuestionPageSaveAndNextBtn();
			Thread.sleep(3000);
			sat14.EvaluatorQuestionLogicPageSaveAndNextBtn();
			Thread.sleep(3000);
			sat14.PreviewAndCustomizePageNextBtn();
			Thread.sleep(3000);
			sat14.SingleWinnerReward();
			break;
		}
		
	sat14.CloseWindow();

	}
	
	//@Test(description = "Evaluator_WithDuration_TotalID_Equal_SingleWinner_GroupScalingQuestion", groups = { "Sanity" })
	public void TestCase214_Evaluator_WithDuration_TotalID_Equal_SingleWinner_GroupScalingQuestion() throws Exception {

		// ExtentTestManager.getTest().setDescription("Evaluator_WithDuration_TotalID_Equal_SingleWinner_GroupScalingQuestion");

		EvaluatorTestCase sat15 = new EvaluatorTestCase();

		sat15.LoginEvaluator();

		for (int i = 15; i <= 15;) {
			sat15.EvaluatorDetailPage(i);
			Thread.sleep(3000);
			sat15.GroupScalingQuestion();
			Thread.sleep(3000);
			sat15.QuestionPageSaveAndNextBtn();
			Thread.sleep(3000);
			sat15.EvaluatorQuestionLogicPageSaveAndNextBtn();
			Thread.sleep(3000);
			sat15.PreviewAndCustomizePageNextBtn();
			Thread.sleep(3000);
			sat15.SingleWinnerReward();
			break;
		}
		
	sat15.CloseWindow();

	}
	
//	@Test(description = "Evaluator_WithDuration_TotalID_Equal_SingleWinner_GroupScalingQuestion", groups = { "Sanity" })
	public void TestCase215_Evaluator_WithDuration_TotalID_Equal_SingleWinner_GroupScalingQuestion() throws Exception {

		// ExtentTestManager.getTest().setDescription("Evaluator_WithDuration_TotalID_Equal_SingleWinner_GroupScalingQuestion");

		EvaluatorTestCase sat16 = new EvaluatorTestCase();

		sat16.LoginEvaluator();

		for (int i = 16; i <= 16;) {
			sat16.EvaluatorDetailPage(i);
			sat16.ImagePollQuestion();
			sat16.QuestionPageSaveAndNextBtn();
			sat16.EvaluatorQuestionLogicPageSaveAndNextBtn();
			Thread.sleep(3000);
			sat16.PreviewAndCustomizePageNextBtn();
			sat16.SingleWinnerReward();
			break;
		}
		
		sat16.CloseWindow();

	}
	
	//@Test(description = "Evaluator_WithDuration_TotalID_Equal_SingleWinner_MultipleSelectDropdownQuestion", groups = { "Sanity" })
	public void TestCase216_Evaluator_WithDuration_TotalID_Equal_SingleWinner_MultipleSelectDropdownQuestion() throws Exception {

		// ExtentTestManager.getTest().setDescription("Evaluator_WithDuration_TotalID_Equal_SingleWinner_MultipleSelectDropdownQuestion");

		EvaluatorTestCase sat17 = new EvaluatorTestCase();

		sat17.LoginEvaluator();

		for (int i = 17; i <= 17;) {
			sat17.EvaluatorDetailPage(i);
			sat17.MultipleSelectDropdownQuestion();
			Thread.sleep(3000);
			sat17.QuestionPageSaveAndNextBtn();
			Thread.sleep(3000);
			sat17.EvaluatorQuestionLogicPageSaveAndNextBtn();
			Thread.sleep(3000);
			sat17.PreviewAndCustomizePageNextBtn();
			Thread.sleep(3000);
			sat17.SingleWinnerReward();
			break;
		}
		
		sat17.CloseWindow();

	}
	
	//@Test(description = "Evaluator_WithDuration_TotalID_Equal_SingleWinner_MultipleTextBoxesQuestion", groups = { "Sanity" })
	public void TestCase217_Evaluator_WithDuration_TotalID_Equal_SingleWinner_MultipleTextBoxesQuestion() throws Exception {

		// ExtentTestManager.getTest().setDescription("Evaluator_WithDuration_TotalID_Equal_SingleWinner_MultipleTextBoxesQuestion");
		EvaluatorTestCase sat18 = new EvaluatorTestCase();

		sat18.LoginEvaluator();

		for (int i = 18; i <= 18;) {
			sat18.EvaluatorDetailPage(i);
			sat18.QuestionScrollDown();
			sat18.MultipleTextBoxesQuestion();
			Thread.sleep(3000);
			sat18.QuestionPageSaveAndNextBtn();
			Thread.sleep(3000);
			sat18.EvaluatorQuestionLogicPageSaveAndNextBtn();
			Thread.sleep(3000);
			sat18.PreviewAndCustomizePageNextBtn();
			Thread.sleep(3000);
			sat18.SingleWinnerReward();
			break;
		}
		
		sat18.CloseWindow();

	}
	
	//@Test(description = "Evaluator_WithDuration_TotalID_Equal_SingleWinner_NumberQuestion", groups = { "Sanity" })
	public void TestCase218_Evaluator_WithDuration_TotalID_Equal_SingleWinner_NumberQuestion() throws Exception {

		// ExtentTestManager.getTest().setDescription("Evaluator_WithDuration_TotalID_Equal_SingleWinner_NumberQuestion");
		EvaluatorTestCase sat19 = new EvaluatorTestCase();

		sat19.LoginEvaluator();

		for (int i = 19; i <= 19;) {
			sat19.EvaluatorDetailPage(i);
			sat19.QuestionScrollDown();
			sat19.NumberQuestion();
			sat19.QuestionPageSaveAndNextBtn();
			Thread.sleep(3000);
			sat19.EvaluatorQuestionLogicPageSaveAndNextBtn();
			Thread.sleep(3000);
			sat19.PreviewAndCustomizePageNextBtn();
			sat19.SingleWinnerReward();
			break;
		}
		
		sat19.CloseWindow();

	}
	
//	@Test(description = "Evaluator_WithDuration_TotalID_Equal_SingleWinner_PictionaryQuestion", groups = { "Sanity" })
	public void TestCase219_Evaluator_WithDuration_TotalID_Equal_SingleWinner_PictionaryQuestion() throws Exception {

		// ExtentTestManager.getTest().setDescription("Evaluator_WithDuration_TotalID_Equal_SingleWinner_PictionaryQuestion")
		EvaluatorTestCase sat20 = new EvaluatorTestCase();

		sat20.LoginEvaluator();

		for (int i = 20; i <= 20;) {
			sat20.EvaluatorDetailPage(i);
			sat20.QuestionScrollDown();
			sat20.PictionaryQuestion();
			sat20.QuestionPageSaveAndNextBtn();
			Thread.sleep(3000);
			sat20.EvaluatorQuestionLogicPageSaveAndNextBtn();
			Thread.sleep(3000);
			sat20.PreviewAndCustomizePageNextBtn();
			Thread.sleep(3000);
			sat20.SingleWinnerReward();
			break;
		}
		
		sat20.CloseWindow();

	}
	//@Test(description = "Evaluator_WithDuration_TotalID_Equal_SingleWinner_RadioButtonQuestion", groups = { "Sanity" })
	public void TestCase220_Evaluator_WithDuration_TotalID_Equal_SingleWinner_RadioButtonQuestion() throws Exception {

		// ExtentTestManager.getTest().setDescription("Evaluator_WithDuration_TotalID_Equal_SingleWinner_RadioButtonQuestion");
		EvaluatorTestCase sat21 = new EvaluatorTestCase();

		sat21.LoginEvaluator();

		for (int i = 21; i <= 21;) {
			sat21.EvaluatorDetailPage(i);
			sat21.QuestionScrollDown();
			sat21.RadioButtonQuestion();
			sat21.QuestionPageSaveAndNextBtn();
			Thread.sleep(3000);
			sat21.EvaluatorQuestionLogicPageSaveAndNextBtn();
			Thread.sleep(3000);
			sat21.PreviewAndCustomizePageNextBtn();
			Thread.sleep(3000);
			sat21.SingleWinnerReward();
			break;
		}
		
		sat21.CloseWindow();

	}
	
	//@Test(description = "Evaluator_WithDuration_TotalID_Equal_SingleWinner_ScaleRateQuestion", groups = { "Sanity" })
	public void TestCase221_Evaluator_WithDuration_TotalID_Equal_SingleWinner_ScaleRateQuestion() throws Exception {

		// ExtentTestManager.getTest().setDescription("Evaluator_WithDuration_TotalID_Equal_SingleWinner_ScaleRateQuestion");
		EvaluatorTestCase sat22 = new EvaluatorTestCase();

		sat22.LoginEvaluator();

		for (int i = 22; i <= 22;) {
			sat22.EvaluatorDetailPage(i);
			sat22.QuestionScrollDown();
			sat22.ScaleRateQuestion();
			sat22.QuestionPageSaveAndNextBtn();
			Thread.sleep(3000);
			sat22.EvaluatorQuestionLogicPageSaveAndNextBtn();
			Thread.sleep(3000);
			sat22.PreviewAndCustomizePageNextBtn();
			Thread.sleep(3000);
			sat22.SingleWinnerReward();
			break;
		}
		
		sat22.CloseWindow();

	}
	
	//@Test(description = "Evaluator_WithDuration_TotalID_Equal_SingleWinner_SingleLineTextQuestion", groups = { "Sanity" })
 public void TestCase222_Evaluator_WithDuration_TotalID_Equal_SingleWinner_SingleLineTextQuestion() throws Exception {

	//	ExtentTestManager.getTest().setDescription("Evaluator_WithDuration_TotalID_Equal_SingleWinner_SingleLineTextQuestion");
		EvaluatorTestCase sat23 = new EvaluatorTestCase();

		sat23.LoginEvaluator();

		for (int i = 23; i <= 23;) {
			sat23.EvaluatorDetailPage(i);
			sat23.QuestionScrollDown();
			sat23.SingleLineTextQuestion();
			Thread.sleep(3000);
			sat23.QuestionPageSaveAndNextBtn();
			Thread.sleep(3000);
			sat23.EvaluatorQuestionLogicPageSaveAndNextBtn();
			Thread.sleep(3000);
			sat23.PreviewAndCustomizePageNextBtn();
			Thread.sleep(3000);
			sat23.SingleWinnerReward();
			break;
		}
		
		sat23.CloseWindow();

	}
	
	//@Test(description = "Evaluator_WithDuration_TotalID_Equal_SingleWinner_TextAreaQuestion", groups = { "Sanity" })
	public void TestCase223_Evaluator_WithDuration_TotalID_Equal_SingleWinner_TextAreaQuestion() throws Exception {

		// ExtentTestManager.getTest().setDescription("Evaluator_WithDuration_TotalID_Equal_SingleWinner_TextAreaQuestion");
		EvaluatorTestCase sat24 = new EvaluatorTestCase();

		sat24.LoginEvaluator();

		for (int i = 24; i <= 24;) {
			sat24.EvaluatorDetailPage(i);
			sat24.QuestionScrollDown();
			sat24.TextAreaQuestion();
			sat24.QuestionPageSaveAndNextBtn();
			Thread.sleep(3000);
			sat24.EvaluatorQuestionLogicPageSaveAndNextBtn();
			Thread.sleep(3000);
			sat24.PreviewAndCustomizePageNextBtn();
			Thread.sleep(3000);
			sat24.SingleWinnerReward();
			break;
		}
		
		sat24.CloseWindow();

	}
	
	//@Test(description = "Evaluator_WithDuration_TotalID_Equal_SingleWinner_YesOrNoQuestion", groups = { "Sanity" })
	public void TestCase224_Evaluator_WithDuration_TotalID_Equal_SingleWinner_YesOrNoQuestion() throws Exception {

		// ExtentTestManager.getTest().setDescription("Evaluator_WithDuration_TotalID_Equal_SingleWinner_YesOrNoQuestion");
		EvaluatorTestCase sat25 = new EvaluatorTestCase();

		sat25.LoginEvaluator();

		for (int i = 25; i <= 25;) {
			sat25.EvaluatorDetailPage(i);
			sat25.QuestionScrollDown();
			sat25.YesOrNoQuestion();
			sat25.QuestionPageSaveAndNextBtn();
			Thread.sleep(3000);
			sat25.EvaluatorQuestionLogicPageSaveAndNextBtn();
			Thread.sleep(3000);
			sat25.PreviewAndCustomizePageNextBtn();
			Thread.sleep(3000);
			sat25.SingleWinnerReward();
			break;
		}
		
		sat25.CloseWindow();

	}
	
}
