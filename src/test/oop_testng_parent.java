package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class oop_testng_parent {

	@BeforeMethod
	public void runMeFirst() {
		System.out.println("Run Me First");
	}
	
	public void doThis() {
		System.out.println("I'm Here");
	}
	
	@AfterMethod
	public void runMeLast() {
		System.out.println("Run Me Last");
	}
}
