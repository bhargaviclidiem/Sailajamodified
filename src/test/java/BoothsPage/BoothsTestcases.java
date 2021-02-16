package BoothsPage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


import HomePage_PageObject.HomePage;
import HomePage_PageObject.IndexPage;
import HomePage_PageObject.LoginPage;

public class BoothsTestcases extends BoothsMethods {

	WebDriver driver;
	LoginPage objLoginPage;
	HomePage objHomePage;
	IndexPage objIndexPage;
	JavascriptExecutor js;
	JavascriptExecutor jse;
	public int MultipleData = 0;



@Test (description = "Booths_Event_Additionalfeatures__Include")
public void TestCase101_Booths_Event_Additionalfeatures__Include_Save() throws Exception {
	
	BoothsTestcases jhans = new BoothsTestcases();
	jhans.Login();
	Thread.sleep(2000);

	for (int i = 2; i <= 2;) {
	jhans.Boothslogin(i);
	
	break;
	
}
}
}
