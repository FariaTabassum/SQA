package automationAdvancePractice;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class WindowHandler {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch a Chrome browser using Selenium WebDriver.
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        // Site Navigate
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Open first website
        //Open Google (https://www.google.com) in the main window.
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.google.com/");
        
        
        
        //Save main window handle
        String mainWindow = driver.getWindowHandle(); 
        
        //Print the title of the main window.
        System.out.println("Page Title after login: " + driver.getTitle());
        
        Thread.sleep(2000); // Wait 2 seconds
    
        //Open a new browser window 
        driver.switchTo().newWindow(WindowType.WINDOW);
        
       //In the new window, open Bing (https://www.bing.com).
        driver.get("https://www.bing.com");
        
        //Print the title of the second window.
        System.out.println("Second Window Title: " + driver.getTitle());
        Thread.sleep(2000); // Wait 2 seconds
        
        //Close the new window and switch back to the main Google window.
     
        driver.close();//close() → Closes only the current window (not quit() which closes all).
        
        Thread.sleep(1000); // Wait 1 seconds
        
        // Switch back to the main windows
        driver.switchTo().window(mainWindow);

        // Print title of main window to confirm
        System.out.println("Back to Main Window Title: " + driver.getTitle());
        
        Thread.sleep(2000); // Wait 2 seconds
        
        //Close the browser.
        driver.quit(); //quit() → Ends the session by closing all open browser windows.
	}

}
