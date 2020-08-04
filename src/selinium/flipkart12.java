package selinium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart12 {

	public static <T> void main(String[] args) throws InterruptedException {
		//int big = 0

		System.setProperty("webdriver.chrome.driver", "Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("java Books", Keys.ENTER);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='_3ywJNQ']/div[contains(.,'Price -- Low to High')]")).click();
		Thread.sleep(10000);
		List<WebElement> listOfRating = driver.findElements(By.xpath("//div[@class='hGSR34']"));
		for (WebElement webElement : listOfRating) {
			String rate = webElement.getText();
	//		System.out.println(rate);
	//		i=Double.parseDouble(rate);
		//	if(big<i)
			//  big=i;
		}
		
	}

}
