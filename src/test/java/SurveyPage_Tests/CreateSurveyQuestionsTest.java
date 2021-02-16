package SurveyPage_Tests;

import java.util.ArrayList;
import java.util.Base64;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import HomePage_PageObject.HomePage;
import HomePage_PageObject.IndexPages;
import HomePage_PageObject.LoginPage;
import SurveyPage_PageObjects.SurveyQuestionsPage;
import SurveyPage_PageObjects.CreateSurveyQuestionsPage;
import utilityLibrary.Helper;

public class CreateSurveyQuestionsTest {

	WebDriver driver;
	LoginPage objLoginPage;
	HomePage objHomePage;
	IndexPages objIndexPage;
	SurveyQuestionsPage objCreateSurveyPage;
	CreateSurveyQuestionsPage objCreateSurveyQuestionsPage;
	JavascriptExecutor js;

	@BeforeClass
	public void setUp() throws Exception {
		// Open the application under test
		driver = Helper.openAUT(driver);
		objLoginPage = new LoginPage(driver);
		objHomePage = new HomePage(driver);
		objIndexPage = new IndexPages(driver);
		objCreateSurveyPage = new SurveyQuestionsPage(driver);
		objCreateSurveyQuestionsPage = new CreateSurveyQuestionsPage(driver);
	}

