package selinium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo8 {

	// TODO Auto-generated method stub
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		//driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("iphone",Keys.ENTER);
		//span[contains(.,'Electronics')]
		WebElement Electronics = driver.findElement(By.xpath("//span[contains(.,'Electronics')]"));
		Actions a= new Actions(driver);
		Thread.sleep(3000);
		a.moveToElement(Electronics).perform();
		//a[@href="/mobiles/mi~brand/pr?sid=tyy,4io&otracker=nmenu_sub_Electronics_0_Mi"]
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='/mobiles/mi~brand/pr?sid=tyy,4io&otracker=nmenu_sub_Electronics_0_Mi']")).click();
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//div[text()='Redmi K20 Pro (Flame Red, 128 GB)']")).click();
		Set<String> child = driver.getWindowHandles();
		for (String win : child) {
			driver.switchTo().window(win);
		}
		driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2kuvG8 _7UHT_c']")).click();

		
		
		
	}
}
