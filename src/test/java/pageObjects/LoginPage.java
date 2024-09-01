package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//input[@id='input-email']")WebElement linkEmail;
	@FindBy(xpath="//input[@id='input-password']")WebElement linkPassword;
	@FindBy(xpath="//input[@value='Login']")WebElement clkLogin;
	
	public void Emailid(String email)
	{
		linkEmail.sendKeys(email);
	}
	public void Password(String pwd)
	{
		linkPassword.sendKeys(pwd);
	}
	public void login()
	{
		clkLogin.click();
	}


}
