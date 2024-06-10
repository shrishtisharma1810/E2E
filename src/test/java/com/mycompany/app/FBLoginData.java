package com.mycompany.app;

import org.testng.annotations.DataProvider;

public class FBLoginData {
	@DataProvider
	  public Object[][] FbLoginData() {
	    return new Object[][] {
	      new Object[] { "nehagsharma2006@yahoo.com","gudiya_13" },
	      new Object[] { "shrishtisharma1810@gmail.com ", "imwealthy@1crore" },
	    };
}
}
