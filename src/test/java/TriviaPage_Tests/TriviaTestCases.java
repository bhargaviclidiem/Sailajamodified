package TriviaPage_Tests;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;
import ExtentReports.ExtentTestManager;
import HomePage_PageObject.HomePage;
import HomePage_PageObject.IndexPages;
import HomePage_PageObject.LoginPage;
import QuizPage_PageObject.CreateQuizPage;


public class TriviaTestCases extends TriviaMethods {

	WebDriver driver;
	LoginPage objLoginPage;
	HomePage objHomePage;
	IndexPages objIndexPage;
	JavascriptExecutor js;
	JavascriptExecutor jse;
	CreateQuizPage objCreateQuizPage;

	// Test Cases
	
	@Test(description = "Trivia Check Box Question Type SingleWinnerReward Publish")
	public void TestCase_201_Trivia_CheckBox_QuestionType_SingleWinnerReward_Publish() throws Exception {

		 ExtentTestManager.getTest().setDescription("Trivia Check Box Question Type SingleWinnerReward Publish");

		TriviaTestCases sat1 = new TriviaTestCases();

		sat1.LoginQuiz();

		for (int i = 2; i <= 2;) {
			sat1.TriviaDetailPage(i);
			sat1.TriviaCheckBoxQuestionType();
			sat1.TriviaQuestionSaveAndNextBtn();
			sat1.TriviaQuestionLogicNextBtn();
			sat1.TriviaPreviewPageSkipAndNextBtn();
			sat1.TriviaSinglwWinnerReward(i);
            break;
		}
		 sat1.CloseWindow();
	
	
	}
	
	@Test(description = "Trivia Dropdown Question Type SingleWinnerReward Publish")
	public void TestCase_202_Trivia_Dropdown_QuestionType_SingleWinnerReward_Publish() throws Exception {

		 ExtentTestManager.getTest().setDescription("Trivia Dropdown Question Type SingleWinnerReward Publish");

		TriviaTestCases sat2 = new TriviaTestCases();

		sat2.LoginQuiz();

		for (int i = 3; i <= 3;) {
			sat2.TriviaDetailPage(i);
			sat2.TriviaDropdownQuestionType();
			sat2.TriviaQuestionSaveAndNextBtn();
			Thread.sleep(2000);
			sat2.TriviaQuestionLogicNextBtn();
			sat2.TriviaPreviewPageSkipAndNextBtn();
			sat2.TriviaSinglwWinnerReward(i);
            break;
		}
		sat2.CloseWindow();
	
	
	}
	
	//@Test(description = "Trivia ImagePoll Question Type SingleWinnerReward Publish")
	public void TestCase_203_Trivia_ImagePoll_QuestionType_SingleWinnerReward_Publish() throws Exception {

		// ExtentTestManager.getTest().setDescription("Trivia ImagePoll Question Type SingleWinnerReward Publish");

		TriviaTestCases sat3 = new TriviaTestCases();

		sat3.LoginQuiz();

		for (int i = 4; i <= 4;) {
			sat3.TriviaDetailPage(i);
			sat3.TriviaImagePollQuestionType();
			sat3.TriviaQuestionSaveAndNextBtn();
			Thread.sleep(2000);
			sat3.TriviaQuestionLogicNextBtn();
			sat3.TriviaPreviewPageSkipAndNextBtn();
			sat3.TriviaSinglwWinnerReward(i);
            break;
		}
		//sat3.CloseWindow();
	
	
	}
	
	@Test(description = "Trivia MultipleSelectDropdown Question Type SingleWinnerReward Publish")
	public void TestCase_204_Trivia_MultipleSelectDropdown_QuestionType_SingleWinnerReward_Publish() throws Exception {

		 ExtentTestManager.getTest().setDescription("Trivia MultipleSelectDropdown Question Type SingleWinnerReward Publish");

		TriviaTestCases sat4 = new TriviaTestCases();

		sat4.LoginQuiz();

		for (int i = 5; i <= 5;) {
			sat4.TriviaDetailPage(i);
			sat4.TriviaMultipleSelectDropdownQuestionType();
			sat4.TriviaQuestionSaveAndNextBtn();
			Thread.sleep(2000);
			sat4.TriviaQuestionLogicNextBtn();
			sat4.TriviaPreviewPageSkipAndNextBtn();
			sat4.TriviaSinglwWinnerReward(i);
            break;
		}
		 sat4.CloseWindow();
	
	
	}
	
	@Test(description = "Trivia Radiobutton Question Type SingleWinnerReward Publish")
	public void TestCase_205_Trivia_Radiobutton_QuestionType_SingleWinnerReward_Publish() throws Exception {

		 ExtentTestManager.getTest().setDescription("Trivia Radiobutton Question Type SingleWinnerReward Publish");

		TriviaTestCases sat5 = new TriviaTestCases();

		sat5.LoginQuiz();

		for (int i = 6; i <= 6;) {
			sat5.TriviaDetailPage(i);
			sat5.TriviaRadioButtonQuestionType();
			sat5.TriviaQuestionSaveAndNextBtn();
			Thread.sleep(2000);
			sat5.TriviaQuestionLogicNextBtn();
			sat5.TriviaPreviewPageSkipAndNextBtn();
			sat5.TriviaSinglwWinnerReward(i);
            break;
		}
		 sat5.CloseWindow();
	
	
	}

