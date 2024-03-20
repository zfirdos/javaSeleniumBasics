package SelemiumExample.SeleniumExampleProject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenSample {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://tortoisesvn.net/downloads.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// Selenium 3
		TakesScreenshot obj = (TakesScreenshot) driver;
		File src = obj.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./myImage/image1.png"));

		Thread.sleep(1000);

		WebElement text = driver.findElement(By.xpath("//div[text()='India']"));

		File source = text.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(text.getScreenshotAs(OutputType.FILE), new File("./myImage/image2.png"));
		// selenium 4
		File source1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source1, new File("./myImage/image2.png"));

		File s = ((FirefoxDriver) driver).getFullPageScreenshotAs(OutputType.FILE);
		FileHandler.copy(s, new File("./myImage/image3.png"));
		driver.quit();

	}

}
