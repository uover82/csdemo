package pageobjects;

import helpers.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	
public class SalesforceLanding extends BaseClass {

	public SalesforceLanding(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "username")
	public static WebElement username;

	@FindBy(id = "password")
	public static WebElement password;

	@FindBy(id = "Login")
	public static WebElement submit_signin;

	@FindBy(xpath = "//div[@id='userNav']")
	public static WebElement select_popover;

	@FindBy(xpath = "//a[@title='My Settings']")
	public static WebElement view_settings;

	@FindBy(xpath = "//div[@id='CalendarAndReminders']")
	public static WebElement select_calendar;

	@FindBy(xpath = "//a[@id='CalendarSharing_font']")
	public static WebElement select_calendar_sharing;

	@FindBy(xpath = "//a[@href='/00U/c']")
	public static WebElement select_my_calendar;

	@FindBy(xpath = "//a[@title='Logout']")
	public static WebElement submit_signout;
}
