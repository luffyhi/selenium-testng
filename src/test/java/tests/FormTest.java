package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseUtilities.BaseLibrary;
import pages.FormPage;

public class FormTest extends BaseLibrary {

	FormPage ob;

	@BeforeTest
	public void launchurl() {
		launchUrl();
		ob = new FormPage();
	}

	@Test(priority = 1)
	public void fillDetails() {
		ob.fillDetails();
	}
}
