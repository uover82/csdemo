package step_definitions;

import modules.SignInAction;
import modules.ViewSettingsAction;
import modules.ViewCalendarAction;
import modules.SignoutAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.SalesforceLanding;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LogIntoSalesforce {
	public WebDriver driver;
	private Properties cfgp;

	public LogIntoSalesforce() {
		cfgp = new Properties();

		try {
			InputStream input = new FileInputStream("config.properties");
			cfgp.load(input);
		}catch(IOException ex) {
			ex.printStackTrace();
		}

		driver = Hooks.driver;
		System.out.println("Current data" +cfgp);
	}

	@When("^I open salesforce website$")
	public void i_open_salesforce_website() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get(cfgp.getProperty("salesforce_url"));
		PageFactory.initElements(driver, SalesforceLanding.class);
	}

	@When("^I sign into salesforce$")
	public void i_sign_in() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		SignInAction.ExecuteSalesforceLogin(driver,cfgp);
	}

	@When("^I view my settings$")
	public void i_view_settings() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		ViewSettingsAction.Execute(driver);
	}

	@When("^I view my salesforce calendar$")
	public void i_view_calendar() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		ViewCalendarAction.ExecuteSalesforce(driver);
	}

	@Then("^I sign out of salesforce$")
	public void i_sign_out() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		SignoutAction.ExecuteSalesforceLogout(driver);
	}  
}
