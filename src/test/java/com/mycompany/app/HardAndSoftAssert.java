package com.mycompany.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAndSoftAssert {
	WebDriver driver;
	  @Test
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
	  @Test(priority=1)
	  public void checkTitle()
	  {
		  String ExpectedTitle="Kite - Zerodha's fast and elegant flagship trading jlatform";
		  String ActualTitle=driver.getTitle();
		  //This is hard/default assert
		  //Assert.assertEquals(ExpectedTitle, ActualTitle);
		  //Reporter.log("checkTitle method is executed", true);
		  //System.out.println("This is hard assert");
		  /*output of hard assert-if assert fails statements after assert are not executed and it jumps to the next method as per priority to execute
starting_point Method is executed
LoginTest method is executed
ClickElement method is executed
PASSED: LoginTest
PASSED: ClickElement
PASSED: starting_point
FAILED: checkTitle
*/
		  //This is soft/verify assert
		  SoftAssert softassert=new SoftAssert();
		  softassert.assertEquals(ExpectedTitle, ActualTitle);
		  Reporter.log("checkTitle method is executed", true);
		  System.out.println("This is soft assert");
		  softassert.assertAll();
/*output of soft assert-if assert fails, statements after assert are still executed and then it goes and executes next method as per priority
 starting_point Method is executed
checkTitle method is executed
This is soft assert
LoginTest method is executed
ClickElement method is executed
*/
 
			 
	  }
	  @Test(priority=3)
	  public void ClickElement()
	  {
		  driver.findElement(By.partialLinkText("Forgot")).click();
		  Reporter.log("ClickElement method is executed", true);
	  }
	  //if we do not want to run any test case then one way is add enabled=false in @Test annotation in .java file
	  //other way is in .xml file add exclude tag
	  @Test(priority=2)
	  public void LoginTest()
	  {
		  driver.findElement(By.id("userid")).sendKeys("XA0634");
		  driver.findElement(By.id("password")).sendKeys("1232432");
		  driver.findElement(By.tagName("button")).click();
		  Reporter.log("LoginTest method is executed", true);
	  }


}
