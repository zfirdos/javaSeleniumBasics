package SelemiumExample.SeleniumExampleProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest1 {

	public static void main(String[] args) throws InterruptedException {
		//System.getProperty("webdriver.chrome.driver", "./driver/chromdriver.exe");
			
		/*
		 * 1) Launch the browser 
		 * 2) Hit/Open the url:
		 * https://opensource-demo.orangehrmlive.com 
		 * 3) Close the url
		 */
		WebDriver chromeDriver = new ChromeDriver(); //Browser launch
		//chromeDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//waits - to hold the operation 
		
		//Thread.sleep(4000);
		chromeDriver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		
		  chromeDriver.manage().window().maximize(); //browser maximize //To refresh	  the page 
		  chromeDriver.navigate().refresh(); //method chaining
		  Thread.sleep(2000); 
		  chromeDriver.get("https://www.flipkart.com/");
		  Thread.sleep(2000); 
		  chromeDriver.manage().window().minimize();
		  Thread.sleep(1000);
		  chromeDriver.manage().window().maximize();
		  chromeDriver.navigate().back(); 
		  Thread.sleep(2000);
		  chromeDriver.navigate().forward(); 
		  Thread.sleep(4000);
		 
		 
		//chromeDriver.close(); //close the current browser
		chromeDriver.quit(); //close all the open browsers, close the broserdriver instance
	}

}
