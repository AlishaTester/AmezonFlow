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
public class TC4_Login_AddToCart extends BaseClass {
	@Test(retryAnalyzer=IretryLogic.class)
	public void addingProductToCart() throws InterruptedException  {
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
		
		Product_Page productPage=new Product_Page (driver);
		productPage.addingProductToCart( driver);
		s.assertEquals(productPage.PresenceofAddedtoCartMsg(), true);
		Reporter.log("TC4_Login_AddToCart is pass");
	}
}
