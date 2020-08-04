package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys("admin");
		driver.findElement(By.xpath("//a[@id='loginButton']']")).click();
		//div[@class="saveControlContainer createChartModeElement name"]/descendant::input[@placeholder="Enter Chart Name"]
		
		//WebElement username = driver.findElement(By.name("q"));
	     //username.sendKeys("java",Keys.ENTER);
        //driver.findElement(By.name("pwd")). sendKeys("manager",Keys.ENTER);
	    // WebElement loginbutton = driver.findElement(By.id("loginButton"),);
	    // loginbutton.click();
		//driver.findElements(By.partialLinkText("Inc.")).click();
		//WebElement username = driver.findElement(By.xpath("//b[text()='admin']"));
		//String usertext=username.getText();
		//System.out.println(usertext);
		//WebElement password = driver.findElement(By.xpath("//b[contains(.,'manager')]"));
		//System.out.println(password.getText());
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys(usertext);
		//driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password.getText(),Keys.ENTER);
		
	}

}
