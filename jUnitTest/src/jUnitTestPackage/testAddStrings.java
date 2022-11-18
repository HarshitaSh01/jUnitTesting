package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunctions jUnitString = new jUnitFunctions();
		String result = jUnitString.addition("Capstone", "project");
		assertEquals ("Capstoneproject", result); 
	}

}
