package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locationdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			WebElement search = driver.findElement(By.name("q"));
			Point loc = search.getLocation();
			System.out.println(loc);
			int x = loc.getX();
			int y = loc.getY();
			System.out.println("x : "+x+"====="+"y :"+y);
			

	}

}
