package testcase;
import pom.loginPage;
import testSetup.baseTest;
import testcase.loginTest;

public class loginTest extends baseTest {
	  public static void main(String[] args) {
	        loginTest test = new loginTest();
	        test.setUp();
	        test.driver.get("https://practicetestautomation.com/practice-test-login/");
	        loginPage loginPage = new loginPage(test.driver);
	        loginPage.login("student", "Password123");
	        // You can add validations here
	        String currentUrl = test.driver.getCurrentUrl();
	        System.out.println("Login success. Navigated to: " + currentUrl);
	        test.tearDown();
	    }

}
