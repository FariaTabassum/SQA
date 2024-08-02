package seleniumAssignmentsII;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumAssignments {

public static void main(String[] args) throws InterruptedException {
		
		//Initialization
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		//siteNavigate
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		
		
		
		//name selection
		driver.findElement(By.id("fname")).sendKeys("Faria");
		driver.findElement(By.id("lname")).sendKeys("Nabila");
		
		
		
		//Radio button
		WebElement radiobutton = driver.findElement(By.id("female"));
		radiobutton.click();
	
		//verification
		assert radiobutton.isSelected();
		System.out.println(radiobutton.isSelected());
		
		
		
		
		//dropDown Selection
		WebElement testdropdown = driver.findElement(By.id("option"));
		Select dropdown = new Select(testdropdown);
		
		//type 1- Index selection
		//dropdown.selectByIndex(3);
		
		//type 2- value selection
		//dropdown.selectByValue("option 2");
		
		//type 3- visibleText selection
		 dropdown.selectByVisibleText("Option 1");
		 
		 //multiple Selection
		 WebElement multipleSelect = driver.findElement(By.id("owc"));
		 Select multipleselection = new Select(multipleSelect);
		//type 1- Index selection
		 multipleselection.selectByIndex(3);
			
		//type 2- value selection
		//multipleselection.selectByValue("option 2");
			
		//type 3- visibleText selection
		//multipleselection.selectByVisibleText("Option 1");
		 
		//checkBox selection
		 WebElement checkbox = driver.findElement(By.name("option1"));
		 checkbox.click();

		 WebElement checkbox1 = driver.findElement(By.name("option2"));
		 checkbox1.click();
		 
		 
		 Thread.sleep(3000);
		 
		 //submit
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/fieldset/button")).click();
		
		
}
}
