package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LandingPage {
	WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public void header() {
		Assert.assertEquals(driver.getTitle(), "Automation Testing Insider: STUDENT REGISTRATION FORM", "Not Found");
	}
}
