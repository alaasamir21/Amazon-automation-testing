package tests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.ProductDetails;
import Pages.Products;
import Pages.TodayDeals;

public class FilterByTodayDeals extends TestBase 
{
	
		HomePage homeObject;
		TodayDeals todayDealsObject;
		Products productsObject;
		ProductDetails ProDetailsObject;
		
		
		@Test

		public void TypeInSearchBox()
		{
			homeObject = new HomePage (driver);
			homeObject.CheckTodayDeals();
			todayDealsObject = new TodayDeals (driver);
			todayDealsObject.FilterProducts();
			productsObject =new Products (driver);
			productsObject.SelectFromTodayDeals();
			ProDetailsObject =new ProductDetails(driver);
			ProDetailsObject.viewProductDetails();
			homeObject.CheckCart();
				
		}
	}



