package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/alerts");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.id("prompt")).click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.sendKeys("Awesome");
		
		alert.accept();
		
		System.out.println(driver.findElement(By.id("result")).getText());
		
		driver.quit();

	}

}
