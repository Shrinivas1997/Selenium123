package selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
		//cite[contains(.,'www.java.com')]/parent::div/parent::a
		//WebElement name = driver.findElement(By.xpath("//h3[contains(.,'Java | Oracle')]"));
		//System.out.println(name.getText());
		List<WebElement> alllink = driver.findElements(
				By.xpath("//cite[contains(.,'www.java.com')]/parent::div/parent::a/parent::div/parent::div/parent::div/parent::div/parent::div/div"));
         for (WebElement webElement : alllink) {
			System.out.println(webElement.getText());
		}
	}

}
