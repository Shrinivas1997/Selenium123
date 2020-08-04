package org.qsp.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeliniumHomeActitime {
	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement username;
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement password;
	@FindBy(xpath = "//a[@class='logout']")
	private WebElement logout;
	public SeliniumHomeActitime(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	}
	public void sendText1(String text1){
		username.sendKeys(text1);
    }
	public void sendText2(String text2){
		password.sendKeys(text2,Keys.ENTER);
    }
	public void clickSearchBtn(){
		logout.click();
        }

}
