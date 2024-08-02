package seleniumAssignments;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class allAssignments {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Initialization
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		//siteNavigate
		driver.get("https://www.saucedemo.com/");
		driver.manage().window();
		
		//login
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		//Title Check
		String ExpectedTitle="Swag Labs";
		String ActualTitle= driver.getTitle();
		
		if(ActualTitle.equals(ExpectedTitle)) {
			
			System.out.println("Title match");
		}
		else {
		System.out.println("Title doesn't match");
		}
		//Selenium Assignment -1
		//--------------------------
		//URL Check
				String ExpectedUrl="https://www.saucedemo.com/inventory.html";
				String ActualUrl= driver.getCurrentUrl();
				
				if(ActualUrl.equals(ExpectedUrl)) {
					
					System.out.println("URL match");
				}
				else {
				System.out.println("URL doesn't match");
				}
		//--------------------------
				
		//Relative path
		//driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		 
		 
		//Absolute path
		//Thread.sleep(4000);
		//driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button ")).click();
		 
		 
		//Selenium Assignment -2
		//--------------------------
		//Implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
						
		//Absolute path
		 driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[6]/div[2]/div[1]/a/div ")).click();
		
		 //Relative path
		 driver.findElement(By.xpath("//button[@id='add-to-cart']")).click();
		 
		//Absolute path
		 driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
		 
		//Relative path
		 driver.findElement(By.xpath("//button[@id='continue-shopping']")).click();
		
			 
	
	}

}
