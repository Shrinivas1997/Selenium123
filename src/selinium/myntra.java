package selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class myntra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@onkeyup='inputChange(event)']")).sendKeys("men", Keys.ENTER);
		Thread.sleep(5000);
		// a[@data-index='0']/parent::div/parent::div/parent::div/div
		List<WebElement> menus = driver
				.findElements(By.xpath("//a[@data-index='0']/parent::div/parent::div/parent::div/div"));
		Actions a = new Actions(driver);
		for (WebElement webElement : menus) {
			System.out.println(webElement.getText());
			Thread.sleep(2000);
			a.moveToElement(webElement).perform();
			// driver.findElements(By.xpath(""))

		}

	}

}
