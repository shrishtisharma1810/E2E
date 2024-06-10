package com.mycompany.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

//import junit.framework.Assert;

public class LaunchBrowserusingTestNG {
	
  public WebDriver driver;
  @BeforeMethod
  public void launchchrome()
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32_v100\\chromedriver.exe");
	  driver=new ChromeDriver();
  }
 @Test
 public void launchkite()
 {
	 driver.get("https://kite.zerodha.com");
	 driver.manage().window().maximize(); 
	//Here actual title has platform and not Platform so the test case will fail bcz expected and actual title are not equal
	 String ExpectedTitle="Kite - Zerodha's fast and elegant flagship trading platform";
	 String ActualTitle=driver.getTitle();
	 Assert.assertEquals(ExpectedTitle, ActualTitle);
	 
 }
 @Test
 public void CheckKiteLogo()
 {
	 driver.get("https://kite.zerodha.com");
	 WebElement KiteLogo=driver.findElement(By.xpath("//img[contains(@src,'kite-logo.svg')]"));
	 Assert.assertTrue(KiteLogo.isDisplayed());
 }

 @Test
 public void launchFB()
 {
	 driver.get("https://facebook.com");
	 driver.manage().window().maximize(); 
	 String ExpectedTitle="Facebook – log in or sign up";
	 String ActualTitle=driver.getTitle();
	 Assert.assertEquals(ExpectedTitle, ActualTitle);
 }
 @Test
 public void CheckFBLogo()
 {
	 driver.get("https://facebook.com");
	 WebElement FBLogo=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
	 Assert.assertTrue(FBLogo.isDisplayed());
 }

 @Test
 public void launchgoogle()
 {
	 driver.get("https://www.google.com/");
	 driver.manage().window().maximize(); 
	 String ExpectedTitle="Google";
	 String ActualTitle=driver.getTitle();
	 Assert.assertEquals(ExpectedTitle, ActualTitle);
 }
 @Test
 public void CheckGoogleLogo()
 {
	 driver.get("https://www.google.com/");
	 WebElement GoogleLogo=driver.findElement(By.xpath("//img[@class='lnXdpd']"));
	 Assert.assertTrue(GoogleLogo.isDisplayed());
 }
 
 @AfterMethod()
 public void closechrome()
 {
	 driver.close();
 }

 //if we do not use beforemethod and aftermethod then we have to write entire code in both the test cases inside @test annotation
  /*@Test
  public void openbrowser() {
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32_v100\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://kite.zerodha.com");
	  driver.manage().window().maximize();
	  driver.close();
  }
  */
}
