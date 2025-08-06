package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/keyboard-events");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		Actions actions = new Actions(driver);
		
		actions.sendKeys("hello world").build().perform();
		String message = driver.findElement(By.cssSelector("h1.mt-3")).getText();
		System.out.println(message);
		
		driver.quit();

	}

}
