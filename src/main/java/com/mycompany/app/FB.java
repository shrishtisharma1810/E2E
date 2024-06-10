package com.mycompany.app;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FB {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/settings?tab=your_facebook_information");
		
		//use of implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nikitagsharma@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Sadhana#1502");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000);
		WebElement frame=driver.findElement(By.xpath("//div[contains(@class,'ina5je9e d2edcug0 datstx6m')]//iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//h3[text()='Download your information']")).click();
		
		
		
		
	}

}
