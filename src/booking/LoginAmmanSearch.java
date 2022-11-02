package booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginAmmanSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\MyChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.booking.com");
		
		driver.findElement(By.xpath("//body[1]/header[1]/nav[1]/div[2]/div[6]/a[1]")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("razanhhhlllddd5@gmail.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Razan5555999");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        Thread.sleep(5000);
        WebElement book = driver.findElement(By.id("px-captcha")); 
		Actions actions = new Actions(driver); 
		     actions.moveToElement(book); 
		     actions.clickAndHold().perform();

	}

}
