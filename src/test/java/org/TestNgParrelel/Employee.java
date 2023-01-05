package org.TestNgParrelel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Employee {
	
	@DataProvider(name="log")
	
	public Object[][] data() {
		Object[][] obj = new Object[2][2];
		
		obj[0][0]="username";
		obj[0][1]="password";
		
		obj[1][0]="username 1";
		obj[1][1]="password 1";
		
		return obj;
		
		
	}

	@Test(dataProvider="log")
	private void tc(String s1,String s2) {
		System.out.println(s1+"method 1");
		System.out.println(s2+"method 2");
		
	}
}
