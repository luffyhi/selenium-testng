package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseUtilities.BaseLibrary;
import pages.SelectMenuPage;

public class SelectMenuTest extends BaseLibrary {

	SelectMenuPage ob;

	@BeforeTest
	public void launchurl() {
		launchUrl();
		ob = new SelectMenuPage();
	}

	@Test(priority = 1)
	public void selectValue() {
		ob.selectValue();
	}

	@Test(priority = 2)
	public void changeSelectOneByOne() {
		ob.changeSelectOneByOne();
	}
}
