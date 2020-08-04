package selinium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bluestonesenario10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement frame = driver.findElement(By.xpath("//iframe[@name='chat-widget']"));
		driver.switchTo().frame(frame);
	    driver.findElement(By.xpath("//div[@class='lc-1scef e16i86ec0']")).click();
	   // driver.findElement(By.xpath("//input[@id='name']")).sendKeys("shri");
	    
		
	}
}
