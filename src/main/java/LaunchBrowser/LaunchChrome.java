package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	static WebDriver driver;
	
	 public static void main(String[] args) throws InterruptedException {
		 
		launchBrowser();
		
		loginTest();
		
		tearDown();
		
	 }
		 
		 public static void launchBrowser() {
			 
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
			 
		  driver = new ChromeDriver();	
			 
		 driver.get("http:/www.techfios.com/ibilling/?ng=admin");
		 
		 driver.manage().window().maximize();
		 
		 }
		 
		 public static void loginTest() throws InterruptedException {
			 
		 driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
			
	     driver.findElement(By.id("password")).sendKeys("abc123");
		
	     driver.findElement(By.name("login")).click();
		 
	     Thread.sleep(5000);
	     
		 }
		 
		 public static void tearDown() {
	     driver.close();
	     
		 }
		
	}
		
	



