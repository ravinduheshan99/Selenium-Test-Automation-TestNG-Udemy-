package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

// Implements the ITestListener interface to define custom behaviors for test events
public class Listeners implements ITestListener {
	
	// To get a test report:
	// 1. Go to the `test-output` folder in your project directory.
	// 2. Right-click the `index.html` file and select `Properties` to get the file path.
	// 3. Copy the file path, e.g., `D:\Documents\Career\My Projects\Selenium Projects\02-TestNG-Project\TestNGTutorial\test-output\index.html`.
	// 4. Paste the file path into a browser like Chrome to view the generated TestNG report.
	// The report includes details of passed, failed, and skipped tests, along with execution times.

    // Triggered when a test starts
    @Override
    public void onTestStart(ITestResult result) {
    }

    // Triggered when a test passes
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("I Successfully Executed Listeners Pass Code");
    }

    // Triggered when a test fails
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("I Failed Executed Listeners Pass Code for the Method : " + result.getName());
    }

    // Triggered when a test is skipped
    @Override
    public void onTestSkipped(ITestResult result) {
    }

    // Triggered when a test partially fails
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    // Triggered when a test context starts
    @Override
    public void onStart(ITestContext context) {
    }

    // Triggered when a test context ends
    @Override
    public void onFinish(ITestContext context) {
    }
}
