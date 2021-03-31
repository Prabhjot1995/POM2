package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LandingPage;
import util.BrowserFactory;

public class LandingTest {
	WebDriver driver;

	@Test
	public void headersouldisplay() {
		driver = BrowserFactory.init();
		LandingPage page = PageFactory.initElements(driver, LandingPage.class);
		page.header();
		BrowserFactory.tearDown();
	}
}
