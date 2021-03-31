package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Personalinfo;
import util.BrowserFactory;

public class Personalinfotest {
	WebDriver driver;
	@Test
	public void Usershouldbeabletofilloutform() {
		driver = BrowserFactory.init();
		Personalinfo info = PageFactory.initElements(driver, Personalinfo.class);
		info.Fname("Helloooo My name is james Powers");
		info.Lname("Helloooo my last name is Powers");
		info.Bday("6");
		info.BMonth("Apr");
		info.BYear("1980");
		info.email("JamesPowers@indiamail.com");
		info.Phone("123456789");
		info.gender();
		info.location("Mumbai,India");
		info.City("mumbai");
		info.zip("123456123");
		info.state("mumbai,mumbai,mumbai,india");

		BrowserFactory.tearDown();
	}
}
