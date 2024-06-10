package com.mycompany.app;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutorEx {
@Test
public void js() throws InterruptedException{
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32_v100\\chromedriver.exe");
        driver =new ChromeDriver();
	    driver.get("https://amazon.com");
	    driver.manage().window().maximize();
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("alert('Welcome to Amazon India!!!!')");
	    driver.switchTo().alert().accept();
	    
	    String URL=js.executeScript("return document.URL;").toString();
	    System.out.println("URL is:"+URL);
	    
	    String Domain=js.executeScript("return document.domain;").toString();
	    System.out.println("Domain is:"+Domain);
	    
	    String Title=js.executeScript("return document.title;").toString();
	    System.out.println("Title is:"+Title);
	    
	    WebElement searchBox=driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
	    js.executeScript("arguments[0].value='Bags'",searchBox);
	    
	    WebElement SearchBtn=driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
	    js.executeScript("arguments[0].click();",SearchBtn);
	    
	    String URL1=js.executeScript("return document.URL;").toString();
	    System.out.println("URL1 is:"+URL1);
	    
	    js.executeScript("window.location='https://www.amazon.com/gp/goldbox?ref_=nav_cs_gb';");
	    js.executeScript("window.scrollBy(0,900);");
	    
	    Thread.sleep(3000);
	    
	    WebElement scrolltoSamSung=driver.findElement(By.xpath("//*[(text()='SAMSUNG Jet Bot+ Robot Vacuum with Clean Station, Automatic Emptying, Precision Cleaning, 5 Layer HEPA Filter, Intelligent Power Control, Hardwood Floors,Carpets, and Area Rugs, White')]"));
	    js.executeScript("arguments[0].scrollIntoView(true);", scrolltoSamSung);
	    Thread.sleep(3000);
	    
	    js.executeScript("arguments[0].click();", scrolltoSamSung);
	    
	    
	}
}
}
