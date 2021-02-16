package SurveyPage_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnsweredSurveysPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id='advancesearch']")
	public WebElement AnsweredSurveyAdvSearchClk;

	@FindBy(xpath = "//*[@id='datatable_fixed_column']/thead/tr[1]/th[2]/input")
	public WebElement SurveySearchNameTxt;
	
	@FindBy(xpath = "//*[@id='datatable_fixed_column']/thead/tr[1]/th[3]/input")
	public WebElement SurveySubmittedOnTxt;
	
	@FindBy(xpath = "//*[@id='datatable_fixed_column']/thead/tr[1]/th[4]/input")
	public WebElement SurveyCreatedByTxt;
	
	@FindBy(xpath = "//*[@id='datatable_fixed_column']/thead/tr[1]/th[5]/input")
	public WebElement SurveySubmittedLanguageTxt;
	
	@FindBy(xpath = "//*[@id='123']")
	public WebElement SurveyNameLnk;
	
	@FindBy(xpath = "//*[@id='divactionsquestionnaire']/button/i")
	public WebElement SurveyActionLnk;
	
	@FindBy(xpath = "//*[@id='123']")
	public WebElement SurveyNameViewLnk;
}
