package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class POM_AmazonLogin {
WebDriver driver;
public POM_AmazonLogin(WebDriver driver)
{
	this.driver=driver;
}

By SignInLink= By.xpath("//*[text()='Hello, Sign in']");

By email= By.xpath("//*[@id='ap_email']");

By continueBtn= By.xpath("//input[@id='continue']");

By pwd= By.xpath("//input[@id='ap_password']");

By SignInBtn= By.xpath("//input[@id='signInSubmit']");

By CreateNewAc= By.xpath("//a[@id='createAccountSubmit']");

By LogoutBtn = By.xpath("//*[text()='Sign Out']");
//for logout btn u can also use this
////*[@id='nav-link-accountList']/following-sibling::a[1]

By Hellouser= By.xpath("//*[@id='nav-link-accountList']");
//*[@id='nav-link-accountList']


public void clickLogin(String emailid, String passwd)
{
	driver.findElement(SignInLink).click();
	driver.findElement(email).sendKeys(emailid);
	driver.findElement(continueBtn).click();
	driver.findElement(pwd).sendKeys(passwd);
	driver.findElement(SignInBtn).click();
	}

public void CreateAc()
{
	driver.findElement(SignInLink).click();
	driver.findElement(CreateNewAc).click();
}


public void Logout()
{
	Actions action=new Actions(driver);
	action.moveToElement(driver.findElement(Hellouser)).build().perform();
	driver.findElement(LogoutBtn).click();
	
}

}
