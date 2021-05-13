package AnotherTestCases;

import org.testng.annotations.Test;

import TestCases.first_Test;

public class Second_Test {
	
	@Test
	public void SixthTestCase() {
		
		System.out.println(" Running your Sixth test case ");
		//first_Test.driver.get("https://www.mit.edu/");
	}
	
	@Test
	public void SevenTestCase() {
		System.out.println(" Running your Seven test case ");
		//first_Test.driver.get("https://www.ox.ac.uk/");
	}

}
