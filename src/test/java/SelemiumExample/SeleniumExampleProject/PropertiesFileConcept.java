package SelemiumExample.SeleniumExampleProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PropertiesFileConcept {
	
	Properties properties = new Properties();
	
	@Test
	public void getUrlFromFile() throws Exception {
		File file = new File("./config/ConfigurationFile.properties");
		FileInputStream fi = new FileInputStream(file);
		
		String url = properties.getProperty("url");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(url);
		
		Thread.sleep(5000);
		
		fi.close();
		driver.quit();
		
	}
}
