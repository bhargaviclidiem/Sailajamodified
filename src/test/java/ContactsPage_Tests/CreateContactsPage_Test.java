package ContactsPage_Tests;

import java.util.ArrayList;
import java.util.Base64;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ContactsPage_PageObject.CreateContactsPage;
import HomePage_PageObject.HomePage;
import HomePage_PageObject.IndexPages;
import HomePage_PageObject.LoginPage;
import utilityLibrary.Helper;

public class CreateContactsPage_Test {

	WebDriver driver;
	LoginPage objLoginPage;
	HomePage objHomePage;
	IndexPages objIndexPage;
	CreateContactsPage objCreateContactsPage;
	JavascriptExecutor js;

	@BeforeClass
	public void setUp() throws Exception {
		// Open the application under test
		driver = Helper.openAUT(driver);
		objLoginPage = new LoginPage(driver);
		objHomePage = new HomePage(driver);
		objIndexPage = new IndexPages(driver);
		objCreateContactsPage = new CreateContactsPage(driver);
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

	@Test(priority = 1, description = "Verify Create Contacts")
	public void testCase_201() throws Exception {

		for (int i = 1; i <= Helper.getLastRowCreateContacts(); i++) {
			
		
		Thread.sleep(5000);
		objCreateContactsPage.ContactsTab.click();
		objCreateContactsPage.CreateContacts.click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 500)");
		objCreateContactsPage.ContactGrpDrpDwn.click();
		objCreateContactsPage.ContactGrpAddButton.click();
		objCreateContactsPage.AddnameTxtBx.sendKeys(Helper.getData("CreateContacts", 2, 14));
		objCreateContactsPage.UsersaddBtn.click();
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, -500)");
		Thread.sleep(3000);
		objCreateContactsPage.ContactIDTxtBx.sendKeys(Helper.getData("CreateContacts", 2, 2));
		objCreateContactsPage.FirstNameTxtBx.sendKeys(Helper.getData("CreateContacts", 2, 3));
		objCreateContactsPage.MiddleNameTxtBx.sendKeys(Helper.getData("CreateContacts", 2, 4));
		objCreateContactsPage.LastNameTxtBX.sendKeys(Helper.getData("CreateContacts", 2, 5));
		objCreateContactsPage.DateofBirth.sendKeys(Helper.getData("CreateContacts", 2, 6));
		objCreateContactsPage.selectMaritalstatusDrpDwn(Helper.getData("CreateContacts", 2, 7));
		objCreateContactsPage.selectGenderDrpDwn(Helper.getData("CreateContacts", 2, 8));
		objCreateContactsPage.EmailidTxtBx.sendKeys(Helper.getData("CreateContacts", 2, 9));
		objCreateContactsPage.selectPhonenumDrpDwn(Helper.getData("CreateContacts", 2, 10));
		objCreateContactsPage.PhoneNumTxtBx.sendKeys(Helper.getData("CreateContacts", 2, 11));
		objCreateContactsPage.selectlanguageDrpDwn(Helper.getData("CreateContacts", 2, 12));
		Thread.sleep(5000);
		objCreateContactsPage.selectContactsGrpDrpDwn(Helper.getData("CreateContacts", 2, 13));

		objCreateContactsPage.AgeTxtBx.sendKeys(Helper.getData("CreateContacts", 2, 17));

		objCreateContactsPage.AddressTxtBx.sendKeys(Helper.getData("CreateContacts", 2, 18));
		objCreateContactsPage.StreetTxtBx.sendKeys(Helper.getData("CreateContacts", 2, 19));
		objCreateContactsPage.CityTxtBx.sendKeys(Helper.getData("CreateContacts", 2, 20));
		objCreateContactsPage.CountryTxtBx.sendKeys(Helper.getData("CreateContacts", 2, 21));
		objCreateContactsPage.StateTxtBx.sendKeys(Helper.getData("CreateContacts", 2, 22));
		objCreateContactsPage.ZIPCodeTxtBx.sendKeys(Helper.getData("CreateContacts", 2, 23));
		objCreateContactsPage.AlternateEmailidTxtBx.sendKeys(Helper.getData("CreateContacts", 2, 24));
		objCreateContactsPage.selectHighestDrpDwnDrpDwn(Helper.getData("CreateContacts", 2, 25));
		objCreateContactsPage.MajorStudyTxtBx.sendKeys(Helper.getData("CreateContacts", 2, 26));
		objCreateContactsPage.InstituteTxtBx.sendKeys(Helper.getData("CreateContacts", 2, 27));
		objCreateContactsPage.CompanyName.sendKeys(Helper.getData("CreateContacts", 2, 28));
		objCreateContactsPage.JobTitleTxtBx.sendKeys(Helper.getData("CreateContacts", 2, 29));
		objCreateContactsPage.TagsTxtBx.sendKeys(Helper.getData("CreateContacts", 2, 30));

		String Rating = Helper.getData("CreateContacts", 2, 31);

		if (Rating.contains("1")) {
			objCreateContactsPage.Rating1.click();
		} else if (Rating.contains("2")) {
			objCreateContactsPage.Rating2.click();
		} else if (Rating.contains("3")) {
			objCreateContactsPage.Rating3.click();
		} else if (Rating.contains("4")) {
			objCreateContactsPage.Rating4.click();
		} else if (Rating.contains("5")) {
			objCreateContactsPage.Rating5.click();
		} else if (Rating.contains("6")) {
			objCreateContactsPage.Rating6.click();
		} else if (Rating.contains("7")) {
			objCreateContactsPage.Rating7.click();
		} else if (Rating.contains("8")) {
			objCreateContactsPage.Rating8.click();
		} else if (Rating.contains("9")) {
			objCreateContactsPage.Rating9.click();
		} else {
			objCreateContactsPage.Rating10.click();
		}
		
		objCreateContactsPage.OtherAddressTxtBx.sendKeys(Helper.getData("CreateContacts", 2, 38));
		objCreateContactsPage.OtherStreetTxtBx.sendKeys(Helper.getData("CreateContacts", 2, 39));
		objCreateContactsPage.OtherCityTxtBx.sendKeys(Helper.getData("CreateContacts", 2, 40));
		objCreateContactsPage.OtherCountryTxtBx.sendKeys(Helper.getData("CreateContacts", 2, 41));
		objCreateContactsPage.OtherStateTxtBx.sendKeys(Helper.getData("CreateContacts", 2, 42));
		objCreateContactsPage.OtherZIPCodeTxtBx.sendKeys(Helper.getData("CreateContacts", 2, 43));
		objCreateContactsPage.selectSalesLeadSourceDrpDwn(Helper.getData("CreateContacts", 2, 44));
		objCreateContactsPage.selectSalesLeadStatusDrpDwn(Helper.getData("CreateContacts", 2, 45));
		objCreateContactsPage.selectSalesLeadStageDrpDwn(Helper.getData("CreateContacts", 2, 46));
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 3000)");
		objCreateContactsPage.selectSalesSubscriptionTypeDrpDwn(Helper.getData("CreateContacts", 2, 47));
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 1500)");
		Thread.sleep(2000);

		objCreateContactsPage.SaveBtn.click();
		}
	}

}
