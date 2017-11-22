package step_definitions;

import modules.SignInAction;
import modules.SearchCourseAction;
import modules.ViewCalendarAction;
import modules.SignoutAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import pageobjects.SabaLanding;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LogIntoSaba {
	public WebDriver driver;
	private Properties cfgp;

	public LogIntoSaba() {
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

	@When("^I open saba website$")
	public void i_open_saba_website() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get(cfgp.getProperty("saba_url"));
		PageFactory.initElements(driver, SabaLanding.class);
	}

	@When("^I sign into saba$")
	public void i_sign_in() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		SignInAction.ExecuteSabaLogin(driver,cfgp);
	}

	@When("^I view my saba calendar$")
	public void i_view_calendar() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		ViewCalendarAction.ExecuteSaba(driver);
	}

	@When("^I search for a course$")
	public void i_search_java_course() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		SearchCourseAction.Execute(driver,cfgp);
	}

	@Then("^I sign out of saba$")
	public void i_sign_out() throws Throwable {
		SignoutAction.ExecuteSabaLogout(driver);
	}
}
