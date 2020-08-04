package org.qsp.testPom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.pom.Seliniumhome;

public class TestSeliniumHome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Seliniumhome sh = new Seliniumhome(driver);
		sh.sendText("java");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
       sh.sendText("testNg");
		

	}

}
