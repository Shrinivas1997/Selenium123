package org.qsptestngdemo.org;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocationCount {
	@Test(invocationCount=3)
	public void m4(){
		Reporter.log("Hiii....1",true);
	}
	

}
