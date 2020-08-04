package selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mycode1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Desktop/New%20folder%20(2)/option.html");
		WebElement ele = driver.findElement(By.xpath("//select[@id='b']"));
		Select s = new Select(ele);
		List<WebElement> opts = s.getOptions();
		if (s.isMultiple()) {
			s.selectByValue(opts.get(1).getText());
			s.selectByValue(opts.get(3).getText());

			Thread.sleep(3000);
		}
		System.out.println("==================================");
	List<WebElement> options = s.getAllSelectedOptions();
	for(WebElement webElement1:options)
	{
		System.out.println(webElement1.getText());
	}
	System.out.println("1st option :"+s.getFirstSelectedOption().getText());

}

}
