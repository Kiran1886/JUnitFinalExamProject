package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	static WebDriver driver;
	static String browser;
	static String url;

	public static void readConfig() {

		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("src\\main\\java\\config\\config.properties"));

			Properties prop = new Properties();
			prop.load(reader);
			browser = prop.getProperty("browser");
			url = prop.getProperty("url");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static WebDriver Init() {
		
		readConfig();
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
			driver = new ChromeDriver();
		}
			
		driver.manage().deleteAllCookies();
		driver.get(url);
		driver.manage().window().maximize();				
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
}
	
	public static WebDriver TearDown() {
		driver.close();
		driver.quit();
		return driver;
	}
}
