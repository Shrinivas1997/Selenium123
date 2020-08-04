package selinium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String parent=driver.getWindowHandle();
		System.out.println("parent window handle");
		Thread.sleep(2000);
		Set<String> windows=driver.getWindowHandles();
		windows.remove(parent);
		for (String win : windows) {
			System.out.println("all window Handle"+win);
			driver.switchTo().window(win);
			driver.close();		
		}
	}

}
