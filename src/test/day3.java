package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day3 {

	@Test
	public void WebLoginCarLoan() {
		System.out.println("WebLoginCarLoan");
	}
	
	@Test
	public void MobileLoginCarLoan() {
		System.out.println("MobileLoginCarLoan");
	}
	
	@Test
	public void MobilesigninCarLoan() {
		System.out.println("MobilesigninCarLoan");
	}
	
	@Test
	public void MobilesignoutCarLoan() {
		System.out.println("MobilesignoutCarLoan");
	}
	
	@Test
	public void LoginAPICarLoan() {
		System.out.println("LoginAPICarLoan");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("I will execute before every test method in day 3 class");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("I will execute after every test method in day 3 class");
	}
}
