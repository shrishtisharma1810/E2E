package com.mycompany.app;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class substraction {
	  @Test
	  @Parameters({"no1", "no2"})
	  public void sub(int a,int b) {
		  int diff=a-b;
		  System.out.println("Substraction is:"+diff);
	  }
	  @Test
	  @Parameters("message")
	  public void optionalparameterex(@Optional("This is optional parameter for sub") String message) {
		  System.out.println(message);
	  }

}
