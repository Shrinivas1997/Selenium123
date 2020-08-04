package org.qsptestngdemo.org;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test(dependsOnMethods="m2")
	public void m1() {
		Reporter.log("Hiii....1", true);	}

	@Test()
	public void m() {
		Reporter.log("Hiii....2", true);
	}

	@Test()
	public void m3() {
		Reporter.log("Hiii....3", true);	}

}
