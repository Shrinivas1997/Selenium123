package selinium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class automationpractice2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement dress = driver.findElement(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[@title='Dresses']"));
		Actions a=new Actions(driver);
		a.moveToElement(dress).perform();
		driver.findElement(By.xpath("//ul[@class='submenu-container clearfix first-in-line-xs']/li/a[@title='Casual Dresses']")).click();
		WebElement ladyImg = driver.findElement(By.xpath("//img[@alt='Printed Dress']"));
		a.moveToElement(ladyImg).perform();
		driver.findElement(By.xpath("//span[contains(.,'Add to cart')]")).click();
		driver.findElement(By.xpath("//span[contains(.,'Proceed to checkout')]")).click();
		driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']")).click();
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("sczdvvsz",Keys.ENTER);
		WebElement lastText = driver.findElement(By.xpath("//li[contains(.,'Invalid email address.')]"));
		System.out.println(lastText.getText());
		
		

	}

}
