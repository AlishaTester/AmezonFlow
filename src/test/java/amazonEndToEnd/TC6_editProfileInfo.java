package amazonEndToEnd;

import org.testng.annotations.Test;

import amazon_Pages.Home_Page;
import amazon_Pages.LoginSecurityPage;
import amazon_Pages.Login_Page;
import amazon_Pages.MyAccount_Page;
import utilityPakage.BaseClass;
import utilityPakage.IretryLogic;

public class TC6_editProfileInfo extends BaseClass {
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
	MyAccount_Page accountPage=new MyAccount_Page (driver);
	homepage.clicking_YourAccount();
	accountPage.clickingloginSecurity();
	LoginSecurityPage security=new LoginSecurityPage(driver);
	security.ClickEdit();
	security.ChangingName();
	security.ClickSaveChanges();
	s.assertEquals(security.CheckingSuccessMessage(), "Name updated.");
}
}