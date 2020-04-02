package SeleniumJavaDomaci;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumSajtTest {

	@Test
	public void testNaslov() {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Natasa/Desktop//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.kurir.rs/");
		
		driver.getTitle();
		
		String title = "Kurir";
		
		Assert.assertEquals(driver.getTitle(), title);
		
	}
}
