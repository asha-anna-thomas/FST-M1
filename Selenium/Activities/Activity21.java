package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();		
		driver.get("https://training-support.net/webelements/tabs");
		
		String title = driver.getTitle();
		System.out.println(title);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.findElement(By.cssSelector("button.bg-purple-200")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		System.out.println(driver.getWindowHandles());
		
		for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Another One')]")));
        
        System.out.println("Current tab: " + driver.getWindowHandle());
        
        System.out.println("New Page title: " + driver.getTitle());
        System.out.println("New Page message: " + driver.findElement(By.cssSelector("h2.mt-5")).getText());
        
        driver.findElement(By.xpath("//button[contains(text(), 'Another One')]")).click();

        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        // Switch focus
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        
        driver.quit();
		

	}

}
