package testcase;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.excelData;
public class loginTestExcel {
    @DataProvider(name = "excelData")
    public Object[][] excelDataProvider() throws Exception {
        String path = "./testdata/LoginData.xlsx";
        return excelData.getExcelData(path, "Sheet1");
    }
    @Test(dataProvider = "excelData")
    public void loginTest(String username, String password) {
        System.out.println("Username: " + username + " | Password: " + password);
        // Here you can plug in Selenium WebDriver to automate login
        // For example: driver.findElement(By.id("user")).sendKeys(username);
    }
    
}

