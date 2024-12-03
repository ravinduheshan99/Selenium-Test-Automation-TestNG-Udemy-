package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day1 {
	
	//note : in TestNG when executing methods it follows the alphabetical order of method names
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("I will execute before suite");
	}
	
	@Test
	public void firstTest() {
		System.out.println("firstTest-day01");
	}
	
	@Test
	public void SecondTest() {
		System.out.println("SecondTest-day01");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("I will execute after suite");
	}
	
	//Goto project name 
	//Right Click->TestNG->Convert to testng
	
	
}
