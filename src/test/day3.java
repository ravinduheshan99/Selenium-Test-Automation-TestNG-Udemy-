package test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {

    // Executes before each test method in this class
    @BeforeMethod
    public void beforemethod() {
        System.out.println("I will execute before every test method in day 3 class");
    }
    
    // A test method that uses parameters from the TestNG XML file
    @Parameters({"URL", "APIKey/username"})
    @Test
    public void WebLoginCarLoan(String urlName, String key) {
        System.out.println("url is : " + urlName);
        System.out.println("Key is : " + key);
        System.out.println("WebLoginCarLoan");
    }
    
    // A Smoke test method
    @Test(groups = {"Smoke"})
    public void MobileLoginCarLoan() {
        System.out.println("MobileLoginCarLoan");
    }
    
    // A disabled test method, won't execute
    @Test(enabled = false)
    public void MobilesigninCarLoan() {
        System.out.println("MobilesigninCarLoan");
    }
    
    // A test method with a timeout limit
    @Test(timeOut = 4000)
    public void MobilesignoutCarLoan() {
        System.out.println("MobilesignoutCarLoan");
    }
    
    // A test method that depends on another method
    @Test(dependsOnMethods = "WebLoginCarLoan")
    public void LoginAPICarLoan() {
        System.out.println("LoginAPICarLoan");
    }
    
    // Executes after each test method in this class
    @AfterMethod
    public void aftermethod() {
        System.out.println("I will execute after every test method in day 3 class");
    }
    
    // A test method that uses a data provider for multiple inputs
    @Test(dataProvider = "getData")
    public void dataProviderCarLoan(String username, String password) {
        System.out.println("username : " + username);
        System.out.println("password : " + password);
    }
    
    // A DataProvider method supplying multiple sets of data
    @DataProvider
    public Object[][] getData() {
        Object[][] data = new Object[3][2];
        data[0][0] = "firstsetusername";
        data[0][1] = "firstsetpassword";
        data[1][0] = "secondsetusername";
        data[1][1] = "secondsetpassword";
        data[2][0] = "thirdsetusername";
        data[2][1] = "thirdsetpassword";
        return data;
    }
}
