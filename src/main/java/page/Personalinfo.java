package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Personalinfo extends BasePage {
	WebDriver driver;

	public Personalinfo(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//input[@name='First_Name']")
	WebElement FIRST_NAME_FEILD;
	@FindBy(xpath = "//input[@name='Last_Name']")
	WebElement LAST_NAME_FEILD;
	@FindBy(xpath = "//select[@id='Birthday_Day']")
	WebElement BIRTHDAY_FEILD;
	@FindBy(xpath = "//select[@id='Birthday_Month']")
	WebElement BIRTHDAY_MONTH_FEILD;
	@FindBy(xpath = "//select[@id='Birthday_Year']")
	WebElement BIRTHDAY_YEAR_FEILD;
	@FindBy(xpath = "//input[@name='Email_Id']")
	WebElement EMIAL_FEILD;
	@FindBy(xpath = "//input[@name='Mobile_Number']")
	WebElement PHONE_NUMBER_FEILD;
	@FindBy(xpath = "//input[@value='Male']")
	WebElement GENDER_FEILD;
	@FindBy(xpath = "//textarea[@name='Address']")
	WebElement ADDRESS_BOX;
	@FindBy(xpath = "//input[@name='City']")
	WebElement CITY_FEILD;
	@FindBy(xpath = "//input[@name='Pin_Code']")
	WebElement ZIP_CODE_FEILD;
	@FindBy(xpath = "//input[@name='State']")
	WebElement STATE_FEILD;

	public void Fname(String name) {
		int gen = RandomNums(999);
		FIRST_NAME_FEILD.sendKeys(gen + name);
	}

	public void Lname(String last) {
		int gen = RandomNums(999);
		LAST_NAME_FEILD.sendKeys(last + gen);
	}

	public void Bday(String value) {
		SelectDropdown(BIRTHDAY_FEILD, value);
	}

	public void BMonth(String value) {
		SelectDropdown(BIRTHDAY_MONTH_FEILD, value);
	}

	public void BYear(String value) {
		SelectDropdown(BIRTHDAY_YEAR_FEILD, value);
	}

	public void email(String mail) {
		int gen = RandomNums(999);
		EMIAL_FEILD.sendKeys(gen + mail);
	}

	public void Phone(String PNUM) {
		int gen = RandomNums(999);
		PHONE_NUMBER_FEILD.sendKeys(PNUM + gen);
	}

	public void gender() {
		GENDER_FEILD.click();
	}

	public void location(String Address) {
		ADDRESS_BOX.sendKeys(Address);
	}

	public void City(String city) {
		CITY_FEILD.sendKeys(city);

	}

	public void zip(String code) {
		int gen = RandomNums(999);
		ZIP_CODE_FEILD.sendKeys(code + gen);
	}

	public void state(String state) {
		int gen = RandomNums(999);
		STATE_FEILD.sendKeys(gen + state);
	}
}
