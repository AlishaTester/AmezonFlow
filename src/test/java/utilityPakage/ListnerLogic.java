package utilityPakage;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;




public class ListnerLogic implements ITestListener {
public static WebDriver driver;
String  Dateformat;
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		logicToTakeUniqueScreenshot();
		TakesScreenshot ts=(TakesScreenshot)driver;
        File source=ts.getScreenshotAs(OutputType.FILE);  
        File Destination=new File("C:\\Users\\HP\\eclipse-workspace\\SeleniumTools\\Screenshotspng\\pass_TC\\TC"+ Dateformat+".png");
	try {
		FileHandler.copy(source, Destination);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

		
	

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		logicToTakeUniqueScreenshot();
		TakesScreenshot ts=(TakesScreenshot)driver;
        File source=ts.getScreenshotAs(OutputType.FILE);  
        File Destination=new File("C:\\Users\\HP\\eclipse-workspace\\SeleniumTools\\Screenshotspng\\Fail_TC\\TC" + Dateformat+".png");
	try {
		FileHandler.copy(source, Destination);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		
		
	}
	public  void logicToTakeUniqueScreenshot() {

		 Date d1 = new Date();
	     Date d2 = new Date(d1.getTime());

	     String format1 = d2.toString();
	     System.out.println(format1);

	     String day = format1.substring(8, 10);
	     String month = format1.substring(4, 7);
	     String year = format1.substring(format1.length() - 4);

	     String hour = format1.substring(11, 13);
	     String minute = format1.substring(14, 16);
	     String second = format1.substring(17, 19);

	   Dateformat = day + "-" + month + "-" + year
	              + "_" + hour + "-" + minute + "-" + second;
	   
	}

	
	
}
