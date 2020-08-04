package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class customwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Desktop/werElement/ButtonClick.html");

      new WebDriverWait(driver, 10).until(new ExpectedCondition<Boolean>() {
		@Override
			public Boolean apply(WebDriver driver) {
			return driver.findElement(By.xpath("//input[@value='Do something else']")).isEnabled();
		}
	  });
	  driver.findElement(By.xpath("//input[@value='Do something else']")).click();
	}
	
}
