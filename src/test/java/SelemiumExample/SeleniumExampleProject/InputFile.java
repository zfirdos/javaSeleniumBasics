package SelemiumExample.SeleniumExampleProject;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputFile extends BaseClass {

	@Test(priority = 1)
	public void validCreadentials() throws Exception {
		//implict wait syntax -- NosuchElement Exception, timeout
		/*
		 * driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); // selenium 3
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // Selenium
		 * 4
		 * 
		 * driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // To
		 * wait till page gets loaded
		 * 
		 * //Explict wait syntax -- ElementToVisibleException WebDriverWait wait = new
		 * WebDriverWait(driver, 10);
		 * wait.until(ExpectedConditions.visibilityOf(By.id("img"))); // selenium 3
		 * 
		 * 
		 * WebDriverWait wait = new WebDriverWait(Duration.ofMillis(20));
		 * wait.until(ExpectedConditions.visibilityOf(By.id("img"))); // selenium 4
		 * 
		 * 
		 * //Fluent wait Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		 * .withTimeout(30, TimeUnit.MILLISECONDS) .polling(10, TimeUnit.SECONDS)
		 * .ignoring(NoSuchMethodException.class); //Selenium 3
		 * 
		 * Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		 * .withTimeout(Duration.ofSeconds(10)) .polling(10, TimeUnit.SECONDS)
		 * .ignoring(NoSuchMethodException.class); //Selenium 4
		 */		
		
		
		WebElement userName = driver.findElement(By.cssSelector("#user-name"));
		WebElement password = driver.findElement(By.cssSelector("#password"));
		WebElement loginButton = driver.findElement(By.cssSelector("#login-button"));

		userName.sendKeys(properties.getProperty("validUserName"));
		password.sendKeys(properties.getProperty("validPassword"));
		loginButton.click();		
		
		WebElement menu = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
		menu.click();
		Thread.sleep(1000);
		
		WebElement logout = driver.findElement(By.xpath("//div[@class='bm-menu']/nav//a[text()='Logout']"));
		logout.click();
		
		Thread.sleep(5000);
	}
	
	@Test(priority = 2)
	public void invalidCreadentials() throws Exception {
		WebElement userName = driver.findElement(By.cssSelector("#user-name"));
		WebElement password = driver.findElement(By.cssSelector("#password"));
		WebElement loginButton = driver.findElement(By.cssSelector("#login-button"));		

		userName.clear();
		password.clear();
		Thread.sleep(2000);

		userName.sendKeys("invalidUserName");
		password.sendKeys("invalidPassword");
		loginButton.click();
		WebElement errorMsg = driver.findElement(By.xpath("//div[@class='error-message-container error']"));

		String error = "Epic sadface: Username and password do not match any user in this service";
		
		String actualErrorMsg = errorMsg.getText();
		Assert.assertEquals(error, actualErrorMsg);
		Thread.sleep(5000);
	}
}
