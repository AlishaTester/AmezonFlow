package utilityPakage;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IretryLogic implements IRetryAnalyzer {
int initialcount=0;
int retrycount=1;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if (initialcount<retrycount) {
			initialcount++;
			return true;
		}
		
		return false;
	}

}
