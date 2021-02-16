package TriviaPage_Tests;

import java.util.ArrayList;
import java.util.Base64;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import HomePage_PageObject.HomePage;
import HomePage_PageObject.IndexPages;
import HomePage_PageObject.LoginPage;
import QuizPage_PageObject.CreateQuizPage;
import SurveyPage_PageObjects.SurveyQuestionsPage;
import SurveyPage_PageObjects.CreateSurveyQuestionsPage;
import utilityLibrary.Helper;

public class TriviaMethods {

	WebDriver driver;
	LoginPage objLoginPage;
	HomePage objHomePage;
	IndexPages objIndexPage;
	SurveyQuestionsPage objCreateSurveyPage;
	CreateSurveyQuestionsPage objCreateSurveyQuestionsPage;
	JavascriptExecutor js;
	CreateQuizPage objCreateQuizPage;

	// Methods

	public void LoginQuiz() throws Exception {
		// Open the application under test
		driver = Helper.openAUT(driver);
		objLoginPage = new LoginPage(driver);
		objHomePage = new HomePage(driver);
		objIndexPage = new IndexPages(driver);
		objCreateSurveyPage = new SurveyQuestionsPage(driver);
		objCreateSurveyQuestionsPage = new CreateSurveyQuestionsPage(driver);
		objCreateQuizPage = new CreateQuizPage();

		objHomePage.loginLnk.click();
		Thread.sleep(20000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("The number of windows are: " + tabs.size());
		driver.switchTo().window(tabs.get(1));

		// use https://www.base64encode.org/ for encoding and decoding creds
		objLoginPage.login(Helper.getValue("userName"),
				(new String(Base64.getDecoder().decode(Helper.getValue("password")))));
		Thread.sleep(10000);

		Thread.sleep(3000);
		objIndexPage.TriviaLnk.click();
		Thread.sleep(2000);
		objIndexPage.CreateTriviaLnk.click();
		Thread.sleep(2000);

	}
	public void CloseWindow() throws Exception {
		// driver.close();
		driver.quit();
	}
	public void Screenshot() throws Exception {
		Helper.takeScreenshot(driver);
	}

	// Trivia Detail Page

	public void TriviaDetailPage(int row) throws Exception {

		Thread.sleep(3000);
		//objIndexPage.QuizImage.sendKeys(Helper.getData("CreateTriviaQuiz", row, 2));
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
		Thread.sleep(3000);
		Helper.takeScreenshot(driver);
		//objIndexPage.QuizImageCrop.click();
		Thread.sleep(3000);

		objIndexPage.QuizNameTxtBx.sendKeys(Helper.getData("CreateTriviaQuiz", row, 7));
		objIndexPage.QuizTrivaDescriptionTxtBx.sendKeys(Helper.getData("CreateTriviaQuiz", row, 8));
		objIndexPage.TrivaEqualDurationTxtBx.sendKeys(Helper.getData("CreateTriviaQuiz", row, 11));
		objIndexPage.TrivaEqualWeightageTxtBx.sendKeys(Helper.getData("CreateTriviaQuiz", row, 13));
		objIndexPage.NegativeWeightageTxtBx.sendKeys(Helper.getData("CreateTriviaQuiz", row, 14));

		objIndexPage.NextQuizDetailBtn.click();

	}

	// Trivia Questions Page

	public void TriviaCheckBoxQuestionType() throws Exception {
		
		Thread.sleep(2000);
		objIndexPage.checkboxBtnClk.click();
		objIndexPage.Chkquestiontxt.sendKeys(Helper.getData("Question Types", 2, 3));
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
								
				String Answer1 = (Helper.getData("Question Types", 4, 7));
				if (Answer1.contains("yes")) {
					
					objIndexPage.Answerchkenterfirstoption.click();
					
				}
				
			}
		}
		if (count >= 2) {
			String option = Helper.getData("Question Types", 2, 8);
			if (option != "") {
				objIndexPage.chkentersecondoption.sendKeys(Helper.getData("Question Types", 2, 8));
				Helper.takeScreenshot(driver);
			
				String Answer2 = (Helper.getData("Question Types", 4, 8));
				if (Answer2.contains("yes")) {
					
					objIndexPage.Answerchkentersecondoption.click();
					
				}
				
				}
		}
		if (count >= 3) {
			String option = Helper.getData("Question Types", 2, 9);
			if (option != "") {
				objIndexPage.chkenterThirdoption.sendKeys(Helper.getData("Question Types", 2, 9));
				Helper.takeScreenshot(driver);
				String Answer3 = (Helper.getData("Question Types", 4, 9));
				if (Answer3.contains("yes")) {
					
					objIndexPage.AnswerchkenterThirdoption.click();
					
				}
			}
		}
		if (count >= 4) {
			String option = Helper.getData("Question Types", 2, 10);
			if (option != "") {
				objIndexPage.chkenterFourthoption.sendKeys(Helper.getData("Question Types", 2, 10));
				Helper.takeScreenshot(driver);
				String Answer4 = (Helper.getData("Question Types", 4, 10));
				if (Answer4.contains("yes")) {
					
					objIndexPage.AnswerchkenterFourthoption.click();
					
				}
				
			}
		}
		if (count >= 5) {
			String option = Helper.getData("Question Types", 2, 11);
			if (option != "") {
				objIndexPage.chkenterFiveoption.sendKeys(Helper.getData("Question Types", 2, 11));
				Helper.takeScreenshot(driver);
				String Answer5 = (Helper.getData("Question Types", 4, 11));
				if (Answer5.contains("yes")) {
					
					objIndexPage.AnswerchkenterFiveoption.click();
					
				}
			}
		}
		if (count >= 6) {
			String option = Helper.getData("Question Types", 2, 12);
			if (option != "") {
				objIndexPage.chkenterSixoption.sendKeys(Helper.getData("Question Types", 2, 12));
				Helper.takeScreenshot(driver);
				String Answer6 = (Helper.getData("Question Types", 4, 12));
				if (Answer6.contains("yes")) {
					
					objIndexPage.AnswerchkenterSixoption.click();
					
				}
			}
		}
		if (count >= 7) {
			String option = Helper.getData("Question Types", 2, 13);
			if (option != "") {
				objIndexPage.chkenterSevenoption.sendKeys(Helper.getData("Question Types", 2, 13));
				Helper.takeScreenshot(driver);
				String Answer7 = (Helper.getData("Question Types", 4, 13));
				if (Answer7.contains("yes")) {
					
					objIndexPage.AnswerchkenterSevenoption.click();
					
				}
			}
		}
		if (count >= 8) {
			String option = Helper.getData("Question Types", 2, 14);
			if (option != "") {
				objIndexPage.chkenterEightoption.sendKeys(Helper.getData("Question Types", 2, 14));
				Helper.takeScreenshot(driver);
				String Answer8 = (Helper.getData("Question Types", 4, 14));
				if (Answer8.contains("yes")) {
					
					objIndexPage.AnswerchkenterEightoption.click();
					
				}
			}
		}
		if (count >= 9) {
			String option = Helper.getData("Question Types", 2, 15);
			if (option != "") {
				objIndexPage.chkenterNineoption.sendKeys(Helper.getData("Question Types", 2, 15));
				Helper.takeScreenshot(driver);
				String Answer9 = (Helper.getData("Question Types", 4, 15));
				if (Answer9.contains("yes")) {
					
					objIndexPage.AnswerchkenterNineoption.click();
					
				}
			}
		}
		if (count >= 10) {
			String option = Helper.getData("Question Types", 2, 16);
			if (option != "") {
				objIndexPage.chkenterTenoption.sendKeys(Helper.getData("Question Types", 2, 16));
				Helper.takeScreenshot(driver);
				String Answer10 = (Helper.getData("Question Types", 4, 16));
				if (Answer10.contains("yes")) {
					
					objIndexPage.AnswerchkenterTenoption.click();
					
				}
			}
		}
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("scroll(0, -100);");
		Thread.sleep(3000);
		objIndexPage.chkbxallowcommentsTrivia.click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("scroll(0, 200);");
		objIndexPage.chkbxaddquestionTrivia.click();
		Thread.sleep(2000);
		
	}
	public void TriviaDropdownQuestionType() throws Exception {
		
		objIndexPage.checkboxBtnClkTrivia.click();
		objIndexPage.Drpquestiontxt.sendKeys(Helper.getData("Question Types", 8, 3));
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
		
		// Answer for above Questions 
		
		
//		String Answer1 = (Helper.getData("Question Types", 12, 7));
//		if (Answer1.equals("yes")) {
//			objIndexPage.AnswerDrpenterfirstoption.click();
//			
//		}
//
//		String Answer2 = (Helper.getData("Question Types", 12, 8));
//		if (Answer2.equals("yes")) {
//			objIndexPage.AnswerDrpentersecondoption.click();
//			
//		}
//	
		String Answer3 = (Helper.getData("Question Types", 12, 9));
		if (Answer3.equals("yes")) {
			objIndexPage.AnswerDrpenterThirdoption.click();
			
		}
//	
//		String Answer4 = (Helper.getData("Question Types", 12, 10));
//		if (Answer4.equals("yes")) {
//			
//			objIndexPage.AnswerDrpenterFourthoption.click();
//			
//		}
//	
//		String Answer5 = (Helper.getData("Question Types", 12, 11));
//		if (Answer5.equals("yes")) {
//			
//			objIndexPage.AnswerDrpenterFiveoption.click();
//			
//		}
//	
//		String Answer6 = (Helper.getData("Question Types", 12, 12));
//		if (Answer6.equals("yes")) {
//			
//			objIndexPage.AnswerDrpenterSixoption.click();
//			
//		}
//	
//		String Answer7 = (Helper.getData("Question Types", 12, 13));
//		if (Answer7.equals("yes")) {
//			
//			objIndexPage.AnswerDrpenterSevenoption.click();
//			
//		}
//	
//		String Answer8 = (Helper.getData("Question Types", 12, 14));
//		if (Answer8.equals("yes")) {
//			
//			objIndexPage.AnswerDrpenterEightoption.click();
//			
//		}
//	
//		String Answer9 = (Helper.getData("Question Types", 12, 15));
//		if (Answer9.equals("yes")) {
//			
//			objIndexPage.AnswerDrpenternineoption.click();
//			
//		}
//	
//		String Answer10 = (Helper.getData("Question Types", 12, 16));
//		if (Answer10.equals("yes")) {
//			
//			objIndexPage.AnswerDrpenterTenoption.click();
//			
//		}

		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("scroll(0, -100);");
		Thread.sleep(3000);
		objIndexPage.DrpallowcommentsTrivia.click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("scroll(0, 200);");
		objIndexPage.DrpSaveandNextBtnTrivia.click();
		Thread.sleep(2000);

				
	}
	public void TriviaImagePollQuestionType() throws Exception {
		

		objIndexPage.Imgpoll.click();
		objIndexPage.Imgquestiontxt.sendKeys(Helper.getData("Question Types", 19, 3));
		objIndexPage.selectImgquestiongroup(Helper.getData("Question Types", 19, 5));
		objIndexPage.selectImgnumberoptions(Helper.getData("Question Types", 19, 6));
		
		((JavascriptExecutor) driver).executeScript("scroll(0, -500);");
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

				Thread.sleep(2000);
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

				Thread.sleep(2000);
			}
		}

