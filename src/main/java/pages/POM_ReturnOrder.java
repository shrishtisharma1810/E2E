package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM_ReturnOrder {

	WebDriver driver;
	public POM_ReturnOrder(WebDriver driver)
	{
		this.driver=driver;
	}

	By ReturnAndOrderLink= By.xpath("//a[@id='nav-orders']");

	public void ReturnOder()
	{
		driver.findElement(ReturnAndOrderLink).click();
	}

}
