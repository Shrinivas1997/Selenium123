package org.qsptestngdemo.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RoycemotorcarsProgram {
	@Test
	public void m1() {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rolls-roycemotorcars.com/");
		driver.findElement(By.xpath("//button[@data-trigger='globalMenu']")).click();
		driver.findElement(By.xpath("//button[@data-section='Models']")).click();
		List<WebElement> models = driver.findElements(By.xpath("//button[@class='rrmc-cta rrmc-menu-link']"));
		for (WebElement webElement : models) {
			System.out.println(webElement.getText());
		}

	}
}
