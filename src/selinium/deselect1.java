package selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselect1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Desktop/New%20folder%20(2)/option.html");
		WebElement ele = driver.findElement(By.xpath("//select[@id='b']"));
		Select s = new Select(ele);
		List<WebElement> opts = s.getOptions();
		if (s.isMultiple()) {
			for (WebElement webElement : opts) {
				s.selectByValue(webElement.getText());
				Thread.sleep(2000);
			}
			//s.deselectAll();
			for (WebElement webElement : opts) {
				s.deselectByVisibleText(webElement.getText());
				Thread.sleep(3000);
			}
		}

	}

}
