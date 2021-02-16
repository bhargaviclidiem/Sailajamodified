package QuizPage_PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateQuizPage {

	WebDriver driver;
	JavascriptExecutor jse;

	// WebElements for Create Quiz Page

	@FindBy(xpath = "//*[@id='filedocumentname']")
	public WebElement QuizImage;
	
	@FindBy(xpath = "//*[@id='btnCrop']")
	public WebElement QuizImageCrop;

	@FindBy(xpath = "//*[@id='selectsurveytemplate']")
	public WebElement SelectTemplate;

	@FindBy(xpath = "//*[@id='selectcategory']")
	public WebElement QuizDurationType;

	public void QuizDurationTypeDrpDwn(String value) {
		Select select = new Select(QuizDurationType);
		select.selectByVisibleText(value);
	}

	@FindBy(xpath = "//*[@id='addnewquestionnaire']/div[2]/div/div[3]/div/div/div[1]/div")
	public WebElement LanguagesBx;

	@FindBy(xpath = "//*[@id='addnewquestionnaire']/div[2]/div/div[3]/div/div/div[2]/div[1]/input")
	public WebElement LanguagesSearchBx;

	@FindBy(xpath = "//*[@id='addnewquestionnaire']/div[2]/div/div[3]/div/div/div[2]/div[2]/div[not(contains(@class, 'hidden'))]/span")
	public WebElement LanguagesCheckBx;

	public void QuizLanguagesDrpDwn(String value) throws Exception {
		LanguagesBx.click();
		Thread.sleep(2000);
		String strMain = value;
		String[] arrSplit = strMain.split(",");
		for (int i = 0; i < arrSplit.length; i++) {
			LanguagesSearchBx.sendKeys(arrSplit[i].trim());
			LanguagesCheckBx.click();
			Thread.sleep(2000);
			// eventSearch.clear();
		}
	}

	@FindBy(xpath = "//*[@id='textquestionariename']")
	public WebElement QuizName;

	@FindBy(xpath = "//*[@id='textdescription']")
	public WebElement Description;

	@FindBy(xpath = "//*[@id='addnewquestionnaire']/div[3]/div/div[1]/div/label/label/div/i")
	public WebElement SaveTemplateChk;
	
	public void SaveTemplateChkBx(String value) 
	{
				jse = (JavascriptExecutor) driver;
				if (value.equalsIgnoreCase("yes")) 
					{
					jse.executeScript("arguments[0].scrollIntoView(true);", SaveTemplateChk);
					SaveTemplateChk.click();
				} else {
					
				}
			}



	@FindBy(xpath = "//*[@id='texttemplatename']")
	public WebElement SaveTemplateTxtBx;

	@FindBy(xpath = "//*[@id='addnewquestionnaire']/div[3]/div/div[2]/div[1]/label/label/div/i")
	public WebElement SetLandingurlChkBx;

	@FindBy(xpath = "//*[@id='textlandingpage']")
	public WebElement SetLandingurlTxtBx;

	@FindBy(xpath = "//*[@id='addnewquestionnaire']/div[3]/div/div[2]/div[2]/label/label/div/i")
	public WebElement AutoEvaluationChkBx;

	@FindBy(xpath = "//*[@id='TotalQuizdurationDiv']/i[2]")
	public WebElement TotalQuizDurationRadioBtn;

	@FindBy(xpath = "//*[@id='checkEqualDuration']/i[1]")
	public WebElement EqualDurationQuestionsRadioBtn;

	@FindBy(xpath = "//*[@id='checkIndividualDuration']/i[1]")
	public WebElement IndividualQuestionRadioBtn;

	@FindBy(xpath = "//*[@id='textTotalDuration']")
	public WebElement TotalDurationTxtBx;

	@FindBy(xpath = "//*[@id='checkgeneralquiz']/i[2]")
	public WebElement GeneralQuizRadioBtn;

	@FindBy(xpath = "//*[@id='checkfortriviaquizdiv']/i[1]")
	public WebElement TriviaRadioBtn;

	@FindBy(xpath = "//*[@id='checkEqualWeightageDiv']/i[2]")
	public WebElement EqualWeightageRadioBtn;

	@FindBy(xpath = "//*[@id='checkIndividualWeightageDiv']/i[1]")
	public WebElement IndividualWeightageRadioBtn;

	@FindBy(xpath = "//*[@id='textEqualWeightageScore']")
	public WebElement EqualWeightageTxtBx;

	@FindBy(xpath = "//*[@id='nextQuizQuestionsid']")
	public WebElement NextQuizDetailBtn;

}
