package org.qsp.testPom;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.chainsaw.Main;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.pom.SeliniumHomeActitime;

import selinium.Screenshot.takeScreenShot22;

public class TestActitimeHome {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		SeliniumHomeActitime sh=new SeliniumHomeActitime(driver);
		sh.sendText1("admin");
		sh.sendText2("manager");
		Thread.sleep(5000);
		takeScreenShot22.takeScreen("actitimeS",driver);
		System.out.println(driver.getTitle());
		sh.clickSearchBtn();
		sh.sendText1("admin");
		sh.sendText2("manager");
	}

}
