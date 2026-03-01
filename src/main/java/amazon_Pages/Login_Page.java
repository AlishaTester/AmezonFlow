package amazon_Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Page {
	
	WebDriver driver;
	WebDriverWait wait;
	@FindBy(xpath="//input[@name='email']")
	private WebElement username;
	
	@FindBy(xpath="//span[@id='continue']")
	private WebElement countitnueBtton;
	
	@FindBy(id="ap_password")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement signinbtn;
	
	@FindBy(xpath="//h1")
	private WebElement signoutText;  

	@FindBy(xpath="//div[contains(@class,'a-alert-content')]")
	private WebElement Error;  
	
	public void enteringUsername(String user) {
	username.sendKeys(user);
		
	}
public void Click_continuebtn() {
	 countitnueBtton.click();
	}

public void enteringPassword(String pass) {
	
	WebElement element=wait.until(ExpectedConditions.visibilityOf(password));
	element.sendKeys(pass);
	
}
public void clicking_Sigin() {
	signinbtn.click();

}
public String WrongPasswordText() {
	wait.until(ExpectedConditions.visibilityOf(Error));
String text=	Error.getText();

return text;
	
}

public String validatingLogout() {
	return signoutText.getText();
}
public boolean UsernameFeildIsDisplayed() {
	return username.isDisplayed();
}
public Login_Page (WebDriver driver) {
	PageFactory.initElements(driver, this);
	wait=new WebDriverWait(driver,Duration.ofSeconds(10));
}
}
