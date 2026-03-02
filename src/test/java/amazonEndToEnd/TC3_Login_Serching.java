package amazonEndToEnd;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import amazon_Pages.Home_Page;
import amazon_Pages.Login_Page;
import amazon_Pages.Product_Page;
import amazon_Pages.SearchResultPage;
import utilityPakage.BaseClass;
import utilityPakage.IretryLogic;
import utilityPakage.ListnerLogic;
@Listeners(ListnerLogic.class)
public class TC3_Login_Serching  extends BaseClass{

	@Test(retryAnalyzer=IretryLogic.class)
	public void serchingProduct() throws InterruptedException  {
		Home_Page homepage=new Home_Page(driver);
		homepage.clicking_Accountlist(driver);
		homepage.clicking_signin();
	
		
		Login_Page loginpage=new Login_Page(driver);
		loginpage.enteringUsername("9765171993");
		loginpage.Click_continuebtn();
		loginpage.enteringPassword("281997");
		loginpage.clicking_Sigin();
		
		homepage.serchingProduct("shoe");
		
		SearchResultPage search=new SearchResultPage(driver);
		
		search.clickingFirstProduct();
		s.assertEquals(driver.getCurrentUrl().toLowerCase().contains("shoe"),true);
	
		Reporter.log("TC3_SerchingTheProduct ");
	}
	
}
