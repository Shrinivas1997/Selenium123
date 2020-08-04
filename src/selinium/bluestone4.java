package selinium;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import selinium.Screenshot.takeScreenShot22;

public class bluestone4 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		WebElement alljwelary = driver.findElement(By.xpath("//a[contains(.,'All Jewellery ')]"));
		Actions a = new Actions(driver);
		a.moveToElement(alljwelary).perform();
		driver.findElement(By.xpath("//a[contains(.,'Kadas')]")).click();
		driver.findElement(By.xpath("//span[@class='p-wrap']/a[@id='pid_5675']")).click();
		Set<String> tabs = driver.getWindowHandles();
		for (String tab : tabs) {
			takeScreenShot22.takeScreen("Bluestone", driver);

			driver.switchTo().window(tab);
		}
		driver.findElement(By.xpath("//span[@class='ring-size-box']")).click();
		driver.findElement(By.xpath("//li/span[contains(.,'2-8(2 8/16')]")).click();
		driver.findElement(By.xpath("//input[@class='exclusive btn style2 btn-block addToCart']")).click();
		Thread.sleep(5000);
		WebElement comp1 = driver.findElement(By.xpath("//span[@class='ring-size-box']"));
		System.out.println(comp1.getText());

	}

}
