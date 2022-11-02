package booking;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\MyChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.booking.com");
		
		WebElement Where = driver.findElement(By.id("ss"));
		Thread.sleep(3000);
		
		Where.click();
		Thread.sleep(3000);
		Where.sendKeys("Amman");
		Thread.sleep(3000);
		Where.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		Where.sendKeys(Keys.ENTER);
        
	}

}
