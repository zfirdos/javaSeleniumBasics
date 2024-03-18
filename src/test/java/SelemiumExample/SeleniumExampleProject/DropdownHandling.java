package SelemiumExample.SeleniumExampleProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,500);");
		WebElement ele = driver.findElement(By.xpath("//select[@id='Skills']"));
		// import org.openqa.selenium.support.ui.Select; -- Package Select
		Select skillsDropdown = new Select(ele);

		skillsDropdown.selectByIndex(4);

		skillsDropdown.selectByValue("Adobe Photoshop");
		skillsDropdown.selectByVisibleText("Analytics");

		List<WebElement> all8 = skillsDropdown.getOptions();
		for (WebElement ele4 : all8) {
			System.out.println(ele4.getSize());
			System.out.println("Get Options::" + ele4.getText());
		}

		Thread.sleep(3000);

		driver.get("https://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		WebElement ele1 = driver.findElement(By.cssSelector("#fruits"));
		// import org.openqa.selenium.support.ui.Select; -- Package
		Select chooseFruits = new Select(ele1);
		chooseFruits.selectByIndex(2);
		chooseFruits.selectByValue("apple");
		chooseFruits.selectByVisibleText("Grape");

		List<WebElement> all = chooseFruits.getAllSelectedOptions();
		for (WebElement ele2 : all) {
			System.out.println(ele2.getSize());
			System.out.println("Get selected Options::" + ele2.getText());
		}

		List<WebElement> all3 = chooseFruits.getOptions();
		for (WebElement ele4 : all3) {
			System.out.println(ele4.getSize());
			System.out.println("Get Options::" + ele4.getText());
		}

		chooseFruits.deselectAll();
		chooseFruits.selectByVisibleText("Grape");

		// driver.quit();

	}

}
