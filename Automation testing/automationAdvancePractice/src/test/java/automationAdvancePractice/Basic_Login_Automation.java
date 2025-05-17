package automationAdvancePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic_Login_Automation {

    public static void main(String[] args) {

        WebDriver driver = null;

        try {
            // Initialization
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

            // Site Navigate
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com/v1/");

            // Login
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();
            
//            //clear password
//            driver.findElement(By.id("password")).clear();

            // Wait for a second to allow page to load
            Thread.sleep(3000);

            // Print the page title after login
            System.out.println("Page Title after login: " + driver.getTitle());

        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            if (driver != null) {
                driver.quit(); // Properly close the browser
            }
        }
    }
}