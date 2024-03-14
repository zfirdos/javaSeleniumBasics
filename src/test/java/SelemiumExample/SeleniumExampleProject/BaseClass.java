package SelemiumExample.SeleniumExampleProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	WebDriver driver = new ChromeDriver();
	Properties properties = new Properties();
	FileInputStream fileInputStream;
	
	
	public void getData() throws IOException {
		fileInputStream = new FileInputStream("./inputFile/configurations.properties");
        properties.load(fileInputStream);   
	}

	
	@BeforeTest
	public void launchBrowser() throws IOException, InterruptedException {
		getData();
        String url = properties.getProperty("url");
        driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	
	@AfterTest
	public void closeBrowser() throws InterruptedException, IOException {
		Thread.sleep(5000);
        fileInputStream.close();
        driver.close();
	}
}
