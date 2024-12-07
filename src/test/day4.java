package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class day4 {

    // Executes once before any methods in this class
    @BeforeClass
    public void beforeclass() {
        System.out.println("before executing any method in the day 4 class");
    }
    
    // Executes once after all methods in this class
    @AfterClass
    public void afterclass() {
        System.out.println("after executing any method in the day 4 class");
    }
    
    // A test method for web login
    @Test
    public void WebLoginHomeLoan() {
        System.out.println("WebLoginHomeLoan");
    }
    
    // A Smoke test method for mobile login
    @Test(groups = {"Smoke"})
    public void MobileLoginHomeLoan() {
        System.out.println("MobileLoginHomeLoan");
    }
    
    // A test method for API login
    @Test
    public void LoginAPIHomeLoan() {
        System.out.println("LoginAPIHomeLoan");
    }
}
