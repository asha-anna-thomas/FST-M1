package project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity8 {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://alchemy.hguy.co/lms/");
	}
	
	@Test
	public void contactAdminTest() {
		driver.findElement(By.linkText("Contact")).click();
		driver.findElement(By.id("wpforms-8-field_0")).sendKeys("TestFirstName");
		driver.findElement(By.id("wpforms-8-field_1")).sendKeys("Test@test.com");
		driver.findElement(By.id("wpforms-8-field_3")).sendKeys("Test Subject");
		driver.findElement(By.id("wpforms-8-field_2")).sendKeys("Test Message");
		driver.findElement(By.xpath("//button[text()=\"Send Message\"]")).click();
		String message = driver.findElement(By.id("wpforms-confirmation-8")).getText();
		Assert.assertEquals(message, "Thanks for contacting us! We will be in touch with you shortly.");
	}	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	

}
