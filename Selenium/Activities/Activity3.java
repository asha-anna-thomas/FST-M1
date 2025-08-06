package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//tagName[@attribute='value']
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/login-form");
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("password");
		
		WebElement submitButton = driver.findElement(By.xpath("//button[text()='Submit']"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(submitButton).click().perform();
		
				
		String actualText = driver.findElement(By.xpath("//h1[contains(text(), 'Success')]")).getText();
		String expectedText = "Login Success!";

		if (actualText.equals(expectedText)) {
		    System.out.println("Login success message matched!");
		} else {
		    System.out.println("Message mismatch. Found: " + actualText);
		}
		
		driver.quit();
	}

}
