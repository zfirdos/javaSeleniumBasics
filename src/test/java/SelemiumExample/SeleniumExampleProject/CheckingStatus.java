package SelemiumExample.SeleniumExampleProject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingStatus {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']//a"));
		for(int i =0;i<ele.size();i++)
		{
			System.out.println("Urls:"+ele.get(i).getText());
		}
		
		for(WebElement element: ele)
		{
			String url = element.getAttribute("href");
			brokenLinks(url);
		}
		
		Thread.sleep(3000);
		driver.quit();
		
	}
	public static void brokenLinks(String url) throws IOException
	{
		URL link = new URL(url);
		HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
		//httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
		httpURLConnection.connect();
		System.out.println("Status code::"+httpURLConnection.getResponseCode());
		if(httpURLConnection.getResponseCode()>=400)
		{
			System.out.println("URL broken");
		}
		else
		{
			System.out.println("200 OK");
		}
	}

}
