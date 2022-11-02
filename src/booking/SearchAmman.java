package booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchAmman {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\MyChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.booking.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='ss']")).sendKeys("Amman");
		driver.findElement(By.xpath("(//span[contains(@class,'sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb')])[1]")).click();
		driver.findElement(By.xpath("(//td[contains(@role,'gridcell')])[27]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[@class='sb-searchbox__button ']")).click();

	}

}
