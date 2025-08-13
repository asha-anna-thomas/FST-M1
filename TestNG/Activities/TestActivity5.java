package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity5 {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/target-practice");
	}
	
	@Test
	public void getPageTitleTest() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Selenium: Target Practice");
	}
	
	@Test(groups= { "HeaderTests" })
	public void getThirdHeaderTest() {
		String textThird = driver.findElement(By.cssSelector("h3.text-3xl")).getText();
		Assert.assertEquals(textThird, "Heading #3");
	}
	
	@Test(groups= { "HeaderTests" })
	public void getFifthHeaderTest() {
		Color fiveHeaderColor = Color.fromString(driver.findElement(By.cssSelector("h5.text-purple-600")).getCssValue("color"));
		Assert.assertEquals(fiveHeaderColor.asHex(), "#9333ea");
	}
	
	@Test(groups= { "ButtonTests" })
	public void getFirstButtonTest() {
		String buttonText = driver.findElement(By.xpath("//button[contains(@class, 'emerald')]")).getText();
		Assert.assertEquals(buttonText, "Emerald");
	}
	
	@Test(groups= { "ButtonTests" })
	public void getSecondButtonTest() {
		Color button2Color = Color.fromString(driver.findElement(By.xpath("//button[contains(@class, 'purple')]")).getCssValue("color"));
        Assert.assertEquals(button2Color.asHex(), "#581c87");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
