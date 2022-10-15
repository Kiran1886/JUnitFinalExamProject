package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.RemoveOneListItemPage;
import util.BrowserFactory;

public class RemoveOneListItemTest {

	WebDriver driver;
	RemoveOneListItemPage removeOneListItemPage;

	@Before
	public void StartUp() {
		driver = BrowserFactory.Init();
		removeOneListItemPage = PageFactory.initElements(driver, RemoveOneListItemPage.class);
	}

	@Test
	public void TestRemoveAllButton() {

		removeOneListItemPage.remove_single_list();
		removeOneListItemPage.remove_button_function();
		removeOneListItemPage.validateSingleItemCanBeRemoved();
	}

	@After
	public void closeBrowser() {
		driver = BrowserFactory.TearDown();
	}
}
