package automationAdvancePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElements {

	public static void main(String[] args) throws InterruptedException {

		// Initialization
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		// siteNavigate
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();

		// name selection
		driver.findElement(By.id("fname")).sendKeys("John");
		driver.findElement(By.id("lname")).sendKeys("Joe");

		// Radio button
		WebElement radiobutton = driver.findElement(By.id("male"));
		radiobutton.click();

		// verification
		assert radiobutton.isSelected();
		System.out.println(radiobutton.isSelected());

		// dropDown Selection
		WebElement testdropdown = driver.findElement(By.id("option"));
		Select dropdown = new Select(testdropdown);

		// type 1- Index selection
		// dropdown.selectByIndex(3);

		// type 2- value selection
		// dropdown.selectByValue("option 2");

		// type 3- visibleText selection
		dropdown.selectByVisibleText("Option 1");

		// multiple Selection
		WebElement multipleSelect = driver.findElement(By.id("owc"));
		Select multipleselection = new Select(multipleSelect);
		// type 1- Index selection
		multipleselection.selectByIndex(3);

		// type 2- value selection
		// multipleselection.selectByValue("option 2");

		// type 3- visibleText selection
		// multipleselection.selectByVisibleText("Option 1");

		// checkBox selection
		WebElement checkbox = driver.findElement(By.name("option1"));
		checkbox.click();

		WebElement checkbox1 = driver.findElement(By.name("option2"));
		checkbox1.click();

		// Pick a Date
		WebElement datePicker = driver.findElement(By.id("day"));
		datePicker.sendKeys("2024-12-25");
		System.out.println("Selected Date: " + datePicker.getAttribute("value"));

		// File Upload (Make sure file path is valid on your machine)
		WebElement fileUpload = driver.findElement(By.id("myfile"));
		fileUpload.sendKeys("D:\\\\Locators.txt"); // <- Change this to your actual file path
		System.out.println("Uploaded file: " + fileUpload.getAttribute("value"));

		// Enter Long Message (100+ characters)
		WebElement messageBox = driver.findElement(By.name("message"));
		messageBox.sendKeys(
				"This is a test message for Selenium WebDriver automation. It has more than 100 characters to meet the requirement.");

		// Submit the form
		WebElement submitBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		submitBtn.click();

		// Optional wait to view results before closing browser
		Thread.sleep(3000);

		// Close the browser
		driver.quit();

	}
}
