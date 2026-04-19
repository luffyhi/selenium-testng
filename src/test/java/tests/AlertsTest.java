package tests;

import org.testng.annotations.BeforeTest;

import baseUtilities.BaseLibrary;
import pages.AlertsPage;

public class AlertsTest extends BaseLibrary {

	AlertsPage ob;

	@BeforeTest
	public void openUrl() {
		launchUrl();
		ob = new AlertsPage();
	}

}