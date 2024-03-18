package SelemiumExample.SeleniumExampleProject;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadEx {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement inputImage = driver.findElement(By.xpath("//div//input[@id='imagesrc']"));
		//inputImage.click();
		
		File file = new File("./image/elementLogo.png");
		System.out.println(file.getAbsolutePath());
		inputImage.sendKeys(file.getAbsolutePath());
	}

}
