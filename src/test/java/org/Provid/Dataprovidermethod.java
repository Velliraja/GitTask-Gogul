package org.Provid;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.MavenPro.BaseClase;

public class Dataprovidermethod extends BaseClase  {
	
	@DataProvider(name="val")
	public Object[][] m1() {
		
		Object[][] obj = new Object[2][2];
		obj[0][0]="raaj@gmail.com";
		obj[0][1]="raaj123";

		obj[1][0]="raj@gmail.com";
		obj[1][1]="raj123";
		return obj;

	}

	@Test(dataProvider="val")
	private void tc1(String s1, String s2) {
		
		System.out.println(s1);
		System.out.println(s2);

	}
	

}
