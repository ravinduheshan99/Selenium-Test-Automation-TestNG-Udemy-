package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class day4 {
	
	//note : in TestNG when executing methods it follows the alphabetical order of method names
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("before executing any method in the day 4 class");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("after executing any method in the day 4 class");
	}
	

	@Test
	public void WebLoginHomeLoan() {
		System.out.println("WebLoginHomeLoan");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLoginHomeLoan() {
		System.out.println("MobileLoginHomeLoan");
	}
	
	@Test
	public void LoginAPIHomeLoan() {
		System.out.println("LoginAPIHomeLoan");
	}
}
