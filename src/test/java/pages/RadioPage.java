package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseUtilities.BaseLibrary;

public class RadioPage extends BaseLibrary {

	public RadioPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='male']")
	private WebElement maleRdBtn;

	@FindBy(xpath = "//input[@id='female']")
	private WebElement femaleRdBtn;

	@FindBy(xpath = "//label[@for='gender']")
	private WebElement gender;

	public void clickOnMaleBtn() {
		scrollIntoView(gender);
		maleRdBtn.click();
	}

	public void clickOnFemaleBtn() {
		femaleRdBtn.click();
	}

}
