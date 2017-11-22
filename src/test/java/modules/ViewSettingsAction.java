package modules;

import helpers.Log;
import pageobjects.SalesforceLanding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class ViewSettingsAction {

	public static void Execute(WebDriver driver) throws Exception{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='userNav']")));
		SalesforceLanding.select_popover.click();
		Log.info("Click action is performed on View Settings link" );
		SalesforceLanding.view_settings.click();
		Thread.sleep(6000);
		Log.info("Click action is performed on Submit button");
		Reporter.log("SignIn Action is successfully performed");
	}
}
