package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/dynamic-attributes");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//input[contains(@id, \"full-name-\")]")).sendKeys("asha");
		driver.findElement(By.xpath("//input[contains(@id, \"email\")]")).sendKeys("test@test.com");
		driver.findElement(By.xpath("//input[contains(@name, \"event-date\")]")).sendKeys("08/08/2025");
		driver.findElement(By.xpath("//textarea[contains(@id, \"additional-details\")]")).sendKeys("This is test text");
		driver.findElement(By.xpath("//button[text()=\"Submit\"]")).click();
		
		String success = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation"))).getText();		
		System.out.println(success);
		
		driver.quit();
		
	}

}
