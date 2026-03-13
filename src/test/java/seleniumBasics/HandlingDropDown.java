package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown extends Base {
	public void verifyDropDown() {
driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	WebElement dropdown1 =driver.findElement(By.id("dropdowm-menu-1"));
	Select select = new Select(dropdown1);
	//select.selectByIndex(1);
	//	select.selectByValue("sql");
		select.selectByVisibleText("Python");
		//black color is known as visible text
	}
		public void verifyCheckBox() {
			driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
			WebElement checkbox =driver.findElement(By.xpath("////label[text()='Option 3']"));
			checkbox.click();
			
		}
		
		public void verifyRadioButton() {
			driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radiobutton =driver.findElement(By.xpath("//input[@value='blue']"));
		radiobutton.click();
		boolean verify =radiobutton.isSelected();
		System.out.println(verify);
		
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingDropDown dropdown = new HandlingDropDown();
		dropdown.initilizeBrowser();
		dropdown.verifyDropDown();
		dropdown.verifyCheckBox(); 
		dropdown.verifyCheckBox();
		// dropdown.closeAndQuit();
	}

}
