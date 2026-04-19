package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseUtilities.BaseLibrary;

public class CheckBoxPage extends BaseLibrary {

	public CheckBoxPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='form-check form-check-inline']/input[@type='checkbox']")
	private List<WebElement> checkboxList;

	@FindBy(xpath = "//label[@for='days']")
	private WebElement days;

	public void clickOnCheckBox() {

		scrollIntoView(days);

		for (WebElement checkBox : checkboxList) {
			checkBox.click();
		}
	}
}
