package BasePackage;

import java.util.ArrayList;
import java.util.Base64;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import HomePage_PageObject.HomePage;
import HomePage_PageObject.IndexPages;
import HomePage_PageObject.LoginPage;
import SurveyPage_PageObjects.CreateSurveyQuestionsPage;
import SurveyPage_PageObjects.SurveyQuestionsPage;
import utilityLibrary.Helper;

public class BaseTest { //this name used in TestListener class for driver variable

	public static WebDriver driver;
	LoginPage objLoginPage;
	HomePage objHomePage;
	IndexPages objIndexPage;
	JavascriptExecutor js;

	
public static WebDriver setup() throws Exception {
		
		// Open the application under test
	   driver = Helper.openAUT(driver);
		
			return driver;
	}	
			 
}
