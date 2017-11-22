package modules;

import helpers.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.testng.Reporter;
import pageobjects.SabaLanding;
import pageobjects.SalesforceLanding;

public class SignoutAction {

	public static void ExecuteSabaLogout(WebDriver driver) throws Exception{

		SabaLanding.select_popover.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Sign out']")));
		Log.info("Click action is performed on Sign out link" );
		SabaLanding.submit_signout.click();
		Thread.sleep(6000);
		Log.info("Sign out is performed");
		Reporter.log("Sign out is performed");
	}

	public static void ExecuteSalesforceLogout(WebDriver driver) throws Exception{

		SalesforceLanding.select_popover.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Logout']")));
		SalesforceLanding.submit_signout.click();
		Thread.sleep(6000);
		Log.info("Sign out is performed");
		Reporter.log("Sign out is performed");
	}
}
