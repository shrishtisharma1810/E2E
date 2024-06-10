package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_withPageFactory_AmazonReturnOrder {
	WebDriver driver;
	
	public POM_withPageFactory_AmazonReturnOrder(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath ="//a[@id='nav-orders']")
	WebElement ReturnAndOrderLink;
	

	public void ReturnOder()
	{
		ReturnAndOrderLink.click();
	}

}
