package amazon_Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultPage {
	WebDriver driver;
	   WebDriverWait wait;
	@FindBy(xpath="//a[@class='a-link-normal s-no-outline']")
	private List <WebElement> product;
	
	@FindBy(xpath="//div[@id='brandsRefinements']/descendant::i")
	private List<WebElement> brandList;

	@FindBy(xpath="//select[@name='s']")
	private WebElement FilterDropdown;
	
	public void clickingFirstProduct() {
	
		product.get(0).click();
		
	}
	
	public boolean checkingProductVisibility() {
		wait.until(ExpectedConditions.visibilityOfAllElements(product));
		if ( product.size()>0) {
			return true;	}
		
		return false;
	}
	
	public void clickingFirstBrand() {
		
		 brandList.get(0).click();
		 
		
	}
	public void FilterbyLowtoHighPrice() {
	Select s=new Select(FilterDropdown);
	s.selectByIndex(1);
		 
		
	}


		
	public SearchResultPage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	       wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
}
