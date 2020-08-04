package selinium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(10000);
		WebElement alljwelsry = driver.findElement(By.xpath("//a[@title='Jewellery']"));
		Actions a = new Actions(driver);
		Thread.sleep(3000);
		a.moveToElement(alljwelsry).perform();
		driver.findElement(By.xpath("//span[contains(.,'Kadas')]")).click();
		// driver.findElement(By.xpath("//input[@maxlength='60']")).sendKeys("gold
		// ring",Keys.ENTER);
		// driver.findElement(By.xpath("//img[@alt='The Nury Vanki
		// Ring']")).click();
		//driver.findElement(By.xpath("//input[@id='buy-now']")).sendKeys("",Keys.ENTER);
		Set<String> tabs = driver.getWindowHandles();
		 for (String tab : tabs) {
		 driver.switchTo().window(tab);

		// }
	}
}}
