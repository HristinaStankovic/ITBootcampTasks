package SeleniumJavaDomaci;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Refresh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","src/Itbootcamp/SeleniumNew/resources/chromedriver.exe");//relativna putanja
        
		WebDriver driver = new ChromeDriver();
		for (int i=0; i<5; i++)
	 {
		driver.get("https://www.youtube.com/");
		driver.navigate().refresh();
		
		} 
         
}
}