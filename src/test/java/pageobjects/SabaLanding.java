package pageobjects;

import helpers.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SabaLanding extends BaseClass {

	public SabaLanding(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "id1007")
	public static WebElement username;

	@FindBy(id = "id1008")
	public static WebElement password;

	@FindBy(className = "spf-login-button")
	public static WebElement submit_signin;

	@FindBy(xpath = "//input[@id='search-input']")
	public static WebElement search_input;

	@FindBy(xpath = "//a[@title='John Harrison']")
	public static WebElement select_popover;

	@FindBy(xpath = "//a[@title='Calendar']")
	public static WebElement view_calendar;

	@FindBy(xpath = "//a[@title='Sign out']")
	public static WebElement submit_signout;
}
