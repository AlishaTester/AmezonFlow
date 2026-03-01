package amazonEndToEnd;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import amazon_Pages.Home_Page;
import amazon_Pages.Login_Page;
import utilityPakage.BaseClass;
import utilityPakage.IretryLogic;
import utilityPakage.ListnerLogic;
@Listeners(ListnerLogic.class)
public class TC1_LoginToAmezon extends BaseClass {

	@Test(retryAnalyzer=IretryLogic.class)
	public void login_Withvalidcredential() {
		Home_Page homepage=new Home_Page (driver)	;
		homepage.clicking_Accountlist(driver);
		homepage.clicking_signin();
		
		Login_Page loginpage=new Login_Page(driver);
		loginpage.enteringUsername("9765171993");
		loginpage.Click_continuebtn();
		loginpage.enteringPassword("281997");
		loginpage.clicking_Sigin();
		//assertions 
		s.assertEquals(driver.getTitle().toLowerCase().contains("amazon"), true);
		s.assertEquals(homepage.CheckingUserLogin(),true);
		
		Reporter.log("TC1_LoginToAmezon is passed");
		
	
	}
	
	
	
}
