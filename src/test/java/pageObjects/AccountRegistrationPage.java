package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage
{
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")WebElement FirstName;
	@FindBy(xpath="//input[@id='input-lastname']")WebElement Lastname;
	@FindBy(xpath="//input[@id='input-email']")WebElement Email;
	@FindBy(xpath="//input[@id='input-telephone']")WebElement Telephone;
	@FindBy(xpath="//input[@id='input-password']")WebElement Password;
	@FindBy(xpath="//input[@id='input-confirm']")WebElement Confirm;
	@FindBy(xpath="//input[@name='agree']")WebElement Agree;
	@FindBy(xpath="//input[@value='Continue']")WebElement Continue;
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	public void first_name(String fname)
	{
		FirstName.sendKeys(fname);
	}
	public void last_name(String lname)
	{
		Lastname.sendKeys(lname);
	}
	public void email(String mail)
	{
		Email.sendKeys(mail);
	}
	public void telephone_no(String tele)
	{
		Telephone.sendKeys(tele);
	}
	public void pass_word(String pwd)
	{
		Password.sendKeys(pwd);
	}
	public void confirm_password(String confirmpass)
	{
		Confirm.sendKeys(confirmpass);
	}
	public void Privacy_Policy()
	{
		Agree.click();
	}
	public void Continue_next()
	{
		Continue.click();;
	}
	public String getConfirmationMsg() {
		try {
			return (msgConfirmation.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}

	}
}




