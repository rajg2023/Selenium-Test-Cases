package testAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class functionalTestResumeHTML {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	//	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\ChromeWebDriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		

		driver.get("http://rajivgiri2018.herokuapp.com/");
		driver.manage().window().maximize();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(".//a[contains(text(),'More On Me')]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String path = ".//a[contains(text(),'Resume(.HTML)')]";
		driver.findElement(By.xpath(path)).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*JavascriptExecutor jse = (JavascriptExecutor) driver;
		//Scroll vertically downward by 600 pixels
		jse.executeScript("window.scrollBy(0,600)", "");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		WebElement scroll = driver.findElement(By.id("cv"));
		scroll.sendKeys(Keys.PAGE_DOWN);
				
	
		
	}

}
