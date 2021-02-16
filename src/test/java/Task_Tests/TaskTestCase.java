package Task_Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import HomePage_PageObject.HomePage;
import HomePage_PageObject.IndexPages;
import HomePage_PageObject.LoginPage;
import SurveyPage_Tests.SurveyTestCase;

public class TaskTestCase extends TaskMethods{

	WebDriver driver;
	LoginPage objLoginPage;
	HomePage objHomePage;
	IndexPages objIndexPage;
	JavascriptExecutor js;

	// Test Cases

	@Test(description = "Creation of Task Details page", groups = { "Sanity" })
	public void TestCase701_CreateTaskDetails() throws Exception {

		// ExtentTestManager.getTest().setDescription("Creation of Task Details
		// page");

		TaskTestCase sat1 = new TaskTestCase();

		sat1.Login();

		for (int i = 2; i <= 2;) {

			sat1.CreateTaskDetails(i);
			sat1.TaskNoofDaysChkBx(i);
			sat1.CreateTaskSaveBtn();

			break;
		}

		// sat1.CloseWindow();

	}



//@Test(description = "Creation of Task Details page", groups = { "Sanity" })
public void TestCase702_CreateTaskDetails() throws Exception {

	// ExtentTestManager.getTest().setDescription("Creation of Task Details
	// page");

	TaskTestCase sat2 = new TaskTestCase();

	sat2.Login();

	for (int i = 2; i <= 2;) {

		sat2.CreateTaskDetails(i);
		sat2.CreateTaskSaveBtn();

		break;
	}

	// sat1.CloseWindow();

}

}
