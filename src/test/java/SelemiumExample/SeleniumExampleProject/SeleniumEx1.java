package SelemiumExample.SeleniumExampleProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumEx1 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 * WebDriver driver = new ChromeDriver();
		 */
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(5000);
			driver.close();
	}
	//https://www.automationtestinghub.com/download-chrome-driver/
	//https://docs.github.com/en/repositories/creating-and-managing-repositories/renaming-a-repository
	//https://stackoverflow.com/questions/12799719/how-to-upload-a-project-to-github
}
