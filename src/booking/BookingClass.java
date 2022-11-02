package booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BookingClass {

	public static void main(String[] args) throws InterruptedException {
		String TestEmail="razanhhhlkkhhjf5@gmail.com";
		String TestPass="Razan5555999";
		System.setProperty("webdriver.chrome.driver", "D:\\MyChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.booking.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//header[@class='bui-header bui-header--logo-large bui-u-hidden-print bui-header--rounded-tabs ']//div[5]//a[1]")).click();
		driver.findElement(By.id("username")).sendKeys(TestEmail);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='new_password']")).sendKeys(TestPass);
		driver.findElement(By.xpath("//input[@id='confirmed_password']")).sendKeys(TestPass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
		Thread.sleep(5000);

		
		WebElement book = driver.findElement(By.id("px-captcha")); 
		Actions actions = new Actions(driver); 
		     actions.moveToElement(book); 
		     actions.clickAndHold().perform(); 
		     
	}
	

}
