package SeleniumJavaDomaci;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;


public class SeleniumDomaci {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","src/Itbootcamp/SeleniumNew/resources/chromedriver.exe");//relativna putanja
        WebDriver driver = new ChromeDriver();

        driver.get("https://itbootcamp.rs/");
	    driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.navigate().refresh();
		
		/*
		 * driver.navigate().to("https://itbootcamp.rs/course/testiranje-softvera/");
		 * driver.navigate().to("https://itbootcamp.rs/course/testiranje-softvera/");//
		 * refresh :D
		 */		
		driver.navigate().forward();
		driver.navigate().back(); 
		
		WebElement vesti = driver.findElement(By.className("dropdown-toggle"));
		vesti.click();
		WebElement vesti1 = driver.findElement(By.id("menu-item-5712"));
		vesti1.click();
		
		WebElement hrTrening = driver.findElement(By.xpath("//*[@id=\"post-7912\"]/figure/figcaption/header/h2/a"));
		hrTrening.click();
		
		WebElement donacije = driver.findElement(By.id("menu-item-6402"));
		donacije.click();
		
		WebElement uplata = driver.findElement(By.xpath("//*[@id=\"post-6396\"]/div/div[1]/div/div/div[1]/div/div/div[8]/div/p/strong/a"));
		uplata.click();
		
		WebElement iznos = driver.findElement(By.id("amount"));
		iznos.sendKeys("300"); //od prve plate automatskog testera,stize donacija od Hristine. :D
		//Obecanje dato.
		
		WebElement valuta = driver.findElement(By.id("currencyAmount"));
		valuta.click();
		valuta.sendKeys("EUR-Evro"); 
		
		WebElement namena = driver.findElement(By.name("donate_articleid"));
		namena.sendKeys("IT Bootcamp-neprofitna škola za prekvalifikaciju u IT sektor");
		
		WebElement ime = driver.findElement(By.id("firstname"));
		ime.sendKeys("Hristina");
		
		WebElement prezime = driver.findElement(By.id("lastname"));
		prezime.sendKeys("Stankovic");
		
		WebElement telefon = driver.findElement(By.id("add_phone"));
		telefon.sendKeys("0632569875");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("hristina.s@gmail.com");
		
		WebElement adresa = driver.findElement(By.id("add_line1"));
		adresa.sendKeys("Tolstojeva 5");
		
		WebElement drzava = driver.findElement(By.id("add_country"));
		drzava.sendKeys("Serbia");
		
		WebElement grad = driver.findElement(By.id("add_city"));
		grad.sendKeys("Belgrade");
		
		WebElement postalCode = driver.findElement(By.id("add_postcode"));
		postalCode.sendKeys("0114413");
		
		WebElement pitanjePoruka = driver.findElement(By.id("add_comment"));
		pitanjePoruka.sendKeys("Škola za preporuku. Super ste svi. Veliki pozdrav.");
		
		WebElement tekst_sa_slike = driver.findElement(By.id("image_value_user"));
		tekst_sa_slike.sendKeys("TRJYS"); //Ovo je samo primer. Rezultirace greskom:
		//"Netačno napisan tekst sa (Antibot) slike"
		
		//WebElement tekst = driver.findElement(By.className("form-group col-sm-6"));
		
		WebElement dugmeDoniraj = driver.findElement(By.name("submit"));
		dugmeDoniraj.click();
	     
		Dimension d = new Dimension(1000,800);
		
		        driver.manage().window().setSize(d);		
		        
		        driver.close();
		        
		        
		        
		        
		/*
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("window-size=800,480");
		 * 
		 * DesiredCapabilities cap = DesiredCapabilities.chrome();
		 * cap.setCapability(ChromeOptions.CAPABILITY, options);
		 * 
		 * 
		 * ChromeDriverService capabilities = null; //this will open chrome with set
		 * size WebDriver driver1 = new ChromeDriver(capabilities);
		 * driver.get("https://itbootcamp.rs/");
		 */
		
	
		
		
		
		
		
		
		
		
   	}

}