// Answer for above Questions 
		
		
//		String Answer1 = (Helper.getData("Question Types", 21, 21));
//		if (Answer1.equals("yes")) {
//			objIndexPage.ImgfirstRabiobx.click();
//			
//		}
//
//		String Answer2 = (Helper.getData("Question Types", 21, 23));
//		if (Answer2.equals("yes")) {
//			objIndexPage.ImgsecondTxtbx.click();
//			
//		}
//	
		String Answer3 = (Helper.getData("Question Types", 21, 25));
		if (Answer3.equals("yes")) {
			objIndexPage.ImgThirdTxtbxTrivia.click();
			
		}
//	
//		String Answer4 = (Helper.getData("Question Types", 21, 27));
//		if (Answer4.equals("yes")) {
//			
//			objIndexPage.ImgfourthTxtbx.click();
//			
//		}
//	
//		String Answer5 = (Helper.getData("Question Types", 21, 29));
//		if (Answer5.equals("yes")) {
//			
//			objIndexPage.ImgfiveTxtbx.click();
//			
//		}
//	
//		String Answer6 = (Helper.getData("Question Types", 21, 31));
//		if (Answer6.equals("yes")) {
//			
//			objIndexPage.ImgSixTxtbx.click();
//			
//		}
//	
//		String Answer7 = (Helper.getData("Question Types", 21, 33));
//		if (Answer7.equals("yes")) {
//			
//			objIndexPage.ImgsevenTxtbx.click();
//			
//		}
//	
//		String Answer8 = (Helper.getData("Question Types", 21, 35));
//		if (Answer8.equals("yes")) {
//			
//			objIndexPage.ImgEightTxtbx.click();
//			
//		}
//	
//		String Answer9 = (Helper.getData("Question Types", 21, 37));
//		if (Answer9.equals("yes")) {
//			
//			objIndexPage.ImgNineTxtbx.click();
//			
//		}
//	
//		String Answer10 = (Helper.getData("Question Types", 21, 39));
//		if (Answer10.equals("yes")) {
//			
//			objIndexPage.ImgTenTxtbx.click();
//			
//		}
		
		objIndexPage.ImgallowcommentsTrivia.click();
		EventFiringWebDriver eventfiringwebdriver = new EventFiringWebDriver(driver); 
		eventfiringwebdriver.executeScript("document.querySelector('#newquest').scrollTop=1000");
		objIndexPage.ImgaddquestionTrivia.click();
	}
	public void TriviaMultipleSelectDropdownQuestionType() throws Exception {
  		
  		objIndexPage.MultipleSelectdropdownTrivia.click();
		objIndexPage.Multiplequestiontxt.sendKeys(Helper.getData("Question Types", 25, 3));
		objIndexPage.selectMultiplequestiongroup(Helper.getData("Question Types", 25, 5));
		Thread.sleep(2000);
		objIndexPage.selectMultiplenumberoptions(Helper.getData("Question Types", 25, 6));
		int count = Integer.parseInt(Helper.getData("Question Types", 25, 6));
		if (count >= 1) {
			String option = Helper.getData("Question Types", 25, 7);
			if (option != "") {
				objIndexPage.Multipleenterfirstoption.sendKeys(Helper.getData("Question Types", 25, 7));
				Helper.takeScreenshot(driver);
				
				String Answer1 = (Helper.getData("Question Types", 27, 7));
				if (Answer1.equals("yes")) {
					
					objIndexPage.MultipleenterfirstoptionChk.click();
					
				}
			}
		}
		if (count >= 2) {
			String option = Helper.getData("Question Types", 25, 8);
			if (option != "") {
				objIndexPage.Multipleentersecondoption.sendKeys(Helper.getData("Question Types", 25, 8));
				Helper.takeScreenshot(driver);
//				String Answer2 = (Helper.getData("Question Types", 27, 8));
//				if (Answer2.equals("yes")) {
//					
//					objIndexPage.MultipleentersecondoptionChk.click();
//					
//				}
			}
		}
		if (count >= 3) {
			String option = Helper.getData("Question Types", 25, 9);
			if (option != "") {
				objIndexPage.MultipleenterThirdoption.sendKeys(Helper.getData("Question Types", 25, 9));
				Helper.takeScreenshot(driver);
//				String Answer3 = (Helper.getData("Question Types", 27, 9));
//				if (Answer3.equals("yes")) {
//					
//					objIndexPage.MultipleenterThirdoptionChk.click();
//					
//				}
			}
		}
		if (count >= 4) {
			String option = Helper.getData("Question Types", 25, 10);
			if (option != "") {
				objIndexPage.MultipleenterFourthoption.sendKeys(Helper.getData("Question Types", 25, 10));
				Helper.takeScreenshot(driver);
//				String Answer4 = (Helper.getData("Question Types", 27, 10));
//				if (Answer4.equals("yes")) {
//					
//					objIndexPage.MultipleenterFourthoptionChk.click();
//					
//				}
			}
		}
		if (count >= 5) {
			String option = Helper.getData("Question Types", 25, 11);
			if (option != "") {
				objIndexPage.MultipleenterFiveoption.sendKeys(Helper.getData("Question Types", 25, 11));
				Helper.takeScreenshot(driver);
//				String Answer5 = (Helper.getData("Question Types", 27, 11));
//				if (Answer5.equals("yes")) {
//					
//					objIndexPage.MultipleenterFiveoptionChk.click();
//					
//				}
			}
		}
		if (count >= 6) {
			String option = Helper.getData("Question Types", 25, 12);
			if (option != "") {
				objIndexPage.MultipleenterSixoption.sendKeys(Helper.getData("Question Types", 25, 12));
				Helper.takeScreenshot(driver);
//				String Answer6 = (Helper.getData("Question Types", 27, 12));
//				if (Answer6.equals("yes")) {
//					
//					objIndexPage.MultipleenterSixoptionChk.click();
//					
//				}
			}
		}
		if (count >= 7) {
			String option = Helper.getData("Question Types", 25, 13);
			if (option != "") {
				objIndexPage.MultipleenterSevenoption.sendKeys(Helper.getData("Question Types", 25, 13));
				Helper.takeScreenshot(driver);
//				String Answer7 = (Helper.getData("Question Types", 27, 13));
//				if (Answer7.equals("yes")) {
//					
//					objIndexPage.MultipleenterSevenoptionChk.click();
//					
//				}
			}
		}
		if (count >= 8) {
			String option = Helper.getData("Question Types", 25, 14);
			if (option != "") {
				objIndexPage.MultipleenterEightoption.sendKeys(Helper.getData("Question Types", 25, 14));
				Helper.takeScreenshot(driver);
//				String Answer8 = (Helper.getData("Question Types", 27, 14));
//				if (Answer8.equals("yes")) {
//					
//					objIndexPage.MultipleenterEightoptionChk.click();
//					
//				}
			}
		}
		if (count >= 9) {
			String option = Helper.getData("Question Types", 25, 15);
			if (option != "") {
				objIndexPage.Multipleenternineoption.sendKeys(Helper.getData("Question Types", 25, 15));
				Helper.takeScreenshot(driver);
//				String Answer9 = (Helper.getData("Question Types", 27, 15));
//				if (Answer9.equals("yes")) {
//					
//					objIndexPage.MultipleenternineoptionChk.click();
//					
//				}
			}
		}
		if (count >= 10) {
			String option = Helper.getData("Question Types", 25, 16);
			if (option != "") {
				objIndexPage.MultipleenterTenoption.sendKeys(Helper.getData("Question Types", 25, 16));
				Helper.takeScreenshot(driver);
//				String Answer10 = (Helper.getData("Question Types", 27, 16));
//				if (Answer10.equals("yes")) {
//					
//					objIndexPage.MultipleenterTenoptionChk.click();
//					
//				}
			}
		}

		objIndexPage.MultipleallowcommentsTrivia.click();
		objIndexPage.MultipleaddquestionTrivia.click();
		
	 
 }
	public void TriviaRadioButtonQuestionType() throws Exception {
    	
    	objIndexPage.RadioButtonTrivia.click();
    	objIndexPage.Radioquestiontxt.sendKeys(Helper.getData("Question Types", 37, 3));
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

// Answer for above Questions 
		
		
//		String Answer1 = (Helper.getData("Question Types", 39, 7));
//		if (Answer1.equals("yes")) {
//			objIndexPage.AnswerRadioenterfirstoption.click();
//			
//		}
//
//		String Answer2 = (Helper.getData("Question Types", 39, 8));
//		if (Answer2.equals("yes")) {
//			objIndexPage.AnswerRadioentersecondoption.click();
//			
//		}
//	
//		String Answer3 = (Helper.getData("Question Types", 39, 9));
//		if (Answer3.equals("yes")) {
//			objIndexPage.AnswerRadioenterThirdoption.click();
//			
//		}
//	
//		String Answer4 = (Helper.getData("Question Types", 39, 10));
//		if (Answer4.equals("yes")) {
//			
//			objIndexPage.AnswerRadioenterFourthoption.click();
//			
//		}
//	
//		String Answer5 = (Helper.getData("Question Types", 39, 11));
//		if (Answer5.equals("yes")) {
//			
//			objIndexPage.AnswerRadioenterFiveoption.click();
//			
//		}
//	
//		String Answer6 = (Helper.getData("Question Types", 39, 12));
//		if (Answer6.equals("yes")) {
//			
//			objIndexPage.AnswerRadioenterSixoption.click();
//			
//		}
//	
//		String Answer7 = (Helper.getData("Question Types", 39, 13));
//		if (Answer7.equals("yes")) {
//			
//			objIndexPage.AnswerRadioenterSevenoption.click();
//			
//		}
//	
//		String Answer8 = (Helper.getData("Question Types", 39, 14));
//		if (Answer8.equals("yes")) {
//			
//			objIndexPage.AnswerRadioenterEightoption.click();
//			
//		}
//	
		String Answer9 = (Helper.getData("Question Types", 39, 15));
		if (Answer9.equals("yes")) {
			
			objIndexPage.AnswerRadioenternineoption.click();
			
		}
//	
//		String Answer10 = (Helper.getData("Question Types", 39, 16));
//		if (Answer10.equals("yes")) {
//			
//			objIndexPage.AnswerRadioenterTenoption.click();
//			
//		}
    	((JavascriptExecutor) driver).executeScript("scroll(0, 300);");
    
    	objIndexPage.RadioallowcommentsTrivia.click();
    	

    	
		EventFiringWebDriver eventfiringwebdriver = new EventFiringWebDriver(driver); 
		eventfiringwebdriver.executeScript("document.querySelector('#newquest').scrollTop=1000");
		
		
		
    	objIndexPage.RadioaddquestionBtnTrivia.click();
    	
    }
    public void TriviaQuestionSaveAndNextBtn() throws Exception {

		objIndexPage.TriviasaveQuestionsBtn.click();
	}
    public void TriviaQuestionSaveAndDraft() throws Exception {

		objIndexPage.TriviasaveQuestionsSaveAndDraftBtn.click();
	}
    public void TriviaQuestionSaveAndPublish() throws Exception {

		objIndexPage.TriviasaveQuestionsSaveAndDraftDrpBtn.click();
		objIndexPage.TriviasaveQuestionsSaveAndPublishBtn.click();
	}

	// Trivia Logic Page

	public void TriviaQuestionLogicNextBtn() throws Exception {
		
		objIndexPage.QuestionlogicNextBtnTrivia.click();
	}

	// Trivia Preview and customize page

	public void TriviaPreviewPageSaveandNextBtn() throws Exception {

		objIndexPage.PreviewPageSaveandNextBtn.click();
	}
	public void TriviaPreviewPageSkipAndNextBtn() throws Exception {

		objIndexPage.TriviaPreviewPageSkipAndNextBtn.click();
	}
	public void TriviaPreviewAndCustomizeSaveAndPublish() throws Exception {

		objIndexPage.TriviaPreviewAndCustomizeSaveDrpBtn.click();
		objIndexPage.TriviaPreviewAndCustomizeSaveAndPublish.click();
	}
	public void TriviaPreviewAndCustomizeSkipAndPublish() throws Exception {

		objIndexPage.TriviaPreviewAndCustomizeSkipDrpBtn.click();
		objIndexPage.TriviaPreviewAndCustomizeSkipAndPublish.click();
	}
	

	// Trivia Reward Pages

	public void TriviaSinglwWinnerReward(int row) throws Exception {

		((JavascriptExecutor) driver).executeScript("scroll(0, 250);");
		Thread.sleep(2000);
		Helper.takeScreenshot(driver);
		objIndexPage.AddCriteriaBtn.click();
		
		objIndexPage.CriteriaNameTxtBx.sendKeys(Helper.getData("CreateTriviaQuiz", row, 23));
		objIndexPage.DeliveryDateTxtBx.sendKeys(Helper.getData("CreateTriviaQuiz", row, 24));
		objIndexPage.WinnerselectionDateTxtBx.sendKeys(Helper.getData("CreateTriviaQuiz", row, 25));
		objIndexPage.SelectionSingleWinnerDrpDwn(Helper.getData("CreateTriviaQuiz", row, 26));
		objIndexPage.StartDateTxtBx.sendKeys(Helper.getData("CreateTriviaQuiz", row, 27));
		objIndexPage.EndDateTxtBx.sendKeys(Helper.getData("CreateTriviaQuiz", row, 28));
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("scroll(0, 250);");

		objIndexPage.AddRewardsLnk.click();
		objIndexPage.CashTitleTxtBx.sendKeys(Helper.getData("CreateTriviaQuiz", row, 30));
		objIndexPage.CashCurrencyDrpDwn(Helper.getData("CreateTriviaQuiz", row, 31));
		objIndexPage.CashrewardamountTxtBx.sendKeys(Helper.getData("CreateTriviaQuiz", row, 32));
		objIndexPage.QuizCashDescription.sendKeys(Helper.getData("CreateTriviaQuiz", row, 33));
		((JavascriptExecutor) driver).executeScript("scroll(0, 1000);");
		objIndexPage.QuizAddBtn.click();
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("scroll(0, 1000);");
		objIndexPage.SaveCriteriaBtn.click();
		objIndexPage.QuizSingleSaveandPublishBtn.click();
		Thread.sleep(3000);

	}
	public void TriviaMultipleWinnerReward () throws Exception {
		
		objIndexPage.TriviamultipleWinnersTabBtn.click();
		objIndexPage.TriviamultipleCriteriaNameTxtBx.sendKeys((Helper.getData("CreateTriviaQuiz", row, 11)));
		objIndexPage.TriviamultipleNoOfWinnersTxtBx.sendKeys((Helper.getData("CreateTriviaQuiz", row, 12)));
		Thread.sleep(2000);
		objIndexPage.TriviamultipleUnlimitedChkBtn((Helper.getData("CreateTriviaQuiz", row, 13)));
		
		String unlimited = Helper.getData("CreateTriviaQuiz", row, 13);

		if (unlimited.contains("yes")) {
			objIndexPage.TriviaExceptedNoOfWinners.sendKeys((Helper.getData("CreateTriviaQuiz", row, 12)));
		}
		else
		{
			
		}
		Thread.sleep(2000);
 	    objIndexPage.TriviamultipleAutoSelectBtn((Helper.getData("CreateTriviaQuiz", row, 14)));
 	 		    
		Thread.sleep(2000);
		objIndexPage.TriviamultipleWinnerSelectionDate.sendKeys((Helper.getData("CreateTriviaQuiz", row, 15)));
		
			
		objIndexPage.multipleSelectionDrpDwn((Helper.getData("CreateTriviaQuiz", row, 17)));
		
		
		String SelectionType = Helper.getData("CreateTriviaQuiz", row, 17);

		if (SelectionType.contains("Every")) {
			
			objIndexPage.multiplePeriodicWinnerCountTxtBx.sendKeys((Helper.getData("CreateTriviaQuiz", row, 16)));
			Thread.sleep(2000);
			
			objIndexPage.multipleTotalParticipantsTxtBx.sendKeys((Helper.getData("CreateTriviaQuiz", row, 18)));
			Thread.sleep(2000);
			objIndexPage.multipleDurationDrpDwn((Helper.getData("CreateTriviaQuiz", row, 19)));
			objIndexPage.multipleNoOfTextBx.sendKeys((Helper.getData("CreateTriviaQuiz", row, 20)));
			Thread.sleep(2000);
			objIndexPage.multipleSelectPeriodDrpDwn((Helper.getData("CreateTriviaQuiz", row, 21)));
			Thread.sleep(2000);
			objIndexPage.multipleExcludePeriodsChkBtn((Helper.getData("CreateTriviaQuiz", row, 22)));
			objIndexPage.multipleStartDate.sendKeys(Helper.getData("CreateTriviaQuiz", row, 23));
			objIndexPage.multiplEendDate.sendKeys(Helper.getData("CreateTriviaQuiz", row, 24));
			objIndexPage.multipleRewardsDeliveryDays.sendKeys(Helper.getData("CreateTriviaQuiz", row, 25));
			objIndexPage.multipleAddRewardsBtn.click();
			
		} else if (SelectionType.contains("All Event")) {
			
			objIndexPage.multipleStartDate.sendKeys(Helper.getData("CreateTriviaQuiz", row, 23));
			objIndexPage.multiplEendDate.sendKeys(Helper.getData("CreateTriviaQuiz", row, 24));
			objIndexPage.multipleRewardsDeliveryDays.sendKeys(Helper.getData("CreateTriviaQuiz", row, 25));
			objIndexPage.multipleAddRewardsBtn.click();
		} else {
			
			objIndexPage.multiplePeriodicWinnerCountTxtBx.sendKeys((Helper.getData("CreateTriviaQuiz", row, 16)));
			Thread.sleep(2000);
			
			objIndexPage.multipleTotalParticipantsTxtBx.sendKeys((Helper.getData("CreateTriviaQuiz", row, 18)));
			Thread.sleep(2000);
			objIndexPage.multipleDurationDrpDwn((Helper.getData("CreateTriviaQuiz", row, 19)));
			objIndexPage.multipleNoOfTextBx.sendKeys((Helper.getData("CreateTriviaQuiz", row, 20)));
			Thread.sleep(2000);
			objIndexPage.multipleSelectPeriodDrpDwn((Helper.getData("CreateTriviaQuiz", row, 21)));
			Thread.sleep(2000);
			objIndexPage.multipleStartDate.sendKeys(Helper.getData("CreateTriviaQuiz", row, 23));
			objIndexPage.multiplEendDate.sendKeys(Helper.getData("CreateTriviaQuiz", row, 24));
			objIndexPage.multipleRewardsDeliveryDays.sendKeys(Helper.getData("CreateTriviaQuiz", row, 25));
			objIndexPage.multipleAddRewardsBtn.click();
		}
		
		
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("scroll(0, 700);");
		
		String Rewards = (Helper.getData("CreateTriviaQuiz", row, 26));
		
	if (Rewards.contains("Cash"))
		{
			
		// Rewards Cash tab details for Multiple winner
		Helper.takeScreenshot(driver);
		objIndexPage.CashTitleTxtBx.sendKeys(Helper.getData("CreateTriviaQuiz", row, 27));
		objIndexPage.CashAmountDrpDwn(Helper.getData("CreateTriviaQuiz", row, 28));
		objIndexPage.CashRewardAmountTxtBx.sendKeys(Helper.getData("CreateTriviaQuiz", row, 29));
		objIndexPage.CashRewardDescriptionTxtBx.sendKeys(Helper.getData("CreateTriviaQuiz", row, 30));
		objIndexPage.CashRewardAddBtn.click();
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("scroll(0, 1000);");
		objIndexPage.CashRewardSaveCriteriaBtn.click();
		objIndexPage.RewardSaveAndPublishBtn.click();
		
	} else if (Rewards.contains("Points"))
	{
		objIndexPage.multiplePointsTab.click();
		objIndexPage.multiplePointsTitleTxt.sendKeys(Helper.getData("CreateTriviaQuiz", row, 31));
		objIndexPage.multipleRewardsPointsTxt.sendKeys(Helper.getData("CreateTriviaQuiz", row, 32));
		objIndexPage.multiplePointscanredeemChkBtn.sendKeys(Helper.getData("CreateTriviaQuiz", row, 33));
		objIndexPage.multiplePonitsDescriptionTxt.sendKeys(Helper.getData("CreateTriviaQuiz", row, 34));
		objIndexPage.multiplePointsAddBtn.click();
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("scroll(0, 1000);");
		objIndexPage.multipleSavecriteria.click();
		objIndexPage.RewardSaveAndPublishBtn.click();
		
	} else 
		
	{
		objIndexPage.multipleProductsTab.click();
		objIndexPage.multipleProductsTitleTxt.sendKeys(Helper.getData("CreateTriviaQuiz", row, 35));
		objIndexPage.multipleProductNameTxt.sendKeys(Helper.getData("CreateTriviaQuiz", row, 36));
		objIndexPage.multipleProductQuantityTxt.sendKeys(Helper.getData("CreateTriviaQuiz", row, 37));
		objIndexPage.multipleProductValueTxt.sendKeys(Helper.getData("CreateTriviaQuiz", row, 38));
		objIndexPage.multipleDescriptionTxt.sendKeys(Helper.getData("CreateTriviaQuiz", row, 39));
		objIndexPage.SinglePointOnlineAndOffline(Helper.getData("CreateTriviaQuiz", row, 40));
		
		/*String OffOnline = (Helper.getData("CreateTriviaQuiz", row, 40));

		if (OffOnline.contains("Offline")) {
			
			objIndexPage.SingleWinnerofflineCountryDrpDwn(Helper.getdataSurveyRewardSingleMultiple("CreateTriviaQuiz", row, 32));
			objIndexPage.SingleWinnerOfflineamount.sendKeys(Helper.getdataSurveyRewardSingleMultiple("CreateTriviaQuiz", row, 33));
			objIndexPage.SingleProductAddBtn.click();
			
			Thread.sleep(5000);
			((JavascriptExecutor) driver).executeScript("scroll(0, 1000);");
			objIndexPage.CashRewardSaveCriteriaBtn.click();
			objIndexPage.RewardSaveAndPublishBtn.click();
		}
		else
		{
			objIndexPage.SingleProductAddBtn.click();
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("scroll(0, 1000);");
			objIndexPage.CashRewardSaveCriteriaBtn.click();
			objIndexPage.RewardSaveAndPublishBtn.click();
		}*/
	}
	}
	public void TriviaRewardsSaveAndPublish() throws Exception {

		objIndexPage.TriviaRewardsSaveAndPublish.click();
		
	}
	public void TriviaRewardsSkipAndPublish() throws Exception {

		objIndexPage.TriviaRewardsSkipDrpBtn.click();
		objIndexPage.TriviaRewardsSkipAndPublish.click();
		
	}
}
