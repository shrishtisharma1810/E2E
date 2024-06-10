package com.mycompany.app;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class DependencywithTestNG {
	  //group dependency 
	  public WebDriver driver;
	   
	  @Test(groups="launch")
	  public void launchchrome()
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32_v100\\chromedriver.exe");
		  driver=new ChromeDriver();
		  
	  }
	 /*
	 @Test(groups="launch")
	 public void launchkite()
	 {
		 driver.get("https://kite.zerodha.com");
		 driver.manage().window().maximize(); 
		//Here actual title has platform and not Platform so the test case will fail bcz expected and actual title are not equal
		 String ExpectedTitle="Kite - Zerodha's fast and elegant flagship trading platform";
		 String ActualTitle=driver.getTitle();
		 Assert.assertEquals(ExpectedTitle, ActualTitle);
		 
	 }
//we can also use single dependency like launchkite dependsOnMethod launchchrome and checkkitelogo dependsOnMethod launchkite
	 @Test(dependsOnGroups = "launch")
	 public void checkkitelogo()
	 {
		 driver.get("https://kite.zerodha.com");
		 WebElement KiteLogo=driver.findElement(By.xpath("//img[contains(@src,'kite-logo.svg')]"));
		 Assert.assertTrue(KiteLogo.isDisplayed());
	 }

	 @Test(groups="launch")
	 public void launchfb()
	 {
		 driver.get("https://facebook.com");
		 driver.manage().window().maximize(); 
		 String ExpectedTitle="Facebook – log in or sign up";
		 String ActualTitle=driver.getTitle();
		 Assert.assertEquals(ExpectedTitle, ActualTitle);
	 }
	 @Test(dependsOnGroups = "launch")
	 public void checkfblogo()
	 {
		 driver.get("https://facebook.com");
		 WebElement FBLogo=driver.findElement(By.xpath("//img[contains(@class,'fb_logo')]"));
		 Assert.assertTrue(FBLogo.isDisplayed());
	 }

	 @Test(groups="launch")
	 public void launchgoogle()
	 {
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize(); 
		 String ExpectedTitle="Google";
		 String ActualTitle=driver.getTitle();
		 Assert.assertEquals(ExpectedTitle, ActualTitle);
	 }
	 @Test(dependsOnGroups = "launch")
	 public void checkgooglelogo()
	 {
		 driver.get("https://www.google.com/");
		 WebElement GoogleLogo=driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		 Assert.assertTrue(GoogleLogo.isDisplayed());
	 }
	 

	 @Test(dependsOnGroups="launch")
	 public void closechrome()
	 {
		 driver.close();
	 }
	
	
	  /* Dependency using dependsOnMethods, single and multiple dependency
	   public WebDriver driver;
	   
	  @Test
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
//we can also use single dependency like launchkite dependsOnMethod launchchrome and checkkitelogo dependsOnMethod launchkite
	 @Test(dependsOnMethods = {"launchkite", "launchchrome"})
	 public void checkkitelogo()
	 {
		 driver.get("https://kite.zerodha.com");
		 WebElement KiteLogo=driver.findElement(By.xpath("//img[contains(@src,'kite-logo.svg')]"));
		 Assert.assertTrue(KiteLogo.isDisplayed());
	 }

	 @Test
	 public void launchfb()
	 {
		 driver.get("https://facebook.com");
		 driver.manage().window().maximize(); 
		 String ExpectedTitle="Facebook – log in or sign up";
		 String ActualTitle=driver.getTitle();
		 Assert.assertEquals(ExpectedTitle, ActualTitle);
	 }
	 @Test(dependsOnMethods = {"launchfb", "launchchrome"})
	 public void checkfblogo()
	 {
		 driver.get("https://facebook.com");
		 WebElement FBLogo=driver.findElement(By.xpath("//img[contains(@class,'fb_logo')]"));
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
	 @Test(dependsOnMethods = {"launchgoogle", "launchchrome"})
	 public void checkgooglelogo()
	 {
		 driver.get("https://www.google.com/");
		 WebElement GoogleLogo=driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		 Assert.assertTrue(GoogleLogo.isDisplayed());
	 }
	 
 
	 @Test(dependsOnMethods = {"launchchrome", "checkkitelogo", "checkfblogo", "checkgooglelogo"})
	 public void closechrome()
	 {
		 driver.close();
	 }
*/
}


