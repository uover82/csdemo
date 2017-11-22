package step_definitions;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.Dimension;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	public static WebDriver driver;
    
	/**
	 * Delete all cookies at the start of each scenario to avoid
	 * shared state between tests
	 */
	@Before
	public void openBrowser() throws MalformedURLException {
		System.out.println("Called openBrowser");
		/*
		// foreground browser
		System.setProperty("webdriver.chrome.driver", "/opt/chromedriver-2.33/chromedriver");
		driver = new ChromeDriver();
		**/
		// grid browser
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		driver = new RemoteWebDriver(new URL("http://192.168.0.14:4444/wd/hub"),dc);
		/**/
		driver.manage().deleteAllCookies();
		//driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(1600,900));	}

	/**
	 * Embed a screenshot in test report if test is marked as failed
	 */
	/*
	@After
	public void embedScreenshot(Scenario scenario) {
		
		if(scenario.isFailed()) {
			try {
				scenario.write("Current Page URL is " + driver.getCurrentUrl());
				byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			} catch (WebDriverException somePlatformsDontSupportScreenshots) {
				System.err.println(somePlatformsDontSupportScreenshots.getMessage());
			}     
		}

		driver.quit();
	}
	*/
}
