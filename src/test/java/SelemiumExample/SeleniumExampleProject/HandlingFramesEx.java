package SelemiumExample.SeleniumExampleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramesEx {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.w3schools.com/html/html_iframe.asp");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//Handle frame
		//switch to -- action perform
		//switch back to main window
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='default.asp']")));
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("//a[@class='w3-right w3-btn']"));
		element.click();
		
		System.out.println("Back to main window");
		driver.switchTo().defaultContent(); // It will redirect us back to main window
		
		Thread.sleep(2000);
		element = driver.findElement(By.xpath("//a[@class='w3-right w3-btn']"));
		element.click();
		
	}

}
