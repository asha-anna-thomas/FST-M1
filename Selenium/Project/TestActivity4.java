package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity4 {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://alchemy.hguy.co/lms/");
	}
	
	@Test
	public void getSecMostPopCourseTest() {
		String text = driver.findElement(By.xpath("//h3[contains(text(), \"Email\")]")).getText();
		Assert.assertEquals(text, "Email Marketing Strategies");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	

}
