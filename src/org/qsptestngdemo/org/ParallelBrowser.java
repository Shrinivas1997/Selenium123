package org.qsptestngdemo.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ParallelBrowser {
	WebDriver driver;

	@BeforeMethod
	@Parameters("browser")
	public void bm(String bName) {
		if (bName.equalsIgnoreCase(("firefox"))) {
			System.setProperty("webdriver.gecko.driver", ".\\software\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		if (bName.equalsIgnoreCase(("chrome"))) {
			System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void m() throws InterruptedException {
		driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.close();
	}

}
