package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		WebElement AllJwleary = driver.findElement(By.xpath("//a[@title='Jewellery']"));
		Actions a= new Actions(driver);
		Thread.sleep(3000);
		a.moveToElement(AllJwleary).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@data-p='mens-jewellery-kadas,m']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@class='hc img-responsive center-block hu hi']")).click();;
	}
}
