package SelemiumExample.SeleniumExampleProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		/*
		 * WebElement button =
		 * driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		 * button.click();
		 */
		
		//Thread.sleep(2000);
		
		
		
		/*
		 * String msg = alert.getText(); System.out.println("Msg=="+msg);
		 * //alert.accept(); alert.dismiss();
		 * 
		 * Thread.sleep(2000);
		 * 
		 * WebElement tabClick =
		 * driver.findElement(By.xpath("//a[@href='#CancelTab']")); tabClick.click();
		 * Thread.sleep(2000); WebElement tabClick1 =
		 * driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		 * tabClick1.click(); alert.dismiss();
		 * 
		 * Thread.sleep(2000);
		 */
		WebElement tabClick3 = driver.findElement(By.xpath("//a[@href='#Textbox']"));
		tabClick3.click();
		
		Thread.sleep(2000);
		
		WebElement tabClick4 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		tabClick4.click();
		//alert.dismiss();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		alert.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		alert.sendKeys("Hello");
		alert.accept();
		
		
		
		Thread.sleep(2000);
		driver.quit();
	}

}
