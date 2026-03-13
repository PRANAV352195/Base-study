package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommsands extends Base {

	public void verifyWebElementCommands() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messagebox = driver.findElement(By.id("single-input-field"));
		messagebox.sendKeys("Pranav");
		WebElement showmessage=driver.findElement(By.id("button-one"));
		showmessage.click();
		WebElement yourmessage= driver.findElement(By.id("message-one"));
	//	yourmessage.getText();
		System.out.println(yourmessage.getText());
		yourmessage.clear();
		String bordercolourofshowmessage=showmessage.getCssValue(" border-color");
		System.out.println(bordercolourofshowmessage);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebElementCommsands webelemnents = new WebElementCommsands();
		webelemnents.initilizeBrowser();
		webelemnents.verifyWebElementCommands();
		// webelemnents.closeAndQuit();

	}

}
