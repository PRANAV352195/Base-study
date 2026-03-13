package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base {

	public void verifyRightClick() {
		driver.navigate().to("https://selenium.qabible.in/");
		WebElement rightclick = driver.findElement(By.xpath("//a[text()='Home']"));
		Actions actions = new Actions(driver);// driver is to perfom inbuild class it want to perform the class
		actions.contextClick(rightclick).build().perform();
		// contextClick is the method for rightclick
		// build and perform is to working the function
	}

	public void verifyMouseOver() {
		WebElement mouseover = driver.findElement(By.id("//a[@id='progress-bars']"));
		Actions actions = new Actions(driver);
		actions.contextClick(mouseover).build().perform();

	}

	public void verifyDragAndDrop() {
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement dragme = driver.findElement(By.id("draggable"));

		WebElement droped = driver.findElement(By.id("droppable"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(dragme, droped).build().perform();
//xxx
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingActions actions = new HandlingActions();
		actions.initilizeBrowser();
		// actions.verifyRightClick();
		// actions.verifyMouseOver();
		actions.verifyDragAndDrop();
		// actions.closeAndQuit();
	}

}