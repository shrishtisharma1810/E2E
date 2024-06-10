package com.mycompany.app;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DpForAddition {
  @Test(dataProvider="DataForAddition",dataProviderClass=DpDataForAddition.class, retryAnalyzer = RetryAnalyzer.class)
  public void Addition(Integer no1, Integer no2, Integer result) {
	  Integer sum=no1+no2;
	  Assert.assertEquals(sum,result);
  }
}

//Here we are using retry analyzer, so teh two test cases which fail are retried 5 times each