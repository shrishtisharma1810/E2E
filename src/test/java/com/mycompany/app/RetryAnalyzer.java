package com.mycompany.app;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

//Here we are defining class for retryanalyzer which implements the IRetryAnalyzer interface which has retry method
//In retry method we set how many times we want to retry a failed test case, here we set it 5
public class RetryAnalyzer implements IRetryAnalyzer {
 int count=0;
 int retrylimit=5;
	@Override
	public boolean retry(ITestResult result) {
		if(count<retrylimit){
			count++;
			return true;
		}
		return false;
	}
}
