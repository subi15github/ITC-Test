package pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	 WebDriver driver;
	    // Locators
	    private By usernameField = By.id("username");
	    private By passwordField = By.id("password");
	    private By loginButton = By.id("submit");
	    // Constructor
	    public loginPage(WebDriver driver) {
	        this.driver = driver;
	    }
	    // Page actions
	    public void enterUsername(String username) {
	        driver.findElement(usernameField).sendKeys(username);
	    }
	    public void enterPassword(String password) {
	        driver.findElement(passwordField).sendKeys(password);
	    }
	    public void clickLogin() {
	        driver.findElement(loginButton).click();
	    }
	    public void login(String user, String pass) {
	        enterUsername(user);
	        enterPassword(pass);
	        clickLogin();
	    }

}

