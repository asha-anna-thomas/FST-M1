package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/selects");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement dropdown = driver.findElement(By.cssSelector("select.h-10"));
		
		Select singleSelect = new Select(dropdown);
		
		singleSelect.selectByVisibleText("Two");
		singleSelect.selectByIndex(3);
		singleSelect.selectByValue("four");
		
		List<WebElement> allOptions = singleSelect.getOptions();
		for (WebElement opt : allOptions) {
			System.out.println(opt.getText());
		}
		
		driver.quit();
	}

}
