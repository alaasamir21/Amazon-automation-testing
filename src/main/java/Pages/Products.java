package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Products extends PageBase{

	public Products(WebDriver driver) {
		super(driver);
	}

	//@FindBy(css = ("[alt=\"Sponsored Ad - OKEECA Car Backseat Organizers,Car Boot Organizer with 7 Storage Pockets+10 inch Touch Screen Tablet Pocke...\"]"))
	//WebElement selectProductOne ;
	
	@FindBy(css = ("[data-index=\"2\"]"))
	WebElement selectProductOne ;
	
	@FindBy(css = ("[data-deal-id=\"0299271d\"]"))
	WebElement selectProductTwo ;
	

	public void SelectFromCarAccessories()
	{
		selectProductOne.click();
		
	}
	public void SelectFromTodayDeals()
	{
		selectProductTwo.click();
	}
}