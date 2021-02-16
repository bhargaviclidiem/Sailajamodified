
package Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
/**
 * @author mujeeb.mohammed
 *
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
/*
 * import digitalFrontDoor_POM.DFDHomePage; import
 * digitalFrontDoor_POM.DSDCostEstimatorPage; import
 * digitalFrontDoor_POM.EditSolutionTeamPage; import
 * digitalFrontDoor_POM.LoginPage; import
 * digitalFrontDoor_POM.NewPropSplstRqstPage; import
 * digitalFrontDoor_POM.NewSARequestPage; import
 * digitalFrontDoor_POM.NewSMErequestPage; import
 * digitalFrontDoor_POM.SolutionIntegratorAllocationPage; import
 * utilitiesFunctionLibrary.Utility; import utilityLibrary.Helper;
 */
/*
public class BaseTest {
	public WebDriver driver;
	public WebDriverWait wait;
	public Helper objUtility;
	//public Utility objUtility;
	public DFDHomePage objDFDHomePage;
	public LoginPage objLoginPage;
	public NewSARequestPage objNewSARequestPage;
	public NewSMErequestPage objNewSMErequestPage;
	public NewPropSplstRqstPage objNewPropSplstRqstPage;
	public SolutionIntegratorAllocationPage objSIAllocationPage;
	public EditSolutionTeamPage objEditSolTeamPage;
	public DSDCostEstimatorPage objDSDCostEstimatorPage;
	public Actions actions;
	public Robot robot;
	public JavascriptExecutor jse;
	public String decryptedPassword, encryptedPassword, userName, dateStr, siMessage, requestNumberMsg, requestNumber, value;
	public ArrayList<String> tabs2;
	public List<WebElement> oppDetailsElementList;
	public List<String> OppDetailsList;
	
	 
	public Exception ex;
	

	public WebDriver getDriver() {
		return driver;
	}

	@SuppressWarnings("deprecation")
	@BeforeClass
	public void setup() throws Exception {
		// Launch the Browser
		objUtility = new Helper();
		driver = objUtility.OpenApp(objUtility.getDFDData(1, "Login"), objUtility.getDFDData(2, "Login"));
		Thread.sleep(10000);
		// log into the portal
		if (("Sign In").equalsIgnoreCase(driver.getTitle())) {
			driver = objUtility.dfdLogin(objUtility.getDFDData(3, "Login"));
			Thread.sleep(10000);
		}
		Reporter.log("Entering into the test execution", true);
		Thread.sleep(10000);
		freemarker.log.Logger.selectLoggerLibrary(freemarker.log.Logger.LIBRARY_NONE);
		objDFDHomePage = new DFDHomePage(driver);
		objNewSARequestPage = new NewSARequestPage(driver);
		objSIAllocationPage = new SolutionIntegratorAllocationPage(driver);
		objEditSolTeamPage = new EditSolutionTeamPage(driver);
		jse = (JavascriptExecutor) driver;
		actions = new Actions(driver);
		objEditSolTeamPage = new EditSolutionTeamPage(driver);
		wait = new WebDriverWait(driver, 360);
		objNewPropSplstRqstPage = new NewPropSplstRqstPage(driver);
		try {
			robot = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@AfterClass
	public void teardown() {
	//	driver.quit();
	}

}*/
