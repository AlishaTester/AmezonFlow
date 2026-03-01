package amazon_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount_Page {
	
	WebDriver driver;
@FindBy(xpath="(//span[@class='a-color-secondary'])[2]")
private WebElement loginSecurity;



public void clickingloginSecurity() {
	loginSecurity.click();
}


public MyAccount_Page(WebDriver driver){
	PageFactory.initElements(driver, this);
}

}
