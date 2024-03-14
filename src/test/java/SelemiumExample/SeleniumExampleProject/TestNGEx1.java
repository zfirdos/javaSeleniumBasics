package SelemiumExample.SeleniumExampleProject;

import org.testng.Assert;
import org.testng.annotations.Test;



public class TestNGEx1 extends BaseClass{
	
	@Test
	public void login() {
		//obj.launchBrowser();
		String actualUrl = "https://demo.seleniumea12y.com/";
		System.out.println("Actual::"+actualUrl);
		String exepctedUrl = driver.getCurrentUrl();
		System.out.println("Exepcted::"+exepctedUrl);
		Assert.assertEquals(actualUrl, exepctedUrl);
		//obj.shutTheBrowser();
	}
}
