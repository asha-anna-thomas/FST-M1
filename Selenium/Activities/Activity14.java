package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/tables");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, \"table-auto\")]/thead/tr/th"));
		System.out.println(cols.size());
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, \"table-auto\")]/tbody/tr"));
		System.out.println(rows.size());
		
		WebElement cellValue = driver.findElement(By.xpath("//table[contains(@class, \"table-auto\")]/tbody/tr[5]/td[2]"));
		System.out.println(cellValue.getText());
		
		driver.findElement(By.xpath("//table[contains(@class, \"table-auto\")]/thead/tr/th[5]")).click();
		
		cellValue = driver.findElement(By.xpath("//table[contains(@class, \"table-auto\")]/tbody/tr[5]/td[2]"));
		System.out.println(cellValue.getText());
		
		driver.quit();
	}

}
