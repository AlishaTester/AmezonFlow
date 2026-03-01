package amazon_Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Page {

WebDriver driver;
	
	@FindBy(xpath="//input[@name='submit.add-to-cart']")
	private WebElement add_CartBtn;
	
	@FindBy(xpath="//div[@id='NATC_SMART_WAGON_CONF_MSG_SUCCESS']/child::h1")
	private WebElement product_AddedtoCartText;
	
	public void addingProductToCart(WebDriver driver) throws InterruptedException {
	Set<String>a=	driver.getWindowHandles();
		Iterator<String>b=a.iterator();
	String Parent=	b.next();
	String Child=b.next();
	driver.switchTo().window(Child);
	Thread.sleep(2000);
		add_CartBtn.click();

	}

	
	public boolean PresenceofAddedtoCartMsg() {
		
		return product_AddedtoCartText.isDisplayed();
	}
	public Product_Page (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
