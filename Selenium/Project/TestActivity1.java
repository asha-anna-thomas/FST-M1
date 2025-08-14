package project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity1 {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://alchemy.hguy.co/lms/");
	}
	
	@Test
	public void pageTitleTest() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Alchemy LMS – An LMS Application" );
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
