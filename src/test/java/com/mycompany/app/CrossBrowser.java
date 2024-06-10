package com.mycompany.app;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class CrossBrowser {
  public WebDriver driver;
  @Parameters("browser")
 
  @BeforeClass
  public void browserLaunch(String browser) {
	  if(browser.equalsIgnoreCase("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32_v100\\chromedriver.exe");
		  driver=new ChromeDriver();
	  }
	  else if(browser.equalsIgnoreCase("edge"))
	  {
		  System.setProperty("webdriver.edge.driver", "C:\\Program Files\\edgedriver_win32\\msedgedriver.exe");
		  driver=new EdgeDriver();
	  }
	  else if(browser.equalsIgnoreCase("Firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		  driver=new FirefoxDriver();
	  }
	  driver.get("https://kite.zerodha.com");
	  driver.manage().window().maximize();
  }
  @Test
  public void LoginTest() {
	  driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("XA0634");
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456764");
	  driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
  }
  

  @AfterClass
  public void closeBrowser() {
	  driver.quit();
  }

}
