package SelemiumExample.SeleniumExampleProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsExample1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		
		//Different between findElement and findElements?
		
		//Deals with only one element -- first element 
		//NosuchsuchElementException
		//The is no such index criteria
		WebElement linkClick = driver.findElement(By.xpath("//p//a[text()='About Selenium']"));
		linkClick.click();
		
		//multiple elements
		//Will not throw any exception, it will simply return the empty list
		//Each webElement having index , and starts with 0
		  List<WebElement> element= driver.findElements(By.xpath("//footer[@class='footer']//a")); 
		  for(WebElement ele : element) { 
			  System.out.println("URL:"+ele.getText()); 
	}	 
		
		Thread.sleep(3000);
		driver.quit();
	}

}
