package test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day3 {
	
	//note : in TestNG when executing methods it follows the alphabetical order of method names

	@BeforeMethod
	public void beforemethod() {
		System.out.println("I will execute before every test method in day 3 class");
	}
	
	@Test
	public void WebLoginCarLoan() {
		System.out.println("WebLoginCarLoan");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLoginCarLoan() {
		System.out.println("MobileLoginCarLoan");
	}
	
	@Test(enabled = false)
	public void MobilesigninCarLoan() {
		System.out.println("MobilesigninCarLoan");
	}
	
	@Test(timeOut = 4000)
	public void MobilesignoutCarLoan() {
		System.out.println("MobilesignoutCarLoan");
	}
	
	@Test(dependsOnMethods = "WebLoginCarLoan")
	public void LoginAPICarLoan() {
		System.out.println("LoginAPICarLoan");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("I will execute after every test method in day 3 class");
	}
}
