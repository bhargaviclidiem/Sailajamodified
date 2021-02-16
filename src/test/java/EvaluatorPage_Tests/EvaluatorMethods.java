package EvaluatorPage_Tests;

import java.util.ArrayList;
import java.util.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import HomePage_PageObject.HomePage;
import HomePage_PageObject.IndexPages;
import HomePage_PageObject.LoginPage;
import QuizPage_PageObject.CreateQuizPage;
import SurveyPage_PageObjects.SurveyQuestionsPage;
import SurveyPage_PageObjects.CreateSurveyQuestionsPage;
import utilityLibrary.Helper;

public class EvaluatorMethods {

	WebDriver driver;
	LoginPage objLoginPage;
	HomePage objHomePage;
	IndexPages objIndexPage;
	SurveyQuestionsPage objCreateSurveyPage;
	CreateSurveyQuestionsPage objCreateSurveyQuestionsPage;
	JavascriptExecutor js;
	CreateQuizPage objCreateQuizPage;

	// Methods

	public void LoginEvaluator() throws Exception {
		// Open the application under test
		driver = Helper.openAUT(driver);
		objLoginPage = new LoginPage(driver);
		objHomePage = new HomePage(driver);
		objIndexPage = new IndexPages(driver);
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
		objIndexPage.EvaluatorLnk.click();
		Thread.sleep(2000);
		objIndexPage.CreateEvaluatorLnk.click();
		Thread.sleep(2000);

	}
	public void CloseWindow() throws Exception {
//		driver.close();
		driver.quit();
	}
	public void Screenshot() throws Exception {
		Helper.takeScreenshot(driver);
	}
	public void FourQuestionTypeDefault() throws Exception {
		
		//objIndexPage.QuizsaveQuestionsBtn.click();
		Thread.sleep(2000);
		objIndexPage.QuizQuestionDropDwn(Helper.getData("CreateGeneralQuiz", 2, 21));
		Thread.sleep(2000);
		objIndexPage.SelectallBtn.click();
		Thread.sleep(2000);
		objIndexPage.DoneBtn.click();
		Thread.sleep(50000);
		objIndexPage.QuizQuestionSaveandNextBtn.click();
		Thread.sleep(5000);
		objIndexPage.QuestionlogicNextBtn.click();
		Thread.sleep(5000);
		objIndexPage.PreviewPageSaveandNextBtn.click();
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("scroll(0, 250);");
		objIndexPage.AddCriteriaBtn.click();
	}
    public void AddQuestionGrop() throws Exception {

		objIndexPage.checkboxBtnClk.click();
		objIndexPage.checkbxquestiongroup.click();
		objIndexPage.AddNewGroup.click();
		objIndexPage.NewGroupName.sendKeys(Helper.getData("Question Type", 2, 5));
		objIndexPage.AddNewGroupAddBtn.click();
		objIndexPage.AddNewGroupCloseBtn.click();

	}
    public void EvaluatorDetailPage(int row) throws Exception {
		
		//objIndexPage.QuizImage.sendKeys(Helper.getData("CreateGeneralQuiz", row , 2));
		((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
		Thread.sleep(3000);
		Helper.takeScreenshot(driver);
		//objIndexPage.QuizImageCrop.click();
		Thread.sleep(3000);
		
		objIndexPage.QuizDurationTypeDrpDwn(Helper.getData("CreateGeneralQuiz", row , 5));
		
		String QuizDurationType = (Helper.getData("CreateGeneralQuiz", row , 5));
		
		if (QuizDurationType.equals("With Duration")){
		
		objIndexPage.QuizName.sendKeys(Helper.getData("CreateGeneralQuiz", row , 7));
		objIndexPage.QuizDescription.sendKeys(Helper.getData("CreateGeneralQuiz", row , 8));

		objIndexPage.QuizDuration(Helper.getData("CreateGeneralQuiz", row , 9));

		((JavascriptExecutor) driver).executeScript("scroll(0, 800);");

		String Radionbutton = Helper.getData("CreateGeneralQuiz", row , 9);

		if (Radionbutton.contains("Total")) {

			objIndexPage.TotalDurationTxtBx.sendKeys(Helper.getData("CreateGeneralQuiz", row , 10));

		} else if (Radionbutton.contains("Equal"))

		{
			objIndexPage.EqualDurationTxtBx.sendKeys(Helper.getData("CreateGeneralQuiz", row , 11));
		} else {
		}

		objIndexPage.weightageRadioBtn(Helper.getData("CreateGeneralQuiz", row , 12));

		String weightage = Helper.getData("CreateGeneralQuiz", row , 12);

		if (weightage.contains("Equal")) {

			objIndexPage.EqualWeightageTxtBx.sendKeys(Helper.getData("CreateGeneralQuiz", row , 13));

		} else {
		}
		}
		else 
		{
			// Below is the Without Duration 
			objIndexPage.QuizName.sendKeys(Helper.getData("CreateGeneralQuiz", row , 7));
			objIndexPage.QuizDescription.sendKeys(Helper.getData("CreateGeneralQuiz", row , 8));
			objIndexPage.QuizWithoutExpireDays.sendKeys(Helper.getData("CreateGeneralQuiz", row , 15));
			
			objIndexPage.weightageRadioBtn(Helper.getData("CreateGeneralQuiz", row , 12));

			String weightage = Helper.getData("CreateGeneralQuiz", row , 12);

			if (weightage.contains("Equal")) {

				objIndexPage.EqualWeightageTxtBx.sendKeys(Helper.getData("CreateGeneralQuiz", row , 13));

			} 
			
		}
		objIndexPage.NextQuizDetailBtn.click();
	}
    public void CheckBoxQuestionWithDuration(int row) throws Exception {

			
		Thread.sleep(2000);
		objIndexPage.checkboxBtnClk.click();
		objIndexPage.Chkquestiontxt.sendKeys(Helper.getData("Question Types", 2, 3));
		
		String weightage = Helper.getData("CreateGeneralQuiz", row , 12);

		if (weightage.contains("Individual")) {

			objIndexPage.IndividualWeightageTxtBx.sendKeys(Helper.getData("CreateGeneralQuiz", row , 13));

		}
		
		String Radionbutton = Helper.getData("CreateGeneralQuiz", row , 9);

		if (Radionbutton.contains("Individual")) {
			
			objIndexPage.IndividualDurationTxtBx.sendKeys(Helper.getData("CreateGeneralQuiz", row , 10));
			
		}
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
		objIndexPage.chkbxallowcommentsEvaluator.click();
		Thread.sleep(2000);
		objIndexPage.chkbxaddquestionEvaluator.click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("scroll(0, 3000);");
		Thread.sleep(3000);
	}
	public void CheckBoxQuestionWithOutDuration(int row) throws Exception {

		Thread.sleep(2000);
		objIndexPage.checkboxBtnClk.click();
		objIndexPage.Chkquestiontxt.sendKeys(Helper.getData("Question Types", 2, 3));
		
		String weightage = Helper.getData("CreateGeneralQuiz", row , 12);

		if (weightage.contains("Individual")) {

			objIndexPage.IndividualWeightageTxtBx.sendKeys(Helper.getData("CreateGeneralQuiz", row , 13));

		}
		
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
		objIndexPage.chkbxallowcommentsEvaluator.click();
		Thread.sleep(2000);
		objIndexPage.chkbxaddquestionEvaluator.click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("scroll(0, 3000);");
		Thread.sleep(3000);
	}
	public void DateQuestion() throws Exception {

		objIndexPage.DateLnk.click();
		objIndexPage.DateQuestiontxt.sendKeys(Helper.getData("Question Types", 5, 3));
		((JavascriptExecutor) driver).executeScript("scroll(0, 0);");
		objIndexPage.selectDatebxquestiongroup(Helper.getData("Question Types", 5, 5));
		objIndexPage.DateLabelTxt.sendKeys(Helper.getData("Question Types", 5, 17));
		((JavascriptExecutor) driver).executeScript("scroll(0, 250);");
		objIndexPage.DatebxallowcommentsEvaluator.click();
		objIndexPage.DatebxaddquestionEvaluator.click();
		Thread.sleep(2000);
	}
	
	public void MouseHoverQuestionType() throws Exception {
		// Actions action = new Actions(driver);
		// WebElement we =
		// driver.findElement(By.xpath("//*[@id='profile1']/div/div[2]"));
		// action.moveToElement(we).build().perform();

		WebElement element = driver.findElement(By.xpath("//*[@id='profile1']/div/div[2]"));

		// ((JavascriptExecutor)driver).executeScript(".scrollIntoView();",
		// element);
		((JavascriptExecutor) driver).executeScript("scroll(0, 800);", element);

	}
	public void DropdownWithoutWeightageQuestion() throws Exception {

		objIndexPage.DropdownLnk.click();
		objIndexPage.Drpquestiontxt.sendKeys(Helper.getData("Question Types", 8, 3));
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

		objIndexPage.DrpallowcommentsEvaluator.click();
		objIndexPage.Drpshowquestions.click();

	}
	
	public void FileUploadQuestion() throws Exception {

		objIndexPage.Fileupload.click();
		objIndexPage.Filequestiontxt.sendKeys(Helper.getData("Question Types", 13, 3));
		objIndexPage.selectFilequestiongroup(Helper.getData("Question Types", 13, 5));
		objIndexPage.FileLabelText.sendKeys(Helper.getData("Question Types", 13, 17));
		objIndexPage.FileallowcommentsEvaluator.click();
		objIndexPage.Fileaddquestion.click();

	}
	
	public void GroupScalingQuestion() throws Exception {

		objIndexPage.GroupscalingBtn.click();
		objIndexPage.Groupquestiontxt.sendKeys(Helper.getData("Question Types", 16, 3));
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

		EventFiringWebDriver eventfiringwebdriver = new EventFiringWebDriver(driver);
		eventfiringwebdriver.executeScript("document.querySelector('#newquest').scrollTop=250");

				
		objIndexPage.GrpallowcommentsEvaluator.click();
		objIndexPage.GrpaddquestionEvaluator.click();

	}
	
	public void ImagePollQuestion() throws Exception {
		
		objIndexPage.Imgpoll.click();
		objIndexPage.Imgquestiontxt.sendKeys(Helper.getData("Question Types", 19, 3));
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
//				objIndexPage.ImgfirstRabiobx.sendKeys(Helper.getData("Question Types", 19, 22));
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
//				Thread.sleep(3000);
//				objIndexPage.ImgsecondTxtbx.sendKeys(Helper.getData("Question Types", 19, 24));
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
//				Thread.sleep(3000);
//				objIndexPage.ImgThirdTxtbx.sendKeys(Helper.getData("Question Types", 19, 26));
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
//				Thread.sleep(3000);
//				objIndexPage.ImgfourthTxtbx.sendKeys(Helper.getData("Question Types", 19, 28));
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
//				Thread.sleep(3000);
//				objIndexPage.ImgfiveTxtbx.sendKeys(Helper.getData("Question Types", 19, 30));
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
//				Thread.sleep(3000);
//				objIndexPage.ImgSixTxtbx.sendKeys(Helper.getData("Question Types", 19, 32));
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
//				Thread.sleep(3000);
//				objIndexPage.ImgsevenTxtbx.sendKeys(Helper.getData("Question Types", 19, 34));
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
//				Thread.sleep(3000);
//				objIndexPage.ImgEightTxtbx.sendKeys(Helper.getData("Question Types", 19, 36));
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
//				Thread.sleep(3000);
//				objIndexPage.ImgNineTxtbx.sendKeys(Helper.getData("Question Types", 19, 38));
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
//				Thread.sleep(3000);
//				objIndexPage.ImgTenTxtbx.sendKeys(Helper.getData("Question Types", 19, 40));
				Thread.sleep(2000);
			}
		}
		
		objIndexPage.ImgallowcommentsEvaluator.click();
		objIndexPage.ImgaddquestionEvaluator.click();
		
			
	}
	
public void MultipleSelectDropdownQuestion() throws Exception {
  		
  		objIndexPage.MultipleSelectdropdown.click();
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
		objIndexPage.MultipleallowcommentsEvaluator.click();
		objIndexPage.Multipleaddquestion.click();
		
	 
 }
	
public void MultipleTextBoxesQuestion() throws Exception {
		
	objIndexPage.MultipleTextboxes.click();
	objIndexPage.MultipleTextquestiontxt.sendKeys(Helper.getData("Question Types", 28, 3));
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

	EventFiringWebDriver eventfiringwebdriver = new EventFiringWebDriver(driver);
	eventfiringwebdriver.executeScript("document.querySelector('#newquest').scrollTop=400");
	
	objIndexPage.MultipleTextallowcommentsEvaluator.click();
	objIndexPage.MultipleTextaddquestion.click();

	 	}

public void NumberQuestion() throws Exception {
		
	objIndexPage.NumberBtn.click();
	objIndexPage.Numberquestiontxt.sendKeys(Helper.getData("Question Types", 34, 3));
	objIndexPage.selectNumberquestiongroup(Helper.getData("Question Types", 34, 5));
	objIndexPage.NumberLabelText.sendKeys(Helper.getData("Question Types", 34, 17));
	objIndexPage.NumberallowcommentsEvaluator.click();
	objIndexPage.Numberaddquestion.click();

 	}

public void PictionaryQuestion() throws Exception {
		
	 objIndexPage.ImgwithText.click();
	 objIndexPage.ImgTextquestiontxt.sendKeys(Helper.getData("Question Types", 22, 3));
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
		
		EventFiringWebDriver eventfiringwebdriver = new EventFiringWebDriver(driver);
		eventfiringwebdriver.executeScript("document.querySelector('#newquest').scrollTop=250");
		objIndexPage.ImgTextallowcommentsEvaluator.click();
		objIndexPage.ImgTextaddquestion.click();
	 
}

public void RadioButtonQuestion() throws Exception {
	
	objIndexPage.RadioButton.click();
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

	((JavascriptExecutor) driver).executeScript("scroll(0, 800);");

	objIndexPage.RadioallowcommentsEvaluator.click();
	objIndexPage.RadioaddquestionBtn.click();
	
}

public void ScaleRateQuestion() throws Exception {
	
	objIndexPage.ScaleRateTabClk.click();
	objIndexPage.Scalequestiontxt.sendKeys(Helper.getData("Question Types", 40, 3));
	objIndexPage.selectScalequestiongroup(Helper.getData("Question Types", 40, 5));
	objIndexPage.ScaleLabelText.sendKeys(Helper.getData("Question Types", 40, 17));
	objIndexPage.Scaleallowcomments.click();
	objIndexPage.Scaleaddquestion.click();
	
}

public void SingleLineTextQuestion() throws Exception {
	
	objIndexPage.SinglelineText.click();
	objIndexPage.Singlelinequestiontxt.sendKeys(Helper.getData("Question Types", 43, 3));
	objIndexPage.selectSinglelinequestiongroup(Helper.getData("Question Types", 43, 5));
	objIndexPage.SinglelineLabelText.sendKeys(Helper.getData("Question Types", 43, 17));
	objIndexPage.Singlelineallowcomments.click();
	objIndexPage.Singlelineaddquestion.click();

}

public void TextAreaQuestion() throws Exception {
   	
	objIndexPage.TextArea.click();
	objIndexPage.Textareaquestiontxt.sendKeys(Helper.getData("Question Types", 46, 3));
	objIndexPage.selectTextareaquestiongroup(Helper.getData("Question Types", 46, 5));
	objIndexPage.TextareaLabelText.sendKeys(Helper.getData("Question Types", 46, 17));
	objIndexPage.Textareaallowcomments.click();
	objIndexPage.Textareaaddquestion.click();
	Thread.sleep(2000);

}

public void YesOrNoQuestion() throws Exception {
   	
    objIndexPage.YesorNo.click();
	objIndexPage.Yesquestiontxt.sendKeys(Helper.getData("Question Types", 49, 3));
	objIndexPage.selectYesquestiongroup(Helper.getData("Question Types", 49, 5));
	objIndexPage.YesLabelText.sendKeys(Helper.getData("Question Types", 49, 17));
	objIndexPage.Yesallowcomments.click();
	objIndexPage.Yesaddquestion.click();
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


// Question Page Methods

	public void QuestionPageSaveAndNextBtn() throws Exception {
		((JavascriptExecutor) driver).executeScript("scroll(0, 800);");
		objCreateSurveyQuestionsPage.EvaluatorQuestoinSaveNextBtn.click();
	}
	
	public void QuestionPageSaveDraftAndPublish() throws Exception {
		
		objCreateSurveyQuestionsPage.EvaluatorQuestoinSaveASDraft.click();
		objCreateSurveyQuestionsPage.EvaluatorQuestoinSaveAndPublish.click();
	}
	
	// Question Logic Page Methods

	public void QuestionLogicPageSaveAndNextBtn() throws Exception {
		
			objCreateSurveyQuestionsPage.questionLogicNextBtnEvaluator.click();
		}
	
	public void EvaluatorQuestionLogicPageSaveAndNextBtn() throws Exception {
		
		objCreateSurveyQuestionsPage.questionLogicNextBtnEvaluator.click();
	}
		
		// Preview and Customize Page Methods
		
	public void PreviewAndCustomizePageNextBtn() throws Exception {
		((JavascriptExecutor) driver).executeScript("scroll(0, 1000);");
			objCreateSurveyQuestionsPage.PreviewAndCustomizeNextBtnEvaluator.click();
		}
	
	public void PreviewAndCustomizePageSaveDraftAndPublish() throws Exception {
		
		objCreateSurveyQuestionsPage.PreviewAndCustomizeSaveAsDraftEvaluator.click();
		objCreateSurveyQuestionsPage.PreviewAndCustomizeSaveAndPublishEvaluator.click();
		
	}
		
	public void SingleWinnerReward() throws Exception {
		
		((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
		Thread.sleep(2000);
		objIndexPage.AddCriteriaBtn.click();
		Thread.sleep(2000);
		objIndexPage.CriteriaNameTxtBx.sendKeys(Helper.getData("CreateGeneralQuiz", 2, 23));
		objIndexPage.DeliveryDateTxtBx.sendKeys(Helper.getData("CreateGeneralQuiz", 2, 24));
		objIndexPage.WinnerselectionDateTxtBx.sendKeys(Helper.getData("CreateGeneralQuiz", 2, 25));
		objIndexPage.SelectionSingleWinnerDrpDwn(Helper.getData("CreateGeneralQuiz", 2, 26));
		objIndexPage.StartDateTxtBx.sendKeys(Helper.getData("CreateGeneralQuiz", 2, 27));
		objIndexPage.EndDateTxtBx.sendKeys(Helper.getData("CreateGeneralQuiz", 2, 28));
		Thread.sleep(3000);
		objIndexPage.AddRewardsLnkEvaluator.click();
		((JavascriptExecutor) driver).executeScript("scroll(0, 1000);");
	
		objIndexPage.CashTitleTxtBx.sendKeys(Helper.getData("CreateGeneralQuiz", 2, 30));
		objIndexPage.CashCurrencyDrpDwn(Helper.getData("CreateGeneralQuiz", 2, 31));
		objIndexPage.CashrewardamountTxtBx.sendKeys(Helper.getData("CreateGeneralQuiz", 2, 32));
		objIndexPage.QuizCashDescription.sendKeys(Helper.getData("CreateGeneralQuiz", 2, 33));
		objIndexPage.QuizAddBtn.click();
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("scroll(0, 1000);");
		objIndexPage.SaveCriteriaBtn.click();
		Thread.sleep(2000);
		objIndexPage.QuizSingleSaveandPublishBtn.click();
		Thread.sleep(7000);
		
	}
	
	public void TriviaSingleWinner(int row) throws Exception {

//		ExtentTestManager.getTest().setDescription("Trivia question");
	
		Thread.sleep(3000);
		objIndexPage.QuizImage.sendKeys(Helper.getData("CreateTriviaQuiz", row, 2));
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
		Thread.sleep(3000);
		Helper.takeScreenshot(driver);
		objIndexPage.QuizImageCrop.click();
		Thread.sleep(3000);
		
//		WebElement UploadImg =driver.findElement(By.xpath("//*[@id='filedocumentname']"));
//		UploadImg.sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Lighthouse.jpg");
//		((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
//		Thread.sleep(5000);
//		objIndexPage.QuizImageCrop.click();
//		Thread.sleep(3000);
		
		objIndexPage.GeneralQuizAndTrivia(Helper.getData("CreateTriviaQuiz", row, 3));

		String GeneralQuizAndTrivia = Helper.getData("CreateTriviaQuiz", row, 3);

		if (GeneralQuizAndTrivia.contains("General Quiz")) {
			
			Thread.sleep(3000);

			objIndexPage.QuizDurationTypeDrpDwn(Helper.getData("CreateTriviaQuiz", row, 5));
			objIndexPage.QuizName.sendKeys(Helper.getData("CreateTriviaQuiz", row, 7));
			objIndexPage.QuizDescription.sendKeys(Helper.getData("CreateTriviaQuiz", row, 8));

			objIndexPage.QuizDuration(Helper.getData("CreateTriviaQuiz", row, 9));

			((JavascriptExecutor) driver).executeScript("scroll(0, 800);");

			String Radionbutton = Helper.getData("CreateTriviaQuiz", row, 9);

			if (Radionbutton.contains("Total")) {

				objIndexPage.TotalDurationTxtBx.sendKeys(Helper.getData("CreateTriviaQuiz", row, 10));

			} else if (Radionbutton.contains("Equal"))

			{
				objIndexPage.EqualDurationTxtBx.sendKeys(Helper.getData("CreateTriviaQuiz", row, 11));
			} else {
			}

			objIndexPage.weightageRadioBtn(Helper.getData("CreateTriviaQuiz", row, 12));

			String weightage = Helper.getData("CreateTriviaQuiz", row, 12);

			if (weightage.contains("Equal")) {

				objIndexPage.EqualWeightageTxtBx.sendKeys(Helper.getData("CreateTriviaQuiz", row, 13));

			} else {	}

			objIndexPage.NextQuizDetailBtn.click();
			//objIndexPage.QuizsaveQuestionsBtn.click();
			Thread.sleep(2000);
			objIndexPage.QuizQuestionDropDwn(Helper.getData("CreateTriviaQuiz", row, 21));
			Thread.sleep(2000);
			objIndexPage.SelectallBtn.click();
			Thread.sleep(2000);
			objIndexPage.DoneBtn.click();
			Thread.sleep(50000);
			objIndexPage.QuizQuestionSaveandNextBtn.click();
			Thread.sleep(5000);
			objIndexPage.QuestionlogicNextBtn.click();
			Thread.sleep(5000);
			objIndexPage.PreviewPageSaveandNextBtn.click();
			Thread.sleep(3000);
			((JavascriptExecutor) driver).executeScript("scroll(0, 250);");
			objIndexPage.AddCriteriaBtn.click();

			// Single Winner Rewards

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
			objIndexPage.QuizAddBtn.click();
			Thread.sleep(3000);
			((JavascriptExecutor) driver).executeScript("scroll(0, 1000);");
			objIndexPage.SaveCriteriaBtn.click();
			objIndexPage.QuizSingleSaveandPublishBtn.click();
			Thread.sleep(7000);
		}

		// Trivia start now

		else {

			objIndexPage.QuizNameTxtBx.sendKeys(Helper.getData("CreateTriviaQuiz", row, 7));
			objIndexPage.QuizTrivaDescriptionTxtBx.sendKeys(Helper.getData("CreateTriviaQuiz", row, 8));
			objIndexPage.TrivaEqualDurationTxtBx.sendKeys(Helper.getData("CreateTriviaQuiz", row, 11));
			objIndexPage.TrivaEqualWeightageTxtBx.sendKeys(Helper.getData("CreateTriviaQuiz", row, 13));
			objIndexPage.NegativeWeightageTxtBx.sendKeys(Helper.getData("CreateTriviaQuiz", row, 14));

			objIndexPage.NextQuizDetailBtn.click();
			//objIndexPage.QuizsaveQuestionsBtn.click();
			Thread.sleep(2000);
			objIndexPage.QuizQuestionDropDwn(Helper.getData("CreateTriviaQuiz", row, 21));
			Thread.sleep(2000);
			objIndexPage.SelectallBtn.click();
			objIndexPage.DoneBtn.click();
			Thread.sleep(2000);
			objIndexPage.QuizQuestionSaveandNextBtn.click();
			Thread.sleep(5000);
			objIndexPage.QuestionlogicNextBtn.click();
			Thread.sleep(10000);
			objIndexPage.PreviewPageSaveandNextBtn.click();
			Thread.sleep(10000);
			((JavascriptExecutor) driver).executeScript("scroll(0, 250);");
			objIndexPage.AddCriteriaBtn.click();

			// Single Winner Rewards

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
			objIndexPage.QuizAddBtn.click();
			Thread.sleep(3000);
			((JavascriptExecutor) driver).executeScript("scroll(0, 1000);");
			objIndexPage.SaveCriteriaBtn.click();
			objIndexPage.QuizSingleSaveandPublishBtn.click();
			Thread.sleep(3000);
			
			

		}
	}
	
	// Test Cases

//	@Test(description = "Evaluator WithDuration TotalD Equal with SingleWinner", groups = { "Sanity" })
	public void TestCase201_Evaluator_WithDuration_TotalID_Equal_SingleWinner() throws Exception {

//		ExtentTestManager.getTest().setDescription("Create Evaluator with Single Winner");

//		this.LoginEvaluator();
//		this.EvaluatorDetailPage();
//		this.CheckBoxQuestion();

		

//		objIndexPage.GeneralQuizAndTrivia(Helper.getData("CreateGeneralQuiz", 2, 3));
//
//		String GeneralQuizAndTrivia = Helper.getData("CreateGeneralQuiz", 2, 3);
//
//		if (GeneralQuizAndTrivia.contains("General Quiz")) {

			


			// Single Winner Rewards

			
//		}

		// Trivia start now

//		else {
//
//			objIndexPage.QuizNameTxtBx.sendKeys(Helper.getData("CreateGeneralQuiz", 2, 7));
//			objIndexPage.QuizTrivaDescriptionTxtBx.sendKeys(Helper.getData("CreateGeneralQuiz", 2, 8));
//			objIndexPage.TrivaEqualDurationTxtBx.sendKeys(Helper.getData("CreateGeneralQuiz", 2, 11));
//			objIndexPage.TrivaEqualWeightageTxtBx.sendKeys(Helper.getData("CreateGeneralQuiz", 2, 13));
//			objIndexPage.NegativeWeightageTxtBx.sendKeys(Helper.getData("CreateGeneralQuiz", 2, 14));
//
//			objIndexPage.NextQuizDetailBtn.click();
//			objIndexPage.QuizsaveQuestionsBtn.click();
//			Thread.sleep(2000);
//			objIndexPage.QuizQuestionDropDwn(Helper.getData("CreateGeneralQuiz", 2, 21));
//			Thread.sleep(2000);
//			objIndexPage.SelectallBtn.click();
//			objIndexPage.DoneBtn.click();
//			Thread.sleep(2000);
//			objIndexPage.QuizQuestionSaveandNextBtn.click();
//			Thread.sleep(5000);
//			objIndexPage.QuestionlogicNextBtn.click();
//			Thread.sleep(10000);
//			objIndexPage.PreviewPageSaveandNextBtn.click();
//			Thread.sleep(10000);
//			((JavascriptExecutor) driver).executeScript("scroll(0, 250);");
//			objIndexPage.AddCriteriaBtn.click();
//
//			// Single Winner Rewards
//
//			objIndexPage.CriteriaNameTxtBx.sendKeys(Helper.getData("CreateGeneralQuiz", 2, 23));
//			objIndexPage.DeliveryDateTxtBx.sendKeys(Helper.getData("CreateGeneralQuiz", 2, 24));
//			objIndexPage.WinnerselectionDateTxtBx.sendKeys(Helper.getData("CreateGeneralQuiz", 2, 25));
//			objIndexPage.SelectionSingleWinnerDrpDwn(Helper.getData("CreateGeneralQuiz", 2, 26));
//			objIndexPage.StartDateTxtBx.sendKeys(Helper.getData("CreateGeneralQuiz", 2, 27));
//			objIndexPage.EndDateTxtBx.sendKeys(Helper.getData("CreateGeneralQuiz", 2, 28));
//			Thread.sleep(3000);
//			((JavascriptExecutor) driver).executeScript("scroll(0, 250);");
//
//			objIndexPage.AddRewardsLnk.click();
//			objIndexPage.CashTitleTxtBx.sendKeys(Helper.getData("CreateGeneralQuiz", 2, 30));
//			objIndexPage.CashCurrencyDrpDwn(Helper.getData("CreateGeneralQuiz", 2, 31));
//			objIndexPage.CashrewardamountTxtBx.sendKeys(Helper.getData("CreateGeneralQuiz", 2, 32));
//			objIndexPage.QuizCashDescription.sendKeys(Helper.getData("CreateGeneralQuiz", 2, 33));
//			objIndexPage.QuizAddBtn.click();
//			Thread.sleep(3000);
//			((JavascriptExecutor) driver).executeScript("scroll(0, 1000);");
//			objIndexPage.SaveCriteriaBtn.click();
//			objIndexPage.QuizSingleSaveandPublishBtn.click();
//			Thread.sleep(7000);
//
//		}

	}

	

}
