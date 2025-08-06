package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement checkboxelement = driver.findElement(By.id("checkbox"));
		boolean ifselected = checkboxelement.isSelected();
		System.out.println(ifselected);
		
		checkboxelement.click();
		ifselected = checkboxelement.isSelected();
		System.out.println(ifselected);
		
		driver.quit();
	}

}
