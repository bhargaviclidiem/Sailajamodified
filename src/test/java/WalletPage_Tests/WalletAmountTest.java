package WalletPage_Tests;

import java.util.ArrayList;
import java.util.Base64;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import HomePage_PageObject.HomePage;
import HomePage_PageObject.IndexPages;
import HomePage_PageObject.LoginPage;
import utilityLibrary.Helper;

public class WalletAmountTest {

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
		js= (JavascriptExecutor)driver;
		
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

	@Test(priority = 1, description = "Add amount to wallet with new credit card")
	public void testCase_601() throws Exception {

		// Wallet main links 
		
		objIndexPage.WalletLnk.click();
		Thread.sleep(5000);
		objIndexPage.AddMoneywallet.click();
		Thread.sleep(5000);
		
		 // Adding money to wallet with new credit card 
		
		objIndexPage.newcard.click();
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		objIndexPage.walletAmount.sendKeys(Helper.getData("WalletAmount", 2, 2));
		Thread.sleep(5000);
		objIndexPage.Zipcode.sendKeys(Helper.getData("WalletAmount", 2, 3));
		Thread.sleep(5000);
		objIndexPage.cardNum.sendKeys(Helper.getData("WalletAmount", 2, 4));
		objIndexPage.ExpirationDate.sendKeys(Helper.getData("WalletAmount", 2, 5));
		objIndexPage.CVV.sendKeys(Helper.getData("WalletAmount", 2, 6));
		
		JavascriptExecutor js1 = ((JavascriptExecutor) driver);
		js1.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		objIndexPage.proceedBtn.click();
		Thread.sleep(10000);
}
	@Test(priority = 1, description = "Add amount to wallet with existing credit card ")
	public void testCase_602() throws Exception {
		
		 // Adding money to wallet with existing credit card 
		
		objIndexPage.WalletLnk.click();
		Thread.sleep(5000);
		objIndexPage.AddMoneytowallet.click();
		Thread.sleep(5000);
		objIndexPage.Amount.sendKeys(Helper.getData("WalletAmount", 2, 7));
		Thread.sleep(5000);
		objIndexPage.Existingcard.click();
		Thread.sleep(3000);
		objIndexPage.Existingcardnum.sendKeys(Helper.getData("WalletAmount", 2, 8));
		Thread.sleep(3000);
		JavascriptExecutor js1 = ((JavascriptExecutor) driver);
		js1.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		
		objIndexPage.proceedBtn.click();
	}
}