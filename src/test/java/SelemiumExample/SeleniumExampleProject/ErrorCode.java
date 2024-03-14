package SelemiumExample.SeleniumExampleProject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorCode {

	public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();  		
			driver.manage().window().maximize(); // Maximize window
			
			driver.get("https://www.amazon.in/");
			List<WebElement> links =driver.findElements(By.tagName("a"));
			System.out.println(links.size());
			//List<>
			for(WebElement e:links) {
				String linkEle = e.getAttribute("href");
				brokenLinks(linkEle);
				
			}
			driver.quit();

		}
		
		public static void brokenLinks(String urlLink) throws Exception {
			
			URL url = new URL(urlLink);
			HttpURLConnection httpurlconnect = (HttpURLConnection) url.openConnection();
			httpurlconnect.setConnectTimeout(10000);
			httpurlconnect.connect();
			
			if(httpurlconnect.getResponseCode()>=400) {
				System.out.println(urlLink+"Not working"+httpurlconnect.getResponseMessage());
			}
			else {
				System.out.println(urlLink+"WORKING");
			}
			
			
			
		}



}
