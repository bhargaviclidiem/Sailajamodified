package ExtentReports;
 


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import utilityLibrary.Helper;
 
//OB: ExtentReports extent instance created here. That instance can be reachable by getReporter() method.
 
public class ExtentManager {
 
	
  private static ExtentReports extent;
  static Helper objHelper; 

  public synchronized static ExtentReports getReporter(){
	  objHelper = new Helper();
      if(extent == null){
          //Set HTML reporting file location
          String workingDir = System.getProperty("user.dir");
          
          extent = new ExtentReports(workingDir+"\\ExtentReports\\ExtentReportResults "+objHelper.dateString()+".html", true);
                   
      }
      return extent;
  }

}

