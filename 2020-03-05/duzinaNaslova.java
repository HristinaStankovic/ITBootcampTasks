package SeleniumJavaDomaci;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class duzinaNaslova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","src/Itbootcamp/SeleniumNew/resources/chromedriver.exe");//relativna putanja
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://itbootcamp.rs/");
      	driver.manage().window().maximize();
      	String title = driver.getTitle();
      	System.out.println(title);
      		
      	title.length();
      	System.out.println(title.length());
      	
        

	}

}
