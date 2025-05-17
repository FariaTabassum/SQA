package automationAdvancePractice;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialization
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

        // Site Navigate
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/v1/");
        
        //1.Login
        //-------------------------------------------
        //Using XPath (Relative) to locate and fill the username and password fields.
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        
        //Clicking the login button using CSS Selector.
        driver.findElement(By.cssSelector(".btn_action")).click();
        
       //2.Add Product to Cart
       //-------------------------------------------
       //Select any one product and click "Add to cart" using CSS Selector.
       //Relative path
        driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Backpack']")).click();
        driver.findElement(By.cssSelector(".btn_primary.btn_inventory")).click();
        
        //3.Go to Cart
        //-------------------------------------------
        //Clicking on the cart icon using XPath (Absolute XPath required here).
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/a[1]/*[name()='svg'][1]")).click();
        
        
        //4.Checkout
        //-------------------------------------------
        //Click the Checkout button using CSS Selector.
        driver.findElement(By.cssSelector(".btn_action.checkout_button")).click();
        
        //5.Enter Information
        //-------------------------------------------
        //First Name using XPath
        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Nabila");
        
        //Last Name using CSS Selector
        driver.findElement(By.cssSelector("#last-name")).sendKeys("Faria");
        
        //Zip Code using XPath
        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("1290");
        
        
        
        //6.Click Continue
        //-------------------------------------------
        //Locate and click the Continue button using CSS Selector.
        driver.findElement(By.cssSelector("input[value='CONTINUE']")).click();
        
        //7.Click Finish
        //-------------------------------------------
        //Locate and click the Finish button using XPath.
        driver.findElement(By.xpath("//a[@class='btn_action cart_button']")).click();
        
        
        
        //8.Back to Products/Home
        //-------------------------------------------
        //Click the Back Home button using CSS Selector.
        driver.findElement(By.cssSelector("div[class='bm-burger-button'] button")).click();
        driver.findElement(By.cssSelector("#inventory_sidebar_link")).click();
        
        
     
        

	}

}
