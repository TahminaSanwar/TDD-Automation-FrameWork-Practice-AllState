package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CommonMethods {
	public void hoverOver(WebDriver driver, WebElement element) {
	Actions actions = new Actions(driver);
	actions.moveToElement(element).build().perform();
}

public void doClick(WebElement element) {
	element.click();
	
}
public void writeText(WebElement element, String value) {
	element.sendKeys(value);
}
public void doClear(WebElement element) {
	element.clear();
}

}
