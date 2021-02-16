package Methods;

import java.util.ArrayList;
import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ExtentReports.ExtentTestManager;
import HomePage_PageObject.HomePage;
import HomePage_PageObject.IndexPages;
import HomePage_PageObject.LoginPage;
import SurveyPage_PageObjects.SurveyQuestionsPage;
import SurveyPage_PageObjects.CreateSurveyQuestionsPage;
import utilityLibrary.Helper;

public class TestCaseMethods {

	WebDriver driver;
	LoginPage objLoginPage;
	HomePage objHomePage;
	IndexPages objIndexPage;
	SurveyQuestionsPage objCreateSurveyPage;
	CreateSurveyQuestionsPage objCreateSurveyQuestionsPage;
	JavascriptExecutor js;

	// Methods

	public void LoginSurvey() throws Exception {
		// Open the application under test
		driver = Helper.openAUT(driver);
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
		Thread.sleep(5000);

	}

	public void CloseWindow() throws Exception {
		driver.close();
	}

	public void Screenshot() throws Exception {
		Helper.takeScreenshot(driver);
	}

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

	public void SetYourOwnLandPageUrl() throws Exception {

		objCreateSurveyPage.setYourOwnLandPageUrl.click();
		objCreateSurveyPage.setYourOwnLandPageUrlTxBx.sendKeys(Helper.getData("SurveySingleWinner", 2, 8));
	}

	public void randomizeQuestionCheck() throws Exception {
		objCreateSurveyPage.randomizeQuestion.click();
	}

	public void randomizePagesCheck() throws Exception {
		objCreateSurveyPage.randomizePages.click();
	}

	public void AddQuestionGrop() throws Exception {

		objIndexPage.checkboxBtnClk.click();
		objIndexPage.checkbxquestiongroup.click();
		objIndexPage.AddNewGroup.click();
		objIndexPage.NewGroupName.sendKeys(Helper.getData("Question Type", 2, 5));
		objIndexPage.AddNewGroupAddBtn.click();
		objIndexPage.AddNewGroupCloseBtn.click();

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
		objIndexPage.Datebxtags.sendKeys(Helper.getData("Question Types", 5, 4));
		objIndexPage.selectDatebxquestiongroup(Helper.getData("Question Types", 5, 5));
		objIndexPage.DateLabelTxt.sendKeys(Helper.getData("Question Types", 5, 17));
		((JavascriptExecutor) driver).executeScript("scroll(0, 500);");
		objIndexPage.Datebxmandatory.click();
		objIndexPage.Datebxallowcomments.click();
		objIndexPage.Datebxaddquestion.click();
		Thread.sleep(2000);
	}

	public void MouseHoverQuestionType() throws Exception {
//		Actions action = new Actions(driver);
//		WebElement we = driver.findElement(By.xpath("//*[@id='profile1']/div/div[2]"));
//		action.moveToElement(we).build().perform();
		
		WebElement element = driver.findElement(By.xpath("//*[@id='profile1']/div/div[2]"));

//				((JavascriptExecutor)driver).executeScript(".scrollIntoView();", element);
				((JavascriptExecutor) driver).executeScript("scroll(0, 800);",element);
				
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
	
}
