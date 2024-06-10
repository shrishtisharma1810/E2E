package com.mycompany.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class selectbrowser {
  public WebDriver driver;
  @Test(retryAnalyzer = RetryAnalyzer.class)
  @Parameters("browser")
  public void ChromeBrowser(String browser) {
	  if(browser.equalsIgnoreCase("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32_v100\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://kite.zerodha.com");
		  driver.manage().window().maximize();
		  driver.close();
	  }
	  else if(browser.equalsIgnoreCase("edge"))
	  {
		  System.setProperty("webdriver.edge.driver", "C:\\Program Files\\edgedriver_win32\\msedgedriver.exe");
		  driver=new EdgeDriver();
		  driver.get("https://kite.zerodha.com");
		  driver.manage().window().maximize();
		  driver.close();
	  }
	  else if(browser.equalsIgnoreCase("Firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver.get("https://kite.zerodha.com");
		  driver.manage().window().maximize();
		  driver.close();
		  
	  }
  }
}
