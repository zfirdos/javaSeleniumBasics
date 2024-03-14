package SelemiumExample.SeleniumExampleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsscriptExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); //upcasting
		driver.get("https://www.selenium.dev/downloads/");
		//driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//p[contains(text(),'Download version 4.')]"));
		
		  JavascriptExecutor js = (JavascriptExecutor) driver; //downcasting
		  js.executeScript("arguments[0].scrollIntoView(true);", ele);
		 
		
		WebElement ele1 = driver.findElement(By.xpath("//a[text()='32 bit Windows IE']"));
		if(ele.isDisplayed())
		{
			js.executeScript("window.scrollTo(0,1700);", ele);
			
			js.executeScript("window.scrollTo(0,(element.getLocation().y-100));", ele);
			ele1.click();
		}
		else {
			WebElement ele2 = driver.findElement(By.xpath("//p[contains(text(),'64 bit Windows IE')]"));
			js.executeScript("window.scrollTo(0,1500);", ele2);
			ele1.click();
		}		
	}

}
