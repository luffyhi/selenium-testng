package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseUtilities.BaseLibrary;

public class AlertsPage extends BaseLibrary {

	public AlertsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@id='alertBtn']")
	private WebElement simpleAlert;

	public void clickOnAlert() {
		simpleAlert.click();
	}

}
