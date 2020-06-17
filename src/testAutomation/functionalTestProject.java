package testAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class functionalTestProject {

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
		
		//a[contains(text(),'More On Me')]
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		//Scroll vertically downward by 750 pixels
		jse.executeScript("window.scrollBy(0,750)", "");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Scroll vertically downward by 750 pixels
		jse.executeScript("window.scrollBy(0,750)", "");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Scroll vertically downward by 750 pixels
		jse.executeScript("window.scrollBy(0,750)", "");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Scroll vertically upward by 750 pixels
		jse.executeScript("window.scrollBy(0,-550)", "");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Scroll vertically upward by 550 pixels
		jse.executeScript("window.scrollBy(0,-550)", "");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Scroll vertically upward by 550 pixels
		jse.executeScript("window.scrollBy(0,-550)", "");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Scroll vertically upward by 550 pixels
		jse.executeScript("window.scrollBy(0,-550)", "");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Scroll to the bottom of the Web page
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*//Scroll to a particular Web Element
		WebElement about = driver.findElement(By.className("smoothscroll btn btn-primary px-4 py-3"));
		jse.executeScript("arguments[0].scrollIntoView();",about);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//Fill up and submit thru contact form
	/*	driver.findElement(By.xpath(".//*[@id='name']")).sendKeys(" ");
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
		driver.get("http://rajivgiri2018.herokuapp.com/");*/
		
		
	}

}
