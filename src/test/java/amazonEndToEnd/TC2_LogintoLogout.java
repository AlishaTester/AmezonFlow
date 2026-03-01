package amazonEndToEnd;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import amazon_Pages.Home_Page;
import amazon_Pages.Login_Page;
import utilityPakage.BaseClass;
import utilityPakage.IretryLogic;
import utilityPakage.ListnerLogic;
@Listeners(ListnerLogic.class)
public class TC2_LogintoLogout {
	public class TC1_LoginToAmezon extends BaseClass {

		@Test(retryAnalyzer=IretryLogic.class)
		public void login_Withvalidcredential_Logout() {
			Home_Page homepage=new Home_Page (driver)	;
			homepage.clicking_Accountlist(driver);
			homepage.clicking_signin();
			
			Login_Page loginpage=new Login_Page(driver);
			loginpage.enteringUsername("9765171993");
			loginpage.Click_continuebtn();
			loginpage.enteringPassword("281997");
			loginpage.clicking_Sigin();
			homepage.clicking_Accountlist(driver);
			homepage.clicking_signout();
			s.assertEquals(loginpage.validatingLogout(),"Sign in or create account");
			s.assertEquals(loginpage.UsernameFeildIsDisplayed(),true);
			Reporter.log("TC2_LogintoLogout is passed");
		
		}
	}}
