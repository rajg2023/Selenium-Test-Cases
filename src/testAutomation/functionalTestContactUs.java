package testAutomation;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class functionalTestContactUs {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://rajivgiri2018.herokuapp.com/";
		String title = driver.getTitle();
		System.out.println("Title of the page is: " + title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is : " + currentUrl);
		
		
		
	//	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\ChromeWebDriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
        
		driver.get(baseUrl);
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
			driver.findElement(By.xpath(".//a[contains(text(),'Hire Me')]")).click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		//Fill up and submit thru contact form
		driver.findElement(By.xpath(".//*[@id='name']")).sendKeys(" ");
		driver.findElement(By.xpath(".//*[@id='message']")).sendKeys("Hello Rajiv, how are you? I would like to reach out to you to let you know that your selenium scripts works...Awesome...");
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("RajivGiri@rajivgiri.com");
		driver.findElement(By.xpath(".//*[@id='color']")).sendKeys("Black");
		driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("Rajiv Giri");
		driver.findElement(By.xpath(".//input[@value='Send Message']")).click();
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Get back to home page
		driver.get("http://rajivgiri2018.herokuapp.com/");
		//driver.navigate().back();
		
		
	}


}
