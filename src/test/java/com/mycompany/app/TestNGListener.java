package com.mycompany.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ITestListenerEx.class)
public class TestNGListener {
    WebDriver driver ;
	
    //This method will be skipped as it dependsOn OpenBrowser and OpenBrowser Failed
	@Test(dependsOnMethods="OpenBrowser")  //Success Test
	public void CloseBrowser() {
		driver.close();
		Reporter.log("Driver Closed After Testing");
	}
	
	@Test //Failed Test as the title has platform and not jlatform
	public void OpenBrowser() {
		    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32_v100\\chromedriver.exe");
	        driver =new ChromeDriver();
		    driver.get("https://kite.zerodha.com");
	        String expectedTitle = "Kite - Zerodha's fast and elegant flagship trading platform";
	        String originalTitle = driver.getTitle();
	        Assert.assertEquals(originalTitle, expectedTitle, "Titles of the website do not match");
  }
	
	/*
	 private int i = 1;
	 

	@Test (successPercentage = 60, invocationCount = 3) //Failing Within Success
	public void AccountTest() {
			if(i < 2)
				Assert.assertEquals(i , i);
		i++;
	}
	
	*/
	//This test should finish execution in 1 sec but we have given 3 sec sleep inside it so the test will fail
	@Test(timeOut=1000)
	public void timeoutmethod() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("timeoutmethod");
	}
	
}


