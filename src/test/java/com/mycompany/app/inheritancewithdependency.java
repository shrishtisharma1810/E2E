package com.mycompany.app;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class inheritancewithdependency extends DependencywithTestNG{
	
	@Test(dependsOnMethods="launchchrome")
	public void loginfb()
	{
		System.out.println("logged in");
		
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("nehagsharma2006@yahoo.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("gudiya_13");
		driver.findElement(By.cssSelector("button[value='1']")).click();
		
	}

}
