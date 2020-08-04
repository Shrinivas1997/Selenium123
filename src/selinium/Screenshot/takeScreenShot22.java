package selinium.Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class takeScreenShot22 {
	public static void takeScreen(String name, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenShot = ts.getScreenshotAs(OutputType.FILE);
		File screenShotSave =  new File("./ScreenShot/"+name+".png");
		Files.copy(screenShot, screenShotSave);
	}
}
