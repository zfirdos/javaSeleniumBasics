package SelemiumExample.SeleniumExampleProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumException {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver;
		 //Headless mode
		 ChromeOptions option = new ChromeOptions();
		 option.addArguments("--headless");
		 driver= new ChromeDriver(option);
		 driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	      //driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
	      driver.get("https://trytestingthis.netlify.app/");
	      System.out.println("BrowserLaunched");
	      // identify element
	      //WebElement l = driver.findElement(By.id("gsc−i−id1"));
			/*
			 * WebElement l = driver.findElement(By.xpath("//input[@id='fname']"));
			 * 
			 * Thread.sleep(1000); try { l.sendKeys("Selenium");
			 * driver.navigate().refresh(); l.sendKeys("Selenium"); Thread.sleep(1000);
			 * }catch(StaleElementReferenceException e) { //refresh page l =
			 * driver.findElement(By.xpath("//input[@id='fname']")); l.sendKeys("Selenium");
			 * System.out.println("Exception"+e); }
			 */
	      //DOM - Structural representation of HTML page.
	      //Implicit -- NosuchElement
	      //Explicit -- ElemetNotVisible or Timeout
	      
	      
	      driver.quit();
	      System.out.println("BrowserClosed");
		
	}
}
