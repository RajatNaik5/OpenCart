package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SearchProduct;

public class TC4_Search_Product extends BaseClass
{
	@Test()
	public void Search_Items()
	{
		
		HomePage hp=new HomePage(driver);
		hp.clkMyAccount();
		hp.clkLogin();
		
		//Login Page
		LoginPage logpage=new LoginPage(driver);
		logpage.Emailid(p.getProperty("email"));
		logpage.Password(p.getProperty("password"));
		logpage.login();
		
		
		SearchProduct search=new SearchProduct(driver);
		search.searchitems(p.getProperty("searchItem"));
		search.searchButton();
		
		SearchProduct displayitem=new SearchProduct(driver);
		displayitem.isItemShow();
		
	}
}
