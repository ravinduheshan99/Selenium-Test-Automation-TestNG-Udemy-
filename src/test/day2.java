package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@Test
	public void Ploan() {
		System.out.println("Good");
	}
	
	@BeforeTest
	public void prerequisits() {
		System.out.println("I will execute first");
	}
	
}
