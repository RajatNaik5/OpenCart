package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import utilities.DataProviders;


public class TC3_Login_DataDrivenTest extends BaseClass
{
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class,groups="DataDriven")//Method Name and class name of the Data providers bcz it is located in different package
	public void verify_loginDDT(String email,String pwd,String exp)
	{
		try {
		//HomePage
		HomePage hp=new HomePage(driver);
		hp.clkMyAccount();
		hp.clkLogin();
		
		//Login Page
		LoginPage logpage=new LoginPage(driver);
		logpage.Emailid(email);
		logpage.Password(pwd);
		logpage.login();
		
		//myAccount Page
		MyAccountPage map=new MyAccountPage(driver);
		boolean targetpage=map.isMyAccountPageExists();
		
		/*Data is valid  - login success - test pass  - logout
		Data is valid -- login failed - test fail

		Data is invalid - login success - test fail  - logout
		Data is invalid -- login failed - test pass
		*/
		
		if(exp.equalsIgnoreCase("Valid"))
		{
			if(targetpage==true)
			{
				map.clklogout();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);

			}
		}
		if(exp.equalsIgnoreCase("Invalid"))
		{
			if(targetpage==true)
			{
				map.clklogout();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);

			}
		}
		}catch(Exception e)
		{
			Assert.fail();
		}
	}
}
