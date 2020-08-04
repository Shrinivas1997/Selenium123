package selinium;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import selinium.Screenshot.takeScreenShot22;

public class ScrollDowmAndTakeScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		takeScreenShot22.takeScreen("amazonDowm", driver);

	}

}
