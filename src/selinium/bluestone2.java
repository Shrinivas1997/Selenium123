package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bluestone2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		WebElement coins = driver.findElement(By.xpath("//ul[@class='wh-main-menu']/li[@class='menuparent gold-coins']/a"));
		Actions a=new Actions(driver);
		a.moveToElement(coins).perform();
		driver.findElement(By.xpath("//span[@data-p='l-gold-coins-weight-1gms,m']")).click();
		driver.close();


	}

}
