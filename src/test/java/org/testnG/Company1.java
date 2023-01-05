package org.testnG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Company1 {
	
@Parameters({"userName","password"})
@Test
private void tc(String name,String Pass) {
	System.out.println(name);
	System.out.println(Pass);
}
}
