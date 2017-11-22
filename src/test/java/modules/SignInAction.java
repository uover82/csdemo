package modules;

import helpers.Log;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import pageobjects.SabaLanding;
import pageobjects.SalesforceLanding;

public class SignInAction {

	public static void ExecuteSabaLogin(WebDriver driver,Properties map) throws Exception{
		
		Log.info("Click action is perfromed on Saba Account link" );
		SabaLanding.username.sendKeys(map.getProperty("saba_username"));
		Log.info(" is entered in UserName text box" );
		SabaLanding.password.sendKeys(map.getProperty("saba_password"));
		Log.info(" is entered in Password text box" );
		Thread.sleep(6000);
		SabaLanding.submit_signin.click();
		Log.info("Click action is performed on Submit button");
		Reporter.log("SignIn Action is successfully perfomred");
	}

	public static void ExecuteSalesforceLogin(WebDriver driver,Properties map) throws Exception{
		
		Log.info("Click action is perfromed on Salesforce Account link" );
		SalesforceLanding.username.sendKeys(map.getProperty("salesforce_username"));
		Log.info(" is entered in UserName text box" );
		SalesforceLanding.password.sendKeys(map.getProperty("salesforce_password"));
		Log.info(" is entered in Password text box" );
		SalesforceLanding.submit_signin.click();
		Thread.sleep(6000);
		Log.info("Click action is performed on Submit button");
		Reporter.log("SignIn Action is successfully perfomred");
	}
}
