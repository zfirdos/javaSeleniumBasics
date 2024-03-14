package SelemiumExample.SeleniumExampleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptEx {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		WebElement ele = driver.findElement(By.id("user-name"));
		ele.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='standard_user';", ele); //sendkeys
		Thread.sleep(2000);
		
		WebElement ele2 = driver.findElement(By.id("password"));
		ele2.click();
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].value='secret_sauce';", ele2);
		Thread.sleep(2000);
		
		
		  WebElement submit = driver.findElement(By.tagName("input")); 
		  submit.submit();
		  
		  js.executeScript("arguments[0].click();", submit); Thread.sleep(2000);
	}

}
