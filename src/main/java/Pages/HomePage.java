package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "twotabsearchtextbox")
	WebElement productSearch ;
	
	@FindBy(id="nav-search-submit-button")
	WebElement searchBtn ;
	
	@FindBy(linkText ="Today's Deals")
	WebElement todayDeals ;
	
	@FindBy(id="nav-cart-count-container")
	WebElement cart ;
		
	public void TypeInSearchBox(String productName)
	{
		productSearch.sendKeys(productName);
		searchBtn.click();
		
	}
	public void CheckCart()
	{
		cart.click();	
		
	}
	public void CheckTodayDeals()
	{
		todayDeals.click();	
	}
}