package com.mycompany.app;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AllAnnotationSeq {
	
	/*
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }
  */
	
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is before method, code to be executed before every test case is written here");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is after method, code to be executed after every test case is written here");
  }

/*
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  */
  @Test
  public void testcase1()
  {
	  System.out.println("test case 1");
  }
  @Test
  public void testcase2()
  {
	  System.out.println("test case 2");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is after Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is after suite");
  }

}
