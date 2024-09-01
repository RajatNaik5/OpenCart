package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage 
{
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//h2[normalize-space()='My Account']") WebElement showmyaccountpage;
	
	//Logout
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']") WebElement linkLogout;

	
	public boolean isMyAccountPageExists()
	{
		try {
		return(showmyaccountpage.isDisplayed());
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public void clklogout()
	{
		linkLogout.click();
	}
}

	


