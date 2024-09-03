package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchProduct extends BasePage
{
	public SearchProduct(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@placeholder='Search']")WebElement searchItem;
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")WebElement clkButton;
	@FindBy(xpath="//div[@class='product-layout product-grid col-lg-3 col-md-3 col-sm-6 col-xs-12']")WebElement itemDisplay;
	
	
	public void searchitems(String item)
	{
		searchItem.sendKeys(item);
	}
	
	public void searchButton()
	{
		searchItem.click();
	}
	
	public boolean isItemShow()
	{
		return itemDisplay.isDisplayed();
	}
	


}