	@Test(priority = 1, description = "Verify survey Questions", groups = { "Sanity", "Regression" })
	public void testCase_01() throws Exception {
		objHomePage.loginLnk.click();
		Helper.takeScreenshot(driver);
		Thread.sleep(20000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("The number of windows are: " + tabs.size());
		driver.switchTo().window(tabs.get(1));

		// use https://www.base64encode.org/ for encoding and decoding creds
		objLoginPage.login(Helper.getValue("userName"),
				(new String(Base64.getDecoder().decode(Helper.getValue("password")))));
		Thread.sleep(10000);

		Helper.takeScreenshot(driver);
		objIndexPage.surveyLnk.click();
		Thread.sleep(2000);
		objIndexPage.createSurveyLnk.click();
		Thread.sleep(5000);

		// creating survey
		objCreateSurveyPage.surveyNameTxtbx.sendKeys(Helper.getData("CreateSurvey", 2, 2));
		objCreateSurveyPage.descriptionTxtArea.sendKeys(Helper.getData("CreateSurvey", 2, 3));
		Thread.sleep(5000);
		objCreateSurveyPage.selectCategory(Helper.getData("CreateSurvey", 2, 4));
		((JavascriptExecutor) driver).executeScript("scroll(0, 250);");
		objCreateSurveyPage.selectLanguage(Helper.getData("CreateSurvey", 2, 5));
	
		objCreateSurveyPage.saveAsTemplateChkBx.click();
		objCreateSurveyPage.saveAsTemplateTxBx.sendKeys(Helper.getData("CreateSurvey", 2, 7));
		
		objCreateSurveyPage.setYourOwnLandPageUrlTxBx.sendKeys(Helper.getData("CreateSurvey", 2, 8));

		Helper.takeScreenshot(driver);

		Thread.sleep(5000);

		// Creating a Questions for Survey

		objCreateSurveyQuestionsPage.questionGroupDrpDwn.click();
		objCreateSurveyQuestionsPage.AddNew.click();
		Thread.sleep(3000);
		objCreateSurveyQuestionsPage.NewgroupTxtBx.sendKeys(Helper.getData("CreateSurveyQuestions", 2, 4));
		objCreateSurveyQuestionsPage.Notes.sendKeys(Helper.getData("CreateSurveyQuestions", 2, 4));
		Helper.takeScreenshot(driver);
		objCreateSurveyQuestionsPage.Addbtn.click();

		Thread.sleep(3000);

		for (int i = 1; i <= Helper.getLastRowSQ(); i++) {

			objCreateSurveyQuestionsPage.questionTextBx.sendKeys(Helper.getSurveyQuestions(i, 2));
			objCreateSurveyQuestionsPage.tagsTxBx.sendKeys(Helper.getSurveyQuestions(i, 3));
			Thread.sleep(3000);
			objCreateSurveyQuestionsPage.addQuestionGroup(Helper.getSurveyQuestions(i, 4));
			Thread.sleep(3000);
			objCreateSurveyQuestionsPage.answerTypeDrpDwn.sendKeys(Helper.getSurveyQuestions(i, 7));
			((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
			Thread.sleep(5000);
			Helper.takeScreenshot(driver);

			String answerTypeDrpDwn = Helper.getSurveyQuestions(i, 7);

			if (answerTypeDrpDwn.contains("Amount") || answerTypeDrpDwn.contains("Date")
					|| answerTypeDrpDwn.contains("Number") || answerTypeDrpDwn.contains("Scale / Rate")
					|| answerTypeDrpDwn.contains("Test Area") || answerTypeDrpDwn.contains("Yes or No")
					|| answerTypeDrpDwn.contains("Single Line Text")) {
				Helper.takeScreenshot(driver);
				objCreateSurveyQuestionsPage.Textlabel.sendKeys(Helper.getSurveyQuestions(i, 19));
				((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
				Thread.sleep(3000);
				objCreateSurveyQuestionsPage.Mandatory.click();
				objCreateSurveyQuestionsPage.allowCommentsChkBx.click();
				Helper.takeScreenshot(driver);
				objCreateSurveyQuestionsPage.addQuestionbtn.click();
				Thread.sleep(3000);
				((JavascriptExecutor) driver).executeScript("scroll(0, 500);");

			} else if (answerTypeDrpDwn.contains("Check Box") || answerTypeDrpDwn.contains("Dropdown")
					|| answerTypeDrpDwn.contains("Multiple Select Dropdown")
					|| answerTypeDrpDwn.contains("Multiple Textboxes") || answerTypeDrpDwn.contains("Radio Button")) {

				// Number of Options for checkbox / dropdown / Multiple select
				// dropdown / Multiple Textboxes / Radio Button
				Helper.takeScreenshot(driver);
				objCreateSurveyQuestionsPage.numberOfOptionsDrpDwn.sendKeys(Helper.getSurveyQuestions(i, 8));
				Thread.sleep(3000);
				int count = Integer.parseInt(Helper.getSurveyQuestions(i, 8));
				if (count >= 1) {
					String option = Helper.getSurveyQuestions(i, 9);
					if (option != "") {
						objCreateSurveyQuestionsPage.option1TxBx.sendKeys(Helper.getSurveyQuestions(i, 9));
						Helper.takeScreenshot(driver);
					}
				}
				if (count >= 2) {
					String option = Helper.getSurveyQuestions(i, 10);
					if (option != "") {
						objCreateSurveyQuestionsPage.option2TxBx.sendKeys(Helper.getSurveyQuestions(i, 10));
						Helper.takeScreenshot(driver);
					}
				}
				if (count >= 3) {
					String option = Helper.getSurveyQuestions(i, 11);
					if (option != "") {
						objCreateSurveyQuestionsPage.option3TxBx.sendKeys(Helper.getSurveyQuestions(i, 11));
						Helper.takeScreenshot(driver);
					}
				}
				if (count >= 4) {
					String option = Helper.getSurveyQuestions(i, 12);
					if (option != "") {
						objCreateSurveyQuestionsPage.option4TxBx.sendKeys(Helper.getSurveyQuestions(i, 12));
						Helper.takeScreenshot(driver);
					}
				}
				if (count >= 5) {
					String option = Helper.getSurveyQuestions(i, 13);
					if (option != "") {
						objCreateSurveyQuestionsPage.option5TxBx.sendKeys(Helper.getSurveyQuestions(i, 13));
						Helper.takeScreenshot(driver);
					}
				}
				if (count >= 6) {
					String option = Helper.getSurveyQuestions(i, 14);
					if (option != "") {
						objCreateSurveyQuestionsPage.option6TxBx.sendKeys(Helper.getSurveyQuestions(i, 14));
						Helper.takeScreenshot(driver);
					}
				}
				if (count >= 7) {
					String option = Helper.getSurveyQuestions(i, 15);
					if (option != "") {
						objCreateSurveyQuestionsPage.option7TxBx.sendKeys(Helper.getSurveyQuestions(i, 15));
						Helper.takeScreenshot(driver);
					}
				}
				if (count >= 8) {
					String option = Helper.getSurveyQuestions(i, 16);
					if (option != "") {
						objCreateSurveyQuestionsPage.option8TxBx.sendKeys(Helper.getSurveyQuestions(i, 16));
						Helper.takeScreenshot(driver);
					}
				}
				if (count >= 9) {
					String option = Helper.getSurveyQuestions(i, 17);
					if (option != "") {
						objCreateSurveyQuestionsPage.option9TxBx.sendKeys(Helper.getSurveyQuestions(i, 17));
						Helper.takeScreenshot(driver);
					}
				}
				if (count >= 10) {
					String option = Helper.getSurveyQuestions(i, 18);
					if (option != "") {
						objCreateSurveyQuestionsPage.option10TxBx.sendKeys(Helper.getSurveyQuestions(i, 18));
						Helper.takeScreenshot(driver);
					}
				}
				Thread.sleep(3000);
				((JavascriptExecutor) driver).executeScript("scroll(0, 3000);");
				// for Scale Grouping
				objCreateSurveyQuestionsPage.Mandatory.click();
				objCreateSurveyQuestionsPage.Mandatory.click();
				objCreateSurveyQuestionsPage.allowCommentsChkBx.click();
				Helper.takeScreenshot(driver);
				objCreateSurveyQuestionsPage.addQuestionbtn.click();
			} else if (answerTypeDrpDwn.contains("Group Scaling")) {

				Helper.takeScreenshot(driver);
				objCreateSurveyQuestionsPage.numberOfOptionsDrpDwn.sendKeys(Helper.getSurveyQuestions(i, 8));
				Thread.sleep(3000);
				int count = Integer.parseInt(Helper.getSurveyQuestions(i, 8));
				if (count >= 1) {
					String option = Helper.getSurveyQuestions(i, 9);
					if (option != "") {
						objCreateSurveyQuestionsPage.option1TxBx.sendKeys(Helper.getSurveyQuestions(i, 9));
					}
				}
				if (count >= 2) {
					String option = Helper.getSurveyQuestions(i, 10);
					if (option != "") {
						objCreateSurveyQuestionsPage.option2TxBx.sendKeys(Helper.getSurveyQuestions(i, 10));
					}
				}
				if (count >= 3) {
					String option = Helper.getSurveyQuestions(i, 11);
					if (option != "") {
						objCreateSurveyQuestionsPage.option3TxBx.sendKeys(Helper.getSurveyQuestions(i, 11));
					}
				}
				if (count >= 4) {
					String option = Helper.getSurveyQuestions(i, 12);
					if (option != "") {
						objCreateSurveyQuestionsPage.option4TxBx.sendKeys(Helper.getSurveyQuestions(i, 12));
					}
				}
				if (count >= 5) {
					String option = Helper.getSurveyQuestions(i, 13);
					if (option != "") {
						objCreateSurveyQuestionsPage.option5TxBx.sendKeys(Helper.getSurveyQuestions(i, 13));
					}
				}
				if (count >= 6) {
					String option = Helper.getSurveyQuestions(i, 14);
					if (option != "") {
						objCreateSurveyQuestionsPage.option6TxBx.sendKeys(Helper.getSurveyQuestions(i, 14));
					}
				}
				if (count >= 7) {
					String option = Helper.getSurveyQuestions(i, 15);
					if (option != "") {
						objCreateSurveyQuestionsPage.option7TxBx.sendKeys(Helper.getSurveyQuestions(i, 15));
					}
				}
				if (count >= 8) {
					String option = Helper.getSurveyQuestions(i, 16);
					if (option != "") {
						objCreateSurveyQuestionsPage.option8TxBx.sendKeys(Helper.getSurveyQuestions(i, 16));
					}
				}
				if (count >= 9) {
					String option = Helper.getSurveyQuestions(i, 17);
					if (option != "") {
						objCreateSurveyQuestionsPage.option9TxBx.sendKeys(Helper.getSurveyQuestions(i, 17));
					}
				}
				if (count >= 10) {
					String option = Helper.getSurveyQuestions(i, 18);
					if (option != "") {
						objCreateSurveyQuestionsPage.option10TxBx.sendKeys(Helper.getSurveyQuestions(i, 18));
					}
				}
				Thread.sleep(3000);
				((JavascriptExecutor) driver).executeScript("scroll(0, 3000);");
				// for Scale Grouping
				objCreateSurveyQuestionsPage.leftLabeTxt.sendKeys(Helper.getSurveyQuestions(i, 20));
				objCreateSurveyQuestionsPage.rightLabeTxt.sendKeys(Helper.getSurveyQuestions(i, 21));
				objCreateSurveyQuestionsPage.Mandatory.click();
				objCreateSurveyQuestionsPage.Mandatory.click();
				objCreateSurveyQuestionsPage.allowCommentsChkBx.click();
				objCreateSurveyQuestionsPage.addQuestionbtn.click();
			} else if (answerTypeDrpDwn.contains("Image with Text")) {
				Helper.takeScreenshot(driver);
				objCreateSurveyQuestionsPage.numberOfOptionsDrpDwn.sendKeys(Helper.getSurveyQuestions(i, 8));
				Thread.sleep(3000);
				int count = Integer.parseInt(Helper.getSurveyQuestions(i, 8));
				if (count >= 1) {
					String option = Helper.getSurveyQuestions(i, 24);
					if (option != "") {
						objCreateSurveyQuestionsPage.Image1.sendKeys(Helper.getSurveyQuestions(i, 24));
						((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
						Thread.sleep(3000);
						Helper.takeScreenshot(driver);
						objCreateSurveyQuestionsPage.Imagecropproceed.click();
						Thread.sleep(3000);
					}
				}
				if (count >= 2) {
					String option = Helper.getSurveyQuestions(i, 25);
					if (option != "") {
						objCreateSurveyQuestionsPage.Image2.sendKeys(Helper.getSurveyQuestions(i, 25));
						((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
						Thread.sleep(3000);
						Helper.takeScreenshot(driver);
						objCreateSurveyQuestionsPage.Imagecropproceed.click();
						Thread.sleep(3000);
					}
				}
				if (count >= 3) {
					String option = Helper.getSurveyQuestions(i, 26);
					if (option != "") {
						objCreateSurveyQuestionsPage.Image3.sendKeys(Helper.getSurveyQuestions(i, 26));
						((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
						Thread.sleep(3000);
						Helper.takeScreenshot(driver);
						objCreateSurveyQuestionsPage.Imagecropproceed.click();
						Thread.sleep(3000);
					}
				}
				if (count >= 4) {
					String option = Helper.getSurveyQuestions(i, 27);
					if (option != "") {
						objCreateSurveyQuestionsPage.Image4.sendKeys(Helper.getSurveyQuestions(i, 27));
						((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
						Thread.sleep(3000);
						Helper.takeScreenshot(driver);
						objCreateSurveyQuestionsPage.Imagecropproceed.click();
						Thread.sleep(3000);
					}
				}
				if (count >= 5) {
					String option = Helper.getSurveyQuestions(i, 28);
					if (option != "") {
						objCreateSurveyQuestionsPage.Image5.sendKeys(Helper.getSurveyQuestions(i, 28));
						((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
						Thread.sleep(3000);
						Helper.takeScreenshot(driver);
						objCreateSurveyQuestionsPage.Imagecropproceed.click();
						Thread.sleep(3000);
					}
				}
				if (count >= 6) {
					String option = Helper.getSurveyQuestions(i, 29);
					if (option != "") {
						objCreateSurveyQuestionsPage.Image6.sendKeys(Helper.getSurveyQuestions(i, 29));
						((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
						Thread.sleep(3000);
						Helper.takeScreenshot(driver);
						objCreateSurveyQuestionsPage.Imagecropproceed.click();
						Thread.sleep(3000);
					}
				}
				if (count >= 7) {
					String option = Helper.getSurveyQuestions(i, 30);
					if (option != "") {
						objCreateSurveyQuestionsPage.Image7.sendKeys(Helper.getSurveyQuestions(i, 30));
						((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
						Thread.sleep(3000);
						Helper.takeScreenshot(driver);
						objCreateSurveyQuestionsPage.Imagecropproceed.click();
						Thread.sleep(3000);
					}
				}
				if (count >= 8) {
					String option = Helper.getSurveyQuestions(i, 31);
					if (option != "") {
						objCreateSurveyQuestionsPage.Image8.sendKeys(Helper.getSurveyQuestions(i, 31));
						((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
						Thread.sleep(3000);
						Helper.takeScreenshot(driver);
						objCreateSurveyQuestionsPage.Imagecropproceed.click();
						Thread.sleep(3000);
					}
				}
				if (count >= 9) {
					String option = Helper.getSurveyQuestions(i, 32);
					if (option != "") {
						objCreateSurveyQuestionsPage.Image9.sendKeys(Helper.getSurveyQuestions(i, 32));
						((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
						Thread.sleep(3000);
						Helper.takeScreenshot(driver);
						objCreateSurveyQuestionsPage.Imagecropproceed.click();
						Thread.sleep(3000);
					}
				}
				if (count >= 10) {
					String option = Helper.getSurveyQuestions(i, 33);
					if (option != "") {
						objCreateSurveyQuestionsPage.Image10.sendKeys(Helper.getSurveyQuestions(i, 33));
						((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
						Thread.sleep(3000);
						Helper.takeScreenshot(driver);
						objCreateSurveyQuestionsPage.Imagecropproceed.click();
						Thread.sleep(3000);
					}
				}
				((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
				Helper.takeScreenshot(driver);
				Thread.sleep(3000);
				objCreateSurveyQuestionsPage.Mandatory.click();
				objCreateSurveyQuestionsPage.allowCommentsChkBx.click();
				Helper.takeScreenshot(driver);
				objCreateSurveyQuestionsPage.addQuestionbtn.click();
			}

			else if (answerTypeDrpDwn.contains("File Upload")) {
				Helper.takeScreenshot(driver);
				objCreateSurveyQuestionsPage.selectFileUpload(Helper.getSurveyQuestions(i, 22));
				((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
				Thread.sleep(3000);
				objCreateSurveyQuestionsPage.Mandatory.click();
				objCreateSurveyQuestionsPage.allowCommentsChkBx.click();
				Helper.takeScreenshot(driver);
				objCreateSurveyQuestionsPage.addQuestionbtn.click();
				Helper.takeScreenshot(driver);
			} else {
				Thread.sleep(3000);
				objCreateSurveyQuestionsPage.saveAndNextQuestionbtn.click();
			}
		}
		Helper.takeScreenshot(driver);
		Thread.sleep(3000);
		objCreateSurveyQuestionsPage.saveAndNextQuestionbtn.click();

		// Creating a Questions logic page
		Helper.takeScreenshot(driver);
		objCreateSurveyQuestionsPage.questionLogicNextBtn.click();

		// Creating a Questions Preview & Customize page
		Thread.sleep(5000);
		Helper.takeScreenshot(driver);
		objCreateSurveyQuestionsPage.PreviewAndCustomizeNextBtn.click();
		Thread.sleep(5000);

		Helper.takeScreenshot(driver);
	}

}
