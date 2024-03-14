package SelemiumExample.SeleniumExampleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginFunctionalityProgram {

	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		WebElement enterEmail = driver.findElement(By.id("email"));
		WebElement enterPassword = driver.findElement(By.cssSelector("#pass"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
		
		enterEmail.sendKeys("rohit12das93l====.com"); // To add the values in the input field
		Thread.sleep(1000);
		enterEmail.clear(); //To clear the text that you have added
		Thread.sleep(2000);

		enterEmail.sendKeys("rohit12hjas93@gmail.com");
		
		  Thread.sleep(2000); enterPassword.sendKeys("Smetrics22#123");
		  Thread.sleep(500);
		  
		  loginButton.click(); // To perform click operation on button
		  Thread.sleep(1000);
		  
		  
		  WebElement errorLogo = driver.findElement(By.xpath(
		  "//img[contains(@src,'https://static.xx.fbcdn.net/rsrc.php/v')]"));
		  WebElement loginButton1 = driver.findElement(By.id("loginbutton"));
		  WebElement errorMsg =
		  driver.findElement(By.xpath("//a[text()='Find your account and log in.'\'"));
		  
		  
		  if(errorLogo.isDisplayed()) { System.out.println("Error in login"); }
		  
		  String errorMsgExpected = "Find your account and log in."; String
		  errorMsgActual = errorMsg.getText(); String loginText =
		  loginButton1.getText(); System.out.println("text value is::"+loginText);
		  if(errorMsgExpected.equals(errorMsgActual)) {
		  System.out.println("Error msg is::"+errorMsg); } else {
		  System.out.println("Error msg is doesnt match"); }
		 
		System.out.print("Program execution completed");
		driver.quit();
	}

}
