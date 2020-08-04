package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demourl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");

		WebElement ele = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		WebElement de = driver.findElement(By.xpath("//button[contains(.,'Double-Click Me To See Alert')]"));
		//driver.findElement(By.xpath(""))
		Actions a=new Actions(driver);
		//a.contextClick().perform();
		//a.doubleClick(de).perform();
	}

}
