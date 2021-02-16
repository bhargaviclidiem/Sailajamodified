package SurveyPage_Tests;

import java.util.ArrayList;
import java.util.Base64;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ExtentReports.ExtentTestManager;
import HomePage_PageObject.HomePage;
import HomePage_PageObject.IndexPages;
import HomePage_PageObject.LoginPage;
import SurveyPage_PageObjects.SurveyQuestionsPage;
import SurveyPage_PageObjects.CreateSurveyQuestionsPage;
import utilityLibrary.Helper;

public class SurveyRewardMultiWinnerTest {

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

	@Test(priority = 1, description = "Verify survey with Reward Multiple Winner ", groups = { "Sanity", "Regression" })
	public void SurveyRewardMultiWinner() throws Exception {
		
		ExtentTestManager.getTest().setDescription("Multiple winner Reward");
		
		objHomePage.loginLnk.click();
		Thread.sleep(20000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("The number of windows are: " + tabs.size());
		driver.switchTo().window(tabs.get(1));

		// use https://www.base64encode.org/ for encoding and decoding creds
		objLoginPage.login(Helper.getValue("userName"),
				(new String(Base64.getDecoder().decode(Helper.getValue("password")))));
		Thread.sleep(10000);

		for (int i = 1; i <= Helper.getLastRowSurveyMultipleWinner(); i++) 
	    {
		
		objIndexPage.surveyLnk.click();
		Thread.sleep(2000);
		objIndexPage.createSurveyLnk.click();
		Thread.sleep(5000);

		// creating survey
		Helper.takeScreenshot(driver);
		objCreateSurveyPage.surveyNameTxtbx.sendKeys(Helper.getLastRowSurveyMultipleWinner(i, 2));
		objCreateSurveyPage.descriptionTxtArea.sendKeys(Helper.getLastRowSurveyMultipleWinner(i, 3));
		Thread.sleep(5000);
		objCreateSurveyPage.selectCategory(Helper.getLastRowSurveyMultipleWinner(i, 4));
		((JavascriptExecutor) driver).executeScript("scroll(0, 250);");
//		objCreateSurveyPage.selectLanguage(Helper.getLastRowSurveyMultipleWinner(i, 5));
		objCreateSurveyPage.allowAnonymousResChkBx.click();
		objCreateSurveyPage.saveAsTemplateChkBx.click();
		objCreateSurveyPage.saveAsTemplateTxBx.sendKeys(Helper.getLastRowSurveyMultipleWinner(i, 7));
		objCreateSurveyPage.setYourOwnLandPageUrl.click();
		objCreateSurveyPage.setYourOwnLandPageUrlTxBx.sendKeys(Helper.getLastRowSurveyMultipleWinner(i, 8));
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
		objCreateSurveyQuestionsPage.SurveyQuestoinSaveNextBtn.click();

		// Creating a Questions logic page
		Helper.takeScreenshot(driver);
		Thread.sleep(3000);
		objCreateSurveyQuestionsPage.questionLogicNextBtn.click();

		// Creating a Questions Preview & Customize page
		Thread.sleep(5000);
		Helper.takeScreenshot(driver);
		objCreateSurveyQuestionsPage.PreviewAndCustomizeNextBtn.click();

		// Rewards section
		((JavascriptExecutor) driver).executeScript("scroll(0, 250);");
		Thread.sleep(2000);
		Helper.takeScreenshot(driver);
		objCreateSurveyQuestionsPage.criteriaaddBtnn.click();
		
		// Rewards section for Multiple Winner

		Thread.sleep(5000);
		Helper.takeScreenshot(driver);
		objCreateSurveyQuestionsPage.multipleWinnersTabBtn.click();
		objCreateSurveyQuestionsPage.multipleCriteriaNameTxtBx.sendKeys((Helper.getLastRowSurveyMultipleWinner(i, 11)));
		objCreateSurveyQuestionsPage.multipleNoOfWinnersTxtBx.sendKeys((Helper.getLastRowSurveyMultipleWinner(i, 12)));
		Thread.sleep(2000);
		objCreateSurveyQuestionsPage.multipleUnlimitedChkBtn((Helper.getLastRowSurveyMultipleWinner(i, 13)));
		
		String unlimited = Helper.getLastRowSurveyMultipleWinner(i, 13);

		if (unlimited.contains("yes")) {
			objCreateSurveyQuestionsPage.ExceptedNoOfWinners.sendKeys((Helper.getLastRowSurveyMultipleWinner(i, 12)));
		}
		else
		{
			
		}
		Thread.sleep(2000);
 	    objCreateSurveyQuestionsPage.multipleAutoSelectBtn((Helper.getLastRowSurveyMultipleWinner(i, 14)));
 	 		    
		Thread.sleep(2000);
		objCreateSurveyQuestionsPage.multipleWinnerSelectionDate.sendKeys((Helper.getLastRowSurveyMultipleWinner(i, 15)));
		
			
		objCreateSurveyQuestionsPage.multipleSelectionDrpDwn((Helper.getLastRowSurveyMultipleWinner(i, 17)));
		
		
		String SelectionType = Helper.getLastRowSurveyMultipleWinner(i, 17);

		if (SelectionType.contains("Every")) {
			
			objCreateSurveyQuestionsPage.multiplePeriodicWinnerCountTxtBx.sendKeys((Helper.getLastRowSurveyMultipleWinner(i, 16)));
			Thread.sleep(2000);
			
			objCreateSurveyQuestionsPage.multipleTotalParticipantsTxtBx.sendKeys((Helper.getLastRowSurveyMultipleWinner(i, 18)));
			Thread.sleep(2000);
			objCreateSurveyQuestionsPage.multipleDurationDrpDwn((Helper.getLastRowSurveyMultipleWinner(i, 19)));
			objCreateSurveyQuestionsPage.multipleNoOfTextBx.sendKeys((Helper.getLastRowSurveyMultipleWinner(i, 20)));
			Thread.sleep(2000);
			objCreateSurveyQuestionsPage.multipleSelectPeriodDrpDwn((Helper.getLastRowSurveyMultipleWinner(i, 21)));
			Thread.sleep(2000);
			objCreateSurveyQuestionsPage.multipleExcludePeriodsChkBtn((Helper.getLastRowSurveyMultipleWinner(i, 22)));
			objCreateSurveyQuestionsPage.multipleStartDate.sendKeys(Helper.getLastRowSurveyMultipleWinner(i, 23));
			objCreateSurveyQuestionsPage.multiplEendDate.sendKeys(Helper.getLastRowSurveyMultipleWinner(i, 24));
			objCreateSurveyQuestionsPage.multipleRewardsDeliveryDays.sendKeys(Helper.getLastRowSurveyMultipleWinner(i, 25));
			objCreateSurveyQuestionsPage.multipleAddRewardsBtn.click();
			
		} else if (SelectionType.contains("All Event")) {
			
			objCreateSurveyQuestionsPage.multipleStartDate.sendKeys(Helper.getLastRowSurveyMultipleWinner(i, 23));
			objCreateSurveyQuestionsPage.multiplEendDate.sendKeys(Helper.getLastRowSurveyMultipleWinner(i, 24));
			objCreateSurveyQuestionsPage.multipleRewardsDeliveryDays.sendKeys(Helper.getLastRowSurveyMultipleWinner(i, 25));
			objCreateSurveyQuestionsPage.multipleAddRewardsBtn.click();
		} else {
			
			objCreateSurveyQuestionsPage.multiplePeriodicWinnerCountTxtBx.sendKeys((Helper.getLastRowSurveyMultipleWinner(i, 16)));
			Thread.sleep(2000);
			
			objCreateSurveyQuestionsPage.multipleTotalParticipantsTxtBx.sendKeys((Helper.getLastRowSurveyMultipleWinner(i, 18)));
			Thread.sleep(2000);
			objCreateSurveyQuestionsPage.multipleDurationDrpDwn((Helper.getLastRowSurveyMultipleWinner(i, 19)));
			objCreateSurveyQuestionsPage.multipleNoOfTextBx.sendKeys((Helper.getLastRowSurveyMultipleWinner(i, 20)));
			Thread.sleep(2000);
			objCreateSurveyQuestionsPage.multipleSelectPeriodDrpDwn((Helper.getLastRowSurveyMultipleWinner(i, 21)));
			Thread.sleep(2000);
			objCreateSurveyQuestionsPage.multipleStartDate.sendKeys(Helper.getLastRowSurveyMultipleWinner(i, 23));
			objCreateSurveyQuestionsPage.multiplEendDate.sendKeys(Helper.getLastRowSurveyMultipleWinner(i, 24));
			objCreateSurveyQuestionsPage.multipleRewardsDeliveryDays.sendKeys(Helper.getLastRowSurveyMultipleWinner(i, 25));
			objCreateSurveyQuestionsPage.multipleAddRewardsBtn.click();
		}
		
		
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("scroll(0, 700);");
		
		String Rewards = (Helper.getLastRowSurveyMultipleWinner(i, 26));
		
	if (Rewards.contains("Cash"))
		{
			
		// Rewards Cash tab details for Multiple winner
		Helper.takeScreenshot(driver);
		objCreateSurveyQuestionsPage.CashTitleTxtBx.sendKeys(Helper.getLastRowSurveyMultipleWinner(i, 27));
		objCreateSurveyQuestionsPage.CashAmountDrpDwn(Helper.getLastRowSurveyMultipleWinner(i, 28));
		objCreateSurveyQuestionsPage.CashRewardAmountTxtBx.sendKeys(Helper.getLastRowSurveyMultipleWinner(i, 29));
		objCreateSurveyQuestionsPage.CashRewardDescriptionTxtBx.sendKeys(Helper.getLastRowSurveyMultipleWinner(i, 30));
		objCreateSurveyQuestionsPage.CashRewardAddBtn.click();
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("scroll(0, 1000);");
		objCreateSurveyQuestionsPage.CashRewardSaveCriteriaBtn.click();
		objCreateSurveyQuestionsPage.RewardSaveAndPublishBtn.click();
		
	} else if (Rewards.contains("Points"))
	{
		objCreateSurveyQuestionsPage.multiplePointsTab.click();
		objCreateSurveyQuestionsPage.multiplePointsTitleTxt.sendKeys(Helper.getLastRowSurveyMultipleWinner(i, 31));
		objCreateSurveyQuestionsPage.multipleRewardsPointsTxt.sendKeys(Helper.getLastRowSurveyMultipleWinner(i, 32));
		objCreateSurveyQuestionsPage.multiplePointscanredeemChkBtn.sendKeys(Helper.getLastRowSurveyMultipleWinner(i, 33));
		objCreateSurveyQuestionsPage.multiplePonitsDescriptionTxt.sendKeys(Helper.getLastRowSurveyMultipleWinner(i, 34));
		objCreateSurveyQuestionsPage.multiplePointsAddBtn.click();
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("scroll(0, 1000);");
		objCreateSurveyQuestionsPage.multipleSavecriteria.click();
		objCreateSurveyQuestionsPage.RewardSaveAndPublishBtn.click();
		
	} else 
		
	{
		objCreateSurveyQuestionsPage.multipleProductsTab.click();
		objCreateSurveyQuestionsPage.multipleProductsTitleTxt.sendKeys(Helper.getLastRowSurveyMultipleWinner(i, 35));
		objCreateSurveyQuestionsPage.multipleProductNameTxt.sendKeys(Helper.getLastRowSurveyMultipleWinner(i, 36));
		objCreateSurveyQuestionsPage.multipleProductQuantityTxt.sendKeys(Helper.getLastRowSurveyMultipleWinner(i, 37));
		objCreateSurveyQuestionsPage.multipleProductValueTxt.sendKeys(Helper.getLastRowSurveyMultipleWinner(i, 38));
		objCreateSurveyQuestionsPage.multipleDescriptionTxt.sendKeys(Helper.getLastRowSurveyMultipleWinner(i, 39));
		objCreateSurveyQuestionsPage.SinglePointOnlineAndOffline(Helper.getLastRowSurveyMultipleWinner(i, 40));
		
		/*String OffOnline = (Helper.getLastRowSurveyMultipleWinner(i, 40));

		if (OffOnline.contains("Offline")) {
			
			objCreateSurveyQuestionsPage.SingleWinnerofflineCountryDrpDwn(Helper.getdataSurveyRewardSingleMultiple(i, 32));
			objCreateSurveyQuestionsPage.SingleWinnerOfflineamount.sendKeys(Helper.getdataSurveyRewardSingleMultiple(i, 33));
			objCreateSurveyQuestionsPage.SingleProductAddBtn.click();
			
			Thread.sleep(5000);
			((JavascriptExecutor) driver).executeScript("scroll(0, 1000);");
			objCreateSurveyQuestionsPage.CashRewardSaveCriteriaBtn.click();
			objCreateSurveyQuestionsPage.RewardSaveAndPublishBtn.click();
		}
		else
		{
			objCreateSurveyQuestionsPage.SingleProductAddBtn.click();
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("scroll(0, 1000);");
			objCreateSurveyQuestionsPage.CashRewardSaveCriteriaBtn.click();
			objCreateSurveyQuestionsPage.RewardSaveAndPublishBtn.click();
		}*/
		
	}

		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("scroll(0, 1000);");

		objCreateSurveyQuestionsPage.AmountProcessedBtn.click();

		Thread.sleep(300000);
		objCreateSurveyQuestionsPage.RewardsTabClk.click();
		Thread.sleep(3000);
		objCreateSurveyQuestionsPage.WinnerSelectionBtn.click();
		Thread.sleep(10000);

		objIndexPage.surveyLnk.click();
		Thread.sleep(2000);
		objIndexPage.createSurveyLnk.click();
		Thread.sleep(5000);
		
		Helper.takeScreenshot(driver);
	    }
	}

}
