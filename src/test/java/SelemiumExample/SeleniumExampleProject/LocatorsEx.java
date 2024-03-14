package SelemiumExample.SeleniumExampleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsEx {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//WebElement -- interface
		WebElement element =  driver.findElement(By.name("username")); //single element
		element.click();
		//driver.findElements(null); //multiple elements
		

	}

}
