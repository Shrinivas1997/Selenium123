package selinium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedbusBooking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@data-message='Please enter a source city']")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//input[@data-message='Please enter a destination city']")).sendKeys("pune");
		driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
		driver.findElement(By.xpath("//div[@class='rb-calendar']/descendant::td[@class='current day']")).click();
		driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-return-calendar icon']")).click();
		// WebElement requriedMonth =
		// driver.findElement(By.xpath("//div[@id='rb-calendar_return_cal']/descendant::td[@colspan='5']"));
		// String Month = "Sep 2021";
		for (int i = 1; i < 12; i++) {
			driver.findElement(By.xpath("//div[@id='rb-calendar_return_cal']/descendant::td[@class='next']")).click();
			Thread.sleep(2000);
			WebElement currentMonth = driver
					.findElement(By.xpath("//div[@id='rb-calendar_return_cal']/descendant::td[@class='monthTitle']"));
			String monthF = currentMonth.getText();
			System.out.println(monthF);
			if ("Sep 2020" == monthF) {
				driver.findElement(By.xpath("//div[@id='rb-calendar_return_cal']/descendant::td[contains(.,'25')]"))
						.click();

			}
		}

	}

}
