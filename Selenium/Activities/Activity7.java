package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		boolean ifenabled = driver.findElement(By.id("textInput")).isEnabled();
		System.out.println(ifenabled);
		
		driver.findElement(By.id("textInputButton")).click();
		ifenabled = driver.findElement(By.id("textInput")).isEnabled();
		System.out.println(ifenabled);
		
		driver.quit();
	}

}
