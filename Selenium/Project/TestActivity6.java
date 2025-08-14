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

public class TestActivity6 {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://alchemy.hguy.co/lms/");
	}
	
	@Test (priority=1)
	public void getMyAccountTest() {
		driver.findElement(By.linkText("My Account")).click();
		String title = driver.getTitle();
		Assert.assertEquals(title, "My Account – Alchemy LMS");
	}
	
	@Test (priority=2)
	public void loginTest() {
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("user_login")).sendKeys("root");
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("wp-submit")).click();
		String heading = driver.findElement(By.cssSelector("h1.admin-email__heading")).getText();
		System.out.println(heading);
		Assert.assertEquals(heading, "Administration email verification");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	

}
