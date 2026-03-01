package amazon_Pages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home_Page {
	WebDriver driver;
	
	@FindBy(xpath="//div[@id='nav-link-accountList']")
	private WebElement Account_list;

	@FindBy(linkText = "Sign in")
	private WebElement signin;
	
	@FindBy(xpath="//span[text()='Sign Out']")
	private WebElement signout;

   @FindBy(id="twotabsearchtextbox")
  private WebElement searchTextbox;
   
   @FindBy(xpath="//span[text()='Hello, Mayra']")
   private WebElement Userloggedin;
   
   @FindBy(linkText="Your Account")
   private WebElement yourAccount;

	public void clicking_Accountlist(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.visibilityOf(Account_list));
		Actions a = new Actions(driver);

		a.moveToElement(element).perform();

	}

	public void clicking_signin() {
		signin.click();
	}

	public void clicking_signout() {
		signout.click();
	}
	public void serchingProduct(String product) {
		searchTextbox.sendKeys(product+Keys.ENTER);
		
	}
	public boolean CheckingUserLogin() {
	return Userloggedin.isDisplayed();
	
	}
	public void clicking_YourAccount() {
		yourAccount.click();
	}
	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
}
