package utilityLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import org.apache.commons.io.FileUtils;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Helper {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	HSSFCell cell;

	// Retrieve current date in the yyyyMMddHHmmss format
	public static String currentDateStr() {
		// Date to String
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
		String dateStr = dateFormat.format(date);
		// Reporter.log("The current date is "+d,true);
		return dateStr;

	}

	// Retrieve current date in the yyyy_MM_dd_HH_mm_ss format
	public String dateString() {
		// Date to String
		String d;
		DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		Date date = new Date();
		d = dateFormat.format(date);
		// Reporter.log("The current date is "+d,true);
		return d;

	}

	// Take Screenshot of the web page
	public static void takeScreenshot(WebDriver driver) throws Exception {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,
				new File(System.getProperty("user.dir") + "\\Screenshots\\" + currentDateStr() + ".png"));
	}

	// write into excel in second column and in given row
	public void writeDataToExcel(int rowNum, String dataToWrite) throws IOException {
		String path = System.getProperty("user.dir") + "\\DataResource\\Data Sheet_Output.xlsx";
		// Reporter.log(System.getProperty("user.dir"),true);
		// Reporter.log(path,true);
		ExcelOperations.writeExcel(path, "Sheet1", rowNum, 2, dataToWrite);
	}

	// write into excel in second column and in given row
	public String readDataFromExcel(int rowNum) throws IOException {
		String path = System.getProperty("user.dir") + "\\DataResource\\Data Sheet.xlsx";
		return ExcelOperations.readExcel(path, "Sheet1", rowNum, 2);
	}

	// Open Web Application

	public static WebDriver openAUT(WebDriver driver) throws Exception {
		String browserName = getValue("browserName");
		String url = getValue("url");

		// launch browser and navigate to the url

		if (("chrome").equalsIgnoreCase(browserName)) {
			System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (("ff").equalsIgnoreCase(browserName)) {
			System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (("ie").equalsIgnoreCase(browserName)) {
			System.setProperty("webdriver.ie.driver", "Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(10000);
		return driver;
	}

	public static String getValue(String name) throws Exception {
		// Use Properties file to store the credentials
		Properties prop = new Properties();
		File file = new File(System.getProperty("user.dir") + "//DataSource//Datafile.properties");
		System.out.println(System.getProperty("user.dir") + "//DataSource//Datafile.properties");
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
		return prop.getProperty(name);
	}

	// Read data from excel for DFD, column 2
	public static String getDFDData(int rowNum, String SheetName) throws IOException {//2,LoginPage
		String path = System.getProperty("user.dir") + "\\DataSource\\Data Sheet.xlsx";
		System.out.println(path);
		System.out.println(SheetName);
		System.out.println(rowNum);//
		return ExcelOperations.readExcel(path, SheetName, rowNum - 1, 1);//(path,LoginPage,1,1)
		//sailu_return ExcelOperations.readExcel(path, SheetName, rowNum, 2);
	}

	// Read data from excel for DFD, column 3
	public static String getDFDData2(int rowNum, String SheetName) throws IOException {
		String path = System.getProperty("user.dir") + "\\DataSource\\Data Sheet.xlsx";
		return ExcelOperations.readExcel(path, SheetName, rowNum - 1, 2);
	}

	// Read data from excel for DFD, column 2
	public static String getData(String SheetName, int rowNum, int colNum) throws IOException {
		String path = System.getProperty("user.dir") + "\\DataSource\\Data Sheet.xlsx";
		return ExcelOperations.readExcel(path, SheetName, rowNum - 1, colNum - 1);
	}
	
	public static int getLastRowTrivia() throws IOException {

		// Import excel sheet.
		File src = new File(System.getProperty("user.dir") + "//DataSource//Data Sheet.xlsx");

		// Load the file.
		FileInputStream finput = new FileInputStream(src);

		// Load he workbook.
		workbook = new XSSFWorkbook(finput);

		// Load the sheet in which data is stored.
		sheet = workbook.getSheet("CreateTriviaQuiz");

		return sheet.getLastRowNum();
	}
	
	public static int getLastRowEventPresenter() throws IOException {

		// Import excel sheet.
		File src = new File(System.getProperty("user.dir") + "//DataSource//Data Sheet.xlsx");

		// Load the file.
		FileInputStream finput = new FileInputStream(src);

		// Load he workbook.
		workbook = new XSSFWorkbook(finput);

		// Load the sheet in which data is stored.
		sheet = workbook.getSheet("CreateEventPresenter");

		return sheet.getLastRowNum();
	}
		
	public static int getLastRowSurveySingleWinner() throws IOException {

		// Import excel sheet.
		File src = new File(System.getProperty("user.dir") + "//DataSource//Data Sheet.xlsx");

		// Load the file.
		FileInputStream finput = new FileInputStream(src);

		// Load he workbook.
		workbook = new XSSFWorkbook(finput);

		// Load the sheet in which data is stored.
		sheet = workbook.getSheet("SurveySingleWinner");

		return sheet.getLastRowNum();
	}
	
	// Read data from excel for SurveyData
		public static String getLoginDetails(int rowNum, int colNum) throws IOException {
			return ExcelOperations.readExcel(System.getProperty("user.dir") + "//DataSource//Survey Data Sheet.xlsx", "LoginPage",
					rowNum, colNum);
		}

	// Read data from excel for SurveyData
	public static String getSurveyData(int rowNum, int colNum) throws IOException {
		return ExcelOperations.readExcel(System.getProperty("user.dir") + "//DataSource//Data Sheet.xlsx", "SurveyData",
				rowNum, colNum);
	}

	// Read data from excel for Survey Questions page
	public static String getSurveyQuestions(int rowNum, int colNum) throws IOException {
		return ExcelOperations.readExcel(System.getProperty("user.dir") + "//DataSource//Data Sheet.xlsx",
				"CreateSurveyQuestions", rowNum, colNum - 1);
	}

	// Read data from excel for Create Events page
	public static String getEvents(int rowNum, int colNum) throws IOException {
		return ExcelOperations.readExcel(System.getProperty("user.dir") + "//DataSource//Data Sheet.xlsx",
				"CreateEventPage", rowNum, colNum - 1);
	}

	// Read data from excel for Market place for Market place Products
	public static String getLastRowMarketPlaceProdcut(int rowNum, int colNum) throws IOException {
		return ExcelOperations.readExcel(System.getProperty("user.dir") + "//DataSource//Data Sheet.xlsx",
				"MarketPlace-Products", rowNum, colNum - 1);
	}

	// Read data from excel for Market place for Market place Tickets
	public static String getLastRowMarketPlaceTickets(int rowNum, int colNum) throws IOException {
		return ExcelOperations.readExcel(System.getProperty("user.dir") + "//DataSource//MarketPlace Data Sheet.xlsx",
				"MarketPlace-Tickets", rowNum, colNum - 1);
	}

	// Read data from excel for Market place for Market place Services
	public static String getLastRowMarketPlaceServices(int rowNum, int colNum) throws IOException {
		return ExcelOperations.readExcel(System.getProperty("user.dir") + "//DataSource//MarketPlace Data Sheet.xlsx",
				"MarketPlace-Services", rowNum, colNum - 1);
	}

	// Read data from excel for Market place for Market place Hotels
	public static String getLastRowMarketPlaceHotels(int rowNum, int colNum) throws IOException {
		return ExcelOperations.readExcel(System.getProperty("user.dir") + "//DataSource//MarketPlace Data Sheet.xlsx",
				"MarketPlace-Hotels", rowNum, colNum - 1);
	}

	// Read data from excel for Market place for Market place Sponsors
	public static String getLastRowMarketPlaceSponsors(int rowNum, int colNum) throws IOException {
		return ExcelOperations.readExcel(System.getProperty("user.dir") + "//DataSource//Data Sheet.xlsx",
				"MarketPlace-Sponsors", rowNum, colNum - 1);
	}

	// Read data from excel for Market place for Market place Sponsors
	public static String getLastRowMarketPlaceCouponCodes(int rowNum, int colNum) throws IOException {
		return ExcelOperations.readExcel(System.getProperty("user.dir") + "//DataSource//MarketPlace Data Sheet.xlsx",
				"MarketPlace-CouponCodes", rowNum, colNum - 1);
	}

	// get Last row for SurveyData
	public static int getLastRowMarketPlaceCouponCodes() throws IOException {

		// Import excel sheet.
		File src = new File(System.getProperty("user.dir") + "//DataSource//MarketPlace Data Sheet.xlsx");

		// Load the file.
		FileInputStream finput = new FileInputStream(src);

		// Load he workbook.
		workbook = new XSSFWorkbook(finput);

		// Load the sheet in which data is stored.
		sheet = workbook.getSheet("MarketPlace-CouponCodes");

		return sheet.getLastRowNum();
	}

	// get Last row for SurveyData
	public static int getLastRowSD() throws IOException {

		// Import excel sheet.
		File src = new File(System.getProperty("user.dir") + "//DataSource//Data Sheet.xlsx");

		// Load the file.
		FileInputStream finput = new FileInputStream(src);

		// Load he workbook.
		workbook = new XSSFWorkbook(finput);

		// Load the sheet in which data is stored.
		sheet = workbook.getSheet("SurveyData");

		return sheet.getLastRowNum();
	}

	// get Last row for Survey Questions
	public static int getLastRowSQ() throws IOException {

		// Import excel sheet.
		File src = new File(System.getProperty("user.dir") + "//DataSource//Data Sheet.xlsx");

		// Load the file.
		FileInputStream finput = new FileInputStream(src);

		// Load he workbook.
		workbook = new XSSFWorkbook(finput);

		// Load the sheet in which data is stored.
		sheet = workbook.getSheet("CreateSurveyQuestions");

		return sheet.getLastRowNum();
	}

	// get Last row for Create Event Page
	public static int getLastRowEvent() throws IOException {

		// Import excel sheet.
		File src = new File(System.getProperty("user.dir") + "//DataSource//Data Sheet.xlsx");

		// Load the file.
		FileInputStream finput = new FileInputStream(src);

		// Load he workbook.
		workbook = new XSSFWorkbook(finput);

		// Load the sheet in which data is stored.
		sheet = workbook.getSheet("CreateEventPage");

		return sheet.getLastRowNum();
	}

	// get Last row for Market place for Marketplace - Products
	public static int getLastRowMarketPlaceProdcut() throws IOException {

		// Import excel sheet.
		File src = new File(System.getProperty("user.dir") + "//DataSource//Data Sheet.xlsx");

		// Load the file.
		FileInputStream finput = new FileInputStream(src);

		// Load he workbook.
		workbook = new XSSFWorkbook(finput);

		// Load the sheet in which data is stored.
		sheet = workbook.getSheet("MarketPlace-Products");

		return sheet.getLastRowNum();
	}

	// get Last row for Market place for MarketPlace - Tickets
	public static int getLastRowMarketPlaceTickets() throws IOException {

		// Import excel sheet.
		File src = new File(System.getProperty("user.dir") + "//DataSource//MarketPlace Data Sheet.xlsx");

		// Load the file.
		FileInputStream finput = new FileInputStream(src);

		// Load he workbook.
		workbook = new XSSFWorkbook(finput);

		// Load the sheet in which data is stored.
		sheet = workbook.getSheet("MarketPlace-Tickets");

		return sheet.getLastRowNum();
	}

	// get Last row for Market place for Marketplace - Services
	public static int getLastRowMarketPlaceServices() throws IOException {

		// Import excel sheet.
		File src = new File(System.getProperty("user.dir") + "//DataSource//MarketPlace Data Sheet.xlsx");

		// Load the file.
		FileInputStream finput = new FileInputStream(src);

		// Load he workbook.
		workbook = new XSSFWorkbook(finput);

		// Load the sheet in which data is stored.
		sheet = workbook.getSheet("MarketPlace-Services");

		return sheet.getLastRowNum();
	}

	// get Last row for Market place for Marketplace - Hotels
	public static int getLastRowMarketPlaceHotels() throws IOException {

		// Import excel sheet.
		File src = new File(System.getProperty("user.dir") + "//DataSource//MarketPlace Data Sheet.xlsx");

		// Load the file.
		FileInputStream finput = new FileInputStream(src);

		// Load he workbook.
		workbook = new XSSFWorkbook(finput);

		// Load the sheet in which data is stored.
		sheet = workbook.getSheet("MarketPlace-Hotels");

		return sheet.getLastRowNum();
	}

	// get Last row for Market place for Marketplace - Sponsors
	public static int getLastRowMarketPlaceSponsors() throws IOException {

		// Import excel sheet.
		File src = new File(System.getProperty("user.dir") + "//DataSource//Data Sheet.xlsx");

		// Load the file.
		FileInputStream finput = new FileInputStream(src);

		// Load he workbook.
		workbook = new XSSFWorkbook(finput);

		// Load the sheet in which data is stored.
		sheet = workbook.getSheet("MarketPlace-Sponsors");

		return sheet.getLastRowNum();
	}

	// Read data from excel for Market place for Market place Sponsors
		public static String getLastRowSurveyTestCases(int rowNum, int colNum) throws IOException {
			return ExcelOperations.readExcel(System.getProperty("user.dir") + "//DataSource//Survey Data Sheet.xlsx",
					"SurveyTestCases", rowNum, colNum - 1);
		}
		
		public static String getDataSurveyDetailPage(String SheetName, int rowNum, int colNum) throws IOException {
			String path = System.getProperty("user.dir") + "//DataSource//Survey Data Sheet.xlsx";
			return ExcelOperations.readExcel(path, SheetName, rowNum - 1, colNum - 1);
		}
		
	
		public static int getLastRowSurveyDetailPage() throws IOException {

			// Import excel sheet.
			File src = new File(System.getProperty("user.dir") + "//DataSource//Survey Data Sheet.xlsx");

			// Load the file.
			FileInputStream finput = new FileInputStream(src);

			// Load he workbook.
			workbook = new XSSFWorkbook(finput);

			// Load the sheet in which data is stored.
			sheet = workbook.getSheet("SurveyTestCases");

			return sheet.getLastRowNum();
		}
		
	// Read data from excel for Market place for Market place Sponsors
	public static String getLastRowRewardsSingleWinner(int rowNum, int colNum) throws IOException {
		return ExcelOperations.readExcel(System.getProperty("user.dir") + "//DataSource//Survey Data Sheet.xlsx",
				"SurveyRewardSingleMultiple", rowNum, colNum - 1);
	}
	
		
	public static String getDataSurveyDetial(String string, int rowNum, int colNum) throws IOException {
		return ExcelOperations.readExcel(System.getProperty("user.dir") + "//DataSource//Survey Data Sheet.xlsx",
				"SurveyRewardSingleMultiple", rowNum, colNum - 1);
	}

	// get Last row for Survey Rewards Single Winners
	public static int getLastRowRewardsSingleWinner() throws IOException {

		// Import excel sheet.
		File src = new File(System.getProperty("user.dir") + "//DataSource//Survey Data Sheet.xlsx");

		// Load the file.
		FileInputStream finput = new FileInputStream(src);

		// Load he workbook.
		workbook = new XSSFWorkbook(finput);

		// Load the sheet in which data is stored.
		sheet = workbook.getSheet("SurveyRewardSingleMultiple");

		return sheet.getLastRowNum();
	}

	// Read data from excel for Market place for Market place Tickets
	public static String getLastRowSurveyMultipleWinner(int rowNum, int colNum) throws IOException {
		return ExcelOperations.readExcel(System.getProperty("user.dir") + "//DataSource//Survey Data Sheet.xlsx",
				"SurveyRewardMultipleWinner", rowNum, colNum - 1);
	}

	// get Last row for Market place for MarketPlace - Tickets
	public static int getLastRowSurveyMultipleWinner() throws IOException {

		// Import excel sheet.
		File src = new File(System.getProperty("user.dir") + "//DataSource//Survey Data Sheet.xlsx");

		// Load the file.
		FileInputStream finput = new FileInputStream(src);

		// Load he workbook.
		workbook = new XSSFWorkbook(finput);

		// Load the sheet in which data is stored.
		sheet = workbook.getSheet("SurveyRewardMultipleWinner");

		return sheet.getLastRowNum();
	}

	// Read data from excel for Market place for Create Contacts
	public static String getdataCreateContacts(int rowNum, int colNum) throws IOException {
		return ExcelOperations.readExcel(System.getProperty("user.dir") + "//DataSource//Data Sheet.xlsx",
				"CreateContacts", rowNum, colNum - 1);
	}

	// get Last row for Create Contacts
	public static int getLastRowCreateContacts() throws IOException {

		// Import excel sheet.
		File src = new File(System.getProperty("user.dir") + "//DataSource//Data Sheet.xlsx");

		// Load the file.
		FileInputStream finput = new FileInputStream(src);

		// Load he workbook.
		workbook = new XSSFWorkbook(finput);

		// Load the sheet in which data is stored.
		sheet = workbook.getSheet("CreateContacts");

		return sheet.getLastRowNum();
	}

	// Read data from excel for Event Speaker page
	public static String getdataEventSpeakers(int rowNum, int colNum) throws IOException {
		return ExcelOperations.readExcel(System.getProperty("user.dir") + "//DataSource//Data Sheet.xlsx",
				"EventSpeakerPage", rowNum, colNum - 1);
	}

	// get Last row for Event Speaker page
	public static int getLastRowEventSpeakers() throws IOException {

		// Import excel sheet.
		File src = new File(System.getProperty("user.dir") + "//DataSource//Data Sheet.xlsx");

		// Load the file.
		FileInputStream finput = new FileInputStream(src);

		// Load he workbook.
		workbook = new XSSFWorkbook(finput);

		// Load the sheet in which data is stored.
		sheet = workbook.getSheet("EventSpeakerPage");

		return sheet.getLastRowNum();
	}

	// Read data from excel for Event Contacts page
	public static String getdataEventContacts(int rowNum, int colNum) throws IOException {
		return ExcelOperations.readExcel(System.getProperty("user.dir") + "//DataSource//Data Sheet.xlsx",
				"EventContactsPage", rowNum, colNum - 1);
	}

	// get Last row for Event Contacts page
	public static int getLastRowEventContacts() throws IOException {

		// Import excel sheet.
		File src = new File(System.getProperty("user.dir") + "//DataSource//Data Sheet.xlsx");

		// Load the file.
		FileInputStream finput = new FileInputStream(src);

		// Load he workbook.
		workbook = new XSSFWorkbook(finput);

		// Load the sheet in which data is stored.
		sheet = workbook.getSheet("EventContactsPage");

		return sheet.getLastRowNum();
	}

	// Read data from excel for Event loop
	public static String getdataEvents(int rowNum, int colNum) throws IOException {
		return ExcelOperations.readExcel(System.getProperty("user.dir") + "//DataSource//Data Sheet.xlsx",
				"CreateEventPage", rowNum, colNum - 1);
	}

	// get Last row for Event loop
	public static int getLastRowEvents() throws IOException {

		// Import excel sheet.
		File src = new File(System.getProperty("user.dir") + "//DataSource//Data Sheet.xlsx");

		// Load the file.
		FileInputStream finput = new FileInputStream(src);

		// Load he workbook.
		workbook = new XSSFWorkbook(finput);

		// Load the sheet in which data is stored.
		sheet = workbook.getSheet("CreateEventPage");

		return sheet.getLastRowNum();
	}

	// EventSurvey360 - Quiz page data sheet

	public static String getdataQuizDetail(int rowNum, int colNum) throws IOException {
		return ExcelOperations.readExcel(System.getProperty("user.dir") + "//DataSource//Quiz Data Sheet.xlsx",
				"QuizDetailsPage", rowNum - 1, colNum - 1);
	}

	// get Last row for Quiz loop
	public static int getLastRowQuizDetail() throws IOException {

		// Import excel sheet.
		File src = new File(System.getProperty("user.dir") + "//DataSource//Quiz Data Sheet.xlsx");

		// Load the file.
		FileInputStream finput = new FileInputStream(src);

		// Load he workbook.
		workbook = new XSSFWorkbook(finput);

		// Load the sheet in which data is stored.
		sheet = workbook.getSheet("QuizDetailsPage");

		return sheet.getLastRowNum();
	}

	// EventSurvey360 - Task page data sheet

	public static String getdataCreateTask(int rowNum, int colNum) throws IOException {
		return ExcelOperations.readExcel(System.getProperty("user.dir") + "//DataSource//Task Data Sheet.xlsx",
				"CreateTask", rowNum - 1, colNum - 1);
	}

	// get Last row for Event loop
	public static int getLastRowCreateTask() throws IOException {

		// Import excel sheet.
		File src = new File(System.getProperty("user.dir") + "//DataSource//Task Data Sheet.xlsx");

		// Load the file.
		FileInputStream finput = new FileInputStream(src);

		// Load he workbook.
		workbook = new XSSFWorkbook(finput);

		// Load the sheet in which data is stored.
		sheet = workbook.getSheet("CreateTask");

		return sheet.getLastRowNum();
	}

	// Register page

	
	public static String getLastRowOrgRegister(int rowNum, int colNum) throws IOException {
		return ExcelOperations.readExcel(System.getProperty("user.dir") + "//DataSource//Register Data Sheet.xlsx",
				"OrgRegister", rowNum, colNum - 1);
	}

	// get Last row for SurveyData
	public static int getLastRowOrgRegister() throws IOException {

		// Import excel sheet.
		File src = new File(System.getProperty("user.dir") + "//DataSource//Register Data Sheet.xlsx");

		// Load the file.
		FileInputStream finput = new FileInputStream(src);

		// Load he workbook.
		workbook = new XSSFWorkbook(finput);

		// Load the sheet in which data is stored.
		sheet = workbook.getSheet("OrgRegister");

		return sheet.getLastRowNum();
	}

	
// Event Presenter Page
	
	public static String getLastRowEventPresenter(int rowNum, int colNum) throws IOException {
		return ExcelOperations.readExcel(System.getProperty("user.dir") + "//DataSource//Data Sheet.xlsx",
				"CreateEventPresenter", rowNum, colNum - 1);
	}
// get Last row for Market place for MarketPlace - Tickets
	public static int getLastRowEventPresenterAll() throws IOException {

		// Import excel sheet.
		File src = new File(System.getProperty("user.dir") + "//DataSource//Data Sheet.xlsx");

		// Load the file.
		FileInputStream finput = new FileInputStream(src);

		// Load he workbook.
		workbook = new XSSFWorkbook(finput);

		// Load the sheet in which data is stored.
		sheet = workbook.getSheet("CreateEventPresenter");

		return sheet.getLastRowNum();
	}

	public static CharSequence getLastRowEventPresenterAll(String string, int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

		

}
