package com.mycompany.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupDependencywithxml {
	WebDriver driver;
	  @Test(groups="launch")
	  public void starting_point() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32_v100\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://kite.zerodha.com");
		  driver.manage().window().maximize(); 
		  //Reporter.log("msg") is used to display this msg in reporter log in index.html and emailable.html report
		  //Reporter.log("We are using google chrome version 100");
		  //Reporter.log("msg", true) is used to display this msg in console report, reporter log in index.html and emailable.html report
		  //Reporter.log("We are using google chrome version 100", true);
		  Reporter.log("starting_point Method is executed", true);
	  }
	  @Test(groups= "checkTitle")
	  public void checkTitle()
	  {
		  String ExpectedTitle="Kite - Zerodha's fast and elegant flagship trading platform";
		  String ActualTitle=driver.getTitle();
		  Reporter.log("checkTitle method is executed", true);
		  Assert.assertEquals(ExpectedTitle, ActualTitle);
			 
	  }
	  @Test(groups="ClickElement" )
	  public void ClickElement()
	  {
		  driver.findElement(By.partialLinkText("Forgot")).click();
		  Reporter.log("ClickElement method is executed", true);
	  }
	  //if we do not want to run any test case then one way is add enabled=false in @Test annotation in .java file
	  //other way is in .xml file add exclude tag
	  @Test(groups= "LoginTest")
	  public void LoginTest()
	  {
		  driver.findElement(By.id("userid")).sendKeys("XA0634");
		  driver.findElement(By.id("password")).sendKeys("1232432");
		  driver.findElement(By.tagName("button")).click();
		  Reporter.log("LoginTest method is executed", true);
	  }

}
