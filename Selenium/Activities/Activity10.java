package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/drag-drop");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement football = driver.findElement(By.id("ball"));
	    WebElement dropzone1 = driver.findElement(By.id("dropzone1"));
	    WebElement dropzone2 = driver.findElement(By.id("dropzone2"));
	    
	    Actions action = new Actions(driver);
	    
	    action.clickAndHold(football).moveToElement(dropzone1).release().build().perform();
	    
	    if (driver.findElement(By.xpath("//*[@id=\"dropzone1\"]/span")).getText().equals("Dropped!")) {
	    	System.out.println("The ball is in Dropzone1");
	    }
	    
	    
	    action.clickAndHold(football).moveToElement(dropzone2).release().build().perform();
	    
	    if (driver.findElement(By.xpath("//*[@id=\"dropzone2\"]/span")).getText().equals("Dropped!")) {
	    	System.out.println("The ball is in Dropzone2");
	    }
		
		driver.quit();

	}

}
