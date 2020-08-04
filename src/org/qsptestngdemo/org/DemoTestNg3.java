package org.qsptestngdemo.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTestNg3 {
	@Test
	public void m1() {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        Reporter.log("hey...", true);
	}

	@Test
	public void m2() {
		System.out.println("Hi");
	}
}
