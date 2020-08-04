package selinium;


import java.util.*;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4 {

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
			List<String> lst=new ArrayList<String>(windows);
			for (int i =lst.size()-1 ; i >=0; i--) {
				String win=lst.get(i);
				driver.switchTo().window(win);
				Thread.sleep(2000);
				driver.close();
				
			}
			
	}

}
