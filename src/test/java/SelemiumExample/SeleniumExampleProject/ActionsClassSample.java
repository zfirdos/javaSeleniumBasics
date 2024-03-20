package SelemiumExample.SeleniumExampleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassSample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// selenium 4
		Actions action = new Actions(driver);

		WebElement rightClick = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']"));
		action.contextClick(rightClick).build().perform(); // righClick

		action.click(rightClick).build().perform();

		WebElement doubleClick = driver.findElement(By.xpath("//h1[text()='Buttons']"));
		action.doubleClick(doubleClick).build().perform();

		Thread.sleep(2000);

		WebElement element = driver.findElement(By.xpath("//textarea[@title='Search']"));
		Actions action1 = new Actions(driver);
		//holds the SHIFT key and converts the text to uppercase 
		action1.keyDown(element, Keys.SHIFT).sendKeys("testSigma").build().perform();

		WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		Thread.sleep(1000);
		WebElement target = driver.findElement(By.xpath("//ol[@id='amt7']"));

		action.dragAndDrop(source, target).build().perform();
		// driver.close();
	}

}
