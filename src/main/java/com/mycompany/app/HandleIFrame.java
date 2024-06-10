package com.mycompany.app;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleIFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32_v100\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement iframe=driver.findElement(By.xpath("//*[@id='frame1']"));
		
		//Here we pass WebElement of frame to frame method
		driver.switchTo().frame(iframe);
		
		//Here we pass index of frame to frame method
		//driver.switchTo().frame(2);
		
		//Here we pass frameid of frame to frame method
		//driver.switchTo().frame("frame1");
				
		System.out.println(driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText());
		

	}

}
