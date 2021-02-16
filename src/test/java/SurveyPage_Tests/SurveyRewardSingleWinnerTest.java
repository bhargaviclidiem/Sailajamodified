package SurveyPage_Tests;

import java.util.ArrayList;
import java.util.Base64;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ExtentReports.ExtentTestManager;
import HomePage_PageObject.HomePage;
import HomePage_PageObject.IndexPages;
import HomePage_PageObject.LoginPage;
import SurveyPage_PageObjects.SurveyQuestionsPage;
import SurveyPage_PageObjects.CreateSurveyQuestionsPage;
import utilityLibrary.Helper;

public class SurveyRewardSingleWinnerTest {

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

	@Test(description = "Survey Reward Single Winner", groups = { "Sanity" })
	public void SurveySingleWinner() throws Exception {

		 ExtentTestManager.getTest().setDescription("Survey Reward Single winner");

		objHomePage.loginLnk.click();
		Thread.sleep(20000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("The number of windows are: " + tabs.size());
		driver.switchTo().window(tabs.get(1));

		// use https://www.base64encode.org/ for encoding and decoding creds
		objLoginPage.login(Helper.getValue("userName"),
				(new String(Base64.getDecoder().decode(Helper.getValue("password")))));
		Thread.sleep(10000);

		for (int i = 1; i <= Helper.getLastRowRewardsSingleWinner(); i++) {

			Thread.sleep(2000);
			objIndexPage.surveyLnk.click();
			Thread.sleep(2000);

			objIndexPage.createSurveyLnk.click();
			Thread.sleep(5000);

			// creating survey

			objCreateSurveyPage.surveyNameTxtbx.sendKeys(Helper.getLastRowRewardsSingleWinner(i, 2));
			objCreateSurveyPage.descriptionTxtArea.sendKeys(Helper.getLastRowRewardsSingleWinner(i, 3));
			Thread.sleep(5000);
			((JavascriptExecutor) driver).executeScript("scroll(0, 800);");
			objCreateSurveyPage.selectCategory(Helper.getLastRowRewardsSingleWinner(i, 4));
			((JavascriptExecutor) driver).executeScript("scroll(0, 800);");
//			objCreateSurveyPage.selectLanguage(Helper.getLastRowRewardsSingleWinner(i, 5));
			objCreateSurveyPage.allowAnonymousResChkBx.click();
			objCreateSurveyPage.saveAsTemplateChkBx.click();
			objCreateSurveyPage.saveAsTemplateTxBx.sendKeys(Helper.getLastRowRewardsSingleWinner(i, 7));
			objCreateSurveyPage.setYourOwnLandPageUrl.click();
			objCreateSurveyPage.setYourOwnLandPageUrlTxBx.sendKeys(Helper.getLastRowRewardsSingleWinner(i, 8));
			objCreateSurveyPage.randomizeQuestion.click();
			objCreateSurveyPage.randomizePages.click();
			
			
			Helper.takeScreenshot(driver);
			objCreateSurveyPage.SurveySaveNextBtn.click();

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
			objCreateSurveyQuestionsPage.SingleSurveyQuestoinSaveNextBtn.click();

			// Creating a Questions logic page
			Helper.takeScreenshot(driver);
			Thread.sleep(5000);
			objCreateSurveyQuestionsPage.questionLogicNextBtn.click();

			// Creating a Questions Preview & Customize page
			Thread.sleep(5000);
			Helper.takeScreenshot(driver);
			objCreateSurveyQuestionsPage.PreviewAndCustomizeNextBtn.click();
			Thread.sleep(5000);

			// Rewards section
			((JavascriptExecutor) driver).executeScript("scroll(0, 250);");
			Thread.sleep(2000);
			Helper.takeScreenshot(driver);
			objCreateSurveyQuestionsPage.criteriaaddBtnn.click();

			// Rewards section for Single Winner
			Thread.sleep(5000);
			Helper.takeScreenshot(driver);
			objCreateSurveyQuestionsPage.criteriaNameTxtBx.sendKeys((Helper.getLastRowRewardsSingleWinner(i, 11)));
			objCreateSurveyQuestionsPage.deliveryDate.sendKeys((Helper.getLastRowRewardsSingleWinner(i, 12)));
			objCreateSurveyQuestionsPage.winnerSelectionDate.sendKeys(Helper.getLastRowRewardsSingleWinner(i, 13));
			objCreateSurveyQuestionsPage.SingleSelection(Helper.getLastRowRewardsSingleWinner(i, 14));
			objCreateSurveyQuestionsPage.startDate.sendKeys(Helper.getLastRowRewardsSingleWinner(i, 15));
			objCreateSurveyQuestionsPage.endDate.sendKeys(Helper.getLastRowRewardsSingleWinner(i, 16));
			objCreateSurveyQuestionsPage.SingleAddRewardBtn.click();
			Thread.sleep(5000);
			((JavascriptExecutor) driver).executeScript("scroll(0, 700);");

			String Rewards = Helper.getLastRowRewardsSingleWinner(i, 17);

			if (Rewards.equals("Cash")) {

				// Rewards Cash tab details for single winner
				Helper.takeScreenshot(driver);
				objCreateSurveyQuestionsPage.CashTitleTxtBx.sendKeys(Helper.getLastRowRewardsSingleWinner(i, 18));
				objCreateSurveyQuestionsPage.CashAmountDrpDwn(Helper.getLastRowRewardsSingleWinner(i, 19));
				objCreateSurveyQuestionsPage.CashRewardAmountTxtBx
						.sendKeys(Helper.getLastRowRewardsSingleWinner(i, 20));
				objCreateSurveyQuestionsPage.CashRewardDescriptionTxtBx
						.sendKeys(Helper.getLastRowRewardsSingleWinner(i, 21));
				objCreateSurveyQuestionsPage.CashRewardAddBtn.click();

				Thread.sleep(3000);
				((JavascriptExecutor) driver).executeScript("scroll(0, 1000);");
				objCreateSurveyQuestionsPage.CashRewardSaveCriteriaBtn.click();
				Thread.sleep(3000);
				objCreateSurveyQuestionsPage.RewardSaveAndPublishBtn.click();
				Thread.sleep(3000);
				objCreateSurveyQuestionsPage.AmountProcessedBtn.click();

				Helper.takeScreenshot(driver);

			} else if (Rewards.equals("Points")) {

				// Rewards Points tab details for single winner
				Helper.takeScreenshot(driver);
				objCreateSurveyQuestionsPage.SinglePointsTab.click();
				objCreateSurveyQuestionsPage.SinglePointTitleTxtBx
						.sendKeys(Helper.getLastRowRewardsSingleWinner(i, 22));
				objCreateSurveyQuestionsPage.SinglePointRewardsTxtBx
						.sendKeys(Helper.getLastRowRewardsSingleWinner(i, 23));
				objCreateSurveyQuestionsPage.SinglePointCanRedeemChkBtn.click();
				objCreateSurveyQuestionsPage.SinglePointDescriptionTxtBx
						.sendKeys(Helper.getLastRowRewardsSingleWinner(i, 25));
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
						.sendKeys(Helper.getLastRowRewardsSingleWinner(i, 26));
				objCreateSurveyQuestionsPage.SingleProductNameTxt.sendKeys(Helper.getLastRowRewardsSingleWinner(i, 27));
				objCreateSurveyQuestionsPage.SingleProductQuantityTxt
						.sendKeys(Helper.getLastRowRewardsSingleWinner(i, 28));
				objCreateSurveyQuestionsPage.SingleProductValueTxt
						.sendKeys(Helper.getLastRowRewardsSingleWinner(i, 29));
				objCreateSurveyQuestionsPage.SingleProductDescriptionTxt
						.sendKeys(Helper.getLastRowRewardsSingleWinner(i, 30));
				objCreateSurveyQuestionsPage.SinglePointOnlineAndOffline(Helper.getLastRowRewardsSingleWinner(i, 31));

				String OffOnline = Helper.getLastRowRewardsSingleWinner(i, 31);

				if (OffOnline.equals("Offline")) {

					objCreateSurveyQuestionsPage
							.SingleWinnerofflineCountryDrpDwn(Helper.getLastRowRewardsSingleWinner(i, 32));
					objCreateSurveyQuestionsPage.SingleWinnerOfflineamount
							.sendKeys(Helper.getLastRowRewardsSingleWinner(i, 33));
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

			else {

			}
		}

	}


	@AfterTest
	public void tearDown() {

		driver.close();
	
	}
}
