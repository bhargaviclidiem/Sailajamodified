package Task_Tests;

import java.util.ArrayList;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ExtentReports.ExtentTestManager;
import HomePage_PageObject.HomePage;
import HomePage_PageObject.IndexPages;
import HomePage_PageObject.LoginPage;
import utilityLibrary.Helper;

public class TaskTest {

	WebDriver driver;
	LoginPage objLoginPage;
	HomePage objHomePage;
	IndexPages objIndexPage;
	JavascriptExecutor js;

	@BeforeClass
	public void setUp() throws Exception {
		// Open the application under test
		driver = Helper.openAUT(driver);
		objLoginPage = new LoginPage(driver);
		objHomePage = new HomePage(driver);
		objIndexPage = new IndexPages(driver);

		js = (JavascriptExecutor) driver;
		objHomePage.loginLnk.click();
		Thread.sleep(20000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("The number of windows are: " + tabs.size());
		driver.switchTo().window(tabs.get(1));

		// use https://www.base64encode.org/ for encoding and decoding creds
		objLoginPage.login(Helper.getValue("userName"),
				(new String(Base64.getDecoder().decode(Helper.getValue("password")))));
		Thread.sleep(10000);

	}

	@Test(priority = 1, description = "Create Task")
	public void CreateTask() throws Exception {

		// ExtentTestManager.getTest().setDescription("Create Quiz Details");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		objIndexPage.TaskTab.click();
		objIndexPage.CreateTask.click();
Thread.sleep(2000);
		//objIndexPage.selectTaskProjectDrp(Helper.getdataCreateTask(2, 2));
		objIndexPage.TaskNameTxtBx.sendKeys(Helper.getdataCreateTask(2, 3));
		objIndexPage.selectTaskAssigntoDrp(Helper.getdataCreateTask(2, 4));
		objIndexPage.ParticipantsTxtBx.sendKeys(Helper.getdataCreateTask(2, 5));
		objIndexPage.ObserversTxtBx.sendKeys(Helper.getdataCreateTask(2, 6));
		objIndexPage.selectPriorityDrp(Helper.getdataCreateTask(2, 7));
		objIndexPage.selectStatusDrp(Helper.getdataCreateTask(2, 8));
		objIndexPage.SubTaskDrp.sendKeys(Helper.getdataCreateTask(2, 9));
		objIndexPage.LeadownerTxtBx.sendKeys(Helper.getdataCreateTask(2, 10));
		objIndexPage.selectTaskTyprDrp(Helper.getdataCreateTask(2, 11));
		objIndexPage.TaskDescription.sendKeys(Helper.getdataCreateTask(2, 12));
		objIndexPage.StartDate.sendKeys(Helper.getdataCreateTask(2, 13));
		objIndexPage.EndDate.sendKeys(Helper.getdataCreateTask(2, 14));
		
//		objIndexPage.StartDate.sendKeys("01102019 0900am");
//		objIndexPage.EndDate.sendKeys("01152019 0900am");
		objIndexPage.AddSkipDays.click();
//		objIndexPage.ReminderTxtBx.sendKeys(Helper.getdataCreateTask(2, 16));
	//	objIndexPage.selectSelectDurationDrp(Helper.getdataCreateTask(2, 17));
		//objIndexPage.selectSelectScheduleDrp(Helper.getdataCreateTask(2, 18));
		objIndexPage.PlusBtn.click();
		objIndexPage.ReminderTxtBx2.sendKeys(Helper.getdataCreateTask(2, 19));
		objIndexPage.selectSelectDurationDrp2(Helper.getdataCreateTask(2, 20));
		objIndexPage.selectSelectScheduleDrp2(Helper.getdataCreateTask(2, 21));
		objIndexPage.VisibleChkBx.click();
		objIndexPage.AttachmentClick.click();
		objIndexPage.AttachmentInput.sendKeys(Helper.getdataCreateTask(2, 20));
		objIndexPage.TaskSaveBtn.click();

	}

}
