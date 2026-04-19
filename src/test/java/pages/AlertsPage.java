package pages;

import org.openqa.selenium.support.PageFactory;

import baseUtilities.BaseLibrary;

public class AlertsPage extends BaseLibrary {

	public AlertsPage() {
		PageFactory.initElements(driver, this);
	}

}