	@Test(description = "Trivia CheckBoxQuestionPage SaveAsDraft")
	public void TestCase_206_Trivia_CheckBoxQuestionPage_SaveAsDraft() throws Exception {

		 ExtentTestManager.getTest().setDescription("Trivia CheckBoxQuestionPage SaveAsDraft");

		TriviaTestCases sat6 = new TriviaTestCases();

		sat6.LoginQuiz();

		for (int i = 7; i <= 7;) {
			sat6.TriviaDetailPage(i);
			sat6.TriviaCheckBoxQuestionType();
			sat6.TriviaQuestionSaveAndDraft();
			
            break;
		}
		 sat6.CloseWindow();
	
	
	}
	
	@Test(description = "Trivia CheckBoxQuestion QuestionPage SaveAndPublish")
	public void TestCase_207_Trivia_CheckBoxQuestion_QuestionPage_SaveAndPublish() throws Exception {

		ExtentTestManager.getTest().setDescription("Trivia CheckBoxQuestion QuestionPage SaveAndPublish");

		TriviaTestCases sat7 = new TriviaTestCases();

		sat7.LoginQuiz();

		for (int i = 8; i <= 8;) {
			sat7.TriviaDetailPage(i);
			sat7.TriviaCheckBoxQuestionType();
			sat7.TriviaQuestionSaveAndPublish();
			
            break;
		}
		 sat7.CloseWindow();
	
	
	}
	
//	@Test(description = "Trivia CheckBoxQuestion PreviewAndCustomize SaveAndPublish")
	public void TestCase_208_Trivia_CheckBoxQuestion_PreviewAndCustomize_SaveAndPublish() throws Exception {

		// ExtentTestManager.getTest().setDescription("Trivia CheckBoxQuestion PreviewAndCustomize SaveAndPublish");

		TriviaTestCases sat8 = new TriviaTestCases();

		sat8.LoginQuiz();

		for (int i = 9; i <= 9;) {
			sat8.TriviaDetailPage(i);
			sat8.TriviaCheckBoxQuestionType();
			sat8.TriviaQuestionSaveAndNextBtn();
			Thread.sleep(2000);
			sat8.TriviaQuestionLogicNextBtn();
			Thread.sleep(2000);
			sat8.TriviaPreviewAndCustomizeSaveAndPublish();
			
            break;
		}
		// sat8.CloseWindow();
	
	
	}
	
	@Test(description = "Trivia CheckBoxQuestion PreviewAndCustomize SkipAndPublish")
	public void TestCase_209_Trivia_CheckBoxQuestion_PreviewAndCustomize_SkipAndPublish() throws Exception {

		ExtentTestManager.getTest().setDescription("Trivia CheckBoxQuestion PreviewAndCustomize SkipAndPublish");

		TriviaTestCases sat9 = new TriviaTestCases();

		sat9.LoginQuiz();

		for (int i = 10; i <= 10;) {
			sat9.TriviaDetailPage(i);
			sat9.TriviaCheckBoxQuestionType();
			sat9.TriviaQuestionSaveAndNextBtn();
			Thread.sleep(2000);
			sat9.TriviaQuestionLogicNextBtn();
			Thread.sleep(2000);
			sat9.TriviaPreviewAndCustomizeSkipAndPublish();
			
            break;
		}
		sat9.CloseWindow();
	
	
	}
	
	@Test(description = "Trivia CheckBoxQuestion Rewards SaveAndPublish")
	public void TestCase_210_Trivia_CheckBoxQuestion_Rewards_SaveAndPublish() throws Exception {

		 ExtentTestManager.getTest().setDescription("Trivia CheckBoxQuestion Rewards SaveAndPublish");

		TriviaTestCases sat10 = new TriviaTestCases();

		sat10.LoginQuiz();

		for (int i = 11; i <= 11;) {
			sat10.TriviaDetailPage(i);
			sat10.TriviaCheckBoxQuestionType();
			sat10.TriviaQuestionSaveAndNextBtn();
			Thread.sleep(2000);
			sat10.TriviaQuestionLogicNextBtn();
			Thread.sleep(2000);
			sat10.TriviaPreviewPageSkipAndNextBtn();
			Thread.sleep(2000);
			sat10.TriviaRewardsSaveAndPublish();
            break;
		}
		 sat10.CloseWindow();
	
	
	}
	
	@Test(description = "Trivia CheckBoxQuestion Rewards SkipAndPublish")
	public void TestCase_211_Trivia_CheckBoxQuestion_Rewards_SkipAndPublish() throws Exception {

		 ExtentTestManager.getTest().setDescription("Trivia CheckBoxQuestion Rewards SkipAndPublish");

		TriviaTestCases sat11 = new TriviaTestCases();

		sat11.LoginQuiz();

		for (int i = 12; i <= 12;) {
			sat11.TriviaDetailPage(i);
			sat11.TriviaCheckBoxQuestionType();
			sat11.TriviaQuestionSaveAndNextBtn();
			Thread.sleep(2000);
			sat11.TriviaQuestionLogicNextBtn();
			Thread.sleep(2000);
			sat11.TriviaPreviewPageSkipAndNextBtn();
			Thread.sleep(2000);
			sat11.TriviaRewardsSkipAndPublish();
            break;
		}
		 sat11.CloseWindow();
	
	
	}
	
}
