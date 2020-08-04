package org.qsptestngdemo.org;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;



public class AssertDemo {
	@Test
	public void m1(){
		String aName="Shrinivas";
		String eName="Shrinivas";
		Assert.assertEquals(aName, eName);
		System.out.println("Matched");
		List<String> lst1=new ArrayList<String>();
		lst1.add("Ankur");
		lst1.add("Alia");
		lst1.add("xyz");
		
		List<String> lst2=new ArrayList<String>();
		lst2.add("Ankur");
		lst2.add("Alia");
		lst2.add("xyz");
		lst2.add("xyz");
		Assert.assertEquals(lst1, lst2);
		
		
	}

}
