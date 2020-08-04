package org.qsptestngdemo.org;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priorityInAnnotation {
	@Test(priority=15)
	public void m1(){
		Reporter.log("Hiii....1",true);
	}
	@Test(priority=3)
	public void m2(){
		Reporter.log("Hiii....2",true);
	}
	@Test(priority=9)
	public void m3(){
		Reporter.log("Hiii....3",true);
	}

}
