package test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	//note : in TestNG when executing methods it follows the alphabetical order of method names

	@BeforeMethod
	public void beforemethod() {
		System.out.println("I will execute before every test method in day 3 class");
	}
	
	@Parameters({"URL","APIKey/username"})
	@Test
	public void WebLoginCarLoan(String urlName,String key) {
		System.out.println("url is : "+urlName);
		System.out.println("Key is : "+key);
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
	
	@Test(dataProvider = "getData")
	public void dataProviderCarLoan(String username, String password) {
		System.out.println("username : "+username);
		System.out.println("password : "+password);
	}
	
	@DataProvider
	public Object getData() {
		//1st combination- username password - good credit history = row
		//2nd - username password - no credit history
		//3rd - fraudulent credit history
		
		Object[][] data = new Object[3][2];
		
		//1st set
		data[0][0] = "firstsetusername";
		data[0][1] = "firstsetpassword";
		//2nd set
		data[1][0] = "secondsetusername";
		data[1][1] = "secondsetpassword";
		//3rd set
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdsetpassword";
		
		return data;
	}
}
