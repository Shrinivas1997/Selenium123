package org.qsptestngdemo.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class UrbanLadder {
	WebDriver driver;
    @BeforeSuite
    public void beforeS()
    {
      Reporter.log("Before the Suite",true);	
    }
	@BeforeClass
	public void beforeC() {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		Reporter.log("before the class",true);
	}

	@BeforeMethod
	public void beforeM() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("before the Method",true);
	}

	@Test
	public void testBox() {
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("sofa sets", Keys.ENTER);
		Reporter.log("+ve", true);

	}

	@Test
	public void testBox1() {
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("@@@@@@@", Keys.ENTER);
		Reporter.log("-ve", true);
	}

	@AfterMethod
	public void afterM() {
		driver.close();
		Reporter.log("After the method",true);
	}
	@AfterClass
	public void afterC(){
		Reporter.log("Printing After Class",true);
	}
	@AfterSuite
	public void afterS(){
		Reporter.log("After the Suite",true);
	}
}
