package selinium;

import java.util.concurrent.TimeUnit;

import javax.swing.Action;
import javax.swing.ActionMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class automationpractice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[@title='T-shirts']")).click();
		driver.findElement(By.xpath("//i[@class='icon-home']")).click();
		WebElement woman = driver.findElement(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[@title='Women']"));
		Actions a=new Actions(driver);
		a.moveToElement(woman).perform();
		driver.findElement(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/descendant::a[@title='Blouses']")).click();
		WebElement blouse = driver.findElement(By.xpath("//img[@alt='Blouse']"));
	    a.moveToElement(blouse).perform();
	}
	

}
