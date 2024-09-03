package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class TC2_Login_Test extends BaseClass
{
	@Test(groups={"Sanity","Master"})
	public void verify_login()
	{
		try {
		//Home Page
		HomePage hp=new HomePage(driver);
		hp.clkMyAccount();
		hp.clkLogin();
		
		//Login Page
		LoginPage logpage=new LoginPage(driver);
		logpage.Emailid(p.getProperty("email"));
		logpage.Password(p.getProperty("password"));
		logpage.login();
		
		
		
		//Verify MyAccount Text
		MyAccountPage map=new MyAccountPage(driver);
		boolean targetpage=map.isMyAccountPageExists();
		Assert.assertTrue(targetpage);
		}catch(Exception e)
		{
			Assert.fail();
		}
				
	}
}
