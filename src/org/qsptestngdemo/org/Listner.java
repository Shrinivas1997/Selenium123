
package org.qsptestngdemo.org;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListDemo.class)
public class Listner {
	@Test
	public void m1() {
		Reporter.log("Hi..", true);
	}

	@Test
	public void m2() {
		Reporter.log("Hiii2..", true);
		Assert.fail();
	}
}
