package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/selects");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement multiselect = driver.findElement(By.cssSelector("select.h-80"));
		Select select = new Select (multiselect);
		
		select.selectByContainsVisibleText("HTML");
		
		int indexNum[] = {4, 5, 6};
		for(int num : indexNum) {
			select.selectByIndex(num);
		}
		
		select.selectByValue("nodejs");
		
		select.deselectByIndex(4);
		
		driver.quit();
	}

}
