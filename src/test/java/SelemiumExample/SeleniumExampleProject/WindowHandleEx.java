package SelemiumExample.SeleniumExampleProject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleEx {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();

		Thread.sleep(2000);
		WebElement click1 = driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']"));
		click1.click();
		Thread.sleep(2000);
		//Selenium 3
		String mainWindow = driver.getWindowHandle();
		System.out.println("mainwindow::" + mainWindow);
		WebElement click = driver.findElement(By.xpath("//button[text()='click']"));
		click.click();
		Set<String> allWindows = driver.getWindowHandles();
		for (String windows : allWindows) {
			System.out.println("All windows::" + windows);
			driver.switchTo().window(windows);
			/*
			 * String title = driver.getTitle(); if(title.equals("Selenium")) { WebElement
			 * downloadClick = driver.findElement(By.xpath("//span[text()='Downloads']"));
			 * downloadClick.click(); }
			 */
			/*
			 * if(!mainWindow.equals(windows)) { WebElement downloadClick =
			 * driver.findElement(By.xpath("//span[text()='Downloads']"));
			 * downloadClick.click(); }
			 */
		}	
		Thread.sleep(1000);
		driver.close();
		
		driver.switchTo().window(mainWindow);

		Thread.sleep(1000);
		WebElement downloadClick = driver.findElement(By.xpath("//a[text()='Open Seperate Multiple Windows']"));
		downloadClick.click();
		Thread.sleep(3000);
		//driver.close();
	}

}
