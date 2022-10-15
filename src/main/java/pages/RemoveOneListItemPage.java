package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveOneListItemPage {

	WebDriver driver;

	public RemoveOneListItemPage(WebDriver driver) {
		this.driver = driver;
	}

	// define the WebElements
	@FindBy(how = How.XPATH, using = "//input[@name='todo[1]']")
	WebElement SINGLE_LIST;
	@FindBy(how = How.XPATH, using = "//input[@value='Remove']")
	WebElement REMOVE_BUTTON;

	// Corresponding methods to interact with WebElements
	public void remove_single_list() {
		SINGLE_LIST.click();

	}

	public void remove_button_function() {
		REMOVE_BUTTON.click();
	}

	// the validation
	public void validateSingleItemCanBeRemoved() {
		boolean status = SINGLE_LIST.isEnabled();

		System.out.println("Checking boolean status:" + status);
		if (status) {

			System.out.println(status + "removed");

		} else

			System.out.println(status + "not removed");

	}
}
