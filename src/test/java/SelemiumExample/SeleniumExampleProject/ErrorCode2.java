package SelemiumExample.SeleniumExampleProject;

import java.net.HttpURLConnection;
import org.openqa.selenium.support.locators.RelativeLocator;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorCode2 {

	public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			// System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize(); // Maximize window
			String url = "https://demo.seleniumeasy.com/selenium-tutorials";
			driver.get(url);

			URL link = new URL(url);
			HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
			//httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
			httpURLConnection.connect();
			System.out.println("Status code::"+httpURLConnection.getResponseCode());
			 
			
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.MILLISECONDS); // selenium 3
			
				
		WebElement el1 = driver.findElement(By.xpath("//a[text()='TestNG Tutorial']")); 
		WebElement el2 = driver.findElement(RelativeLocator.with(By.xpath("//a[text()='Selenium Tutorials']")).below(el1)); 
		el2.click();
				 
			
	}

}
