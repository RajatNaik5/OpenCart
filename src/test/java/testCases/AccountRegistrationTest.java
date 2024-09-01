package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class AccountRegistrationTest extends BaseClass
{	
	@Test(groups={"Regression","Master"})
	public void verify_account_Registration()
	{
		
		 
		HomePage hp=new HomePage(driver);
		hp.clkMyAccount();
		hp.lnkRegister();

		
		AccountRegistrationPage accreg=new AccountRegistrationPage(driver);
		accreg.first_name(randomString().toUpperCase());
		accreg.last_name(randomString().toUpperCase());
		
		accreg.email(randomString()+"@gmail.com");
		
		accreg.telephone_no(randomNumbers());
		
		String password=randomAlphaNumeric();
		accreg.pass_word(password);
		accreg.confirm_password(password);
		
		accreg.Privacy_Policy();
		
		accreg.Continue_next();
		String confmsg=accreg.getConfirmationMsg();
		Assert.assertEquals(confmsg,"Your Account Has Been Created!");
	}
		
}
	
	
	

