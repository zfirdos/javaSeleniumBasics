package SelemiumExample.SeleniumExampleProject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleSel4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();

		Thread.sleep(2000);
		//Selenium 4
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://trytestingthis.netlify.app/");
		Thread.sleep(2000);
		
		
		
		//driver.close();
	}

}
