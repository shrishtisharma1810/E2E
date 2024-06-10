package com.mycompany.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//without adding any priority only 1 tc ie starting point is executed and all others fail
//this is bcz as per alphabetic order first it must execute checkTitle then CLickElement then LoginTest and lastly startingpoint

//with proper priority it is executed in proper sequence first starting point is executed, checkTitle, LoginTest and lastly CLickElement
public class GroupsinTestNG {
	WebDriver driver;
  @Test(groups= {"sanity","regression"})
  public void starting_point() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32_v100\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://kite.zerodha.com");
	  driver.manage().window().maximize(); 
  }
  @Test(priority=1, groups= {"sanity"})
  public void checkTitle()
  {
	  String ExpectedTitle="Kite - Zerodha's fast and elegant flagship trading platform";
	  String ActualTitle=driver.getTitle();
	  Assert.assertEquals(ExpectedTitle, ActualTitle);
		 
  }
  @Test(priority=3, groups= {"sanity"})
  public void ClickElement()
  {
	  driver.findElement(By.partialLinkText("Forgot")).click();
  }
  //if we do not want to run any test case then one way is add enabled=false in @Test annotation in .java file
  //other way is in .xml file add exclude tag
  @Test(enabled=false, priority=2, groups= {"regression"})
  public void LoginTest()
  {
	  driver.findElement(By.id("userid")).sendKeys("XA0634");
	  driver.findElement(By.id("password")).sendKeys("1232432");
	  driver.findElement(By.tagName("button")).click();
  }
  
}
