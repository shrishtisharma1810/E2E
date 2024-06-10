package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Guru99Login {
	public WebDriver driver;
	//Constructor
	public Guru99Login(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	//WebElements
	By u99name=By.name("uid");
	By pwd=By.name("password");
	By titletxt=By.className("barone");
	By loginBtn=By.name("btnLogin");
	By ResetBtn=By.name("btnReset");
	
	//Methods
	
	public void setUserName(String uname)
	{
		driver.findElement(u99name).sendKeys(uname);
	}
	
	public void setPassword(String passwd)
	{
		driver.findElement(pwd).sendKeys(passwd);
	}
    
	public void login() //(String username, String password)
	{
		//driver.findElement(u99name).sendKeys(username);
		//driver.findElement(pwd).sendKeys(password);
		driver.findElement(loginBtn).click();
	}
	
	
	public void Guru99Login1(String username, String password)
	{
		//driver.findElement(u99name).sendKeys(username);
		//driver.findElement(pwd).sendKeys(password);
		//driver.findElement(loginBtn).click();
		this.setUserName(username);
		this.setPassword(password);
		this.login();
	}
	
	
	public String getLoginTitle()
	{
		return driver.findElement(titletxt).getText();
	}
}
