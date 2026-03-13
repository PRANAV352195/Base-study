package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base{

		public void verifyTableHandling() {
			
			driver.navigate().to("https://money.rediff.com/index.html");
			WebElement showmore =driver.findElement(By.id(""));
			showmore.click();
			WebElement datatable = driver.findElement(By.id(""));
			System.out.println(datatable.getText());
			// it is to show all data in console
			
			
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TableHandling table = new TableHandling();
		table.initilizeBrowser();
		table.verifyTableHandling();
	//	table.closeAndQuit();
			
	}

}
