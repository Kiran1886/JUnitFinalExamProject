package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ToggleCheckBoxPage {

	WebDriver driver;

	public ToggleCheckBoxPage(WebDriver driver) { // create constructor
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@name='allbox']")
	WebElement TOGGLE_CHECKBOX;

	public void checkingToggleAll() {

		TOGGLE_CHECKBOX.click();

	}

	public void validate_toggle_checkBox() {
		boolean status = TOGGLE_CHECKBOX.isSelected();
		//
		// confirming what is there in status for learning purpose otherwise no need
		System.out.println("Checking boolean status:" + status);

		// checking condition is true or not.
		if (status) {
			System.out.println("AllToggleCheckBox is selected sucessfully.");

		}

		else {
			System.out.println("AllToggleCheckBox is not selected.");
		}

	}

}
