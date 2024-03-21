package SelemiumExample.SeleniumExampleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();  		
		driver.manage().window().maximize(); // Maximize window
		
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		
		
	    String date="Choose Wednesday, March 20th, 2024";
	    //String d= "Fri Apr 19 2024";
	    
	   
	  
		Thread.sleep(5000);
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,300);");

		WebElement ele = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		ele.clear();
		if(ele.isDisplayed())
		{
			driver.findElement(By.cssSelector("//input[@id='dateOfBirthInput']")).click();

		}
		/*
		 * driver.findElement(By.cssSelector("[class*='check-in']")).click();
		 * Thread.sleep(2000); ""+""
		 */
		//div[contains(@class,'react-datepicker__day ') and @aria-label='Choose Wednesday, March 20th, 2024']		
		driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__day ') and @aria-label='"+date+"']")).click();
		
		
		Thread.sleep(3000);
		ele = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__day ') and text()='22']")).click();
		
		System.out.println("-----Test Completed------");

	}

}
