package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Class3 {
	
	

	@Test
	public void success()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAYAN BASAK\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://trustspot.io/store/wgwrg");
		String text = driver.findElement(By.cssSelector("div[itemprop='name']")).getText();
		Assert.assertTrue(text.equals("wgwrg"));
	}
	
	@Test
	public void failure()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAYAN BASAK\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://trustspot.io/store/wgwrg");
		String text = driver.findElement(By.cssSelector("div[itemprop='name']")).getText();
		Assert.assertFalse(text.equals("wgwrg"));
	}
	
}

