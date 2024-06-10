package com.mycompany.app;

import org.testng.annotations.DataProvider;

public class DpDataForAddition {
	@DataProvider
	  public Object[][] DataForAddition() {
	    return new Object[][] {{20, 65, 45},{30, 40, 70 },{15, 11, 30},{5, 16, 21}};
	    
	}
}
