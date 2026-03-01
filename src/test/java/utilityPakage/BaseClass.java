package utilityPakage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

public class BaseClass extends ListnerLogic  {
	public SoftAssert s  =new SoftAssert();;
@Parameters("browser")

	@BeforeMethod
	public void browser_launch(@Optional("chrome")String browser) {
		if (browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		if (browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.navigate().refresh();
	
	}
	
	
	@AfterMethod
	public void browser_Close() {
	
		  s.assertAll();
		driver.quit();
	}
	
	
	
	
}
