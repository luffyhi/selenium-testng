package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseUtilities.BaseLibrary;
import pages.CheckBoxPage;

public class CheckBoxTest extends BaseLibrary {

	CheckBoxPage ob;

	@BeforeTest
	public void launchurl() {
		launchUrl();
		ob = new CheckBoxPage();
	}

	@Test(priority = 1)
	public void clickOnCheckBox() {
		ob.clickOnCheckBox();
	}
}
