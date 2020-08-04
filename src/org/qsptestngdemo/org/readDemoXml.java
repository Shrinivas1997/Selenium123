package org.qsptestngdemo.org;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class readDemoXml {
	@Test(dataProviderClass=ReadData.class,dataProvider="getData1")
	public void m1(String un,String pw){
	Reporter.log(un +"  "+ pw,true);
  }
}




