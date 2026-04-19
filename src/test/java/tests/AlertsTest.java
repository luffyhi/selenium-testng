package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseUtilities.BaseLibrary;
import pages.AlertsPage;

public class AlertsTest extends BaseLibrary {

	AlertsPage ob;

	@BeforeTest
	public void openUrl() {
		launchUrl();
		ob = new AlertsPage();
	}

	@Test(priority = 1)
	public void clickOnAlert() {
		ob.clickOnAlert();
	}

}