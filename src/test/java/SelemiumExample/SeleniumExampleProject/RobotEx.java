package SelemiumExample.SeleniumExampleProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotEx {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();  		
		driver.manage().window().maximize(); // Maximize window
		driver.get("https://resume.naukri.com/resume-quality-score");
		
		driver.findElement(By.className("browse")).click();
		Thread.sleep(2000);
		
		Robot r = new Robot();
		
		StringSelection filepath = new StringSelection("D:\\SampleFramework\\SeleniumFramework\\doc\\Document.docx");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
		
		
		// To paste the path of file
		
		r.keyPress(KeyEvent.VK_CONTROL);
		
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);
		
		
		// to release the already pressed buttons
		
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		
		// Press and release of enter key
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		driver.quit();
				
		
	}
}
