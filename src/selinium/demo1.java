package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo1 {
      public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//driver.get("https://www.urbanladder.com/");
		//driver.navigate().to("https://www.google.com/search?q=google&oq=goo&aqs=chrome.1.69i57j0l5j69i60l2.4673j0j7&sourceid=chrome&ie=UTF-8");
		//Thread.sleep(2000);
		//driver.navigate().back();
		//Thread.sleep(2000);
		//driver.navigate().forward();
		//Thread.sleep(2000);
		//driver.navigate().refresh();
		//String tital=driver.getTitle();
		//System.out.println(tital);
		//System.out.println("==========>"+driver.getTitle())
		//System.out.println(driver.getCurrentUrl());
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		WebElement sale = driver.findElement(By.xpath("li[@class='topnav_item saleunit']"));
		Actions a= new Actions(driver);
		Thread.sleep(3000);
		a.moveToElement(sale).perform();
		
		
		
		//driver.findElement(By.xpath("//span[contains(.,'Sale')]/parent::li/div/div/ul/li/ul/li/a/span[contains(.,'Wooden Sofa Sets')]")).click();
		//WebElement liv = driver.findElement(By.xpath("//li/span[contains(.,'Living')]"));
       // driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(liv.getText(),Keys.ENTER);
		
	}
}
