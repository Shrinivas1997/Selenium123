package selinium;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import selinium.Screenshot.takeScreenShot22;

public class urbanladder1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		Actions a=new Actions(driver);
		List<WebElement> htext = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		for (WebElement webElement : htext) {
			String name = webElement.getText();
			Thread.sleep(2000);
			a.moveToElement(webElement).perform();
			Thread.sleep(2000);
			takeScreenShot22.takeScreen(name, driver);
			Thread.sleep(2000);

			System.out.println(name);
		}
	}
}
