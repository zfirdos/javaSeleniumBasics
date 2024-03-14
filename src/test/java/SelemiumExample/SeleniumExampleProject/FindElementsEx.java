package SelemiumExample.SeleniumExampleProject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsEx {

	public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();  		
			driver.manage().window().maximize(); // Maximize window
			String url = "https://demo.seleniumeasy.com/";
			driver.get(url);
			
			List<WebElement> elem = driver.findElements(By.xpath("//footer//li/a"));
			for(WebElement e : elem) {
				System.out.println(e.getText());
			}

	}

}
