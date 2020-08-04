package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");		// TODO Auto-generated method stub
       WebElement ele = driver.findElement(By.id("email"));
        ele.sendKeys("nasjfhljejlwgj");
        WebElement password = driver.findElement(By.id("pass"));
       password.sendKeys("nasjfhljejlwrkjerhg");
       WebElement login = driver.findElement(By.id("loginbutton"));
       login.click();
       
	}

}
