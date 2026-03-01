package amazon_Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginSecurityPage {
	WebDriver driver;
	WebDriverWait wait;
	@FindBy(id="NAME_BUTTON")
	private WebElement nameEdit;
	
	
	@FindBy(id="ap_customer_name")
	private WebElement changeName;
	
	@FindBy(id="cnep_1C_submit_button")
	private WebElement saveNameChange;
	
	@FindBy(xpath="//div[@id='SUCCESS_MESSAGES']/div/div")
	private WebElement succesMessage;
	
	public void ClickEdit() {
		wait.until(ExpectedConditions.visibilityOf(nameEdit));
	nameEdit.click();
	}


	public void ChangingName() {
		wait.until(ExpectedConditions.visibilityOf(changeName));
		changeName.clear();
		changeName.sendKeys("Mayra");
	}


	public void ClickSaveChanges() {
		wait.until(ExpectedConditions.visibilityOf(saveNameChange));
		saveNameChange.click();
	}
	
	public String CheckingSuccessMessage() {
		wait.until(ExpectedConditions.visibilityOf(succesMessage));
		return succesMessage.getText();
	}
	
	public LoginSecurityPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		   wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
}
