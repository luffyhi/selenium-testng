package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseUtilities.BaseLibrary;

public class FormPage extends BaseLibrary {

	public FormPage() {
		PageFactory.initElements(driver, this);
	}

	String path = "D:\\udemy-selenium\\seleniumTestNG\\src\\test\\resources\\testData\\form_data.xlsx";

	@FindBy(xpath = "//input[@id='name']")
	private WebElement name;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;

	@FindBy(xpath = "//input[@id='phone']")
	private WebElement phone;

	@FindBy(xpath = "//textarea[@id='textarea']")
	private WebElement address;

	public void fillDetails() {
		name.sendKeys(getReadData(path, 0, 1, 0));
		email.sendKeys(getReadData(path, 0, 1, 1));
		phone.sendKeys(getReadData(path, 0, 1, 2));
	}
}
