package selinium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class actitimecreate {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://demo.actitime.com/login.do");

			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
			
			driver.findElement(By.xpath("//a[@class='initial']")).click();
			driver.findElement(By.xpath("//a[@class='content reports']")).click();
			driver.findElement(By.xpath("//span[contains(.,'Create Chart')]/ancestor::td[@class='x-table-layout-cell']")).click();
			Actions a=new Actions(driver);
			Thread.sleep(2000);
		    WebElement ele = driver.findElement(By.xpath("//div[@class='saveControlContainer createChartModeElement name']/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[text()='Add to Dashboard']"));
			a.moveToElement(ele).perform();
			ele.click();
			Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@class='reportNameEdit inputFieldWithPlaceholder']")).sendKeys("Analysis1");
		 Thread.sleep(2000);
			driver.findElement(By.xpath("//td[@class='saveNewConfigButton greyButton']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='closeCreateChartLightboxButton']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
			Thread.sleep(2000);

	}

}
