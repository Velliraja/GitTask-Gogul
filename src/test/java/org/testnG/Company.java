package org.testnG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Company  {
	
	@Parameters({"userName","password"})
	@Test
	private void Tc1(String name, String Pass) {
		
		System.out.println(name);
		System.out.println(Pass);
	}
	

}
