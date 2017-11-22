package modules;

import helpers.Log;
import java.util.Properties;
import pageobjects.SabaLanding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class SearchCourseAction {

	public static void Execute(WebDriver driver,Properties map) throws Exception{
		
		SabaLanding.search_input.sendKeys(map.getProperty("saba_search_input"));
		SabaLanding.search_input.sendKeys(Keys.RETURN);
		Log.info(" is entered in search text box" );
		Thread.sleep(6000);
		Log.info("Course Criteria is searched");
		Reporter.log("Course Search Action is successfully performed");
	}
}
