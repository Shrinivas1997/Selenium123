package org.qsptestngdemo.org;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	@DataProvider
	public String[][] getData(){
		String st[][]=new String[3][2];
		st[0][0]="admin1";
		st[0][1]="manager1";
		
		st[1][0]="admin2";
		st[1][1]="manager2";
		
		st[2][0]="admin3";
		st[2][1]="manager3";
		return st;
	}
	@Test(dataProvider="getData")
	public void m1(String un,String pw){
		Reporter.log(un+"  "+pw,true);
	}
		
	

}
