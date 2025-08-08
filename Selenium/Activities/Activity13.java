package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/tables");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//number of columns
		List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, \"table-auto\")]/thead/tr/th"));
		System.out.println(cols.size());
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, \"table-auto\")]/tbody/tr"));
		System.out.println(rows.size());
		
		List<WebElement> thirdRowValues = driver.findElements(By.xpath("//table[contains(@class, \"table-auto\")]/tbody/tr[3]/td"));
		for (WebElement we : thirdRowValues) {
			System.out.println(we.getText());
		}
			
		WebElement cellvalue = driver.findElement(By.xpath("//table[contains(@class, \"table-auto\")]/tbody/tr[2]/td[2]"));
		System.out.println(cellvalue.getText());
		
		driver.quit();

	}

}
