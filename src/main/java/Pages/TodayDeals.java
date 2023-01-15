package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TodayDeals extends PageBase{

	public TodayDeals(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "Grocery")
	WebElement grocery ;

	@FindBy(linkText = "Headphones")
	WebElement headPhones ;
	
	@FindBy(linkText = "10% off or more")
	WebElement tenPercentOff ;
	
	@FindBy(xpath = ("//li[@aria-label=\"Page 3 of 6\"]") )
	WebElement pageThree ;
	
	@FindBy(xpath =("//li[@aria-label=\"Page 4 of 6\"]") )
	WebElement pageFour ;

	public void FilterProducts()
	{
		headPhones.click();	
		grocery.click();
		tenPercentOff.click();
		pageThree.click();
		pageFour.click();
	}

}
