package selinium.Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class takeScreenShotDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub 
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screenShot = ts.getScreenshotAs(OutputType.FILE);
		File screenShotSave = new File("./ScreenShot/demo.png");
		Files.copy(screenShot, screenShotSave);	 
	}
}
