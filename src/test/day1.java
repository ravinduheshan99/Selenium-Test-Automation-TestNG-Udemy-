package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day1 {
    
    // This method executes before the entire test suite begins
    @BeforeSuite
    public void beforesuite() {
        System.out.println("I will execute before suite");
    }
    
    // A test method that deliberately fails to demonstrate failure handling
    @Test
    public void firstTest() {
        System.out.println("firstTest-day01");
        Assert.assertTrue(false); // Assertion fails here
    }
    
    // A test method that executes normally
    @Test
    public void SecondTest() {
        System.out.println("SecondTest-day01");
    }
    
    // This method executes after the entire test suite ends
    @AfterSuite
    public void aftersuite() {
        System.out.println("I will execute after suite");
    }
}
