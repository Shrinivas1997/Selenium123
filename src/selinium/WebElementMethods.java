package selinium;

import java.lang.reflect.Method;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class WebElementMethods {

	public static void main(String[] args) {
	
		/* Class variable  = WebDriver.class;
		Method[] methodNames =  variable.getDeclaredMethods();
		for(Method method : methodNames) { 
			// Print the method names
			System.out.println("Name of the method : "+method.getName());
			}*/
		  
		  Class<WebElement> variable = WebElement.class;
		 Method[]methodname= variable.getMethods();
		 for (Method method : methodname) {
			//System.out.println(method.getName());
		Reporter.log(method.getName(), true);
		
		 }
		

	}

}
