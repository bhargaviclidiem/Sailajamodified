package HomePage_Tests;

import java.util.ArrayList;
import java.util.Base64;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import HomePage_PageObject.HomePage;
import HomePage_PageObject.IndexPage;
import HomePage_PageObject.LoginPage;
import utilityLibrary.Helper;

public class RegisterLogin {

	WebDriver driver;
	LoginPage objLoginPage;
	HomePage objHomePage;
	IndexPage objIndexPage;
	JavascriptExecutor js;

@BeforeClass
public void setUp() throws Exception {
	// Open the application under test
	driver = Helper.openAUT(driver);
	objLoginPage = new LoginPage(driver);
	objHomePage = new HomePage(driver);
	objIndexPage = new IndexPage(driver);

	
}

@Test(priority = 1, description = "Verify create Event")
public void testCase_01() throws Exception {
	objIndexPage.RegisterLnk.click();
	Thread.sleep(20000);
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	System.out.println("The number of windows are: " + tabs.size());
	driver.switchTo().window(tabs.get(1));
//	objLoginPage.login(Helper.getValue("userName"),
//			(new String(Base64.getDecoder().decode(Helper.getValue("password")))));
	Thread.sleep(10000);
	
	objIndexPage.OrgYourname.sendKeys(Helper.getData("OrgRegister", 2, 2));
	Thread.sleep(2000);
	
	objIndexPage.Orglastname.sendKeys(Helper.getData("OrgRegister", 2, 15));
	objIndexPage.OrgName.sendKeys(Helper.getData("OrgRegister", 2, 3));
	Thread.sleep(2000);
	objIndexPage.OrgEmailID.sendKeys(Helper.getData("OrgRegister", 2, 4));
	Thread.sleep(2000);
	objIndexPage.OrgCountyrDrpDwn(Helper.getData("OrgRegister", 2, 5));
	Thread.sleep(2000);
	objIndexPage.OrgContactNum.sendKeys(Helper.getData("OrgRegister", 2, 6));
	Thread.sleep(2000);
	objIndexPage.OrgPassword.sendKeys(Helper.getData("OrgRegister", 2, 9));
	Thread.sleep(2000);
	objIndexPage.OrgPasswordConf.sendKeys(Helper.getData("OrgRegister", 2, 10));
	Thread.sleep(20000);
	//objIndexPage.OrgCodeTxt.sendKeys(Helper.getData("OrgRegister", 2, 11));
	Thread.sleep(10000);
	objIndexPage.OrgCode.sendKeys(Helper.getData("OrgRegister", 2, 12));
	Thread.sleep(2000);
	objIndexPage.OrgAgreeChkBx.click();
	Thread.sleep(2000);
	objIndexPage.OrgRegisterBtn.click();
	Thread.sleep(10000);
	objIndexPage.VerificationTxtBx.click();
	Thread.sleep(20000);
	objIndexPage.VerifyBtn.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}