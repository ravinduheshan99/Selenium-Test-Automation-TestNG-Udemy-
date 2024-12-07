package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

    // Executes before all test methods in this class are run
    @BeforeTest
    public void firstexecution() {
        System.out.println("I will execute before test execution which contains day 2 tests");
    }
    
    // A test method included in the Smoke group
    @Test(groups = {"Smoke"})
    public void secondTest() {
        System.out.println("secondTest-day02");
    }
    
    // Executes after all test methods in this class have run
    @AfterTest
    public void lastexecution() {
        System.out.println("I will execute after test execution which contains day 2 tests");
    }
}
