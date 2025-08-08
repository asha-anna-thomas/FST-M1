package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://training-support.net/webelements/dynamic-controls");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		boolean visible = driver.findElement(By.id("checkbox")).isDisplayed();
		System.out.println(visible);
		
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("checkbox"))));
		
		visible = driver.findElement(By.id("checkbox")).isDisplayed();
		System.out.println(visible);
		
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("checkbox")))).click();
		
		boolean selected = driver.findElement(By.id("checkbox")).isSelected();
		System.out.println(selected);
		
		
		driver.quit();
		

	}

}
