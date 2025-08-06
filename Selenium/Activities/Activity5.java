package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		boolean visible = driver.findElement(By.id("checkbox")).isDisplayed();
		System.out.println(visible);
		
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		visible = driver.findElement(By.id("checkbox")).isDisplayed();
		System.out.println(visible);
		
		driver.quit();
	}

}
