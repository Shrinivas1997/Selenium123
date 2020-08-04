
package org.qsptestngdemo.org;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod2 {
	@Test(groups = "functional")
	public void m1() {
		Reporter.log("Hiiiii......1", true);
	}

	@Test(groups = "Integration", dependsOnGroups = "functional")
	public void m2() {
		Reporter.log("Hiiiii......2", true);
	}

	@Test(groups = "functional")
	public void m3() {
		Reporter.log("Hiiiii......3", true);
	}

	@Test(groups = "Integration", dependsOnGroups = { "functional", "unit" })
	public void m4() {
		Reporter.log("Hiiiii......4", true);
	}

	@Test(groups = "functional")
	public void m5() {
		Reporter.log("Hiiiii......5", true);
	}

	@Test(groups = "unit", dependsOnGroups = "functional")
	public void m6() {
		Reporter.log("Hiiiii......6", true);
	}

	@Test(groups = "functional")
	public void m7() {
		Reporter.log("Hiiiii......7", true);
	}

}
