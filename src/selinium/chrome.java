package selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.findElement(By.name("q")).sendKeys("java");
			Thread.sleep(5000);
			List<WebElement> sugg = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
			for (WebElement suggname : sugg) {
				System.out.println(suggname.getText());
			}
			sugg.get(2).click();
	}

}
