package selinium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google1 {
  public static void main(String[] args) throws InterruptedException{
	  System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
		Thread.sleep(5000);
		List<WebElement> allheader = driver.findElements(By.xpath("//h3[@class='LC20lb DKV0Md']/parent::a"));
		for (WebElement webElement : allheader) {
			System.out.println(webElement.getText());
			
		}
		allheader.get(2).click();
	 }
}
