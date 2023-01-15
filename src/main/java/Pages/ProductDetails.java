package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetails extends PageBase {

	public ProductDetails(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="add-to-cart-button")
	WebElement addToCartBtn ;

	public void viewProductDetails()
	{
		addToCartBtn.click();	
	}
}
