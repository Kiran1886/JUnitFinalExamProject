package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.RemoveAllListPage;
import util.BrowserFactory;

public class RemoveAllListTest {

WebDriver driver;
RemoveAllListPage removeAllListPage;
	
	@Before
	public void StartUp(){
		driver = BrowserFactory.Init();
		removeAllListPage = PageFactory.initElements(driver, RemoveAllListPage.class);
	}
	
	@Test
	public void userShouldBeAbleToRemoveAllLIstItems() {
		removeAllListPage.click_on_toggle_all();
		removeAllListPage.remove_button_function();
		removeAllListPage.validateUserShouldBeAbleToRemoveAllButtons();
}
	@After
	public void closeBrowser() {
		driver = BrowserFactory.TearDown();
	}
}
