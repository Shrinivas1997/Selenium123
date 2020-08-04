package selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bluestone1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(3000);
		WebElement rings = driver.findElement(By.xpath("//li[@class='menuparent repb']/a[@title='Rings']"));
        Actions a=new Actions(driver);
        Thread.sleep(3000);
        a.moveToElement(rings).perform();
       driver.findElement(By.xpath("//ul[@class='two-col']/descendant::a[@title='Diamond Rings']")).click();
       System.out.println("prices of diamond ring bydefault");
       List<WebElement> prices = driver.findElements(By.xpath("//span[@class='b-price-wrapper']/descendant::span[@class='new-price']"));
       for (WebElement webElement : prices) {
		System.out.println(webElement.getText());
	   }
       WebElement sortby = driver.findElement(By.xpath("//span[@class='view-by-wrap title style-outline i-right']/span[contains(.,' Popular ')]"));
       Thread.sleep(3000);
       a.moveToElement(sortby).perform();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//a[contains(.,'Price Low to High')]")).click();
       System.out.println("prices of diamond ring after sorting");

       List<WebElement> newprice = driver.findElements(By.xpath("//span[@class='b-price-wrapper']/descendant::span[@class='new-price']"));
       for (WebElement webElement1: newprice) {
    	   System.out.println(webElement1.getText());
    	   
		
	}

	}

}
