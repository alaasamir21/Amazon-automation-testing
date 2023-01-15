package tests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.ProductDetails;
import Pages.Products;

public class SearchForProducts extends TestBase
{

	HomePage homeObject;
	Products productsObject;
	ProductDetails ProDetailsObject;
	
	
	@Test

	public void TypeInSearchBox()
	{
		homeObject = new HomePage (driver);
		homeObject.TypeInSearchBox("car accessories");
		productsObject =new Products (driver);
		productsObject.SelectFromCarAccessories();
		ProDetailsObject =new ProductDetails(driver);
		ProDetailsObject.viewProductDetails();
		homeObject.CheckCart();	
		
	}
}
