package MarketPlace_Tests;

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
import MarketplacePage_PageObject.MarketplaceHotelsPage;
import utilityLibrary.Helper;

public class MarketplaceTicketsTest {

	WebDriver driver;
	LoginPage objLoginPage;
	HomePage objHomePage;
	IndexPages objIndexPage;
	MarketplaceHotelsPage objMarketplaceHotelsPage;
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

		// driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	@Test(description = "MarketPlace with Tickets",groups = { "Sanity"} )
	public void MarketPlaceTickets() throws Exception {

//		 ExtentTestManager.getTest().setDescription("Market Place with Tickets");

		Thread.sleep(2000);
		objIndexPage.marketPlaceMainLnk.click();
		Thread.sleep(2000);
		//objIndexPage.marketPlacesSubLnk.click();
		Thread.sleep(2000);
		objIndexPage.TicketsTabLnk.click();
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200)");
		// Market Place Tickets

		for (int i = 1; i <= Helper.getLastRowMarketPlaceTickets(); i++) {

			Thread.sleep(2000);
			objIndexPage.AddNewTicketBtn.click();
			Thread.sleep(5000);

			Thread.sleep(2000);
			objIndexPage.EventNameDropDwn(Helper.getLastRowMarketPlaceTickets(i, 2));
			Thread.sleep(2000);
			objIndexPage.TransactionChargesTicketsDrpDwn(Helper.getLastRowMarketPlaceTickets(i, 3));
			objIndexPage.salesStartDateTicket.clear();
			objIndexPage.salesStartDateTicket.sendKeys(Helper.getLastRowMarketPlaceTickets(i, 4));
			objIndexPage.salesEndDateTicket.clear();
			objIndexPage.salesEndDateTicket.sendKeys(Helper.getLastRowMarketPlaceTickets(i, 5));
			objIndexPage.ticketsAllowPerOrderTxtBx.clear();
			objIndexPage.ticketsAllowPerOrderTxtBx.sendKeys(Helper.getLastRowMarketPlaceTickets(i, 6));
			objIndexPage.SetLandingPageChkBtn(Helper.getLastRowMarketPlaceTickets(i, 7));
			objIndexPage.SetLandingPageURLTxtBx.sendKeys(Helper.getLastRowMarketPlaceTickets(i, 8));
			objIndexPage.AllAttendeesToRegisterChkBx.click();
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 1000)");
			Thread.sleep(2000);
			objIndexPage.ReturnPolicyRadioBtn(Helper.getLastRowMarketPlaceTickets(i, 10));

			String ReturnPolicyRadioBtn = (Helper.getLastRowMarketPlaceTickets(i, 10));

			if (ReturnPolicyRadioBtn.equals("Refund")) {
				objIndexPage.RefundTypeDrpDwn.sendKeys(Helper.getLastRowMarketPlaceTickets(i, 11));
				objIndexPage.RefundAmountTxt.sendKeys(Helper.getLastRowMarketPlaceTickets(i, 12));
				objIndexPage.RefundDaysTxtBx.clear();
				objIndexPage.RefundDaysTxtBx.sendKeys(Helper.getLastRowMarketPlaceTickets(i, 13));
				objIndexPage.AddRefundTicketsBtn.click();
				Thread.sleep(2000);
			}

			else {

			}
			objIndexPage.cancellationPolicyTxtBx.clear();
			objIndexPage.cancellationPolicyTxtBx.sendKeys(Helper.getLastRowMarketPlaceTickets(i, 14));
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 1000)");
			Thread.sleep(2000);
			objIndexPage.AddTicketBtnTicket.click();
			objIndexPage.TicketNameTxtBx.sendKeys(Helper.getLastRowMarketPlaceTickets(i, 15));
			objIndexPage.quantityTxtBx.sendKeys(Helper.getLastRowMarketPlaceTickets(i, 16));
			objIndexPage.priceTicketsDropDwn(Helper.getLastRowMarketPlaceTickets(i, 17));
			objIndexPage.PricevalueTxtBx.sendKeys(Helper.getLastRowMarketPlaceTickets(i, 18));
			objIndexPage.SeesionTypeDrpDwn(Helper.getLastRowMarketPlaceTickets(i, 19));
			objIndexPage.AteendeeRegistrationFormDrpDwn(Helper.getLastRowMarketPlaceTickets(i, 20));
			objIndexPage.descriptionTicketsTxtBx.sendKeys(Helper.getLastRowMarketPlaceTickets(i, 21));
			objIndexPage.AddTicketsBtn.click();
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 1500)");
			Thread.sleep(2000);
			objIndexPage.saveTicketBtn.click();
		}

	}

	@AfterTest
	public void tearDown() {
		// closing all the browser windows
		driver.quit();
	}

}
