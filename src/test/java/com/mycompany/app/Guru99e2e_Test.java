package com.mycompany.app;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Guru99Home;
import pages.Guru99Login;

public class Guru99e2e_Test {

	WebDriver driver;
	
	Guru99Home homeobj;
	Guru99Login loginobj;
	
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32_v100\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/V4/");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void HomePageTest()
	{
		loginobj=new Guru99Login(driver);
		
		//String loginPageTitle=loginobj.getLoginTitle();
		//Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru 99 bank"));
		
		loginobj.Guru99Login1("mgr123", "mgr!23");
		
		homeobj=new Guru99Home(driver);
		
		Assert.assertTrue(homeobj.getHomePageUserName().toLowerCase().contains("mgr123"));
		
		//homeobj.logout();
		
	}
}
