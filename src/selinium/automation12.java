package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class automation12 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		WebElement dress = driver.findElement(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[@title='Dresses']"));
        Actions a = new Actions(driver);
		a.moveToElement(dress).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class='tree dynamized']/li/a[contains(.,'Casual Dresses')]")).click();
        Thread.sleep(1000);
         driver.findElement(By.xpath("//img[@itemprop='image']")).click();		
		Thread.sleep(20000);
		driver.findElement(By.xpath("//p[@id='add_to_cart']/button[@type='submit']")).click();
		
		//Set<String> tabs = driver.getWindowHandles();
		//for (String string : tabs) {
	//		
            //      driver.switchTo().window(string);
	//	}
      //    driver.findElement(By.xpath("//button[@type='submit']/span[contains(.,'Add to cart')]")).click();//add to cart
		
		//driver.findElement(By.xpath("//span[text()='Add to cart']/parent::button[@type='submit']")).click();
		
		//driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']")).click();//continue
		
		//driver.findElement(By.xpath("//p[@class='cart_navigation clearfix']/a[@title='Proceed to checkout']")).click();//prodeed to check out
		
		//WebElement mail = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));//
		//mail.sendKeys("akshay123@gmail.com");
		//mail.click();

	}

}
