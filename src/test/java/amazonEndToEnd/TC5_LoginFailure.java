package amazonEndToEnd;

import org.testng.Assert;
import org.testng.annotations.Test;

import amazon_Pages.Home_Page;
import amazon_Pages.Login_Page;
import utilityPakage.BaseClass;

public class TC5_LoginFailure extends BaseClass {

	
	@Test
	public void verifyLoginFailure()	{
		
		Home_Page homePage=new Home_Page(driver);
		homePage.clicking_Accountlist(driver);
		homePage.clicking_signin();
		Login_Page loginpage=new Login_Page(driver);
		loginpage.enteringUsername("9765171993");
		loginpage.Click_continuebtn();
		loginpage.enteringPassword("2819979");
		loginpage.clicking_Sigin();
	Assert.assertEquals(loginpage.WrongPasswordText(), "Your password is incorrect");
	}
}
