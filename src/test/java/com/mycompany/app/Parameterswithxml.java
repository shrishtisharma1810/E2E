package com.mycompany.app;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterswithxml {
  @Test
  @Parameters({"no1", "no2"})
  public void add(int a,int b) {
	  int sum=a+b;
	  System.out.println("Addition is:"+sum);
  }
  //Creating optional parameter
  @Test
  @Parameters("message")
  public void optionalparameterex(@Optional("This is optional parameter") String message) {
	  System.out.println(message);
  }
}
