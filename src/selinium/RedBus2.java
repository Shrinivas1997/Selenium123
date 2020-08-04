package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(co);// launching browser
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");

		driver.findElement(By.xpath("//input[@data-message='Please enter a source city']")).sendKeys("indore");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@tabindex='2']")).sendKeys("pune");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
		Thread.sleep(1000);
		// String Month1 = "Sept 2020";

		//String s= 
		
		for (int i = 0; i < 12; i++) {
			driver.findElement(By.xpath("//td[@class='next']")).click();
			Thread.sleep(2000);
			WebElement Month2 = driver.findElement(By.xpath("//td[@class='monthTitle']"));
			String Month3=Month2.getText();
			System.out.println(Month3);
			if("Nov 2020"==Month3)
			{
				driver.findElement(By.xpath("//td[@class='current day']")).click();
				break;
			}
			
			

		}

	}
}
