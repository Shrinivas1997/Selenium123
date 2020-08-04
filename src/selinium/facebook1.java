package selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s=new Select(day);
		s.selectByValue("19");
		WebElement Month =driver.findElement(By.xpath("//select[@id='month']"));
		Select s1=new Select(Month);
		s1.selectByVisibleText("Jan");
		List<WebElement> days = s.getOptions();
		for (WebElement webElement : days) {
			System.out.println(webElement.getText());
		}	
	}

}
