package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	//note : in TestNG when executing methods it follows the alphabetical order of method names

	@BeforeTest
	public void firstexecution() {
		System.out.println("I will execute before test execution which contains day 2 tests");
	}
	
	@Test(groups= {"Smoke"})
	public void secondTest() {
		System.out.println("secondTest-day02");
	}
	
	@AfterTest
	public void lastexecution() {
		System.out.println("I will execute before test execution which contains day 2 tests");
	}
	
}
