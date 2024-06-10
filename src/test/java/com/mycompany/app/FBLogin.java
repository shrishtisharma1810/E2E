package com.mycompany.app;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;

//This can be done by separating the @test and @DataProvider in different class also
//Means First part of code remains in this , just one change that add dataproviderclass attribute 
//and mention name of class that contains the @DataProvider annotation
public class FBLogin {
	public WebDriver driver;
	//For Chrome browser
  @Test(dataProvider = "FbLoginData",dataProviderClass=FBLoginData.class)
  public void FaceBookLoginChrome(String uname, String pwd) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32_v100\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://facebook.com");
	  driver.manage().window().maximize(); 
	  driver.findElement(By.cssSelector("input.inputtext._55r1._6luy[data-testid='royal_email']")).sendKeys(uname);
	  driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi[type='password']")).sendKeys(pwd);
	  driver.findElement(By.cssSelector("button._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy[value='1']")).click();
  }
//For Edge Browser
  @Test(dataProvider = "FbLoginData",dataProviderClass=FBLoginData.class)
  public void FaceBookLoginEdge(String uname, String pwd) {
	  System.setProperty("webdriver.edge.driver", "C:\\Program Files\\edgedriver_win32\\msedgedriver.exe");
	  driver=new EdgeDriver();
	  driver.get("https://facebook.com");
	  driver.manage().window().maximize(); 
	  driver.findElement(By.cssSelector("input.inputtext._55r1._6luy[data-testid='royal_email']")).sendKeys(uname);
	  driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi[type='password']")).sendKeys(pwd);
	  driver.findElement(By.cssSelector("button._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy[value='1']")).click();
  }
 //For FireFox browser 
  @Test(dataProvider = "FbLoginData",dataProviderClass=FBLoginData.class)
  public void FaceBookLoginFireFox(String uname, String pwd) {
	  System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("https://facebook.com");
	  driver.manage().window().maximize(); 
	  driver.findElement(By.cssSelector("input.inputtext._55r1._6luy[data-testid='royal_email']")).sendKeys(uname);
	  driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi[type='password']")).sendKeys(pwd);
	  driver.findElement(By.cssSelector("button._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy[value='1']")).click();
  }
  
  }
//This part is in separate file with name as FBLoginData
/*@DataProvider
public Object[][] FbLoginData() {
return new Object[][] {
  new Object[] { "nehagsharma2006@yahoo.com","gudiya_13" },
  new Object[] { "shrishtisharma1810@gmail.com ", "imwealthy@1crore" },
};
*/