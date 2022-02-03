package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.CommonMethods;

public class ProductPages {
	public ProductPages(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//button[contains(text(),'Home')]")
	public WebElement autoField;
	@FindBy(id = "zipEntry")
	public WebElement zipCodeField;
	@FindBy(xpath = "//button[contains(text(),'get a quote')]")
	public WebElement getAQuoteButton;
	@FindBy(xpath = "//input[@id='zipCodeInputEl']")
	public WebElement zipCodeBox;
	@FindBy(xpath = "(//button[contains(text(),'start my quote')])[2]")
	public WebElement startMyQuoteTab;

	public void autoFieldMethod(CommonMethods cm) {

		cm.doClick(autoField);

	}

	public void zipCodeFieldMethod(CommonMethods cm) {
		cm.doClick(zipCodeField);
		cm.doClear(zipCodeField);

		cm.writeText(zipCodeField, "10007");

	}

	public void getQuoteButtonMethod(CommonMethods cm) {
		cm.doClick(getAQuoteButton);

	}

	public void zipCodeBoxMethod(CommonMethods cm) {
		cm.writeText(zipCodeBox, "10007");
	}

	public void startMyQuoteTabMethod(CommonMethods cm) {
		cm.doClick(startMyQuoteTab);

	}

}
