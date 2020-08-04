package selinium;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import selinium.Screenshot.takeScreenShot22;

public class GoogleScenario {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int flag = 0;
		int n = 1;
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("java", Keys.ENTER);
		do {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			takeScreenShot22.takeScreen("page" + n, driver);
			n++;
			try {
				WebElement next = driver.findElement(By.xpath("//span[@style='display:block;margin-left:53px']"));
				next.click();
			} catch (NoSuchElementException e) {
				flag = 1;
				System.out.println("reached till the condition");
			}
		} while (flag == 0);
	}

}
