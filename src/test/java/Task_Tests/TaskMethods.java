package Task_Tests;

import java.util.ArrayList;
import java.util.Base64;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import HomePage_PageObject.HomePage;
import HomePage_PageObject.IndexPages;
import HomePage_PageObject.LoginPage;
import SurveyPage_PageObjects.SurveyQuestionsPage;
import SurveyPage_PageObjects.CreateSurveyQuestionsPage;
import utilityLibrary.Helper;

public class TaskMethods {

	WebDriver driver;
	LoginPage objLoginPage;
	HomePage objHomePage;
	IndexPages objIndexPage;
	SurveyQuestionsPage objCreateSurveyPage;
	CreateSurveyQuestionsPage objCreateSurveyQuestionsPage;
	JavascriptExecutor js;

	// Login and Quit Methods

	public void Login() throws Exception {
		
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
		Thread.sleep(3000);

	}
	public void CloseWindow() throws Exception {
//		 driver.close();
		driver.quit();
	}

	// Task Page Methods
	
	public void CreateTaskDetails(int row) throws Exception {

		// ExtentTestManager.getTest().setDescription("Create Quiz Details");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		objIndexPage.TaskTab.click();
		objIndexPage.CreateTask.click();
		objIndexPage.ProjectNameAddNewBtn.click();
		objIndexPage.ProjectNameTextBx.sendKeys(Helper.getData("CreateTaskDetails", row, 1));
		objIndexPage.ProjectNameAddBtn.click();
		objIndexPage.TaskProjectDrp(Helper.getData("CreateTaskDetails", row, 2));
		objIndexPage.TaskNameTxtBx.sendKeys(Helper.getData("CreateTaskDetails", row, 3));
		objIndexPage.selectTaskAssigntoDrp(Helper.getData("CreateTaskDetails", row, 4));
		objIndexPage.ParticipantsDrpDwn(Helper.getData("CreateTaskDetails", row, 5));
		objIndexPage.ObserversDrpDwn(Helper.getData("CreateTaskDetails", row, 6));
		objIndexPage.selectPriorityDrp(Helper.getData("CreateTaskDetails", row, 7));
		objIndexPage.selectStatusDrp(Helper.getData("CreateTaskDetails", row, 8));
		objIndexPage.SubTaskDrp.sendKeys(Helper.getData("CreateTaskDetails", row, 9));
		objIndexPage.LeadownerTxtBx.sendKeys(Helper.getData("CreateTaskDetails", row, 10));
		objIndexPage.LeadownerTxtBx.click();
		objIndexPage.selectTaskTyprDrp(Helper.getData("CreateTaskDetails", row, 11));
		
	
		((JavascriptExecutor) driver).executeScript("scroll(0, 500);");

		
		
	}
	
		public void TaskNoofDaysChkBx(int row) throws Exception {
		
		objIndexPage.TaskNoofDaysChkBx.click();
		objIndexPage.StartDate.sendKeys(Helper.getData("CreateTaskDetails", row, 16));
	objIndexPage.EndDate.sendKeys(Helper.getData("CreateTaskDetails", row, 17));
	//objIndexPage.EndDays.sendKeys(Helper.getData("CreateTaskDetails", row, 18));
	objIndexPage.AddSkipDays.click();
	objIndexPage.TuesdayChkBx.click();
	objIndexPage.ReminderTxtBx1.sendKeys(Helper.getData("CreateTaskDetails", row, 27));
	objIndexPage.selectSelectDurationDrp1(Helper.getData("CreateTaskDetails", row, 28));
	objIndexPage.selectSelectScheduleDrp1(Helper.getData("CreateTaskDetails", row, 29));
	objIndexPage.PlusBtn.click();
	objIndexPage.ReminderTxtBx2.sendKeys(Helper.getData("CreateTaskDetails", row, 30));
	objIndexPage.selectSelectDurationDrp2(Helper.getData("CreateTaskDetails", row, 31));
	objIndexPage.selectSelectScheduleDrp2(Helper.getData("CreateTaskDetails", row, 32));
}
	
		
		
//		objIndexPage.VisibleChkBx.click();
//		objIndexPage.AttachmentClick.click();
//		objIndexPage.AttachmentInput.sendKeys(Helper.getData("CreateTaskDetails", row, 20));
		
//		WebElement uploadElement = driver.findElement(By.xpath("//*[@id='divAttachment']/div[1]/span"));
//		// uploadElement.sendKeys(Helper.getData("CreateTaskDetails", row, 20));
//		uploadElement.sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Tulips.jpg");

		
	
	public void CreateTaskSaveBtn() throws Exception {
		
		objIndexPage.TaskSaveBtn.click();
	}
	
    public void CreateTaskSaveAndNewBtn() throws Exception {
		
		objIndexPage.SaveandNewBtn.click();
	}
	
    public void CreateTaskResetBtn() throws Exception {
		
		objIndexPage.ResetBtn.click();
	}
}
