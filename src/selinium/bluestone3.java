package selinium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bluestone3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		WebElement alljwelary = driver.findElement(By.xpath("//a[contains(.,'All Jewellery ')]"));
		Actions a = new Actions(driver);
		a.moveToElement(alljwelary).perform();
		driver.findElement(By.xpath("//a[contains(.,'Kadas')]")).click();
		driver.findElement(By.xpath("//span[@class='p-wrap']/a[@id='pid_5675']")).sendKeys(" ", Keys.ENTER);
		Set<String> tabs = driver.getWindowHandles();
		for (String tab : tabs) {
			driver.switchTo().window(tab);

		}
		driver.findElement(By.xpath("//input[@class='exclusive btn style2 btn-block addToCart']")).click();
		WebElement error = driver.findElement(By.xpath("//div[@class='formErrorContent']"));
		System.out.println(error.getText());

	}
}
