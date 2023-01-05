package org.TestNgParrelel;

import org.testng.annotations.Test;

public class ParellelExe {
	
	@Test(dataProvider="log",dataProviderClass=Employee.class)
	
	private void s1(String a,String B) {	
	System.out.println(a+"method 3");
	System.out.println(B+"method 4");	
	}
	
	@Test(dataProvider="log",dataProviderClass=Employee.class)
	private void s2( String c,String d) {
		System.out.println(c+"method 5");
		System.out.println(d+"method 6");	
	}
	
	@Test(dataProvider="log",dataProviderClass=Employee.class)
	private void s3( String e,String f) {
		System.out.println(e+"method 7");
		System.out.println(f+"method 8");
	}
	
	@Test(dataProvider="log",dataProviderClass=Employee.class)
	
	private void s4( String g,String h) {
		System.out.println(g+"method 9");
		System.out.println(h+"method 10");
			
		
	}

	
}
