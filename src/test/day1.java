package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day1 {
	
	@Test
	public void Demo() {
		System.out.println("Hello");
	}
	
	@Test
	public void SecondTest() {
		System.out.println("Bye");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("I will execute after suite");
	}
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("I will execute before suite");
	}
	
	//Goto project name 
	//Right Click->TestNG->Convert to testng
	
	
}
