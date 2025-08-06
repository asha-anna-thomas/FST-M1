package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/target-practice");
		String title = driver.getTitle();
		System.out.println(title);
		
		String third_text = driver.findElement(By.xpath("//h3[contains(@class, 'text-orange-600')]")).getText();
		System.out.println(third_text);
		
		String color = driver.findElement(By.xpath("//h5[contains(@class, 'text-purple-600')]")).getCssValue("color");
		System.out.println(color);
		
		String all_purple_class = driver.findElement(By.cssSelector("button.text-purple-900")).getAttribute("class");
		System.out.println(all_purple_class);
		
		String slate_text = driver.findElement(By.xpath("//button[contains(@class, 'slate')]")).getText();
		System.out.println(slate_text);
		
		driver.quit();

	}

}
