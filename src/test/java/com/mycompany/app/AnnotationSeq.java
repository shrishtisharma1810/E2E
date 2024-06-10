package com.mycompany.app;

import org.testng.Assert;
import org.testng.annotations.Test;

//Here First tc will pass but second one will fail as false is not equal to true
public class AnnotationSeq {
	@Test
	public void first()
	{
		System.out.println("First TestNG class");
	}
	@Test
	public void second()
	{
		System.out.println("Second TestNG class");
		//Assert method is imported from testng.org
		Assert.assertEquals(false, true);
	}
	
}
