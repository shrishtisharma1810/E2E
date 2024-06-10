package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Guru99Home {
	WebDriver driver;
	
	
	//Constructor
	public Guru99Home(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	
	//WebElements
	By HomePageTitle=By.xpath("//table//tr[@class='heading3']");
	By LogoutBtn=By.xpath("//*[contains(text(),'Log out')]");
	
	
	//methods
	public String getHomePageUserName()
	{
		return driver.findElement(HomePageTitle).getText();
	}

	public void logout()
	{
		driver.findElement(LogoutBtn).click();
	}
}
