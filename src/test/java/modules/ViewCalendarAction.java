package modules;

import helpers.Log;
import pageobjects.SabaLanding;
import pageobjects.SalesforceLanding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class ViewCalendarAction {

	public static void ExecuteSaba(WebDriver driver) throws Exception{
		
		SabaLanding.select_popover.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Calendar']")));
		Log.info("Click action is performed on View Calendar link" );
		SabaLanding.view_calendar.click();
		Thread.sleep(6000);
		Log.info("Click action is performed on View Catalog");
		Reporter.log("View Catalog Action is successfully performed");
	}

	public static void ExecuteSalesforce(WebDriver driver) throws Exception{

		SalesforceLanding.select_calendar.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='CalendarSharing_font']")));
		SalesforceLanding.select_calendar_sharing.click();
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/00U/c']")));
		Log.info("Click action is performed on View Calendar link" );
		SalesforceLanding.select_my_calendar.click();
		Thread.sleep(6000);
		Log.info("Click action is performed on View Catalog");
		Reporter.log("View Catalog Action is successfully performed");
	}
}
