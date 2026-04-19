package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseUtilities.BaseLibrary;
import pages.RadioPage;

public class RadioTest extends BaseLibrary {

	RadioPage ob;

	@BeforeTest
	public void launchurl() {
		launchUrl();
		ob = new RadioPage();
	}

	@Test(priority = 1)
	public void clickOnMaleBtn() {
		ob.clickOnMaleBtn();
	}

	@Test(priority = 2)
	public void clickOnFemaleBtn() {
		ob.clickOnFemaleBtn();
	}

}
