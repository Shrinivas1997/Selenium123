package selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//button[@class="_2AkmmA _29YdH8"]
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		List<WebElement> menu = driver.findElements(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']"));
		Actions a = new Actions(driver);

		Thread.sleep(5000);
		for (WebElement menuname : menu) {
			String allname = menuname.getText();
			System.err.println(allname);
			Thread.sleep(2000);
			a.moveToElement(menuname).perform();

			java.util.List<WebElement> menus = driver.findElements(
					By.xpath("//span[contains(.,'" + allname + "')]/parent::li/descendant::ul[@class='QPOmNK']/li"));
			for (WebElement webElement : menus) {
				System.out.println(webElement.getText());
			driver.findElements(By.xpath(
					"//span[contains(.,'"+allname+"')]/parent::li/descendant::ul[contains(.,'c')]/li"));
				for (WebElement webElement1 : menus) {
					System.out.println(webElement1.getText());
				}
			}

		}

	}
}
