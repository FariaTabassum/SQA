  package automationAdvancePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initialization
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        // Site Navigate
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/v1/");

        // Login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        
        
        //Verify the exact URL after login
        String expectedUrl="https://www.saucedemo.com/v1/inventory.html";
        String actualUrl = driver.getCurrentUrl();
        
        Assert.assertEquals(expectedUrl, actualUrl,"URL after login is incorrect");

        // Ensure you're not still on the login page
        Assert.assertNotEquals(expectedUrl, actualUrl,"Still on login page");
        
        // Verify that the URL contains "inventory" after login
        //WebElement productTitle = driver.findElement(By.xpath("//span[@class='title']"));
        //Assert.assertTrue(productTitle.isDisplayed());
        
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("inventory"));
        
        // Make sure no error message like "do not match" is displayed
        boolean isErrorDisplayed = driver.getPageSource().contains("do not match");
        Assert.assertFalse(isErrorDisplayed);

        // Close the browser
        driver.quit();


	}

}
