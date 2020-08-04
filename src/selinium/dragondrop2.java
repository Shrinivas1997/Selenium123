package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragondrop2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		Actions a = new Actions(driver);
		for (int i = 0; i < 10; i++) {
		WebElement from = driver.findElement(By.xpath("//span[@style='left: 0%;']"));
		WebElement to = driver.findElement(By.xpath("//span[@style='left: 30%;']"));
		a.doubleClick(from).perform();
		a.dragAndDrop(from, to).perform();

		 }

	}

}
