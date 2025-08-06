package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/mouse-events");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		Actions actions = new Actions(driver);
		
		WebElement cargoLock = driver.findElement(By.xpath("//*[@id=\"stage\"]/div/div[1]/div/h1"));
		
		WebElement cargoToMl = driver.findElement(By.xpath("//*[@id=\"stage\"]/div/div[2]/div/h1"));
		
		actions.click(cargoLock).moveToElement(cargoToMl).pause(5000).click(cargoToMl).build().perform();
	
		String message = driver.findElement(By.id("result")).getText();
		System.out.println(message);
		
		WebElement srcbutton = driver.findElement(By.xpath("//*[@id=\"stage\"]/div/div[3]/div/h1"));   
		WebElement targetbutton = driver.findElement(By.xpath("//h1[text()='target']"));
		actions.doubleClick(srcbutton).moveToElement(targetbutton).contextClick(targetbutton).build().perform();
		
		WebElement menuOption = driver.findElement(By.xpath("//div[@id='menu']/div/ul/li[1]"));
		
		actions.click(menuOption).pause(5000).build().perform();
		
		String newMessage = driver.findElement(By.id("result")).getText();
		System.out.println(newMessage);
		
		driver.quit();
		

	}

}
