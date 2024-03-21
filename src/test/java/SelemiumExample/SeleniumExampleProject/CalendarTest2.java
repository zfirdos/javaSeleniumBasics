package SelemiumExample.SeleniumExampleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarTest2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();  		
		driver.manage().window().maximize(); // Maximize window
		
		driver.navigate().to("https://www.agoda.com/");
		
		
	    String date="Tue Apr 16 2024";
	    String d= "Fri Apr 19 2024";
	    
	   
	  
		Thread.sleep(8000);
		//((JavascriptExecutor)driver).executeScript("window.scrollTo(0,300);");
		WebElement ele = driver.findElement(By.xpath("//div[@class='ab-image-area']"));
		if(ele.isDisplayed())
		{
			driver.findElement(By.cssSelector("[aria-label*='Close ']")).click();

		}
		driver.findElement(By.cssSelector("[class*='check-in']")).click();
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("//div[starts-with(@class,'DayPicker') and @aria-label='"+date+"']")).click();
		
		driver.findElement(By.xpath("//div[starts-with(@class,'DayPicker') and @aria-label='"+d+"']")).click();
			
		System.out.println("-----Test Completed------");

	}

}
