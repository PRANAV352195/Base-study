package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base{
	public void verifyAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		//confirm:accept
		//cancel : dismiss
		//send  keys and get text
		WebElement simpleclick= driver.findElement(By.id("alertButton"));
		simpleclick.click();
			Alert alert =driver.switchTo().alert();
			alert.accept();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertHandling alert = new AlertHandling();
		alert.initilizeBrowser();
		alert.verifyAlert();
		
		//alert.closeAndQuit();
	}

}
