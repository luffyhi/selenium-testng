package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import baseUtilities.BaseLibrary;

public class SelectMenuPage extends BaseLibrary {

	public SelectMenuPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@id='country']")
	private WebElement selectOption;

	Select select;

	public void selectValue() {
		select = new Select(selectOption);
		select.selectByVisibleText("France");
	}

	public void changeSelectOneByOne() {
		List<WebElement> optionsList = select.getOptions();
		for (int i = 0; i < optionsList.size(); i++) {
			select.selectByVisibleText(optionsList.get(i).getText());
		}
	}
}
