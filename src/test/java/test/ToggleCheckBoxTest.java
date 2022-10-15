package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.ToggleCheckBoxPage;
import util.BrowserFactory;

public class ToggleCheckBoxTest {

	WebDriver driver;
	ToggleCheckBoxPage toggleCheckBoxPage;

	@Before
	public void StartUp() {
		driver = BrowserFactory.Init();
		toggleCheckBoxPage = PageFactory.initElements(driver, ToggleCheckBoxPage.class);
	}

	@Test
	public void TestFunctionalityofToggleCheckBox() {

		toggleCheckBoxPage.checkingToggleAll();
		toggleCheckBoxPage.validate_toggle_checkBox();

	}

	@After
	public void closeBrowser() {
		driver = BrowserFactory.TearDown();
	}

}
