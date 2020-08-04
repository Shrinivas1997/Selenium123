package org.qsptestngdemo.org;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnGroup {
	@Test(groups = "functional")
	public void m1() {
		Reporter.log("Hiii....1", true);
	}

	@Test(groups = "Integration", dependsOnGroups = "functional")
	public void m2() {
		Reporter.log("Hiii....2", true);
	}

	@Test(groups = "functional",dependsOnGroups ={ "functional","unit" })
	public void m4() {
		Reporter.log("Hiii....4", true);
	}

	@Test(groups = "unit")
	public void m6() {
		Reporter.log("Hiii....6", true);
	}
}
